package net.mcreator.oms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class CookedFleshEatenProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (0 > 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1));
		}
		if (0 > 5) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 90, 1));
		}
	}
}
