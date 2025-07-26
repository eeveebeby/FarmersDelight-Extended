package com.eeveebeby.farmersdelight_extended.item;

import com.eeveebeby.farmersdelight_extended.FarmersDelight_Extended;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FarmersDelight_Extended.MOD_ID);

    public static final DeferredItem<Item> BATTERED_COD = ITEMS.register("battered_cod",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BATTERED_COD)));
    public static final DeferredItem<Item> FRIED_COD = ITEMS.register("fried_cod",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_COD)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
