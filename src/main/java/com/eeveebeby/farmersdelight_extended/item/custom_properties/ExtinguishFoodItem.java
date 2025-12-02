package com.eeveebeby.farmersdelight_extended.item.custom_properties;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ExtinguishFoodItem extends Item {
    public ExtinguishFoodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pEntity) {
        ItemStack resultStack = super.finishUsingItem(pStack, pLevel, pEntity);

        if (!pLevel.isClientSide()) {
            pEntity.extinguishFire();
        }

        return resultStack;
    }
}
