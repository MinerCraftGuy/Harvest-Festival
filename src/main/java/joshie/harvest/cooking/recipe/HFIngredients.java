package joshie.harvest.cooking.recipe;

import joshie.harvest.animals.item.ItemAnimalProduct.Sizeable;
import joshie.harvest.api.HFApi;
import joshie.harvest.api.cooking.Ingredient;
import joshie.harvest.api.core.Size;
import joshie.harvest.api.crops.Crop;
import joshie.harvest.cooking.item.ItemIngredients;
import joshie.harvest.cooking.item.ItemMeal.Meal;
import joshie.harvest.cooking.render.IngredientMappingEvent;
import joshie.harvest.core.helpers.InventoryHelper;
import joshie.harvest.core.util.annotations.HFLoader;
import joshie.harvest.crops.HFCrops;
import joshie.harvest.fishing.HFFishing;
import joshie.harvest.fishing.item.ItemFish;
import joshie.harvest.fishing.item.ItemFish.Fish;
import joshie.harvest.gathering.HFGathering;
import joshie.harvest.gathering.block.BlockNature.NaturalBlock;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static joshie.harvest.animals.HFAnimals.ANIMAL_PRODUCT;
import static joshie.harvest.cooking.HFCooking.INGREDIENTS;
import static joshie.harvest.cooking.HFCooking.MEAL;
import static joshie.harvest.core.lib.LoadOrder.HFINGREDIENTS;
import static joshie.harvest.gathering.HFGathering.NATURE;

@HFLoader(priority = HFINGREDIENTS)
@SuppressWarnings("WeakerAccess")
public class HFIngredients {
    //Categories
    public static final Ingredient MUSHROOM = new Ingredient("mushroom");
    public static final Ingredient VEGETABLE_JUICE_BASE = new Ingredient("juiceable_vegetable");
    public static final Ingredient FRUIT_JUICE_BASE = new Ingredient("juiceable_fruit");
    public static final Ingredient SALAD_BASE = new Ingredient("salad_ingredient");
    public static final Ingredient SANDWICH_BASE = new Ingredient("sandwich_ingredient");
    public static final Ingredient FRUITS = new Ingredient("fruit_sandwich_ingredient");
    public static final Ingredient CAKE_FRUIT = new Ingredient("cakeable_fruit");
    public static final Ingredient SASHIMI_VEGETABLE = new Ingredient("sashimi_vegetable");
    public static final Ingredient FISH = new Ingredient("fish");
    public static final Ingredient MEAT = new Ingredient("meat");
    public static final Ingredient HERB = new Ingredient("herb");
    public static final Ingredient EGG = new Ingredient("egg");

    //Formula
    //Cost = Shop/Sell Price += Give or Take
    //Food = Real Food
    //Sat = Real Sat
    //Exhaustion = Random

    //Seasonings
    public static final Ingredient SALT = new Ingredient("salt", 0, 0.8F).setSellValue(ItemIngredients.Ingredient.SALT.getCost());
    public static final Ingredient SUGAR = new Ingredient("sugar", 2, 0.1F);

    //Meals
    public static final Ingredient BUTTER = new Ingredient("butter", 1, 0.9F);
    public static final Ingredient BOILED_EGG = new Ingredient("boiled_egg", 4, 1.12F);
    public static final Ingredient SASHIMI = new Ingredient("sashimi", 5, 0.4F);
    public static final Ingredient SCRAMBLED_EGG = new Ingredient("scrambled_eggs", 4, 1.5F);
    public static final Ingredient COOKIES = new Ingredient("cookies", 7, 0.76F);
    public static final Ingredient KETCHUP = new Ingredient("ketchup", 1, 0.2F);
    public static final Ingredient NOODLES = new Ingredient("noodles", 2, 0.9F);
    public static final Ingredient JAM = new Ingredient("jam", 4, 0.54F);
    public static final Ingredient TEMPURA = new Ingredient("tempura", 4, 1.6F);

    //Random Stuff
    public static final Ingredient CHOCOLATE = new Ingredient("chocolate", 3, 0.5F);

