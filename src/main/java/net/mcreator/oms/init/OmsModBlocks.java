
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.oms.block.QuarceDoorBlock;
import net.mcreator.oms.OmsMod;

public class OmsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OmsMod.MODID);
	public static final RegistryObject<Block> QUARCE_DOOR = REGISTRY.register("quarce_door", () -> new QuarceDoorBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			QuarceDoorBlock.registerRenderLayer();
		}
	}
}
