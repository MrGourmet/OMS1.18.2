
package net.mcreator.oms.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class QuarceDoorBlock extends DoorBlock {

	public QuarceDoorBlock() {
		super(BlockBehaviour.Properties.of(Material.GLASS).sound(new ForgeSoundType(1.0f, 1.0f,
				() -> new SoundEvent(new ResourceLocation("block.glass.break")), () -> new SoundEvent(new ResourceLocation("block.metal.step")),
				() -> new SoundEvent(new ResourceLocation("block.iron_door.open")), () -> new SoundEvent(new ResourceLocation("block.glass.hit")),
				() -> new SoundEvent(new ResourceLocation("block.metal.step")))).strength(3.5f, 10f).requiresCorrectToolForDrops());

	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 14;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		if (state.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) != DoubleBlockHalf.LOWER)
			return Collections.emptyList();

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