    public static final Ingredient FLOUR = new Ingredient("flour", 1, 0.6F).setSellValue(ItemIngredients.Ingredient.FLOUR.getCost());
    public static final Ingredient OIL = new Ingredient("oil", 0, 0.2F).setSellValue(ItemIngredients.Ingredient.OIL.getCost()).setFluid(IngredientMappingEvent.OIL);
    public static final Ingredient RICEBALL = new Ingredient("riceball", 1, 0.25F).setSellValue(ItemIngredients.Ingredient.RICEBALL.getCost());
    public static final Ingredient CURRY_POWDER = new Ingredient("curry_powder", 1, 0.2F).setSellValue(ItemIngredients.Ingredient.CURRY_POWDER.getCost());
    //public static final Ingredient DUMPLING_POWDER = new Ingredient("dumpling_powder", 1, 0.2F).setSellValue(ItemIngredients.Ingredient.DUMPLING_POWDER.getCost());
    public static final Ingredient WINE = new Ingredient("wine", 2, 0.8F).setSellValue(ItemIngredients.Ingredient.WINE.getCost()).setFluid(IngredientMappingEvent.WINE);

    public static final Ingredient SMALL_EGG = new Ingredient("small_egg", 2, 0.6F);
    public static final Ingredient MEDIUM_EGG = new Ingredient("medium_egg", 3, 0.8F);
    public static final Ingredient LARGE_EGG = new Ingredient("large_egg", 4, 1F);
    public static final Ingredient MILK = new Ingredient("milk", 2, 0.6F).setFluid(IngredientMappingEvent.MILK);
    public static final Ingredient MAYONNAISE = new Ingredient("mayonnaise", 3, 1.0F);
    public static final Ingredient BREAD = new Ingredient("bread", 5, 1.2F);
    public static final Ingredient RED_MUSHROOM = new Ingredient("red_mushroom", 4, 0.5F);
    public static final Ingredient BROWN_MUSHROOM = new Ingredient("brown_mushroom", 4, 0.6F);
    public static final Ingredient BAKED_POTATO = new Ingredient("baked_potato", 5, 0.8F);

    //Gathered
    public static final Ingredient BAMBOO = new Ingredient("bamboo", 3, 1F);
    public static final Ingredient MATSUTAKE = new Ingredient("matsutake", 4, 0.6F);
    public static final Ingredient CHAMOMILE = new Ingredient("chamomile", 1, 0.3F);
    public static final Ingredient MINT = new Ingredient("mint", 1, 0.3F);
    public static final Ingredient LAVENDER = new Ingredient("lavender", 1, 0.3F);

    //Crops
    public static final Ingredient TURNIP = HFCrops.TURNIP.getIngredient();
    public static final Ingredient POTATO = HFCrops.POTATO.getIngredient();
    public static final Ingredient CUCUMBER = HFCrops.CUCUMBER.getIngredient();
    public static final Ingredient STRAWBERRY = HFCrops.STRAWBERRY.getIngredient();
    public static final Ingredient CABBAGE = HFCrops.CABBAGE.getIngredient();
    public static final Ingredient TOMATO = HFCrops.TOMATO.getIngredient();
    public static final Ingredient ONION = HFCrops.ONION.getIngredient();
    public static final Ingredient CORN = HFCrops.CORN.getIngredient();
    public static final Ingredient PUMPKIN = HFCrops.PUMPKIN.getIngredient();
    public static final Ingredient PINEAPPLE = HFCrops.PINEAPPLE.getIngredient();
    public static final Ingredient EGGPLANT = HFCrops.EGGPLANT.getIngredient();
    public static final Ingredient CARROT = HFCrops.CARROT.getIngredient();
    public static final Ingredient SWEET_POTATO = HFCrops.SWEET_POTATO.getIngredient();
    public static final Ingredient SPINACH = HFCrops.SPINACH.getIngredient();
    public static final Ingredient GREEN_PEPPER = HFCrops.GREEN_PEPPER.getIngredient();
    public static final Ingredient BEETROOT = HFCrops.BEETROOT.getIngredient();
    public static final Ingredient WATERMELON = HFCrops.WATERMELON.getIngredient();
    public static final Ingredient WHEAT = HFCrops.WHEAT.getIngredient();
    public static final Ingredient APPLE = HFCrops.APPLE.getIngredient();
    public static final Ingredient BANANA = HFCrops.BANANA.getIngredient();
    public static final Ingredient GRAPE = HFCrops.GRAPE.getIngredient();
    public static final Ingredient ORANGE = HFCrops.ORANGE.getIngredient();
    public static final Ingredient PEACH = HFCrops.PEACH.getIngredient();

