package com.eeveebeby.farmersdelight_extended.item.custom_properties;

import com.eeveebeby.farmersdelight_extended.item.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class FartFoodItem extends TooltipFoodItem {
    public FartFoodItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (player.getCooldowns().isOnCooldown(this)) {
            return InteractionResultHolder.fail(stack);
        }
        return super.use(world, player, hand);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, world, entity);

        if (!world.isClientSide() && entity instanceof Player player) {
            if (world.random.nextFloat() < 0.3f) {
                world.playSound(
                        null,
                        entity.getX(), entity.getY(), entity.getZ(),
                        ModSounds.FART.get(),
                        SoundSource.PLAYERS,
                        1.0f,
                        0.9f + world.random.nextFloat() * 0.2f
                );

//                Component message = Component.literal("You forgot that you are lactose intolerant!").withStyle(ChatFormatting.GOLD);
//                player.sendSystemMessage(message);
            }

            player.getCooldowns().addCooldown(this, 30);
        }

        return result;
    }
}
