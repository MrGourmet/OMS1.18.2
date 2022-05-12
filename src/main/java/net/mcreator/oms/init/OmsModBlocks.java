
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.oms.block.QuarceDoorBlock;
import net.mcreator.oms.OmsMod;

public class OmsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OmsMod.MODID);
	public static final RegistryObject<Block> QUARCE_DOOR = REGISTRY.register("quarce_door", () -> new QuarceDoorBlock());
}
