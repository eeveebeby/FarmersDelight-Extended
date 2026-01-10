package com.eeveebeby.farmersdelight_extended.item.custom_properties;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ChorusFruitItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ChorusFoodItem extends ChorusFruitItem {
    public ChorusFoodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull LivingEntity pEntity) {
        return super.finishUsingItem(pStack, pLevel, pEntity);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext ctx, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, ctx, tooltip, flag);

        FoodProperties food = this.getFoodProperties(stack, null);
        if (food == null) return;

        food.effects().forEach(possibleEffect -> {
            MobEffectInstance effect = possibleEffect.effect();
            float chance = possibleEffect.probability();

            Component line = Component.translatable(effect.getDescriptionId())
                    .append(" ")
                    .append(Component.literal("(" + (effect.getDuration() / 20) + "s)"))
                    .withStyle(ChatFormatting.BLUE);

            tooltip.add(line);
        });
    }
}
