package cc_cyan_weapons.items;

import cc_cyan_weapons.arrows.ModItemArrow;
import cc_cyan_weapons.bows.ItemBlizzardBow;
import cc_cyan_weapons.bows.ItemCyanBow;
import cc_cyan_weapons.bows.ItemDarkBow;
import cc_cyan_weapons.bows.ItemDarkNetherBow;
import cc_cyan_weapons.bows.ItemEnderFireBow;
import cc_cyan_weapons.bows.ItemEnderPortalBow;
import cc_cyan_weapons.bows.ItemEnderWindBow;
import cc_cyan_weapons.bows.ItemFireBow;
import cc_cyan_weapons.bows.ItemIceBow;
import cc_cyan_weapons.bows.ItemLightBow;
import cc_cyan_weapons.bows.ItemLightNetherBow;
import cc_cyan_weapons.bows.ItemMeteorBow;
import cc_cyan_weapons.bows.ItemMeteoricThunderstormBow;
import cc_cyan_weapons.bows.ItemPeacefulNatureBow;
import cc_cyan_weapons.bows.ItemSteamBow;
import cc_cyan_weapons.bows.ItemTimeBow;
import cc_cyan_weapons.bows.ItemTriEnderBow;
import cc_cyan_weapons.bows.ItemWildNatureBow;
import cc_cyan_weapons.bows.ItemWindBlastBow;
import cc_cyan_weapons.bows.ItemWindBow;
import cc_cyan_weapons.bows.ItemWindWhirlBow;
import cc_cyan_weapons.bows.ModBow;
import cc_cyan_weapons.swords.ItemBeastSword;
import cc_cyan_weapons.swords.ItemBlizzardSword;
import cc_cyan_weapons.swords.ItemCyanSword;
import cc_cyan_weapons.swords.ItemDarkNetherSword;
import cc_cyan_weapons.swords.ItemDarkSword;
import cc_cyan_weapons.swords.ItemEarthSword;
import cc_cyan_weapons.swords.ItemEnderFireSword;
import cc_cyan_weapons.swords.ItemEnderPortalSword;
import cc_cyan_weapons.swords.ItemEnderSword;
import cc_cyan_weapons.swords.ItemEnderThunderSword;
import cc_cyan_weapons.swords.ItemEnderWindSword;
import cc_cyan_weapons.swords.ItemFireSword;
import cc_cyan_weapons.swords.ItemIceSword;
import cc_cyan_weapons.swords.ItemLightNetherSword;
import cc_cyan_weapons.swords.ItemLightSword;
import cc_cyan_weapons.swords.ItemMeteorSword;
import cc_cyan_weapons.swords.ItemMeteoricThunderstormSword;
import cc_cyan_weapons.swords.ItemPeacefulNatureSword;
import cc_cyan_weapons.swords.ItemSteamSword;
import cc_cyan_weapons.swords.ItemThunderShockSword;
import cc_cyan_weapons.swords.ItemThunderSword;
import cc_cyan_weapons.swords.ItemThunderstormSword;
import cc_cyan_weapons.swords.ItemTimeSword;
import cc_cyan_weapons.swords.ItemTrienderSword;
import cc_cyan_weapons.swords.ItemWaterSword;
import cc_cyan_weapons.swords.ItemWildNatureSword;
import cc_cyan_weapons.swords.ItemWindBlastSword;
import cc_cyan_weapons.swords.ItemWindSword;
import cc_cyan_weapons.swords.ItemWindWhirlSword;
import cc_cyan_weapons.swords.ItemWolfSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	// Essence
	public static Item essenceBeast;
	public static Item essenceDark;
	public static Item essenceEarth;
	public static Item essenceEnder;
	public static Item essenceFire;
	public static Item essenceLight;
	public static Item essenceThunder;
	public static Item essenceWater;
	public static Item essenceWind;
	public static Item essenceMixed;

	// Swords - Light
	public static ItemSword beastSword;
	public static ItemSword darkSword;
	public static ItemSword earthSword;
	public static ItemSword enderSword;
	public static ItemSword fireSword;
	public static ItemSword lightSword;
	public static ItemSword thunderShockSword;
	public static ItemSword waterSword;
	public static ItemSword windSword;
	public static ItemSword wolfSword;

	// Swords - Medium
	public static ItemSword darkNetherSword;
	public static ItemSword enderPortalSword;
	public static ItemSword iceSword;
	public static ItemSword lightNetherSword;
	public static ItemSword meteorSword;
	public static ItemSword peacefulNatureSword;
	public static ItemSword steamSword;
	public static ItemSword thunderSword;
	public static ItemSword timeSword;
	public static ItemSword windBlastSword;

	// Swords - Strong
	public static ItemSword blizzardSword;
	public static ItemSword enderFireSword;
	public static ItemSword enderThunderSword;
	public static ItemSword enderWindSword;
	public static ItemSword meteoricThunderstormSword;
	public static ItemSword thunderstormSword;
	public static ItemSword wildNatureSword;
	public static ItemSword windWhirlSword;

	// Swords - Super
	public static ItemSword cyanSword;
	public static ItemSword triEnderSword;

	// Bows - Light
	public static ModBow darkBow;
	public static ModBow fireBow;
	public static ModBow lightBow;
	public static ModBow windBow;

	// Bows - Medium
	public static ModBow darkNetherBow;
	public static ModBow enderPortalBow;
	public static ModBow iceBow;
	public static ModBow lightNetherBow;
	public static ModBow meteorBow;
	public static ModBow peacefulNatureBow;
	public static ModBow steamBow;
	public static ModBow timeBow;
	public static ModBow windBlastBow;

	// Bows - Strong
	public static ModBow blizzardBow;
	public static ModBow enderFireBow;
	public static ModBow enderWindBow;
	public static ModBow meteoricThunderstormBow;
	public static ModBow wildNatureBow;
	public static ModBow windWhirlBow;

	// Bows - Super
	public static ModBow cyanBow;
	public static ModBow triEnderBow;

	// Arrows - Light
	public static Item darkArrow;
	public static Item fireArrow;
	public static Item lightArrow;
	public static Item windArrow;

	// Arrows - Medium
	public static Item darkNetherArrow;
	public static Item enderPortalArrow;
	public static Item iceArrow;
	public static Item lightNetherArrow;
	public static Item meteorArrow;
	public static Item peacefulNatureArrow;
	public static Item steamArrow;
	public static Item timeArrow;
	public static Item windBlastArrow;

	// Arrows - Strong
	public static Item blizzardArrow;
	public static Item enderFireArrow;
	public static Item enderWindArrow;
	public static Item meteoricThunderstormArrow;
	public static Item wildNatureArrow;
	public static Item windWhirlArrow;

	// Arrows - Super
	public static Item cyanArrow;
	public static Item triEnderArrow;

	public static void createItems() {
		// Essence
		essenceBeast = new ItemEssence(ModItemMaterial.essence, "essenceBeast");
		essenceDark = new ItemEssence(ModItemMaterial.essence, "essenceDark");
		essenceEarth = new ItemEssence(ModItemMaterial.essence, "essenceEarth");
		essenceEnder = new ItemEssence(ModItemMaterial.essence, "essenceEnder");
		essenceFire = new ItemEssence(ModItemMaterial.essence, "essenceFire");
		essenceLight = new ItemEssence(ModItemMaterial.essence, "essenceLight");
		essenceThunder = new ItemEssence(ModItemMaterial.essence, "essenceThunder");
		essenceWater = new ItemEssence(ModItemMaterial.essence, "essenceWater");
		essenceWind = new ItemEssence(ModItemMaterial.essence, "essenceWind");
		essenceMixed = new ItemEssence(ModItemMaterial.essence, "essenceMixed");

		registerItem(essenceBeast);
		registerItem(essenceDark);
		registerItem(essenceEarth);
		registerItem(essenceEnder);
		registerItem(essenceFire);
		registerItem(essenceLight);
		registerItem(essenceThunder);
		registerItem(essenceWater);
		registerItem(essenceWind);
		registerItem(essenceMixed);

		// Swords - Light
		beastSword = new ItemBeastSword(ModItemMaterial.dam9, "beastSword");
		darkSword = new ItemDarkSword(ModItemMaterial.dam8, "darkSword");
		earthSword = new ItemEarthSword(ModItemMaterial.dam7, "earthSword");
		enderSword = new ItemEnderSword(ModItemMaterial.dam8, "enderSword");
		fireSword = new ItemFireSword(ModItemMaterial.dam8, "fireSword");
		lightSword = new ItemLightSword(ModItemMaterial.dam7, "lightSword");
		thunderShockSword = new ItemThunderShockSword(ModItemMaterial.dam9, "thunderShockSword");
		waterSword = new ItemWaterSword(ModItemMaterial.dam7, "waterSword");
		windSword = new ItemWindSword(ModItemMaterial.dam7, "windSword");
		wolfSword = new ItemWolfSword(ModItemMaterial.dam10, "wolfSword");

		registerItem(beastSword);
		registerItem(darkSword);
		registerItem(earthSword);
		registerItem(enderSword);
		registerItem(fireSword);
		registerItem(lightSword);
		registerItem(thunderShockSword);
		registerItem(waterSword);
		registerItem(windSword);
		registerItem(wolfSword);

		// Swords - Medium
		darkNetherSword = new ItemDarkNetherSword(ModItemMaterial.dam10, "darkNetherSword");
		enderPortalSword = new ItemEnderPortalSword(ModItemMaterial.dam10, "enderPortalSword");
		iceSword = new ItemIceSword(ModItemMaterial.dam9, "iceSword");
		lightNetherSword = new ItemLightNetherSword(ModItemMaterial.dam9, "lightNetherSword");
		meteorSword = new ItemMeteorSword(ModItemMaterial.dam10, "meteorSword");
		peacefulNatureSword = new ItemPeacefulNatureSword(ModItemMaterial.dam8, "peacefulNatureSword");
		steamSword = new ItemSteamSword(ModItemMaterial.dam9, "steamSword");
		thunderSword = new ItemThunderSword(ModItemMaterial.dam10, "thunderSword");
		timeSword = new ItemTimeSword(ModItemMaterial.dam9, "timeSword");
		windBlastSword = new ItemWindBlastSword(ModItemMaterial.dam8, "windBlastSword");

		registerItem(darkNetherSword);
		registerItem(enderPortalSword);
		registerItem(iceSword);
		registerItem(lightNetherSword);
		registerItem(meteorSword);
		registerItem(peacefulNatureSword);
		registerItem(steamSword);
		registerItem(thunderSword);
		registerItem(timeSword);
		registerItem(windBlastSword);

		// Swords - Strong
		blizzardSword = new ItemBlizzardSword(ModItemMaterial.dam11, "blizzardSword");
		enderFireSword = new ItemEnderFireSword(ModItemMaterial.dam10, "enderFireSword");
		enderThunderSword = new ItemEnderThunderSword(ModItemMaterial.dam11, "enderThunderSword");
		enderWindSword = new ItemEnderWindSword(ModItemMaterial.dam10, "enderWindSword");
		meteoricThunderstormSword = new ItemMeteoricThunderstormSword(ModItemMaterial.dam11,
				"meteoricThunderstormSword");
		thunderstormSword = new ItemThunderstormSword(ModItemMaterial.dam11, "thunderstormSword");
		wildNatureSword = new ItemWildNatureSword(ModItemMaterial.dam9, "wildNatureSword");
		windWhirlSword = new ItemWindWhirlSword(ModItemMaterial.dam9, "windWhirlSword");

		registerItem(blizzardSword);
		registerItem(enderFireSword);
		registerItem(enderThunderSword);
		registerItem(enderWindSword);
		registerItem(meteoricThunderstormSword);
		registerItem(thunderstormSword);
		registerItem(wildNatureSword);
		registerItem(windWhirlSword);

		// Swords - Super
		cyanSword = new ItemCyanSword(ModItemMaterial.dam12, "cyanSword");
		triEnderSword = new ItemTrienderSword(ModItemMaterial.dam12, "triEnderSword");

		registerItem(cyanSword);
		registerItem(triEnderSword);

		// Bows - Light
		darkBow = new ItemDarkBow("darkBow", ModItemMaterial.dam8.getMaxUses(),
				ModItemMaterial.dam8.getDamageVsEntity() / 2);
		fireBow = new ItemFireBow("fireBow", ModItemMaterial.dam8.getMaxUses(),
				ModItemMaterial.dam8.getDamageVsEntity() / 2);
		lightBow = new ItemLightBow("lightBow", ModItemMaterial.dam7.getMaxUses(),
				ModItemMaterial.dam7.getDamageVsEntity() / 2);
		windBow = new ItemWindBow("windBow", ModItemMaterial.dam7.getMaxUses(),
				ModItemMaterial.dam7.getDamageVsEntity() / 2);

		registerItem(darkBow);
		registerItem(fireBow);
		registerItem(lightBow);
		registerItem(windBow);

		// Bows - Medium
		darkNetherBow = new ItemDarkNetherBow("darkNetherBow", ModItemMaterial.dam10.getMaxUses(),
				ModItemMaterial.dam10.getDamageVsEntity() / 2);
		enderPortalBow = new ItemEnderPortalBow("enderPortalBow", ModItemMaterial.dam10.getMaxUses(),
				ModItemMaterial.dam10.getDamageVsEntity() / 2);
		iceBow = new ItemIceBow("iceBow", ModItemMaterial.dam9.getMaxUses(),
				ModItemMaterial.dam9.getDamageVsEntity() / 2);
		lightNetherBow = new ItemLightNetherBow("lightNetherBow", ModItemMaterial.dam9.getMaxUses(),
				ModItemMaterial.dam9.getDamageVsEntity() / 2);
		meteorBow = new ItemMeteorBow("meteorBow", ModItemMaterial.dam10.getMaxUses(),
				ModItemMaterial.dam10.getDamageVsEntity() / 2);
		peacefulNatureBow = new ItemPeacefulNatureBow("peacefulNatureBow", ModItemMaterial.dam8.getMaxUses(),
				ModItemMaterial.dam8.getDamageVsEntity() / 2);
		steamBow = new ItemSteamBow("steamBow", ModItemMaterial.dam9.getMaxUses(),
				ModItemMaterial.dam9.getDamageVsEntity() / 2);
		timeBow = new ItemTimeBow("timeBow", ModItemMaterial.dam9.getMaxUses(),
				ModItemMaterial.dam9.getDamageVsEntity() / 2);
		windBlastBow = new ItemWindBlastBow("windBlastBow", ModItemMaterial.dam8.getMaxUses(),
				ModItemMaterial.dam8.getDamageVsEntity() / 2);

		registerItem(darkNetherBow);
		registerItem(enderPortalBow);
		registerItem(iceBow);
		registerItem(lightNetherBow);
		registerItem(meteorBow);
		registerItem(peacefulNatureBow);
		registerItem(steamBow);
		registerItem(timeBow);
		registerItem(windBlastBow);

		// Bows - Strong
		blizzardBow = new ItemBlizzardBow("blizzardBow", ModItemMaterial.dam11.getMaxUses(),
				ModItemMaterial.dam11.getDamageVsEntity() / 2);
		enderFireBow = new ItemEnderFireBow("enderFireBow", ModItemMaterial.dam10.getMaxUses(),
				ModItemMaterial.dam10.getDamageVsEntity() / 2);
		enderWindBow = new ItemEnderWindBow("enderWindBow", ModItemMaterial.dam10.getMaxUses(),
				ModItemMaterial.dam10.getDamageVsEntity() / 2);
		meteoricThunderstormBow = new ItemMeteoricThunderstormBow("meteoricThunderstormBow",
				ModItemMaterial.dam11.getMaxUses(), ModItemMaterial.dam11.getDamageVsEntity() / 2);
		wildNatureBow = new ItemWildNatureBow("wildNatureBow", ModItemMaterial.dam9.getMaxUses(),
				ModItemMaterial.dam9.getDamageVsEntity() / 2);
		windWhirlBow = new ItemWindWhirlBow("windWhirlBow", ModItemMaterial.dam9.getMaxUses(),
				ModItemMaterial.dam9.getDamageVsEntity() / 2);

		registerItem(blizzardBow);
		registerItem(enderFireBow);
		registerItem(enderWindBow);
		registerItem(meteoricThunderstormBow);
		registerItem(wildNatureBow);
		registerItem(windWhirlBow);

		// Bows - Super
		cyanBow = new ItemCyanBow("cyanBow", ModItemMaterial.dam12.getMaxUses(),
				ModItemMaterial.dam12.getDamageVsEntity() / 2);
		triEnderBow = new ItemTriEnderBow("triEnderBow", ModItemMaterial.dam12.getMaxUses(),
				ModItemMaterial.dam12.getDamageVsEntity() / 2);

		registerItem(cyanBow);
		registerItem(triEnderBow);

		// Arrows - Light
		darkArrow = new ModItemArrow("darkArrow");
		fireArrow = new ModItemArrow("fireArrow");
		lightArrow = new ModItemArrow("lightArrow");
		windArrow = new ModItemArrow("windArrow");

		registerItem(darkArrow);
		registerItem(fireArrow);
		registerItem(lightArrow);
		registerItem(windArrow);

		// Arrows - Medium
		darkNetherArrow = new ModItemArrow("darkNetherArrow");
		enderPortalArrow = new ModItemArrow("enderPortalArrow");
		iceArrow = new ModItemArrow("iceArrow");
		lightNetherArrow = new ModItemArrow("lightNetherArrow");
		meteorArrow = new ModItemArrow("meteorArrow");
		peacefulNatureArrow = new ModItemArrow("peacefulNatureArrow");
		steamArrow = new ModItemArrow("steamArrow");
		timeArrow = new ModItemArrow("timeArrow");
		windBlastArrow = new ModItemArrow("windBlastArrow");

		registerItem(darkNetherArrow);
		registerItem(enderPortalArrow);
		registerItem(iceArrow);
		registerItem(lightNetherArrow);
		registerItem(meteorArrow);
		registerItem(peacefulNatureArrow);
		registerItem(steamArrow);
		registerItem(timeArrow);
		registerItem(windBlastArrow);

		// Arrows - Strong
		blizzardArrow = new ModItemArrow("blizzardArrow");
		enderFireArrow = new ModItemArrow("enderFireArrow");
		enderWindArrow = new ModItemArrow("enderWindArrow");
		meteoricThunderstormArrow = new ModItemArrow("meteoricThunderstormArrow");
		wildNatureArrow = new ModItemArrow("wildNatureArrow");
		windWhirlArrow = new ModItemArrow("windWhirlArrow");

		registerItem(blizzardArrow);
		registerItem(enderFireArrow);
		registerItem(enderWindArrow);
		registerItem(meteoricThunderstormArrow);
		registerItem(wildNatureArrow);
		registerItem(windWhirlArrow);

		// Arrows - Super
		cyanArrow = new ModItemArrow("cyanArrow");
		triEnderArrow = new ModItemArrow("triEnderArrow");

		registerItem(cyanArrow);
		registerItem(triEnderArrow);
	}

	public static void registerItem(final Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
}
