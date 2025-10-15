package com.eeveebeby.farmersdelight_extended.item.custom_properties;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ChorusFruitItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ChorusPopsicleItem extends ChorusFruitItem {
    private static final int FREEZING_DURATION = 135;

    public ChorusPopsicleItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pEntity) {
        ItemStack resultStack = super.finishUsingItem(pStack, pLevel, pEntity);

        if (!pLevel.isClientSide()) {
            pEntity.extinguishFire();
            int currentTicksFrozen = pEntity.getTicksFrozen();
            System.out.println(currentTicksFrozen);
            if (currentTicksFrozen < 500) {
                pEntity.setTicksFrozen((currentTicksFrozen * 2) + FREEZING_DURATION);
            }
        }

        return resultStack;
    }
}
