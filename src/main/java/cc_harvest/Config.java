package cc_harvest;

import net.minecraftforge.common.config.Configuration;

public class Config {
	// General
	private static boolean biomeSpawnDefault = true;
	public static boolean biomeSpawn;

	// Buildings
	public static boolean enableFarmGenerationDefault = true;
	public static boolean enableFarmGeneration;

	private static int farmSpawnRateDefault = 480;
	public static int farmSpawnRate;

	// Generation
	private static boolean enableSaltGenerationDefault = true;
	public static boolean enableSaltGeneration;

	private static int saltRarityDefault = 5;
	public static int saltRarity;

	private static boolean enableBeehiveGenerationDefault = true;
	public static boolean enableBeehiveGeneration;

	private static int beehiveRarityDefault = 5;
	public static int beehiveRarity;

	private static boolean enableGardenGenerationDefault = true;
	public static boolean enableGardenGeneration;

	private static int gardenRarityDefault = 2;
	public static int gardenRarity;

	private static int gardenDropAmountDefault = 3;
	public static int gardenDropAmount;

	private static int seedRarityDefault = 1;
	public static int seedRarity;

	private static boolean enableFruitTreeGenerationDefault = true;
	public static boolean enableFruitTreeGeneration;

	private static int fruitTreeRarityDefault = 3;
	public static int fruitTreeRarity;

	private static boolean enableBoxGenerationDefault = true;
	public static boolean enableBoxGeneration;

	private static int boxRarityDefault = 3;
	public static int boxRarity;

	// Drops
	private static boolean sheepdropMuttonDefault = true;
	public static boolean sheepdropMutton;

	private static boolean squiddropCalamariDefault = true;
	public static boolean squiddropCalamari;

	// Food
	private static int cropfoodRestoreDefault = 1;
	private static double cropSaturationRestoreDefault = 0.60D;
	private static double snackSaturationDefault = 0.60D;
	private static double mealSaturationDefault = 1.20D;
	private static double meatymealSaturationDefault = 1.60D;

	public static int cropfoodRestore;
	public static float cropSaturationRestore;
	public static float snackSaturation;
	public static float mealSaturation;
	public static float meatymealSaturation;

	// Recipes
	private static int freshWaterFromBucketDefault = 4;
	public static int freshWaterFromBucket;

	private static int freshMilkFromBucketDefault = 4;
	public static int freshMilkFromBucket;

	private static boolean enableSaltFromWaterBucketRecipeDefault = true;
	public static boolean enableSaltFromWaterBucketRecipe;

	// Garden
	private static boolean enableBerryGardenGenerationDefault = true;
	private static boolean enableDesertGardenGenerationDefault = true;
	private static boolean enableGrassGardenGenerationDefault = true;
	private static boolean enableGourdGardenGenerationDefault = true;
	private static boolean enableGroundGardenGenerationDefault = true;
	private static boolean enableHerbGardenGenerationDefault = true;
	private static boolean enableLeafyGardenGenerationDefault = true;
	private static boolean enableMushroomGardenGenerationDefault = true;
	private static boolean enableStalkGardenGenerationDefault = true;
	private static boolean enableTextileGardenGenerationDefault = true;
	private static boolean enableTropicalGardenGenerationDefault = true;
	private static boolean enableWaterGardenGenerationDefault = true;

	public static boolean enableBerryGardenGeneration;
	public static boolean enableDesertGardenGeneration;
	public static boolean enableGrassGardenGeneration;
	public static boolean enableGourdGardenGeneration;
	public static boolean enableGroundGardenGeneration;
	public static boolean enableHerbGardenGeneration;
	public static boolean enableLeafyGardenGeneration;
	public static boolean enableMushroomGardenGeneration;
	public static boolean enableStalkGardenGeneration;
	public static boolean enableTextileGardenGeneration;
	public static boolean enableTropicalGardenGeneration;
	public static boolean enableWaterGardenGeneration;

	// Tree
	private static boolean appleTreeGenerationDefault = true;
	private static boolean almondTreeGenerationDefault = true;
	private static boolean apricotTreeGenerationDefault = true;
	private static boolean avocadoTreeGenerationDefault = true;
	private static boolean bananaTreeGenerationDefault = true;
	private static boolean cashewTreeGenerationDefault = true;
	private static boolean cherryTreeGenerationDefault = true;
	private static boolean chestnutTreeGenerationDefault = true;
	private static boolean cinnamonTreeGenerationDefault = true;
	private static boolean coconutTreeGenerationDefault = true;
	private static boolean dateTreeGenerationDefault = true;
	private static boolean dragonfruitTreeGenerationDefault = true;
	private static boolean durianTreeGenerationDefault = true;
	private static boolean figTreeGenerationDefault = true;
	private static boolean grapefruitTreeGenerationDefault = true;
	private static boolean lemonTreeGenerationDefault = true;
	private static boolean limeTreeGenerationDefault = true;
	private static boolean mapleTreeGenerationDefault = true;
	private static boolean mangoTreeGenerationDefault = true;
	private static boolean nutmegTreeGenerationDefault = true;
	private static boolean oliveTreeGenerationDefault = true;
	private static boolean orangeTreeGenerationDefault = true;
	private static boolean papayaTreeGenerationDefault = true;
	private static boolean paperbarkTreeGenerationDefault = true;
	private static boolean peachTreeGenerationDefault = true;
	private static boolean pearTreeGenerationDefault = true;
	private static boolean pecanTreeGenerationDefault = true;
	private static boolean peppercornTreeGenerationDefault = true;
	private static boolean persimmonTreeGenerationDefault = true;
	private static boolean pistachioTreeGenerationDefault = true;
	private static boolean plumTreeGenerationDefault = true;
	private static boolean pomegranateTreeGenerationDefault = true;
	private static boolean starfruitTreeGenerationDefault = true;
	private static boolean vanillabeanTreeGenerationDefault = true;
	private static boolean walnutTreeGenerationDefault = true;

