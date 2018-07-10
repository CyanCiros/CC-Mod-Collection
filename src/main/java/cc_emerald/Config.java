package cc_emerald;

import net.minecraftforge.common.config.Configuration;

public class Config {
	// Seeds
	private static boolean enableCoalSeedsFromGrassDefault = true;
	private static boolean enableLapisSeedsFromGrassDefault = true;
	private static boolean enableIronSeedsFromGrassDefault = true;
	private static boolean enableGoldSeedsFromGrassDefault = true;
	private static boolean enableRedstoneSeedsFromGrassDefault = true;
	private static boolean enableDiamondSeedsFromGrassDefault = true;
	private static boolean enableQuartzSeedsFromGrassDefault = true;
	private static boolean enableGlowstoneSeedsFromGrassDefault = true;
	private static boolean enableEmeraldSeedsFromGrassDefault = true;

	public static boolean enableCoalSeedsFromGrass;
	public static boolean enableLapisSeedsFromGrass;
	public static boolean enableIronSeedsFromGrass;
	public static boolean enableGoldSeedsFromGrass;
	public static boolean enableRedstoneSeedsFromGrass;
	public static boolean enableDiamondSeedsFromGrass;
	public static boolean enableQuartzSeedsFromGrass;
	public static boolean enableGlowstoneSeedsFromGrass;
	public static boolean enableEmeraldSeedsFromGrass;

	// Seeds Recipes
	private static boolean enableCoalSeedsRecipesDefault = true;
	private static boolean enableLapisSeedsRecipesDefault = true;
	private static boolean enableIronSeedsRecipesDefault = true;
	private static boolean enableGoldSeedsRecipesDefault = true;
	private static boolean enableRedstoneSeedsRecipesDefault = true;
	private static boolean enableDiamondSeedsRecipesDefault = true;
	private static boolean enableQuartzSeedsRecipesDefault = true;
	private static boolean enableGlowstoneSeedsRecipesDefault = true;
	private static boolean enableEmeraldSeedsRecipesDefault = true;

	public static boolean enableCoalSeedsRecipes;
	public static boolean enableLapisSeedsRecipes;
	public static boolean enableIronSeedsRecipes;
	public static boolean enableGoldSeedsRecipes;
	public static boolean enableRedstoneSeedsRecipes;
	public static boolean enableDiamondSeedsRecipes;
	public static boolean enableQuartzSeedsRecipes;
	public static boolean enableGlowstoneSeedsRecipes;
	public static boolean enableEmeraldSeedsRecipes;

	// Armor
	private static boolean enableCoalArmorPotionDefault = true;
	private static boolean enableLapisArmorPotionDefault = true;
	private static boolean enableRedstoneArmorPotionDefault = true;
	private static boolean enableQuartzArmorPotionDefault = true;
	private static boolean enableGlowstoneArmorPotionDefault = true;
	private static boolean enableEmeraldArmorPotionDefault = true;

	public static boolean enableCoalArmorPotion;
	public static boolean enableLapisArmorPotion;
	public static boolean enableRedstoneArmorPotion;
	public static boolean enableQuartzArmorPotion;
	public static boolean enableGlowstoneArmorPotion;
	public static boolean enableEmeraldArmorPotion;

