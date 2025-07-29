package com.eeveebeby.farmersdelight_extended.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class SpicyFriedChickenItem extends Item {
    public SpicyFriedChickenItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level plevel, @NotNull LivingEntity pLivingEntity) {
        ItemStack resultStack = super.finishUsingItem(pStack, plevel, pLivingEntity);

        if (!plevel.isClientSide) {
            pLivingEntity.igniteForSeconds(15);

            Component message = Component.literal("Feeling hot, hot, hot!").withStyle(ChatFormatting.RED);
            pLivingEntity.sendSystemMessage(message);
        }

        return resultStack;
    }
}
