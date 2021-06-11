package mc.jabber.items.chips

import mc.jabber.data.CardinalData
import mc.jabber.items.chips.abstracts.ChipItem
import mc.jabber.math.Vec2I

class CrossChip : ChipItem() {
    override fun <T> receive(data: CardinalData<T>, pos: Vec2I, state: MutableMap<Vec2I, Any>): CardinalData<T> {
        return data.of(data.down, data.up, data.right, data.left)
    }
}