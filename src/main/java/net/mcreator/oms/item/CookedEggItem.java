
package net.mcreator.oms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class CookedEggItem extends Item {
	public CookedEggItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.6f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 30;
	}
}
