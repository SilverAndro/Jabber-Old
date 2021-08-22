package mc.jabber.core.data

import mc.jabber.core.math.Cardinal
import mc.jabber.proto.CardinalDataBuffer
import mc.jabber.proto.cardinalDataProto
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * A sealed class representing 4 stored values, in line with the 4 [Cardinal] directions
 */
class CardinalData(val up: Long?, val down: Long?, val left: Long?, val right: Long?) {
    operator fun get(direction: Cardinal): Long? {
        return when (direction) {
            Cardinal.UP -> up
            Cardinal.DOWN -> down
            Cardinal.LEFT -> left
            Cardinal.RIGHT -> right
        }
    }

    /**
     * Gets random data
     *
     * @return null if all values are null, or a random value from the non-null ones
     */
    fun acquire(): Pair<Cardinal, Long>? {
        val dirs = Cardinal.values()
        dirs.shuffle()
        dirs.forEach {
            val got = get(it)
            if (got != null) return it to got
        }
        return null
    }

    /**
     * Simple transform
     *
     * @return A new [CardinalData] of the same type, but with the [direction] replaced with [value]
     */
    fun with(direction: Cardinal, value: Long?): CardinalData {
        @Suppress("CascadeIf")
        return if (direction == Cardinal.UP) {
            CardinalData(value, down, left, right)
        } else if (direction == Cardinal.DOWN) {
            CardinalData(up, value, left, right)
        } else if (direction == Cardinal.LEFT) {
            CardinalData(up, down, value, right)
        } else {
            CardinalData(up, down, left, value)
        }
    }

    /**
     * Data separation/extraction
     *
     * @return A new [CardinalData] with only the value specified with [direction]
     */
    fun only(direction: Cardinal): CardinalData {
        @Suppress("CascadeIf")
        return if (direction == Cardinal.UP) {
            CardinalData(up, null, null, null)
        } else if (direction == Cardinal.DOWN) {
            CardinalData(null, down, null, null)
        } else if (direction == Cardinal.LEFT) {
            CardinalData(null, null, left, null)
        } else {
            CardinalData(null, null, null, right)
        }
    }

    /**
     * Makes a new [CardinalData] but replaces all nulls passed with [replacement] and make others null
     *
     * @param replacement What the null values passed should become
     */
    fun replaceNull(
        replacement: Long
    ): CardinalData {
        return CardinalData(
            if (down == null) replacement else null,
            if (up == null) replacement else null,
            if (right == null) replacement else null,
            if (left == null) replacement else null
        )
    }


    /**
     * Makes an empty form of the data
     */
    fun empty() = ofAll(null)

    /**
     * Creates a new [CardinalData] where all values are [value]
     */
    fun ofAll(value: Long?): CardinalData {
        return CardinalData(value, value, value, value)
    }

    /**
     * Iterates all values provided, so your method will be called 4 times
     */
    @OptIn(ExperimentalContracts::class)
    inline fun forEach(method: (Cardinal, Long?) -> Unit) {
        contract {
            callsInPlace(method, InvocationKind.AT_LEAST_ONCE)
        }

        method(Cardinal.UP, up)
        method(Cardinal.DOWN, down)
        method(Cardinal.LEFT, left)
        method(Cardinal.RIGHT, right)
    }

    /**
     * Returns true if all values match the given predicate
     */
    inline fun all(predicate: (Cardinal, Long?) -> Boolean): Boolean {
        forEach { cardinal, t ->
            if (!predicate(cardinal, t)) return false
        }
        return true
    }

    /**
     * Returns true if any value matches the given predicate
     */
    inline fun any(predicate: (Cardinal, Long?) -> Boolean): Boolean {
        forEach { cardinal, t ->
            if (predicate(cardinal, t)) return true
        }
        return false
    }

    override fun toString(): String {
        return this::class.simpleName + "(up=$up, down=$down, left=$left, right=$right)"
    }

    @Suppress("UnstableApiUsage")
    fun serialize(): CardinalDataBuffer.CardinalDataProto {
        return cardinalDataProto {
            forEach { cardinal, u ->
                if (u != null) {
                    when (cardinal) {
                        Cardinal.UP -> up = u
                        Cardinal.DOWN -> down = u
                        Cardinal.LEFT -> left = u
                        Cardinal.RIGHT -> right = u
                    }
                }
            }
        }
    }

    companion object {
        fun deserialize(proto: CardinalDataBuffer.CardinalDataProto): CardinalData {
            val up = if (proto.hasUp()) proto.up else null
            val down = if (proto.hasDown()) proto.down else null
            val left = if (proto.hasLeft()) proto.left else null
            val right = if (proto.hasRight()) proto.right else null

            return CardinalData(up, down, left, right)
        }
    }
}
