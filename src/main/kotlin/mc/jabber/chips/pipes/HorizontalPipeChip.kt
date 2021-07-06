package mc.jabber.chips.pipes

import mc.jabber.chips.abstracts.ChipProcess
import mc.jabber.data.CardinalData
import mc.jabber.data.serial.NbtTransformable
import mc.jabber.math.Vec2I

class HorizontalPipeChip : ChipProcess() {
    override fun <T : NbtTransformable> receive(
        data: CardinalData<T>,
        pos: Vec2I,
        state: HashMap<Vec2I, Any>
    ): CardinalData<T> {
        return data.of(null, null, data.left, data.right)
    }
}