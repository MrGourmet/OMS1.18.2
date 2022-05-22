
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.oms.item.CookedFleshItem;
import net.mcreator.oms.item.CookedEggItem;
import net.mcreator.oms.OmsMod;

public class OmsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OmsMod.MODID);
	public static final RegistryObject<Item> COOKED_EGG = REGISTRY.register("cooked_egg", () -> new CookedEggItem());
	public static final RegistryObject<Item> COOKED_FLESH = REGISTRY.register("cooked_flesh", () -> new CookedFleshItem());
	public static final RegistryObject<Item> QUARCE_DOOR = doubleBlock(OmsModBlocks.QUARCE_DOOR, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> QUARCE_DOR = doubleBlock(OmsModBlocks.QUARCE_DOR, CreativeModeTab.TAB_REDSTONE);

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