    //Meats
    public static final Ingredient CHICKEN = new Ingredient("chicken", 2, 0.6F);
    public static final Ingredient PORK = new Ingredient("pork", 3, 0.6F);
    public static final Ingredient BEEF = new Ingredient("beef", 3, 0.6F);
    public static final Ingredient MUTTON = new Ingredient("mutton", 2, 0.6F);
    public static final Ingredient SALMON = new Ingredient("salmon", 2, 0.2F);
    public static final Ingredient COD = new Ingredient("cod", 2, 0.2F);
    public static final Ingredient RABBIT = new Ingredient("rabbit", 3, 0.6F);
    public static final Ingredient RABBIT_COOKED = new Ingredient("cooked_rabbit", 5, 1.2F);

    public static void preInit() {
        //Add ingredients to the categories
        MUSHROOM.add(RED_MUSHROOM, BROWN_MUSHROOM, MATSUTAKE);
        VEGETABLE_JUICE_BASE.add(TURNIP, CUCUMBER, CABBAGE, TOMATO, ONION, CARROT, SPINACH, GREEN_PEPPER);
        FRUIT_JUICE_BASE.add(STRAWBERRY, WATERMELON);
        SALAD_BASE.add(CUCUMBER, CARROT, TOMATO, CABBAGE, BROWN_MUSHROOM);
        SANDWICH_BASE.add(CUCUMBER, TOMATO, MAYONNAISE, BROWN_MUSHROOM, BOILED_EGG);
        FRUITS.add(ORANGE, BANANA, APPLE, STRAWBERRY, PEACH, PINEAPPLE, WATERMELON);
        CAKE_FRUIT.add(ORANGE, PINEAPPLE, STRAWBERRY, PEACH, GRAPE);
        SASHIMI_VEGETABLE.add(CUCUMBER, TOMATO, ONION, EGGPLANT);
        MEAT.add(CHICKEN, PORK, BEEF, MUTTON, RABBIT);
        FISH.add(SALMON, COD);
        HERB.add(CHAMOMILE, MINT, LAVENDER);
        EGG.add(SMALL_EGG, MEDIUM_EGG, LARGE_EGG);
    }

    private static String getPrimaryCropName(ItemStack stack) {
        String[] names = InventoryHelper.getOreNames(stack);
        for (String name: names) {
            if (name.startsWith("crop")) return name;
        }

        return null;
    }