	public static boolean appleTreeGeneration;
	public static boolean almondTreeGeneration;
	public static boolean apricotTreeGeneration;
	public static boolean avocadoTreeGeneration;
	public static boolean bananaTreeGeneration;
	public static boolean cashewTreeGeneration;
	public static boolean cherryTreeGeneration;
	public static boolean chestnutTreeGeneration;
	public static boolean cinnamonTreeGeneration;
	public static boolean coconutTreeGeneration;
	public static boolean dateTreeGeneration;
	public static boolean dragonfruitTreeGeneration;
	public static boolean durianTreeGeneration;
	public static boolean figTreeGeneration;
	public static boolean grapefruitTreeGeneration;
	public static boolean lemonTreeGeneration;
	public static boolean limeTreeGeneration;
	public static boolean mapleTreeGeneration;
	public static boolean mangoTreeGeneration;
	public static boolean nutmegTreeGeneration;
	public static boolean oliveTreeGeneration;
	public static boolean orangeTreeGeneration;
	public static boolean papayaTreeGeneration;
	public static boolean paperbarkTreeGeneration;
	public static boolean peachTreeGeneration;
	public static boolean pearTreeGeneration;
	public static boolean pecanTreeGeneration;
	public static boolean peppercornTreeGeneration;
	public static boolean persimmonTreeGeneration;
	public static boolean pistachioTreeGeneration;
	public static boolean plumTreeGeneration;
	public static boolean pomegranateTreeGeneration;
	public static boolean starfruitTreeGeneration;
	public static boolean vanillabeanTreeGeneration;
	public static boolean walnutTreeGeneration;

	// Seeds
	private static boolean asparagusSeedDropFromGrassDefault = true;
	private static boolean bambooShootSeedDropFromGrassDefault = true;
	private static boolean barleySeedDropFromGrassDefault = true;
	private static boolean beanSeedDropFromGrassDefault = true;
	private static boolean beetSeedDropFromGrassDefault = true;
	private static boolean broccoliSeedDropFromGrassDefault = true;
	private static boolean cauliflowerSeedDropFromGrassDefault = true;
	private static boolean celerySeedDropFromGrassDefault = true;
	private static boolean cranberrySeedDropFromGrassDefault = true;
	private static boolean garlicSeedDropFromGrassDefault = true;
	private static boolean gingerSeedDropFromGrassDefault = true;
	private static boolean leekSeedDropFromGrassDefault = true;
	private static boolean lettuceSeedDropFromGrassDefault = true;
	private static boolean oatsSeedDropFromGrassDefault = true;
	private static boolean onionSeedDropFromGrassDefault = true;
	private static boolean parsnipSeedDropFromGrassDefault = true;
	private static boolean peanutSeedDropFromGrassDefault = true;
	private static boolean pineappleSeedDropFromGrassDefault = true;
	private static boolean radishSeedDropFromGrassDefault = true;
	private static boolean riceSeedDropFromGrassDefault = true;
	private static boolean rutabagaSeedDropFromGrassDefault = true;
	private static boolean ryeSeedDropFromGrassDefault = true;
	private static boolean scallionSeedDropFromGrassDefault = true;
	private static boolean soybeanSeedDropFromGrassDefault = true;
	private static boolean spiceleafSeedDropFromGrassDefault = true;
	private static boolean sunflowerSeedDropFromGrassDefault = true;
	private static boolean sweetpotatoSeedDropFromGrassDefault = true;
	private static boolean teaSeedDropFromGrassDefault = true;
	private static boolean turnipSeedDropFromGrassDefault = true;
	private static boolean whitemushroomSeedDropFromGrassDefault = true;

	public static boolean asparagusSeedDropFromGrass;
	public static boolean bambooShootSeedDropFromGrass;
	public static boolean barleySeedDropFromGrass;
	public static boolean beanSeedDropFromGrass;
	public static boolean beetSeedDropFromGrass;
	public static boolean broccoliSeedDropFromGrass;
	public static boolean cauliflowerSeedDropFromGrass;
	public static boolean celerySeedDropFromGrass;
	public static boolean cranberrySeedDropFromGrass;
	public static boolean garlicSeedDropFromGrass;
	public static boolean gingerSeedDropFromGrass;
	public static boolean leekSeedDropFromGrass;
	public static boolean lettuceSeedDropFromGrass;
	public static boolean oatsSeedDropFromGrass;
	public static boolean onionSeedDropFromGrass;
	public static boolean parsnipSeedDropFromGrass;
	public static boolean peanutSeedDropFromGrass;
	public static boolean pineappleSeedDropFromGrass;
	public static boolean radishSeedDropFromGrass;
	public static boolean riceSeedDropFromGrass;
	public static boolean rutabagaSeedDropFromGrass;
	public static boolean ryeSeedDropFromGrass;
	public static boolean scallionSeedDropFromGrass;
	public static boolean soybeanSeedDropFromGrass;
	public static boolean spiceleafSeedDropFromGrass;
	public static boolean sunflowerSeedDropFromGrass;
	public static boolean sweetpotatoSeedDropFromGrass;
	public static boolean teaSeedDropFromGrass;
	public static boolean turnipSeedDropFromGrass;
	public static boolean whitemushroomSeedDropFromGrass;

