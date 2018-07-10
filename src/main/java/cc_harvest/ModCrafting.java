package cc_harvest;

import java.util.ArrayList;
import java.util.Arrays;

import cc_harvest.blocks.BlockLuckyBox;
import cc_harvest.blocks.ModBlocks;
import cc_harvest.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModCrafting {
	public static String[] cropName = { "cropAsparagus", "cropBarley", "cropBean", "cropBeet", "cropBroccoli",
			"cropCauliflower", "cropCelery", "cropCranberry", "cropGarlic", "cropGinger", "cropLeek", "cropLettuce",
			"cropOats", "cropOnion", "cropParsnip", "cropPeanut", "cropPineapple", "cropRadish", "cropRice",
			"cropRutabaga", "cropRye", "cropScallion", "cropSoybean", "cropSpiceleaf", "cropSweetPotato", "cropTea",
			"cropTurnip", "cropWhitemushroom", "cropArtichoke", "cropBellpepper", "cropBlackberry", "cropBlueberry",
			"cropBrusselsprout", "cropCabbage", "cropCactusfruit", "cropCandleberry", "cropCantaloupe",
			"cropChilipepper", "cropCoffee", "cropCorn", "cottonItem", "cropCucumber", "cropEggplant", "cropGrape",
			"cropKiwi", "cropMustard", "cropOkra", "cropPeas", "cropRaspberry", "cropRhubarb", "cropSeaweed",
			"cropStrawberry", "cropTomato", "cropWintersquash", "cropZucchini", "cropBambooshoot" };

	// Box Items
	public static ArrayList<Item> boxCropItems;

	public static ArrayList<Item> boxSeedsItems;
	public static ArrayList<Item> boxSeedsBoxItems;
	public static ArrayList<Item> boxSeedsPacketItems;

	public static ArrayList<Item> boxSeedsListItems;

	public static ArrayList<Item> boxTempFruitsItems;
	public static ArrayList<Item> boxWarmFruitsItems;
	public static ArrayList<Item> boxLogFruitsItems;

	// Box
	public static BlockLuckyBox luckyCropsBox;
	public static BlockLuckyBox luckySeedsBox;
	public static BlockLuckyBox luckyTemperateFruitsBox;
	public static BlockLuckyBox luckyWarmFruitsBox;
	public static BlockLuckyBox luckyLogFruitsBox;

	// Books
	public static ItemStack bookTools;
	public static ItemStack bookGardens;

	public static void main() {
		// Tools
		ModCrafting.addShapedOreRecipe(ModBlocks.cuttingBoard,
				new Object[] { "A", "B", 'A', ModItems.cuttingboardItem, 'B', Blocks.planks });
		ModCrafting.addShapedOreRecipe(ModBlocks.pot,
				new Object[] { "A", "B", 'A', ModItems.potItem, 'B', Blocks.planks });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.apiary, 1, 0),
				new Object[] { "PFP", "PFP", "PFP", 'P', Blocks.planks, 'F', Items.item_frame });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.presser, 1, 0),
				new Object[] { "IPI", "W W", "IPI", 'I', Items.iron_ingot, 'P', Blocks.piston, 'W', Blocks.planks });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.churn, 1, 0), new Object[] { "WIW", "LPL", "WIW", 'I',
				Items.iron_ingot, 'P', Blocks.piston, 'L', Blocks.log, 'W', Blocks.planks });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.quern, 1, 0), new Object[] { " I ", "CPC", " I ", 'I',
				Items.iron_ingot, 'P', Blocks.piston, 'C', Blocks.cobblestone });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.sinkWood, 1, 0), new Object[] { "PIP", "PWP", "PIP", 'I',
				Items.iron_ingot, 'P', Blocks.planks, 'W', Items.water_bucket });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.sinkStone, 1, 0), new Object[] { "SIS", "SWS", "SIS",
				'I', Items.iron_ingot, 'S', Blocks.stone, 'W', Items.water_bucket });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.sinkClay, 1, 0),
				new Object[] { "CIC", "CWC", "CIC", 'I', Items.iron_ingot, 'C', Blocks.clay, 'W', Items.water_bucket });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.sinkBrick, 1, 0), new Object[] { "BIB", "BWB", "BIB",
				'I', Items.iron_ingot, 'B', Blocks.brick_block, 'W', Items.water_bucket });

		// Storage
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageCropsBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllCrop" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageSeedsBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllSeed" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageTemperateFruitsBox, 1, 0), new Object[] { "SPS",
				"PXP", "SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllTemperateFruit" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageWarmFruitsBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllWarmFruit" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageLogFruitsBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllLogFruit" });

		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageCakeBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllCake" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageHoneyBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', ModItems.honeyItem });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageJellyBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllJelly" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageJuiceBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllJuice" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storagePieBox, 1, 0), new Object[] { "SPS", "PXP", "SCS",
				'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllPie" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageSaladBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllSalad" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageSandwichBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllSandwich" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageSmoothieBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllSmoothie" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageSodaBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllSoda" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageSoupBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllSoup" });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageToolsBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', ModItems.cuttingboardItem });
		ModCrafting.addShapedOreRecipe(new ItemStack(ModBlocks.storageYogurtBox, 1, 0), new Object[] { "SPS", "PXP",
				"SCS", 'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', "listAllYogurt" });

		// Sapling
		for (int i = 0; i < ModBlocks.temperateSaplings.length; i++) {
			ModCrafting.addShapelessOreRecipe(ModBlocks.temperateSaplings[i],
					new Object[] { ModItems.temperateFruits[i], new ItemStack(Blocks.sapling, 1, 0) });
		}
		for (int i = 0; i < ModBlocks.warmSaplings.length; i++) {
			ModCrafting.addShapelessOreRecipe(ModBlocks.warmSaplings[i],
					new Object[] { ModItems.warmFruits[i], new ItemStack(Blocks.sapling, 1, 3) });
		}
		ModCrafting.addShapelessOreRecipe(ModBlocks.cinnamonSapling,
				new Object[] { ModItems.cinnamonItem, new ItemStack(Blocks.sapling, 1, 3) });
		ModCrafting.addShapelessOreRecipe(ModBlocks.paperbarkSapling,
				new Object[] { Items.paper, new ItemStack(Blocks.sapling, 1, 3) });
		ModCrafting.addShapelessOreRecipe(ModBlocks.mapleSapling,
				new Object[] { ModItems.mapleSyrupItem, new ItemStack(Blocks.sapling, 1, 1) });

		// Crop
		for (int i = 0; i < cropName.length; i++) {
			ModCrafting.addShapelessOreRecipe(ModItems.seeds[i], new Object[] { ModItems.cropItems[i] });
		}

		// Candle
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_0, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 0) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_1, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 1) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_2, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 2) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_3, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 3) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_4, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 4) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_5, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 5) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_6, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 6) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_7, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 7) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_8, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 8) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_9, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 9) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_10, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 10) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_11, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 11) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_12, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 12) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_13, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 13) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_14, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 14) });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModBlocks.candle_15, 4),
				new Object[] { "listAllWax", Items.string, new ItemStack(Items.dye, 1, 15) });

		// Tools
		ModCrafting.addShapedOreRecipe(ModItems.bakewareItem,
				new Object[] { "A A", "AAA", " C ", 'A', Items.brick, 'C', ModItems.cuttingboardItem });
		ModCrafting.addShapedOreRecipe(ModItems.cuttingboardItem,
				new Object[] { " I", "SP", 'I', Items.iron_ingot, 'S', Items.stick, 'P', Blocks.planks });
		ModCrafting.addShapedOreRecipe(ModItems.juicerItem, new Object[] { "A", "B", "C", 'A', Blocks.stone, 'B',
				Blocks.stone_pressure_plate, 'C', ModItems.cuttingboardItem });
		ModCrafting.addShapedOreRecipe(ModItems.mixingBowlItem, new Object[] { "BAB", " B ", " C ", 'A', Items.stick,
				'B', Blocks.planks, 'C', ModItems.cuttingboardItem });
		ModCrafting.addShapedOreRecipe(ModItems.mortarAndPestleItem, new Object[] { "BAB", " B ", " C ", 'A',
				Items.stick, 'B', Blocks.stone, 'C', ModItems.cuttingboardItem });
		ModCrafting.addShapedOreRecipe(ModItems.potItem,
				new Object[] { "AA", "AA", " C", 'A', Items.iron_ingot, 'C', ModItems.cuttingboardItem });
		ModCrafting.addShapedOreRecipe(ModItems.saucepanItem, new Object[] { "AAB", "AA ", " C ", 'A', Items.iron_ingot,
				'B', Items.stick, 'C', ModItems.cuttingboardItem });
		ModCrafting.addShapedOreRecipe(ModItems.skilletItem, new Object[] { " AA", " AA", "BC ", 'A', Items.iron_ingot,
				'B', Items.stick, 'C', ModItems.cuttingboardItem });

		// Box Items
		boxCropItems = new ArrayList<Item>(Arrays.asList(ModItems.cropItems));

		boxSeedsItems = new ArrayList<Item>(Arrays.asList(ModItems.seeds));
		boxSeedsBoxItems = new ArrayList<Item>(Arrays.asList(ModItems.seedsBox));
		boxSeedsPacketItems = new ArrayList<Item>(Arrays.asList(ModItems.seedsPacket));

		boxSeedsListItems = new ArrayList<Item>(boxSeedsItems);
		boxSeedsListItems.addAll(boxSeedsBoxItems);
		boxSeedsListItems.addAll(boxSeedsPacketItems);

		boxTempFruitsItems = new ArrayList<Item>(Arrays.asList(ModItems.temperateFruits));
		boxWarmFruitsItems = new ArrayList<Item>(Arrays.asList(ModItems.warmFruits));
		boxLogFruitsItems = new ArrayList<Item>(Arrays.asList(ModItems.logFruits));

		// Lucky Box
		luckyCropsBox = new BlockLuckyBox("luckyCropsBox", boxCropItems);
		luckySeedsBox = new BlockLuckyBox("luckySeedsBox", boxSeedsListItems);
		luckyTemperateFruitsBox = new BlockLuckyBox("luckyTemperateFruitsBox", boxTempFruitsItems);
		luckyWarmFruitsBox = new BlockLuckyBox("luckyWarmFruitsBox", boxWarmFruitsItems);
		luckyLogFruitsBox = new BlockLuckyBox("luckyLogFruitsBox", boxLogFruitsItems);

		ModBlocks.registerBlock(luckyCropsBox);
		ModBlocks.registerBlock(luckySeedsBox);
		ModBlocks.registerBlock(luckyTemperateFruitsBox);
		ModBlocks.registerBlock(luckyWarmFruitsBox);
		ModBlocks.registerBlock(luckyLogFruitsBox);

		// Lucky Box Recipes
		ModCrafting.addShapedOreRecipe(new ItemStack(luckyCropsBox, 1, 0), new Object[] { "SCS", "PXP", "SPS", 'C',
				Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', Items.wheat });
		ModCrafting.addShapedOreRecipe(new ItemStack(luckySeedsBox, 1, 0), new Object[] { "SCS", "PXP", "SPS", 'C',
				Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', Items.wheat_seeds });
		ModCrafting.addShapedOreRecipe(new ItemStack(luckyTemperateFruitsBox, 1, 0), new Object[] { "SCS", "PXP", "SPS",
				'C', Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', Items.apple });
		ModCrafting.addShapedOreRecipe(new ItemStack(luckyWarmFruitsBox, 1, 0), new Object[] { "SCS", "PXP", "SPS", 'C',
				Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', Items.potato });
		ModCrafting.addShapedOreRecipe(new ItemStack(luckyLogFruitsBox, 1, 0), new Object[] { "SCS", "PXP", "SPS", 'C',
				Blocks.chest, 'S', Items.stick, 'P', Blocks.planks, 'X', Blocks.log });

		// Other
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.salt),
				new Object[] { Blocks.stone, ModItems.saltItem });

		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.sunflowerSeedsItem, 2, 0),
				new Object[] { new ItemStack(Blocks.double_plant, 1, 0), new ItemStack(Blocks.double_plant, 1, 0) });

		if (Config.enableSaltFromWaterBucketRecipe) {
			ModCrafting.addShapelessOreRecipe(ModItems.saltItem,
					new Object[] { ModItems.potItem, ModItems.freshWaterItem });
		}

		ModCrafting.addShapelessOreRecipe(Items.sugar, new Object[] { ModItems.potItem, ModItems.honeyItem });

		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.freshWaterItem, Config.freshMilkFromBucket),
				new Object[] { Items.water_bucket });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.freshMilkItem, Config.freshWaterFromBucket),
				new Object[] { Items.milk_bucket });

		ModCrafting.addShapedOreRecipe(new ItemStack(Items.cake, 1), new Object[] { "AAA", "BEB", "CCC", 'A',
				"listAllMilk", 'B', ModItems.honeyItem, 'C', "flourEqualsWheat", 'E', "listAllEgg" });

		ModCrafting.addShapelessOreRecipe(Items.mushroom_stew,
				new Object[] { Items.bowl, "listAllMushroom", "listAllMushroom" });

		GameRegistry.addSmelting(ModItems.freshWaterItem, new ItemStack(ModItems.saltItem, 4, 0), 0.1F);

		GameRegistry.addSmelting(ModItems.doughItem, new ItemStack(Items.bread, 1, 0), 0.1F);
		GameRegistry.addSmelting(Items.bread, new ItemStack(ModItems.toastItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(Items.pumpkin_seeds, new ItemStack(ModItems.roastedPumpkinSeedsItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(Blocks.brown_mushroom, new ItemStack(ModItems.grilledMushroomItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(Blocks.red_mushroom, new ItemStack(ModItems.grilledMushroomItem, 1, 0), 0.1F);

		GameRegistry.addSmelting(ModItems.calamariRawItem, new ItemStack(ModItems.calamariCookedItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.muttonRawItem, new ItemStack(ModItems.muttonCookedItem, 1, 0), 0.1F);

		GameRegistry.addSmelting(ModItems.asparagusItem, new ItemStack(ModItems.grilledAsparagusItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.chestnutItem, new ItemStack(ModItems.roastedChestnutItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.coconutItem, new ItemStack(ModItems.toastedCoconutItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.coffeeBeanItem, new ItemStack(ModItems.coffeeItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.cornItem, new ItemStack(ModItems.popcornItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.eggplantItem, new ItemStack(ModItems.grilledEggplantItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.grapeItem, new ItemStack(ModItems.raisinsItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.sweetPotatoItem, new ItemStack(ModItems.bakedSweetPotatoItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.teaLeafItem, new ItemStack(ModItems.teaItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.vanillaBeanItem, new ItemStack(ModItems.vanillaItem, 1, 0), 0.1F);
		GameRegistry.addSmelting(ModItems.whiteMushroomItem, new ItemStack(ModItems.grilledMushroomItem, 1, 0), 0.1F);

		// Soda
		ModCrafting.addShapelessOreRecipe(ModItems.cherrySodaItem,
				new Object[] { ModItems.potItem, ModItems.bubblyWaterItem, Items.sugar, ModItems.cherryJuiceItem });
		ModCrafting.addShapelessOreRecipe(ModItems.colaSodaItem,
				new Object[] { ModItems.potItem, ModItems.bubblyWaterItem, Items.sugar, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.gingerSodaItem,
				new Object[] { ModItems.potItem, ModItems.bubblyWaterItem, Items.sugar, ModItems.gingerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grapefruitSodaItem,
				new Object[] { ModItems.potItem, ModItems.bubblyWaterItem, Items.sugar, ModItems.grapefruitJuiceItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grapeSodaItem,
				new Object[] { ModItems.potItem, ModItems.bubblyWaterItem, Items.sugar, ModItems.grapeJuiceItem });
		ModCrafting.addShapelessOreRecipe(ModItems.lemonLimeSodaItem, new Object[] { ModItems.potItem,
				ModItems.bubblyWaterItem, Items.sugar, ModItems.lemonItem, ModItems.limeJuiceItem });
		ModCrafting.addShapelessOreRecipe(ModItems.orangeSodaItem,
				new Object[] { ModItems.potItem, ModItems.bubblyWaterItem, Items.sugar, ModItems.orangeJuiceItem });
		ModCrafting.addShapelessOreRecipe(ModItems.rootbeerSodaItem,
				new Object[] { ModItems.potItem, ModItems.bubblyWaterItem, Items.sugar, ModItems.edibleRootItem });
		ModCrafting.addShapelessOreRecipe(ModItems.strawberrySodaItem,
				new Object[] { ModItems.potItem, ModItems.bubblyWaterItem, Items.sugar, ModItems.strawberryJuiceItem });

		// Juice
		ModCrafting.addShapelessOreRecipe(ModItems.appleJuiceItem, new Object[] { Items.apple, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.apricotJuiceItem,
				new Object[] { ModItems.apricotItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.blackberryJuiceItem,
				new Object[] { ModItems.blackberryItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.blueberryJuiceItem,
				new Object[] { ModItems.blueberryItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cactusFruitJuiceItem,
				new Object[] { ModItems.cactusFruitItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.carrotJuiceItem, new Object[] { Items.carrot, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cherryJuiceItem,
				new Object[] { ModItems.cherryItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cranberryJuiceItem,
				new Object[] { ModItems.cranberryItem, Items.sugar, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.figJuiceItem,
				new Object[] { ModItems.figItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grapefruitJuiceItem,
				new Object[] { ModItems.grapefruitItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grapeJuiceItem,
				new Object[] { ModItems.grapeItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.kiwiJuiceItem,
				new Object[] { ModItems.kiwiItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.limeJuiceItem,
				new Object[] { ModItems.limeItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mangoJuiceItem,
				new Object[] { ModItems.mangoItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.melonJuiceItem, new Object[] { Items.melon, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.orangeJuiceItem,
				new Object[] { ModItems.orangeItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.papayaJuiceItem,
				new Object[] { ModItems.papayaItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.peachJuiceItem,
				new Object[] { ModItems.peachItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pearJuiceItem,
				new Object[] { ModItems.pearItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.persimmonJuiceItem,
				new Object[] { ModItems.persimmonItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.plumJuiceItem,
				new Object[] { ModItems.plumItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pomegranateJuiceItem,
				new Object[] { ModItems.pomegranateItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.raspberryJuiceItem,
				new Object[] { ModItems.raspberryItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.starfruitJuiceItem,
				new Object[] { ModItems.starfruitItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.strawberryJuiceItem,
				new Object[] { ModItems.strawberryItem, ModItems.juicerItem });

		// Jelly
		ModCrafting.addShapelessOreRecipe(ModItems.appleJellyItem,
				new Object[] { Items.apple, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.apricotJellyItem,
				new Object[] { ModItems.apricotItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.blackberryJellyItem,
				new Object[] { ModItems.blackberryItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.blueberryJellyItem,
				new Object[] { ModItems.blueberryItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.cherryJellyItem,
				new Object[] { ModItems.cherryItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.cranberryJellyItem,
				new Object[] { ModItems.cranberryItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.figJellyItem,
				new Object[] { ModItems.figItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.grapefruitJellyItem,
				new Object[] { ModItems.grapefruitItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.grapeJellyItem,
				new Object[] { ModItems.grapeItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.kiwiJellyItem,
				new Object[] { ModItems.kiwiItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.lemonJellyItem,
				new Object[] { ModItems.lemonItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.limeJellyItem,
				new Object[] { ModItems.limeItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.mangoJellyItem,
				new Object[] { ModItems.mangoItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.orangeJellyItem,
				new Object[] { ModItems.orangeItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.papayaJellyItem,
				new Object[] { ModItems.papayaItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.peachJellyItem,
				new Object[] { ModItems.peachItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.persimmonJellyItem,
				new Object[] { ModItems.persimmonItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.pomegranateJellyItem,
				new Object[] { ModItems.pomegranateItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.raspberryJellyItem,
				new Object[] { ModItems.raspberryItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.starfruitJellyItem,
				new Object[] { ModItems.starfruitItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.strawberryJellyItem,
				new Object[] { ModItems.strawberryItem, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.watermelonJellyItem,
				new Object[] { Items.melon, ModItems.saucepanItem, ModItems.juicerItem, Items.sugar });

		// Smoothie
		ModCrafting.addShapelessOreRecipe(ModItems.apricotSmoothieItem,
				new Object[] { ModItems.apricotItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.bananaSmoothieItem,
				new Object[] { ModItems.bananaItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.blackberrySmoothieItem,
				new Object[] { ModItems.blackberryItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.blueberrySmoothieItem,
				new Object[] { ModItems.blueberryItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.cherrySmoothieItem,
				new Object[] { ModItems.cherryItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.figSmoothieItem,
				new Object[] { ModItems.figItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.grapefruitSmoothieItem,
				new Object[] { ModItems.grapefruitItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.kiwiSmoothieItem,
				new Object[] { ModItems.kiwiItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.lemonSmoothieItem,
				new Object[] { ModItems.lemonItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.limeSmoothieItem,
				new Object[] { ModItems.limeItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.mangoSmoothieItem,
				new Object[] { ModItems.mangoItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.melonSmoothieItem,
				new Object[] { Items.melon, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.orangeSmoothieItem,
				new Object[] { ModItems.orangeItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.papayaSmoothieItem,
				new Object[] { ModItems.papayaItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.peachSmoothieItem,
				new Object[] { ModItems.peachItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.persimmonSmoothieItem,
				new Object[] { ModItems.persimmonItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.pomegranateSmoothieItem,
				new Object[] { ModItems.pomegranateItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.raspberrySmoothieItem,
				new Object[] { ModItems.raspberryItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.starfruitSmoothieItem,
				new Object[] { ModItems.starfruitItem, ModItems.juicerItem, Items.snowball });
		ModCrafting.addShapelessOreRecipe(ModItems.strawberrySmoothieItem,
				new Object[] { ModItems.strawberryItem, ModItems.juicerItem, Items.snowball });

		// Yogurt
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.plainYogurtItem, 4),
				new Object[] { "listAllMilk", Items.leather });

		ModCrafting.addShapelessOreRecipe(ModItems.apricotYogurtItem,
				new Object[] { ModItems.apricotItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.appleYogurtItem,
				new Object[] { Items.apple, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.bananaYogurtItem,
				new Object[] { ModItems.bananaItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.blackberryYogurtItem,
				new Object[] { ModItems.blackberryItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.blueberryYogurtItem,
				new Object[] { ModItems.blueberryItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cherryYogurtItem,
				new Object[] { ModItems.cherryItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chocolateYogurtItem,
				new Object[] { ModItems.cocoaPowderItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.coconutYogurtItem,
				new Object[] { ModItems.coconutItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.figYogurtItem,
				new Object[] { ModItems.figItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grapefruitYogurtItem,
				new Object[] { ModItems.grapefruitItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grapeYogurtItem,
				new Object[] { ModItems.grapeItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.kiwiYogurtItem,
				new Object[] { ModItems.kiwiItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.lemonYogurtItem,
				new Object[] { ModItems.lemonItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.limeYogurtItem,
				new Object[] { ModItems.limeItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mangoYogurtItem,
				new Object[] { ModItems.mangoItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.melonYogurtItem,
				new Object[] { Items.melon, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.orangeYogurtItem,
				new Object[] { ModItems.orangeItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.papayaYogurtItem,
				new Object[] { ModItems.papayaItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.peachYogurtItem,
				new Object[] { ModItems.peachItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pearYogurtItem,
				new Object[] { ModItems.pearItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.persimmonYogurtItem,
				new Object[] { ModItems.persimmonItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pineappleYogurtItem,
				new Object[] { ModItems.pineappleItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.plumYogurtItem,
				new Object[] { ModItems.plumItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pomegranateYogurtItem,
				new Object[] { ModItems.pomegranateItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pumpkinYogurtItem,
				new Object[] { Blocks.pumpkin, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.raspberryYogurtItem,
				new Object[] { ModItems.raspberryItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.starfruitYogurtItem,
				new Object[] { ModItems.starfruitItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.strawberryYogurtItem,
				new Object[] { ModItems.strawberryItem, ModItems.plainYogurtItem });
		ModCrafting.addShapelessOreRecipe(ModItems.vanillaYogurtItem,
				new Object[] { ModItems.vanillaItem, ModItems.plainYogurtItem });

		// Sandwich
		ModCrafting.addShapelessOreRecipe(ModItems.chickenSandwichItem,
				new Object[] { ModItems.skilletItem, "listAllChickenRaw", Items.bread, ModItems.mayoItem });
		ModCrafting.addShapelessOreRecipe(ModItems.fishSandwichItem,
				new Object[] { ModItems.skilletItem, "listAllFishRaw", ModItems.mayoItem, Items.bread });
		ModCrafting.addShapelessOreRecipe(ModItems.leafyChickenSandwichItem,
				new Object[] { ModItems.chickenSandwichItem, ModItems.lettuceItem });
		ModCrafting.addShapelessOreRecipe(ModItems.leafyFishSandwichItem,
				new Object[] { ModItems.fishSandwichItem, ModItems.lettuceItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.toastSandwichItem, 2),
				new Object[] { ModItems.toastItem, ModItems.toastItem });

		// Jelly Sandwich
		ModCrafting.addShapelessOreRecipe(ModItems.appleJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.appleJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.apricotJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.apricotJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.blackberryJellySandwichItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.peanutButterItem, ModItems.blackberryJellyItem,
						ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.blueberryJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.blueberryJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cherryJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.cherryJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cranberryJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.cranberryJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.figJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.figJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grapefruitJellySandwichItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.peanutButterItem, ModItems.grapefruitJellyItem,
						ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.kiwiJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.kiwiJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.lemonJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.lemonJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.limeJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.limeJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mangoJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.mangoJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.orangeJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.orangeJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.papayaJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.papayaJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.peachJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.peachJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.persimmonJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.persimmonJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pomegranateJellySandwichItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.peanutButterItem, ModItems.pomegranateJellyItem,
						ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.raspberryJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.raspberryJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.starfruitJellySandwichItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.starfruitJellyItem, ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.strawberryJellySandwichItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.peanutButterItem, ModItems.strawberryJellyItem,
						ModItems.toastSandwichItem });
		ModCrafting.addShapelessOreRecipe(ModItems.watermelonJellySandwichItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.peanutButterItem, ModItems.watermelonJellyItem,
						ModItems.toastSandwichItem });

		// Soup
		ModCrafting.addShapelessOreRecipe(ModItems.asparagusSoupItem, new Object[] { ModItems.potItem,
				ModItems.asparagusItem, ModItems.onionItem, ModItems.butterItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.beetSoupItem,
				new Object[] { ModItems.potItem, ModItems.mixingBowlItem, ModItems.beetItem, ModItems.onionItem,
						ModItems.blackPepperItem, "listAllMilk" });
		ModCrafting.addShapelessOreRecipe(ModItems.cactusSoupItem,
				new Object[] { ModItems.potItem, Blocks.cactus, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.carrotSoupItem,
				new Object[] { ModItems.potItem, Items.carrot, "listAllReplaceHeavyCream", ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.celerySoupItem, new Object[] { ModItems.potItem, ModItems.celeryItem,
				ModItems.onionItem, Items.carrot, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chickenNoodleSoupItem, new Object[] { ModItems.potItem,
				"listAllChickenRaw", Items.carrot, ModItems.pastaItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.creamedBroccoliSoupItem,
				new Object[] { ModItems.potItem, ModItems.broccoliItem, Items.carrot, ModItems.flourItem,
						ModItems.blackPepperItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.creamOfAvocadoSoupItem,
				new Object[] { ModItems.potItem, ModItems.avocadoItem, "listAllReplaceHeavyCream", ModItems.limeItem,
						ModItems.spiceleafItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cucumberSoupItem, new Object[] { ModItems.potItem,
				ModItems.cucumberItem, ModItems.stockItem, "listAllReplaceHeavyCream" });
		ModCrafting.addShapelessOreRecipe(ModItems.gardenSoupItem, new Object[] { ModItems.potItem,
				ModItems.mixingBowlItem, ModItems.stockItem, "listAllVeggie", "listAllVeggie" });
		ModCrafting.addShapelessOreRecipe(ModItems.lambBarleySoupItem, new Object[] { ModItems.potItem,
				ModItems.stockItem, "listAllMuttonRaw", ModItems.onionItem, Items.carrot, ModItems.barleyItem });
		ModCrafting.addShapelessOreRecipe(ModItems.leekBaconSoupItem, new Object[] { ModItems.potItem,
				ModItems.leekItem, "listAllPorkCooked", Items.potato, "listAllReplaceHeavyCream" });
		ModCrafting.addShapelessOreRecipe(ModItems.oldWorldVeggieSoupItem, new Object[] { ModItems.potItem,
				ModItems.stockItem, ModItems.onionItem, ModItems.peasItem, ModItems.barleyItem });
		ModCrafting.addShapelessOreRecipe(ModItems.onionSoupItem,
				new Object[] { ModItems.potItem, ModItems.onionItem, ModItems.stockItem, ModItems.grilledCheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pumpkinSoupItem, new Object[] { ModItems.potItem, Blocks.pumpkin,
				"listAllReplaceHeavyCream", ModItems.stockItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.potatoSoupItem,
				new Object[] { ModItems.potItem, Items.potato, ModItems.saltItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.riceSoupItem,
				new Object[] { ModItems.potItem, ModItems.riceItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.seedSoupItem,
				new Object[] { ModItems.potItem, "listAllSeed", ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.spiderEyeSoupItem,
				new Object[] { ModItems.potItem, Items.spider_eye, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.splitPeaSoupItem, new Object[] { ModItems.potItem, ModItems.peasItem,
				"listAllPorkCooked", ModItems.blackPepperItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.tomatoSoupItem,
				new Object[] { ModItems.potItem, ModItems.tomatoItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.turnipSoupItem, new Object[] { ModItems.potItem, ModItems.turnipItem,
				Blocks.pumpkin, ModItems.butterItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.vegetableSoupItem,
				new Object[] { ModItems.potItem, Items.potato, Items.carrot, "listAllMushroom", ModItems.stockItem });

		// Pie
		ModCrafting.addShapelessOreRecipe(ModItems.applePieItem,
				new Object[] { ModItems.bakewareItem, Items.apple, Items.sugar, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.blueberryPieItem,
				new Object[] { ModItems.bakewareItem, ModItems.blueberryItem, ModItems.doughItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.cherryPieItem,
				new Object[] { ModItems.bakewareItem, ModItems.cherryItem, ModItems.doughItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.chickenPotPieItem, new Object[] { ModItems.bakewareItem,
				"listAllChickenRaw", Items.potato, Items.carrot, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.keylimePieItem, new Object[] { ModItems.bakewareItem,
				ModItems.limeItem, "listAllReplaceHeavyCream", Items.sugar, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pecanPieItem, new Object[] { ModItems.bakewareItem,
				ModItems.pecanItem, ModItems.doughItem, Items.sugar, ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.raspberryPieItem,
				new Object[] { ModItems.bakewareItem, ModItems.raspberryItem, Items.sugar, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.shepardsPieItem, new Object[] { ModItems.bakewareItem,
				"listAllMeatRaw", Items.potato, Items.carrot, ModItems.doughItem, ModItems.peasItem });
		ModCrafting.addShapelessOreRecipe(ModItems.strawberryPieItem,
				new Object[] { ModItems.bakewareItem, ModItems.strawberryItem, ModItems.doughItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.sweetPotatoPieItem, new Object[] { ModItems.bakewareItem,
				ModItems.sweetPotatoItem, ModItems.doughItem, ModItems.groundCinnamonItem, ModItems.marshmellowsItem });

		// Salad
		ModCrafting.addShapelessOreRecipe(ModItems.beetSaladItem, new Object[] { ModItems.mixingBowlItem,
				ModItems.beetItem, ModItems.lettuceItem, ModItems.vinegarItem, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.citrusSaladItem, new Object[] { ModItems.mixingBowlItem,
				ModItems.cuttingboardItem, "listAllCitrus", ModItems.lettuceItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cucumberSaladItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.cucumberItem, ModItems.springSaladItem });
		ModCrafting.addShapelessOreRecipe(ModItems.eggSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.boiledEggItem, ModItems.mayoItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.fruitSaladItem,
				new Object[] { ModItems.cuttingboardItem, "listAllFruit", "listAllFruit", ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grapeSaladItem,
				new Object[] { ModItems.grapeItem, ModItems.fruitSaladItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mixedSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.mixingBowlItem, "listAllVeggie", "listAllVeggie", ModItems.saladDressingItem });
		ModCrafting.addShapelessOreRecipe(ModItems.potatoSaladItem, new Object[] { ModItems.cuttingboardItem,
				Items.baked_potato, ModItems.mayoItem, ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, Items.carrot, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.onionItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.radishItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.cucumberItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.bellpepperItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.spiceleafItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.zucchiniItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.asparagusItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.broccoliItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.peasItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.tomatoItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.sunflowerSeedsItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.walnutItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.cauliflowerItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.springSaladItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.rhubarbItem, ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.strawberrySaladItem,
				new Object[] { ModItems.strawberryItem, ModItems.fruitSaladItem });
		ModCrafting.addShapelessOreRecipe(ModItems.summerRadishSaladItem, new Object[] { ModItems.mixingBowlItem,
				ModItems.radishItem, ModItems.onionItem, ModItems.cucumberItem, ModItems.vinegarItem });
		ModCrafting.addShapelessOreRecipe(ModItems.sunflowerBroccoliSaladItem,
				new Object[] { ModItems.mixingBowlItem, ModItems.sunflowerSeedsItem, ModItems.broccoliItem,
						ModItems.mayoItem, Items.sugar, "listAllPorkCooked" });

		// Cake
		ModCrafting.addShapelessOreRecipe(ModItems.carrotCakeItem,
				new Object[] { ModItems.bakewareItem, Items.carrot, Items.sugar, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.cheesecakeItem, 1), new Object[] {
				ModItems.bakewareItem, ModItems.flourItem, "listAllReplaceHeavyCream", Items.sugar, "listAllEgg" });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.cherryCheesecakeItem, 1),
				new Object[] { ModItems.cherryItem, ModItems.cheesecakeItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pineappleUpsidedownCakeItem, new Object[] { ModItems.bakewareItem,
				ModItems.pineappleItem, ModItems.doughItem, ModItems.cherryItem, ModItems.walnutItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chocolateSprinkleCakeItem,
				new Object[] { ModItems.bakewareItem, ModItems.cocoaPowderItem, Items.sugar, ModItems.doughItem,
						new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2),
						new ItemStack(Items.dye, 1, 11) });
		ModCrafting.addShapelessOreRecipe(ModItems.redVelvetCakeItem,
				new Object[] { ModItems.bakewareItem, "listAllMilk", ModItems.flourItem, "listAllReplaceHeavyCream",
						Items.sugar, "listAllEgg", new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1) });
		GameRegistry.addSmelting(ModItems.riceItem, new ItemStack(ModItems.riceCakeItem, 1, 0), 0.1F);

		ModCrafting.addShapelessOreRecipe(ModItems.doughItem, new Object[] { ModItems.mixingBowlItem,
				ModItems.freshWaterItem, ModItems.flourItem, ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pastaItem,
				new Object[] { ModItems.mixingBowlItem, ModItems.doughItem, ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.heavyCreamItem,
				new Object[] { "listAllMilk", ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cheeseItem,
				new Object[] { ModItems.potItem, "listAllMilk", ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.iceCreamItem, new Object[] { ModItems.potItem, "listAllMilk",
				ModItems.saltItem, Items.snowball, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grilledCheeseItem,
				new Object[] { ModItems.skilletItem, ModItems.toastItem, ModItems.butterItem, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.appleSauceItem,
				new Object[] { ModItems.potItem, Items.apple, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.caramelAppleItem,
				new Object[] { Items.apple, ModItems.caramelItem, Items.stick });
		ModCrafting.addShapelessOreRecipe(ModItems.pumpkinBreadItem,
				new Object[] { ModItems.bakewareItem, Blocks.pumpkin, Items.sugar, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.glazedCarrotsItem,
				new Object[] { ModItems.saucepanItem, Items.carrot, ModItems.butterItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.butteredPotatoItem,
				new Object[] { Items.baked_potato, ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.loadedBakedPotatoItem,
				new Object[] { ModItems.butteredPotatoItem, "listAllPorkCooked", ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mashedPotatoesItem,
				new Object[] { ModItems.butteredPotatoItem, ModItems.saltItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.friesItem,
				new Object[] { ModItems.bakewareItem, Items.potato, ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.stuffedMushroomItem,
				new Object[] { ModItems.bakewareItem, "listAllMushroom", ModItems.cheeseItem, ModItems.toastItem });
		ModCrafting.addShapelessOreRecipe(ModItems.stuffedMushroomItem,
				new Object[] { ModItems.bakewareItem, "listAllMushroom", ModItems.cheeseItem, ModItems.toastItem });
		ModCrafting.addShapelessOreRecipe(ModItems.stuffedMushroomItem,
				new Object[] { ModItems.bakewareItem, "listAllMushroom", ModItems.cheeseItem, ModItems.toastItem });
		ModCrafting.addShapelessOreRecipe(ModItems.grilledMushroomItem,
				new Object[] { ModItems.skilletItem, "listAllMushroom" });
		ModCrafting.addShapelessOreRecipe(ModItems.breadedPorkchopItem,
				new Object[] { ModItems.skilletItem, "listAllPorkRaw", ModItems.flourItem });
		ModCrafting.addShapelessOreRecipe(ModItems.hotdogItem,
				new Object[] { ModItems.potItem, "listAllPorkRaw", Items.bread });
		ModCrafting.addShapelessOreRecipe(ModItems.bakedHamItem,
				new Object[] { ModItems.bakewareItem, "listAllPorkRaw", Items.apple, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.hamburgerItem,
				new Object[] { ModItems.skilletItem, "listAllBeefRaw", ModItems.toastItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cheeseburgerItem,
				new Object[] { ModItems.hamburgerItem, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.baconCheeseburgerItem,
				new Object[] { ModItems.cheeseburgerItem, "listAllPorkCooked" });
		ModCrafting.addShapelessOreRecipe(ModItems.potRoastItem,
				new Object[] { ModItems.potItem, "listAllBeefRaw", Items.potato, Items.carrot, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.fishSticksItem,
				new Object[] { ModItems.bakewareItem, "listAllFishRaw", ModItems.flourItem });
		ModCrafting.addShapelessOreRecipe(ModItems.fishAndChipsItem,
				new Object[] { ModItems.fishSticksItem, ModItems.friesItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mayoItem, new Object[] { "listAllEgg", ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.friedEggItem, new Object[] { ModItems.skilletItem, "listAllEgg" });
		ModCrafting.addShapelessOreRecipe(ModItems.scrambledEggItem,
				new Object[] { ModItems.saucepanItem, "listAllEgg" });
		ModCrafting.addShapelessOreRecipe(ModItems.boiledEggItem, new Object[] { ModItems.potItem, "listAllEgg" });
		ModCrafting.addShapelessOreRecipe(ModItems.caramelItem, new Object[] { ModItems.saucepanItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.taffyItem,
				new Object[] { ModItems.saucepanItem, Items.sugar, ModItems.freshWaterItem, ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.zombieJerkyItem,
				new Object[] { Items.rotten_flesh, ModItems.saltItem, ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cocoaPowderItem,
				new Object[] { ModItems.mortarAndPestleItem, new ItemStack(Items.dye, 1, 3) });
		ModCrafting.addShapelessOreRecipe(ModItems.chocolateBarItem,
				new Object[] { ModItems.saucepanItem, ModItems.cocoaPowderItem, ModItems.butterItem, "listAllMilk" });
		ModCrafting.addShapelessOreRecipe(ModItems.hotChocolateItem,
				new Object[] { ModItems.cocoaPowderItem, "listAllMilk", ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chocolateIceCreamItem,
				new Object[] { "listAllReplaceIceCream", ModItems.cocoaPowderItem });

		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.stockItem, 3, 0),
				new Object[] { ModItems.potItem, Items.bone, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.stockItem, 3, 0),
				new Object[] { ModItems.potItem, "listAllMeatRaw", ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.stockItem, 3, 0),
				new Object[] { ModItems.potItem, "listAllVeggie", ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.spagettiItem, new Object[] { ModItems.saucepanItem,
				ModItems.tomatoItem, ModItems.pastaItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.spagettiAndMeatballsItem,
				new Object[] { ModItems.spagettiItem, "listAllBeefCooked" });
		ModCrafting.addShapelessOreRecipe(ModItems.ketchupItem,
				new Object[] { ModItems.tomatoItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chickenParmasanItem, new Object[] { ModItems.bakewareItem,
				"listAllChickenCooked", ModItems.tomatoItem, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pizzaItem, new Object[] { ModItems.bakewareItem, ModItems.doughItem,
				ModItems.tomatoItem, ModItems.cheeseItem, "listAllPorkRaw" });

		ModCrafting.addShapelessOreRecipe(ModItems.porkLettuceWrapItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.lettuceItem, "listAllPorkCooked" });
		ModCrafting.addShapelessOreRecipe(ModItems.fishLettuceWrapItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.lettuceItem, "listAllFishCooked" });
		ModCrafting.addShapelessOreRecipe(ModItems.bltItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.lettuceItem, ModItems.tomatoItem, "listAllPorkCooked", ModItems.toastItem });
		ModCrafting.addShapelessOreRecipe(ModItems.deluxeCheeseburgerItem,
				new Object[] { ModItems.cheeseburgerItem, ModItems.lettuceItem, ModItems.tomatoItem });
		ModCrafting.addShapelessOreRecipe(ModItems.delightedMealItem,
				new Object[] { ModItems.deluxeCheeseburgerItem, ModItems.friesItem, "listAllSmoothie" });
		ModCrafting.addShapelessOreRecipe(ModItems.delightedMealItem,
				new Object[] { ModItems.deluxeCheeseburgerItem, ModItems.zucchiniFriesItem, "listAllSmoothie" });

		ModCrafting.addShapelessOreRecipe(ModItems.potatoCakesItem,
				new Object[] { ModItems.skilletItem, ModItems.onionItem, Items.potato, ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.hashItem, new Object[] { ModItems.skilletItem, ModItems.onionItem,
				"listAllBeefCooked", Items.potato, ModItems.ketchupItem });
		ModCrafting.addShapelessOreRecipe(ModItems.braisedOnionsItem,
				new Object[] { ModItems.saucepanItem, ModItems.onionItem, ModItems.butterItem, ModItems.stockItem });

		ModCrafting.addShapelessOreRecipe(ModItems.heartyBreakfastItem, new Object[] { "listAllPorkCooked",
				ModItems.friedEggItem, ModItems.toastItem, ModItems.potatoCakesItem, "listAllJuice" });
		ModCrafting.addShapelessOreRecipe(ModItems.heartyBreakfastItem, new Object[] { "listAllPorkCooked",
				ModItems.friedEggItem, ModItems.toastItem, ModItems.potatoCakesItem, ModItems.chocolateMilkItem });

		ModCrafting.addShapelessOreRecipe(ModItems.cornOnTheCobItem,
				new Object[] { ModItems.cornItem, ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cornmealItem,
				new Object[] { ModItems.mortarAndPestleItem, ModItems.cornItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cornbreadItem,
				new Object[] { ModItems.skilletItem, ModItems.cornmealItem, "listAllEgg", "listAllMilk" });
		ModCrafting.addShapelessOreRecipe(ModItems.tortillaItem,
				new Object[] { ModItems.skilletItem, ModItems.cornmealItem, ModItems.freshWaterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.nachoesItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.tortillaItem, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.tacoItem,
				new Object[] { "listAllBeefCooked", ModItems.lettuceItem, ModItems.cheeseItem, ModItems.tortillaItem });
		ModCrafting.addShapelessOreRecipe(ModItems.fishTacoItem,
				new Object[] { "listAllFishCooked", ModItems.lettuceItem, ModItems.cheeseItem, ModItems.tortillaItem });
		ModCrafting.addShapelessOreRecipe(ModItems.creamedCornItem,
				new Object[] { ModItems.saucepanItem, ModItems.cornItem, ModItems.onionItem, ModItems.heavyCreamItem });

		ModCrafting.addShapelessOreRecipe(ModItems.chocolateStrawberryItem,
				new Object[] { ModItems.saucepanItem, ModItems.strawberryItem, ModItems.chocolateBarItem });

		ModCrafting.addShapelessOreRecipe(ModItems.peanutButterItem,
				new Object[] { ModItems.peanutItem, ModItems.juicerItem });

		ModCrafting.addShapelessOreRecipe(ModItems.trailMixItem,
				new Object[] { "listAllSeed", "listAllSeed", "listAllSeed", "listAllSeed", "listAllSeed", "listAllSeed",
						ModItems.raisinsItem, ModItems.chocolateBarItem });
		ModCrafting.addShapelessOreRecipe(ModItems.trailMixItem,
				new Object[] { ModItems.saltedSunflowerSeedsItem, ModItems.raisinsItem, ModItems.chocolateBarItem });
		ModCrafting.addShapelessOreRecipe(ModItems.trailMixItem,
				new Object[] { "listAllNut", "listAllNut", ModItems.raisinsItem, ModItems.chocolateBarItem });
		ModCrafting.addShapelessOreRecipe(ModItems.trailMixItem,
				new Object[] { ModItems.roastedPumpkinSeedsItem, ModItems.raisinsItem, ModItems.chocolateBarItem });

		ModCrafting.addShapelessOreRecipe(ModItems.PBAndJItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.peanutButterItem, ModItems.grapeJellyItem, Items.bread });
		ModCrafting.addShapelessOreRecipe(ModItems.peanutButterCookiesItem, new Object[] { ModItems.bakewareItem,
				ModItems.peanutButterItem, ModItems.flourItem, "listAllEgg", Items.sugar });

		ModCrafting.addShapelessOreRecipe(ModItems.vinegarItem,
				new Object[] { ModItems.potItem, ModItems.grapeJuiceItem });
		ModCrafting.addShapelessOreRecipe(ModItems.raisinCookiesItem, new Object[] { ModItems.bakewareItem,
				ModItems.flourItem, "listAllEgg", Items.sugar, ModItems.raisinsItem });

		ModCrafting.addShapelessOreRecipe(ModItems.picklesItem,
				new Object[] { ModItems.potItem, ModItems.cucumberItem, ModItems.saltItem, ModItems.vinegarItem });
		ModCrafting.addShapelessOreRecipe(ModItems.vegetarianLettuceWrapItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.cucumberItem, ModItems.lettuceItem, ModItems.tomatoItem });
		ModCrafting.addShapelessOreRecipe(ModItems.marinatedCucumbersItem, new Object[] { ModItems.potItem,
				ModItems.cucumberItem, ModItems.onionItem, Items.sugar, ModItems.vinegarItem });

		ModCrafting.addShapelessOreRecipe(ModItems.friedRiceItem, new Object[] { ModItems.skilletItem,
				ModItems.riceItem, Items.carrot, "listAllEgg", ModItems.onionItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mushroomRisottoItem,
				new Object[] { ModItems.bakewareItem, ModItems.riceItem, "listAllMushroom", ModItems.onionItem,
						ModItems.cheeseItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.curryItem,
				new Object[] { ModItems.saucepanItem, ModItems.riceItem, ModItems.saltItem, ModItems.chilipepperItem,
						ModItems.coconutMilkItem, ModItems.spiceleafItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.rainbowCurryItem,
				new Object[] { ModItems.skilletItem, ModItems.riceItem, Blocks.red_flower, Blocks.yellow_flower,
						new ItemStack(Items.dye, 1, 14), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 5),
						new ItemStack(Items.dye, 1, 4), ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.refriedBeansItem, new Object[] { ModItems.skilletItem,
				ModItems.beanItem, ModItems.onionItem, ModItems.butterItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.bakedBeansItem, new Object[] { ModItems.potItem, ModItems.beanItem,
				"listAllPorkCooked", Items.sugar, ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.beansAndRiceItem, new Object[] { ModItems.potItem, ModItems.beanItem,
				ModItems.riceItem, ModItems.onionItem, "listAllPorkCooked", ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.beansAndRiceItem, new Object[] { ModItems.potItem, ModItems.beanItem,
				ModItems.riceItem, ModItems.bellpepperItem, "listAllPorkCooked", ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.beansAndRiceItem, new Object[] { ModItems.potItem, ModItems.beanItem,
				ModItems.riceItem, ModItems.chilipepperItem, "listAllPorkCooked", ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.chiliItem, new Object[] { ModItems.potItem, ModItems.beanItem,
				ModItems.onionItem, "listAllBeefCooked", ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chiliItem, new Object[] { ModItems.potItem, ModItems.beanItem,
				ModItems.bellpepperItem, "listAllBeefCooked", ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chiliItem, new Object[] { ModItems.potItem, ModItems.beanItem,
				ModItems.chilipepperItem, "listAllBeefCooked", ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.beanBurritoItem, new Object[] { ModItems.skilletItem,
				ModItems.beanItem, ModItems.tortillaItem, ModItems.riceItem, ModItems.cheeseItem });

		ModCrafting.addShapelessOreRecipe(ModItems.stuffedPepperItem, new Object[] { ModItems.bakewareItem,
				ModItems.bellpepperItem, ModItems.tomatoItem, ModItems.riceItem });

		ModCrafting.addShapelessOreRecipe(ModItems.veggieStirfryItem,
				new Object[] { ModItems.skilletItem, ModItems.bellpepperItem, Items.carrot, ModItems.riceItem,
						ModItems.onionItem, ModItems.beanItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.veggieStirfryItem,
				new Object[] { ModItems.skilletItem, ModItems.bellpepperItem, Items.carrot, ModItems.riceItem,
						ModItems.onionItem, ModItems.chilipepperItem, ModItems.mixingBowlItem });
		ModCrafting.addShapelessOreRecipe(ModItems.veggieStirfryItem,
				new Object[] { ModItems.skilletItem, ModItems.bellpepperItem, Items.carrot, ModItems.riceItem,
						ModItems.onionItem, "listAllMushroom", ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.grilledSkewersItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.bellpepperItem, ModItems.onionItem, Items.carrot, Items.stick });
		ModCrafting.addShapelessOreRecipe(ModItems.supremePizzaItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.pizzaItem, ModItems.bellpepperItem, ModItems.onionItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.omeletItem,
				new Object[] { ModItems.skilletItem, "listAllEgg", ModItems.bellpepperItem, ModItems.onionItem });

		ModCrafting.addShapelessOreRecipe(ModItems.hotWingsItem, new Object[] { ModItems.skilletItem,
				ModItems.chilipepperItem, "listAllChickenCooked", ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chiliPoppersItem, new Object[] { ModItems.bakewareItem,
				ModItems.chilipepperItem, ModItems.flourItem, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.extremeChiliItem,
				new Object[] { ModItems.chiliItem, ModItems.chilipepperItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chiliChocolateItem,
				new Object[] { ModItems.mortarAndPestleItem, ModItems.chocolateBarItem, ModItems.chilipepperItem });

		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.lemonaideItem, 1),
				new Object[] { ModItems.lemonItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.lemonBarItem, 1),
				new Object[] { ModItems.bakewareItem, ModItems.lemonItem, ModItems.doughItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.fishDinnerItem, 1), new Object[] {
				ModItems.skilletItem, ModItems.lemonItem, ModItems.flourItem, "listAllFishRaw", ModItems.mayoItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.lemonMeringueItem, 1),
				new Object[] { ModItems.bakewareItem, ModItems.lemonItem, Items.sugar, ModItems.doughItem,
						"listAllReplaceHeavyCream" });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.candiedLemonItem, 1),
				new Object[] { ModItems.saucepanItem, ModItems.lemonItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.lemonChickenItem, 1),
				new Object[] { ModItems.bakewareItem, ModItems.lemonItem, "listAllChickenRaw", ModItems.butterItem });

		ModCrafting.addShapelessOreRecipe(ModItems.blueberryMuffinItem,
				new Object[] { ModItems.bakewareItem, ModItems.blueberryItem, ModItems.flourItem, "listAllEgg" });
		ModCrafting.addShapelessOreRecipe(ModItems.pancakesItem,
				new Object[] { ModItems.skilletItem, ModItems.flourItem, "listAllEgg", "listAllMilk" });
		ModCrafting.addShapelessOreRecipe(ModItems.blueberryPancakesItem,
				new Object[] { ModItems.blueberryItem, ModItems.pancakesItem });

		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.chocolateCherryItem, 1),
				new Object[] { ModItems.saucepanItem, ModItems.cherryItem, ModItems.chocolateBarItem });

		ModCrafting.addShapelessOreRecipe(ModItems.stuffedEggplantItem,
				new Object[] { ModItems.bakewareItem, ModItems.eggplantItem, ModItems.onionItem,
						ModItems.bellpepperItem, ModItems.butterItem, "listAllEgg" });
		ModCrafting.addShapelessOreRecipe(ModItems.stuffedEggplantItem,
				new Object[] { ModItems.bakewareItem, ModItems.eggplantItem, ModItems.garlicItem });
		ModCrafting.addShapelessOreRecipe(ModItems.eggplantParmItem,
				new Object[] { ModItems.bakewareItem, ModItems.eggplantItem, ModItems.tomatoItem, ModItems.pastaItem,
						ModItems.cheeseItem, ModItems.mixingBowlItem });

		ModCrafting.addShapelessOreRecipe(ModItems.raspberryIcedTeaItem,
				new Object[] { ModItems.teaLeafItem, Items.snowball, ModItems.raspberryItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chaiTeaItem,
				new Object[] { ModItems.teaLeafItem, ModItems.groundCinnamonItem, ModItems.blackPepperItem });

		ModCrafting.addShapelessOreRecipe(ModItems.espressoItem, new Object[] { ModItems.coffeeBeanItem,
				ModItems.coffeeBeanItem, ModItems.coffeeBeanItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.coffeeConLecheItem,
				new Object[] { ModItems.espressoItem, "listAllMilk", ModItems.groundCinnamonItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mochaIceCreamItem,
				new Object[] { "listAllReplaceIceCream", ModItems.coffeeBeanItem, ModItems.cocoaPowderItem });

		ModCrafting.addShapelessOreRecipe(ModItems.pickledBeetsItem,
				new Object[] { ModItems.potItem, ModItems.beetItem, ModItems.vinegarItem, ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.bakedBeetsItem, new Object[] { ModItems.bakewareItem,
				ModItems.mixingBowlItem, ModItems.beetItem, ModItems.butterItem, ModItems.blackPepperItem });

		ModCrafting.addShapelessOreRecipe(ModItems.broccoliMacItem, new Object[] { ModItems.potItem,
				ModItems.mixingBowlItem, ModItems.broccoliItem, ModItems.pastaItem, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.broccoliNDipItem, new Object[] { ModItems.mixingBowlItem,
				ModItems.broccoliItem, ModItems.onionItem, "listAllReplaceHeavyCream" });

		ModCrafting.addShapelessOreRecipe(ModItems.candiedSweetPotatoesItem, new Object[] { ModItems.saucepanItem,
				ModItems.sweetPotatoItem, Items.sugar, ModItems.groundCinnamonItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mashedSweetPotatoesItem,
				new Object[] { ModItems.saucepanItem, ModItems.sweetPotatoItem, ModItems.butterItem });

		ModCrafting.addShapelessOreRecipe(ModItems.steamedPeasItem,
				new Object[] { ModItems.potItem, ModItems.peasItem, ModItems.freshWaterItem, ModItems.saltItem });

		ModCrafting.addShapelessOreRecipe(ModItems.pineappleHamItem, new Object[] { ModItems.bakewareItem,
				ModItems.pineappleItem, "listAllPorkRaw", ModItems.cherryItem, Items.sugar });

		ModCrafting.addShapelessOreRecipe(ModItems.roastedRootVeggieMedleyItem, new Object[] { ModItems.bakewareItem,
				ModItems.turnipItem, Items.carrot, ModItems.onionItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.roastedRootVeggieMedleyItem, new Object[] { ModItems.bakewareItem,
				Blocks.pumpkin, Items.carrot, ModItems.onionItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.roastedRootVeggieMedleyItem, new Object[] { ModItems.bakewareItem,
				Items.potato, Items.carrot, ModItems.onionItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.roastedRootVeggieMedleyItem, new Object[] { ModItems.bakewareItem,
				ModItems.sweetPotatoItem, Items.carrot, ModItems.onionItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.roastedRootVeggieMedleyItem, new Object[] { ModItems.bakewareItem,
				ModItems.radishItem, Items.carrot, ModItems.onionItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.roastedRootVeggieMedleyItem, new Object[] { ModItems.bakewareItem,
				ModItems.parsnipItem, Items.carrot, ModItems.onionItem, ModItems.spiceleafItem });

		ModCrafting.addShapelessOreRecipe(ModItems.bakedTurnipsItem,
				new Object[] { ModItems.bakewareItem, ModItems.mixingBowlItem, ModItems.turnipItem, ModItems.butterItem,
						ModItems.saltItem, ModItems.blackPepperItem });

		ModCrafting.addShapelessOreRecipe(ModItems.gingerBreadItem,
				new Object[] { ModItems.bakewareItem, ModItems.gingerItem, ModItems.flourItem, ModItems.butterItem,
						"listAllEgg", ModItems.groundCinnamonItem });
		ModCrafting.addShapelessOreRecipe(ModItems.gingerSnapsItem,
				new Object[] { ModItems.bakewareItem, ModItems.gingerItem, ModItems.flourItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.candiedGingerItem,
				new Object[] { ModItems.saucepanItem, ModItems.gingerItem, Items.sugar });

		ModCrafting.addShapelessOreRecipe(ModItems.mustardItem,
				new Object[] { ModItems.mustardSeedsItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.softPretzelAndMustardItem,
				new Object[] { ModItems.mixingBowlItem, ModItems.softPretzelItem, ModItems.mustardItem });
		ModCrafting.addShapelessOreRecipe(ModItems.spicyMustardPorkItem, new Object[] { ModItems.saucepanItem,
				ModItems.mustardItem, "listAllPorkRaw", ModItems.blackPepperItem });

		ModCrafting.addShapelessOreRecipe(ModItems.spicyMustardPorkItem,
				new Object[] { ModItems.saucepanItem, ModItems.mustardItem, "listAllPorkRaw", ModItems.garlicItem });
		ModCrafting.addShapelessOreRecipe(ModItems.spicyMustardPorkItem,
				new Object[] { ModItems.saucepanItem, ModItems.mustardItem, "listAllPorkRaw", ModItems.saltItem });

		ModCrafting.addShapelessOreRecipe(ModItems.spicyGreensItem,
				new Object[] { ModItems.saucepanItem, ModItems.mixingBowlItem, ModItems.mustardItem,
						ModItems.lettuceItem, ModItems.blackPepperItem, ModItems.garlicItem, ModItems.oliveOilItem,
						ModItems.onionItem });
		ModCrafting.addShapelessOreRecipe(ModItems.spicyGreensItem,
				new Object[] { ModItems.saucepanItem, ModItems.mixingBowlItem, ModItems.mustardItem,
						ModItems.broccoliItem, ModItems.blackPepperItem, ModItems.garlicItem, ModItems.oliveOilItem,
						ModItems.onionItem });
		ModCrafting.addShapelessOreRecipe(ModItems.spicyGreensItem,
				new Object[] { ModItems.saucepanItem, ModItems.mixingBowlItem, ModItems.mustardItem, ModItems.peasItem,
						ModItems.blackPepperItem, ModItems.garlicItem, ModItems.oliveOilItem, ModItems.onionItem });

		ModCrafting.addShapelessOreRecipe(ModItems.garlicBreadItem,
				new Object[] { ModItems.garlicItem, ModItems.toastItem, ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.garlicMashedPotatoesItem,
				new Object[] { ModItems.mashedPotatoesItem, ModItems.garlicItem });
		ModCrafting.addShapelessOreRecipe(ModItems.garlicChickenItem,
				new Object[] { ModItems.bakewareItem, ModItems.garlicItem, ModItems.garlicItem, ModItems.garlicItem,
						ModItems.oliveOilItem, "listAllChickenRaw" });

		ModCrafting.addShapelessOreRecipe(ModItems.summerSquashWithRadishItem,
				new Object[] { ModItems.mixingBowlItem, ModItems.radishItem, ModItems.zucchiniItem, Blocks.pumpkin,
						ModItems.spiceleafItem, ModItems.oliveOilItem });

		ModCrafting.addShapelessOreRecipe(ModItems.celeryAndPeanutButterItem,
				new Object[] { ModItems.celeryItem, ModItems.peanutButterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chickenCeleryCasseroleItem, new Object[] { ModItems.bakewareItem,
				ModItems.celeryItem, "listAllChickenRaw", ModItems.garlicItem, Items.carrot, "listAllMushroom" });
		ModCrafting.addShapelessOreRecipe(ModItems.peasAndCeleryItem, new Object[] { ModItems.mixingBowlItem,
				ModItems.celeryItem, ModItems.peasItem, ModItems.lemonItem, ModItems.blackPepperItem });

		ModCrafting.addShapelessOreRecipe(ModItems.zucchiniBreadItem, new Object[] { ModItems.bakewareItem,
				ModItems.zucchiniItem, ModItems.doughItem, ModItems.groundCinnamonItem, ModItems.walnutItem });
		ModCrafting.addShapelessOreRecipe(ModItems.zucchiniFriesItem, new Object[] { ModItems.bakewareItem,
				ModItems.zucchiniItem, ModItems.toastItem, ModItems.cheeseItem, "listAllEgg" });
		ModCrafting.addShapelessOreRecipe(ModItems.zestyZucchiniItem,
				new Object[] { ModItems.bakewareItem, ModItems.zucchiniItem, ModItems.pastaItem,
						ModItems.chilipepperItem, ModItems.garlicItem, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.zucchiniBakeItem,
				new Object[] { ModItems.bakewareItem, ModItems.zucchiniItem, ModItems.tomatoItem, ModItems.toastItem,
						ModItems.cornItem, ModItems.cheeseItem });

		ModCrafting.addShapelessOreRecipe(ModItems.asparagusQuicheItem, new Object[] { ModItems.skilletItem,
				ModItems.asparagusItem, "listAllEgg", ModItems.onionItem, ModItems.cheeseItem });

		ModCrafting.addShapelessOreRecipe(ModItems.walnutRaisinBreadItem, new Object[] { ModItems.bakewareItem,
				ModItems.walnutItem, ModItems.raisinsItem, ModItems.doughItem, ModItems.groundCinnamonItem });
		ModCrafting.addShapelessOreRecipe(ModItems.candiedWalnutsItem, new Object[] { ModItems.saucepanItem,
				ModItems.walnutItem, ModItems.vanillaItem, ModItems.groundCinnamonItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.brownieItem,
				new Object[] { ModItems.bakewareItem, ModItems.walnutItem, ModItems.flourItem, "listAllEgg",
						ModItems.butterItem, Items.sugar, ModItems.cocoaPowderItem, ModItems.vanillaItem });

		ModCrafting.addShapelessOreRecipe(ModItems.guacamoleItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.mixingBowlItem, ModItems.avocadoItem,
						ModItems.chilipepperItem, ModItems.tomatoItem, ModItems.onionItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.avocadoBurritoItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.avocadoItem, ModItems.tortillaItem, ModItems.cheeseItem, "listAllChickenCooked" });
		ModCrafting.addShapelessOreRecipe(ModItems.avocadoBurritoItem, new Object[] { ModItems.cuttingboardItem,
				ModItems.avocadoItem, ModItems.tortillaItem, ModItems.cheeseItem, "listAllPorkCooked" });

		ModCrafting.addShapelessOreRecipe(ModItems.poachedPearItem, new Object[] { ModItems.saucepanItem,
				ModItems.mixingBowlItem, ModItems.pearItem, ModItems.vanillaItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.fruitCrumbleItem, new Object[] { ModItems.bakewareItem,
				"listAllFruit", ModItems.groundCinnamonItem, ModItems.flourItem, ModItems.butterItem });

		ModCrafting.addShapelessOreRecipe(ModItems.bananaSplitItem, new Object[] { ModItems.bananaItem,
				ModItems.cocoaPowderItem, ModItems.cherryItem, "listAllReplaceIceCream", ModItems.strawberryItem });
		ModCrafting.addShapelessOreRecipe(ModItems.bananaNutBreadItem, new Object[] { ModItems.bakewareItem,
				ModItems.bananaItem, ModItems.flourItem, ModItems.walnutItem, "listAllMilk", ModItems.saltItem });

		ModCrafting.addShapelessOreRecipe(ModItems.coconutMilkItem,
				new Object[] { ModItems.coconutItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chickenCurryItem,
				new Object[] { ModItems.potItem, ModItems.coconutItem, ModItems.plainYogurtItem, "listAllChickenRaw",
						ModItems.spiceleafItem, ModItems.chilipepperItem, ModItems.riceItem,
						ModItems.groundCinnamonItem, ModItems.garlicItem });
		ModCrafting.addShapelessOreRecipe(ModItems.coconutShrimpItem, new Object[] { ModItems.skilletItem,
				ModItems.coconutItem, "listAllEgg", ModItems.flourItem, "listAllFishRaw", ModItems.oliveOilItem });

		ModCrafting.addShapelessOreRecipe(ModItems.orangeChickenItem,
				new Object[] { ModItems.saucepanItem, ModItems.mixingBowlItem, ModItems.orangeItem, "listAllChickenRaw",
						Items.sugar, ModItems.riceItem, ModItems.broccoliItem });

		ModCrafting.addShapelessOreRecipe(ModItems.peachCobblerItem,
				new Object[] { ModItems.bakewareItem, ModItems.peachItem, Items.sugar, ModItems.doughItem });

		ModCrafting.addShapelessOreRecipe(ModItems.cinnamonRollItem,
				new Object[] { ModItems.bakewareItem, ModItems.groundCinnamonItem, Items.sugar, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.frenchToastItem, new Object[] { ModItems.skilletItem,
				ModItems.groundCinnamonItem, ModItems.toastItem, Items.sugar, "listAllEgg" });

		ModCrafting.addShapelessOreRecipe(ModItems.marshmellowsItem,
				new Object[] { ModItems.potItem, Items.sugar, ModItems.freshWaterItem, "listAllEgg" });
		ModCrafting.addShapelessOreRecipe(ModItems.donutItem,
				new Object[] { ModItems.potItem, ModItems.doughItem, ModItems.oliveOilItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chocolateDonutItem,
				new Object[] { ModItems.donutItem, ModItems.chocolateBarItem });
		ModCrafting.addShapelessOreRecipe(ModItems.powderedDonutItem, new Object[] { ModItems.donutItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.jellyDonutItem,
				new Object[] { ModItems.donutItem, ModItems.grapeJellyItem });
		ModCrafting.addShapelessOreRecipe(ModItems.frostedDonutItem, new Object[] { ModItems.donutItem, Items.sugar,
				new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 11) });

		ModCrafting.addShapelessOreRecipe(ModItems.wafflesItem, new Object[] { ModItems.skilletItem, ModItems.flourItem,
				"listAllEgg", "listAllMilk", ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.softPretzelItem,
				new Object[] { ModItems.bakewareItem, ModItems.doughItem, ModItems.butterItem, ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.jellybeansItem, new Object[] { ModItems.saucepanItem, Items.sugar,
				new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11) });
		ModCrafting.addShapelessOreRecipe(ModItems.biscuitItem,
				new Object[] { ModItems.bakewareItem, ModItems.doughItem, ModItems.butterItem });

		ModCrafting.addShapelessOreRecipe(ModItems.creamCookieItem, new Object[] { ModItems.bakewareItem,
				ModItems.doughItem, "listAllReplaceHeavyCream", Items.sugar, ModItems.cocoaPowderItem });
		ModCrafting.addShapelessOreRecipe(ModItems.jaffaItem, new Object[] { ModItems.bakewareItem, "listAllEgg",
				Items.sugar, ModItems.flourItem, ModItems.chocolateBarItem, ModItems.orangeItem });
		ModCrafting.addShapelessOreRecipe(ModItems.friedChickenItem,
				new Object[] { ModItems.potItem, "listAllChickenRaw", ModItems.flourItem, ModItems.spiceleafItem,
						ModItems.blackPepperItem, ModItems.oliveOilItem });
		ModCrafting.addShapelessOreRecipe(ModItems.footlongItem, new Object[] { ModItems.cuttingboardItem, Items.bread,
				"listAllBeefCooked", ModItems.lettuceItem, ModItems.tomatoItem, ModItems.mayoItem });
		ModCrafting.addShapelessOreRecipe(ModItems.footlongItem, new Object[] { ModItems.cuttingboardItem, Items.bread,
				"listAllChickenCooked", ModItems.lettuceItem, ModItems.tomatoItem, ModItems.mayoItem });
		ModCrafting.addShapelessOreRecipe(ModItems.footlongItem, new Object[] { ModItems.cuttingboardItem, Items.bread,
				"listAllPorkCooked", ModItems.lettuceItem, ModItems.tomatoItem, ModItems.mayoItem });

		ModCrafting.addShapelessOreRecipe(ModItems.blackberryCobblerItem,
				new Object[] { ModItems.blackberryItem, ModItems.bakewareItem, Items.sugar, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chocolateMilkItem,
				new Object[] { "listAllMilk", ModItems.cocoaPowderItem });

		ModCrafting.addShapelessOreRecipe(ModItems.cinnamonSugarDonutItem,
				new Object[] { ModItems.donutItem, Items.sugar, ModItems.groundCinnamonItem });

		ModCrafting.addShapelessOreRecipe(ModItems.saltedSunflowerSeedsItem,
				new Object[] { ModItems.sunflowerSeedsItem, ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.sunflowerWheatRollsItem,
				new Object[] { ModItems.bakewareItem, ModItems.sunflowerSeedsItem, ModItems.flourItem, "listAllEgg",
						ModItems.saltItem, ModItems.oliveOilItem });

		ModCrafting.addShapelessOreRecipe(ModItems.cranberrySauceItem,
				new Object[] { ModItems.saucepanItem, ModItems.mixingBowlItem, ModItems.cranberryItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.cranberryBarItem,
				new Object[] { ModItems.bakewareItem, ModItems.cranberryItem, Items.sugar, ModItems.doughItem });

		ModCrafting.addShapelessOreRecipe(ModItems.peppermintItem,
				new Object[] { ModItems.saucepanItem, ModItems.spiceleafItem, Items.sugar });

		ModCrafting.addShapelessOreRecipe(ModItems.blackPepperItem,
				new Object[] { ModItems.peppercornItem, ModItems.mortarAndPestleItem });
		ModCrafting.addShapelessOreRecipe(ModItems.groundCinnamonItem,
				new Object[] { ModItems.cinnamonItem, ModItems.mortarAndPestleItem });
		ModCrafting.addShapelessOreRecipe(ModItems.groundNutmegItem,
				new Object[] { ModItems.nutmegItem, ModItems.mortarAndPestleItem });
		ModCrafting.addShapelessOreRecipe(ModItems.oliveOilItem,
				new Object[] { ModItems.oliveItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.oliveOilItem,
				new Object[] { ModItems.sunflowerSeedsItem, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.oliveOilItem,
				new Object[] { ModItems.walnutItem, ModItems.juicerItem });

		ModCrafting.addShapelessOreRecipe(ModItems.baklavaItem, new Object[] { ModItems.bakewareItem,
				ModItems.doughItem, ModItems.walnutItem, ModItems.cinnamonItem, ModItems.butterItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.gummyBearsItem, new Object[] { ModItems.saucepanItem, Items.sugar,
				new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 2) });
		ModCrafting.addShapelessOreRecipe(ModItems.baconMushroomBurgerItem,
				new Object[] { ModItems.baconCheeseburgerItem, "listAllMushroom" });
		ModCrafting.addShapelessOreRecipe(ModItems.baconMushroomBurgerItem,
				new Object[] { ModItems.baconCheeseburgerItem, ModItems.whiteMushroomItem });
		ModCrafting.addShapelessOreRecipe(ModItems.fruitPunchItem,
				new Object[] { "listAllFruit", Items.sugar, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.meatyStewItem, new Object[] { ModItems.potItem,
				ModItems.mixingBowlItem, "listAllMeatRaw", ModItems.flourItem, ModItems.stockItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pinacoladaItem,
				new Object[] { ModItems.juicerItem, ModItems.coconutItem, ModItems.pineappleItem });
		ModCrafting.addShapelessOreRecipe(ModItems.saladDressingItem,
				new Object[] { ModItems.juicerItem, ModItems.oliveOilItem, ModItems.saltItem, ModItems.vinegarItem });
		ModCrafting.addShapelessOreRecipe(ModItems.saladDressingItem, new Object[] { ModItems.juicerItem,
				ModItems.mayoItem, ModItems.spiceleafItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.eggNogItem, new Object[] { ModItems.juicerItem, "listAllEgg",
				ModItems.groundNutmegItem, ModItems.cinnamonItem, "listAllReplaceHeavyCream" });
		ModCrafting.addShapelessOreRecipe(ModItems.custardItem, new Object[] { ModItems.saucepanItem, "listAllEgg",
				ModItems.groundNutmegItem, ModItems.cinnamonItem, "listAllReplaceHeavyCream" });
		ModCrafting.addShapelessOreRecipe(ModItems.sushiItem,
				new Object[] { ModItems.cuttingboardItem, "listAllFishRaw", ModItems.seaweedItem, ModItems.riceItem });

		ModCrafting.addShapelessOreRecipe(ModItems.caramelIceCreamItem,
				new Object[] { ModItems.mixingBowlItem, "listAllReplaceIceCream", ModItems.caramelItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mintChocolateChipIceCreamItem, new Object[] {
				ModItems.mixingBowlItem, "listAllReplaceIceCream", ModItems.spiceleafItem, ModItems.chocolateBarItem });
		ModCrafting.addShapelessOreRecipe(ModItems.strawberryIceCreamItem,
				new Object[] { ModItems.mixingBowlItem, "listAllReplaceIceCream", ModItems.strawberryItem });
		ModCrafting.addShapelessOreRecipe(ModItems.vanillaIceCreamItem,
				new Object[] { ModItems.mixingBowlItem, "listAllReplaceIceCream", ModItems.vanillaItem });

		ModCrafting.addShapelessOreRecipe(ModItems.edibleRootItem,
				new Object[] { ModItems.cuttingboardItem, ModItems.spiceleafItem });

		ModCrafting.addShapelessOreRecipe(ModItems.gingerChickenItem, new Object[] { ModItems.saucepanItem,
				"listAllChickenRaw", ModItems.gingerItem, ModItems.scallionItem, ModItems.honeyItem });

		ModCrafting.addShapelessOreRecipe(ModItems.spiceBunItem,
				new Object[] { ModItems.bakewareItem, ModItems.flourItem, "listAllMilk", ModItems.groundNutmegItem,
						ModItems.groundCinnamonItem, ModItems.raisinsItem });
		ModCrafting.addShapelessOreRecipe(ModItems.gingeredRhubarbTartItem, new Object[] { ModItems.bakewareItem,
				ModItems.doughItem, ModItems.rhubarbItem, ModItems.gingerItem, Items.sugar, "listAllEgg" });

		ModCrafting.addShapelessOreRecipe(ModItems.honeyLemonLambItem, new Object[] { ModItems.bakewareItem,
				"listAllMuttonRaw", ModItems.lemonItem, ModItems.mustardItem, ModItems.honeyItem });

		ModCrafting.addShapelessOreRecipe(ModItems.pumpkinOatSconesItem, new Object[] { ModItems.bakewareItem,
				ModItems.flourItem, ModItems.oatsItem, Blocks.pumpkin, ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.beefJerkyItem, new Object[] { "listAllBeefRaw", ModItems.saltItem });
		ModCrafting.addShapelessOreRecipe(ModItems.ovenRoastedCauliflowerItem, new Object[] { ModItems.bakewareItem,
				ModItems.cauliflowerItem, ModItems.oliveOilItem, ModItems.garlicItem, ModItems.lemonItem });
		ModCrafting.addShapelessOreRecipe(ModItems.herbButterParsnipsItem, new Object[] { ModItems.saucepanItem,
				ModItems.parsnipItem, ModItems.butterItem, ModItems.spiceleafItem });
		ModCrafting.addShapelessOreRecipe(ModItems.scallionBakedPotatoItem,
				new Object[] { Items.baked_potato, ModItems.scallionItem, "listAllReplaceHeavyCream" });

		ModCrafting.addShapelessOreRecipe(ModItems.bambooSteamedRiceItem,
				new Object[] { ModItems.potItem, ModItems.riceItem, ModItems.bambooShootItem });
		ModCrafting.addShapelessOreRecipe(ModItems.sweetPotatoSouffleItem, new Object[] { ModItems.bakewareItem,
				ModItems.sweetPotatoItem, ModItems.pecanItem, ModItems.doughItem, ModItems.butterItem });
		ModCrafting.addShapelessOreRecipe(ModItems.cashewChickenItem, new Object[] { ModItems.saucepanItem,
				"listAllChickenRaw", ModItems.cashewItem, ModItems.riceItem, "listAllPepper" });
		ModCrafting.addShapelessOreRecipe(ModItems.apricotGlazedPorkItem,
				new Object[] { "listAllPorkCooked", ModItems.apricotJellyItem });
		ModCrafting.addShapelessOreRecipe(ModItems.figBarItem,
				new Object[] { ModItems.bakewareItem, ModItems.figItem, Items.sugar, ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.pralinesItem,
				new Object[] { ModItems.saucepanItem, ModItems.pecanItem, Items.sugar });
		ModCrafting.addShapelessOreRecipe(ModItems.pistachioBakedSalmonItem,
				new Object[] { ModItems.bakewareItem, ModItems.pistachioItem, Items.fish });
		ModCrafting.addShapelessOreRecipe(ModItems.baconWrappedDatesItem,
				new Object[] { ModItems.bakewareItem, ModItems.dateItem, "listAllPorkCooked" });
		ModCrafting.addShapelessOreRecipe(ModItems.dateNutBreadItem,
				new Object[] { ModItems.bakewareItem, ModItems.dateItem, ModItems.doughItem, "listAllNut" });
		ModCrafting.addShapelessOreRecipe(ModItems.mapleSyrupPancakesItem,
				new Object[] { ModItems.pancakesItem, ModItems.mapleSyrupItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mapleSyrupWafflesItem,
				new Object[] { ModItems.wafflesItem, ModItems.mapleSyrupItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mapleSausageItem,
				new Object[] { "listAllBeefRaw", ModItems.spiceleafItem, ModItems.mapleSyrupItem });
		ModCrafting.addShapelessOreRecipe(ModItems.mapleOatmealItem,
				new Object[] { ModItems.mixingBowlItem, ModItems.oatsItem, ModItems.mapleSyrupItem });
		ModCrafting.addShapelessOreRecipe(ModItems.peachesAndCreamOatmealItem, new Object[] { ModItems.mixingBowlItem,
				ModItems.oatsItem, ModItems.peachItem, "listAllReplaceHeavyCream" });
		ModCrafting.addShapelessOreRecipe(ModItems.cinnamonAppleOatmealItem,
				new Object[] { ModItems.mixingBowlItem, ModItems.oatsItem, ModItems.groundCinnamonItem, Items.apple });
		ModCrafting.addShapelessOreRecipe(ModItems.mapleCandiedBaconItem,
				new Object[] { ModItems.bakewareItem, "listAllPorkCooked", ModItems.mapleSyrupItem });
		ModCrafting.addShapelessOreRecipe(ModItems.potatoAndCheesePirogiItem,
				new Object[] { ModItems.skilletItem, ModItems.doughItem, Items.potato, ModItems.cheeseItem });
		ModCrafting.addShapelessOreRecipe(ModItems.zeppoleItem, new Object[] { ModItems.potItem, ModItems.oliveOilItem,
				ModItems.doughItem, ModItems.groundCinnamonItem });
		ModCrafting.addShapelessOreRecipe(ModItems.sausageInBreadItem,
				new Object[] { ModItems.mapleSausageItem, Items.bread, ModItems.ketchupItem, ModItems.onionItem });
		ModCrafting.addShapelessOreRecipe(ModItems.chocolateCaramelFudgeItem,
				new Object[] { ModItems.bakewareItem, ModItems.chocolateBarItem, ModItems.caramelItem });
		ModCrafting.addShapelessOreRecipe(ModItems.lavenderShortbreadItem,
				new Object[] { ModItems.bakewareItem, "dyePurple", ModItems.doughItem });
		ModCrafting.addShapelessOreRecipe(ModItems.beefWellingtonItem,
				new Object[] { "listAllBeefRaw", ModItems.doughItem, "listAllMushroom" });
		ModCrafting.addShapelessOreRecipe(ModItems.epicBaconItem, new Object[] { "listAllPorkCooked", "dyeRed",
				"dyeOrange", "dyeYellow", "dyeGreen", "dyeBlue", "dyePurple", "dyeMagenta" });
		ModCrafting.addShapelessOreRecipe(ModItems.manjuuItem,
				new Object[] { ModItems.mortarAndPestleItem, Items.sugar, ModItems.riceItem, ModItems.beanItem });

		bookTools = new ItemStack(Items.written_book);

		final NBTTagList bookToolsPages = new NBTTagList();
		bookToolsPages.appendTag(new NBTTagString(
				"Within these guidebooks you will find all sorts of HarvestCraft information and recipes. \n \nThis guidebook is about tools."));
		bookToolsPages.appendTag(new NBTTagString(
				"Tools \n \nHarvestCraft currently includes eight cooking tools: pot, skillet, saucepan, bakeware, cutting board, mortar and pestle, mixing bowl, and Juicer."));
		bookToolsPages.appendTag(new NBTTagString(
				"The pot and cutting board are also placeable, becoming blocks you can craft specific recipes in. \n \nRecipes made within these blocks do not need the specific tool in the crafting grid."));
		bookToolsPages.appendTag(new NBTTagString(
				"Pot \n \no x x \n_ x x \n_ _ _ \n \no = Stick \nx = Iron Ingot \n \nPlaceable: On furnaces only"));
		bookToolsPages
				.appendTag(new NBTTagString("Skillet \n \nx _ _ \n_ x _ \n_ _ o \n \no = Stick \nx = Iron Ingot"));
		bookToolsPages
				.appendTag(new NBTTagString("Saucepan \n \nx _ _ \no _ _ \n_ _ _ \n \no = Stick \nx = Iron Ingot"));
		bookToolsPages.appendTag(new NBTTagString("Bakeware \n \nx x x \nx _ x \nx x x \n \nx = Brick"));
		bookToolsPages.appendTag(new NBTTagString(
				"Cutting Board \n \nx _ _ \n_ o _ \n_ _ p \n \no = Stick \nx = Iron Ingot \np = Plank \n \nPlaceable: Anywhere"));
		bookToolsPages
				.appendTag(new NBTTagString("Mortar and Pestle \n \n_ _ _ \nx o x \n_ x _ \n \no = Stick \nx = Stone"));
		bookToolsPages
				.appendTag(new NBTTagString("Mixing Bowl \n \n_ _ _ \nx o x \n_ x _ \n \no = Stick \nx = Planks"));
		bookToolsPages.appendTag(
				new NBTTagString("Juicer \n \n_ _ _ \n_ o _ \n_ x _ \n \no = Stone \nx = Stone Pressure Plate"));
		bookTools.setTagInfo("pages", bookToolsPages);
		bookTools.setTagInfo("author", new NBTTagString("Pam"));
		bookTools.setTagInfo("title", new NBTTagString("HarvestCraft Guidebook - Tools"));

		ModCrafting.addShapelessOreRecipe(bookTools, new Object[] { Items.apple });
		ModCrafting.addShapelessOreRecipe(bookTools, new Object[] { bookTools });

		bookGardens = new ItemStack(Items.written_book);

		final NBTTagList bookGardensPages = new NBTTagList();
		bookGardensPages.appendTag(new NBTTagString(
				"Within these guidebooks you will find all sorts of HarvestCraft information and recipes. \n \nThis guidebook is about gardens."));
		bookGardensPages.appendTag(new NBTTagString(
				"Gardens \n \nIn order to find the new crops of HarvestCraft, you need to search the world for naturally spawning gardens."));
		bookGardensPages.appendTag(new NBTTagString(
				"Each garden can only spawn in set biomes and drop a random assortment of themed crop items when broken. \n \nIf left alone, garden blocks will also spread to nearby blocks as time goes on."));
		bookGardensPages.appendTag(new NBTTagString(
				"Berry Gardens \n \nLooks like a multi-colored berry bush.  \n \nBiome Categories: Plains, Forest, Hills, Frozen, Swamp"));
		bookGardensPages.appendTag(new NBTTagString(
				"Berry Gardens \n \nDrops: Blackberry, Blueberry, Candleberry, Raspberry, Strawberry"));
		bookGardensPages.appendTag(new NBTTagString(
				"Desert Gardens \n \nLooks like a tiny red-speckled cactus. \n \nBiome Categories: Desert"));
		bookGardensPages.appendTag(new NBTTagString("Desert Gardens \n \nDrops: Cactus Fruit"));
		bookGardensPages.appendTag(new NBTTagString(
				"Grass Gardens \n \nLooks like a pale yellow grass tuft. \n \nBiome Categories: Plains"));
		bookGardensPages.appendTag(
				new NBTTagString("Grass Gardens \n \nDrops: Asparagus, Barley, Oats, Rye, Corn, Bamboo Shoot"));
		bookGardensPages.appendTag(new NBTTagString(
				"Gourd Gardens \n \nLooks like a small green gourd on a vine. \n \nBiome Categories: Plains, Forest"));
		bookGardensPages.appendTag(
				new NBTTagString("Gourd Gardens \n \nDrops: Cantaloupe, Cucumber, Winter Squash, Zucchini, Pumpkin"));
		bookGardensPages.appendTag(new NBTTagString(
				"Ground Gardens \n \nLooks like a tangle of brown roots. \n \nBiome Categories: Plains, Mountain, Hill, Wasteland"));
		bookGardensPages.appendTag(new NBTTagString(
				"Ground Gardens \n \nDrops: Beet, Onion, Parsnip, Peanut, Radish, Rutabaga, Sweet Potato, Turnip, Rhubarb, Potato, Carrot"));
		bookGardensPages.appendTag(new NBTTagString(
				"Herb Gardens \n \nLooks like a gathering of white flowers. \n \nBiome Categories: Plains, Forest, Swamp"));
		bookGardensPages.appendTag(new NBTTagString(
				"Herb Gardens \n \nDrops: Celery, Garlic, Ginger, Spiceleaf, Edible Root, Tea Leaf, Coffee Bean, Mustard Seeds"));
		bookGardensPages.appendTag(new NBTTagString(
				"Leafy Gardens \n \nLooks like a four-leafed plant. \n \nBiome Categories: Plains, Forest, Swamp"));
		bookGardensPages.appendTag(new NBTTagString(
				"Leafy Gardens \n \nDrops: Broccoli, Cauliflower, Leek, Lettuce, Scallion, Artichoke, Brussel Sprout, Cabbage"));
		bookGardensPages.appendTag(new NBTTagString(
				"Mushroom Gardens \n \nLooks like a group of white mushrooms on a log. \n \nBiome Categories: Forest, Swamp"));
		bookGardensPages.appendTag(new NBTTagString("Mushroom Gardens \n \nDrops: White Mushroom"));
		bookGardensPages.appendTag(new NBTTagString(
				"Stalk Gardens \n \nLooks like a six-leafed stalk. \n \nBiome Categories: Plains, Forest, Swamp"));
		bookGardensPages.appendTag(new NBTTagString(
				"Stalk Gardens \n \nDrops: Bean, Soybean, Bell Pepper, Chili Pepper, Eggplant, Okra, Peas, Tomato"));
		bookGardensPages.appendTag(new NBTTagString(
				"Textile Gardens \n \nLooks like a cotton plant. \n \nBiome Categories: Frozen, Hills, Swamp"));
		bookGardensPages.appendTag(new NBTTagString("Textile Gardens \n \nDrops: Cotton"));
		bookGardensPages.appendTag(new NBTTagString(
				"Tropical Gardens \n \nLooks like a immature pinapple. \n \nBiome Categories: Jungle"));
		bookGardensPages.appendTag(new NBTTagString("Tropical Gardens \n \nDrops: Pineapple, Grape, Kiwi "));
		bookGardensPages.appendTag(new NBTTagString(
				"Water Gardens \n \nLooks like a tuft of seaweed. \n \nBiome Categories: Swamp, Beach"));
		bookGardensPages.appendTag(new NBTTagString("Water Gardens \n \nDrops: Cranberry, Rice, Seaweed"));
		bookGardens.setTagInfo("pages", bookGardensPages);
		bookGardens.setTagInfo("author", new NBTTagString("Pam"));
		bookGardens.setTagInfo("title", new NBTTagString("HarvestCraft Guidebook - Gardens"));

		ModCrafting.addShapelessOreRecipe(bookGardens, new Object[] { Items.melon, Items.apple });
		ModCrafting.addShapelessOreRecipe(bookGardens, new Object[] { bookGardens });

		ModCrafting.addShapelessOreRecipe(ModItems.royalJellyItem,
				new Object[] { new ItemStack(ModItems.queenBeeItem, 1, 18) });
		ModCrafting.addShapelessOreRecipe(ModItems.royalJellyItem,
				new Object[] { ModItems.saucepanItem, ModItems.honeyItem, Items.sugar, ModItems.juicerItem });
		ModCrafting.addShapelessOreRecipe(ModItems.queenBeeItem,
				new Object[] { ModItems.grubItem, ModItems.royalJellyItem });

		ModCrafting.addShapedOreRecipe(new ItemStack(ModItems.hardenedLeatherHelmetItem, 1),
				new Object[] { "bbb", "b b", 'b', ModItems.hardenedLeatherItem });

		ModCrafting.addShapedOreRecipe(new ItemStack(ModItems.hardenedLeatherChestplateItem, 1),
				new Object[] { "b b", "bbb", "bbb", 'b', ModItems.hardenedLeatherItem });

		ModCrafting.addShapedOreRecipe(new ItemStack(ModItems.hardenedLeatherLeggingsItem, 1),
				new Object[] { "bbb", "b b", "b b", 'b', ModItems.hardenedLeatherItem });

		ModCrafting.addShapedOreRecipe(new ItemStack(ModItems.hardenedLeatherBootsItem, 1),
				new Object[] { "b b", "b b", 'b', ModItems.hardenedLeatherItem });

		ModCrafting.addShapelessOreRecipe(ModItems.cottonSeedItem, new Object[] { ModItems.cottonItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.cottonItem, 2),
				new Object[] { ModItems.cottonItem, ModItems.cottonItem });

		ModCrafting.addShapelessOreRecipe(new ItemStack(Items.string, 2),
				new Object[] { ModItems.cottonItem, ModItems.cottonItem, ModItems.cottonItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.wovenCottonItem, 1),
				new Object[] { Items.string, Items.string });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.wovenCottonItem, 3),
				new Object[] { ModItems.wovenCottonItem, ModItems.wovenCottonItem, ModItems.wovenCottonItem });

		ModCrafting.addShapelessOreRecipe(new ItemStack(Blocks.wool, 1, 0),
				new Object[] { ModItems.wovenCottonItem, ModItems.wovenCottonItem });

		ModCrafting.addShapedOreRecipe(new ItemStack(Items.leather_helmet, 1),
				new Object[] { "bbb", "b b", 'b', ModItems.wovenCottonItem });

		ModCrafting.addShapedOreRecipe(new ItemStack(Items.leather_chestplate, 1),
				new Object[] { "b b", "bbb", "bbb", 'b', ModItems.wovenCottonItem });

		ModCrafting.addShapedOreRecipe(new ItemStack(Items.leather_leggings, 1),
				new Object[] { "bbb", "b b", "b b", 'b', ModItems.wovenCottonItem });

		ModCrafting.addShapedOreRecipe(new ItemStack(Items.leather_boots, 1),
				new Object[] { "b b", "b b", 'b', ModItems.wovenCottonItem });

		ModCrafting.addShapelessOreRecipe(ModItems.candleberrySeedItem, new Object[] { ModItems.candleberryItem });
		ModCrafting.addShapelessOreRecipe(new ItemStack(ModItems.cottonItem, 2),
				new Object[] { ModItems.candleberryItem, ModItems.candleberryItem });
		ModCrafting.addShapelessOreRecipe(ModItems.waxItem, new Object[] { ModItems.potItem, ModItems.candleberryItem,
				ModItems.candleberryItem, ModItems.candleberryItem, ModItems.candleberryItem });

		ModCrafting.addShapelessOreRecipe(ModItems.hardenedLeatherItem, new Object[] { Items.leather, "listAllWax" });

		// Churn
		// ModCrafting.addShapelessOreRecipe(ModItems.butterItem,
		// new Object[] { ModItems.saucepanItem, "listAllReplaceHeavyCream",
		// ModItems.saltItem });

		// Quern
		// ModCrafting.addShapelessOreRecipe(ModItems.flourItem,
		// new Object[] { ModItems.mortarAndPestleItem, Items.wheat });
		// ModCrafting.addShapelessOreRecipe(ModItems.flourItem,
		// new Object[] { ModItems.mortarAndPestleItem, ModItems.riceItem });
		// ModCrafting.addShapelessOreRecipe(ModItems.flourItem,
		// new Object[] { ModItems.mortarAndPestleItem, Items.potato });
		// ModCrafting.addShapelessOreRecipe(ModItems.flourItem,
		// new Object[] { ModItems.mortarAndPestleItem, ModItems.ryeItem });
		// ModCrafting.addShapelessOreRecipe(ModItems.flourItem,
		// new Object[] { ModItems.mortarAndPestleItem, ModItems.oatsItem });
		// ModCrafting.addShapelessOreRecipe(ModItems.flourItem,
		// new Object[] { ModItems.mortarAndPestleItem, ModItems.barleyItem });
	}

	@SuppressWarnings("unchecked")
	private static void addShapedOreRecipe(final Item item, final Object[] objects) {
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(item, objects));
	}

	@SuppressWarnings("unchecked")
	private static void addShapedOreRecipe(final ItemStack itemStack, final Object[] objects) {
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(itemStack, objects));
	}

	@SuppressWarnings("unchecked")
	private static void addShapedOreRecipe(final Block block, final Object[] objects) {
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(block, objects));
	}

	@SuppressWarnings("unchecked")
	private static void addShapelessOreRecipe(final Item item, final Object[] objects) {
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(item, objects));
	}

	@SuppressWarnings("unchecked")
	private static void addShapelessOreRecipe(final ItemStack itemStack, final Object[] objects) {
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(itemStack, objects));
	}

	@SuppressWarnings("unchecked")
	private static void addShapelessOreRecipe(final Block block, final Object[] objects) {
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(block, objects));
	}
}
