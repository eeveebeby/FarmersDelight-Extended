package com.eeveebeby.farmersdelight_extended.item;

import java.util.Properties;

import com.eeveebeby.farmersdelight_extended.FarmersDelight_Extended;
import com.eeveebeby.farmersdelight_extended.item.custom_properties.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import vectorwing.farmersdelight.common.item.DrinkableItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FarmersDelight_Extended.MOD_ID);

    // Group 1
    public static final DeferredItem<Item> BATTERED_COD = ITEMS.register("battered_cod",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.BATTERED_COD)));
    public static final DeferredItem<Item> FRIED_COD = ITEMS.register("fried_cod",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_COD)));

    // Group 2
    public static final DeferredItem<Item> CUT_POTATOES = ITEMS.register("cut_potatoes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CUT_POTATOES)));
    public static final DeferredItem<Item> FRIES = ITEMS.register("fries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIES)));
    public static final DeferredItem<Item> FISH_AND_CHIPS = ITEMS.register("fish_and_chips",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.FISH_AND_CHIPS).stacksTo(16).craftRemainder(Items.BOWL)));
    public static final DeferredItem<Item> HONEY_ROLL = ITEMS.register("honey_roll",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_ROLL)));
    public static final DeferredItem<Item> CHOCOLATE_ROLL = ITEMS.register("chocolate_roll",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_ROLL)));
    public static final DeferredItem<Item> BREAD_SLICE = ITEMS.register("bread_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BREAD_SLICE)));
    public static final DeferredItem<Item> TOAST = ITEMS.register("toast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOAST)));
    public static final DeferredItem<Item> BATTERED_CHICKEN = ITEMS.register("battered_chicken",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.BATTERED_CHICKEN)));
    public static final DeferredItem<Item> FRIED_CHICKEN = ITEMS.register("fried_chicken",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_CHICKEN)));
    public static final DeferredItem<Item> CHICKEN_AND_FRIES = ITEMS.register("chicken_and_fries",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.CHICKEN_AND_FRIES).stacksTo(16).craftRemainder(Items.BOWL)));

    // Group 3
    public static final DeferredItem<Item> FRESH_CHEESE = ITEMS.register("fresh_cheese",
            () -> new FartFoodItem(new Item.Properties().food(ModFoodProperties.FRESH_CHEESE)));
    public static final DeferredItem<Item> CHEESEBURGER = ITEMS.register("cheeseburger",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESEBURGER)));
    public static final DeferredItem<Item> CHICKEN_PARMESAN = ITEMS.register("chicken_parmesan",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.CHICKEN_PARMESAN).stacksTo(16).craftRemainder(Items.BOWL)));
    public static final DeferredItem<Item> BEEF_WELLINGTON = ITEMS.register("beef_wellington",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.BEEF_WELLINGTON).stacksTo(16).craftRemainder(Items.BOWL)));
    public static final DeferredItem<Item> SPICY_FRIED_CHICKEN = ITEMS.register("spicy_fried_chicken",
            () -> new SpicyFoodItem(new Item.Properties().food(ModFoodProperties.SPICY_FRIED_CHICKEN)));
    public static final DeferredItem<Item> SPICY_CHICKEN_AND_FRIES = ITEMS.register("spicy_chicken_and_fries",
            () -> new SpicyFoodItem(new Item.Properties().food(ModFoodProperties.SPICY_CHICKEN_AND_FRIES).stacksTo(16).craftRemainder(Items.BOWL)));
    public static final DeferredItem<Item> SHREDDED_POTATOES = ITEMS.register("shredded_potatoes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SHREDDED_POTATOES)));
    public static final DeferredItem<Item> HASHBROWNS = ITEMS.register("hashbrowns",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HASHBROWNS)));
    public static final DeferredItem<Item> BREAKFAST_PLATE = ITEMS.register("breakfast_plate",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.BREAKFAST_PLATE).stacksTo(16).craftRemainder(Items.BOWL)));

    //Group 4
    public static final DeferredItem<Item> CHORUS_COOKIE = ITEMS.register("chorus_cookie",
            () -> new ChorusFoodItem(new Item.Properties().food(ModFoodProperties.CHORUS_COOKIE)));
    public static final DeferredItem<Item> GLOW_BERRY_COOKIE = ITEMS.register("glow_berry_cookie",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.GLOW_BERRY_COOKIE)));
    public static final DeferredItem<Item> CHORUS_POPSICLE = ITEMS.register("chorus_popsicle",
            () -> new ChorusFrozenItem(new Item.Properties().food(ModFoodProperties.CHORUS_POPSICLE)));
    public static final DeferredItem<Item> GLOW_BERRY_POPSICLE = ITEMS.register("glow_berry_popsicle",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.GLOW_BERRY_POPSICLE)));
    public static final DeferredItem<Item> SWEET_BERRY_POPSICLE = ITEMS.register("sweet_berry_popsicle",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.SWEET_BERRY_POPSICLE)));
    public static final DeferredItem<Item> CHOCOLATE_POPSICLE = ITEMS.register("chocolate_popsicle",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.CHOCOLATE_POPSICLE)));
    public static final DeferredItem<Item> CHORUS_CUSTARD = ITEMS.register("chorus_custard",
            () -> new ChorusFoodItem(new Item.Properties().food(ModFoodProperties.CHORUS_CUSTARD)));
    public static final DeferredItem<Item> SWEET_BERRY_CUSTARD = ITEMS.register("sweet_berry_custard",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWEET_BERRY_CUSTARD)));
    public static final DeferredItem<Item> CHOCOLATE_CUSTARD = ITEMS.register("chocolate_custard",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_CUSTARD)));
    public static final DeferredItem<Item> ICECREAM_SCOOP = ITEMS.register("icecream_scoop",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.ICECREAM_SCOOP)));
    public static final DeferredItem<Item> GLOW_BERRY_ICECREAM_SCOOP = ITEMS.register("glow_berry_icecream_scoop",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.GLOW_BERRY_ICECREAM_SCOOP)));
    public static final DeferredItem<Item> CHORUS_ICECREAM_SCOOP = ITEMS.register("chorus_icecream_scoop",
            () -> new ChorusFrozenItem(new Item.Properties().food(ModFoodProperties.CHORUS_ICECREAM_SCOOP)));
    public static final DeferredItem<Item> SWEET_BERRY_ICECREAM_SCOOP = ITEMS.register("sweet_berry_icecream_scoop",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.SWEET_BERRY_ICECREAM_SCOOP)));
    public static final DeferredItem<Item> CHOCOLATE_ICECREAM_SCOOP = ITEMS.register("chocolate_icecream_scoop",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.CHOCOLATE_ICECREAM_SCOOP)));
    public static final DeferredItem<Item> CHOCOLATE_GRAHAM_CRACKER = ITEMS.register("chocolate_graham_cracker",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_GRAHAM_CRACKER)));
    public static final DeferredItem<Item> ICECREAM_SANDWICH = ITEMS.register("icecream_sandwich",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.ICECREAM_SANDWICH)));
    public static final DeferredItem<Item> GLOW_BERRY_ICECREAM_SANDWICH = ITEMS.register("glow_berry_icecream_sandwich",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.GLOW_BERRY_ICECREAM_SANDWICH)));
    public static final DeferredItem<Item> CHORUS_ICECREAM_SANDWICH = ITEMS.register("chorus_icecream_sandwich",
            () -> new ChorusFrozenItem(new Item.Properties().food(ModFoodProperties.CHORUS_ICECREAM_SANDWICH)));
    public static final DeferredItem<Item> SWEET_BERRY_ICECREAM_SANDWICH = ITEMS.register("sweet_berry_icecream_sandwich",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.SWEET_BERRY_ICECREAM_SANDWICH)));
    public static final DeferredItem<Item> CHOCOLATE_ICECREAM_SANDWICH = ITEMS.register("chocolate_icecream_sandwich",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.CHOCOLATE_ICECREAM_SANDWICH)));
    public static final DeferredItem<Item> RICE_FLOUR = ITEMS.registerSimpleItem("rice_flour");
    public static final DeferredItem<Item> MOCHI = ITEMS.register("mochi",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MOCHI)));
    public static final DeferredItem<Item> MOCHI_ICECREAM = ITEMS.register("mochi_icecream",
            () -> new FrozenFoodItem(new Item.Properties().food(ModFoodProperties.MOCHI_ICECREAM).stacksTo(16).craftRemainder(Items.BOWL)));
    public static final DeferredItem<Item> UNPROCESSED_MOCHI = ITEMS.register("unprocessed_mochi",
            () -> new Item(new Item.Properties()));
        

    // Register
    // Group 4
    public static final DeferredItem<Item> GOLDEN_APPLE_CIDER = ITEMS.register("golden_apple_cider",
            () -> new DrinkableItem(new Item.Properties().food(ModFoodProperties.GOLDEN_APPLE_CIDER).stacksTo(16).craftRemainder(Items.GLASS_BOTTLE), true, false));
    public static final DeferredItem<Item> BROWNIE = ITEMS.register("brownie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BROWNIE)));
    public static final DeferredItem<Item> BROWNIE_BATTER = ITEMS.register("brownie_batter",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.BROWNIE_BATTER)));
    public static final DeferredItem<Item> BATTERED_MUSHROOM = ITEMS.register("battered_mushroom",
            () -> new TooltipFoodItem(new Item.Properties().food(ModFoodProperties.BATTERED_MUSHROOM)));
    public static final DeferredItem<Item> FRIED_MUSHROOM = ITEMS.register("fried_mushroom",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_MUSHROOM)));
//     public static final DeferredItem<Item> SPECIAL_BROWNIE = ITEMS.register("special_brownie",
//             () -> new Item(new Item.Properties().food(ModFoodProperties.SPECIAL_BROWNIE).rarity(Rarity.UNCOMMON)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
