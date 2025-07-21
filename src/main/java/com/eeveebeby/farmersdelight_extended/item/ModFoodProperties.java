package com.eeveebeby.farmersdelight_extended.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BATTERED_COD = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(.6f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f).build();
}