	private static boolean artichokeSeedDropFromGrassDefault = true;
	private static boolean bellpepperSeedDropFromGrassDefault = true;
	private static boolean blackberrySeedDropFromGrassDefault = true;
	private static boolean blueberrySeedDropFromGrassDefault = true;
	private static boolean brusselSproutSeedDropFromGrassDefault = true;
	private static boolean cabbageSeedDropFromGrassDefault = true;
	private static boolean cactusFruitSeedDropFromGrassDefault = true;
	private static boolean candleberrySeedDropFromGrassDefault = true;
	private static boolean cantaloupeSeedDropFromGrassDefault = true;
	private static boolean chilipepperSeedDropFromGrassDefault = true;
	private static boolean coffeeSeedDropFromGrassDefault = true;
	private static boolean cornSeedDropFromGrassDefault = true;
	private static boolean cottonSeedDropFromGrassDefault = true;
	private static boolean cucumberSeedDropFromGrassDefault = true;
	private static boolean eggplantSeedDropFromGrassDefault = true;
	private static boolean grapeSeedDropFromGrassDefault = true;
	private static boolean kiwiSeedDropFromGrassDefault = true;
	private static boolean mustardSeedDropFromGrassDefault = true;
	private static boolean okraSeedDropFromGrassDefault = true;
	private static boolean peasSeedDropFromGrassDefault = true;
	private static boolean raspberrySeedDropFromGrassDefault = true;
	private static boolean rhubarbSeedDropFromGrassDefault = true;
	private static boolean seaweedSeedDropFromGrassDefault = true;
	private static boolean strawberrySeedDropFromGrassDefault = true;
	private static boolean tomatoSeedDropFromGrassDefault = true;
	private static boolean wintersquashSeedDropFromGrassDefault = true;
	private static boolean zucchiniSeedDropFromGrassDefault = true;

	public static boolean artichokeSeedDropFromGrass;
	public static boolean bellpepperSeedDropFromGrass;
	public static boolean blackberrySeedDropFromGrass;
	public static boolean blueberrySeedDropFromGrass;
	public static boolean brusselSproutSeedDropFromGrass;
	public static boolean cabbageSeedDropFromGrass;
	public static boolean cactusFruitSeedDropFromGrass;
	public static boolean candleberrySeedDropFromGrass;
	public static boolean cantaloupeSeedDropFromGrass;
	public static boolean chilipepperSeedDropFromGrass;
	public static boolean coffeeSeedDropFromGrass;
	public static boolean cornSeedDropFromGrass;
	public static boolean cottonSeedDropFromGrass;
	public static boolean cucumberSeedDropFromGrass;
	public static boolean eggplantSeedDropFromGrass;
	public static boolean grapeSeedDropFromGrass;
	public static boolean kiwiSeedDropFromGrass;
	public static boolean mustardSeedDropFromGrass;
	public static boolean okraSeedDropFromGrass;
	public static boolean peasSeedDropFromGrass;
	public static boolean raspberrySeedDropFromGrass;
	public static boolean rhubarbSeedDropFromGrass;
	public static boolean seaweedSeedDropFromGrass;
	public static boolean strawberrySeedDropFromGrass;
	public static boolean tomatoSeedDropFromGrass;
	public static boolean wintersquashSeedDropFromGrass;
	public static boolean zucchiniSeedDropFromGrass;

