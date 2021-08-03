package mc.jabber.core.chips.pipes.corners

import mc.jabber.Global
import mc.jabber.core.auto.ChipID
import mc.jabber.core.chips.ChipProcess
import mc.jabber.core.data.CardinalData
import mc.jabber.core.data.serial.NbtTransformable
import mc.jabber.core.math.Vec2I
import net.minecraft.util.Identifier

@ChipID("chip_quad_3_pipe")
class Quad3PipeChip : ChipProcess() {
    override val id: Identifier = Global.id("quad3")
    override fun receive(
        data: CardinalData,
        pos: Vec2I,
        chipData: HashMap<Vec2I, NbtTransformable<*>>
    ): CardinalData {
        return CardinalData(null, data.right, data.up, null)
    }
}
