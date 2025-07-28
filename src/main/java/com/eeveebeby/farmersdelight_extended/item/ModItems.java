package com.eeveebeby.farmersdelight_extended.item;

import com.eeveebeby.farmersdelight_extended.FarmersDelight_Extended;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FarmersDelight_Extended.MOD_ID);

    public static final DeferredItem<Item> BATTERED_COD = ITEMS.register("battered_cod",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BATTERED_COD)));
    public static final DeferredItem<Item> FRIED_COD = ITEMS.register("fried_cod",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_COD)));
    public static final DeferredItem<Item> CUT_POTATOES = ITEMS.register("cut_potatoes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CUT_POTATOES)));
    public static final DeferredItem<Item> FRIES = ITEMS.register("fries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIES)));
    public static final DeferredItem<Item> FISH_AND_CHIPS = ITEMS.register("fish_and_chips",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FISH_AND_CHIPS).stacksTo(16).craftRemainder(Items.BOWL)));
    public static final DeferredItem<Item> HONEY_ROLL = ITEMS.register("honey_roll",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_ROLL)));
    public static final DeferredItem<Item> CHOCOLATE_ROLL = ITEMS.register("chocolate_roll",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_ROLL)));
    public static final DeferredItem<Item> BREAD_SLICE = ITEMS.register("bread_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BREAD_SLICE)));
    public static final DeferredItem<Item> TOAST = ITEMS.register("toast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOAST)));
    public static final DeferredItem<Item> BATTERED_CHICKEN_CUT = ITEMS.register("battered_chicken_cut",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BATTERED_CHICKEN_CUT)));
    public static final DeferredItem<Item> FRIED_CHICKEN_CUT = ITEMS.register("fried_chicken_cut",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_CHICKEN_CUT)));
    public static final DeferredItem<Item> CHICKEN_AND_FRIES = ITEMS.register("chicken_and_fries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHICKEN_AND_FRIES).stacksTo(16).craftRemainder(Items.BOWL)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
