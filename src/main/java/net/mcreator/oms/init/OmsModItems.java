
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.oms.item.Cookedegg2Item;
import net.mcreator.oms.OmsMod;

public class OmsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OmsMod.MODID);
	public static final RegistryObject<Item> COOKEDEGG_2 = REGISTRY.register("cookedegg_2", () -> new Cookedegg2Item());
}
