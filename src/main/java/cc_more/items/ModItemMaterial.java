package cc_more.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItemMaterial {
	// Durability
	public static int durability = 50;

	public static int copperHarvestLevel = 1;
	public static int copperMaxUses = 157;
	public static int copperDurability = copperMaxUses / durability;
	public static float copperEfficiency = 2.0F;
	public static int copperEnchantability = 7;

	public static int tinHarvestLevel = 1;
	public static int tinMaxUses = 183;
	public static int tinDurability = tinMaxUses / durability;
	public static float tinEfficiency = 2.0F;
	public static int tinEnchantability = 7;

	public static int bronzeHarvestLevel = 1;
	public static int bronzeMaxUses = 210;
	public static int bronzeDurability = bronzeMaxUses / durability;
	public static float bronzeEfficiency = 3.0F;
	public static int bronzeEnchantability = 9;

	public static int bauxiteHarvestLevel = 1;
	public static int bauxiteMaxUses = 197;
	public static int bauxiteDurability = bauxiteMaxUses / durability;
	public static float bauxiteEfficiency = 3.0F;
	public static int bauxiteEnchantability = 11;

	public static int chromeHarvestLevel = 2;
	public static int chromeMaxUses = 225;
	public static int chromeDurability = chromeMaxUses / durability;
	public static float chromeEfficiency = 4.0F;
	public static int chromeEnchantability = 15;

	public static int silverHarvestLevel = 2;
	public static int silverMaxUses = 275;
	public static int silverDurability = silverMaxUses / durability;
	public static float silverEfficiency = 4.0F;
	public static int silverEnchantability = 15;

	public static int leadHarvestLevel = 2;
	public static int leadMaxUses = 350;
	public static int leadDurability = leadMaxUses / durability;
	public static float leadEfficiency = 5.0F;
	public static int leadEnchantability = 17;

	public static int rubyHarvestLevel = 3;
	public static int rubyMaxUses = 1171;
	public static int rubyDurability = rubyMaxUses / durability;
	public static float rubyEfficiency = 6.0F;
	public static int rubyEnchantability = 22;

	public static int sapphireHarvestLevel = 3;
	public static int sapphireMaxUses = 1405;
	public static int sapphireDurability = sapphireMaxUses / durability;
	public static float sapphireEfficiency = 6.0F;
	public static int sapphireEnchantability = 22;

	public static int stainlessHarvestLevel = 3;
	public static int stainlessMaxUses = 1639;
	public static int stainlessDurability = stainlessMaxUses / durability;
	public static float stainlessEfficiency = 7.0F;
	public static int stainlessEnchantability = 24;

	public static int fluoriteHarvestLevel = 3;
	public static int fluoriteMaxUses = 1873;
	public static int fluoriteDurability = fluoriteMaxUses / durability;
	public static float fluoriteEfficiency = 8.0F;
	public static int fluoriteEnchantability = 26;

	public static int titaniumHarvestLevel = 4;
	public static int titaniumMaxUses = 2185;
	public static int titaniumDurability = titaniumMaxUses / durability;
	public static float titaniumEfficiency = 9.0F;
	public static int titaniumEnchantability = 28;

	public static int jadeHarvestLevel = 4;
	public static int jadeMaxUses = 2342;
	public static int jadeDurability = jadeMaxUses / durability;
	public static float jadeEfficiency = 10.0F;
	public static int jadeEnchantability = 31;

	public static int uraniumHarvestLevel = 5;
	public static int uraniumMaxUses = 2576;
	public static int uraniumDurability = uraniumMaxUses / durability;
	public static float uraniumEfficiency = 11.0F;
	public static int uraniumEnchantability = 35;

	public static int amethystHarvestLevel = 5;
	public static int amethystMaxUses = 2732;
	public static int amethystDurability = amethystMaxUses / durability;
	public static float amethystEfficiency = 12.0F;
	public static int amethystEnchantability = 35;

	public static int platinumHarvestLevel = 6;
	public static int platinumMaxUses = 2966;
	public static int platinumDurability = platinumMaxUses / durability;
	public static float platinumEfficiency = 13.0F;
	public static int platinumEnchantability = 39;

	public static int meteoriteHarvestLevel = 6;
	public static int meteoriteMaxUses = 3122;
	public static int meteoriteDurability = meteoriteMaxUses / durability;
	public static float meteoriteEfficiency = 14.0F;
	public static int meteoriteEnchantability = 39;

	// Damage
	public static float[] copperDamage = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F, 6.0F };
	public static float[] tinDamage = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F, 6.0F };
	public static float[] bronzeDamage = { 2.0F, 3.0F, 4.0F, 5.0F, 6.0F, 7.0F };
	public static float[] bauxiteDamage = { 2.0F, 3.0F, 4.0F, 5.0F, 6.0F, 7.0F };
	public static float[] chromeDamage = { 2.0F, 3.0F, 4.0F, 5.0F, 6.0F, 7.0F };
	public static float[] silverDamage = { 2.0F, 3.0F, 4.0F, 5.0F, 6.0F, 7.0F };
	public static float[] leadDamage = { 3.0F, 4.0F, 5.0F, 6.0F, 7.0F, 8.0F };
	public static float[] rubyDamage = { 3.0F, 4.0F, 5.0F, 6.0F, 7.0F, 8.0F };
	public static float[] sapphireDamage = { 3.0F, 4.0F, 5.0F, 6.0F, 7.0F, 8.0F };
	public static float[] stainlessDamage = { 4.0F, 5.0F, 6.0F, 7.0F, 8.0F, 9.0F };
	public static float[] fluoriteDamage = { 4.0F, 5.0F, 6.0F, 7.0F, 8.0F, 9.0F };
	public static float[] titaniumDamage = { 5.0F, 6.0F, 7.0F, 8.0F, 9.0F, 10.0F };
	public static float[] jadeDamage = { 5.0F, 6.0F, 7.0F, 8.0F, 9.0F, 10.0F };
	public static float[] uraniumDamage = { 6.0F, 7.0F, 8.0F, 9.0F, 10.0F, 11.0F };
	public static float[] amethystDamage = { 6.0F, 7.0F, 8.0F, 9.0F, 10.0F, 11.0F };
	public static float[] platinumDamage = { 7.0F, 8.0F, 9.0F, 10.0F, 11.0F, 12.0F };
	public static float[] meteoriteDamage = { 7.0F, 8.0F, 9.0F, 10.0F, 11.0F, 12.0F };

	// Armor
	public static final ItemArmor.ArmorMaterial copper = EnumHelper.addArmorMaterial("copper", "copper",
			copperDurability, new int[] { 1, 2, 2, 1 }, copperEnchantability);
	public static final ItemArmor.ArmorMaterial tin = EnumHelper.addArmorMaterial("tin", "tin", tinDurability,
			new int[] { 1, 2, 2, 1 }, tinEnchantability);
	public static final ItemArmor.ArmorMaterial bronze = EnumHelper.addArmorMaterial("bronze", "bronze",
			bronzeDurability, new int[] { 1, 3, 3, 1 }, bronzeEnchantability);
	public static final ItemArmor.ArmorMaterial bauxite = EnumHelper.addArmorMaterial("bauxite", "bauxite",
			bauxiteDurability, new int[] { 2, 4, 3, 1 }, bauxiteEnchantability);
	public static final ItemArmor.ArmorMaterial chrome = EnumHelper.addArmorMaterial("chrome", "chrome",
			chromeDurability, new int[] { 2, 6, 4, 2 }, chromeEnchantability);
	public static final ItemArmor.ArmorMaterial silver = EnumHelper.addArmorMaterial("silver", "silver",
			silverDurability, new int[] { 2, 6, 4, 2 }, silverEnchantability);
	public static final ItemArmor.ArmorMaterial lead = EnumHelper.addArmorMaterial("lead", "lead", leadDurability,
			new int[] { 2, 7, 5, 2 }, leadEnchantability);
	public static final ItemArmor.ArmorMaterial ruby = EnumHelper.addArmorMaterial("ruby", "ruby", rubyDurability,
			new int[] { 3, 8, 6, 3 }, rubyEnchantability);
	public static final ItemArmor.ArmorMaterial sapphire = EnumHelper.addArmorMaterial("sapphire", "sapphire",
			sapphireDurability, new int[] { 3, 8, 6, 3 }, sapphireEnchantability);
	public static final ItemArmor.ArmorMaterial stainless = EnumHelper.addArmorMaterial("stainless", "stainless",
			stainlessDurability, new int[] { 3, 9, 7, 3 }, stainlessEnchantability);
	public static final ItemArmor.ArmorMaterial amethyst = EnumHelper.addArmorMaterial("fluorite", "fluorite",
			fluoriteDurability, new int[] { 4, 10, 7, 3 }, fluoriteEnchantability);
	public static final ItemArmor.ArmorMaterial titanium = EnumHelper.addArmorMaterial("titanium", "titanium",
			titaniumDurability, new int[] { 4, 11, 8, 3 }, titaniumEnchantability);
	public static final ItemArmor.ArmorMaterial jade = EnumHelper.addArmorMaterial("jade", "jade", jadeDurability,
			new int[] { 4, 12, 9, 3 }, jadeEnchantability);
	public static final ItemArmor.ArmorMaterial uranium = EnumHelper.addArmorMaterial("uranium", "uranium",
			uraniumDurability, new int[] { 5, 13, 10, 4 }, uraniumEnchantability);
	public static final ItemArmor.ArmorMaterial fluorite = EnumHelper.addArmorMaterial("amethyst", "amethyst",
			amethystDurability, new int[] { 5, 13, 10, 4 }, amethystEnchantability);
	public static final ItemArmor.ArmorMaterial platinum = EnumHelper.addArmorMaterial("platinum", "platinum",
			platinumDurability, new int[] { 6, 14, 11, 5 }, platinumEnchantability);
	public static final ItemArmor.ArmorMaterial meteorite = EnumHelper.addArmorMaterial("meteorite", "meteorite",
			meteoriteDurability, new int[] { 6, 14, 11, 5 }, meteoriteEnchantability);

	// Copper
	public static ToolMaterial enumToolMaterialCopper = EnumHelper.addToolMaterial("copper", copperHarvestLevel,
			copperMaxUses, copperEfficiency, copperDamage[0], copperEnchantability);

	public static ToolMaterial enumToolMaterialCopperStaff = EnumHelper.addToolMaterial("copperStaff", 0, copperMaxUses,
			0.0F, copperDamage[1], copperEnchantability);
	public static ToolMaterial enumToolMaterialCopperBattleaxe = EnumHelper.addToolMaterial("copperBattleaxe", 0,
			copperMaxUses, 0.0F, copperDamage[2], copperEnchantability);
	public static ToolMaterial enumToolMaterialCopperKhopesh = EnumHelper.addToolMaterial("copperKhopesh", 0,
			copperMaxUses, 0.0F, copperDamage[3], copperEnchantability);
	public static ToolMaterial enumToolMaterialCopperKatana = EnumHelper.addToolMaterial("copperKatana", 0,
			copperMaxUses, 0.0F, copperDamage[4], copperEnchantability);
	public static ToolMaterial enumToolMaterialCopperBigSword = EnumHelper.addToolMaterial("copperBigSword", 0,
			copperMaxUses, 0.0F, copperDamage[5], copperEnchantability);

	// Tin
	public static ToolMaterial enumToolMaterialTin = EnumHelper.addToolMaterial("tin", tinHarvestLevel, tinMaxUses,
			tinEfficiency, tinDamage[0], tinEnchantability);

	public static ToolMaterial enumToolMaterialTinStaff = EnumHelper.addToolMaterial("tinStaff", 0, tinMaxUses, 0.0F,
			tinDamage[1], tinEnchantability);
	public static ToolMaterial enumToolMaterialTinBattleaxe = EnumHelper.addToolMaterial("tinBattleaxe", 0, tinMaxUses,
			0.0F, tinDamage[2], tinEnchantability);
	public static ToolMaterial enumToolMaterialTinKhopesh = EnumHelper.addToolMaterial("tinKhopesh", 0, tinMaxUses,
			0.0F, tinDamage[3], tinEnchantability);
	public static ToolMaterial enumToolMaterialTinKatana = EnumHelper.addToolMaterial("tinKatana", 0, tinMaxUses, 0.0F,
			tinDamage[4], tinEnchantability);
	public static ToolMaterial enumToolMaterialTinBigSword = EnumHelper.addToolMaterial("tinBigSword", 0, tinMaxUses,
			0.0F, tinDamage[5], tinEnchantability);

	// Bronze
	public static ToolMaterial enumToolMaterialBronze = EnumHelper.addToolMaterial("bronze", bronzeHarvestLevel,
			bronzeMaxUses, bronzeEfficiency, bronzeDamage[0], bronzeEnchantability);

	public static ToolMaterial enumToolMaterialBronzeStaff = EnumHelper.addToolMaterial("bronzeStaff", 0, bronzeMaxUses,
			0.0F, bronzeDamage[1], bronzeEnchantability);
	public static ToolMaterial enumToolMaterialBronzeBattleaxe = EnumHelper.addToolMaterial("bronzeBattleaxe", 0,
			bronzeMaxUses, 0.0F, bronzeDamage[2], bronzeEnchantability);
	public static ToolMaterial enumToolMaterialBronzeKhopesh = EnumHelper.addToolMaterial("bronzeKhopesh", 0,
			bronzeMaxUses, 0.0F, bronzeDamage[3], bronzeEnchantability);
	public static ToolMaterial enumToolMaterialBronzeKatana = EnumHelper.addToolMaterial("bronzeKatana", 0,
			bronzeMaxUses, 0.0F, bronzeDamage[4], bronzeEnchantability);
	public static ToolMaterial enumToolMaterialBronzeBigSword = EnumHelper.addToolMaterial("bronzeBigSword", 0,
			bronzeMaxUses, 0.0F, bronzeDamage[5], bronzeEnchantability);

	// Bauxite
	public static ToolMaterial enumToolMaterialBauxite = EnumHelper.addToolMaterial("bauxite", bauxiteHarvestLevel,
			bauxiteMaxUses, bauxiteEfficiency, bauxiteDamage[0], bauxiteEnchantability);

	public static ToolMaterial enumToolMaterialBauxiteStaff = EnumHelper.addToolMaterial("bauxiteStaff", 0,
			bauxiteMaxUses, 0.0F, bauxiteDamage[1], bauxiteEnchantability);
	public static ToolMaterial enumToolMaterialBauxiteBattleaxe = EnumHelper.addToolMaterial("bauxiteBattleaxe", 0,
			bauxiteMaxUses, 0.0F, bauxiteDamage[2], bauxiteEnchantability);
	public static ToolMaterial enumToolMaterialBauxiteKhopesh = EnumHelper.addToolMaterial("bauxiteKhopesh", 0,
			bauxiteMaxUses, 0.0F, bauxiteDamage[3], bauxiteEnchantability);
	public static ToolMaterial enumToolMaterialBauxiteKatana = EnumHelper.addToolMaterial("bauxiteKatana", 0,
			bauxiteMaxUses, 0.0F, bauxiteDamage[4], bauxiteEnchantability);
	public static ToolMaterial enumToolMaterialBauxiteBigSword = EnumHelper.addToolMaterial("bauxiteBigSword", 0,
			bauxiteMaxUses, 0.0F, bauxiteDamage[5], bauxiteEnchantability);

	// Chrome
	public static ToolMaterial enumToolMaterialChrome = EnumHelper.addToolMaterial("chrome", chromeHarvestLevel,
			chromeMaxUses, chromeEfficiency, chromeDamage[0], chromeEnchantability);

	public static ToolMaterial enumToolMaterialChromeStaff = EnumHelper.addToolMaterial("chromeStaff", 0, chromeMaxUses,
			0.0F, chromeDamage[1], chromeEnchantability);
	public static ToolMaterial enumToolMaterialChromeBattleaxe = EnumHelper.addToolMaterial("chromeBattleaxe", 0,
			chromeMaxUses, 0.0F, chromeDamage[2], chromeEnchantability);
	public static ToolMaterial enumToolMaterialChromeKhopesh = EnumHelper.addToolMaterial("chromeKhopesh", 0,
			chromeMaxUses, 0.0F, chromeDamage[3], chromeEnchantability);
	public static ToolMaterial enumToolMaterialChromeKatana = EnumHelper.addToolMaterial("chromeKatana", 0,
			chromeMaxUses, 0.0F, chromeDamage[4], chromeEnchantability);
	public static ToolMaterial enumToolMaterialChromeBigSword = EnumHelper.addToolMaterial("chromeBigSword", 0,
			chromeMaxUses, 0.0F, chromeDamage[5], chromeEnchantability);

	// Silver
	public static ToolMaterial enumToolMaterialSilver = EnumHelper.addToolMaterial("silver", silverHarvestLevel,
			silverMaxUses, silverEfficiency, silverDamage[0], silverEnchantability);

	public static ToolMaterial enumToolMaterialSilverStaff = EnumHelper.addToolMaterial("silverStaff", 0, silverMaxUses,
			0.0F, silverDamage[1], silverEnchantability);
	public static ToolMaterial enumToolMaterialSilverBattleaxe = EnumHelper.addToolMaterial("silverBattleaxe", 0,
			silverMaxUses, 0.0F, silverDamage[2], silverEnchantability);
	public static ToolMaterial enumToolMaterialSilverKhopesh = EnumHelper.addToolMaterial("silverKhopesh", 0,
			silverMaxUses, 0.0F, silverDamage[3], silverEnchantability);
	public static ToolMaterial enumToolMaterialSilverKatana = EnumHelper.addToolMaterial("silverKatana", 0,
			silverMaxUses, 0.0F, silverDamage[4], silverEnchantability);
	public static ToolMaterial enumToolMaterialSilverBigSword = EnumHelper.addToolMaterial("silverBigSword", 0,
			silverMaxUses, 0.0F, silverDamage[5], silverEnchantability);

	// Lead
	public static ToolMaterial enumToolMaterialLead = EnumHelper.addToolMaterial("lead", leadHarvestLevel, leadMaxUses,
			leadEfficiency, leadDamage[0], leadEnchantability);

	public static ToolMaterial enumToolMaterialLeadStaff = EnumHelper.addToolMaterial("leadStaff", 0, leadMaxUses, 0.0F,
			leadDamage[1], leadEnchantability);
	public static ToolMaterial enumToolMaterialLeadBattleaxe = EnumHelper.addToolMaterial("leadBattleaxe", 0,
			leadMaxUses, 0.0F, leadDamage[2], leadEnchantability);
	public static ToolMaterial enumToolMaterialLeadKhopesh = EnumHelper.addToolMaterial("leadKhopesh", 0, leadMaxUses,
			0.0F, leadDamage[3], leadEnchantability);
	public static ToolMaterial enumToolMaterialLeadKatana = EnumHelper.addToolMaterial("leadKatana", 0, leadMaxUses,
			0.0F, leadDamage[4], leadEnchantability);
	public static ToolMaterial enumToolMaterialLeadBigSword = EnumHelper.addToolMaterial("leadBigSword", 0, leadMaxUses,
			0.0F, leadDamage[5], leadEnchantability);

	// Ruby
	public static ToolMaterial enumToolMaterialRuby = EnumHelper.addToolMaterial("ruby", rubyHarvestLevel, rubyMaxUses,
			rubyEfficiency, rubyDamage[0], rubyEnchantability);

	public static ToolMaterial enumToolMaterialRubyStaff = EnumHelper.addToolMaterial("rubyStaff", 0, rubyMaxUses, 0.0F,
			rubyDamage[1], rubyEnchantability);
	public static ToolMaterial enumToolMaterialRubyBattleaxe = EnumHelper.addToolMaterial("rubyBattleaxe", 0,
			rubyMaxUses, 0.0F, rubyDamage[2], rubyEnchantability);
	public static ToolMaterial enumToolMaterialRubyKhopesh = EnumHelper.addToolMaterial("rubyKhopesh", 0, rubyMaxUses,
			0.0F, rubyDamage[3], rubyEnchantability);
	public static ToolMaterial enumToolMaterialRubyKatana = EnumHelper.addToolMaterial("rubyKatana", 0, rubyMaxUses,
			0.0F, rubyDamage[4], rubyEnchantability);
	public static ToolMaterial enumToolMaterialRubyBigSword = EnumHelper.addToolMaterial("rubyBigSword", 0, rubyMaxUses,
			0.0F, rubyDamage[5], rubyEnchantability);

	// Sapphire
	public static ToolMaterial enumToolMaterialSapphire = EnumHelper.addToolMaterial("sapphire", sapphireHarvestLevel,
			sapphireMaxUses, sapphireEfficiency, sapphireDamage[0], sapphireEnchantability);

	public static ToolMaterial enumToolMaterialSapphireStaff = EnumHelper.addToolMaterial("sapphireStaff", 0,
			sapphireMaxUses, 0.0F, sapphireDamage[1], sapphireEnchantability);
	public static ToolMaterial enumToolMaterialSapphireBattleaxe = EnumHelper.addToolMaterial("sapphireBattleaxe", 0,
			sapphireMaxUses, 0.0F, sapphireDamage[2], sapphireEnchantability);
	public static ToolMaterial enumToolMaterialSapphireKhopesh = EnumHelper.addToolMaterial("sapphireKhopesh", 0,
			sapphireMaxUses, 0.0F, sapphireDamage[3], sapphireEnchantability);
	public static ToolMaterial enumToolMaterialSapphireKatana = EnumHelper.addToolMaterial("sapphireKatana", 0,
			sapphireMaxUses, 0.0F, sapphireDamage[4], sapphireEnchantability);
	public static ToolMaterial enumToolMaterialSapphireBigSword = EnumHelper.addToolMaterial("sapphireBigSword", 0,
			sapphireMaxUses, 0.0F, sapphireDamage[5], sapphireEnchantability);

	// Stainless
	public static ToolMaterial enumToolMaterialStainless = EnumHelper.addToolMaterial("stainless",
			stainlessHarvestLevel, stainlessMaxUses, stainlessEfficiency, stainlessDamage[0], stainlessEnchantability);

	public static ToolMaterial enumToolMaterialStainlessStaff = EnumHelper.addToolMaterial("stainlessStaff", 0,
			stainlessMaxUses, 0.0F, stainlessDamage[1], stainlessEnchantability);
	public static ToolMaterial enumToolMaterialStainlessBattleaxe = EnumHelper.addToolMaterial("stainlessBattleaxe", 0,
			stainlessMaxUses, 0.0F, stainlessDamage[2], stainlessEnchantability);
	public static ToolMaterial enumToolMaterialStainlessKhopesh = EnumHelper.addToolMaterial("stainlessKhopesh", 0,
			stainlessMaxUses, 0.0F, stainlessDamage[3], stainlessEnchantability);
	public static ToolMaterial enumToolMaterialStainlessKatana = EnumHelper.addToolMaterial("stainlessKatana", 0,
			stainlessMaxUses, 0.0F, stainlessDamage[4], stainlessEnchantability);
	public static ToolMaterial enumToolMaterialStainlessBigSword = EnumHelper.addToolMaterial("stainlessBigSword", 0,
			stainlessMaxUses, 0.0F, stainlessDamage[5], stainlessEnchantability);

	// Fluorite
	public static ToolMaterial enumToolMaterialFluorite = EnumHelper.addToolMaterial("fluorite", fluoriteHarvestLevel,
			fluoriteMaxUses, fluoriteEfficiency, fluoriteDamage[0], fluoriteEnchantability);

	public static ToolMaterial enumToolMaterialFluoriteStaff = EnumHelper.addToolMaterial("fluoriteStaff", 0,
			fluoriteMaxUses, 0.0F, fluoriteDamage[1], fluoriteEnchantability);
	public static ToolMaterial enumToolMaterialFluoriteBattleaxe = EnumHelper.addToolMaterial("fluoriteBattleaxe", 0,
			fluoriteMaxUses, 0.0F, fluoriteDamage[2], fluoriteEnchantability);
	public static ToolMaterial enumToolMaterialFluoriteKhopesh = EnumHelper.addToolMaterial("fluoriteKhopesh", 0,
			fluoriteMaxUses, 0.0F, fluoriteDamage[3], fluoriteEnchantability);
	public static ToolMaterial enumToolMaterialFluoriteKatana = EnumHelper.addToolMaterial("fluoriteKatana", 0,
			fluoriteMaxUses, 0.0F, fluoriteDamage[4], fluoriteEnchantability);
	public static ToolMaterial enumToolMaterialFluoriteBigSword = EnumHelper.addToolMaterial("fluoriteBigSword", 0,
			fluoriteMaxUses, 0.0F, fluoriteDamage[5], fluoriteEnchantability);

	// Titanium
	public static ToolMaterial enumToolMaterialTitanium = EnumHelper.addToolMaterial("titanium", titaniumHarvestLevel,
			titaniumMaxUses, titaniumEfficiency, titaniumDamage[0], titaniumEnchantability);

	public static ToolMaterial enumToolMaterialTitaniumStaff = EnumHelper.addToolMaterial("titaniumStaff", 0,
			titaniumMaxUses, 0.0F, titaniumDamage[1], titaniumEnchantability);
	public static ToolMaterial enumToolMaterialTitaniumBattleaxe = EnumHelper.addToolMaterial("titaniumBattleaxe", 0,
			titaniumMaxUses, 0.0F, titaniumDamage[2], titaniumEnchantability);
	public static ToolMaterial enumToolMaterialTitaniumKhopesh = EnumHelper.addToolMaterial("titaniumKhopesh", 0,
			titaniumMaxUses, 0.0F, titaniumDamage[3], titaniumEnchantability);
	public static ToolMaterial enumToolMaterialTitaniumKatana = EnumHelper.addToolMaterial("titaniumKatana", 0,
			titaniumMaxUses, 0.0F, titaniumDamage[4], titaniumEnchantability);
	public static ToolMaterial enumToolMaterialTitaniumBigSword = EnumHelper.addToolMaterial("titaniumBigSword", 0,
			titaniumMaxUses, 0.0F, titaniumDamage[5], titaniumEnchantability);

	// Jade
	public static ToolMaterial enumToolMaterialJade = EnumHelper.addToolMaterial("jade", jadeHarvestLevel, jadeMaxUses,
			jadeEfficiency, jadeDamage[0], jadeEnchantability);

	public static ToolMaterial enumToolMaterialJadeStaff = EnumHelper.addToolMaterial("jadeStaff", 0, jadeMaxUses, 0.0F,
			jadeDamage[1], jadeEnchantability);
	public static ToolMaterial enumToolMaterialJadeBattleaxe = EnumHelper.addToolMaterial("jadeBattleaxe", 0,
			jadeMaxUses, 0.0F, jadeDamage[2], jadeEnchantability);
	public static ToolMaterial enumToolMaterialJadeKhopesh = EnumHelper.addToolMaterial("jadeKhopesh", 0, jadeMaxUses,
			0.0F, jadeDamage[3], jadeEnchantability);
	public static ToolMaterial enumToolMaterialJadeKatana = EnumHelper.addToolMaterial("jadeKatana", 0, jadeMaxUses,
			0.0F, jadeDamage[4], jadeEnchantability);
	public static ToolMaterial enumToolMaterialJadeBigSword = EnumHelper.addToolMaterial("jadeBigSword", 0, jadeMaxUses,
			0.0F, jadeDamage[5], jadeEnchantability);

	// Uranium
	public static ToolMaterial enumToolMaterialUranium = EnumHelper.addToolMaterial("uranium", uraniumHarvestLevel,
			uraniumMaxUses, uraniumEfficiency, uraniumDamage[0], uraniumEnchantability);

	public static ToolMaterial enumToolMaterialUraniumStaff = EnumHelper.addToolMaterial("uraniumStaff", 0,
			uraniumMaxUses, 0.0F, uraniumDamage[1], uraniumEnchantability);
	public static ToolMaterial enumToolMaterialUraniumBattleaxe = EnumHelper.addToolMaterial("uraniumBattleaxe", 0,
			uraniumMaxUses, 0.0F, uraniumDamage[2], uraniumEnchantability);
	public static ToolMaterial enumToolMaterialUraniumKhopesh = EnumHelper.addToolMaterial("uraniumKhopesh", 0,
			uraniumMaxUses, 0.0F, uraniumDamage[3], uraniumEnchantability);
	public static ToolMaterial enumToolMaterialUraniumKatana = EnumHelper.addToolMaterial("uraniumKatana", 0,
			uraniumMaxUses, 0.0F, uraniumDamage[4], uraniumEnchantability);
	public static ToolMaterial enumToolMaterialUraniumBigSword = EnumHelper.addToolMaterial("uraniumBigSword", 0,
			uraniumMaxUses, 0.0F, uraniumDamage[5], uraniumEnchantability);

	// Amethyst
	public static ToolMaterial enumToolMaterialAmethyst = EnumHelper.addToolMaterial("amethyst", amethystHarvestLevel,
			amethystMaxUses, amethystEfficiency, amethystDamage[0], amethystEnchantability);

	public static ToolMaterial enumToolMaterialAmethystStaff = EnumHelper.addToolMaterial("amethystStaff", 0,
			amethystMaxUses, 0.0F, amethystDamage[1], amethystEnchantability);
	public static ToolMaterial enumToolMaterialAmethystBattleaxe = EnumHelper.addToolMaterial("amethystBattleaxe", 0,
			amethystMaxUses, 0.0F, amethystDamage[2], amethystEnchantability);
	public static ToolMaterial enumToolMaterialAmethystKhopesh = EnumHelper.addToolMaterial("amethystKhopesh", 0,
			amethystMaxUses, 0.0F, amethystDamage[3], amethystEnchantability);
	public static ToolMaterial enumToolMaterialAmethystKatana = EnumHelper.addToolMaterial("amethystKatana", 0,
			amethystMaxUses, 0.0F, amethystDamage[4], amethystEnchantability);
	public static ToolMaterial enumToolMaterialAmethystBigSword = EnumHelper.addToolMaterial("amethystBigSword", 0,
			amethystMaxUses, 0.0F, amethystDamage[5], amethystEnchantability);

	// Platinum
	public static ToolMaterial enumToolMaterialPlatinum = EnumHelper.addToolMaterial("platinum", platinumHarvestLevel,
			platinumMaxUses, platinumEfficiency, platinumDamage[0], platinumEnchantability);

	public static ToolMaterial enumToolMaterialPlatinumStaff = EnumHelper.addToolMaterial("platinumStaff", 0,
			platinumMaxUses, 0.0F, platinumDamage[1], platinumEnchantability);
	public static ToolMaterial enumToolMaterialPlatinumBattleaxe = EnumHelper.addToolMaterial("platinumBattleaxe", 0,
			platinumMaxUses, 0.0F, platinumDamage[2], platinumEnchantability);
	public static ToolMaterial enumToolMaterialPlatinumKhopesh = EnumHelper.addToolMaterial("platinumKhopesh", 0,
			platinumMaxUses, 0.0F, platinumDamage[3], platinumEnchantability);
	public static ToolMaterial enumToolMaterialPlatinumKatana = EnumHelper.addToolMaterial("platinumKatana", 0,
			platinumMaxUses, 0.0F, platinumDamage[4], platinumEnchantability);
	public static ToolMaterial enumToolMaterialPlatinumBigSword = EnumHelper.addToolMaterial("platinumBigSword", 0,
			platinumMaxUses, 0.0F, platinumDamage[5], platinumEnchantability);

	// Meteorite
	public static ToolMaterial enumToolMaterialMeteorite = EnumHelper.addToolMaterial("meteorite",
			meteoriteHarvestLevel, meteoriteMaxUses, meteoriteEfficiency, meteoriteDamage[0], meteoriteEnchantability);

	public static ToolMaterial enumToolMaterialMeteoriteStaff = EnumHelper.addToolMaterial("meteoriteStaff", 0,
			meteoriteMaxUses, 0.0F, meteoriteDamage[1], meteoriteEnchantability);
	public static ToolMaterial enumToolMaterialMeteoriteBattleaxe = EnumHelper.addToolMaterial("meteoriteBattleaxe", 0,
			meteoriteMaxUses, 0.0F, meteoriteDamage[2], meteoriteEnchantability);
	public static ToolMaterial enumToolMaterialMeteoriteKhopesh = EnumHelper.addToolMaterial("meteoriteKhopesh", 0,
			meteoriteMaxUses, 0.0F, meteoriteDamage[3], meteoriteEnchantability);
	public static ToolMaterial enumToolMaterialMeteoriteKatana = EnumHelper.addToolMaterial("meteoriteKatana", 0,
			meteoriteMaxUses, 0.0F, meteoriteDamage[4], meteoriteEnchantability);
	public static ToolMaterial enumToolMaterialMeteoriteBigSword = EnumHelper.addToolMaterial("meteoriteBigSword", 0,
			meteoriteMaxUses, 0.0F, meteoriteDamage[5], meteoriteEnchantability);
}
