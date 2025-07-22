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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BATTERED_COD.get()))
                    .title(Component.translatable("creativetab.farmersdelight_extended.food_items"))
                    .displayItems((parameters, output) -> {
                      output.accept(ModItems.BATTERED_COD);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