    @SuppressWarnings("unused")
    public static void postInit() {
        //Animal Products
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.EGG, Size.SMALL), SMALL_EGG);
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.EGG, Size.MEDIUM), MEDIUM_EGG);
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.EGG, Size.LARGE), LARGE_EGG);
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.MILK, Size.SMALL), MILK);
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.MILK, Size.MEDIUM), MILK);
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.MILK, Size.LARGE), MILK);
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.MAYONNAISE, Size.SMALL), MAYONNAISE);
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.MAYONNAISE, Size.MEDIUM), MAYONNAISE);
        HFApi.cooking.register(ANIMAL_PRODUCT.getStack(Sizeable.MAYONNAISE, Size.LARGE), MAYONNAISE);
        HFApi.cooking.register(new ItemStack(Items.EGG), SMALL_EGG);
        HFApi.cooking.register(new ItemStack(Items.MILK_BUCKET), MILK);

        //Crops
        Crop.REGISTRY.values().stream().filter(crop -> crop != Crop.NULL_CROP && crop.getIngredient() != null).forEachOrdered(crop -> {
            ItemStack stack = crop.getCropStack(1);
            String name = getPrimaryCropName(stack);
            if (name != null) {
                registerForOre(name, crop.getIngredient());
            } else HFApi.cooking.register(stack, crop.getIngredient());
        });

        //Fruits
        HFApi.cooking.register(new ItemStack(Blocks.MELON_BLOCK), WATERMELON);

        //Fungus
        HFApi.cooking.register(new ItemStack(Blocks.BROWN_MUSHROOM), BROWN_MUSHROOM);
        HFApi.cooking.register(new ItemStack(Blocks.RED_MUSHROOM), RED_MUSHROOM);
        HFApi.cooking.register(NATURE.getStackFromEnum(NaturalBlock.MATSUTAKE), MATSUTAKE);

        //Other Plants
        HFApi.cooking.register(NATURE.getStackFromEnum(NaturalBlock.BAMBOO), BAMBOO);
        HFApi.cooking.register(HFGathering.NATURE.getStackFromEnum(NaturalBlock.CHAMOMILE), CHAMOMILE);
        HFApi.cooking.register(HFGathering.NATURE.getStackFromEnum(NaturalBlock.MINT), MINT);
        HFApi.cooking.register(HFGathering.NATURE.getStackFromEnum(NaturalBlock.LAVENDER), LAVENDER);

        //Ingredients
        registerForOre("foodChocolatebar", CHOCOLATE);
        registerForOre("foodFlour", FLOUR);
        registerForOre("foodOliveoil", OIL);
        HFApi.cooking.register(INGREDIENTS.getStackFromEnum(ItemIngredients.Ingredient.RICEBALL), RICEBALL);
        HFApi.cooking.register(INGREDIENTS.getStackFromEnum(ItemIngredients.Ingredient.CURRY_POWDER), CURRY_POWDER);
        //HFApi.cooking.register(INGREDIENTS.getStackFromEnum(ItemIngredients.Ingredient.DUMPLING_POWDER), DUMPLING_POWDER);
        HFApi.cooking.register(INGREDIENTS.getStackFromEnum(ItemIngredients.Ingredient.WINE), WINE);

        //Meals - Real
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.EGG_BOILED), BOILED_EGG);
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.SASHIMI), SASHIMI);
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.COOKIES), COOKIES);
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.NOODLES), NOODLES);
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.JAM_STRAWBERRY), JAM);
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.JAM_APPLE), JAM);
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.JAM_GRAPE), JAM);
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.MARMALADE), JAM);
        HFApi.cooking.register(MEAL.getStackFromEnum(Meal.TEMPURA), TEMPURA);

        //Meals that are registed as ores
        registerForOre("foodButter", BUTTER);
        registerForOre("foodScrambledegg", SCRAMBLED_EGG);
        registerForOre("foodKetchup", KETCHUP);

        //Meals - Vanilla
        HFApi.cooking.register(new ItemStack(Items.BREAD), BREAD);
        HFApi.cooking.register(new ItemStack(Items.BAKED_POTATO), BAKED_POTATO);

        //Meats
        HFApi.cooking.register(new ItemStack(Items.FISH, 1, 0), COD);
        HFApi.cooking.register(new ItemStack(Items.FISH, 1, 1), SALMON);
        HFApi.cooking.register(new ItemStack(Items.CHICKEN), CHICKEN);
        HFApi.cooking.register(new ItemStack(Items.RABBIT), RABBIT);
        HFApi.cooking.register(new ItemStack(Items.BEEF), BEEF);
        HFApi.cooking.register(new ItemStack(Items.PORKCHOP), PORK);
        HFApi.cooking.register(new ItemStack(Items.MUTTON), MUTTON);
        HFApi.cooking.register(new ItemStack(Items.COOKED_RABBIT), RABBIT_COOKED);
        HFApi.cooking.register(HFFishing.FISH.getStackFromEnum(Fish.COD), COD);
        HFApi.cooking.register(HFFishing.FISH.getStackFromEnum(Fish.SALMON), SALMON);
        for (Fish fish: ItemFish.Fish.values()) {
            if (!(fish.isUncookable() || fish == Fish.COD || fish == Fish.SALMON)) {
                HFApi.cooking.register(HFFishing.FISH.getStackFromEnum(fish), FISH);
            }
        }

        //Spices and Salts
        registerForOre("foodSalt", SALT);
        HFApi.cooking.register(new ItemStack(Items.SUGAR), SUGAR);
    }

    private static void registerForOre(String ore, Ingredient ingredient) {
        for (ItemStack item: OreDictionary.getOres(ore)) {
            HFApi.cooking.register(item, ingredient);
        }
    }
}