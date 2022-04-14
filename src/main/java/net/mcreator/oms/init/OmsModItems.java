
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.oms.item.CookedFleshItem;
import net.mcreator.oms.item.CookedEggItem;
import net.mcreator.oms.OmsMod;

public class OmsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OmsMod.MODID);
	public static final RegistryObject<Item> COOKED_EGG = REGISTRY.register("cooked_egg", () -> new CookedEggItem());
	public static final RegistryObject<Item> COOKED_FLESH = REGISTRY.register("cooked_flesh", () -> new CookedFleshItem());
}