	public static void main(final Configuration config) {
		// Seeds
		enableCoalSeedsFromGrass = config.get(
				"seeds",
				"Enable Coal Seeds from Grass (Default: "
						+ enableCoalSeedsFromGrassDefault + ")",
				enableCoalSeedsFromGrassDefault).getBoolean(
				enableCoalSeedsFromGrassDefault);
		enableLapisSeedsFromGrass = config.get(
				"seeds",
				"Enable Lapis Seeds from Grass (Default: "
						+ enableLapisSeedsFromGrassDefault + ")",
				enableLapisSeedsFromGrassDefault).getBoolean(
				enableLapisSeedsFromGrassDefault);
		enableIronSeedsFromGrass = config.get(
				"seeds",
				"Enable Iron Seeds from Grass (Default: "
						+ enableIronSeedsFromGrassDefault + ")",
				enableIronSeedsFromGrassDefault).getBoolean(
				enableIronSeedsFromGrassDefault);
		enableGoldSeedsFromGrass = config.get(
				"seeds",
				"Enable Gold Seeds from Grass (Default: "
						+ enableGoldSeedsFromGrassDefault + ")",
				enableGoldSeedsFromGrassDefault).getBoolean(
				enableGoldSeedsFromGrassDefault);
		enableRedstoneSeedsFromGrass = config.get(
				"seeds",
				"Enable Redstone Seeds from Grass (Default: "
						+ enableRedstoneSeedsFromGrassDefault + ")",
				enableRedstoneSeedsFromGrassDefault).getBoolean(
				enableRedstoneSeedsFromGrassDefault);
		enableDiamondSeedsFromGrass = config.get(
				"seeds",
				"Enable Diamond Seeds from Grass (Default: "
						+ enableDiamondSeedsFromGrassDefault + ")",
				enableDiamondSeedsFromGrassDefault).getBoolean(
				enableDiamondSeedsFromGrassDefault);
		enableQuartzSeedsFromGrass = config.get(
				"seeds",
				"Enable Quartz Seeds from Grass (Default: "
						+ enableQuartzSeedsFromGrassDefault + ")",
				enableQuartzSeedsFromGrassDefault).getBoolean(
				enableQuartzSeedsFromGrassDefault);
		enableGlowstoneSeedsFromGrass = config.get(
				"seeds",
				"Enable Glowstone Seeds from Grass (Default: "
						+ enableGlowstoneSeedsFromGrassDefault + ")",
				enableGlowstoneSeedsFromGrassDefault).getBoolean(
				enableGlowstoneSeedsFromGrassDefault);
		enableEmeraldSeedsFromGrass = config.get(
				"seeds",
				"Enable Emerald Seeds from Grass (Default: "
						+ enableEmeraldSeedsFromGrassDefault + ")",
				enableEmeraldSeedsFromGrassDefault).getBoolean(
				enableEmeraldSeedsFromGrassDefault);

		// Seeds Recipes
		enableCoalSeedsRecipes = config.get(
				"seeds",
				"Enable Coal Seeds from Grass (Default: "
						+ enableCoalSeedsRecipesDefault + ")",
				enableCoalSeedsRecipesDefault).getBoolean(
				enableCoalSeedsRecipesDefault);
		enableLapisSeedsRecipes = config.get(
				"seeds",
				"Enable Lapis Seeds from Grass (Default: "
						+ enableLapisSeedsRecipesDefault + ")",
				enableLapisSeedsRecipesDefault).getBoolean(
				enableLapisSeedsRecipesDefault);
		enableIronSeedsRecipes = config.get(
				"seeds",
				"Enable Iron Seeds from Grass (Default: "
						+ enableIronSeedsRecipesDefault + ")",
				enableIronSeedsRecipesDefault).getBoolean(
				enableIronSeedsRecipesDefault);
		enableGoldSeedsRecipes = config.get(
				"seeds",
				"Enable Gold Seeds from Grass (Default: "
						+ enableGoldSeedsRecipesDefault + ")",
				enableGoldSeedsRecipesDefault).getBoolean(
				enableGoldSeedsRecipesDefault);
		enableRedstoneSeedsRecipes = config.get(
				"seeds",
				"Enable Redstone Seeds from Grass (Default: "
						+ enableRedstoneSeedsRecipesDefault + ")",
				enableRedstoneSeedsRecipesDefault).getBoolean(
				enableRedstoneSeedsRecipesDefault);
		enableDiamondSeedsRecipes = config.get(
				"seeds",
				"Enable Diamond Seeds from Grass (Default: "
						+ enableDiamondSeedsRecipesDefault + ")",
				enableDiamondSeedsRecipesDefault).getBoolean(
				enableDiamondSeedsRecipesDefault);
		enableQuartzSeedsRecipes = config.get(
				"seeds",
				"Enable Quartz Seeds from Grass (Default: "
						+ enableQuartzSeedsRecipesDefault + ")",
				enableQuartzSeedsRecipesDefault).getBoolean(
				enableQuartzSeedsRecipesDefault);
		enableGlowstoneSeedsRecipes = config.get(
				"seeds",
				"Enable Glowstone Seeds from Grass (Default: "
						+ enableGlowstoneSeedsRecipesDefault + ")",
				enableGlowstoneSeedsRecipesDefault).getBoolean(
				enableGlowstoneSeedsRecipesDefault);
		enableEmeraldSeedsRecipes = config.get(
				"seeds",
				"Enable Emerald Seeds from Grass (Default: "
						+ enableEmeraldSeedsRecipesDefault + ")",
				enableEmeraldSeedsRecipesDefault).getBoolean(
				enableEmeraldSeedsRecipesDefault);

		// Armor
		enableCoalArmorPotion = config.get(
				"armor",
				"Enable Coal Armor Potion Effect (Default: "
						+ enableCoalArmorPotionDefault + ")",
				enableCoalArmorPotionDefault).getBoolean(
				enableCoalArmorPotionDefault);
		enableLapisArmorPotion = config.get(
				"armor",
				"Enable Lapis Armor Potion Effect (Default: "
						+ enableLapisArmorPotionDefault + ")",
				enableLapisArmorPotionDefault).getBoolean(
				enableLapisArmorPotionDefault);
		enableRedstoneArmorPotion = config.get(
				"armor",
				"Enable Redstone Armor Potion Effect (Default: "
						+ enableRedstoneArmorPotionDefault + ")",
				enableRedstoneArmorPotionDefault).getBoolean(
				enableRedstoneArmorPotionDefault);
		enableQuartzArmorPotion = config.get(
				"armor",
				"Enable Quartz Armor Potion Effect (Default: "
						+ enableQuartzArmorPotionDefault + ")",
				enableQuartzArmorPotionDefault).getBoolean(
				enableQuartzArmorPotionDefault);
		enableGlowstoneArmorPotion = config.get(
				"armor",
				"Enable Glowstone Armor Potion Effect (Default: "
						+ enableGlowstoneArmorPotionDefault + ")",
				enableGlowstoneArmorPotionDefault).getBoolean(
				enableGlowstoneArmorPotionDefault);
		enableEmeraldArmorPotion = config.get(
				"armor",
				"Enable Emerald Armor Potion Effect (Default: "
						+ enableEmeraldArmorPotionDefault + ")",
				enableEmeraldArmorPotionDefault).getBoolean(
				enableEmeraldArmorPotionDefault);
	}
}
