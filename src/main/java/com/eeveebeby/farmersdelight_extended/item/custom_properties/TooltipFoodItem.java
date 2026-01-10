package com.eeveebeby.farmersdelight_extended.item.custom_properties;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;
import net.minecraft.network.chat.MutableComponent;

import java.util.List;

public class TooltipFoodItem extends Item {

    public TooltipFoodItem(Properties props) {
        super(props);
    }

    @Override
    public void appendHoverText(
            @NotNull ItemStack stack,
            @NotNull TooltipContext ctx,
            @NotNull List<Component> tooltip,
            @NotNull TooltipFlag flag
    ) {
        super.appendHoverText(stack, ctx, tooltip, flag);

        FoodProperties food = getFoodProperties(stack, null);
        if (food == null) return;

        for (var entry : food.effects()) {
            MobEffectInstance effect = entry.effect();
            float chance = entry.probability();

            // Base effect name (localized)
            MutableComponent text = Component.translatable(effect.getDescriptionId());

            // Amplifier (I, II, III…)
            if (effect.getAmplifier() > 1) {
                text = text.append(" ")
                        .append(Component.literal(toRoman(effect.getAmplifier() + 1)));
            }

            // Duration (MM:SS), only if > 1s
            if (effect.getDuration() > 20) {
                text = text.append(Component.literal(
                        " (" + formatDuration(effect.getDuration()) + ")"
                ));
            }

            // Color like vanilla
            if (effect.getEffect().value().isBeneficial()) {
                text = text.withStyle(ChatFormatting.BLUE);
            } else {
                text = text.withStyle(ChatFormatting.RED);
            }

            tooltip.add(text);

            // Chance line if < 100%
            if (chance < 1.0f) {
                int percent = Math.round(chance * 100);
                tooltip.add(
                        Component.literal(percent + "% chance")
                                .withStyle(ChatFormatting.DARK_GRAY)
                );
            }
        }
    }

    // ---------- helpers ----------

    private static String formatDuration(int ticks) {
        int totalSeconds = ticks / 20;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    private static String toRoman(int number) {
        return switch (number) {
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> String.valueOf(number);
        };
    }
}
