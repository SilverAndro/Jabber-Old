package mc.jabber.chips.pipes.corners

import mc.jabber.chips.abstracts.ChipProcess
import mc.jabber.data.CardinalData
import mc.jabber.data.serial.NbtTransformable
import mc.jabber.math.Vec2I

class RightUpPipeChip : ChipProcess() {
    override fun <T : NbtTransformable> receive(
        data: CardinalData<T>,
        pos: Vec2I,
        state: MutableMap<Vec2I, Any>
    ): CardinalData<T> {
        return data.of(data.left, null, null, data.down)
    }
}
