package com.eeveebeby.farmersdelight_extended.item;

import com.eeveebeby.farmersdelight_extended.FarmersDelight_Extended;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FarmersDelight_Extended.MOD_ID);

    public static final Supplier<CreativeModeTab> FOODS_TAB = CREATIVE_MODE_TAB.register("foods_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHICKEN_PARMESAN.get()))
                    .title(Component.translatable("creativetab.farmersdelight_extended.food_items"))
                    .displayItems((parameters, output) -> {

                      // Group 1
                      output.accept(ModItems.BATTERED_COD);
                      output.accept(ModItems.FRIED_COD);

                      // Group 2
                      output.accept(ModItems.CUT_POTATOES);
                      output.accept(ModItems.FRIES);
                      output.accept(ModItems.FISH_AND_CHIPS);
                      output.accept(ModItems.CUT_POTATOES);
                      output.accept(ModItems.FRIES);
                      output.accept(ModItems.FISH_AND_CHIPS);
                      output.accept(ModItems.HONEY_ROLL);
                      output.accept(ModItems.CHOCOLATE_ROLL);
                      output.accept(ModItems.BREAD_SLICE);
                      output.accept(ModItems.TOAST);
                      output.accept(ModItems.BATTERED_CHICKEN);
                      output.accept(ModItems.FRIED_CHICKEN);
                      output.accept(ModItems.CHICKEN_AND_FRIES);

                      // Group 3
                      output.accept(ModItems.FRESH_CHEESE);
                      output.accept(ModItems.CHEESEBURGER);
                      output.accept(ModItems.CHICKEN_PARMESAN);
                      output.accept(ModItems.BEEF_WELLINGTON);
                      output.accept(ModItems.SPICY_FRIED_CHICKEN);
                      output.accept(ModItems.SPICY_CHICKEN_AND_FRIES);
                      output.accept(ModItems.SHREDDED_POTATOES);
                      output.accept(ModItems.HASHBROWNS);
                      output.accept(ModItems.BREAKFAST_PLATE);

                      // Group 4
                      output.accept(ModItems.GOLDEN_APPLE_CIDER);
                      output.accept(ModItems.CHOCOLATE_BROWNIE);
                      output.accept(ModItems.BROWNIE_BATTER);
                      output.accept(ModItems.BROWNIE);
                      output.accept(ModItems.FRIED_MUSHROOM);
                      output.accept(ModItems.BATTERED_MUSHROOM);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
