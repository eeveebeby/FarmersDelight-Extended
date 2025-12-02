package com.eeveebeby.farmersdelight_extended.item.custom_properties;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class FrozenFoodItem extends ExtinguishFoodItem{
    private static final int FREEZING_DURATION = 135;

    public FrozenFoodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pEntity) {
        ItemStack resultStack = super.finishUsingItem(pStack, pLevel, pEntity);

        if (!pLevel.isClientSide()) {
            pEntity.extinguishFire();
            int currentTicksFrozen = pEntity.getTicksFrozen();
            if (currentTicksFrozen < 500) {
                pEntity.setTicksFrozen((currentTicksFrozen * 2) + FREEZING_DURATION);
            }
        }

        return resultStack;
    }
}