	public static void main(final Configuration config) {
		// General
		biomeSpawn = config.get("general", "Biome Spawn", biomeSpawnDefault).getBoolean(biomeSpawnDefault);

		// Buildings
		enableFarmGeneration = config
				.get("buildings", "Enable Farm House Generation (Default: " + enableFarmGenerationDefault + ")",
						enableFarmGenerationDefault)
				.getBoolean(enableFarmGenerationDefault);
		farmSpawnRate = config
				.get("buildings", "Farm Spawn Rate (Default: " + farmSpawnRateDefault + ")", farmSpawnRateDefault)
				.getInt(farmSpawnRateDefault);

		// Generation
		enableSaltGeneration = config.get("generation",
				"Enable Salt Generation (Default: " + enableSaltGenerationDefault + ")", enableSaltGenerationDefault)
				.getBoolean(enableSaltGenerationDefault);
		saltRarity = config.get("generation", "Salt Rarity (Default: " + saltRarityDefault + ")", saltRarityDefault)
				.getInt(saltRarityDefault);

		enableBeehiveGeneration = config
				.get("generation", "Enable Beehive Generation (Default: " + enableBeehiveGenerationDefault + ")",
						enableBeehiveGenerationDefault)
				.getBoolean(enableBeehiveGenerationDefault);
		beehiveRarity = config
				.get("generation", "Beehive Rarity (Default: " + beehiveRarityDefault + ")", beehiveRarityDefault)
				.getInt(beehiveRarityDefault);

		enableGardenGeneration = config
				.get("generation", "Enable Garden Generation (Default: " + enableGardenGenerationDefault + ")",
						enableGardenGenerationDefault)
				.getBoolean(enableGardenGenerationDefault);
		gardenRarity = config
				.get("generation", "Garden Rarity (Default " + gardenRarityDefault + ")", gardenRarityDefault)
				.getInt(gardenRarityDefault);
		gardenDropAmount = config.get("generation", "Garden Drop Amount (Default: " + gardenDropAmountDefault + ")",
				gardenDropAmountDefault).getInt(gardenDropAmountDefault);

		seedRarity = config.get("generation", "Seed Rarity (Default: " + seedRarityDefault + ")", seedRarityDefault)
				.getInt(seedRarityDefault);

		enableFruitTreeGeneration = config
				.get("generation", "Enable FruitTree Generation (Default: " + enableFruitTreeGenerationDefault + ")",
						enableFruitTreeGenerationDefault)
				.getBoolean(enableFruitTreeGenerationDefault);
		fruitTreeRarity = config.get("generation", "Fruit Tree Rarity (Default: " + fruitTreeRarityDefault + ")",
				fruitTreeRarityDefault).getInt(fruitTreeRarityDefault);

		enableBoxGeneration = config.get("generation",
				"Enable Box Generation (Default: " + enableBoxGenerationDefault + ")", enableBoxGenerationDefault)
				.getBoolean(enableBoxGenerationDefault);
		boxRarity = config.get("generation", "Box Rarity (Default: " + boxRarityDefault + ")", boxRarityDefault)
				.getInt(boxRarityDefault);

		// Drops
		sheepdropMutton = config
				.get("drops", "Sheep Drop Mutton (Default: " + sheepdropMuttonDefault + ")", sheepdropMuttonDefault)
				.getBoolean(sheepdropMuttonDefault);
		squiddropCalamari = config.get("drops", "Squid Drop Calamari (Default: " + squiddropCalamariDefault + ")",
				squiddropCalamariDefault).getBoolean(squiddropCalamariDefault);

		// Food
		cropfoodRestore = config
				.get("food", "Crop Food Restore (Default: " + cropfoodRestoreDefault + ")", cropfoodRestoreDefault)
				.getInt(cropfoodRestoreDefault);
		cropSaturationRestore = (float) config.get("food",
				"Crop Saturation Restore (Default: " + cropSaturationRestoreDefault + ")", cropSaturationRestoreDefault)
				.getDouble(cropSaturationRestoreDefault);
		snackSaturation = (float) config
				.get("food", "Snack Saturation (Default: " + snackSaturationDefault + ")", snackSaturationDefault)
				.getDouble(snackSaturationDefault);
		mealSaturation = (float) config
				.get("food", "Meal Saturation (Default: " + mealSaturationDefault + ")", mealSaturationDefault)
				.getDouble(mealSaturationDefault);
		meatymealSaturation = (float) config.get("food",
				"Meaty Meal Saturation (Default: " + meatymealSaturationDefault + ")", meatymealSaturationDefault)
				.getDouble(meatymealSaturationDefault);

		// Recipes
		freshWaterFromBucket = config.get("recipes",
				"Fresh Water From Bucket (Default: " + freshWaterFromBucketDefault + ")", freshWaterFromBucketDefault)
				.getInt(freshWaterFromBucketDefault);
		freshMilkFromBucket = config.get("recipes",
				"Fresh Milk From Bucket (Default: " + freshMilkFromBucketDefault + ")", freshMilkFromBucketDefault)
				.getInt(freshMilkFromBucketDefault);
		enableSaltFromWaterBucketRecipe = config
				.get("recipes",
						"Enable Salt From Water Bucket Recipe (Default: " + enableSaltFromWaterBucketRecipeDefault
								+ ")",
						enableSaltFromWaterBucketRecipeDefault)
				.getBoolean(enableSaltFromWaterBucketRecipeDefault);

		// Garden
		enableBerryGardenGeneration = config
				.get("garden", "Enable Berry Garden Generation (Default: " + enableBerryGardenGenerationDefault + ")",
						enableBerryGardenGenerationDefault)
				.getBoolean(enableBerryGardenGenerationDefault);
		enableDesertGardenGeneration = config
				.get("garden", "Enable Desert Garden Generation (Default: " + enableDesertGardenGenerationDefault + ")",
						enableDesertGardenGenerationDefault)
				.getBoolean(enableDesertGardenGenerationDefault);
		enableGrassGardenGeneration = config
				.get("garden", "Enable Grass Garden Generation (Default: " + enableGrassGardenGenerationDefault + ")",
						enableGrassGardenGenerationDefault)
				.getBoolean(enableGrassGardenGenerationDefault);
		enableGourdGardenGeneration = config
				.get("garden", "Enable Gourd Garden Generation (Default: " + enableGourdGardenGenerationDefault + ")",
						enableGourdGardenGenerationDefault)
				.getBoolean(enableGourdGardenGenerationDefault);
		enableGroundGardenGeneration = config
				.get("garden", "Enable Ground Garden Generation (Default: " + enableGroundGardenGenerationDefault + ")",
						enableGroundGardenGenerationDefault)
				.getBoolean(enableGroundGardenGenerationDefault);
		enableHerbGardenGeneration = config
				.get("garden", "Enable Herb Garden Generation (Default: " + enableHerbGardenGenerationDefault + ")",
						enableHerbGardenGenerationDefault)
				.getBoolean(enableHerbGardenGenerationDefault);
		enableLeafyGardenGeneration = config
				.get("garden", "Enable Leafy Garden Generation (Default: " + enableLeafyGardenGenerationDefault + ")",
						enableLeafyGardenGenerationDefault)
				.getBoolean(enableLeafyGardenGenerationDefault);
		enableMushroomGardenGeneration = config.get("garden",
				"Enable Mushroom Garden Generation (Default: " + enableMushroomGardenGenerationDefault + ")",
				enableMushroomGardenGenerationDefault).getBoolean(enableMushroomGardenGenerationDefault);
		enableStalkGardenGeneration = config
				.get("garden", "Enable Stalk Garden Generation (Default: " + enableStalkGardenGenerationDefault + ")",
						enableStalkGardenGenerationDefault)
				.getBoolean(enableStalkGardenGenerationDefault);
		enableTextileGardenGeneration = config.get("garden",
				"Enable Textile Garden Generation (Default: " + enableTextileGardenGenerationDefault + ")",
				enableTextileGardenGenerationDefault).getBoolean(enableTextileGardenGenerationDefault);
		enableTropicalGardenGeneration = config.get("garden",
				"Enable Tropical Garden Generation (Default: " + enableTropicalGardenGenerationDefault + ")",
				enableTropicalGardenGenerationDefault).getBoolean(enableTropicalGardenGenerationDefault);
		enableWaterGardenGeneration = config
				.get("garden", "Enable Water Garden Generation (Default: " + enableWaterGardenGenerationDefault + ")",
						enableWaterGardenGenerationDefault)
				.getBoolean(enableWaterGardenGenerationDefault);

		// Tree
		appleTreeGeneration = config.get("tree", "Apple Tree Generation (Default: " + appleTreeGenerationDefault + ")",
				appleTreeGenerationDefault).getBoolean(appleTreeGenerationDefault);
		almondTreeGeneration = config.get("tree",
				"Almond Tree Generation (Default: " + almondTreeGenerationDefault + ")", almondTreeGenerationDefault)
				.getBoolean(almondTreeGenerationDefault);
		apricotTreeGeneration = config.get("tree",
				"Apricot Tree Generation (Default: " + apricotTreeGenerationDefault + ")", apricotTreeGenerationDefault)
				.getBoolean(apricotTreeGenerationDefault);
		avocadoTreeGeneration = config.get("tree",
				"Avocado Tree Generation (Default: " + avocadoTreeGenerationDefault + ")", avocadoTreeGenerationDefault)
				.getBoolean(avocadoTreeGenerationDefault);
		bananaTreeGeneration = config.get("tree",
				"Banana Tree Generation (Default: " + bananaTreeGenerationDefault + ")", bananaTreeGenerationDefault)
				.getBoolean(bananaTreeGenerationDefault);
		cashewTreeGeneration = config.get("tree",
				"Cashew Tree Generation (Default: " + cashewTreeGenerationDefault + ")", cashewTreeGenerationDefault)
				.getBoolean(cashewTreeGenerationDefault);
		cherryTreeGeneration = config.get("tree",
				"Cherry Tree Generation (Default: " + cherryTreeGenerationDefault + ")", cherryTreeGenerationDefault)
				.getBoolean(cherryTreeGenerationDefault);
		chestnutTreeGeneration = config
				.get("tree", "Chestnut Tree Generation (Default: " + chestnutTreeGenerationDefault + ")",
						chestnutTreeGenerationDefault)
				.getBoolean(chestnutTreeGenerationDefault);
		cinnamonTreeGeneration = config
				.get("tree", "Cinnamon Tree Generation (Default: " + cinnamonTreeGenerationDefault + ")",
						cinnamonTreeGenerationDefault)
				.getBoolean(cinnamonTreeGenerationDefault);
		coconutTreeGeneration = config.get("tree",
				"Coconut Tree Generation (Default: " + coconutTreeGenerationDefault + ")", coconutTreeGenerationDefault)
				.getBoolean(coconutTreeGenerationDefault);
		dateTreeGeneration = config.get("tree", "Date Tree Generation (Default: " + dateTreeGenerationDefault + ")",
				dateTreeGenerationDefault).getBoolean(dateTreeGenerationDefault);
		dragonfruitTreeGeneration = config
				.get("tree", "Dragonfruit Tree Generation (Default: " + dragonfruitTreeGenerationDefault + ")",
						dragonfruitTreeGenerationDefault)
				.getBoolean(dragonfruitTreeGenerationDefault);
		durianTreeGeneration = config.get("tree",
				"Durian Tree Generation (Default: " + durianTreeGenerationDefault + ")", durianTreeGenerationDefault)
				.getBoolean(durianTreeGenerationDefault);
		figTreeGeneration = config.get("tree", "Fig Tree Generation (Default: " + figTreeGenerationDefault + ")",
				figTreeGenerationDefault).getBoolean(figTreeGenerationDefault);
		grapefruitTreeGeneration = config
				.get("tree", "Grapefruit Tree Generation (Default: " + grapefruitTreeGenerationDefault + ")",
						grapefruitTreeGenerationDefault)
				.getBoolean(grapefruitTreeGenerationDefault);
		lemonTreeGeneration = config.get("tree", "Lemon Tree Generation (Default: " + lemonTreeGenerationDefault + ")",
				lemonTreeGenerationDefault).getBoolean(lemonTreeGenerationDefault);
		limeTreeGeneration = config.get("tree", "Lime Tree Generation (Default: " + limeTreeGenerationDefault + ")",
				limeTreeGenerationDefault).getBoolean(limeTreeGenerationDefault);
		mapleTreeGeneration = config.get("tree", "Maple Tree Generation (Default: " + mapleTreeGenerationDefault + ")",
				mapleTreeGenerationDefault).getBoolean(mapleTreeGenerationDefault);
		mangoTreeGeneration = config.get("tree", "Mango Tree Generation (Default: " + mangoTreeGenerationDefault + ")",
				mangoTreeGenerationDefault).getBoolean(mangoTreeGenerationDefault);
		nutmegTreeGeneration = config.get("tree",
				"Nutmeg Tree Generation (Default: " + nutmegTreeGenerationDefault + ")", nutmegTreeGenerationDefault)
				.getBoolean(nutmegTreeGenerationDefault);
		oliveTreeGeneration = config.get("tree", "Olive Tree Generation (Default: " + oliveTreeGenerationDefault + ")",
				oliveTreeGenerationDefault).getBoolean(oliveTreeGenerationDefault);
		orangeTreeGeneration = config.get("tree",
				"Orange Tree Generation (Default: " + orangeTreeGenerationDefault + ")", orangeTreeGenerationDefault)
				.getBoolean(orangeTreeGenerationDefault);
		papayaTreeGeneration = config.get("tree",
				"Papaya Tree Generation (Default: " + papayaTreeGenerationDefault + ")", papayaTreeGenerationDefault)
				.getBoolean(papayaTreeGenerationDefault);
		paperbarkTreeGeneration = config
				.get("tree", "Paperbark Tree Generation (Default: " + paperbarkTreeGenerationDefault + ")",
						paperbarkTreeGenerationDefault)
				.getBoolean(paperbarkTreeGenerationDefault);
		peachTreeGeneration = config.get("tree", "Peach Tree Generation (Default: " + peachTreeGenerationDefault + ")",
				peachTreeGenerationDefault).getBoolean(peachTreeGenerationDefault);
		pearTreeGeneration = config.get("tree", "Pear Tree Generation (Default: " + pearTreeGenerationDefault + ")",
				pearTreeGenerationDefault).getBoolean(pearTreeGenerationDefault);
		pecanTreeGeneration = config.get("tree", "Pecan Tree Generation (Default: " + pecanTreeGenerationDefault + ")",
				pecanTreeGenerationDefault).getBoolean(pecanTreeGenerationDefault);
		peppercornTreeGeneration = config
				.get("tree", "Peppercorn Tree Generation (Default: " + peppercornTreeGenerationDefault + ")",
						peppercornTreeGenerationDefault)
				.getBoolean(peppercornTreeGenerationDefault);
		persimmonTreeGeneration = config
				.get("tree", "Persimmon Tree Generation (Default: " + persimmonTreeGenerationDefault + ")",
						persimmonTreeGenerationDefault)
				.getBoolean(persimmonTreeGenerationDefault);
		pistachioTreeGeneration = config
				.get("tree", "Pistachio Tree Generation (Default: " + pistachioTreeGenerationDefault + ")",
						pistachioTreeGenerationDefault)
				.getBoolean(pistachioTreeGenerationDefault);
		plumTreeGeneration = config.get("tree", "Plum Tree Generation (Default: " + plumTreeGenerationDefault + ")",
				plumTreeGenerationDefault).getBoolean(plumTreeGenerationDefault);
		pomegranateTreeGeneration = config
				.get("tree", "Pomegranate Tree Generation (Default: " + pomegranateTreeGenerationDefault + ")",
						pomegranateTreeGenerationDefault)
				.getBoolean(pomegranateTreeGenerationDefault);
		starfruitTreeGeneration = config
				.get("tree", "Starfruit Tree Generation (Default: " + starfruitTreeGenerationDefault + ")",
						starfruitTreeGenerationDefault)
				.getBoolean(starfruitTreeGenerationDefault);
		vanillabeanTreeGeneration = config
				.get("tree", "Vanillabean Tree Generation (Default: " + vanillabeanTreeGenerationDefault + ")",
						vanillabeanTreeGenerationDefault)
				.getBoolean(vanillabeanTreeGenerationDefault);
		walnutTreeGeneration = config.get("tree",
				"Walnut Tree Generation (Default: " + walnutTreeGenerationDefault + ")", walnutTreeGenerationDefault)
				.getBoolean(walnutTreeGenerationDefault);

		// Seeds
		asparagusSeedDropFromGrass = config
				.get("seeds", "Asparagus Seed Drop From Grass (Default: " + asparagusSeedDropFromGrassDefault + ")",
						asparagusSeedDropFromGrassDefault)
				.getBoolean(asparagusSeedDropFromGrassDefault);
		barleySeedDropFromGrass = config
				.get("seeds", "Barley Seed Drop From Grass (Default: " + barleySeedDropFromGrassDefault + ")",
						barleySeedDropFromGrassDefault)
				.getBoolean(barleySeedDropFromGrassDefault);
		beanSeedDropFromGrass = config
				.get("seeds", "Bean Seed Drop From Grass (Default: " + beanSeedDropFromGrassDefault + ")",
						beanSeedDropFromGrassDefault)
				.getBoolean(beanSeedDropFromGrassDefault);
		beetSeedDropFromGrass = config
				.get("seeds", "Beet Seed Drop From Grass (Default: " + beetSeedDropFromGrassDefault + ")",
						beetSeedDropFromGrassDefault)
				.getBoolean(beetSeedDropFromGrassDefault);
		broccoliSeedDropFromGrass = config
				.get("seeds", "Broccoli Seed Drop From Grass (Default: " + broccoliSeedDropFromGrassDefault + ")",
						broccoliSeedDropFromGrassDefault)
				.getBoolean(broccoliSeedDropFromGrassDefault);
		cauliflowerSeedDropFromGrass = config
				.get("seeds", "Cauliflower Seed Drop From Grass (Default: " + cauliflowerSeedDropFromGrassDefault + ")",
						cauliflowerSeedDropFromGrassDefault)
				.getBoolean(cauliflowerSeedDropFromGrassDefault);
		celerySeedDropFromGrass = config
				.get("seeds", "Celery Seed Drop From Grass (Default: " + celerySeedDropFromGrassDefault + ")",
						celerySeedDropFromGrassDefault)
				.getBoolean(celerySeedDropFromGrassDefault);
		cranberrySeedDropFromGrass = config
				.get("seeds", "Cranberry Seed Drop From Grass (Default: " + cranberrySeedDropFromGrassDefault + ")",
						cranberrySeedDropFromGrassDefault)
				.getBoolean(cranberrySeedDropFromGrassDefault);
		garlicSeedDropFromGrass = config
				.get("seeds", "Garlic Seed Drop From Grass (Default: " + garlicSeedDropFromGrassDefault + ")",
						garlicSeedDropFromGrassDefault)
				.getBoolean(garlicSeedDropFromGrassDefault);
		gingerSeedDropFromGrass = config
				.get("seeds", "Ginger Seed Drop From Grass (Default: " + gingerSeedDropFromGrassDefault + ")",
						gingerSeedDropFromGrassDefault)
				.getBoolean(gingerSeedDropFromGrassDefault);
		leekSeedDropFromGrass = config
				.get("seeds", "Leek Seed Drop From Grass (Default: " + leekSeedDropFromGrassDefault + ")",
						leekSeedDropFromGrassDefault)
				.getBoolean(leekSeedDropFromGrassDefault);
		lettuceSeedDropFromGrass = config
				.get("seeds", "Lettuce Seed Drop From Grass (Default: " + lettuceSeedDropFromGrassDefault + ")",
						lettuceSeedDropFromGrassDefault)
				.getBoolean(lettuceSeedDropFromGrassDefault);
		oatsSeedDropFromGrass = config
				.get("seeds", "Oats Seed Drop From Grass (Default: " + oatsSeedDropFromGrassDefault + ")",
						oatsSeedDropFromGrassDefault)
				.getBoolean(oatsSeedDropFromGrassDefault);
		onionSeedDropFromGrass = config
				.get("seeds", "Onion Seed Drop From Grass (Default: " + onionSeedDropFromGrassDefault + ")",
						onionSeedDropFromGrassDefault)
				.getBoolean(onionSeedDropFromGrassDefault);
		parsnipSeedDropFromGrass = config
				.get("seeds", "Parsnip Seed Drop From Grass (Default: " + parsnipSeedDropFromGrassDefault + ")",
						parsnipSeedDropFromGrassDefault)
				.getBoolean(parsnipSeedDropFromGrassDefault);
		peanutSeedDropFromGrass = config
				.get("seeds", "Peanut Seed Drop From Grass (Default: " + peanutSeedDropFromGrassDefault + ")",
						peanutSeedDropFromGrassDefault)
				.getBoolean(peanutSeedDropFromGrassDefault);
		pineappleSeedDropFromGrass = config
				.get("seeds", "Pineapple Seed Drop From Grass (Default: " + pineappleSeedDropFromGrassDefault + ")",
						pineappleSeedDropFromGrassDefault)
				.getBoolean(pineappleSeedDropFromGrassDefault);
		radishSeedDropFromGrass = config
				.get("seeds", "Radish Seed Drop From Grass (Default: " + radishSeedDropFromGrassDefault + ")",
						radishSeedDropFromGrassDefault)
				.getBoolean(radishSeedDropFromGrassDefault);
		riceSeedDropFromGrass = config
				.get("seeds", "Rice Seed Drop From Grass (Default: " + riceSeedDropFromGrassDefault + ")",
						riceSeedDropFromGrassDefault)
				.getBoolean(riceSeedDropFromGrassDefault);
		rutabagaSeedDropFromGrass = config
				.get("seeds", "Rutabaga Seed Drop From Grass (Default: " + rutabagaSeedDropFromGrassDefault + ")",
						rutabagaSeedDropFromGrassDefault)
				.getBoolean(rutabagaSeedDropFromGrassDefault);
		ryeSeedDropFromGrass = config.get("seeds",
				"Rye Seed Drop From Grass (Default: " + ryeSeedDropFromGrassDefault + ")", ryeSeedDropFromGrassDefault)
				.getBoolean(ryeSeedDropFromGrassDefault);
		scallionSeedDropFromGrass = config
				.get("seeds", "Scallion Seed Drop From Grass (Default: " + scallionSeedDropFromGrassDefault + ")",
						scallionSeedDropFromGrassDefault)
				.getBoolean(scallionSeedDropFromGrassDefault);
		soybeanSeedDropFromGrass = config
				.get("seeds", "Soybean Seed Drop From Grass (Default: " + soybeanSeedDropFromGrassDefault + ")",
						soybeanSeedDropFromGrassDefault)
				.getBoolean(soybeanSeedDropFromGrassDefault);
		spiceleafSeedDropFromGrass = config
				.get("seeds", "Spiceleaf Seed Drop From Grass (Default: " + spiceleafSeedDropFromGrassDefault + ")",
						spiceleafSeedDropFromGrassDefault)
				.getBoolean(spiceleafSeedDropFromGrassDefault);
		sunflowerSeedDropFromGrass = config
				.get("seeds", "Sunflower Seed Drop From Grass (Default: " + sunflowerSeedDropFromGrassDefault + ")",
						sunflowerSeedDropFromGrassDefault)
				.getBoolean(sunflowerSeedDropFromGrassDefault);
		sweetpotatoSeedDropFromGrass = config
				.get("seeds", "Sweetpotato Seed Drop From Grass (Default: " + sweetpotatoSeedDropFromGrassDefault + ")",
						sweetpotatoSeedDropFromGrassDefault)
				.getBoolean(sweetpotatoSeedDropFromGrassDefault);
		teaSeedDropFromGrass = config.get("seeds",
				"Tea Seed Drop From Grass (Default: " + teaSeedDropFromGrassDefault + ")", teaSeedDropFromGrassDefault)
				.getBoolean(teaSeedDropFromGrassDefault);
		turnipSeedDropFromGrass = config
				.get("seeds", "Turnip Seed Drop From Grass (Default: " + turnipSeedDropFromGrassDefault + ")",
						turnipSeedDropFromGrassDefault)
				.getBoolean(turnipSeedDropFromGrassDefault);
		whitemushroomSeedDropFromGrass = config.get("seeds",
				"Whitemushroom Seed Drop From Grass (Default: " + whitemushroomSeedDropFromGrassDefault + ")",
				whitemushroomSeedDropFromGrassDefault).getBoolean(whitemushroomSeedDropFromGrassDefault);

		artichokeSeedDropFromGrass = config
				.get("seeds", "Artichoke Seed Drop From Grass (Default: " + artichokeSeedDropFromGrassDefault + ")",
						artichokeSeedDropFromGrassDefault)
				.getBoolean(artichokeSeedDropFromGrassDefault);
		bambooShootSeedDropFromGrass = config
				.get("seeds", "BambooShoot Seed Drop From Grass (Default: " + bambooShootSeedDropFromGrassDefault + ")",
						bambooShootSeedDropFromGrassDefault)
				.getBoolean(bambooShootSeedDropFromGrassDefault);
		bellpepperSeedDropFromGrass = config
				.get("seeds", "Bellpepper Seed Drop From Grass (Default: " + bellpepperSeedDropFromGrassDefault + ")",
						bellpepperSeedDropFromGrassDefault)
				.getBoolean(bellpepperSeedDropFromGrassDefault);
		blackberrySeedDropFromGrass = config
				.get("seeds", "Blackberry Seed Drop From Grass (Default: " + blackberrySeedDropFromGrassDefault + ")",
						blackberrySeedDropFromGrassDefault)
				.getBoolean(blackberrySeedDropFromGrassDefault);
		blueberrySeedDropFromGrass = config
				.get("seeds", "Blueberry Seed Drop From Grass (Default: " + blueberrySeedDropFromGrassDefault + ")",
						blueberrySeedDropFromGrassDefault)
				.getBoolean(blueberrySeedDropFromGrassDefault);
		brusselSproutSeedDropFromGrass = config.get("seeds",
				"BrusselSprout Seed Drop From Grass (Default: " + brusselSproutSeedDropFromGrassDefault + ")",
				brusselSproutSeedDropFromGrassDefault).getBoolean(brusselSproutSeedDropFromGrassDefault);
		cabbageSeedDropFromGrass = config
				.get("seeds", "Cabbage Seed Drop From Grass (Default: " + cabbageSeedDropFromGrassDefault + ")",
						cabbageSeedDropFromGrassDefault)
				.getBoolean(cabbageSeedDropFromGrassDefault);
		cactusFruitSeedDropFromGrass = config
				.get("seeds", "CactusFruit Seed Drop From Grass (Default: " + cactusFruitSeedDropFromGrassDefault + ")",
						cactusFruitSeedDropFromGrassDefault)
				.getBoolean(cactusFruitSeedDropFromGrassDefault);
		candleberrySeedDropFromGrass = config
				.get("seeds", "Candleberry Seed Drop From Grass (Default: " + candleberrySeedDropFromGrassDefault + ")",
						candleberrySeedDropFromGrassDefault)
				.getBoolean(candleberrySeedDropFromGrassDefault);
		cantaloupeSeedDropFromGrass = config
				.get("seeds", "Cantaloupe Seed Drop From Grass (Default: " + cantaloupeSeedDropFromGrassDefault + ")",
						cantaloupeSeedDropFromGrassDefault)
				.getBoolean(cantaloupeSeedDropFromGrassDefault);
		chilipepperSeedDropFromGrass = config
				.get("seeds", "Chilipepper Seed Drop From Grass (Default: " + chilipepperSeedDropFromGrassDefault + ")",
						chilipepperSeedDropFromGrassDefault)
				.getBoolean(chilipepperSeedDropFromGrassDefault);
		coffeeSeedDropFromGrass = config
				.get("seeds", "Coffee Seed Drop From Grass (Default: " + coffeeSeedDropFromGrassDefault + ")",
						coffeeSeedDropFromGrassDefault)
				.getBoolean(coffeeSeedDropFromGrassDefault);
		cornSeedDropFromGrass = config
				.get("seeds", "Corn Seed Drop From Grass (Default: " + cornSeedDropFromGrassDefault + ")",
						cornSeedDropFromGrassDefault)
				.getBoolean(cornSeedDropFromGrassDefault);
		cottonSeedDropFromGrass = config
				.get("seeds", "Cotton Seed Drop From Grass (Default: " + cottonSeedDropFromGrassDefault + ")",
						cottonSeedDropFromGrassDefault)
				.getBoolean(cottonSeedDropFromGrassDefault);
		cucumberSeedDropFromGrass = config
				.get("seeds", "Cucumber Seed Drop From Grass (Default: " + cucumberSeedDropFromGrassDefault + ")",
						cucumberSeedDropFromGrassDefault)
				.getBoolean(cucumberSeedDropFromGrassDefault);
		eggplantSeedDropFromGrass = config
				.get("seeds", "Eggplant Seed Drop From Grass (Default: " + eggplantSeedDropFromGrassDefault + ")",
						eggplantSeedDropFromGrassDefault)
				.getBoolean(eggplantSeedDropFromGrassDefault);
		grapeSeedDropFromGrass = config
				.get("seeds", "Grape Seed Drop From Grass (Default: " + grapeSeedDropFromGrassDefault + ")",
						grapeSeedDropFromGrassDefault)
				.getBoolean(grapeSeedDropFromGrassDefault);
		kiwiSeedDropFromGrass = config
				.get("seeds", "Kiwi Seed Drop From Grass (Default: " + kiwiSeedDropFromGrassDefault + ")",
						kiwiSeedDropFromGrassDefault)
				.getBoolean(kiwiSeedDropFromGrassDefault);
		mustardSeedDropFromGrass = config
				.get("seeds", "Mustard Seed Drop From Grass (Default: " + mustardSeedDropFromGrassDefault + ")",
						mustardSeedDropFromGrassDefault)
				.getBoolean(mustardSeedDropFromGrassDefault);
		okraSeedDropFromGrass = config
				.get("seeds", "Okra Seed Drop From Grass (Default: " + okraSeedDropFromGrassDefault + ")",
						okraSeedDropFromGrassDefault)
				.getBoolean(okraSeedDropFromGrassDefault);
		peasSeedDropFromGrass = config
				.get("seeds", "Peas Seed Drop From Grass (Default: " + peasSeedDropFromGrassDefault + ")",
						peasSeedDropFromGrassDefault)
				.getBoolean(peasSeedDropFromGrassDefault);
		raspberrySeedDropFromGrass = config
				.get("seeds", "Raspberry Seed Drop From Grass (Default: " + raspberrySeedDropFromGrassDefault + ")",
						raspberrySeedDropFromGrassDefault)
				.getBoolean(raspberrySeedDropFromGrassDefault);
		rhubarbSeedDropFromGrass = config
				.get("seeds", "Rhubarb Seed Drop From Grass (Default: " + rhubarbSeedDropFromGrassDefault + ")",
						rhubarbSeedDropFromGrassDefault)
				.getBoolean(rhubarbSeedDropFromGrassDefault);
		seaweedSeedDropFromGrass = config
				.get("seeds", "Seaweed Seed Drop From Grass (Default: " + seaweedSeedDropFromGrassDefault + ")",
						seaweedSeedDropFromGrassDefault)
				.getBoolean(seaweedSeedDropFromGrassDefault);
		strawberrySeedDropFromGrass = config
				.get("seeds", "Strawberry Seed Drop From Grass (Default: " + strawberrySeedDropFromGrassDefault + ")",
						strawberrySeedDropFromGrassDefault)
				.getBoolean(strawberrySeedDropFromGrassDefault);
		tomatoSeedDropFromGrass = config
				.get("seeds", "Tomato Seed Drop From Grass (Default: " + tomatoSeedDropFromGrassDefault + ")",
						tomatoSeedDropFromGrassDefault)
				.getBoolean(tomatoSeedDropFromGrassDefault);
		wintersquashSeedDropFromGrass = config.get("seeds",
				"Wintersquash Seed Drop From Grass (Default: " + wintersquashSeedDropFromGrassDefault + ")",
				wintersquashSeedDropFromGrassDefault).getBoolean(wintersquashSeedDropFromGrassDefault);
		zucchiniSeedDropFromGrass = config
				.get("seeds", "Zucchini Seed Drop From Grass (Default: " + zucchiniSeedDropFromGrassDefault + ")",
						zucchiniSeedDropFromGrassDefault)
				.getBoolean(zucchiniSeedDropFromGrassDefault);
	}
}
