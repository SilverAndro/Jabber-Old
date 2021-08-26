package mc.jabber.init

import com.github.p03w.aegis.getBlockPos
import com.github.p03w.aegis.getInt
import com.github.p03w.aegis.register
import mc.jabber.Global
import mc.jabber.core.asm.CircuitCompiler
import mc.jabber.core.asm.CompiledCircuit
import mc.jabber.minecraft.block.entity.SimpleComputerBE
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback
import net.minecraft.text.LiteralText
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@Suppress("unused")
object Main : ModInitializer {
    private var compiledCircuit: CompiledCircuit? = null

    @OptIn(ExperimentalTime::class)
    override fun onInitialize() {
        Global.BLOCKS.register()
        Global.BLOCKS.ENTITIES.register()

        Global.ITEMS.register()

        Global.GUI.registerBoth()

        CommandRegistrationCallback.EVENT.register { d, _ ->
            d.register("jabber") {
                literal("stress") {
                    executes(debug = true) { context ->
                        val time = measureTime {
                            if (compiledCircuit != null) {
                                repeat(1_000_000) {
                                    compiledCircuit!!.simulate()
                                }
                            } else {
                                context.source.sendError(LiteralText("No circuit compiled!"))
                            }

                            /*CircuitManager(4, 3).also {
                                it.board[0, 0] = CustomChip(Global.id("stress"), true) { data, _, _ -> data.ofAll(1) }
                                it.board[0, 1] = Quad1PipeChip()
                                it.board[1, 1] = Quad2PipeChip()
                                it.board[1, 0] = Quad4PipeChip()
                                it.board[2, 0] = HorizontalPipeChip()
                                it.board[3, 0] = Quad3PipeChip()
                                it.board[3, 1] = Quad1PipeChip()
                                it.setup()
                                repeat(1_000_000) { _ ->
                                    it.simulate()
                                }
                            }
                             */
                        }
                        context.source.sendFeedback(LiteralText("Finished stress test in $time"), false)
                    }
                }
                literal("compile") {
                    blockPos("location") {
                        executes {
                            val pos = it.getBlockPos("location")
                            val be = it.source.world.getBlockEntity(pos)
                            if (be is SimpleComputerBE) {
                                val circuit = be.circuit
                                if (circuit != null) {
                                    compiledCircuit = CircuitCompiler.compileCircuit(circuit.board)
                                    compiledCircuit!!.setup()
                                    it.source.sendFeedback(
                                        LiteralText("Compiled circuit board! Use /jabber run to simulate it"),
                                        false
                                    )
                                } else {
                                    it.source.sendError(LiteralText("That computer does not have a circuit!"))
                                }
                            } else {
                                it.source.sendError(
                                    LiteralText(
                                        "That is not a computer! That's a ${
                                            be?.let { it::class.simpleName } ?: "normal block (${
                                                it.source.world.getBlockState(
                                                    pos
                                                ).block.name.string
                                            })"
                                        }"))
                            }
                        }
                    }
                }
                literal("run") {
                    integer("times", 0) {
                        executes {
                            if (compiledCircuit == null) {
                                it.source.sendError(LiteralText("No circuit has been compiled!"))
                                return@executes
                            }
                            repeat(it.getInt("times")) {
                                compiledCircuit!!.simulate()
                            }
                        }
                    }
                }
            }
        }
    }
}
