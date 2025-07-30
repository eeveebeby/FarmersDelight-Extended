package com.eeveebeby.farmersdelight_extended.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;


public class ModFoodProperties {

    // Group 1
    public static final FoodProperties BATTERED_COD = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f).build();
    public static final FoodProperties FRIED_COD = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(.6f).build();

    // Group 2
    public static final FoodProperties CUT_POTATOES = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(.8f).build();
    public static final FoodProperties FRIES = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(.6f).build();
    public static final FoodProperties FISH_AND_CHIPS = new FoodProperties.Builder()
            .nutrition(12).saturationModifier(.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1)
            .build();
    public static final FoodProperties HONEY_ROLL = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(.6f).build();
    public static final FoodProperties CHOCOLATE_ROLL = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(.6f).build();
    public static final FoodProperties BREAD_SLICE = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(.8f).build();
    public static final FoodProperties TOAST = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(.8f).build();
    public static final FoodProperties BATTERED_CHICKEN = new FoodProperties.Builder()
            .nutrition(2).saturationModifier(.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3f).build();
    public static final FoodProperties FRIED_CHICKEN = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(.6f).build();
    public static final FoodProperties CHICKEN_AND_FRIES = new FoodProperties.Builder()
            .nutrition(12).saturationModifier(.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1)
            .build();

    // Group 3
    public static final FoodProperties FRESH_CHEESE = new FoodProperties.Builder()
            .nutrition(4).saturationModifier(.6f).build();
    public static final FoodProperties CHEESEBURGER = new FoodProperties.Builder()
            .nutrition(13).saturationModifier(.9f).build();
    public static final FoodProperties CHICKEN_PARMESAN = new FoodProperties.Builder()
            .nutrition(14).saturationModifier(.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 6000, 0), 1)
            .build();
    public static final FoodProperties BEEF_WELLINGTON = new FoodProperties.Builder()
            .nutrition(14).saturationModifier(.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 6000, 0), 1)
            .build();
    public static final FoodProperties SPICY_FRIED_CHICKEN = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(.6f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1), 1).build();
    public static final FoodProperties SPICY_CHICKEN_AND_FRIES = new FoodProperties.Builder()
            .nutrition(12).saturationModifier(.8f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1), 1)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1)
            .build();
    public static final FoodProperties SHREDDED_POTATOES = new FoodProperties.Builder()
            .nutrition(1).saturationModifier(.8f).build();
    public static final FoodProperties HASHBROWNS = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(.6f).build();
    public static final FoodProperties LOADED_BAKED_POTATO = new FoodProperties.Builder()
            .nutrition(11).saturationModifier(.8f).build();
    public static final FoodProperties BREAKFAST_PLATE = new FoodProperties.Builder()
            .nutrition(10).saturationModifier(.6f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, 1200, 0), 1)
            .build();

    // Group 4
}
