package cc_harvest.items;

import cc_harvest.Config;
import cc_harvest.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item[] cropItems;
	public static Item[] seeds;
	public static Item[] seedsBox;
	public static Item[] seedsPacket;
	public static Item[] temperateFruits;
	public static Item[] warmFruits;
	public static Item[] logFruits;

	// Tools
	public static ModItemTool bakewareItem;
	public static ModItemBlockTool cuttingboardItem;
	public static ModItemTool juicerItem;
	public static ModItemTool mixingBowlItem;
	public static ModItemTool mortarAndPestleItem;
	public static ModItemBlockTool potItem;
	public static ModItemTool saucepanItem;
	public static ModItemTool skilletItem;

	// Book
	public static Item cookBookItem;

	// Bees
	public static ModItem beeswaxItem;
	public static ModItem waxItem;
	public static ModItem grubItem;
	public static ModItem honeycombItem;
	public static ModItemFood honeyItem;
	public static ModItemBee queenBeeItem;
	public static ModItem royalJellyItem;
	public static ModItem waxcombItem;

	// Item
	public static ModItem blackPepperItem;
	public static ModItem bubblyWaterItem;
	public static ModItem butterItem;
	public static ModItem cocoaPowderItem;
	public static ModItem cornmealItem;
	public static ModItem doughItem;
	public static ModItem flourItem;
	public static ModItem freshMilkItem;
	public static ModItem freshWaterItem;
	public static ModItem groundCinnamonItem;
	public static ModItem groundNutmegItem;
	public static ModItem hardenedLeatherItem;
	public static ModItem heavyCreamItem;
	public static ModItem ketchupItem;
	public static ModItem mayoItem;
	public static ModItem mustardItem;
	public static ModItem oliveOilItem;
	public static ModItem pastaItem;
	public static ModItem saladDressingItem;
	public static ModItem saltItem;
	public static ModItem vanillaItem;
	public static ModItem vinegarItem;
	public static ModItem wovenCottonItem;

	// Armor
	public static ModItemArmor hardenedLeatherHelmetItem;
	public static ModItemArmor hardenedLeatherChestplateItem;
	public static ModItemArmor hardenedLeatherLeggingsItem;
	public static ModItemArmor hardenedLeatherBootsItem;
	public static ItemArmor.ArmorMaterial armorhardenedLeather = EnumHelper.addArmorMaterial("hardenedLeather",
			"hardenedLeather", 15, new int[] { 2, 6, 5, 2 }, 9);

	// Animal
	public static ModItemFood calamariRawItem;
	public static ModItemFood calamariCookedItem;
	public static ModItemFood muttonRawItem;
	public static ModItemFood muttonCookedItem;
	public static ModItemFood sunflowerSeedsItem;

	// Crops
	public static ModItemFood artichokeItem;
	public static ModItemFood asparagusItem;
	public static ModItemFood bambooShootItem;
	public static ModItemFood barleyItem;
	public static ModItemFood beanItem;
	public static ModItemFood beetItem;
	public static ModItemFood bellpepperItem;
	public static ModItemFood blackberryItem;
	public static ModItemFood blueberryItem;
	public static ModItemFood broccoliItem;
	public static ModItemFood brusselSproutItem;
	public static ModItemFood cabbageItem;
	public static ModItemFood cactusFruitItem;
	public static ModItemFood candleberryItem;
	public static ModItemFood cantaloupeItem;
	public static ModItemFood cauliflowerItem;
	public static ModItemFood celeryItem;
	public static ModItemFood chilipepperItem;
	public static ModItemFood coffeeBeanItem;
	public static ModItemFood cornItem;
	public static ModItemSeeds cottonItem;
	public static ModItemFood cranberryItem;
	public static ModItemFood cucumberItem;
	public static ModItemFood edibleRootItem;
	public static ModItemFood eggplantItem;
	public static ModItemFood garlicItem;
	public static ModItemFood gingerItem;
	public static ModItemFood grapeItem;
	public static ModItemFood kiwiItem;
	public static ModItemFood leekItem;
	public static ModItemFood lettuceItem;
	public static ModItemFood mustardSeedsItem;
	public static ModItemFood oatsItem;
	public static ModItemFood okraItem;
	public static ModItemFood onionItem;
	public static ModItemFood parsnipItem;
	public static ModItemFood peanutItem;
	public static ModItemFood peasItem;
	public static ModItemFood pineappleItem;
	public static ModItemFood radishItem;
	public static ModItemFood raspberryItem;
	public static ModItemFood rhubarbItem;
	public static ModItemFood riceItem;
	public static ModItemFood rutabagaItem;
	public static ModItemFood ryeItem;
	public static ModItemFood scallionItem;
	public static ModItemFood seaweedItem;
	public static ModItemFood soybeanItem;
	public static ModItemFood spiceleafItem;
	public static ModItemFood strawberryItem;
	public static ModItemFood sweetPotatoItem;
	public static ModItemFood teaLeafItem;
	public static ModItemFood tomatoItem;
	public static ModItemFood turnipItem;
	public static ModItemFood whiteMushroomItem;
	public static ModItemFood winterSquashItem;
	public static ModItemFood zucchiniItem;

	// Seed
	public static ModItemSeeds artichokeSeedItem;
	public static ModItemSeeds asparagusSeedItem;
	public static ModItemSeeds bambooShootSeedItem;
	public static ModItemSeeds barleySeedItem;
	public static ModItemSeeds beanSeedItem;
	public static ModItemSeeds beetSeedItem;
	public static ModItemSeeds bellpepperSeedItem;
	public static ModItemSeeds blackberrySeedItem;
	public static ModItemSeeds blueberrySeedItem;
	public static ModItemSeeds broccoliSeedItem;
	public static ModItemSeeds brusselSproutSeedItem;
	public static ModItemSeeds cabbageSeedItem;
	public static ModItemSeeds cactusFruitSeedItem;
	public static ModItemSeeds candleberrySeedItem;
	public static ModItemSeeds cantaloupeSeedItem;
	public static ModItemSeeds cauliflowerSeedItem;
	public static ModItemSeeds celerySeedItem;
	public static ModItemSeeds chilipepperSeedItem;
	public static ModItemSeeds coffeeBeanSeedItem;
	public static ModItemSeeds cornSeedItem;
	public static ModItemSeeds cottonSeedItem;
	public static ModItemSeeds cranberrySeedItem;
	public static ModItemSeeds cucumberSeedItem;
	public static ModItemSeeds eggplantSeedItem;
	public static ModItemSeeds garlicSeedItem;
	public static ModItemSeeds gingerSeedItem;
	public static ModItemSeeds grapeSeedItem;
	public static ModItemSeeds kiwiSeedItem;
	public static ModItemSeeds leekSeedItem;
	public static ModItemSeeds lettuceSeedItem;
	public static ModItemSeeds mustardSeedItem;
	public static ModItemSeeds oatsSeedItem;
	public static ModItemSeeds okraSeedItem;
	public static ModItemSeeds onionSeedItem;
	public static ModItemSeeds parsnipSeedItem;
	public static ModItemSeeds peanutSeedItem;
	public static ModItemSeeds peasSeedItem;
	public static ModItemSeeds pineappleSeedItem;
	public static ModItemSeeds radishSeedItem;
	public static ModItemSeeds raspberrySeedItem;
	public static ModItemSeeds rhubarbSeedItem;
	public static ModItemSeeds riceSeedItem;
	public static ModItemSeeds rutabagaSeedItem;
	public static ModItemSeeds ryeSeedItem;
	public static ModItemSeeds scallionSeedItem;
	public static ModItemSeeds seaweedSeedItem;
	public static ModItemSeeds soybeanSeedItem;
	public static ModItemSeeds spiceleafSeedItem;
	public static ModItemSeeds strawberrySeedItem;
	public static ModItemSeeds sweetPotatoSeedItem;
	public static ModItemSeeds teaLeafSeedItem;
	public static ModItemSeeds tomatoSeedItem;
	public static ModItemSeeds turnipSeedItem;
	public static ModItemSeeds whiteMushroomSeedItem;
	public static ModItemSeeds winterSquashSeedItem;
	public static ModItemSeeds zucchiniSeedItem;

	// Tree
	public static ModItemFood almondItem;
	public static ModItemFood apricotItem;
	public static ModItemFood avocadoItem;
	public static ModItemFood bananaItem;
	public static ModItemFood cashewItem;
	public static ModItemFood cherryItem;
	public static ModItemFood chestnutItem;
	public static ModItemFood cinnamonItem;
	public static ModItemFood coconutItem;
	public static ModItemFood dateItem;
	public static ModItemFood dragonfruitItem;
	public static ModItemFood durianItem;
	public static ModItemFood figItem;
	public static ModItemFood grapefruitItem;
	public static ModItemFood lemonItem;
	public static ModItemFood limeItem;
	public static ModItemFood mapleSyrupItem;
	public static ModItemFood mangoItem;
	public static ModItemFood nutmegItem;
	public static ModItemFood oliveItem;
	public static ModItemFood orangeItem;
	public static ModItemFood papayaItem;
	public static ModItemFood peachItem;
	public static ModItemFood pearItem;
	public static ModItemFood pecanItem;
	public static ModItemFood peppercornItem;
	public static ModItemFood persimmonItem;
	public static ModItemFood pistachioItem;
	public static ModItemFood plumItem;
	public static ModItemFood pomegranateItem;
	public static ModItemFood starfruitItem;
	public static ModItemFood vanillaBeanItem;
	public static ModItemFood walnutItem;

	// Cooked
	public static ModItemFood bakedSweetPotatoItem;
	public static ModItemFood coffeeItem;
	public static ModItemFood grilledAsparagusItem;
	public static ModItemFood grilledEggplantItem;
	public static ModItemFood popcornItem;
	public static ModItemFood raisinsItem;
	public static ModItemFood teaItem;
	public static ModItemFood toastedCoconutItem;

	// Item 1
	public static ModItemFood toastItem;
	public static ModItemFood cheeseItem;
	public static ModItemFood iceCreamItem;
	public static ModItemFood grilledCheeseItem;
	public static ModItemFood appleSauceItem;
	public static ModItemFood caramelAppleItem;
	public static ModItemFood pumpkinBreadItem;
	public static ModItemFood roastedPumpkinSeedsItem;
	public static ModItemFood glazedCarrotsItem;
	public static ModItemFood butteredPotatoItem;
	public static ModItemFood loadedBakedPotatoItem;
	public static ModItemFood mashedPotatoesItem;
	public static ModItemFood friesItem;
	public static ModItemFood grilledMushroomItem;
	public static ModItemFood stuffedMushroomItem;
	public static ModItemFood breadedPorkchopItem;
	public static ModItemFood hotdogItem;
	public static ModItemFood bakedHamItem;
	public static ModItemFood hamburgerItem;
	public static ModItemFood cheeseburgerItem;
	public static ModItemFood baconCheeseburgerItem;
	public static ModItemFood potRoastItem;
	public static ModItemFood fishSticksItem;
	public static ModItemFood fishAndChipsItem;
	public static ModItemFood friedEggItem;
	public static ModItemFood scrambledEggItem;
	public static ModItemFood boiledEggItem;
	public static ModItemFood caramelItem;
	public static ModItemFood taffyItem;
	public static ModItemFood zombieJerkyItem;

	// Item 2
	public static ModItemFood chocolateBarItem;
	public static ModItemFood hotChocolateItem;
	public static ModItemFood chocolateIceCreamItem;
	public static ModItemFood stockItem;
	public static ModItemFood spagettiItem;
	public static ModItemFood spagettiAndMeatballsItem;
	public static ModItemFood chickenParmasanItem;
	public static ModItemFood pizzaItem;
	public static ModItemFood porkLettuceWrapItem;
	public static ModItemFood fishLettuceWrapItem;
	public static ModItemFood bltItem;
	public static ModItemFood deluxeCheeseburgerItem;
	public static ModItemFood delightedMealItem;
	public static ModItemFood potatoCakesItem;
	public static ModItemFood hashItem;
	public static ModItemFood braisedOnionsItem;
	public static ModItemFood heartyBreakfastItem;
	public static ModItemFood cornOnTheCobItem;
	public static ModItemFood cornbreadItem;
	public static ModItemFood tortillaItem;
	public static ModItemFood nachoesItem;
	public static ModItemFood tacoItem;
	public static ModItemFood fishTacoItem;
	public static ModItemFood creamedCornItem;
	public static ModItemFood chocolateStrawberryItem;
	public static ModItemFood peanutButterItem;
	public static ModItemFood trailMixItem;
	public static ModItemFood PBAndJItem;
	public static ModItemFood peanutButterCookiesItem;
	public static ModItemFood raisinCookiesItem;
	public static ModItemFood picklesItem;

	// Item 3
	public static ModItemFood vegetarianLettuceWrapItem;
	public static ModItemFood marinatedCucumbersItem;
	public static ModItemFood friedRiceItem;
	public static ModItemFood mushroomRisottoItem;
	public static ModItemFood curryItem;
	public static ModItemFood rainbowCurryItem;
	public static ModItemFood refriedBeansItem;
	public static ModItemFood bakedBeansItem;
	public static ModItemFood beansAndRiceItem;
	public static ModItemFood chiliItem;
	public static ModItemFood beanBurritoItem;
	public static ModItemFood stuffedPepperItem;
	public static ModItemFood veggieStirfryItem;
	public static ModItemFood grilledSkewersItem;
	public static ModItemFood supremePizzaItem;
	public static ModItemFood omeletItem;
	public static ModItemFood hotWingsItem;
	public static ModItemFood chiliPoppersItem;
	public static ModItemFood extremeChiliItem;
	public static ModItemFood chiliChocolateItem;
	public static ModItemFood lemonaideItem;
	public static ModItemFood lemonBarItem;
	public static ModItemFood fishDinnerItem;
	public static ModItemFood lemonMeringueItem;
	public static ModItemFood candiedLemonItem;
	public static ModItemFood lemonChickenItem;
	public static ModItemFood blueberryMuffinItem;
	public static ModItemFood pancakesItem;
	public static ModItemFood blueberryPancakesItem;
	public static ModItemFood chocolateCherryItem;
	public static ModItemFood stuffedEggplantItem;
	public static ModItemFood eggplantParmItem;
	public static ModItemFood raspberryIcedTeaItem;
	public static ModItemFood chaiTeaItem;
	public static ModItemFood espressoItem;
	public static ModItemFood coffeeConLecheItem;
	public static ModItemFood mochaIceCreamItem;
	public static ModItemFood pickledBeetsItem;
	public static ModItemFood bakedBeetsItem;
	public static ModItemFood broccoliMacItem;

	// Item 4
	public static ModItemFood broccoliNDipItem;
	public static ModItemFood candiedSweetPotatoesItem;
	public static ModItemFood mashedSweetPotatoesItem;
	public static ModItemFood steamedPeasItem;
	public static ModItemFood pineappleHamItem;
	public static ModItemFood roastedRootVeggieMedleyItem;
	public static ModItemFood bakedTurnipsItem;
	public static ModItemFood gingerBreadItem;
	public static ModItemFood gingerSnapsItem;
	public static ModItemFood candiedGingerItem;
	public static ModItemFood softPretzelAndMustardItem;
	public static ModItemFood spicyMustardPorkItem;
	public static ModItemFood spicyGreensItem;
	public static ModItemFood garlicBreadItem;
	public static ModItemFood garlicMashedPotatoesItem;
	public static ModItemFood garlicChickenItem;
	public static ModItemFood summerSquashWithRadishItem;
	public static ModItemFood celeryAndPeanutButterItem;
	public static ModItemFood chickenCeleryCasseroleItem;
	public static ModItemFood peasAndCeleryItem;
	public static ModItemFood zucchiniBreadItem;
	public static ModItemFood zucchiniFriesItem;
	public static ModItemFood zestyZucchiniItem;
	public static ModItemFood zucchiniBakeItem;
	public static ModItemFood asparagusQuicheItem;
	public static ModItemFood walnutRaisinBreadItem;
	public static ModItemFood candiedWalnutsItem;
	public static ModItemFood brownieItem;
	public static ModItemFood guacamoleItem;
	public static ModItemFood avocadoBurritoItem;
	public static ModItemFood poachedPearItem;
	public static ModItemFood fruitCrumbleItem;
	public static ModItemFood bananaSplitItem;

	// Item 5
	public static ModItemFood bananaNutBreadItem;
	public static ModItemFood coconutMilkItem;
	public static ModItemFood chickenCurryItem;
	public static ModItemFood coconutShrimpItem;
	public static ModItemFood orangeChickenItem;
	public static ModItemFood peachCobblerItem;
	public static ModItemFood cinnamonRollItem;
	public static ModItemFood frenchToastItem;
	public static ModItemFood marshmellowsItem;
	public static ModItemFood donutItem;
	public static ModItemFood chocolateDonutItem;
	public static ModItemFood powderedDonutItem;
	public static ModItemFood jellyDonutItem;
	public static ModItemFood frostedDonutItem;
	public static ModItemFood wafflesItem;
	public static ModItemFood softPretzelItem;
	public static ModItemFood jellybeansItem;
	public static ModItemFood biscuitItem;
	public static ModItemFood creamCookieItem;
	public static ModItemFood jaffaItem;
	public static ModItemFood friedChickenItem;
	public static ModItemFood footlongItem;

	// Item 6
	public static ModItemFood blackberryCobblerItem;
	public static ModItemFood chocolateMilkItem;
	public static ModItemFood cinnamonSugarDonutItem;
	public static ModItemFood saltedSunflowerSeedsItem;
	public static ModItemFood sunflowerWheatRollsItem;
	public static ModItemFood cranberrySauceItem;
	public static ModItemFood cranberryBarItem;
	public static ModItemFood peppermintItem;
	public static ModItemFood baklavaItem;
	public static ModItemFood gummyBearsItem;
	public static ModItemFood baconMushroomBurgerItem;
	public static ModItemFood fruitPunchItem;
	public static ModItemFood meatyStewItem;
	public static ModItemFood pinacoladaItem;
	public static ModItemFood eggNogItem;
	public static ModItemFood custardItem;
	public static ModItemFood sushiItem;

	// Item 7
	public static ModItemFood caramelIceCreamItem;
	public static ModItemFood mintChocolateChipIceCreamItem;
	public static ModItemFood strawberryIceCreamItem;
	public static ModItemFood vanillaIceCreamItem;
	public static ModItemFood gingerChickenItem;
	public static ModItemFood spiceBunItem;
	public static ModItemFood gingeredRhubarbTartItem;
	public static ModItemFood honeyLemonLambItem;
	public static ModItemFood pumpkinOatSconesItem;
	public static ModItemFood beefJerkyItem;
	public static ModItemFood ovenRoastedCauliflowerItem;
	public static ModItemFood herbButterParsnipsItem;
	public static ModItemFood scallionBakedPotatoItem;
	public static ModItemFood soyMilkItem;
	public static ModItemFood firmTofuItem;
	public static ModItemFood silkenTofuItem;

	// Soda
	public static ItemFood cherrySodaItem;
	public static ItemFood colaSodaItem;
	public static ItemFood gingerSodaItem;
	public static ItemFood grapeSodaItem;
	public static ItemFood lemonLimeSodaItem;
	public static ItemFood orangeSodaItem;
	public static ItemFood rootbeerSodaItem;
	public static ItemFood strawberrySodaItem;
	public static ItemFood grapefruitSodaItem;

	// Juice
	public static ModItemFood appleJuiceItem;
	public static ModItemFood apricotJuiceItem;
	public static ModItemFood blackberryJuiceItem;
	public static ModItemFood blueberryJuiceItem;
	public static ModItemFood cactusFruitJuiceItem;
	public static ModItemFood carrotJuiceItem;
	public static ModItemFood cherryJuiceItem;
	public static ModItemFood cranberryJuiceItem;
	public static ModItemFood figJuiceItem;
	public static ModItemFood grapefruitJuiceItem;
	public static ModItemFood grapeJuiceItem;
	public static ModItemFood kiwiJuiceItem;
	public static ModItemFood limeJuiceItem;
	public static ModItemFood mangoJuiceItem;
	public static ModItemFood melonJuiceItem;
	public static ModItemFood orangeJuiceItem;
	public static ModItemFood papayaJuiceItem;
	public static ModItemFood peachJuiceItem;
	public static ModItemFood pearJuiceItem;
	public static ModItemFood persimmonJuiceItem;
	public static ModItemFood plumJuiceItem;
	public static ModItemFood pomegranateJuiceItem;
	public static ModItemFood raspberryJuiceItem;
	public static ModItemFood starfruitJuiceItem;
	public static ModItemFood strawberryJuiceItem;

	// Jelly
	public static ModItemFood appleJellyItem;
	public static ModItemFood apricotJellyItem;
	public static ModItemFood blackberryJellyItem;
	public static ModItemFood blueberryJellyItem;
	public static ModItemFood cherryJellyItem;
	public static ModItemFood cranberryJellyItem;
	public static ModItemFood figJellyItem;
	public static ModItemFood grapefruitJellyItem;
	public static ModItemFood grapeJellyItem;
	public static ModItemFood kiwiJellyItem;
	public static ModItemFood lemonJellyItem;
	public static ModItemFood limeJellyItem;
	public static ModItemFood mangoJellyItem;
	public static ModItemFood orangeJellyItem;
	public static ModItemFood papayaJellyItem;
	public static ModItemFood peachJellyItem;
	public static ModItemFood persimmonJellyItem;
	public static ModItemFood pomegranateJellyItem;
	public static ModItemFood raspberryJellyItem;
	public static ModItemFood starfruitJellyItem;
	public static ModItemFood strawberryJellyItem;
	public static ModItemFood watermelonJellyItem;

	// Smoothie
	public static ModItemFood apricotSmoothieItem;
	public static ModItemFood bananaSmoothieItem;
	public static ModItemFood blackberrySmoothieItem;
	public static ModItemFood blueberrySmoothieItem;
	public static ModItemFood cherrySmoothieItem;
	public static ModItemFood figSmoothieItem;
	public static ModItemFood grapefruitSmoothieItem;
	public static ModItemFood kiwiSmoothieItem;
	public static ModItemFood lemonSmoothieItem;
	public static ModItemFood limeSmoothieItem;
	public static ModItemFood mangoSmoothieItem;
	public static ModItemFood melonSmoothieItem;
	public static ModItemFood orangeSmoothieItem;
	public static ModItemFood papayaSmoothieItem;
	public static ModItemFood peachSmoothieItem;
	public static ModItemFood persimmonSmoothieItem;
	public static ModItemFood pomegranateSmoothieItem;
	public static ModItemFood raspberrySmoothieItem;
	public static ModItemFood starfruitSmoothieItem;
	public static ModItemFood strawberrySmoothieItem;

	// Yogurt
	public static ModItemFood appleYogurtItem;
	public static ModItemFood apricotYogurtItem;
	public static ModItemFood bananaYogurtItem;
	public static ModItemFood blackberryYogurtItem;
	public static ModItemFood blueberryYogurtItem;
	public static ModItemFood cherryYogurtItem;
	public static ModItemFood chocolateYogurtItem;
	public static ModItemFood coconutYogurtItem;
	public static ModItemFood figYogurtItem;
	public static ModItemFood grapefruitYogurtItem;
	public static ModItemFood grapeYogurtItem;
	public static ModItemFood kiwiYogurtItem;
	public static ModItemFood lemonYogurtItem;
	public static ModItemFood limeYogurtItem;
	public static ModItemFood mangoYogurtItem;
	public static ModItemFood melonYogurtItem;
	public static ModItemFood orangeYogurtItem;
	public static ModItemFood papayaYogurtItem;
	public static ModItemFood peachYogurtItem;
	public static ModItemFood pearYogurtItem;
	public static ModItemFood persimmonYogurtItem;
	public static ModItemFood pineappleYogurtItem;
	public static ModItemFood plainYogurtItem;
	public static ModItemFood plumYogurtItem;
	public static ModItemFood pomegranateYogurtItem;
	public static ModItemFood pumpkinYogurtItem;
	public static ModItemFood raspberryYogurtItem;
	public static ModItemFood starfruitYogurtItem;
	public static ModItemFood strawberryYogurtItem;
	public static ModItemFood vanillaYogurtItem;

	// Sandwich
	public static ModItemFood chickenSandwichItem;
	public static ModItemFood fishSandwichItem;
	public static ModItemFood leafyChickenSandwichItem;
	public static ModItemFood leafyFishSandwichItem;
	public static ModItemFood toastSandwichItem;

	// Jelly Sandwich
	public static ModItemFood appleJellySandwichItem;
	public static ModItemFood apricotJellySandwichItem;
	public static ModItemFood blackberryJellySandwichItem;
	public static ModItemFood blueberryJellySandwichItem;
	public static ModItemFood cherryJellySandwichItem;
	public static ModItemFood cranberryJellySandwichItem;
	public static ModItemFood figJellySandwichItem;
	public static ModItemFood grapefruitJellySandwichItem;
	public static ModItemFood kiwiJellySandwichItem;
	public static ModItemFood lemonJellySandwichItem;
	public static ModItemFood limeJellySandwichItem;
	public static ModItemFood mangoJellySandwichItem;
	public static ModItemFood orangeJellySandwichItem;
	public static ModItemFood papayaJellySandwichItem;
	public static ModItemFood peachJellySandwichItem;
	public static ModItemFood persimmonJellySandwichItem;
	public static ModItemFood pomegranateJellySandwichItem;
	public static ModItemFood raspberryJellySandwichItem;
	public static ModItemFood starfruitJellySandwichItem;
	public static ModItemFood strawberryJellySandwichItem;
	public static ModItemFood watermelonJellySandwichItem;

	// Soup
	public static ModItemFood asparagusSoupItem;
	public static ModItemFood beetSoupItem;
	public static ModItemFood cactusSoupItem;
	public static ModItemFood carrotSoupItem;
	public static ModItemFood celerySoupItem;
	public static ModItemFood chickenNoodleSoupItem;
	public static ModItemFood creamedBroccoliSoupItem;
	public static ModItemFood creamOfAvocadoSoupItem;
	public static ModItemFood cucumberSoupItem;
	public static ModItemFood gardenSoupItem;
	public static ModItemFood lambBarleySoupItem;
	public static ModItemFood leekBaconSoupItem;
	public static ModItemFood oldWorldVeggieSoupItem;
	public static ModItemFood onionSoupItem;
	public static ModItemFood potatoSoupItem;
	public static ModItemFood pumpkinSoupItem;
	public static ModItemFood riceSoupItem;
	public static ModItemFood seedSoupItem;
	public static ModItemFood spiderEyeSoupItem;
	public static ModItemFood splitPeaSoupItem;
	public static ModItemFood tomatoSoupItem;
	public static ModItemFood turnipSoupItem;
	public static ModItemFood vegetableSoupItem;

	// Pie
	public static ModItemFood applePieItem;
	public static ModItemFood blueberryPieItem;
	public static ModItemFood cherryPieItem;
	public static ModItemFood chickenPotPieItem;
	public static ModItemFood keylimePieItem;
	public static ModItemFood pecanPieItem;
	public static ModItemFood raspberryPieItem;
	public static ModItemFood shepardsPieItem;
	public static ModItemFood strawberryPieItem;
	public static ModItemFood sweetPotatoPieItem;

	// Salad
	public static ModItemFood beetSaladItem;
	public static ModItemFood citrusSaladItem;
	public static ModItemFood cucumberSaladItem;
	public static ModItemFood eggSaladItem;
	public static ModItemFood fruitSaladItem;
	public static ModItemFood grapeSaladItem;
	public static ModItemFood mixedSaladItem;
	public static ModItemFood potatoSaladItem;
	public static ModItemFood springSaladItem;
	public static ModItemFood strawberrySaladItem;
	public static ModItemFood summerRadishSaladItem;
	public static ModItemFood sunflowerBroccoliSaladItem;

	// Cake
	public static ModItemFood carrotCakeItem;
	public static ModItemFood cheesecakeItem;
	public static ModItemFood cherryCheesecakeItem;
	public static ModItemFood chocolateSprinkleCakeItem;
	public static ModItemFood pineappleUpsidedownCakeItem;
	public static ModItemFood redVelvetCakeItem;
	public static ModItemFood riceCakeItem;

	// Other
	public static ModItemFood bambooSteamedRiceItem;
	public static ModItemFood roastedChestnutItem;
	public static ModItemFood sweetPotatoSouffleItem;
	public static ModItemFood cashewChickenItem;
	public static ModItemFood apricotGlazedPorkItem;
	public static ModItemFood figBarItem;
	public static ModItemFood pralinesItem;
	public static ModItemFood pistachioBakedSalmonItem;
	public static ModItemFood baconWrappedDatesItem;
	public static ModItemFood dateNutBreadItem;
	public static ModItemFood mapleSyrupPancakesItem;
	public static ModItemFood mapleSyrupWafflesItem;
	public static ModItemFood mapleSausageItem;
	public static ModItemFood mapleOatmealItem;
	public static ModItemFood peachesAndCreamOatmealItem;
	public static ModItemFood cinnamonAppleOatmealItem;
	public static ModItemFood mapleCandiedBaconItem;
	public static ModItemFood potatoAndCheesePirogiItem;
	public static ModItemFood zeppoleItem;
	public static ModItemFood sausageInBreadItem;
	public static ModItemFood chocolateCaramelFudgeItem;
	public static ModItemFood lavenderShortbreadItem;
	public static ModItemFood beefWellingtonItem;
	public static ModItemFood epicBaconItem;
	public static ModItemFood manjuuItem;

	// Seeds Box
	public static ModItemBox artichokeSeedBoxItem;
	public static ModItemBox asparagusSeedBoxItem;
	public static ModItemBox bambooShootSeedBoxItem;
	public static ModItemBox barleySeedBoxItem;
	public static ModItemBox beanSeedBoxItem;
	public static ModItemBox beetSeedBoxItem;
	public static ModItemBox bellpepperSeedBoxItem;
	public static ModItemBox blackberrySeedBoxItem;
	public static ModItemBox blueberrySeedBoxItem;
	public static ModItemBox broccoliSeedBoxItem;
	public static ModItemBox brusselSproutSeedBoxItem;
	public static ModItemBox cabbageSeedBoxItem;
	public static ModItemBox cactusFruitSeedBoxItem;
	public static ModItemBox candleberrySeedBoxItem;
	public static ModItemBox cantaloupeSeedBoxItem;
	public static ModItemBox cauliflowerSeedBoxItem;
	public static ModItemBox celerySeedBoxItem;
	public static ModItemBox chilipepperSeedBoxItem;
	public static ModItemBox coffeeSeedBoxItem;
	public static ModItemBox cornSeedBoxItem;
	public static ModItemBox cottonSeedBoxItem;
	public static ModItemBox cranberrySeedBoxItem;
	public static ModItemBox cucumberSeedBoxItem;
	public static ModItemBox eggplantSeedBoxItem;
	public static ModItemBox garlicSeedBoxItem;
	public static ModItemBox gingerSeedBoxItem;
	public static ModItemBox grapeSeedBoxItem;
	public static ModItemBox kiwiSeedBoxItem;
	public static ModItemBox leekSeedBoxItem;
	public static ModItemBox lettuceSeedBoxItem;
	public static ModItemBox mustardSeedBoxItem;
	public static ModItemBox oatsSeedBoxItem;
	public static ModItemBox okraSeedBoxItem;
	public static ModItemBox onionSeedBoxItem;
	public static ModItemBox parsnipSeedBoxItem;
	public static ModItemBox peanutSeedBoxItem;
	public static ModItemBox peasSeedBoxItem;
	public static ModItemBox pineappleSeedBoxItem;
	public static ModItemBox radishSeedBoxItem;
	public static ModItemBox raspberrySeedBoxItem;
	public static ModItemBox rhubarbSeedBoxItem;
	public static ModItemBox riceSeedBoxItem;
	public static ModItemBox rutabagaSeedBoxItem;
	public static ModItemBox ryeSeedBoxItem;
	public static ModItemBox scallionSeedBoxItem;
	public static ModItemBox seaweedSeedBoxItem;
	public static ModItemBox soybeanSeedBoxItem;
	public static ModItemBox spiceleafSeedBoxItem;
	public static ModItemBox strawberrySeedBoxItem;
	public static ModItemBox sweetPotatoSeedBoxItem;
	public static ModItemBox teaSeedBoxItem;
	public static ModItemBox tomatoSeedBoxItem;
	public static ModItemBox turnipSeedBoxItem;
	public static ModItemBox whiteMushroomSeedBoxItem;
	public static ModItemBox winterSquashSeedBoxItem;
	public static ModItemBox zucchiniSeedBoxItem;

	// Seeds Packet
	public static ModItemPacket artichokeSeedPacketItem;
	public static ModItemPacket asparagusSeedPacketItem;
	public static ModItemPacket bambooShootSeedPacketItem;
	public static ModItemPacket barleySeedPacketItem;
	public static ModItemPacket beanSeedPacketItem;
	public static ModItemPacket beetSeedPacketItem;
	public static ModItemPacket bellpepperSeedPacketItem;
	public static ModItemPacket blackberrySeedPacketItem;
	public static ModItemPacket blueberrySeedPacketItem;
	public static ModItemPacket broccoliSeedPacketItem;
	public static ModItemPacket brusselSproutSeedPacketItem;
	public static ModItemPacket cabbageSeedPacketItem;
	public static ModItemPacket cactusFruitSeedPacketItem;
	public static ModItemPacket candleberrySeedPacketItem;
	public static ModItemPacket cantaloupeSeedPacketItem;
	public static ModItemPacket cauliflowerSeedPacketItem;
	public static ModItemPacket celerySeedPacketItem;
	public static ModItemPacket chilipepperSeedPacketItem;
	public static ModItemPacket coffeeSeedPacketItem;
	public static ModItemPacket cornSeedPacketItem;
	public static ModItemPacket cottonSeedPacketItem;
	public static ModItemPacket cranberrySeedPacketItem;
	public static ModItemPacket cucumberSeedPacketItem;
	public static ModItemPacket eggplantSeedPacketItem;
	public static ModItemPacket garlicSeedPacketItem;
	public static ModItemPacket gingerSeedPacketItem;
	public static ModItemPacket grapeSeedPacketItem;
	public static ModItemPacket kiwiSeedPacketItem;
	public static ModItemPacket leekSeedPacketItem;
	public static ModItemPacket lettuceSeedPacketItem;
	public static ModItemPacket mustardSeedPacketItem;
	public static ModItemPacket oatsSeedPacketItem;
	public static ModItemPacket okraSeedPacketItem;
	public static ModItemPacket onionSeedPacketItem;
	public static ModItemPacket parsnipSeedPacketItem;
	public static ModItemPacket peanutSeedPacketItem;
	public static ModItemPacket peasSeedPacketItem;
	public static ModItemPacket pineappleSeedPacketItem;
	public static ModItemPacket radishSeedPacketItem;
	public static ModItemPacket raspberrySeedPacketItem;
	public static ModItemPacket rhubarbSeedPacketItem;
	public static ModItemPacket riceSeedPacketItem;
	public static ModItemPacket rutabagaSeedPacketItem;
	public static ModItemPacket ryeSeedPacketItem;
	public static ModItemPacket scallionSeedPacketItem;
	public static ModItemPacket seaweedSeedPacketItem;
	public static ModItemPacket soybeanSeedPacketItem;
	public static ModItemPacket spiceleafSeedPacketItem;
	public static ModItemPacket strawberrySeedPacketItem;
	public static ModItemPacket sweetPotatoSeedPacketItem;
	public static ModItemPacket teaSeedPacketItem;
	public static ModItemPacket tomatoSeedPacketItem;
	public static ModItemPacket turnipSeedPacketItem;
	public static ModItemPacket whiteMushroomSeedPacketItem;
	public static ModItemPacket winterSquashSeedPacketItem;
	public static ModItemPacket zucchiniSeedPacketItem;

	public static void main() {
		// Tools
		bakewareItem = new ModItemTool("bakewareItem");
		cuttingboardItem = new ModItemBlockTool("cuttingboardItem", ModBlocks.cuttingBoard);
		juicerItem = new ModItemTool("juicerItem");
		mixingBowlItem = new ModItemTool("mixingBowlItem");
		mortarAndPestleItem = new ModItemTool("mortarAndPestleItem");
		potItem = new ModItemBlockTool("potItem", ModBlocks.pot);
		saucepanItem = new ModItemTool("saucepanItem");
		skilletItem = new ModItemTool("skilletItem");

		ModItems.registerItem(bakewareItem);
		ModItems.registerItem(cuttingboardItem);
		ModItems.registerItem(juicerItem);
		ModItems.registerItem(mixingBowlItem);
		ModItems.registerItem(mortarAndPestleItem);
		ModItems.registerItem(potItem);
		ModItems.registerItem(saucepanItem);
		ModItems.registerItem(skilletItem);

		// Book
		cookBookItem = new ModItem("cookBookItem");

		// ModItems.registerItem(cookBookItem);

		// Bees
		beeswaxItem = new ModItem("beeswaxItem");
		waxItem = new ModItem("waxItem");
		grubItem = new ModItem("grubItem");
		honeycombItem = new ModItem("honeycombItem");
		honeyItem = new ModItemFood("honeyItem", 4, 0.6F, false);
		queenBeeItem = new ModItemBee("queenBeeItem");
		royalJellyItem = new ModItem("royalJellyItem");
		waxcombItem = new ModItem("waxcombItem");

		ModItems.registerItem(beeswaxItem);
		ModItems.registerItem(waxItem);
		ModItems.registerItem(grubItem);
		ModItems.registerItem(honeycombItem);
		ModItems.registerItem(honeyItem);
		ModItems.registerItem(queenBeeItem);
		ModItems.registerItem(royalJellyItem);
		ModItems.registerItem(waxcombItem);

		// Item
		blackPepperItem = new ModItem("blackPepperItem");
		bubblyWaterItem = new ModItem("bubblyWaterItem");
		butterItem = new ModItem("butterItem");
		cocoaPowderItem = new ModItem("cocoaPowderItem");
		cornmealItem = new ModItem("cornmealItem");
		doughItem = new ModItem("doughItem");
		flourItem = new ModItem("flourItem");
		freshMilkItem = new ModItem("freshMilkItem");
		freshWaterItem = new ModItem("freshWaterItem");
		groundCinnamonItem = new ModItem("groundCinnamonItem");
		groundNutmegItem = new ModItem("groundNutmegItem");
		hardenedLeatherItem = new ModItem("hardenedLeatherItem");
		heavyCreamItem = new ModItem("heavyCreamItem");
		ketchupItem = new ModItem("ketchupItem");
		mayoItem = new ModItem("mayoItem");
		mustardItem = new ModItem("mustardItem");
		oliveOilItem = new ModItem("oliveOilItem");
		pastaItem = new ModItem("pastaItem");
		saladDressingItem = new ModItem("saladDressingItem");
		saltItem = new ModItem("saltItem");
		vanillaItem = new ModItem("vanillaItem");
		vinegarItem = new ModItem("vinegarItem");
		wovenCottonItem = new ModItem("wovenCottonItem");

		ModItems.registerItem(blackPepperItem);
		ModItems.registerItem(bubblyWaterItem);
		ModItems.registerItem(butterItem);
		ModItems.registerItem(cocoaPowderItem);
		ModItems.registerItem(cornmealItem);
		ModItems.registerItem(doughItem);
		ModItems.registerItem(flourItem);
		ModItems.registerItem(freshMilkItem);
		ModItems.registerItem(freshWaterItem);
		ModItems.registerItem(groundCinnamonItem);
		ModItems.registerItem(groundNutmegItem);
		ModItems.registerItem(hardenedLeatherItem);
		ModItems.registerItem(heavyCreamItem);
		ModItems.registerItem(ketchupItem);
		ModItems.registerItem(mayoItem);
		ModItems.registerItem(mustardItem);
		ModItems.registerItem(oliveOilItem);
		ModItems.registerItem(pastaItem);
		ModItems.registerItem(saladDressingItem);
		ModItems.registerItem(saltItem);
		ModItems.registerItem(vanillaItem);
		ModItems.registerItem(vinegarItem);
		ModItems.registerItem(wovenCottonItem);

		// Armor
		hardenedLeatherHelmetItem = new ModItemArmor(armorhardenedLeather, 0, "hardenedLeatherHelmetItem",
				"hardenedLeather");
		hardenedLeatherChestplateItem = new ModItemArmor(armorhardenedLeather, 1, "hardenedLeatherChestplateItem",
				"hardenedLeather");
		hardenedLeatherLeggingsItem = new ModItemArmor(armorhardenedLeather, 2, "hardenedLeatherLeggingsItem",
				"hardenedLeather");
		hardenedLeatherBootsItem = new ModItemArmor(armorhardenedLeather, 3, "hardenedLeatherBootsItem",
				"hardenedLeather");

		ModItems.registerItem(hardenedLeatherHelmetItem);
		ModItems.registerItem(hardenedLeatherChestplateItem);
		ModItems.registerItem(hardenedLeatherLeggingsItem);
		ModItems.registerItem(hardenedLeatherBootsItem);

		// Animal
		calamariRawItem = new ModItemFood("calamariRawItem", 2, Config.snackSaturation, false);
		calamariCookedItem = new ModItemFood("calamariCookedItem", 5, Config.meatymealSaturation, false);
		muttonRawItem = new ModItemFood("muttonRawItem", 3, Config.snackSaturation, true);
		muttonCookedItem = new ModItemFood("muttonCookedItem", 8, Config.meatymealSaturation, true);
		sunflowerSeedsItem = new ModItemFood("sunflowerSeedsItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				false);

		ModItems.registerItem(calamariRawItem);
		ModItems.registerItem(calamariCookedItem);
		ModItems.registerItem(muttonRawItem);
		ModItems.registerItem(muttonCookedItem);
		ModItems.registerItem(sunflowerSeedsItem);

		// Garden
		artichokeItem = new ModItemFood("artichokeItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.artichokeCrop, Blocks.farmland);
		asparagusItem = new ModItemFood("asparagusItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.asparagusCrop, Blocks.farmland);
		bambooShootItem = new ModItemFood("bambooShootItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.bambooShootCrop, Blocks.farmland);
		barleyItem = new ModItemFood("barleyItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.barleyCrop, Blocks.farmland);
		beanItem = new ModItemFood("beanItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.beanCrop,
				Blocks.farmland);
		beetItem = new ModItemFood("beetItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.beetCrop,
				Blocks.farmland);
		bellpepperItem = new ModItemFood("bellpepperItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.bellpepperCrop, Blocks.farmland);
		blackberryItem = new ModItemFood("blackberryItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.blackberryCrop, Blocks.farmland);
		blueberryItem = new ModItemFood("blueberryItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.blueberryCrop, Blocks.farmland);
		broccoliItem = new ModItemFood("broccoliItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.broccoliCrop, Blocks.farmland);
		brusselSproutItem = new ModItemFood("brusselSproutItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.brusselSproutCrop, Blocks.farmland);
		cabbageItem = new ModItemFood("cabbageItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.cabbageCrop, Blocks.farmland);
		cactusFruitItem = new ModItemFood("cactusFruitItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.cactusFruitCrop, Blocks.sand);
		candleberryItem = new ModItemFood("candleberryItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.candleberryCrop, Blocks.farmland);
		cantaloupeItem = new ModItemFood("cantaloupeItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.cantaloupeCrop, Blocks.farmland);
		cauliflowerItem = new ModItemFood("cauliflowerItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.cauliflowerCrop, Blocks.farmland);
		celeryItem = new ModItemFood("celeryItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.celeryCrop, Blocks.farmland);
		chilipepperItem = new ModItemFood("chilipepperItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.chilipepperCrop, Blocks.farmland);
		coffeeBeanItem = new ModItemFood("coffeeBeanItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.coffeeBeanCrop, Blocks.farmland);
		cornItem = new ModItemFood("cornItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.cornCrop,
				Blocks.farmland);
		cottonItem = new ModItemSeeds("cottonItem", ModBlocks.cottonCrop, Blocks.farmland);
		cranberryItem = new ModItemFood("cranberryItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.cranberryCrop, Blocks.water);
		cucumberItem = new ModItemFood("cucumberItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.cucumberCrop, Blocks.farmland);
		edibleRootItem = new ModItemFood("edibleRootItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.spiceLeafCrop, Blocks.farmland);
		eggplantItem = new ModItemFood("eggplantItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.eggplantCrop, Blocks.farmland);
		garlicItem = new ModItemFood("garlicItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.garlicCrop, Blocks.farmland);
		gingerItem = new ModItemFood("gingerItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.gingerCrop, Blocks.farmland);
		grapeItem = new ModItemFood("grapeItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.grapeCrop, Blocks.farmland);
		kiwiItem = new ModItemFood("kiwiItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.kiwiCrop,
				Blocks.farmland);
		leekItem = new ModItemFood("leekItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.leekCrop,
				Blocks.farmland);
		lettuceItem = new ModItemFood("lettuceItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.lettuceCrop, Blocks.farmland);
		mustardSeedsItem = new ModItemFood("mustardSeedsItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.mustardSeedsCrop, Blocks.farmland);
		oatsItem = new ModItemFood("oatsItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.oatsCrop,
				Blocks.farmland);
		okraItem = new ModItemFood("okraItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.okraCrop,
				Blocks.farmland);
		onionItem = new ModItemFood("onionItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.onionCrop, Blocks.farmland);
		parsnipItem = new ModItemFood("parsnipItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.parsnipCrop, Blocks.farmland);
		peanutItem = new ModItemFood("peanutItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.peanutCrop, Blocks.farmland);
		peasItem = new ModItemFood("peasItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.peasCrop,
				Blocks.farmland);
		pineappleItem = new ModItemFood("pineappleItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.pineappleCrop, Blocks.farmland);
		radishItem = new ModItemFood("radishItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.radishCrop, Blocks.farmland);
		raspberryItem = new ModItemFood("raspberryItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.raspberryCrop, Blocks.farmland);
		rhubarbItem = new ModItemFood("rhubarbItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.rhubarbCrop, Blocks.farmland);
		riceItem = new ModItemFood("riceItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.riceCrop,
				Blocks.water);
		rutabagaItem = new ModItemFood("rutabagaItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.rutabagaCrop, Blocks.farmland);
		ryeItem = new ModItemFood("ryeItem", Config.cropfoodRestore, Config.cropSaturationRestore, ModBlocks.ryeCrop,
				Blocks.farmland);
		scallionItem = new ModItemFood("scallionItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.scallionCrop, Blocks.farmland);
		seaweedItem = new ModItemFood("seaweedItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.seaweedCrop, Blocks.water);
		soybeanItem = new ModItemFood("soybeanItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.soybeanCrop, Blocks.farmland);
		spiceleafItem = new ModItemFood("spiceleafItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.spiceLeafCrop, Blocks.farmland);
		strawberryItem = new ModItemFood("strawberryItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.strawberryCrop, Blocks.farmland);
		sweetPotatoItem = new ModItemFood("sweetPotatoItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.sweetPotatoCrop, Blocks.farmland);
		teaLeafItem = new ModItemFood("teaLeafItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.teaLeafCrop, Blocks.farmland);
		tomatoItem = new ModItemFood("tomatoItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.tomatoCrop, Blocks.farmland);
		turnipItem = new ModItemFood("turnipItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.turnipCrop, Blocks.farmland);
		whiteMushroomItem = new ModItemFood("whiteMushroomItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.whiteMushroomCrop, Blocks.log);
		winterSquashItem = new ModItemFood("winterSquashItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.winterSquashCrop, Blocks.farmland);
		zucchiniItem = new ModItemFood("zucchiniItem", Config.cropfoodRestore, Config.cropSaturationRestore,
				ModBlocks.zucchiniCrop, Blocks.farmland);

		ModItems.registerItem(artichokeItem);
		ModItems.registerItem(asparagusItem);
		ModItems.registerItem(bambooShootItem);
		ModItems.registerItem(barleyItem);
		ModItems.registerItem(beanItem);
		ModItems.registerItem(beetItem);
		ModItems.registerItem(bellpepperItem);
		ModItems.registerItem(blackberryItem);
		ModItems.registerItem(blueberryItem);
		ModItems.registerItem(broccoliItem);
		ModItems.registerItem(brusselSproutItem);
		ModItems.registerItem(cabbageItem);
		ModItems.registerItem(cactusFruitItem);
		ModItems.registerItem(candleberryItem);
		ModItems.registerItem(cantaloupeItem);
		ModItems.registerItem(cauliflowerItem);
		ModItems.registerItem(celeryItem);
		ModItems.registerItem(chilipepperItem);
		ModItems.registerItem(coffeeBeanItem);
		ModItems.registerItem(cornItem);
		ModItems.registerItem(cottonItem);
		ModItems.registerItem(cranberryItem);
		ModItems.registerItem(cucumberItem);
		ModItems.registerItem(edibleRootItem);
		ModItems.registerItem(eggplantItem);
		ModItems.registerItem(garlicItem);
		ModItems.registerItem(gingerItem);
		ModItems.registerItem(grapeItem);
		ModItems.registerItem(kiwiItem);
		ModItems.registerItem(leekItem);
		ModItems.registerItem(lettuceItem);
		ModItems.registerItem(mustardSeedsItem);
		ModItems.registerItem(oatsItem);
		ModItems.registerItem(okraItem);
		ModItems.registerItem(onionItem);
		ModItems.registerItem(parsnipItem);
		ModItems.registerItem(peanutItem);
		ModItems.registerItem(peasItem);
		ModItems.registerItem(pineappleItem);
		ModItems.registerItem(radishItem);
		ModItems.registerItem(raspberryItem);
		ModItems.registerItem(rhubarbItem);
		ModItems.registerItem(riceItem);
		ModItems.registerItem(rutabagaItem);
		ModItems.registerItem(ryeItem);
		ModItems.registerItem(scallionItem);
		ModItems.registerItem(seaweedItem);
		ModItems.registerItem(soybeanItem);
		ModItems.registerItem(spiceleafItem);
		ModItems.registerItem(strawberryItem);
		ModItems.registerItem(sweetPotatoItem);
		ModItems.registerItem(teaLeafItem);
		ModItems.registerItem(tomatoItem);
		ModItems.registerItem(turnipItem);
		ModItems.registerItem(whiteMushroomItem);
		ModItems.registerItem(winterSquashItem);
		ModItems.registerItem(zucchiniItem);

		// Seed
		artichokeSeedItem = new ModItemSeeds("artichokeSeedItem", ModBlocks.artichokeCrop, Blocks.farmland);
		asparagusSeedItem = new ModItemSeeds("asparagusSeedItem", ModBlocks.asparagusCrop, Blocks.farmland);
		bambooShootSeedItem = new ModItemSeeds("bambooShootSeedItem", ModBlocks.bambooShootCrop, Blocks.farmland);
		barleySeedItem = new ModItemSeeds("barleySeedItem", ModBlocks.barleyCrop, Blocks.farmland);
		beanSeedItem = new ModItemSeeds("beanSeedItem", ModBlocks.beanCrop, Blocks.farmland);
		beetSeedItem = new ModItemSeeds("beetSeedItem", ModBlocks.beetCrop, Blocks.farmland);
		bellpepperSeedItem = new ModItemSeeds("bellpepperSeedItem", ModBlocks.bellpepperCrop, Blocks.farmland);
		blackberrySeedItem = new ModItemSeeds("blackberrySeedItem", ModBlocks.blackberryCrop, Blocks.farmland);
		blueberrySeedItem = new ModItemSeeds("blueberrySeedItem", ModBlocks.blueberryCrop, Blocks.farmland);
		broccoliSeedItem = new ModItemSeeds("broccoliSeedItem", ModBlocks.broccoliCrop, Blocks.farmland);
		brusselSproutSeedItem = new ModItemSeeds("brusselSproutSeedItem", ModBlocks.brusselSproutCrop, Blocks.farmland);
		cabbageSeedItem = new ModItemSeeds("cabbageSeedItem", ModBlocks.cabbageCrop, Blocks.farmland);
		cactusFruitSeedItem = new ModItemSeeds("cactusFruitSeedItem", ModBlocks.cactusFruitCrop, Blocks.sand);
		candleberrySeedItem = new ModItemSeeds("candleberrySeedItem", ModBlocks.candleberryCrop, Blocks.farmland);
		cantaloupeSeedItem = new ModItemSeeds("cantaloupeSeedItem", ModBlocks.cantaloupeCrop, Blocks.farmland);
		cauliflowerSeedItem = new ModItemSeeds("cauliflowerSeedItem", ModBlocks.cauliflowerCrop, Blocks.farmland);
		celerySeedItem = new ModItemSeeds("celerySeedItem", ModBlocks.celeryCrop, Blocks.farmland);
		chilipepperSeedItem = new ModItemSeeds("chilipepperSeedItem", ModBlocks.chilipepperCrop, Blocks.farmland);
		coffeeBeanSeedItem = new ModItemSeeds("coffeeBeanSeedItem", ModBlocks.coffeeBeanCrop, Blocks.farmland);
		cornSeedItem = new ModItemSeeds("cornSeedItem", ModBlocks.cornCrop, Blocks.farmland);
		cottonSeedItem = new ModItemSeeds("cottonSeedItem", ModBlocks.cottonCrop, Blocks.farmland);
		cranberrySeedItem = new ModItemSeeds("cranberrySeedItem", ModBlocks.cranberryCrop, Blocks.water);
		cucumberSeedItem = new ModItemSeeds("cucumberSeedItem", ModBlocks.cucumberCrop, Blocks.farmland);
		eggplantSeedItem = new ModItemSeeds("eggplantSeedItem", ModBlocks.eggplantCrop, Blocks.farmland);
		garlicSeedItem = new ModItemSeeds("garlicSeedItem", ModBlocks.garlicCrop, Blocks.farmland);
		gingerSeedItem = new ModItemSeeds("gingerSeedItem", ModBlocks.gingerCrop, Blocks.farmland);
		grapeSeedItem = new ModItemSeeds("grapeSeedItem", ModBlocks.grapeCrop, Blocks.farmland);
		kiwiSeedItem = new ModItemSeeds("kiwiSeedItem", ModBlocks.kiwiCrop, Blocks.farmland);
		leekSeedItem = new ModItemSeeds("leekSeedItem", ModBlocks.leekCrop, Blocks.farmland);
		lettuceSeedItem = new ModItemSeeds("lettuceSeedItem", ModBlocks.lettuceCrop, Blocks.farmland);
		mustardSeedItem = new ModItemSeeds("mustardSeedItem", ModBlocks.mustardSeedsCrop, Blocks.farmland);
		oatsSeedItem = new ModItemSeeds("oatsSeedItem", ModBlocks.oatsCrop, Blocks.farmland);
		okraSeedItem = new ModItemSeeds("okraSeedItem", ModBlocks.okraCrop, Blocks.farmland);
		onionSeedItem = new ModItemSeeds("onionSeedItem", ModBlocks.onionCrop, Blocks.farmland);
		parsnipSeedItem = new ModItemSeeds("parsnipSeedItem", ModBlocks.parsnipCrop, Blocks.farmland);
		peanutSeedItem = new ModItemSeeds("peanutSeedItem", ModBlocks.peanutCrop, Blocks.farmland);
		peasSeedItem = new ModItemSeeds("peasSeedItem", ModBlocks.peasCrop, Blocks.farmland);
		pineappleSeedItem = new ModItemSeeds("pineappleSeedItem", ModBlocks.pineappleCrop, Blocks.farmland);
		radishSeedItem = new ModItemSeeds("radishSeedItem", ModBlocks.radishCrop, Blocks.farmland);
		raspberrySeedItem = new ModItemSeeds("raspberrySeedItem", ModBlocks.raspberryCrop, Blocks.farmland);
		rhubarbSeedItem = new ModItemSeeds("rhubarbSeedItem", ModBlocks.rhubarbCrop, Blocks.farmland);
		riceSeedItem = new ModItemSeeds("riceSeedItem", ModBlocks.riceCrop, Blocks.water);
		rutabagaSeedItem = new ModItemSeeds("rutabagaSeedItem", ModBlocks.rutabagaCrop, Blocks.farmland);
		ryeSeedItem = new ModItemSeeds("ryeSeedItem", ModBlocks.ryeCrop, Blocks.farmland);
		scallionSeedItem = new ModItemSeeds("scallionSeedItem", ModBlocks.scallionCrop, Blocks.farmland);
		seaweedSeedItem = new ModItemSeeds("seaweedSeedItem", ModBlocks.seaweedCrop, Blocks.water);
		soybeanSeedItem = new ModItemSeeds("soybeanSeedItem", ModBlocks.soybeanCrop, Blocks.farmland);
		spiceleafSeedItem = new ModItemSeeds("spiceleafSeedItem", ModBlocks.spiceLeafCrop, Blocks.farmland);
		strawberrySeedItem = new ModItemSeeds("strawberrySeedItem", ModBlocks.strawberryCrop, Blocks.farmland);
		sweetPotatoSeedItem = new ModItemSeeds("sweetPotatoSeedItem", ModBlocks.sweetPotatoCrop, Blocks.farmland);
		teaLeafSeedItem = new ModItemSeeds("teaLeafSeedItem", ModBlocks.teaLeafCrop, Blocks.farmland);
		tomatoSeedItem = new ModItemSeeds("tomatoSeedItem", ModBlocks.tomatoCrop, Blocks.farmland);
		turnipSeedItem = new ModItemSeeds("turnipSeedItem", ModBlocks.turnipCrop, Blocks.farmland);
		whiteMushroomSeedItem = new ModItemSeeds("whiteMushroomSeedItem", ModBlocks.whiteMushroomCrop, Blocks.log);
		winterSquashSeedItem = new ModItemSeeds("winterSquashSeedItem", ModBlocks.winterSquashCrop, Blocks.farmland);
		zucchiniSeedItem = new ModItemSeeds("zucchiniSeedItem", ModBlocks.zucchiniCrop, Blocks.farmland);

		ModItems.registerItem(artichokeSeedItem);
		ModItems.registerItem(asparagusSeedItem);
		ModItems.registerItem(bambooShootSeedItem);
		ModItems.registerItem(barleySeedItem);
		ModItems.registerItem(beanSeedItem);
		ModItems.registerItem(beetSeedItem);
		ModItems.registerItem(bellpepperSeedItem);
		ModItems.registerItem(blackberrySeedItem);
		ModItems.registerItem(blueberrySeedItem);
		ModItems.registerItem(broccoliSeedItem);
		ModItems.registerItem(brusselSproutSeedItem);
		ModItems.registerItem(cabbageSeedItem);
		ModItems.registerItem(cactusFruitSeedItem);
		ModItems.registerItem(candleberrySeedItem);
		ModItems.registerItem(cantaloupeSeedItem);
		ModItems.registerItem(cauliflowerSeedItem);
		ModItems.registerItem(celerySeedItem);
		ModItems.registerItem(chilipepperSeedItem);
		ModItems.registerItem(coffeeBeanSeedItem);
		ModItems.registerItem(cornSeedItem);
		ModItems.registerItem(cottonSeedItem);
		ModItems.registerItem(cranberrySeedItem);
		ModItems.registerItem(cucumberSeedItem);
		ModItems.registerItem(eggplantSeedItem);
		ModItems.registerItem(garlicSeedItem);
		ModItems.registerItem(gingerSeedItem);
		ModItems.registerItem(grapeSeedItem);
		ModItems.registerItem(kiwiSeedItem);
		ModItems.registerItem(leekSeedItem);
		ModItems.registerItem(lettuceSeedItem);
		ModItems.registerItem(mustardSeedItem);
		ModItems.registerItem(oatsSeedItem);
		ModItems.registerItem(okraSeedItem);
		ModItems.registerItem(onionSeedItem);
		ModItems.registerItem(parsnipSeedItem);
		ModItems.registerItem(peanutSeedItem);
		ModItems.registerItem(peasSeedItem);
		ModItems.registerItem(pineappleSeedItem);
		ModItems.registerItem(radishSeedItem);
		ModItems.registerItem(raspberrySeedItem);
		ModItems.registerItem(rhubarbSeedItem);
		ModItems.registerItem(riceSeedItem);
		ModItems.registerItem(rutabagaSeedItem);
		ModItems.registerItem(ryeSeedItem);
		ModItems.registerItem(scallionSeedItem);
		ModItems.registerItem(seaweedSeedItem);
		ModItems.registerItem(soybeanSeedItem);
		ModItems.registerItem(spiceleafSeedItem);
		ModItems.registerItem(strawberrySeedItem);
		ModItems.registerItem(sweetPotatoSeedItem);
		ModItems.registerItem(teaLeafSeedItem);
		ModItems.registerItem(tomatoSeedItem);
		ModItems.registerItem(turnipSeedItem);
		ModItems.registerItem(whiteMushroomSeedItem);
		ModItems.registerItem(winterSquashSeedItem);
		ModItems.registerItem(zucchiniSeedItem);

		if (Config.artichokeSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.artichokeSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.asparagusSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.asparagusSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.bambooShootSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.bambooShootSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.barleySeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.barleySeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.beanSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.beanSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.beetSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.beetSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.bellpepperSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.bellpepperSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.blackberrySeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.blackberrySeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.blueberrySeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.blueberrySeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.broccoliSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.broccoliSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.brusselSproutSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.brusselSproutSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.cabbageSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.cabbageSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.cactusFruitSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.cactusFruitSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.candleberrySeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.candleberrySeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.cantaloupeSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.cantaloupeSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.cauliflowerSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.cauliflowerSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.celerySeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.celerySeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.chilipepperSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.chilipepperSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.coffeeSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.coffeeBeanSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.cornSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.cornSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.cottonSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.cottonSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.cranberrySeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.cranberrySeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.cucumberSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.cucumberSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.eggplantSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.eggplantSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.garlicSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.garlicSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.gingerSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.gingerSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.grapeSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.grapeSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.kiwiSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.kiwiSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.leekSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.leekSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.lettuceSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.lettuceSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.mustardSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.mustardSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.oatsSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.oatsSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.okraSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.okraSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.onionSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.onionSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.parsnipSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.parsnipSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.peanutSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.peanutSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.peasSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.peasSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.pineappleSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.pineappleSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.radishSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.radishSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.raspberrySeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.raspberrySeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.rhubarbSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.rhubarbSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.riceSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.riceSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.rutabagaSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.rutabagaSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.ryeSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.ryeSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.scallionSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.scallionSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.seaweedSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.seaweedSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.soybeanSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.soybeanSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.spiceleafSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.spiceleafSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.strawberrySeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.strawberrySeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.sweetpotatoSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.sweetPotatoSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.teaSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.teaLeafSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.tomatoSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.tomatoSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.turnipSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.turnipSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.whitemushroomSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.whiteMushroomSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.wintersquashSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.winterSquashSeedItem, 1, 0), Config.seedRarity);
		}
		if (Config.zucchiniSeedDropFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ModItems.zucchiniSeedItem, 1, 0), Config.seedRarity);
		}

		// Tree
		almondItem = new ModItemFood("almondItem", Config.cropfoodRestore, false);
		apricotItem = new ModItemFood("apricotItem", Config.cropfoodRestore, false);
		avocadoItem = new ModItemFood("avocadoItem", Config.cropfoodRestore, false);
		bananaItem = new ModItemFood("bananaItem", Config.cropfoodRestore, false);
		cashewItem = new ModItemFood("cashewItem", Config.cropfoodRestore, false);
		cherryItem = new ModItemFood("cherryItem", Config.cropfoodRestore, false);
		chestnutItem = new ModItemFood("chestnutItem", Config.cropfoodRestore, false);
		cinnamonItem = new ModItemFood("cinnamonItem", Config.cropfoodRestore, false);
		coconutItem = new ModItemFood("coconutItem", Config.cropfoodRestore, false);
		dateItem = new ModItemFood("dateItem", Config.cropfoodRestore, false);
		dragonfruitItem = new ModItemFood("dragonfruitItem", Config.cropfoodRestore, false);
		durianItem = new ModItemFood("durianItem", Config.cropfoodRestore, false);
		figItem = new ModItemFood("figItem", Config.cropfoodRestore, false);
		grapefruitItem = new ModItemFood("grapefruitItem", Config.cropfoodRestore, false);
		lemonItem = new ModItemFood("lemonItem", Config.cropfoodRestore, false);
		limeItem = new ModItemFood("limeItem", Config.cropfoodRestore, false);
		mapleSyrupItem = new ModItemFood("mapleSyrupItem", Config.cropfoodRestore, false);
		mangoItem = new ModItemFood("mangoItem", Config.cropfoodRestore, false);
		nutmegItem = new ModItemFood("nutmegItem", Config.cropfoodRestore, false);
		oliveItem = new ModItemFood("oliveItem", Config.cropfoodRestore, false);
		orangeItem = new ModItemFood("orangeItem", Config.cropfoodRestore, false);
		papayaItem = new ModItemFood("papayaItem", Config.cropfoodRestore, false);
		peachItem = new ModItemFood("peachItem", Config.cropfoodRestore, false);
		pearItem = new ModItemFood("pearItem", Config.cropfoodRestore, false);
		pecanItem = new ModItemFood("pecanItem", Config.cropfoodRestore, false);
		peppercornItem = new ModItemFood("peppercornItem", Config.cropfoodRestore, false);
		persimmonItem = new ModItemFood("persimmonItem", Config.cropfoodRestore, false);
		pistachioItem = new ModItemFood("pistachioItem", Config.cropfoodRestore, false);
		plumItem = new ModItemFood("plumItem", Config.cropfoodRestore, false);
		pomegranateItem = new ModItemFood("pomegranateItem", Config.cropfoodRestore, false);
		starfruitItem = new ModItemFood("starfruitItem", Config.cropfoodRestore, false);
		vanillaBeanItem = new ModItemFood("vanillaBeanItem", Config.cropfoodRestore, false);
		walnutItem = new ModItemFood("walnutItem", Config.cropfoodRestore, false);

		ModItems.registerItem(almondItem);
		ModItems.registerItem(apricotItem);
		ModItems.registerItem(avocadoItem);
		ModItems.registerItem(bananaItem);
		ModItems.registerItem(cashewItem);
		ModItems.registerItem(cherryItem);
		ModItems.registerItem(chestnutItem);
		ModItems.registerItem(cinnamonItem);
		ModItems.registerItem(coconutItem);
		ModItems.registerItem(dateItem);
		ModItems.registerItem(dragonfruitItem);
		ModItems.registerItem(durianItem);
		ModItems.registerItem(figItem);
		ModItems.registerItem(grapefruitItem);
		ModItems.registerItem(lemonItem);
		ModItems.registerItem(limeItem);
		ModItems.registerItem(mapleSyrupItem);
		ModItems.registerItem(mangoItem);
		ModItems.registerItem(nutmegItem);
		ModItems.registerItem(oliveItem);
		ModItems.registerItem(orangeItem);
		ModItems.registerItem(papayaItem);
		ModItems.registerItem(peachItem);
		ModItems.registerItem(pearItem);
		ModItems.registerItem(pecanItem);
		ModItems.registerItem(peppercornItem);
		ModItems.registerItem(persimmonItem);
		ModItems.registerItem(pistachioItem);
		ModItems.registerItem(plumItem);
		ModItems.registerItem(pomegranateItem);
		ModItems.registerItem(starfruitItem);
		ModItems.registerItem(vanillaBeanItem);
		ModItems.registerItem(walnutItem);

		// Cooked
		bakedSweetPotatoItem = new ModItemFood("bakedSweetPotatoItem", 4, Config.mealSaturation, false);
		coffeeItem = new ModItemFood("coffeeItem", 4, Config.snackSaturation, false);
		grilledAsparagusItem = new ModItemFood("grilledAsparagusItem", 4, Config.mealSaturation, false);
		grilledEggplantItem = new ModItemFood("grilledEggplantItem", 4, Config.mealSaturation, false);
		popcornItem = new ModItemFood("popcornItem", 4, Config.snackSaturation, false);
		raisinsItem = new ModItemFood("raisinsItem", 4, Config.snackSaturation, false);
		teaItem = new ModItemFood("teaItem", 4, Config.snackSaturation, false);
		toastedCoconutItem = new ModItemFood("toastedCoconutItem", 4, Config.snackSaturation, false);

		ModItems.registerItem(bakedSweetPotatoItem);
		ModItems.registerItem(coffeeItem);
		ModItems.registerItem(grilledAsparagusItem);
		ModItems.registerItem(grilledEggplantItem);
		ModItems.registerItem(popcornItem);
		ModItems.registerItem(raisinsItem);
		ModItems.registerItem(teaItem);
		ModItems.registerItem(toastedCoconutItem);

		// Item 1
		toastItem = new ModItemFood("toastItem", 7, Config.mealSaturation, false);
		cheeseItem = new ModItemFood("cheeseItem", 2, Config.mealSaturation, false);
		iceCreamItem = new ModItemFood("iceCreamItem", 8, Config.mealSaturation, false);
		grilledCheeseItem = new ModItemFood("grilledCheeseItem", 9, Config.mealSaturation, false);
		appleSauceItem = new ModItemFood("appleSauceItem", 6, Config.mealSaturation, false);
		caramelAppleItem = new ModItemFood("caramelAppleItem", 7, Config.mealSaturation, false);
		pumpkinBreadItem = new ModItemFood("pumpkinBreadItem", 8, Config.mealSaturation, false);
		roastedPumpkinSeedsItem = new ModItemFood("roastedPumpkinSeedsItem", 2, Config.snackSaturation, false);
		glazedCarrotsItem = new ModItemFood("glazedCarrotsItem", 7, Config.mealSaturation, false);
		butteredPotatoItem = new ModItemFood("butteredPotatoItem", 7, Config.mealSaturation, false);
		loadedBakedPotatoItem = new ModItemFood("loadedBakedPotatoItem", 11, Config.meatymealSaturation, false);
		mashedPotatoesItem = new ModItemFood("mashedPotatoesItem", 9, Config.mealSaturation, false);
		friesItem = new ModItemFood("friesItem", 4, Config.snackSaturation, false);
		grilledMushroomItem = new ModItemFood("grilledMushroomItem", 2, Config.mealSaturation, false);
		stuffedMushroomItem = new ModItemFood("stuffedMushroomItem", 6, Config.meatymealSaturation, false);
		breadedPorkchopItem = new ModItemFood("breadedPorkchopItem", 5, Config.mealSaturation, false);
		hotdogItem = new ModItemFood("hotdogItem", 8, Config.meatymealSaturation, false);
		bakedHamItem = new ModItemFood("bakedHamItem", 9, Config.meatymealSaturation, false);
		hamburgerItem = new ModItemFood("hamburgerItem", 8, Config.mealSaturation, false);
		cheeseburgerItem = new ModItemFood("cheeseburgerItem", 9, Config.mealSaturation, false);
		baconCheeseburgerItem = new ModItemFood("baconCheeseburgerItem", 14, Config.meatymealSaturation, false);
		potRoastItem = new ModItemFood("potRoastItem", 10, Config.meatymealSaturation, false);
		fishSticksItem = new ModItemFood("fishSticksItem", 5, Config.mealSaturation, false);
		fishAndChipsItem = new ModItemFood("fishAndChipsItem", 9, Config.meatymealSaturation, false);
		friedEggItem = new ModItemFood("friedEggItem", 4, Config.mealSaturation, false);
		scrambledEggItem = new ModItemFood("scrambledEggItem", 4, Config.mealSaturation, false);
		boiledEggItem = new ModItemFood("boiledEggItem", 2, Config.mealSaturation, false);
		caramelItem = new ModItemFood("caramelItem", 2, Config.snackSaturation, false);
		taffyItem = new ModItemFood("taffyItem", 4, Config.snackSaturation, false);
		zombieJerkyItem = new ModItemFood("zombieJerkyItem", 4, Config.snackSaturation, false);

		ModItems.registerItem(toastItem);
		ModItems.registerItem(cheeseItem);
		ModItems.registerItem(iceCreamItem);
		ModItems.registerItem(grilledCheeseItem);
		ModItems.registerItem(appleSauceItem);
		ModItems.registerItem(caramelAppleItem);
		ModItems.registerItem(pumpkinBreadItem);
		ModItems.registerItem(roastedPumpkinSeedsItem);
		ModItems.registerItem(glazedCarrotsItem);
		ModItems.registerItem(butteredPotatoItem);
		ModItems.registerItem(loadedBakedPotatoItem);
		ModItems.registerItem(mashedPotatoesItem);
		ModItems.registerItem(friesItem);
		ModItems.registerItem(grilledMushroomItem);
		ModItems.registerItem(stuffedMushroomItem);
		ModItems.registerItem(breadedPorkchopItem);
		ModItems.registerItem(hotdogItem);
		ModItems.registerItem(bakedHamItem);
		ModItems.registerItem(hamburgerItem);
		ModItems.registerItem(cheeseburgerItem);
		ModItems.registerItem(baconCheeseburgerItem);
		ModItems.registerItem(potRoastItem);
		ModItems.registerItem(fishSticksItem);
		ModItems.registerItem(fishAndChipsItem);
		ModItems.registerItem(friedEggItem);
		ModItems.registerItem(scrambledEggItem);
		ModItems.registerItem(boiledEggItem);
		ModItems.registerItem(caramelItem);
		ModItems.registerItem(taffyItem);
		ModItems.registerItem(zombieJerkyItem);

		// Item 2
		chocolateBarItem = new ModItemFood("chocolateBarItem", 5, Config.snackSaturation, false);
		hotChocolateItem = new ModItemFood("hotChocolateItem", 4, Config.mealSaturation, false);
		chocolateIceCreamItem = new ModItemFood("chocolateIceCreamItem", 9, Config.mealSaturation, false);
		stockItem = new ModItemFood("stockItem", 3, Config.mealSaturation, false);
		spagettiItem = new ModItemFood("spagettiItem", 8, Config.mealSaturation, false);
		spagettiAndMeatballsItem = new ModItemFood("spagettiAndMeatballsItem", 11, Config.meatymealSaturation, false);
		chickenParmasanItem = new ModItemFood("chickenParmasanItem", 8, Config.meatymealSaturation, false);
		pizzaItem = new ModItemFood("pizzaItem", 10, Config.meatymealSaturation, false);
		porkLettuceWrapItem = new ModItemFood("porkLettuceWrapItem", 8, Config.meatymealSaturation, false);
		fishLettuceWrapItem = new ModItemFood("fishLettuceWrapItem", 6, Config.meatymealSaturation, false);
		bltItem = new ModItemFood("bltItem", 12, Config.meatymealSaturation, false);
		deluxeCheeseburgerItem = new ModItemFood("deluxeCheeseburgerItem", 12, Config.meatymealSaturation, false);
		delightedMealItem = new ModItemFood("delightedMealItem", 18, Config.meatymealSaturation, false);
		potatoCakesItem = new ModItemFood("potatoCakesItem", 7, Config.mealSaturation, false);
		hashItem = new ModItemFood("hashItem", 11, Config.mealSaturation, false);
		braisedOnionsItem = new ModItemFood("braisedOnionsItem", 8, Config.mealSaturation, false);
		heartyBreakfastItem = new ModItemFood("heartyBreakfastItem", 18, Config.meatymealSaturation, false);
		cornOnTheCobItem = new ModItemFood("cornOnTheCobItem", 6, Config.mealSaturation, false);
		cornbreadItem = new ModItemFood("cornbreadItem", 8, Config.mealSaturation, false);
		tortillaItem = new ModItemFood("tortillaItem", 6, Config.mealSaturation, false);
		nachoesItem = new ModItemFood("nachoesItem", 8, Config.mealSaturation, false);
		tacoItem = new ModItemFood("tacoItem", 11, Config.meatymealSaturation, false);
		fishTacoItem = new ModItemFood("fishTacoItem", 9, Config.meatymealSaturation, false);
		creamedCornItem = new ModItemFood("creamedCornItem", 8, Config.mealSaturation, false);
		chocolateStrawberryItem = new ModItemFood("chocolateStrawberryItem", 6, Config.mealSaturation, false);
		peanutButterItem = new ModItemFood("peanutButterItem", 5, Config.mealSaturation, false);
		trailMixItem = new ModItemFood("trailMixItem", 10, Config.mealSaturation, false);
		PBAndJItem = new ModItemFood("PBAndJItem", 10, Config.mealSaturation, false);
		peanutButterCookiesItem = new ModItemFood("peanutButterCookiesItem", 9, Config.snackSaturation, false);
		raisinCookiesItem = new ModItemFood("raisinCookiesItem", 9, Config.snackSaturation, false);
		picklesItem = new ModItemFood("picklesItem", 7, Config.mealSaturation, false);

		ModItems.registerItem(chocolateBarItem);
		ModItems.registerItem(hotChocolateItem);
		ModItems.registerItem(chocolateIceCreamItem);
		ModItems.registerItem(stockItem);
		ModItems.registerItem(spagettiItem);
		ModItems.registerItem(spagettiAndMeatballsItem);
		ModItems.registerItem(chickenParmasanItem);
		ModItems.registerItem(pizzaItem);
		ModItems.registerItem(porkLettuceWrapItem);
		ModItems.registerItem(fishLettuceWrapItem);
		ModItems.registerItem(bltItem);
		ModItems.registerItem(deluxeCheeseburgerItem);
		ModItems.registerItem(delightedMealItem);
		ModItems.registerItem(potatoCakesItem);
		ModItems.registerItem(hashItem);
		ModItems.registerItem(braisedOnionsItem);
		ModItems.registerItem(heartyBreakfastItem);
		ModItems.registerItem(cornOnTheCobItem);
		ModItems.registerItem(cornbreadItem);
		ModItems.registerItem(tortillaItem);
		ModItems.registerItem(nachoesItem);
		ModItems.registerItem(tacoItem);
		ModItems.registerItem(fishTacoItem);
		ModItems.registerItem(creamedCornItem);
		ModItems.registerItem(chocolateStrawberryItem);
		ModItems.registerItem(peanutButterItem);
		ModItems.registerItem(trailMixItem);
		ModItems.registerItem(PBAndJItem);
		ModItems.registerItem(peanutButterCookiesItem);
		ModItems.registerItem(raisinCookiesItem);
		ModItems.registerItem(picklesItem);

		// Item 3
		vegetarianLettuceWrapItem = new ModItemFood("vegetarianLettuceWrapItem", 8, Config.mealSaturation, false);
		marinatedCucumbersItem = new ModItemFood("marinatedCucumbersItem", 9, Config.mealSaturation, false);
		friedRiceItem = new ModItemFood("friedRiceItem", 10, Config.mealSaturation, false);
		mushroomRisottoItem = new ModItemFood("mushroomRisottoItem", 10, Config.mealSaturation, false);
		curryItem = new ModItemFood("curryItem", 11, Config.mealSaturation, false);
		rainbowCurryItem = new ModItemFood("rainbowCurryItem", 12, Config.mealSaturation, false);
		refriedBeansItem = new ModItemFood("refriedBeansItem", 7, Config.mealSaturation, false);
		bakedBeansItem = new ModItemFood("bakedBeansItem", 10, Config.meatymealSaturation, false);
		beansAndRiceItem = new ModItemFood("beansAndRiceItem", 11, Config.meatymealSaturation, false);
		chiliItem = new ModItemFood("chiliItem", 13, Config.meatymealSaturation, false);
		beanBurritoItem = new ModItemFood("beanBurritoItem", 9, Config.mealSaturation, false);
		stuffedPepperItem = new ModItemFood("stuffedPepperItem", 7, Config.mealSaturation, false);
		veggieStirfryItem = new ModItemFood("veggieStirfryItem", 12, Config.mealSaturation, false);
		grilledSkewersItem = new ModItemFood("grilledSkewersItem", 8, Config.mealSaturation, false);
		supremePizzaItem = new ModItemFood("supremePizzaItem", 13, Config.meatymealSaturation, false);
		omeletItem = new ModItemFood("omeletItem", 7, Config.meatymealSaturation, false);
		hotWingsItem = new ModItemFood("hotWingsItem", 8, Config.meatymealSaturation, false);
		chiliPoppersItem = new ModItemFood("chiliPoppersItem", 7, Config.mealSaturation, false);
		extremeChiliItem = new ModItemFood("extremeChiliItem", 14, Config.meatymealSaturation, false);
		chiliChocolateItem = new ModItemFood("chiliChocolateItem", 6, Config.snackSaturation, false);
		lemonaideItem = new ModItemFood("lemonaideItem", 6, Config.mealSaturation, false);
		lemonBarItem = new ModItemFood("lemonBarItem", 8, Config.mealSaturation, false);
		fishDinnerItem = new ModItemFood("fishDinnerItem", 8, Config.meatymealSaturation, false);
		lemonMeringueItem = new ModItemFood("lemonMeringueItem", 10, Config.mealSaturation, false);
		candiedLemonItem = new ModItemFood("candiedLemonItem", 4, Config.snackSaturation, false);
		lemonChickenItem = new ModItemFood("lemonChickenItem", 9, Config.meatymealSaturation, false);
		blueberryMuffinItem = new ModItemFood("blueberryMuffinItem", 8, Config.mealSaturation, false);
		pancakesItem = new ModItemFood("pancakesItem", 6, Config.mealSaturation, false);
		blueberryPancakesItem = new ModItemFood("blueberryPancakesItem", 8, Config.mealSaturation, false);
		chocolateCherryItem = new ModItemFood("chocolateCherryItem", 8, Config.snackSaturation, false);
		stuffedEggplantItem = new ModItemFood("stuffedEggplantItem", 10, Config.mealSaturation, false);
		eggplantParmItem = new ModItemFood("eggplantParmItem", 10, Config.mealSaturation, false);
		raspberryIcedTeaItem = new ModItemFood("raspberryIcedTeaItem", 7, Config.snackSaturation, false);
		chaiTeaItem = new ModItemFood("chaiTeaItem", 9, Config.snackSaturation, false);
		espressoItem = new ModItemFood("espressoItem", 8, Config.snackSaturation, false);
		coffeeConLecheItem = new ModItemFood("coffeeConLecheItem", 10, Config.snackSaturation, false);
		mochaIceCreamItem = new ModItemFood("mochaIceCreamItem", 10, Config.snackSaturation, false);
		pickledBeetsItem = new ModItemFood("pickledBeetsItem", 8, Config.mealSaturation, false);
		bakedBeetsItem = new ModItemFood("bakedBeetsItem", 10, Config.mealSaturation, false);
		broccoliMacItem = new ModItemFood("broccoliMacItem", 8, Config.mealSaturation, false);

		ModItems.registerItem(vegetarianLettuceWrapItem);
		ModItems.registerItem(marinatedCucumbersItem);
		ModItems.registerItem(friedRiceItem);
		ModItems.registerItem(mushroomRisottoItem);
		ModItems.registerItem(curryItem);
		ModItems.registerItem(rainbowCurryItem);
		ModItems.registerItem(refriedBeansItem);
		ModItems.registerItem(bakedBeansItem);
		ModItems.registerItem(beansAndRiceItem);
		ModItems.registerItem(chiliItem);
		ModItems.registerItem(beanBurritoItem);
		ModItems.registerItem(stuffedPepperItem);
		ModItems.registerItem(veggieStirfryItem);
		ModItems.registerItem(grilledSkewersItem);
		ModItems.registerItem(supremePizzaItem);
		ModItems.registerItem(omeletItem);
		ModItems.registerItem(hotWingsItem);
		ModItems.registerItem(chiliPoppersItem);
		ModItems.registerItem(extremeChiliItem);
		ModItems.registerItem(chiliChocolateItem);
		ModItems.registerItem(lemonaideItem);
		ModItems.registerItem(lemonBarItem);
		ModItems.registerItem(fishDinnerItem);
		ModItems.registerItem(lemonMeringueItem);
		ModItems.registerItem(candiedLemonItem);
		ModItems.registerItem(lemonChickenItem);
		ModItems.registerItem(blueberryMuffinItem);
		ModItems.registerItem(pancakesItem);
		ModItems.registerItem(blueberryPancakesItem);
		ModItems.registerItem(chocolateCherryItem);
		ModItems.registerItem(stuffedEggplantItem);
		ModItems.registerItem(eggplantParmItem);
		ModItems.registerItem(raspberryIcedTeaItem);
		ModItems.registerItem(chaiTeaItem);
		ModItems.registerItem(espressoItem);
		ModItems.registerItem(coffeeConLecheItem);
		ModItems.registerItem(mochaIceCreamItem);
		ModItems.registerItem(pickledBeetsItem);
		ModItems.registerItem(bakedBeetsItem);
		ModItems.registerItem(broccoliMacItem);

		// Item 4
		broccoliNDipItem = new ModItemFood("broccoliNDipItem", 8, Config.mealSaturation, false);
		candiedSweetPotatoesItem = new ModItemFood("candiedSweetPotatoesItem", 7, Config.snackSaturation, false);
		mashedSweetPotatoesItem = new ModItemFood("mashedSweetPotatoesItem", 7, Config.mealSaturation, false);
		steamedPeasItem = new ModItemFood("steamedPeasItem", 6, Config.mealSaturation, false);
		pineappleHamItem = new ModItemFood("pineappleHamItem", 10, Config.meatymealSaturation, false);
		roastedRootVeggieMedleyItem = new ModItemFood("roastedRootVeggieMedleyItem", 10, Config.mealSaturation, false);
		bakedTurnipsItem = new ModItemFood("bakedTurnipsItem", 9, Config.mealSaturation, false);
		gingerBreadItem = new ModItemFood("gingerBreadItem", 10, Config.mealSaturation, false);
		gingerSnapsItem = new ModItemFood("gingerSnapsItem", 8, Config.snackSaturation, false);
		candiedGingerItem = new ModItemFood("candiedGingerItem", 6, Config.snackSaturation, false);
		softPretzelAndMustardItem = new ModItemFood("softPretzelAndMustardItem", 10, Config.snackSaturation, false);
		spicyMustardPorkItem = new ModItemFood("spicyMustardPorkItem", 10, Config.meatymealSaturation, false);
		spicyGreensItem = new ModItemFood("spicyGreensItem", 11, Config.mealSaturation, false);
		garlicBreadItem = new ModItemFood("garlicBreadItem", 9, Config.mealSaturation, false);
		garlicMashedPotatoesItem = new ModItemFood("garlicMashedPotatoesItem", 10, Config.mealSaturation, false);
		garlicChickenItem = new ModItemFood("garlicChickenItem", 12, Config.meatymealSaturation, false);
		summerSquashWithRadishItem = new ModItemFood("summerSquashWithRadishItem", 10, Config.mealSaturation, false);
		celeryAndPeanutButterItem = new ModItemFood("celeryAndPeanutButterItem", 6, Config.mealSaturation, false);
		chickenCeleryCasseroleItem = new ModItemFood("chickenCeleryCasseroleItem", 12, Config.meatymealSaturation,
				false);
		peasAndCeleryItem = new ModItemFood("peasAndCeleryItem", 8, Config.mealSaturation, false);
		zucchiniBreadItem = new ModItemFood("zucchiniBreadItem", 8, Config.mealSaturation, false);
		zucchiniFriesItem = new ModItemFood("zucchiniFriesItem", 12, Config.mealSaturation, false);
		zestyZucchiniItem = new ModItemFood("zestyZucchiniItem", 12, Config.meatymealSaturation, false);
		zucchiniBakeItem = new ModItemFood("zucchiniBakeItem", 12, Config.mealSaturation, false);
		asparagusQuicheItem = new ModItemFood("asparagusQuicheItem", 8, Config.meatymealSaturation, false);
		walnutRaisinBreadItem = new ModItemFood("walnutRaisinBreadItem", 10, Config.mealSaturation, false);
		candiedWalnutsItem = new ModItemFood("candiedWalnutsItem", 8, Config.mealSaturation, false);
		brownieItem = new ModItemFood("brownieItem", 10, Config.snackSaturation, false);
		guacamoleItem = new ModItemFood("guacamoleItem", 10, Config.mealSaturation, false);
		avocadoBurritoItem = new ModItemFood("avocadoBurritoItem", 14, Config.meatymealSaturation, false);
		poachedPearItem = new ModItemFood("poachedPearItem", 5, Config.mealSaturation, false);
		fruitCrumbleItem = new ModItemFood("fruitCrumbleItem", 8, Config.mealSaturation, false);
		bananaSplitItem = new ModItemFood("bananaSplitItem", 10, Config.mealSaturation, false);

		ModItems.registerItem(broccoliNDipItem);
		ModItems.registerItem(candiedSweetPotatoesItem);
		ModItems.registerItem(mashedSweetPotatoesItem);
		ModItems.registerItem(steamedPeasItem);
		ModItems.registerItem(pineappleHamItem);
		ModItems.registerItem(roastedRootVeggieMedleyItem);
		ModItems.registerItem(bakedTurnipsItem);
		ModItems.registerItem(gingerBreadItem);
		ModItems.registerItem(gingerSnapsItem);
		ModItems.registerItem(candiedGingerItem);
		ModItems.registerItem(softPretzelAndMustardItem);
		ModItems.registerItem(spicyMustardPorkItem);
		ModItems.registerItem(spicyGreensItem);
		ModItems.registerItem(garlicBreadItem);
		ModItems.registerItem(garlicMashedPotatoesItem);
		ModItems.registerItem(garlicChickenItem);
		ModItems.registerItem(summerSquashWithRadishItem);
		ModItems.registerItem(celeryAndPeanutButterItem);
		ModItems.registerItem(chickenCeleryCasseroleItem);
		ModItems.registerItem(peasAndCeleryItem);
		ModItems.registerItem(zucchiniBreadItem);
		ModItems.registerItem(zucchiniFriesItem);
		ModItems.registerItem(zestyZucchiniItem);
		ModItems.registerItem(zucchiniBakeItem);
		ModItems.registerItem(asparagusQuicheItem);
		ModItems.registerItem(walnutRaisinBreadItem);
		ModItems.registerItem(candiedWalnutsItem);
		ModItems.registerItem(brownieItem);
		ModItems.registerItem(guacamoleItem);
		ModItems.registerItem(avocadoBurritoItem);
		ModItems.registerItem(poachedPearItem);
		ModItems.registerItem(fruitCrumbleItem);
		ModItems.registerItem(bananaSplitItem);

		// Item 5
		bananaNutBreadItem = new ModItemFood("bananaNutBreadItem", 9, Config.mealSaturation, false);
		coconutMilkItem = new ModItemFood("coconutMilkItem", 5, Config.mealSaturation, false);
		chickenCurryItem = new ModItemFood("chickenCurryItem", 14, Config.meatymealSaturation, false);
		coconutShrimpItem = new ModItemFood("coconutShrimpItem", 10, Config.meatymealSaturation, false);
		orangeChickenItem = new ModItemFood("orangeChickenItem", 12, Config.meatymealSaturation, false);
		peachCobblerItem = new ModItemFood("peachCobblerItem", 8, Config.mealSaturation, false);
		cinnamonRollItem = new ModItemFood("cinnamonRollItem", 8, Config.snackSaturation, false);
		frenchToastItem = new ModItemFood("frenchToastItem", 10, Config.mealSaturation, false);
		marshmellowsItem = new ModItemFood("marshmellowsItem", 5, Config.snackSaturation, false);
		donutItem = new ModItemFood("donutItem", 6, Config.snackSaturation, false);
		chocolateDonutItem = new ModItemFood("chocolateDonutItem", 8, Config.snackSaturation, false);
		powderedDonutItem = new ModItemFood("powderedDonutItem", 7, Config.snackSaturation, false);
		jellyDonutItem = new ModItemFood("jellyDonutItem", 8, Config.snackSaturation, false);
		frostedDonutItem = new ModItemFood("frostedDonutItem", 9, Config.snackSaturation, false);
		wafflesItem = new ModItemFood("wafflesItem", 9, Config.mealSaturation, false);
		softPretzelItem = new ModItemFood("softPretzelItem", 8, Config.snackSaturation, false);
		jellybeansItem = new ModItemFood("jellybeansItem", 5, Config.snackSaturation, false);
		biscuitItem = new ModItemFood("biscuitItem", 6, Config.mealSaturation, false);
		creamCookieItem = new ModItemFood("creamCookieItem", 7, Config.snackSaturation, false);
		jaffaItem = new ModItemFood("jaffaItem", 9, Config.snackSaturation, false);
		friedChickenItem = new ModItemFood("friedChickenItem", 11, Config.meatymealSaturation, false);
		footlongItem = new ModItemFood("footlongItem", 14, Config.meatymealSaturation, false);

		ModItems.registerItem(bananaNutBreadItem);
		ModItems.registerItem(coconutMilkItem);
		ModItems.registerItem(chickenCurryItem);
		ModItems.registerItem(coconutShrimpItem);
		ModItems.registerItem(orangeChickenItem);
		ModItems.registerItem(peachCobblerItem);
		ModItems.registerItem(cinnamonRollItem);
		ModItems.registerItem(frenchToastItem);
		ModItems.registerItem(marshmellowsItem);
		ModItems.registerItem(donutItem);
		ModItems.registerItem(chocolateDonutItem);
		ModItems.registerItem(powderedDonutItem);
		ModItems.registerItem(jellyDonutItem);
		ModItems.registerItem(frostedDonutItem);
		ModItems.registerItem(wafflesItem);
		ModItems.registerItem(softPretzelItem);
		ModItems.registerItem(jellybeansItem);
		ModItems.registerItem(biscuitItem);
		ModItems.registerItem(creamCookieItem);
		ModItems.registerItem(jaffaItem);
		ModItems.registerItem(friedChickenItem);
		ModItems.registerItem(footlongItem);

		// Item 6
		blackberryCobblerItem = new ModItemFood("blackberryCobblerItem", 8, Config.mealSaturation, false);
		chocolateMilkItem = new ModItemFood("chocolateMilkItem", 6, Config.mealSaturation, false);
		cinnamonSugarDonutItem = new ModItemFood("cinnamonSugarDonutItem", 8, Config.snackSaturation, false);
		saltedSunflowerSeedsItem = new ModItemFood("saltedSunflowerSeedsItem", 6, Config.mealSaturation, false);
		sunflowerWheatRollsItem = new ModItemFood("sunflowerWheatRollsItem", 10, Config.mealSaturation, false);
		cranberrySauceItem = new ModItemFood("cranberrySauceItem", 6, Config.mealSaturation, false);
		cranberryBarItem = new ModItemFood("cranberryBarItem", 8, Config.mealSaturation, false);
		peppermintItem = new ModItemFood("peppermintItem", 5, Config.snackSaturation, false);
		baklavaItem = new ModItemFood("baklavaItem", 10, Config.mealSaturation, false);
		gummyBearsItem = new ModItemFood("gummyBearsItem", 5, Config.snackSaturation, false);
		baconMushroomBurgerItem = new ModItemFood("baconMushroomBurgerItem", 16, Config.snackSaturation, false);
		fruitPunchItem = new ModItemFood("fruitPunchItem", 6, Config.mealSaturation, false);
		meatyStewItem = new ModItemFood("meatyStewItem", 8, Config.meatymealSaturation, false);
		pinacoladaItem = new ModItemFood("pinacoladaItem", 6, Config.mealSaturation, false);
		eggNogItem = new ModItemFood("eggNogItem", 6, Config.mealSaturation, false);
		custardItem = new ModItemFood("custardItem", 6, Config.mealSaturation, false);
		sushiItem = new ModItemFood("sushiItem", 6, Config.meatymealSaturation, false);

		ModItems.registerItem(blackberryCobblerItem);
		ModItems.registerItem(chocolateMilkItem);
		ModItems.registerItem(cinnamonSugarDonutItem);
		ModItems.registerItem(saltedSunflowerSeedsItem);
		ModItems.registerItem(sunflowerWheatRollsItem);
		ModItems.registerItem(cranberrySauceItem);
		ModItems.registerItem(cranberryBarItem);
		ModItems.registerItem(peppermintItem);
		ModItems.registerItem(baklavaItem);
		ModItems.registerItem(gummyBearsItem);
		ModItems.registerItem(baconMushroomBurgerItem);
		ModItems.registerItem(fruitPunchItem);
		ModItems.registerItem(meatyStewItem);
		ModItems.registerItem(pinacoladaItem);
		ModItems.registerItem(eggNogItem);
		ModItems.registerItem(custardItem);
		ModItems.registerItem(sushiItem);

		// Item 7
		caramelIceCreamItem = new ModItemFood("caramelIceCreamItem", 9, Config.mealSaturation, false);
		mintChocolateChipIceCreamItem = new ModItemFood("mintChocolateChipIceCreamItem", 10, Config.mealSaturation,
				false);
		strawberryIceCreamItem = new ModItemFood("strawberryIceCreamItem", 9, Config.mealSaturation, false);
		vanillaIceCreamItem = new ModItemFood("vanillaIceCreamItem", 9, Config.mealSaturation, false);
		gingerChickenItem = new ModItemFood("gingerChickenItem", 12, Config.meatymealSaturation, false);
		spiceBunItem = new ModItemFood("spiceBunItem", 8, Config.mealSaturation, false);
		gingeredRhubarbTartItem = new ModItemFood("gingeredRhubarbTartItem", 8, Config.mealSaturation, false);
		honeyLemonLambItem = new ModItemFood("honeyLemonLambItem", 8, Config.meatymealSaturation, false);
		pumpkinOatSconesItem = new ModItemFood("pumpkinOatSconesItem", 6, Config.mealSaturation, false);
		beefJerkyItem = new ModItemFood("beefJerkyItem", 5, Config.meatymealSaturation, false);
		ovenRoastedCauliflowerItem = new ModItemFood("ovenRoastedCauliflowerItem", 10, Config.mealSaturation, false);
		herbButterParsnipsItem = new ModItemFood("herbButterParsnipsItem", 7, Config.mealSaturation, false);
		scallionBakedPotatoItem = new ModItemFood("scallionBakedPotatoItem", 8, Config.mealSaturation, false);
		soyMilkItem = new ModItemFood("soyMilkItem", 4, Config.mealSaturation, false);
		firmTofuItem = new ModItemFood("firmTofuItem", 4, Config.mealSaturation, false);
		silkenTofuItem = new ModItemFood("silkenTofuItem", 6, Config.mealSaturation, false);

		ModItems.registerItem(caramelIceCreamItem);
		ModItems.registerItem(mintChocolateChipIceCreamItem);
		ModItems.registerItem(strawberryIceCreamItem);
		ModItems.registerItem(vanillaIceCreamItem);
		ModItems.registerItem(gingerChickenItem);
		ModItems.registerItem(spiceBunItem);
		ModItems.registerItem(gingeredRhubarbTartItem);
		ModItems.registerItem(honeyLemonLambItem);
		ModItems.registerItem(pumpkinOatSconesItem);
		ModItems.registerItem(beefJerkyItem);
		ModItems.registerItem(ovenRoastedCauliflowerItem);
		ModItems.registerItem(herbButterParsnipsItem);
		ModItems.registerItem(scallionBakedPotatoItem);
		ModItems.registerItem(soyMilkItem);
		ModItems.registerItem(firmTofuItem);
		ModItems.registerItem(silkenTofuItem);

		// Soda
		cherrySodaItem = new ModItemPotionFood(2, Config.snackSaturation, false, "cherrySodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);
		colaSodaItem = new ModItemPotionFood(2, Config.snackSaturation, false, "colaSodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);
		gingerSodaItem = new ModItemPotionFood(2, Config.snackSaturation, false, "gingerSodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);
		grapeSodaItem = new ModItemPotionFood(2, Config.snackSaturation, false, "grapeSodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);
		lemonLimeSodaItem = new ModItemPotionFood(3, Config.snackSaturation, false, "lemonLimeSodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);
		orangeSodaItem = new ModItemPotionFood(2, Config.snackSaturation, false, "orangeSodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);
		rootbeerSodaItem = new ModItemPotionFood(2, Config.snackSaturation, false, "rootbeerSodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);
		strawberrySodaItem = new ModItemPotionFood(2, Config.snackSaturation, false, "strawberrySodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);
		grapefruitSodaItem = new ModItemPotionFood(2, Config.snackSaturation, false, "grapefruitSodaItem")
				.setPotionEffect(Potion.moveSpeed.id, 60, 0, 0.8F);

		ModItems.registerItem(cherrySodaItem);
		ModItems.registerItem(colaSodaItem);
		ModItems.registerItem(gingerSodaItem);
		ModItems.registerItem(grapeSodaItem);
		ModItems.registerItem(lemonLimeSodaItem);
		ModItems.registerItem(orangeSodaItem);
		ModItems.registerItem(rootbeerSodaItem);
		ModItems.registerItem(strawberrySodaItem);
		ModItems.registerItem(grapefruitSodaItem);

		// Juice
		appleJuiceItem = new ModItemFood("appleJuiceItem", 5, Config.mealSaturation, false);
		apricotJuiceItem = new ModItemFood("apricotJuiceItem", 5, Config.mealSaturation, false);
		blackberryJuiceItem = new ModItemFood("blackberryJuiceItem", 5, Config.mealSaturation, false);
		blueberryJuiceItem = new ModItemFood("blueberryJuiceItem", 5, Config.mealSaturation, false);
		cactusFruitJuiceItem = new ModItemFood("cactusFruitJuiceItem", 5, Config.mealSaturation, false);
		carrotJuiceItem = new ModItemFood("carrotJuiceItem", 5, Config.mealSaturation, false);
		cherryJuiceItem = new ModItemFood("cherryJuiceItem", 5, Config.mealSaturation, false);
		cranberryJuiceItem = new ModItemFood("cranberryJuiceItem", 5, Config.mealSaturation, false);
		figJuiceItem = new ModItemFood("figJuiceItem", 5, Config.mealSaturation, false);
		grapefruitJuiceItem = new ModItemFood("grapefruitJuiceItem", 5, Config.mealSaturation, false);
		grapeJuiceItem = new ModItemFood("grapeJuiceItem", 5, Config.mealSaturation, false);
		kiwiJuiceItem = new ModItemFood("kiwiJuiceItem", 5, Config.mealSaturation, false);
		limeJuiceItem = new ModItemFood("limeJuiceItem", 5, Config.mealSaturation, false);
		mangoJuiceItem = new ModItemFood("mangoJuiceItem", 5, Config.mealSaturation, false);
		melonJuiceItem = new ModItemFood("melonJuiceItem", 5, Config.mealSaturation, false);
		orangeJuiceItem = new ModItemFood("orangeJuiceItem", 5, Config.mealSaturation, false);
		papayaJuiceItem = new ModItemFood("papayaJuiceItem", 5, Config.mealSaturation, false);
		peachJuiceItem = new ModItemFood("peachJuiceItem", 5, Config.mealSaturation, false);
		pearJuiceItem = new ModItemFood("pearJuiceItem", 5, Config.mealSaturation, false);
		persimmonJuiceItem = new ModItemFood("persimmonJuiceItem", 5, Config.mealSaturation, false);
		plumJuiceItem = new ModItemFood("plumJuiceItem", 5, Config.mealSaturation, false);
		pomegranateJuiceItem = new ModItemFood("pomegranateJuiceItem", 5, Config.mealSaturation, false);
		raspberryJuiceItem = new ModItemFood("raspberryJuiceItem", 5, Config.mealSaturation, false);
		starfruitJuiceItem = new ModItemFood("starfruitJuiceItem", 5, Config.mealSaturation, false);
		strawberryJuiceItem = new ModItemFood("strawberryJuiceItem", 5, Config.mealSaturation, false);

		ModItems.registerItem(appleJuiceItem);
		ModItems.registerItem(apricotJuiceItem);
		ModItems.registerItem(blackberryJuiceItem);
		ModItems.registerItem(blueberryJuiceItem);
		ModItems.registerItem(cactusFruitJuiceItem);
		ModItems.registerItem(carrotJuiceItem);
		ModItems.registerItem(cherryJuiceItem);
		ModItems.registerItem(cranberryJuiceItem);
		ModItems.registerItem(figJuiceItem);
		ModItems.registerItem(grapefruitJuiceItem);
		ModItems.registerItem(grapeJuiceItem);
		ModItems.registerItem(kiwiJuiceItem);
		ModItems.registerItem(limeJuiceItem);
		ModItems.registerItem(mangoJuiceItem);
		ModItems.registerItem(melonJuiceItem);
		ModItems.registerItem(orangeJuiceItem);
		ModItems.registerItem(papayaJuiceItem);
		ModItems.registerItem(peachJuiceItem);
		ModItems.registerItem(pearJuiceItem);
		ModItems.registerItem(persimmonJuiceItem);
		ModItems.registerItem(plumJuiceItem);
		ModItems.registerItem(pomegranateJuiceItem);
		ModItems.registerItem(raspberryJuiceItem);
		ModItems.registerItem(starfruitJuiceItem);
		ModItems.registerItem(strawberryJuiceItem);

		// Jelly
		appleJellyItem = new ModItemFood("appleJellyItem", 5, Config.mealSaturation, false);
		apricotJellyItem = new ModItemFood("apricotJellyItem", 5, Config.mealSaturation, false);
		blackberryJellyItem = new ModItemFood("blackberryJellyItem", 5, Config.mealSaturation, false);
		blueberryJellyItem = new ModItemFood("blueberryJellyItem", 5, Config.mealSaturation, false);
		cherryJellyItem = new ModItemFood("cherryJellyItem", 5, Config.mealSaturation, false);
		cranberryJellyItem = new ModItemFood("cranberryJellyItem", 5, Config.mealSaturation, false);
		figJellyItem = new ModItemFood("figJellyItem", 5, Config.mealSaturation, false);
		grapefruitJellyItem = new ModItemFood("grapefruitJellyItem", 5, Config.mealSaturation, false);
		grapeJellyItem = new ModItemFood("grapeJellyItem", 5, Config.mealSaturation, false);
		kiwiJellyItem = new ModItemFood("kiwiJellyItem", 5, Config.mealSaturation, false);
		lemonJellyItem = new ModItemFood("lemonJellyItem", 5, Config.mealSaturation, false);
		limeJellyItem = new ModItemFood("limeJellyItem", 5, Config.mealSaturation, false);
		mangoJellyItem = new ModItemFood("mangoJellyItem", 5, Config.mealSaturation, false);
		orangeJellyItem = new ModItemFood("orangeJellyItem", 5, Config.mealSaturation, false);
		papayaJellyItem = new ModItemFood("papayaJellyItem", 5, Config.mealSaturation, false);
		peachJellyItem = new ModItemFood("peachJellyItem", 5, Config.mealSaturation, false);
		persimmonJellyItem = new ModItemFood("persimmonJellyItem", 5, Config.mealSaturation, false);
		pomegranateJellyItem = new ModItemFood("pomegranateJellyItem", 5, Config.mealSaturation, false);
		raspberryJellyItem = new ModItemFood("raspberryJellyItem", 5, Config.mealSaturation, false);
		starfruitJellyItem = new ModItemFood("starfruitJellyItem", 5, Config.mealSaturation, false);
		strawberryJellyItem = new ModItemFood("strawberryJellyItem", 5, Config.mealSaturation, false);
		watermelonJellyItem = new ModItemFood("watermelonJellyItem", 5, Config.mealSaturation, false);

		ModItems.registerItem(appleJellyItem);
		ModItems.registerItem(apricotJellyItem);
		ModItems.registerItem(blackberryJellyItem);
		ModItems.registerItem(blueberryJellyItem);
		ModItems.registerItem(cherryJellyItem);
		ModItems.registerItem(cranberryJellyItem);
		ModItems.registerItem(figJellyItem);
		ModItems.registerItem(grapefruitJellyItem);
		ModItems.registerItem(grapeJellyItem);
		ModItems.registerItem(kiwiJellyItem);
		ModItems.registerItem(lemonJellyItem);
		ModItems.registerItem(limeJellyItem);
		ModItems.registerItem(mangoJellyItem);
		ModItems.registerItem(orangeJellyItem);
		ModItems.registerItem(papayaJellyItem);
		ModItems.registerItem(peachJellyItem);
		ModItems.registerItem(persimmonJellyItem);
		ModItems.registerItem(pomegranateJellyItem);
		ModItems.registerItem(raspberryJellyItem);
		ModItems.registerItem(starfruitJellyItem);
		ModItems.registerItem(strawberryJellyItem);
		ModItems.registerItem(watermelonJellyItem);

		// Smoothie
		apricotSmoothieItem = new ModItemFood("apricotSmoothieItem", 6, Config.mealSaturation, false);
		bananaSmoothieItem = new ModItemFood("bananaSmoothieItem", 6, Config.mealSaturation, false);
		blackberrySmoothieItem = new ModItemFood("blackberrySmoothieItem", 6, Config.mealSaturation, false);
		blueberrySmoothieItem = new ModItemFood("blueberrySmoothieItem", 6, Config.mealSaturation, false);
		cherrySmoothieItem = new ModItemFood("cherrySmoothieItem", 6, Config.mealSaturation, false);
		figSmoothieItem = new ModItemFood("figSmoothieItem", 6, Config.mealSaturation, false);
		grapefruitSmoothieItem = new ModItemFood("grapefruitSmoothieItem", 6, Config.mealSaturation, false);
		kiwiSmoothieItem = new ModItemFood("kiwiSmoothieItem", 6, Config.mealSaturation, false);
		lemonSmoothieItem = new ModItemFood("lemonSmoothieItem", 6, Config.mealSaturation, false);
		limeSmoothieItem = new ModItemFood("limeSmoothieItem", 6, Config.mealSaturation, false);
		mangoSmoothieItem = new ModItemFood("mangoSmoothieItem", 6, Config.mealSaturation, false);
		melonSmoothieItem = new ModItemFood("melonSmoothieItem", 6, Config.mealSaturation, false);
		orangeSmoothieItem = new ModItemFood("orangeSmoothieItem", 6, Config.mealSaturation, false);
		papayaSmoothieItem = new ModItemFood("papayaSmoothieItem", 6, Config.mealSaturation, false);
		peachSmoothieItem = new ModItemFood("peachSmoothieItem", 6, Config.mealSaturation, false);
		persimmonSmoothieItem = new ModItemFood("persimmonSmoothieItem", 6, Config.mealSaturation, false);
		pomegranateSmoothieItem = new ModItemFood("pomegranateSmoothieItem", 6, Config.mealSaturation, false);
		raspberrySmoothieItem = new ModItemFood("raspberrySmoothieItem", 6, Config.mealSaturation, false);
		starfruitSmoothieItem = new ModItemFood("starfruitSmoothieItem", 6, Config.mealSaturation, false);
		strawberrySmoothieItem = new ModItemFood("strawberrySmoothieItem", 6, Config.mealSaturation, false);

		ModItems.registerItem(apricotSmoothieItem);
		ModItems.registerItem(bananaSmoothieItem);
		ModItems.registerItem(blackberrySmoothieItem);
		ModItems.registerItem(blueberrySmoothieItem);
		ModItems.registerItem(cherrySmoothieItem);
		ModItems.registerItem(figSmoothieItem);
		ModItems.registerItem(grapefruitSmoothieItem);
		ModItems.registerItem(kiwiSmoothieItem);
		ModItems.registerItem(lemonSmoothieItem);
		ModItems.registerItem(limeSmoothieItem);
		ModItems.registerItem(mangoSmoothieItem);
		ModItems.registerItem(melonSmoothieItem);
		ModItems.registerItem(orangeSmoothieItem);
		ModItems.registerItem(papayaSmoothieItem);
		ModItems.registerItem(peachSmoothieItem);
		ModItems.registerItem(persimmonSmoothieItem);
		ModItems.registerItem(pomegranateSmoothieItem);
		ModItems.registerItem(raspberrySmoothieItem);
		ModItems.registerItem(starfruitSmoothieItem);
		ModItems.registerItem(strawberrySmoothieItem);

		// Yogurt
		appleYogurtItem = new ModItemFood("appleYogurtItem", 8, Config.mealSaturation, false);
		apricotYogurtItem = new ModItemFood("apricotYogurtItem", 8, Config.mealSaturation, false);
		bananaYogurtItem = new ModItemFood("bananaYogurtItem", 8, Config.mealSaturation, false);
		blackberryYogurtItem = new ModItemFood("blackberryYogurtItem", 8, Config.mealSaturation, false);
		blueberryYogurtItem = new ModItemFood("blueberryYogurtItem", 8, Config.mealSaturation, false);
		cherryYogurtItem = new ModItemFood("cherryYogurtItem", 8, Config.mealSaturation, false);
		chocolateYogurtItem = new ModItemFood("chocolateYogurtItem", 8, Config.mealSaturation, false);
		coconutYogurtItem = new ModItemFood("coconutYogurtItem", 8, Config.mealSaturation, false);
		figYogurtItem = new ModItemFood("figYogurtItem", 8, Config.mealSaturation, false);
		grapefruitYogurtItem = new ModItemFood("grapefruitYogurtItem", 8, Config.mealSaturation, false);
		grapeYogurtItem = new ModItemFood("grapeYogurtItem", 8, Config.mealSaturation, false);
		kiwiYogurtItem = new ModItemFood("kiwiYogurtItem", 8, Config.mealSaturation, false);
		lemonYogurtItem = new ModItemFood("lemonYogurtItem", 8, Config.mealSaturation, false);
		limeYogurtItem = new ModItemFood("limeYogurtItem", 8, Config.mealSaturation, false);
		mangoYogurtItem = new ModItemFood("mangoYogurtItem", 8, Config.mealSaturation, false);
		melonYogurtItem = new ModItemFood("melonYogurtItem", 8, Config.mealSaturation, false);
		orangeYogurtItem = new ModItemFood("orangeYogurtItem", 8, Config.mealSaturation, false);
		papayaYogurtItem = new ModItemFood("papayaYogurtItem", 8, Config.mealSaturation, false);
		peachYogurtItem = new ModItemFood("peachYogurtItem", 8, Config.mealSaturation, false);
		pearYogurtItem = new ModItemFood("pearYogurtItem", 8, Config.mealSaturation, false);
		persimmonYogurtItem = new ModItemFood("persimmonYogurtItem", 8, Config.mealSaturation, false);
		pineappleYogurtItem = new ModItemFood("pineappleYogurtItem", 8, Config.mealSaturation, false);
		plainYogurtItem = new ModItemFood("plainYogurtItem", 4, Config.mealSaturation, false);
		plumYogurtItem = new ModItemFood("plumYogurtItem", 8, Config.mealSaturation, false);
		pomegranateYogurtItem = new ModItemFood("pomegranateYogurtItem", 8, Config.mealSaturation, false);
		pumpkinYogurtItem = new ModItemFood("pumpkinYogurtItem", 8, Config.mealSaturation, false);
		raspberryYogurtItem = new ModItemFood("raspberryYogurtItem", 8, Config.mealSaturation, false);
		starfruitYogurtItem = new ModItemFood("starfruitYogurtItem", 8, Config.mealSaturation, false);
		strawberryYogurtItem = new ModItemFood("strawberryYogurtItem", 8, Config.mealSaturation, false);
		vanillaYogurtItem = new ModItemFood("vanillaYogurtItem", 8, Config.mealSaturation, false);

		ModItems.registerItem(appleYogurtItem);
		ModItems.registerItem(apricotYogurtItem);
		ModItems.registerItem(bananaYogurtItem);
		ModItems.registerItem(blackberryYogurtItem);
		ModItems.registerItem(blueberryYogurtItem);
		ModItems.registerItem(cherryYogurtItem);
		ModItems.registerItem(chocolateYogurtItem);
		ModItems.registerItem(coconutYogurtItem);
		ModItems.registerItem(figYogurtItem);
		ModItems.registerItem(grapefruitYogurtItem);
		ModItems.registerItem(grapeYogurtItem);
		ModItems.registerItem(kiwiYogurtItem);
		ModItems.registerItem(lemonYogurtItem);
		ModItems.registerItem(limeYogurtItem);
		ModItems.registerItem(mangoYogurtItem);
		ModItems.registerItem(melonYogurtItem);
		ModItems.registerItem(orangeYogurtItem);
		ModItems.registerItem(papayaYogurtItem);
		ModItems.registerItem(peachYogurtItem);
		ModItems.registerItem(pearYogurtItem);
		ModItems.registerItem(persimmonYogurtItem);
		ModItems.registerItem(pineappleYogurtItem);
		ModItems.registerItem(plainYogurtItem);
		ModItems.registerItem(plumYogurtItem);
		ModItems.registerItem(pomegranateYogurtItem);
		ModItems.registerItem(pumpkinYogurtItem);
		ModItems.registerItem(raspberryYogurtItem);
		ModItems.registerItem(starfruitYogurtItem);
		ModItems.registerItem(strawberryYogurtItem);
		ModItems.registerItem(vanillaYogurtItem);

		// Sandwich
		chickenSandwichItem = new ModItemFood("chickenSandwichItem", 9, Config.meatymealSaturation, false);
		fishSandwichItem = new ModItemFood("fishSandwichItem", 8, Config.mealSaturation, false);
		leafyChickenSandwichItem = new ModItemFood("leafyChickenSandwichItem", 11, Config.meatymealSaturation, false);
		leafyFishSandwichItem = new ModItemFood("leafyFishSandwichItem", 9, Config.meatymealSaturation, false);
		toastSandwichItem = new ModItemFood("toastSandwichItem", 8, Config.mealSaturation, false);

		ModItems.registerItem(chickenSandwichItem);
		ModItems.registerItem(fishSandwichItem);
		ModItems.registerItem(leafyChickenSandwichItem);
		ModItems.registerItem(leafyFishSandwichItem);
		ModItems.registerItem(toastSandwichItem);

		// Jelly Sandwich
		appleJellySandwichItem = new ModItemFood("appleJellySandwichItem", 10, Config.mealSaturation, false);
		apricotJellySandwichItem = new ModItemFood("apricotJellySandwichItem", 10, Config.mealSaturation, false);
		blackberryJellySandwichItem = new ModItemFood("blackberryJellySandwichItem", 10, Config.mealSaturation, false);
		blueberryJellySandwichItem = new ModItemFood("blueberryJellySandwichItem", 10, Config.mealSaturation, false);
		cherryJellySandwichItem = new ModItemFood("cherryJellySandwichItem", 10, Config.mealSaturation, false);
		cranberryJellySandwichItem = new ModItemFood("cranberryJellySandwichItem", 10, Config.mealSaturation, false);
		figJellySandwichItem = new ModItemFood("figJellySandwichItem", 10, Config.mealSaturation, false);
		grapefruitJellySandwichItem = new ModItemFood("grapefruitJellySandwichItem", 10, Config.mealSaturation, false);
		kiwiJellySandwichItem = new ModItemFood("kiwiJellySandwichItem", 10, Config.mealSaturation, false);
		lemonJellySandwichItem = new ModItemFood("lemonJellySandwichItem", 10, Config.mealSaturation, false);
		limeJellySandwichItem = new ModItemFood("limeJellySandwichItem", 10, Config.mealSaturation, false);
		mangoJellySandwichItem = new ModItemFood("mangoJellySandwichItem", 10, Config.mealSaturation, false);
		orangeJellySandwichItem = new ModItemFood("orangeJellySandwichItem", 10, Config.mealSaturation, false);
		papayaJellySandwichItem = new ModItemFood("papayaJellySandwichItem", 10, Config.mealSaturation, false);
		peachJellySandwichItem = new ModItemFood("peachJellySandwichItem", 10, Config.mealSaturation, false);
		persimmonJellySandwichItem = new ModItemFood("persimmonJellySandwichItem", 10, Config.mealSaturation, false);
		pomegranateJellySandwichItem = new ModItemFood("pomegranateJellySandwichItem", 10, Config.mealSaturation,
				false);
		raspberryJellySandwichItem = new ModItemFood("raspberryJellySandwichItem", 10, Config.mealSaturation, false);
		starfruitJellySandwichItem = new ModItemFood("starfruitJellySandwichItem", 10, Config.mealSaturation, false);
		strawberryJellySandwichItem = new ModItemFood("strawberryJellySandwichItem", 10, Config.mealSaturation, false);
		watermelonJellySandwichItem = new ModItemFood("watermelonJellySandwichItem", 10, Config.mealSaturation, false);

		ModItems.registerItem(appleJellySandwichItem);
		ModItems.registerItem(apricotJellySandwichItem);
		ModItems.registerItem(blackberryJellySandwichItem);
		ModItems.registerItem(blueberryJellySandwichItem);
		ModItems.registerItem(cherryJellySandwichItem);
		ModItems.registerItem(cranberryJellySandwichItem);
		ModItems.registerItem(figJellySandwichItem);
		ModItems.registerItem(grapefruitJellySandwichItem);
		ModItems.registerItem(kiwiJellySandwichItem);
		ModItems.registerItem(lemonJellySandwichItem);
		ModItems.registerItem(limeJellySandwichItem);
		ModItems.registerItem(mangoJellySandwichItem);
		ModItems.registerItem(orangeJellySandwichItem);
		ModItems.registerItem(papayaJellySandwichItem);
		ModItems.registerItem(peachJellySandwichItem);
		ModItems.registerItem(persimmonJellySandwichItem);
		ModItems.registerItem(pomegranateJellySandwichItem);
		ModItems.registerItem(raspberryJellySandwichItem);
		ModItems.registerItem(starfruitJellySandwichItem);
		ModItems.registerItem(strawberryJellySandwichItem);
		ModItems.registerItem(watermelonJellySandwichItem);

		// Soup
		asparagusSoupItem = new ModItemFood("asparagusSoupItem", 8, Config.mealSaturation, false);
		beetSoupItem = new ModItemFood("beetSoupItem", 9, Config.mealSaturation, false);
		cactusSoupItem = new ModItemFood("cactusSoupItem", 6, Config.mealSaturation, false);
		carrotSoupItem = new ModItemFood("carrotSoupItem", 8, Config.meatymealSaturation, false);
		celerySoupItem = new ModItemFood("celerySoupItem", 8, Config.mealSaturation, false);
		chickenNoodleSoupItem = new ModItemFood("chickenNoodleSoupItem", 9, Config.meatymealSaturation, false);
		creamedBroccoliSoupItem = new ModItemFood("creamedBroccoliSoupItem", 10, Config.mealSaturation, false);
		creamOfAvocadoSoupItem = new ModItemFood("creamOfAvocadoSoupItem", 10, Config.mealSaturation, false);
		cucumberSoupItem = new ModItemFood("cucumberSoupItem", 8, Config.mealSaturation, false);
		gardenSoupItem = new ModItemFood("gardenSoupItem", 6, Config.mealSaturation, false);
		lambBarleySoupItem = new ModItemFood("lambBarleySoupItem", 10, Config.meatymealSaturation, false);
		leekBaconSoupItem = new ModItemFood("leekBaconSoupItem", 8, Config.meatymealSaturation, false);
		oldWorldVeggieSoupItem = new ModItemFood("oldWorldVeggieSoupItem", 8, Config.mealSaturation, false);
		onionSoupItem = new ModItemFood("onionSoupItem", 12, Config.mealSaturation, false);
		potatoSoupItem = new ModItemFood("potatoSoupItem", 6, Config.meatymealSaturation, false);
		pumpkinSoupItem = new ModItemFood("pumpkinSoupItem", 8, Config.meatymealSaturation, false);
		riceSoupItem = new ModItemFood("riceSoupItem", 6, Config.mealSaturation, false);
		seedSoupItem = new ModItemFood("seedSoupItem", 4, Config.mealSaturation, false);
		spiderEyeSoupItem = new ModItemFood("spiderEyeSoupItem", 8, Config.meatymealSaturation, false);
		splitPeaSoupItem = new ModItemFood("splitPeaSoupItem", 12, Config.meatymealSaturation, false);
		tomatoSoupItem = new ModItemFood("tomatoSoupItem", 6, Config.mealSaturation, false);
		turnipSoupItem = new ModItemFood("turnipSoupItem", 8, Config.mealSaturation, false);
		vegetableSoupItem = new ModItemFood("vegetableSoupItem", 8, Config.meatymealSaturation, false);

		ModItems.registerItem(asparagusSoupItem);
		ModItems.registerItem(beetSoupItem);
		ModItems.registerItem(cactusSoupItem);
		ModItems.registerItem(carrotSoupItem);
		ModItems.registerItem(celerySoupItem);
		ModItems.registerItem(chickenNoodleSoupItem);
		ModItems.registerItem(creamedBroccoliSoupItem);
		ModItems.registerItem(creamOfAvocadoSoupItem);
		ModItems.registerItem(cucumberSoupItem);
		ModItems.registerItem(gardenSoupItem);
		ModItems.registerItem(lambBarleySoupItem);
		ModItems.registerItem(leekBaconSoupItem);
		ModItems.registerItem(oldWorldVeggieSoupItem);
		ModItems.registerItem(onionSoupItem);
		ModItems.registerItem(potatoSoupItem);
		ModItems.registerItem(pumpkinSoupItem);
		ModItems.registerItem(riceSoupItem);
		ModItems.registerItem(seedSoupItem);
		ModItems.registerItem(spiderEyeSoupItem);
		ModItems.registerItem(splitPeaSoupItem);
		ModItems.registerItem(tomatoSoupItem);
		ModItems.registerItem(turnipSoupItem);
		ModItems.registerItem(vegetableSoupItem);

		// Pie
		applePieItem = new ModItemFood("applePieItem", 8, Config.meatymealSaturation, false);
		blueberryPieItem = new ModItemFood("blueberryPieItem", 8, Config.mealSaturation, false);
		cherryPieItem = new ModItemFood("cherryPieItem", 8, Config.mealSaturation, false);
		chickenPotPieItem = new ModItemFood("chickenPotPieItem", 10, Config.meatymealSaturation, false);
		keylimePieItem = new ModItemFood("keylimePieItem", 6, Config.mealSaturation, false);
		pecanPieItem = new ModItemFood("pecanPieItem", 6, Config.mealSaturation, false);
		raspberryPieItem = new ModItemFood("raspberryPieItem", 8, Config.mealSaturation, false);
		shepardsPieItem = new ModItemFood("shepardsPieItem", 12, Config.meatymealSaturation, false);
		strawberryPieItem = new ModItemFood("strawberryPieItem", 8, Config.mealSaturation, false);
		sweetPotatoPieItem = new ModItemFood("sweetPotatoPieItem", 10, Config.mealSaturation, false);

		ModItems.registerItem(applePieItem);
		ModItems.registerItem(blueberryPieItem);
		ModItems.registerItem(cherryPieItem);
		ModItems.registerItem(chickenPotPieItem);
		ModItems.registerItem(keylimePieItem);
		ModItems.registerItem(pecanPieItem);
		ModItems.registerItem(raspberryPieItem);
		ModItems.registerItem(shepardsPieItem);
		ModItems.registerItem(strawberryPieItem);
		ModItems.registerItem(sweetPotatoPieItem);

		// Salad
		beetSaladItem = new ModItemFood("beetSaladItem", 10, Config.mealSaturation, false);
		citrusSaladItem = new ModItemFood("citrusSaladItem", 6, Config.mealSaturation, false);
		cucumberSaladItem = new ModItemFood("cucumberSaladItem", 11, Config.mealSaturation, false);
		eggSaladItem = new ModItemFood("eggSaladItem", 8, Config.meatymealSaturation, false);
		fruitSaladItem = new ModItemFood("fruitSaladItem", 6, Config.meatymealSaturation, false);
		grapeSaladItem = new ModItemFood("grapeSaladItem", 8, Config.mealSaturation, false);
		mixedSaladItem = new ModItemFood("mixedSaladItem", 10, Config.mealSaturation, false);
		potatoSaladItem = new ModItemFood("potatoSaladItem", 7, Config.meatymealSaturation, false);
		springSaladItem = new ModItemFood("springSaladItem", 9, Config.mealSaturation, false);
		strawberrySaladItem = new ModItemFood("strawberrySaladItem", 8, Config.mealSaturation, false);
		summerRadishSaladItem = new ModItemFood("summerRadishSaladItem", 8, Config.mealSaturation, false);
		sunflowerBroccoliSaladItem = new ModItemFood("sunflowerBroccoliSaladItem", 13, Config.mealSaturation, false);

		ModItems.registerItem(beetSaladItem);
		ModItems.registerItem(citrusSaladItem);
		ModItems.registerItem(cucumberSaladItem);
		ModItems.registerItem(eggSaladItem);
		ModItems.registerItem(fruitSaladItem);
		ModItems.registerItem(grapeSaladItem);
		ModItems.registerItem(mixedSaladItem);
		ModItems.registerItem(potatoSaladItem);
		ModItems.registerItem(springSaladItem);
		ModItems.registerItem(strawberrySaladItem);
		ModItems.registerItem(summerRadishSaladItem);
		ModItems.registerItem(sunflowerBroccoliSaladItem);

		// Cake
		carrotCakeItem = new ModItemFood("carrotCakeItem", 8, Config.mealSaturation, false);
		cheesecakeItem = new ModItemFood("cheesecakeItem", 10, Config.mealSaturation, false);
		cherryCheesecakeItem = new ModItemFood("cherryCheesecakeItem", 12, Config.snackSaturation, false);
		chocolateSprinkleCakeItem = new ModItemFood("chocolateSprinkleCakeItem", 8, Config.snackSaturation, false);
		pineappleUpsidedownCakeItem = new ModItemFood("pineappleUpsidedownCakeItem", 9, Config.snackSaturation, false);
		redVelvetCakeItem = new ModItemFood("redVelvetCakeItem", 8, Config.snackSaturation, false);
		riceCakeItem = new ModItemFood("riceCakeItem", 4, Config.snackSaturation, false);

		ModItems.registerItem(carrotCakeItem);
		ModItems.registerItem(cheesecakeItem);
		ModItems.registerItem(cherryCheesecakeItem);
		ModItems.registerItem(chocolateSprinkleCakeItem);
		ModItems.registerItem(pineappleUpsidedownCakeItem);
		ModItems.registerItem(redVelvetCakeItem);
		ModItems.registerItem(riceCakeItem);

		// Other
		bambooSteamedRiceItem = new ModItemFood("bambooSteamedRiceItem", 6, Config.mealSaturation, false);
		roastedChestnutItem = new ModItemFood("roastedChestnutItem", 4, Config.snackSaturation, false);
		sweetPotatoSouffleItem = new ModItemFood("sweetPotatoSouffleItem", 6, Config.mealSaturation, false);
		cashewChickenItem = new ModItemFood("cashewChickenItem", 6, Config.mealSaturation, false);
		apricotGlazedPorkItem = new ModItemFood("apricotGlazedPorkItem", 6, Config.meatymealSaturation, false);
		figBarItem = new ModItemFood("figBarItem", 6, Config.mealSaturation, false);
		pralinesItem = new ModItemFood("pralinesItem", 6, Config.snackSaturation, false);
		pistachioBakedSalmonItem = new ModItemFood("pistachioBakedSalmonItem", 10, Config.mealSaturation, false);
		baconWrappedDatesItem = new ModItemFood("baconWrappedDatesItem", 12, Config.meatymealSaturation, false);
		dateNutBreadItem = new ModItemFood("dateNutBreadItem", 7, Config.mealSaturation, false);
		mapleSyrupPancakesItem = new ModItemFood("mapleSyrupPancakesItem", 7, Config.mealSaturation, false);
		mapleSyrupWafflesItem = new ModItemFood("mapleSyrupWafflesItem", 7, Config.mealSaturation, false);
		mapleSausageItem = new ModItemFood("mapleSausageItem", 1, Config.meatymealSaturation, false);
		mapleOatmealItem = new ModItemFood("mapleOatmealItem", 6, Config.mealSaturation, false);
		peachesAndCreamOatmealItem = new ModItemFood("peachesAndCreamOatmealItem", 8, Config.mealSaturation, false);
		cinnamonAppleOatmealItem = new ModItemFood("cinnamonAppleOatmealItem", 8, Config.mealSaturation, false);
		mapleCandiedBaconItem = new ModItemFood("mapleCandiedBaconItem", 6, Config.meatymealSaturation, false);
		potatoAndCheesePirogiItem = new ModItemFood("potatoAndCheesePirogiItem", 6, Config.mealSaturation, false);
		zeppoleItem = new ModItemFood("zeppoleItem", 6, Config.mealSaturation, false);
		sausageInBreadItem = new ModItemFood("sausageInBreadItem", 18, Config.meatymealSaturation, false);
		chocolateCaramelFudgeItem = new ModItemFood("chocolateCaramelFudgeItem", 6, Config.snackSaturation, false);
		lavenderShortbreadItem = new ModItemFood("lavenderShortbreadItem", 7, Config.mealSaturation, false);
		beefWellingtonItem = new ModItemFood("beefWellingtonItem", 18, Config.meatymealSaturation, false);
		epicBaconItem = new ModItemFood("epicBaconItem", 18, Config.meatymealSaturation, false);
		manjuuItem = new ModItemFood("manjuuItem", 6, Config.mealSaturation, false);

		ModItems.registerItem(bambooSteamedRiceItem);
		ModItems.registerItem(roastedChestnutItem);
		ModItems.registerItem(sweetPotatoSouffleItem);
		ModItems.registerItem(cashewChickenItem);
		ModItems.registerItem(apricotGlazedPorkItem);
		ModItems.registerItem(figBarItem);
		ModItems.registerItem(pralinesItem);
		ModItems.registerItem(pistachioBakedSalmonItem);
		ModItems.registerItem(baconWrappedDatesItem);
		ModItems.registerItem(dateNutBreadItem);
		ModItems.registerItem(mapleSyrupPancakesItem);
		ModItems.registerItem(mapleSyrupWafflesItem);
		ModItems.registerItem(mapleSausageItem);
		ModItems.registerItem(mapleOatmealItem);
		ModItems.registerItem(peachesAndCreamOatmealItem);
		ModItems.registerItem(cinnamonAppleOatmealItem);
		ModItems.registerItem(mapleCandiedBaconItem);
		ModItems.registerItem(potatoAndCheesePirogiItem);
		ModItems.registerItem(zeppoleItem);
		ModItems.registerItem(sausageInBreadItem);
		ModItems.registerItem(chocolateCaramelFudgeItem);
		ModItems.registerItem(lavenderShortbreadItem);
		ModItems.registerItem(beefWellingtonItem);
		ModItems.registerItem(epicBaconItem);
		ModItems.registerItem(manjuuItem);

		// Seeds Box
		artichokeSeedBoxItem = new ModItemBox("artichokeSeedBoxItem", artichokeSeedItem);
		asparagusSeedBoxItem = new ModItemBox("asparagusSeedBoxItem", asparagusSeedItem);
		bambooShootSeedBoxItem = new ModItemBox("bambooShootSeedBoxItem", bambooShootSeedItem);
		barleySeedBoxItem = new ModItemBox("barleySeedBoxItem", barleySeedItem);
		beanSeedBoxItem = new ModItemBox("beanSeedBoxItem", beanSeedItem);
		beetSeedBoxItem = new ModItemBox("beetSeedBoxItem", beetSeedItem);
		bellpepperSeedBoxItem = new ModItemBox("bellpepperSeedBoxItem", bellpepperSeedItem);
		blackberrySeedBoxItem = new ModItemBox("blackberrySeedBoxItem", blackberrySeedItem);
		blueberrySeedBoxItem = new ModItemBox("blueberrySeedBoxItem", blueberrySeedItem);
		broccoliSeedBoxItem = new ModItemBox("broccoliSeedBoxItem", broccoliSeedItem);
		brusselSproutSeedBoxItem = new ModItemBox("brusselSproutSeedBoxItem", brusselSproutSeedItem);
		cabbageSeedBoxItem = new ModItemBox("cabbageSeedBoxItem", cabbageSeedItem);
		cactusFruitSeedBoxItem = new ModItemBox("cactusFruitSeedBoxItem", cactusFruitSeedItem);
		candleberrySeedBoxItem = new ModItemBox("candleberrySeedBoxItem", candleberrySeedItem);
		cantaloupeSeedBoxItem = new ModItemBox("cantaloupeSeedBoxItem", cantaloupeSeedItem);
		cauliflowerSeedBoxItem = new ModItemBox("cauliflowerSeedBoxItem", cauliflowerSeedItem);
		celerySeedBoxItem = new ModItemBox("celerySeedBoxItem", celerySeedItem);
		chilipepperSeedBoxItem = new ModItemBox("chilipepperSeedBoxItem", chilipepperSeedItem);
		coffeeSeedBoxItem = new ModItemBox("coffeeSeedBoxItem", coffeeBeanSeedItem);
		cornSeedBoxItem = new ModItemBox("cornSeedBoxItem", cornSeedItem);
		cottonSeedBoxItem = new ModItemBox("cottonSeedBoxItem", cottonSeedItem);
		cranberrySeedBoxItem = new ModItemBox("cranberrySeedBoxItem", cranberrySeedItem);
		cucumberSeedBoxItem = new ModItemBox("cucumberSeedBoxItem", cucumberSeedItem);
		eggplantSeedBoxItem = new ModItemBox("eggplantSeedBoxItem", eggplantSeedItem);
		garlicSeedBoxItem = new ModItemBox("garlicSeedBoxItem", garlicSeedItem);
		gingerSeedBoxItem = new ModItemBox("gingerSeedBoxItem", gingerSeedItem);
		grapeSeedBoxItem = new ModItemBox("grapeSeedBoxItem", grapeSeedItem);
		kiwiSeedBoxItem = new ModItemBox("kiwiSeedBoxItem", kiwiSeedItem);
		leekSeedBoxItem = new ModItemBox("leekSeedBoxItem", leekSeedItem);
		lettuceSeedBoxItem = new ModItemBox("lettuceSeedBoxItem", lettuceSeedItem);
		mustardSeedBoxItem = new ModItemBox("mustardSeedBoxItem", mustardSeedItem);
		oatsSeedBoxItem = new ModItemBox("oatsSeedBoxItem", oatsSeedItem);
		okraSeedBoxItem = new ModItemBox("okraSeedBoxItem", okraSeedItem);
		onionSeedBoxItem = new ModItemBox("onionSeedBoxItem", onionSeedItem);
		parsnipSeedBoxItem = new ModItemBox("parsnipSeedBoxItem", parsnipSeedItem);
		peanutSeedBoxItem = new ModItemBox("peanutSeedBoxItem", peanutSeedItem);
		peasSeedBoxItem = new ModItemBox("peasSeedBoxItem", peasSeedItem);
		pineappleSeedBoxItem = new ModItemBox("pineappleSeedBoxItem", pineappleSeedItem);
		radishSeedBoxItem = new ModItemBox("radishSeedBoxItem", radishSeedItem);
		raspberrySeedBoxItem = new ModItemBox("raspberrySeedBoxItem", raspberrySeedItem);
		rhubarbSeedBoxItem = new ModItemBox("rhubarbSeedBoxItem", rhubarbSeedItem);
		riceSeedBoxItem = new ModItemBox("riceSeedBoxItem", riceSeedItem);
		rutabagaSeedBoxItem = new ModItemBox("rutabagaSeedBoxItem", rutabagaSeedItem);
		ryeSeedBoxItem = new ModItemBox("ryeSeedBoxItem", ryeSeedItem);
		scallionSeedBoxItem = new ModItemBox("scallionSeedBoxItem", scallionSeedItem);
		seaweedSeedBoxItem = new ModItemBox("seaweedSeedBoxItem", seaweedSeedItem);
		soybeanSeedBoxItem = new ModItemBox("soybeanSeedBoxItem", soybeanSeedItem);
		spiceleafSeedBoxItem = new ModItemBox("spiceleafSeedBoxItem", spiceleafSeedItem);
		strawberrySeedBoxItem = new ModItemBox("strawberrySeedBoxItem", strawberrySeedItem);
		sweetPotatoSeedBoxItem = new ModItemBox("sweetPotatoSeedBoxItem", sweetPotatoSeedItem);
		teaSeedBoxItem = new ModItemBox("teaSeedBoxItem", teaLeafSeedItem);
		tomatoSeedBoxItem = new ModItemBox("tomatoSeedBoxItem", tomatoSeedItem);
		turnipSeedBoxItem = new ModItemBox("turnipSeedBoxItem", turnipSeedItem);
		whiteMushroomSeedBoxItem = new ModItemBox("whiteMushroomSeedBoxItem", whiteMushroomSeedItem);
		winterSquashSeedBoxItem = new ModItemBox("winterSquashSeedBoxItem", winterSquashSeedItem);
		zucchiniSeedBoxItem = new ModItemBox("zucchiniSeedBoxItem", zucchiniSeedItem);

		ModItems.registerItem(artichokeSeedBoxItem);
		ModItems.registerItem(asparagusSeedBoxItem);
		ModItems.registerItem(bambooShootSeedBoxItem);
		ModItems.registerItem(barleySeedBoxItem);
		ModItems.registerItem(beanSeedBoxItem);
		ModItems.registerItem(beetSeedBoxItem);
		ModItems.registerItem(bellpepperSeedBoxItem);
		ModItems.registerItem(blackberrySeedBoxItem);
		ModItems.registerItem(blueberrySeedBoxItem);
		ModItems.registerItem(broccoliSeedBoxItem);
		ModItems.registerItem(brusselSproutSeedBoxItem);
		ModItems.registerItem(cabbageSeedBoxItem);
		ModItems.registerItem(cactusFruitSeedBoxItem);
		ModItems.registerItem(candleberrySeedBoxItem);
		ModItems.registerItem(cantaloupeSeedBoxItem);
		ModItems.registerItem(cauliflowerSeedBoxItem);
		ModItems.registerItem(celerySeedBoxItem);
		ModItems.registerItem(chilipepperSeedBoxItem);
		ModItems.registerItem(coffeeSeedBoxItem);
		ModItems.registerItem(cornSeedBoxItem);
		ModItems.registerItem(cottonSeedBoxItem);
		ModItems.registerItem(cranberrySeedBoxItem);
		ModItems.registerItem(cucumberSeedBoxItem);
		ModItems.registerItem(eggplantSeedBoxItem);
		ModItems.registerItem(garlicSeedBoxItem);
		ModItems.registerItem(gingerSeedBoxItem);
		ModItems.registerItem(grapeSeedBoxItem);
		ModItems.registerItem(kiwiSeedBoxItem);
		ModItems.registerItem(leekSeedBoxItem);
		ModItems.registerItem(lettuceSeedBoxItem);
		ModItems.registerItem(mustardSeedBoxItem);
		ModItems.registerItem(oatsSeedBoxItem);
		ModItems.registerItem(okraSeedBoxItem);
		ModItems.registerItem(onionSeedBoxItem);
		ModItems.registerItem(parsnipSeedBoxItem);
		ModItems.registerItem(peanutSeedBoxItem);
		ModItems.registerItem(peasSeedBoxItem);
		ModItems.registerItem(pineappleSeedBoxItem);
		ModItems.registerItem(radishSeedBoxItem);
		ModItems.registerItem(raspberrySeedBoxItem);
		ModItems.registerItem(rhubarbSeedBoxItem);
		ModItems.registerItem(riceSeedBoxItem);
		ModItems.registerItem(rutabagaSeedBoxItem);
		ModItems.registerItem(ryeSeedBoxItem);
		ModItems.registerItem(scallionSeedBoxItem);
		ModItems.registerItem(seaweedSeedBoxItem);
		ModItems.registerItem(soybeanSeedBoxItem);
		ModItems.registerItem(spiceleafSeedBoxItem);
		ModItems.registerItem(strawberrySeedBoxItem);
		ModItems.registerItem(sweetPotatoSeedBoxItem);
		ModItems.registerItem(teaSeedBoxItem);
		ModItems.registerItem(tomatoSeedBoxItem);
		ModItems.registerItem(turnipSeedBoxItem);
		ModItems.registerItem(whiteMushroomSeedBoxItem);
		ModItems.registerItem(winterSquashSeedBoxItem);
		ModItems.registerItem(zucchiniSeedBoxItem);

		// Seeds Packet
		artichokeSeedPacketItem = new ModItemPacket("artichokeSeedPacketItem", artichokeSeedItem);
		asparagusSeedPacketItem = new ModItemPacket("asparagusSeedPacketItem", asparagusSeedItem);
		bambooShootSeedPacketItem = new ModItemPacket("bambooShootSeedPacketItem", bambooShootSeedItem);
		barleySeedPacketItem = new ModItemPacket("barleySeedPacketItem", barleySeedItem);
		beanSeedPacketItem = new ModItemPacket("beanSeedPacketItem", beanSeedItem);
		beetSeedPacketItem = new ModItemPacket("beetSeedPacketItem", beetSeedItem);
		bellpepperSeedPacketItem = new ModItemPacket("bellpepperSeedPacketItem", bellpepperSeedItem);
		blackberrySeedPacketItem = new ModItemPacket("blackberrySeedPacketItem", blackberrySeedItem);
		blueberrySeedPacketItem = new ModItemPacket("blueberrySeedPacketItem", blueberrySeedItem);
		broccoliSeedPacketItem = new ModItemPacket("broccoliSeedPacketItem", broccoliSeedItem);
		brusselSproutSeedPacketItem = new ModItemPacket("brusselSproutSeedPacketItem", brusselSproutSeedItem);
		cabbageSeedPacketItem = new ModItemPacket("cabbageSeedPacketItem", cabbageSeedItem);
		cactusFruitSeedPacketItem = new ModItemPacket("cactusFruitSeedPacketItem", cactusFruitSeedItem);
		candleberrySeedPacketItem = new ModItemPacket("candleberrySeedPacketItem", candleberrySeedItem);
		cantaloupeSeedPacketItem = new ModItemPacket("cantaloupeSeedPacketItem", cantaloupeSeedItem);
		cauliflowerSeedPacketItem = new ModItemPacket("cauliflowerSeedPacketItem", cauliflowerSeedItem);
		celerySeedPacketItem = new ModItemPacket("celerySeedPacketItem", celerySeedItem);
		chilipepperSeedPacketItem = new ModItemPacket("chilipepperSeedPacketItem", chilipepperSeedItem);
		coffeeSeedPacketItem = new ModItemPacket("coffeeSeedPacketItem", coffeeBeanSeedItem);
		cornSeedPacketItem = new ModItemPacket("cornSeedPacketItem", cornSeedItem);
		cottonSeedPacketItem = new ModItemPacket("cottonSeedPacketItem", cottonSeedItem);
		cranberrySeedPacketItem = new ModItemPacket("cranberrySeedPacketItem", cranberrySeedItem);
		cucumberSeedPacketItem = new ModItemPacket("cucumberSeedPacketItem", cucumberSeedItem);
		eggplantSeedPacketItem = new ModItemPacket("eggplantSeedPacketItem", eggplantSeedItem);
		garlicSeedPacketItem = new ModItemPacket("garlicSeedPacketItem", garlicSeedItem);
		gingerSeedPacketItem = new ModItemPacket("gingerSeedPacketItem", gingerSeedItem);
		grapeSeedPacketItem = new ModItemPacket("grapeSeedPacketItem", grapeSeedItem);
		kiwiSeedPacketItem = new ModItemPacket("kiwiSeedPacketItem", kiwiSeedItem);
		leekSeedPacketItem = new ModItemPacket("leekSeedPacketItem", leekSeedItem);
		lettuceSeedPacketItem = new ModItemPacket("lettuceSeedPacketItem", lettuceSeedItem);
		mustardSeedPacketItem = new ModItemPacket("mustardSeedPacketItem", mustardSeedItem);
		oatsSeedPacketItem = new ModItemPacket("oatsSeedPacketItem", oatsSeedItem);
		okraSeedPacketItem = new ModItemPacket("okraSeedPacketItem", okraSeedItem);
		onionSeedPacketItem = new ModItemPacket("onionSeedPacketItem", onionSeedItem);
		parsnipSeedPacketItem = new ModItemPacket("parsnipSeedPacketItem", parsnipSeedItem);
		peanutSeedPacketItem = new ModItemPacket("peanutSeedPacketItem", peanutSeedItem);
		peasSeedPacketItem = new ModItemPacket("peasSeedPacketItem", peasSeedItem);
		pineappleSeedPacketItem = new ModItemPacket("pineappleSeedPacketItem", pineappleSeedItem);
		radishSeedPacketItem = new ModItemPacket("radishSeedPacketItem", radishSeedItem);
		raspberrySeedPacketItem = new ModItemPacket("raspberrySeedPacketItem", raspberrySeedItem);
		rhubarbSeedPacketItem = new ModItemPacket("rhubarbSeedPacketItem", rhubarbSeedItem);
		riceSeedPacketItem = new ModItemPacket("riceSeedPacketItem", riceSeedItem);
		rutabagaSeedPacketItem = new ModItemPacket("rutabagaSeedPacketItem", rutabagaSeedItem);
		ryeSeedPacketItem = new ModItemPacket("ryeSeedPacketItem", ryeSeedItem);
		scallionSeedPacketItem = new ModItemPacket("scallionSeedPacketItem", scallionSeedItem);
		seaweedSeedPacketItem = new ModItemPacket("seaweedSeedPacketItem", seaweedSeedItem);
		soybeanSeedPacketItem = new ModItemPacket("soybeanSeedPacketItem", soybeanSeedItem);
		spiceleafSeedPacketItem = new ModItemPacket("spiceleafSeedPacketItem", spiceleafSeedItem);
		strawberrySeedPacketItem = new ModItemPacket("strawberrySeedPacketItem", strawberrySeedItem);
		sweetPotatoSeedPacketItem = new ModItemPacket("sweetPotatoSeedPacketItem", sweetPotatoSeedItem);
		teaSeedPacketItem = new ModItemPacket("teaSeedPacketItem", teaLeafSeedItem);
		tomatoSeedPacketItem = new ModItemPacket("tomatoSeedPacketItem", tomatoSeedItem);
		turnipSeedPacketItem = new ModItemPacket("turnipSeedPacketItem", turnipSeedItem);
		whiteMushroomSeedPacketItem = new ModItemPacket("whiteMushroomSeedPacketItem", whiteMushroomSeedItem);
		winterSquashSeedPacketItem = new ModItemPacket("winterSquashSeedPacketItem", winterSquashSeedItem);
		zucchiniSeedPacketItem = new ModItemPacket("zucchiniSeedPacketItem", zucchiniSeedItem);

		ModItems.registerItem(artichokeSeedPacketItem);
		ModItems.registerItem(asparagusSeedPacketItem);
		ModItems.registerItem(bambooShootSeedPacketItem);
		ModItems.registerItem(barleySeedPacketItem);
		ModItems.registerItem(beanSeedPacketItem);
		ModItems.registerItem(beetSeedPacketItem);
		ModItems.registerItem(bellpepperSeedPacketItem);
		ModItems.registerItem(blackberrySeedPacketItem);
		ModItems.registerItem(blueberrySeedPacketItem);
		ModItems.registerItem(broccoliSeedPacketItem);
		ModItems.registerItem(brusselSproutSeedPacketItem);
		ModItems.registerItem(cabbageSeedPacketItem);
		ModItems.registerItem(cactusFruitSeedPacketItem);
		ModItems.registerItem(candleberrySeedPacketItem);
		ModItems.registerItem(cantaloupeSeedPacketItem);
		ModItems.registerItem(cauliflowerSeedPacketItem);
		ModItems.registerItem(celerySeedPacketItem);
		ModItems.registerItem(chilipepperSeedPacketItem);
		ModItems.registerItem(coffeeSeedPacketItem);
		ModItems.registerItem(cornSeedPacketItem);
		ModItems.registerItem(cottonSeedPacketItem);
		ModItems.registerItem(cranberrySeedPacketItem);
		ModItems.registerItem(cucumberSeedPacketItem);
		ModItems.registerItem(eggplantSeedPacketItem);
		ModItems.registerItem(garlicSeedPacketItem);
		ModItems.registerItem(gingerSeedPacketItem);
		ModItems.registerItem(grapeSeedPacketItem);
		ModItems.registerItem(kiwiSeedPacketItem);
		ModItems.registerItem(leekSeedPacketItem);
		ModItems.registerItem(lettuceSeedPacketItem);
		ModItems.registerItem(mustardSeedPacketItem);
		ModItems.registerItem(oatsSeedPacketItem);
		ModItems.registerItem(okraSeedPacketItem);
		ModItems.registerItem(onionSeedPacketItem);
		ModItems.registerItem(parsnipSeedPacketItem);
		ModItems.registerItem(peanutSeedPacketItem);
		ModItems.registerItem(peasSeedPacketItem);
		ModItems.registerItem(pineappleSeedPacketItem);
		ModItems.registerItem(radishSeedPacketItem);
		ModItems.registerItem(raspberrySeedPacketItem);
		ModItems.registerItem(rhubarbSeedPacketItem);
		ModItems.registerItem(riceSeedPacketItem);
		ModItems.registerItem(rutabagaSeedPacketItem);
		ModItems.registerItem(ryeSeedPacketItem);
		ModItems.registerItem(scallionSeedPacketItem);
		ModItems.registerItem(seaweedSeedPacketItem);
		ModItems.registerItem(soybeanSeedPacketItem);
		ModItems.registerItem(spiceleafSeedPacketItem);
		ModItems.registerItem(strawberrySeedPacketItem);
		ModItems.registerItem(sweetPotatoSeedPacketItem);
		ModItems.registerItem(teaSeedPacketItem);
		ModItems.registerItem(tomatoSeedPacketItem);
		ModItems.registerItem(turnipSeedPacketItem);
		ModItems.registerItem(whiteMushroomSeedPacketItem);
		ModItems.registerItem(winterSquashSeedPacketItem);
		ModItems.registerItem(zucchiniSeedPacketItem);

		cropItems = new Item[] { asparagusItem, barleyItem, beanItem, beetItem, broccoliItem, cauliflowerItem,
				celeryItem, cranberryItem, garlicItem, gingerItem, leekItem, lettuceItem, oatsItem, onionItem,
				parsnipItem, peanutItem, pineappleItem, radishItem, riceItem, rutabagaItem, ryeItem, scallionItem,
				soybeanItem, spiceleafItem, sweetPotatoItem, teaLeafItem, turnipItem, whiteMushroomItem, artichokeItem,
				bellpepperItem, blackberryItem, blueberryItem, brusselSproutItem, cabbageItem, cactusFruitItem,
				candleberryItem, cantaloupeItem, chilipepperItem, coffeeBeanItem, cornItem, cottonItem, cucumberItem,
				eggplantItem, grapeItem, kiwiItem, mustardSeedsItem, okraItem, peasItem, raspberryItem, rhubarbItem,
				seaweedItem, strawberryItem, tomatoItem, winterSquashItem, zucchiniItem, bambooShootItem };

		seeds = new Item[] { asparagusSeedItem, barleySeedItem, beanSeedItem, beetSeedItem, broccoliSeedItem,
				cauliflowerSeedItem, celerySeedItem, cranberrySeedItem, garlicSeedItem, gingerSeedItem, leekSeedItem,
				lettuceSeedItem, oatsSeedItem, onionSeedItem, parsnipSeedItem, peanutSeedItem, pineappleSeedItem,
				radishSeedItem, riceSeedItem, rutabagaSeedItem, ryeSeedItem, scallionSeedItem, soybeanSeedItem,
				spiceleafSeedItem, sweetPotatoSeedItem, teaLeafSeedItem, turnipSeedItem, whiteMushroomSeedItem,
				artichokeSeedItem, bellpepperSeedItem, blackberrySeedItem, blueberrySeedItem, brusselSproutSeedItem,
				cabbageSeedItem, cactusFruitSeedItem, candleberrySeedItem, cantaloupeSeedItem, chilipepperSeedItem,
				coffeeBeanSeedItem, cornSeedItem, cottonSeedItem, cucumberSeedItem, eggplantSeedItem, grapeSeedItem,
				kiwiSeedItem, mustardSeedItem, okraSeedItem, peasSeedItem, raspberrySeedItem, rhubarbSeedItem,
				seaweedSeedItem, strawberrySeedItem, tomatoSeedItem, winterSquashSeedItem, zucchiniSeedItem,
				bambooShootSeedItem };

		seedsBox = new Item[] { asparagusSeedBoxItem, barleySeedBoxItem, beanSeedBoxItem, beetSeedBoxItem,
				broccoliSeedBoxItem, cauliflowerSeedBoxItem, celerySeedBoxItem, cranberrySeedBoxItem, garlicSeedBoxItem,
				gingerSeedBoxItem, leekSeedBoxItem, lettuceSeedBoxItem, oatsSeedBoxItem, onionSeedBoxItem,
				parsnipSeedBoxItem, peanutSeedBoxItem, pineappleSeedBoxItem, radishSeedBoxItem, riceSeedBoxItem,
				rutabagaSeedBoxItem, ryeSeedBoxItem, scallionSeedBoxItem, soybeanSeedBoxItem, spiceleafSeedBoxItem,
				sweetPotatoSeedBoxItem, teaSeedBoxItem, turnipSeedBoxItem, whiteMushroomSeedBoxItem,
				artichokeSeedBoxItem, bellpepperSeedBoxItem, blackberrySeedBoxItem, blueberrySeedBoxItem,
				brusselSproutSeedBoxItem, cabbageSeedBoxItem, cactusFruitSeedBoxItem, candleberrySeedBoxItem,
				cantaloupeSeedBoxItem, chilipepperSeedBoxItem, coffeeSeedBoxItem, cornSeedBoxItem, cottonSeedBoxItem,
				cucumberSeedBoxItem, eggplantSeedBoxItem, grapeSeedBoxItem, kiwiSeedBoxItem, mustardSeedBoxItem,
				okraSeedBoxItem, peasSeedBoxItem, raspberrySeedBoxItem, rhubarbSeedBoxItem, seaweedSeedBoxItem,
				strawberrySeedBoxItem, tomatoSeedBoxItem, winterSquashSeedBoxItem, zucchiniSeedBoxItem,
				bambooShootSeedBoxItem };

		seedsPacket = new Item[] { asparagusSeedPacketItem, barleySeedPacketItem, beanSeedPacketItem,
				beetSeedPacketItem, broccoliSeedPacketItem, cauliflowerSeedPacketItem, celerySeedPacketItem,
				cranberrySeedPacketItem, garlicSeedPacketItem, gingerSeedPacketItem, leekSeedPacketItem,
				lettuceSeedPacketItem, oatsSeedPacketItem, onionSeedPacketItem, parsnipSeedPacketItem,
				peanutSeedPacketItem, pineappleSeedPacketItem, radishSeedPacketItem, riceSeedPacketItem,
				rutabagaSeedPacketItem, ryeSeedPacketItem, scallionSeedPacketItem, soybeanSeedPacketItem,
				spiceleafSeedPacketItem, sweetPotatoSeedPacketItem, teaSeedPacketItem, turnipSeedPacketItem,
				whiteMushroomSeedPacketItem, artichokeSeedPacketItem, bellpepperSeedPacketItem,
				blackberrySeedPacketItem, blueberrySeedPacketItem, brusselSproutSeedPacketItem, cabbageSeedPacketItem,
				cactusFruitSeedPacketItem, candleberrySeedPacketItem, cantaloupeSeedPacketItem,
				chilipepperSeedPacketItem, coffeeSeedPacketItem, cornSeedPacketItem, cottonSeedPacketItem,
				cucumberSeedPacketItem, eggplantSeedPacketItem, grapeSeedPacketItem, kiwiSeedPacketItem,
				mustardSeedPacketItem, okraSeedPacketItem, peasSeedPacketItem, raspberrySeedPacketItem,
				rhubarbSeedPacketItem, seaweedSeedPacketItem, strawberrySeedPacketItem, tomatoSeedPacketItem,
				winterSquashSeedPacketItem, zucchiniSeedPacketItem, bambooShootSeedPacketItem };

		temperateFruits = new Item[] { Items.apple, avocadoItem, cherryItem, chestnutItem, nutmegItem, pearItem,
				plumItem, walnutItem };

		warmFruits = new Item[] { almondItem, apricotItem, bananaItem, cashewItem, coconutItem, dateItem,
				dragonfruitItem, durianItem, figItem, grapefruitItem, lemonItem, limeItem, mangoItem, oliveItem,
				orangeItem, papayaItem, peachItem, pecanItem, peppercornItem, persimmonItem, pistachioItem,
				pomegranateItem, starfruitItem, vanillaBeanItem };

		logFruits = new Item[] { cinnamonItem, mapleSyrupItem, Items.paper, beeswaxItem, grubItem, honeycombItem,
				honeyItem, queenBeeItem, royalJellyItem, waxcombItem };
	}

	public static void registerItem(final Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
}
