package cc_dungeon_pack;

import java.util.ArrayList;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ChestItems {
	public ArrayList<Item> itemArmor;
	public ArrayList<Item> itemEnchant;
	public ArrayList<Item> itemFoods;
	public ArrayList<Item> itemMobs;
	public ArrayList<Item> itemOres;
	public ArrayList<Item> itemPotion;
	public ArrayList<Item> itemRecords;
	public ArrayList<Item> itemTools;

	public ArrayList<Item> itemHeavenArmor;
	public ArrayList<Item> itemHeavenOres;
	public ArrayList<Item> itemHeavenTools;

	public ChestItems() {
		// Armor
		this.itemArmor = new ArrayList<Item>();
		this.itemArmor.add(Items.chainmail_boots);
		this.itemArmor.add(Items.chainmail_chestplate);
		this.itemArmor.add(Items.chainmail_helmet);
		this.itemArmor.add(Items.chainmail_leggings);

		this.itemArmor.add(Items.diamond_boots);
		this.itemArmor.add(Items.diamond_chestplate);
		this.itemArmor.add(Items.diamond_helmet);
		this.itemArmor.add(Items.diamond_leggings);

		this.itemArmor.add(Items.golden_boots);
		this.itemArmor.add(Items.golden_chestplate);
		this.itemArmor.add(Items.golden_helmet);
		this.itemArmor.add(Items.golden_leggings);

		this.itemArmor.add(Items.iron_boots);
		this.itemArmor.add(Items.iron_chestplate);
		this.itemArmor.add(Items.iron_helmet);
		this.itemArmor.add(Items.iron_leggings);

		this.itemArmor.add(Items.leather_boots);
		this.itemArmor.add(Items.leather_chestplate);
		this.itemArmor.add(Items.leather_helmet);
		this.itemArmor.add(Items.leather_leggings);

		this.itemArmor.add(Items.saddle);
		this.itemArmor.add(Items.iron_horse_armor);
		this.itemArmor.add(Items.golden_horse_armor);
		this.itemArmor.add(Items.diamond_horse_armor);

		// Armor - Emerald
		this.itemArmor.add(cc_emerald.items.ModItems.coalHelmet);
		this.itemArmor.add(cc_emerald.items.ModItems.coalChestplate);
		this.itemArmor.add(cc_emerald.items.ModItems.coalLeggings);
		this.itemArmor.add(cc_emerald.items.ModItems.coalBoots);

		this.itemArmor.add(cc_emerald.items.ModItems.lapisHelmet);
		this.itemArmor.add(cc_emerald.items.ModItems.lapisChestplate);
		this.itemArmor.add(cc_emerald.items.ModItems.lapisLeggings);
		this.itemArmor.add(cc_emerald.items.ModItems.lapisBoots);

		this.itemArmor.add(cc_emerald.items.ModItems.redstoneHelmet);
		this.itemArmor.add(cc_emerald.items.ModItems.redstoneChestplate);
		this.itemArmor.add(cc_emerald.items.ModItems.redstoneLeggings);
		this.itemArmor.add(cc_emerald.items.ModItems.redstoneBoots);

		this.itemArmor.add(cc_emerald.items.ModItems.quartzHelmet);
		this.itemArmor.add(cc_emerald.items.ModItems.quartzChestplate);
		this.itemArmor.add(cc_emerald.items.ModItems.quartzLeggings);
		this.itemArmor.add(cc_emerald.items.ModItems.quartzBoots);

		this.itemArmor.add(cc_emerald.items.ModItems.glowstoneHelmet);
		this.itemArmor.add(cc_emerald.items.ModItems.glowstoneChestplate);
		this.itemArmor.add(cc_emerald.items.ModItems.glowstoneLeggings);
		this.itemArmor.add(cc_emerald.items.ModItems.glowstoneBoots);

		this.itemArmor.add(cc_emerald.items.ModItems.emeraldHelmet);
		this.itemArmor.add(cc_emerald.items.ModItems.emeraldChestplate);
		this.itemArmor.add(cc_emerald.items.ModItems.emeraldLeggings);
		this.itemArmor.add(cc_emerald.items.ModItems.emeraldBoots);

		// Armor - Harvest
		this.itemArmor.add(cc_harvest.items.ModItems.hardenedLeatherHelmetItem);
		this.itemArmor.add(cc_harvest.items.ModItems.hardenedLeatherChestplateItem);
		this.itemArmor.add(cc_harvest.items.ModItems.hardenedLeatherLeggingsItem);
		this.itemArmor.add(cc_harvest.items.ModItems.hardenedLeatherBootsItem);

		// Armor - Mob Drops
		this.itemArmor.add(cc_mob_drops.items.ModItems.creeperHelmet);
		this.itemArmor.add(cc_mob_drops.items.ModItems.creeperChestplate);
		this.itemArmor.add(cc_mob_drops.items.ModItems.creeperLeggings);
		this.itemArmor.add(cc_mob_drops.items.ModItems.creeperBoots);

		this.itemArmor.add(cc_mob_drops.items.ModItems.wolfHelmet);
		this.itemArmor.add(cc_mob_drops.items.ModItems.wolfChestplate);
		this.itemArmor.add(cc_mob_drops.items.ModItems.wolfLeggings);
		this.itemArmor.add(cc_mob_drops.items.ModItems.wolfBoots);

		this.itemArmor.add(cc_mob_drops.items.ModItems.enderHelmet);
		this.itemArmor.add(cc_mob_drops.items.ModItems.enderChestplate);
		this.itemArmor.add(cc_mob_drops.items.ModItems.enderLeggings);
		this.itemArmor.add(cc_mob_drops.items.ModItems.enderBoots);

		// Enchant
		this.itemEnchant = new ArrayList<Item>();
		this.itemEnchant.add(Items.book);
		this.itemEnchant.add(Items.paper);
		this.itemEnchant.add(Items.map);

		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.enchanted_book);
		this.itemEnchant.add(Items.clock);
		this.itemEnchant.add(Items.compass);
		// this.itemEnchant.add(Items.filled_map);

		// Food
		this.itemFoods = new ArrayList<Item>();
		this.itemFoods.add(Items.apple);
		this.itemFoods.add(Items.baked_potato);
		this.itemFoods.add(Items.beef);
		this.itemFoods.add(Items.bowl);
		this.itemFoods.add(Items.bread);
		this.itemFoods.add(Items.carrot);
		this.itemFoods.add(Items.chicken);
		this.itemFoods.add(Items.cooked_beef);
		this.itemFoods.add(Items.cooked_chicken);
		this.itemFoods.add(Items.cooked_fish);
		this.itemFoods.add(Items.cooked_mutton);
		this.itemFoods.add(Items.cooked_porkchop);
		this.itemFoods.add(Items.cooked_rabbit);
		this.itemFoods.add(Items.cookie);
		this.itemFoods.add(Items.egg);
		this.itemFoods.add(Items.fish);
		this.itemFoods.add(Items.fish);
		this.itemFoods.add(Items.golden_apple);
		this.itemFoods.add(Items.golden_apple);
		this.itemFoods.add(Items.golden_carrot);
		this.itemFoods.add(Items.melon);
		this.itemFoods.add(Items.melon_seeds);
		this.itemFoods.add(Items.mutton);
		this.itemFoods.add(Items.poisonous_potato);
		this.itemFoods.add(Items.porkchop);
		this.itemFoods.add(Items.potato);
		this.itemFoods.add(Items.pumpkin_pie);
		this.itemFoods.add(Items.pumpkin_seeds);
		this.itemFoods.add(Items.rabbit);
		this.itemFoods.add(Items.reeds);
		this.itemFoods.add(Items.sugar);
		this.itemFoods.add(Items.wheat);
		this.itemFoods.add(Items.wheat_seeds);

		this.itemFoods.add(Items.cake);
		this.itemFoods.add(Items.milk_bucket);
		this.itemFoods.add(Items.mushroom_stew);
		this.itemFoods.add(Items.rabbit_stew);

		// Food - Emerald
		this.itemFoods.add(cc_emerald.items.ModItems.coalApple);
		this.itemFoods.add(cc_emerald.items.ModItems.lapisApple);
		this.itemFoods.add(cc_emerald.items.ModItems.redstoneApple);
		this.itemFoods.add(cc_emerald.items.ModItems.quartzApple);
		this.itemFoods.add(cc_emerald.items.ModItems.glowstoneApple);
		this.itemFoods.add(cc_emerald.items.ModItems.emeraldApple);
		this.itemFoods.add(cc_emerald.items.ModItems.emeraldApple);

		// Food - Harvest - Item 1
		this.itemFoods.add(cc_harvest.items.ModItems.toastItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cheeseItem);
		this.itemFoods.add(cc_harvest.items.ModItems.iceCreamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.grilledCheeseItem);
		this.itemFoods.add(cc_harvest.items.ModItems.appleSauceItem);
		this.itemFoods.add(cc_harvest.items.ModItems.applePieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.caramelAppleItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pumpkinBreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.roastedPumpkinSeedsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.carrotCakeItem);
		this.itemFoods.add(cc_harvest.items.ModItems.glazedCarrotsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.butteredPotatoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.loadedBakedPotatoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mashedPotatoesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.potatoSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.friesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.grilledMushroomItem);
		this.itemFoods.add(cc_harvest.items.ModItems.stuffedMushroomItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chickenPotPieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.breadedPorkchopItem);
		this.itemFoods.add(cc_harvest.items.ModItems.hotdogItem);
		this.itemFoods.add(cc_harvest.items.ModItems.bakedHamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.hamburgerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cheeseburgerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.baconCheeseburgerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.potRoastItem);
		this.itemFoods.add(cc_harvest.items.ModItems.fishSticksItem);
		this.itemFoods.add(cc_harvest.items.ModItems.fishAndChipsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.friedEggItem);
		this.itemFoods.add(cc_harvest.items.ModItems.scrambledEggItem);
		this.itemFoods.add(cc_harvest.items.ModItems.boiledEggItem);
		this.itemFoods.add(cc_harvest.items.ModItems.eggSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.caramelItem);
		this.itemFoods.add(cc_harvest.items.ModItems.taffyItem);

		// Food - Harvest - Item 2
		this.itemFoods.add(cc_harvest.items.ModItems.zombieJerkyItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chocolateBarItem);
		this.itemFoods.add(cc_harvest.items.ModItems.hotChocolateItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chocolateIceCreamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.stockItem);
		this.itemFoods.add(cc_harvest.items.ModItems.fruitSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.spagettiItem);
		this.itemFoods.add(cc_harvest.items.ModItems.spagettiAndMeatballsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chickenParmasanItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pizzaItem);
		this.itemFoods.add(cc_harvest.items.ModItems.springSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.porkLettuceWrapItem);
		this.itemFoods.add(cc_harvest.items.ModItems.fishLettuceWrapItem);
		this.itemFoods.add(cc_harvest.items.ModItems.bltItem);
		this.itemFoods.add(cc_harvest.items.ModItems.deluxeCheeseburgerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.delightedMealItem);
		this.itemFoods.add(cc_harvest.items.ModItems.potatoCakesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.hashItem);
		this.itemFoods.add(cc_harvest.items.ModItems.braisedOnionsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.heartyBreakfastItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cornOnTheCobItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cornbreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.tortillaItem);
		this.itemFoods.add(cc_harvest.items.ModItems.nachoesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.tacoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.fishTacoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.creamedCornItem);
		this.itemFoods.add(cc_harvest.items.ModItems.strawberryPieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.strawberrySaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chocolateStrawberryItem);
		this.itemFoods.add(cc_harvest.items.ModItems.peanutButterItem);
		this.itemFoods.add(cc_harvest.items.ModItems.trailMixItem);
		this.itemFoods.add(cc_harvest.items.ModItems.PBAndJItem);
		this.itemFoods.add(cc_harvest.items.ModItems.peanutButterCookiesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.grapeSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.raisinCookiesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.picklesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cucumberSaladItem);

		// Food - Harvest - Item 3
		this.itemFoods.add(cc_harvest.items.ModItems.vegetarianLettuceWrapItem);
		this.itemFoods.add(cc_harvest.items.ModItems.marinatedCucumbersItem);
		this.itemFoods.add(cc_harvest.items.ModItems.friedRiceItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mushroomRisottoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.curryItem);
		this.itemFoods.add(cc_harvest.items.ModItems.rainbowCurryItem);
		this.itemFoods.add(cc_harvest.items.ModItems.refriedBeansItem);
		this.itemFoods.add(cc_harvest.items.ModItems.bakedBeansItem);
		this.itemFoods.add(cc_harvest.items.ModItems.beansAndRiceItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chiliItem);
		this.itemFoods.add(cc_harvest.items.ModItems.beanBurritoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.stuffedPepperItem);
		this.itemFoods.add(cc_harvest.items.ModItems.veggieStirfryItem);
		this.itemFoods.add(cc_harvest.items.ModItems.grilledSkewersItem);
		this.itemFoods.add(cc_harvest.items.ModItems.supremePizzaItem);
		this.itemFoods.add(cc_harvest.items.ModItems.omeletItem);
		this.itemFoods.add(cc_harvest.items.ModItems.hotWingsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chiliPoppersItem);
		this.itemFoods.add(cc_harvest.items.ModItems.extremeChiliItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chiliChocolateItem);
		this.itemFoods.add(cc_harvest.items.ModItems.lemonaideItem);
		this.itemFoods.add(cc_harvest.items.ModItems.lemonBarItem);
		this.itemFoods.add(cc_harvest.items.ModItems.fishDinnerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.lemonMeringueItem);
		this.itemFoods.add(cc_harvest.items.ModItems.candiedLemonItem);
		this.itemFoods.add(cc_harvest.items.ModItems.lemonChickenItem);
		this.itemFoods.add(cc_harvest.items.ModItems.blueberryPieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.blueberryMuffinItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pancakesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.blueberryPancakesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cherryPieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chocolateCherryItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cheesecakeItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cherryCheesecakeItem);
		this.itemFoods.add(cc_harvest.items.ModItems.stuffedEggplantItem);
		this.itemFoods.add(cc_harvest.items.ModItems.eggplantParmItem);
		this.itemFoods.add(cc_harvest.items.ModItems.raspberryIcedTeaItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chaiTeaItem);
		this.itemFoods.add(cc_harvest.items.ModItems.espressoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.coffeeConLecheItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mochaIceCreamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pickledBeetsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.beetSaladItem);

		// Food - Harvest - Item 4
		this.itemFoods.add(cc_harvest.items.ModItems.bakedBeetsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.broccoliMacItem);
		this.itemFoods.add(cc_harvest.items.ModItems.broccoliNDipItem);
		this.itemFoods.add(cc_harvest.items.ModItems.sweetPotatoPieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.candiedSweetPotatoesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mashedSweetPotatoesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.steamedPeasItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pineappleUpsidedownCakeItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pineappleHamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.roastedRootVeggieMedleyItem);
		this.itemFoods.add(cc_harvest.items.ModItems.bakedTurnipsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.gingerBreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.gingerSnapsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.candiedGingerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.softPretzelAndMustardItem);
		this.itemFoods.add(cc_harvest.items.ModItems.spicyMustardPorkItem);
		this.itemFoods.add(cc_harvest.items.ModItems.spicyGreensItem);
		this.itemFoods.add(cc_harvest.items.ModItems.garlicBreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.garlicMashedPotatoesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.garlicChickenItem);
		this.itemFoods.add(cc_harvest.items.ModItems.summerRadishSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.summerSquashWithRadishItem);
		this.itemFoods.add(cc_harvest.items.ModItems.celeryAndPeanutButterItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chickenCeleryCasseroleItem);
		this.itemFoods.add(cc_harvest.items.ModItems.peasAndCeleryItem);
		this.itemFoods.add(cc_harvest.items.ModItems.zucchiniBreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.zucchiniFriesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.zestyZucchiniItem);
		this.itemFoods.add(cc_harvest.items.ModItems.zucchiniBakeItem);
		this.itemFoods.add(cc_harvest.items.ModItems.asparagusQuicheItem);
		this.itemFoods.add(cc_harvest.items.ModItems.walnutRaisinBreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.candiedWalnutsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.brownieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.guacamoleItem);
		this.itemFoods.add(cc_harvest.items.ModItems.avocadoBurritoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.poachedPearItem);
		this.itemFoods.add(cc_harvest.items.ModItems.fruitCrumbleItem);

		// Food - Harvest - Item 5
		this.itemFoods.add(cc_harvest.items.ModItems.bananaSplitItem);
		this.itemFoods.add(cc_harvest.items.ModItems.bananaNutBreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.coconutMilkItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chickenCurryItem);
		this.itemFoods.add(cc_harvest.items.ModItems.coconutShrimpItem);
		this.itemFoods.add(cc_harvest.items.ModItems.orangeChickenItem);
		this.itemFoods.add(cc_harvest.items.ModItems.peachCobblerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.keylimePieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cinnamonRollItem);
		this.itemFoods.add(cc_harvest.items.ModItems.frenchToastItem);
		this.itemFoods.add(cc_harvest.items.ModItems.marshmellowsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.donutItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chocolateDonutItem);
		this.itemFoods.add(cc_harvest.items.ModItems.powderedDonutItem);
		this.itemFoods.add(cc_harvest.items.ModItems.jellyDonutItem);
		this.itemFoods.add(cc_harvest.items.ModItems.frostedDonutItem);
		this.itemFoods.add(cc_harvest.items.ModItems.wafflesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.softPretzelItem);
		this.itemFoods.add(cc_harvest.items.ModItems.jellybeansItem);
		this.itemFoods.add(cc_harvest.items.ModItems.biscuitItem);
		this.itemFoods.add(cc_harvest.items.ModItems.creamCookieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.jaffaItem);
		this.itemFoods.add(cc_harvest.items.ModItems.friedChickenItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chocolateSprinkleCakeItem);
		this.itemFoods.add(cc_harvest.items.ModItems.redVelvetCakeItem);
		this.itemFoods.add(cc_harvest.items.ModItems.footlongItem);

		// Food - Harvest - Item 6
		this.itemFoods.add(cc_harvest.items.ModItems.blackberryCobblerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chocolateMilkItem);
		this.itemFoods.add(cc_harvest.items.ModItems.raspberryPieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cinnamonSugarDonutItem);
		this.itemFoods.add(cc_harvest.items.ModItems.saltedSunflowerSeedsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.sunflowerWheatRollsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.sunflowerBroccoliSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cranberrySauceItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cranberryBarItem);
		this.itemFoods.add(cc_harvest.items.ModItems.peppermintItem);
		this.itemFoods.add(cc_harvest.items.ModItems.baklavaItem);
		this.itemFoods.add(cc_harvest.items.ModItems.gummyBearsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.baconMushroomBurgerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.fruitPunchItem);
		this.itemFoods.add(cc_harvest.items.ModItems.meatyStewItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mixedSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pinacoladaItem);
		this.itemFoods.add(cc_harvest.items.ModItems.shepardsPieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.eggNogItem);
		this.itemFoods.add(cc_harvest.items.ModItems.custardItem);
		this.itemFoods.add(cc_harvest.items.ModItems.sushiItem);

		// Food - Harvest - Item 7
		this.itemFoods.add(cc_harvest.items.ModItems.caramelIceCreamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mintChocolateChipIceCreamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.strawberryIceCreamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.vanillaIceCreamItem);
		this.itemFoods.add(cc_harvest.items.ModItems.gingerChickenItem);
		this.itemFoods.add(cc_harvest.items.ModItems.spiceBunItem);
		this.itemFoods.add(cc_harvest.items.ModItems.gingeredRhubarbTartItem);
		this.itemFoods.add(cc_harvest.items.ModItems.honeyLemonLambItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pumpkinOatSconesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.beefJerkyItem);
		this.itemFoods.add(cc_harvest.items.ModItems.ovenRoastedCauliflowerItem);
		this.itemFoods.add(cc_harvest.items.ModItems.herbButterParsnipsItem);
		this.itemFoods.add(cc_harvest.items.ModItems.scallionBakedPotatoItem);
		this.itemFoods.add(cc_harvest.items.ModItems.soyMilkItem);
		this.itemFoods.add(cc_harvest.items.ModItems.firmTofuItem);
		this.itemFoods.add(cc_harvest.items.ModItems.silkenTofuItem);

		// Food - Harvest - Other
		this.itemFoods.add(cc_harvest.items.ModItems.bambooSteamedRiceItem);
		this.itemFoods.add(cc_harvest.items.ModItems.roastedChestnutItem);
		this.itemFoods.add(cc_harvest.items.ModItems.sweetPotatoSouffleItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cashewChickenItem);
		this.itemFoods.add(cc_harvest.items.ModItems.apricotGlazedPorkItem);
		this.itemFoods.add(cc_harvest.items.ModItems.figBarItem);
		this.itemFoods.add(cc_harvest.items.ModItems.citrusSaladItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pecanPieItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pralinesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.pistachioBakedSalmonItem);
		this.itemFoods.add(cc_harvest.items.ModItems.baconWrappedDatesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.dateNutBreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mapleSyrupPancakesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mapleSyrupWafflesItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mapleSausageItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mapleOatmealItem);
		this.itemFoods.add(cc_harvest.items.ModItems.peachesAndCreamOatmealItem);
		this.itemFoods.add(cc_harvest.items.ModItems.cinnamonAppleOatmealItem);
		this.itemFoods.add(cc_harvest.items.ModItems.mapleCandiedBaconItem);
		this.itemFoods.add(cc_harvest.items.ModItems.potatoAndCheesePirogiItem);
		this.itemFoods.add(cc_harvest.items.ModItems.zeppoleItem);
		this.itemFoods.add(cc_harvest.items.ModItems.sausageInBreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.chocolateCaramelFudgeItem);
		this.itemFoods.add(cc_harvest.items.ModItems.lavenderShortbreadItem);
		this.itemFoods.add(cc_harvest.items.ModItems.beefWellingtonItem);
		this.itemFoods.add(cc_harvest.items.ModItems.epicBaconItem);
		this.itemFoods.add(cc_harvest.items.ModItems.manjuuItem);

		// Food - Mob Drops
		this.itemFoods.add(cc_mob_drops.items.ModItems.bacon);
		this.itemFoods.add(cc_mob_drops.items.ModItems.calamari);
		this.itemFoods.add(cc_mob_drops.items.ModItems.chickenLegs);
		this.itemFoods.add(cc_mob_drops.items.ModItems.cookedCarrot);
		this.itemFoods.add(cc_mob_drops.items.ModItems.cookedChickenLeg);
		this.itemFoods.add(cc_mob_drops.items.ModItems.cookedLambchop);
		this.itemFoods.add(cc_mob_drops.items.ModItems.friedEggs);
		this.itemFoods.add(cc_mob_drops.items.ModItems.ham);
		this.itemFoods.add(cc_mob_drops.items.ModItems.pigmanMeat);
		this.itemFoods.add(cc_mob_drops.items.ModItems.rawLambchop);
		this.itemFoods.add(cc_mob_drops.items.ModItems.rawRibs);
		this.itemFoods.add(cc_mob_drops.items.ModItems.squid);
		this.itemFoods.add(cc_mob_drops.items.ModItems.zombieBrain);

		// Mobs
		this.itemMobs = new ArrayList<Item>();
		this.itemMobs.add(Items.blaze_rod);
		this.itemMobs.add(Items.blaze_powder);
		this.itemMobs.add(Items.bone);
		this.itemMobs.add(Items.ender_eye);
		this.itemMobs.add(Items.ender_pearl);
		this.itemMobs.add(Items.feather);
		this.itemMobs.add(Items.ghast_tear);
		this.itemMobs.add(Items.gunpowder);
		this.itemMobs.add(Items.leather);
		this.itemMobs.add(Items.magma_cream);
		this.itemMobs.add(Items.nether_star);
		this.itemMobs.add(Items.rabbit_hide);
		this.itemMobs.add(Items.rotten_flesh);
		this.itemMobs.add(Items.slime_ball);
		this.itemMobs.add(Items.spider_eye);
		this.itemMobs.add(Items.string);
		this.itemMobs.add(Items.skull);

		// Mobs - Cyan Swords
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceBeast);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceDark);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceEarth);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceEnder);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceFire);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceLight);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceThunder);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceWater);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceWind);
		this.itemMobs.add(cc_cyan_weapons.items.ModItems.essenceMixed);

		// Mobs - Mobs Drops
		this.itemMobs.add(cc_mob_drops.items.ModItems.batEars);
		this.itemMobs.add(cc_mob_drops.items.ModItems.batEyes);
		this.itemMobs.add(cc_mob_drops.items.ModItems.batFur);
		this.itemMobs.add(cc_mob_drops.items.ModItems.batWings);
		this.itemMobs.add(cc_mob_drops.items.ModItems.cowHorn);
		this.itemMobs.add(cc_mob_drops.items.ModItems.creeperEye);
		this.itemMobs.add(cc_mob_drops.items.ModItems.creeperSkin);
		this.itemMobs.add(cc_mob_drops.items.ModItems.enderJewel);
		this.itemMobs.add(cc_mob_drops.items.ModItems.enderSkin);
		this.itemMobs.add(cc_mob_drops.items.ModItems.enderTear);
		this.itemMobs.add(cc_mob_drops.items.ModItems.goo);
		this.itemMobs.add(cc_mob_drops.items.ModItems.horseHoof);
		this.itemMobs.add(cc_mob_drops.items.ModItems.horseShoe);
		this.itemMobs.add(cc_mob_drops.items.ModItems.horseSkin);
		this.itemMobs.add(cc_mob_drops.items.ModItems.magmaGoo);
		this.itemMobs.add(cc_mob_drops.items.ModItems.squidEye);
		this.itemMobs.add(cc_mob_drops.items.ModItems.squidTentacle);
		this.itemMobs.add(cc_mob_drops.items.ModItems.wolfSkin);

		// Ores
		this.itemOres = new ArrayList<Item>();
		this.itemOres.add(Items.coal);
		this.itemOres.add(Items.dye);
		this.itemOres.add(Items.iron_ingot);
		this.itemOres.add(Items.gold_ingot);
		this.itemOres.add(Items.redstone);
		this.itemOres.add(Items.diamond);
		this.itemOres.add(Items.quartz);
		this.itemOres.add(Items.glowstone_dust);
		this.itemOres.add(Items.emerald);
		this.itemOres.add(Items.prismarine_shard);
		this.itemOres.add(Items.prismarine_crystals);

		// Ores - Emerald
		this.itemOres.add(cc_emerald.items.ModItems.coalSeeds);
		this.itemOres.add(cc_emerald.items.ModItems.lapisSeeds);
		this.itemOres.add(cc_emerald.items.ModItems.ironSeeds);
		this.itemOres.add(cc_emerald.items.ModItems.goldSeeds);
		this.itemOres.add(cc_emerald.items.ModItems.redstoneSeeds);
		this.itemOres.add(cc_emerald.items.ModItems.diamondSeeds);
		this.itemOres.add(cc_emerald.items.ModItems.quartzSeeds);
		this.itemOres.add(cc_emerald.items.ModItems.glowstoneSeeds);
		this.itemOres.add(cc_emerald.items.ModItems.emeraldSeeds);

		// Potion
		this.itemPotion = new ArrayList<Item>();
		this.itemPotion.add(Items.blaze_powder);
		this.itemPotion.add(Items.blaze_rod);
		this.itemPotion.add(Items.brewing_stand);
		this.itemPotion.add(Items.experience_bottle);
		this.itemPotion.add(Items.fermented_spider_eye);
		this.itemPotion.add(Items.fish);
		this.itemPotion.add(Items.ghast_tear);
		this.itemPotion.add(Items.glass_bottle);
		this.itemPotion.add(Items.glowstone_dust);
		this.itemPotion.add(Items.gold_nugget);
		this.itemPotion.add(Items.gunpowder);
		this.itemPotion.add(Items.magma_cream);
		this.itemPotion.add(Items.melon);
		this.itemPotion.add(Items.nether_wart);
		this.itemPotion.add(Items.redstone);
		this.itemPotion.add(Items.slime_ball);
		this.itemPotion.add(Items.speckled_melon);
		this.itemPotion.add(Items.spider_eye);
		this.itemPotion.add(Items.sugar);
		this.itemPotion.add(Items.rabbit_foot);

		this.itemPotion.add(Items.cauldron);
		// 8193 - 8206 / 8225 - 8238 / 8257 - 8270
		// 16385 - 16398 / 16417 - 16430 / 16449 - 16462
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);
		this.itemPotion.add(Items.potionitem);

		// Potion - Emerald
		this.itemPotion.add(cc_emerald.items.ModItems.emeraldApple);

		// Records
		this.itemRecords = new ArrayList<Item>();
		this.itemRecords.add(Items.record_11);
		this.itemRecords.add(Items.record_13);
		this.itemRecords.add(Items.record_blocks);
		this.itemRecords.add(Items.record_cat);
		this.itemRecords.add(Items.record_chirp);
		this.itemRecords.add(Items.record_far);
		this.itemRecords.add(Items.record_mall);
		this.itemRecords.add(Items.record_mellohi);
		this.itemRecords.add(Items.record_stal);
		this.itemRecords.add(Items.record_strad);
		this.itemRecords.add(Items.record_wait);
		this.itemRecords.add(Items.record_ward);

		// Tools
		this.itemTools = new ArrayList<Item>();
		this.itemTools.add(Items.arrow);
		this.itemTools.add(Items.bucket);

		this.itemTools.add(Items.diamond_axe);
		this.itemTools.add(Items.diamond_hoe);
		this.itemTools.add(Items.diamond_pickaxe);
		this.itemTools.add(Items.diamond_shovel);
		this.itemTools.add(Items.diamond_sword);
		this.itemTools.add(Items.golden_axe);
		this.itemTools.add(Items.golden_hoe);
		this.itemTools.add(Items.golden_pickaxe);
		this.itemTools.add(Items.golden_shovel);
		this.itemTools.add(Items.golden_sword);
		this.itemTools.add(Items.iron_axe);
		this.itemTools.add(Items.iron_hoe);
		this.itemTools.add(Items.iron_pickaxe);
		this.itemTools.add(Items.iron_shovel);
		this.itemTools.add(Items.iron_sword);
		this.itemTools.add(Items.stone_axe);
		this.itemTools.add(Items.stone_hoe);
		this.itemTools.add(Items.stone_pickaxe);
		this.itemTools.add(Items.stone_shovel);
		this.itemTools.add(Items.stone_sword);
		this.itemTools.add(Items.wooden_axe);
		this.itemTools.add(Items.wooden_hoe);
		this.itemTools.add(Items.wooden_pickaxe);
		this.itemTools.add(Items.wooden_shovel);
		this.itemTools.add(Items.wooden_sword);
		this.itemTools.add(Items.minecart);
		this.itemTools.add(Items.boat);
		this.itemTools.add(Items.lava_bucket);
		this.itemTools.add(Items.water_bucket);
		this.itemTools.add(Items.bow);
		this.itemTools.add(Items.fishing_rod);
		this.itemTools.add(Items.shears);

		// Tools - Cyan Weapons - Swords
		this.itemTools.add(cc_cyan_weapons.items.ModItems.beastSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.darkSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.earthSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.fireSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.lightSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.thunderShockSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.waterSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.wolfSword);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.darkNetherSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderPortalSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.iceSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.lightNetherSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.meteorSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.peacefulNatureSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.steamSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.thunderSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.timeSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windBlastSword);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.blizzardSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderFireSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderThunderSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderWindSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.meteoricThunderstormSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.thunderstormSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.wildNatureSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windWhirlSword);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.cyanSword);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.triEnderSword);

		// Tools - Cyan Weapons - Bows
		this.itemTools.add(cc_cyan_weapons.items.ModItems.darkBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.fireBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.lightBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windBow);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.darkNetherBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderPortalBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.iceBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.lightNetherBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.meteorBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.peacefulNatureBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.steamBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.timeBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windBlastBow);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.blizzardBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderFireBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderWindBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.meteoricThunderstormBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.wildNatureBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windWhirlBow);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.cyanBow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.triEnderBow);

		// Tools - Cyan Weapons - Arrows
		this.itemTools.add(cc_cyan_weapons.items.ModItems.darkArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.fireArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.lightArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windArrow);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.darkNetherArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderPortalArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.iceArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.lightNetherArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.meteorArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.peacefulNatureArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.steamArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.timeArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windBlastArrow);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.blizzardArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderFireArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.enderWindArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.meteoricThunderstormArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.wildNatureArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.windWhirlArrow);

		this.itemTools.add(cc_cyan_weapons.items.ModItems.cyanArrow);
		this.itemTools.add(cc_cyan_weapons.items.ModItems.triEnderArrow);

		// Tools - Emerald
		this.itemTools.add(cc_emerald.items.ModItems.woodStaff);
		this.itemTools.add(cc_emerald.items.ModItems.woodBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.woodKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.woodKatana);
		this.itemTools.add(cc_emerald.items.ModItems.woodBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.stoneStaff);
		this.itemTools.add(cc_emerald.items.ModItems.stoneBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.stoneKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.stoneKatana);
		this.itemTools.add(cc_emerald.items.ModItems.stoneBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.coalHoe);
		this.itemTools.add(cc_emerald.items.ModItems.coalAxe);
		this.itemTools.add(cc_emerald.items.ModItems.coalPickaxe);
		this.itemTools.add(cc_emerald.items.ModItems.coalShovel);
		this.itemTools.add(cc_emerald.items.ModItems.coalSword);

		this.itemTools.add(cc_emerald.items.ModItems.coalStaff);
		this.itemTools.add(cc_emerald.items.ModItems.coalBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.coalKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.coalKatana);
		this.itemTools.add(cc_emerald.items.ModItems.coalBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.lapisHoe);
		this.itemTools.add(cc_emerald.items.ModItems.lapisAxe);
		this.itemTools.add(cc_emerald.items.ModItems.lapisPickaxe);
		this.itemTools.add(cc_emerald.items.ModItems.lapisShovel);
		this.itemTools.add(cc_emerald.items.ModItems.lapisSword);

		this.itemTools.add(cc_emerald.items.ModItems.lapisStaff);
		this.itemTools.add(cc_emerald.items.ModItems.lapisBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.lapisKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.lapisKatana);
		this.itemTools.add(cc_emerald.items.ModItems.lapisBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.ironStaff);
		this.itemTools.add(cc_emerald.items.ModItems.ironBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.ironKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.ironKatana);
		this.itemTools.add(cc_emerald.items.ModItems.ironBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.goldStaff);
		this.itemTools.add(cc_emerald.items.ModItems.goldBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.goldKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.goldKatana);
		this.itemTools.add(cc_emerald.items.ModItems.goldBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.redstoneHoe);
		this.itemTools.add(cc_emerald.items.ModItems.redstoneAxe);
		this.itemTools.add(cc_emerald.items.ModItems.redstonePickaxe);
		this.itemTools.add(cc_emerald.items.ModItems.redstoneShovel);
		this.itemTools.add(cc_emerald.items.ModItems.redstoneSword);

		this.itemTools.add(cc_emerald.items.ModItems.redstoneStaff);
		this.itemTools.add(cc_emerald.items.ModItems.redstoneBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.redstoneKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.redstoneKatana);
		this.itemTools.add(cc_emerald.items.ModItems.redstoneBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.diamondStaff);
		this.itemTools.add(cc_emerald.items.ModItems.diamondBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.diamondKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.diamondKatana);
		this.itemTools.add(cc_emerald.items.ModItems.diamondBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.quartzHoe);
		this.itemTools.add(cc_emerald.items.ModItems.quartzAxe);
		this.itemTools.add(cc_emerald.items.ModItems.quartzPickaxe);
		this.itemTools.add(cc_emerald.items.ModItems.quartzShovel);
		this.itemTools.add(cc_emerald.items.ModItems.quartzSword);

		this.itemTools.add(cc_emerald.items.ModItems.quartzStaff);
		this.itemTools.add(cc_emerald.items.ModItems.quartzBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.quartzKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.quartzKatana);
		this.itemTools.add(cc_emerald.items.ModItems.quartzBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.glowstoneHoe);
		this.itemTools.add(cc_emerald.items.ModItems.glowstoneAxe);
		this.itemTools.add(cc_emerald.items.ModItems.glowstonePickaxe);
		this.itemTools.add(cc_emerald.items.ModItems.glowstoneShovel);
		this.itemTools.add(cc_emerald.items.ModItems.glowstoneSword);

		this.itemTools.add(cc_emerald.items.ModItems.glowstoneStaff);
		this.itemTools.add(cc_emerald.items.ModItems.glowstoneBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.glowstoneKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.glowstoneKatana);
		this.itemTools.add(cc_emerald.items.ModItems.glowstoneBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.emeraldHoe);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldAxe);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldPickaxe);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldShovel);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldSword);

		this.itemTools.add(cc_emerald.items.ModItems.emeraldStaff);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldBattleaxe);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldKhopesh);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldKatana);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldBigSword);

		this.itemTools.add(cc_emerald.items.ModItems.coalBow);
		this.itemTools.add(cc_emerald.items.ModItems.stoneBow);
		this.itemTools.add(cc_emerald.items.ModItems.lapisBow);
		this.itemTools.add(cc_emerald.items.ModItems.ironBow);
		this.itemTools.add(cc_emerald.items.ModItems.goldBow);
		this.itemTools.add(cc_emerald.items.ModItems.redstoneBow);
		this.itemTools.add(cc_emerald.items.ModItems.diamondBow);
		this.itemTools.add(cc_emerald.items.ModItems.quartzBow);
		this.itemTools.add(cc_emerald.items.ModItems.glowstoneBow);
		this.itemTools.add(cc_emerald.items.ModItems.emeraldBow);

		// Tools - Mob Drops
		this.itemTools.add(cc_mob_drops.items.ModItems.gooSword);
		this.itemTools.add(cc_mob_drops.items.ModItems.magmaGooSword);
		this.itemTools.add(cc_mob_drops.items.ModItems.spiderLeg);
		this.itemTools.add(cc_mob_drops.items.ModItems.zombieArm);

		// Armor - Heaven M-Ore
		this.itemHeavenArmor = new ArrayList<Item>();
		this.itemHeavenArmor.add(cc_more.items.ModItems.copperHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.copperChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.copperLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.copperBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.tinHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.tinChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.tinLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.tinBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.bronzeHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.bronzeChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.bronzeLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.bronzeBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.bauxiteHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.bauxiteChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.bauxiteLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.bauxiteBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.chromeHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.chromeChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.chromeLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.chromeBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.silverHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.silverChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.silverLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.silverBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.leadHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.leadChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.leadLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.leadBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.rubyHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.rubyChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.rubyLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.rubyBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.sapphireHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.sapphireChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.sapphireLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.sapphireBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.stainlessHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.stainlessChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.stainlessLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.stainlessBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.fluoriteHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.fluoriteChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.fluoriteLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.fluoriteBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.titaniumHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.titaniumChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.titaniumLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.titaniumBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.jadeHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.jadeChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.jadeLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.jadeBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.uraniumHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.uraniumChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.uraniumLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.uraniumBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.amethystHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.amethystChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.amethystLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.amethystBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.platinumHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.platinumChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.platinumLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.platinumBoots);

		this.itemHeavenArmor.add(cc_more.items.ModItems.meteoriteHelmet);
		this.itemHeavenArmor.add(cc_more.items.ModItems.meteoriteChestplate);
		this.itemHeavenArmor.add(cc_more.items.ModItems.meteoriteLeggings);
		this.itemHeavenArmor.add(cc_more.items.ModItems.meteoriteBoots);

		// Ores - Heaven M-Ore
		this.itemHeavenOres = new ArrayList<Item>();
		this.itemHeavenOres.add(cc_more.items.ModItems.copperIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.tinIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.bronzeIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.bauxiteIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.chromeIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.silverIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.leadIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.rubyGem);
		this.itemHeavenOres.add(cc_more.items.ModItems.sapphireGem);
		this.itemHeavenOres.add(cc_more.items.ModItems.stainlessIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.fluoriteIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.titaniumIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.jadeGem);
		this.itemHeavenOres.add(cc_more.items.ModItems.uraniumIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.amethystIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.platinumIngot);
		this.itemHeavenOres.add(cc_more.items.ModItems.meteorite);

		// Tools - Heaven M-Ore
		this.itemHeavenTools = new ArrayList<Item>();
		this.itemHeavenTools.add(cc_more.items.ModItems.copperHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.copperAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.copperPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.copperShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.copperSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.copperStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.copperBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.copperKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.copperKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.copperBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.tinHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.tinStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzePickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxitePickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.chromeHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromeAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromePickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromeShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromeSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.chromeStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromeBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromeKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromeKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromeBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.silverHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.silverStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.leadHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.leadStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.rubyHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubyAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubyPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubyShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubySword);

		this.itemHeavenTools.add(cc_more.items.ModItems.rubyStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubyBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubyKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubyKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubyBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphirePickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoritePickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.jadeHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadeAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadePickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadeShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadeSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.jadeStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadeBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadeKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadeKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadeBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.amethystHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.amethystStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.platinumHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumPickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.platinumStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteHoe);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteAxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoritePickaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteShovel);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteStaff);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteBattleaxe);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteKhopesh);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteKatana);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteBigSword);

		this.itemHeavenTools.add(cc_more.items.ModItems.copperBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.tinBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.bronzeBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.bauxiteBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.chromeBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.silverBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.leadBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.rubyBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.sapphireBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.stainlessBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.fluoriteBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.titaniumBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.jadeBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.uraniumBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.amethystBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.platinumBow);
		this.itemHeavenTools.add(cc_more.items.ModItems.meteoriteBow);
	}
}
