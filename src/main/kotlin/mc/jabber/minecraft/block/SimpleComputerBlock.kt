package mc.jabber.minecraft.block

import mc.jabber.ComputerNetworks
import mc.jabber.minecraft.block.entity.SimpleComputerBE
import mc.jabber.minecraft.items.CircuitItem
import mc.jabber.util.assertType
import mc.jabber.util.idFlip
import net.minecraft.block.BlockRenderType
import net.minecraft.block.BlockState
import net.minecraft.block.BlockWithEntity
import net.minecraft.block.entity.BlockEntity
import net.minecraft.block.entity.BlockEntityTicker
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.ItemScatterer
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.registry.Registry
import net.minecraft.world.World
import net.minecraft.world.WorldAccess

class SimpleComputerBlock(val stepsPerTick: Int, settings: Settings) : BlockWithEntity(settings) {
    override fun createBlockEntity(pos: BlockPos, state: BlockState): BlockEntity {
        return SimpleComputerBE(
            stepsPerTick,
            pos,
            state,
            Registry.BLOCK_ENTITY_TYPE.idFlip(Registry.BLOCK, this).assertType()
        )
    }

    override fun getRenderType(state: BlockState): BlockRenderType {
        return BlockRenderType.MODEL
    }

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        val item = player.getStackInHand(hand)
        if (!world.isClient) {
            if (item.item is CircuitItem) {
                val be = world.getBlockEntity(pos).assertType<SimpleComputerBE>()

                if (be.circuitItem != null) {
                    player.giveItemStack(be.circuitItem)
                }

                be.circuitItem = item.copy()
                item.decrement(1)

                player.playSound(SoundEvents.UI_BUTTON_CLICK, SoundCategory.BLOCKS, 0.5f, 1.4f)

                return ActionResult.SUCCESS
            } else if (item.isEmpty && player.isSneaky) {
                val be = world.getBlockEntity(pos).assertType<SimpleComputerBE>()

                if (be.circuitItem != null) {
                    player.giveItemStack(be.circuitItem)
                    player.playSound(SoundEvents.UI_BUTTON_CLICK, SoundCategory.BLOCKS, 0.5f, 1.4f)
                    be.circuitItem = null
                }
                return ActionResult.SUCCESS
            }
        }
        return ActionResult.PASS
    }

    override fun onStateReplaced(
        state: BlockState,
        world: World,
        pos: BlockPos?,
        newState: BlockState,
        moved: Boolean
    ) {
        if (!state.isOf(newState.block)) {
            val be = world.getBlockEntity(pos)
            if (be is SimpleComputerBE && be.circuitItem != null) {
                ItemScatterer.spawn(world, pos, DefaultedList.of<ItemStack>().also { it.add(be.circuitItem) })
            }
        }
        @Suppress("DEPRECATION")
        super.onStateReplaced(state, world, pos, newState, moved)
    }

    override fun onPlaced(
        world: World,
        pos: BlockPos,
        state: BlockState,
        placer: LivingEntity?,
        itemStack: ItemStack
    ) {
        super.onPlaced(world, pos, state, placer, itemStack)
        if (!ComputerNetworks.isInNetwork(world.registryKey, pos)) {
            ComputerNetworks.joinNetwork(world.registryKey, pos)
        } else {
            ComputerNetworks.getNetwork(world.registryKey, pos)
        }
    }

    override fun <T : BlockEntity?> getTicker(
        world: World,
        state: BlockState,
        type: BlockEntityType<T>
    ): BlockEntityTicker<T> {
        return BlockEntityTicker<T> { world1: World, blockPos: BlockPos, blockState: BlockState, t: T ->
            SimpleComputerBE.tick(world1, blockPos, blockState, t.assertType())
        }
    }
}
