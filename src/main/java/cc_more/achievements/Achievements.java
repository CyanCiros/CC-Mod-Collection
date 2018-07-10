package cc_more.achievements;

import cc_more.items.ModItems;
import cc_more.world.MinersDimension;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class Achievements {
	public static Achievement achievementPortalIgniter;

	public static Achievement achievementCopper;
	public static Achievement achievementCopperPickaxe;

	public static Achievement achievementTin;
	public static Achievement achievementTinPickaxe;

	public static Achievement achievementBronze;
	public static Achievement achievementBronzePickaxe;

	public static Achievement achievementBauxite;
	public static Achievement achievementBauxitePickaxe;

	public static Achievement achievementChrome;
	public static Achievement achievementChromePickaxe;

	public static Achievement achievementSilver;
	public static Achievement achievementSilverPickaxe;

	public static Achievement achievementLead;
	public static Achievement achievementLeadPickaxe;

	public static Achievement achievementRuby;
	public static Achievement achievementRubyPickaxe;

	public static Achievement achievementSapphire;
	public static Achievement achievementSapphirePickaxe;

	public static Achievement achievementStainless;
	public static Achievement achievementStainlessPickaxe;

	public static Achievement achievementFluorite;
	public static Achievement achievementFluoritePickaxe;

	public static Achievement achievementJade;
	public static Achievement achievementJadePickaxe;

	public static Achievement achievementTitanium;
	public static Achievement achievementTitaniumPickaxe;

	public static Achievement achievementUranium;
	public static Achievement achievementUraniumPickaxe;

	public static Achievement achievementAmethyst;
	public static Achievement achievementAmethystPickaxe;

	public static Achievement achievementPlatinum;
	public static Achievement achievementPlatinumPickaxe;

	public static Achievement achievementMeteorite;
	public static Achievement achievementMeteoritePickaxe;

	public static void main() {
		achievementPortalIgniter = new Achievement("achievement.craftPortalIgniter", "craftPortalIgniter", 0, 0,
				MinersDimension.portalIgniter, null);

		achievementCopper = new Achievement("achievement.mineCopper", "mineCopper", 0, 2,
				new ItemStack(ModItems.copperIngot), achievementPortalIgniter);
		achievementCopperPickaxe = new Achievement("achievement.craftCopperPickaxe", "craftCopperPickaxe", -2, 2,
				ModItems.copperPickaxe, achievementCopper);

		achievementTin = new Achievement("achievement.mineTin", "mineTin", -2, 0, new ItemStack(ModItems.tinIngot),
				achievementPortalIgniter);
		achievementTinPickaxe = new Achievement("achievement.craftTinPickaxe", "craftTinPickaxe", -2, -2,
				ModItems.tinPickaxe, achievementTin);

		achievementBronze = new Achievement("achievement.mineBronze", "mineBronze", 0, -2,
				new ItemStack(ModItems.bronzeIngot), achievementPortalIgniter);
		achievementBronzePickaxe = new Achievement("achievement.craftBronzePickaxe", "craftBronzePickaxe", 2, -2,
				ModItems.bronzePickaxe, achievementBronze);

		achievementBauxite = new Achievement("achievement.mineBauxite", "mineBauxite", 2, 0,
				new ItemStack(ModItems.bauxiteIngot), achievementPortalIgniter);
		achievementBauxitePickaxe = new Achievement("achievement.craftBauxitePickaxe", "craftBauxitePickaxe", 2, 2,
				ModItems.bauxitePickaxe, achievementBauxite);

		achievementChrome = new Achievement("achievement.mineChrome", "mineChrome", 5, -1,
				new ItemStack(ModItems.chromeIngot), achievementBronzePickaxe);
		achievementChromePickaxe = new Achievement("achievement.craftChromePickaxe", "craftChromePickaxe", 5, 1,
				ModItems.chromePickaxe, achievementChrome);

		achievementSilver = new Achievement("achievement.mineSilver", "mineSilver", 7, -2,
				new ItemStack(ModItems.silverIngot), achievementBronzePickaxe);
		achievementSilverPickaxe = new Achievement("achievement.craftSilverPickaxe", "craftSilverPickaxe", 7, 0,
				ModItems.silverPickaxe, achievementSilver);

		achievementLead = new Achievement("achievement.mineLead", "mineLead", 9, -3, new ItemStack(ModItems.leadIngot),
				achievementBronzePickaxe);
		achievementLeadPickaxe = new Achievement("achievement.craftLeadPickaxe", "craftLeadPickaxe", 9, -1,
				ModItems.leadPickaxe, achievementLead);

		achievementRuby = new Achievement("achievement.mineRuby", "mineRuby", 6, 4, new ItemStack(ModItems.rubyGem),
				achievementLeadPickaxe);
		achievementRubyPickaxe = new Achievement("achievement.craftRubyPickaxe", "craftRubyPickaxe", 4, 4,
				ModItems.rubyPickaxe, achievementRuby);

		achievementSapphire = new Achievement("achievement.mineSapphire", "mineSapphire", 7, 6,
				new ItemStack(ModItems.sapphireGem), achievementLeadPickaxe);
		achievementSapphirePickaxe = new Achievement("achievement.craftSapphirePickaxe", "craftSapphirePickaxe", 5, 6,
				ModItems.sapphirePickaxe, achievementSapphire);

		achievementStainless = new Achievement("achievement.mineStainless", "mineStainless", 8, 8,
				new ItemStack(ModItems.stainlessIngot), achievementLeadPickaxe);
		achievementStainlessPickaxe = new Achievement("achievement.craftStainlessPickaxe", "craftStainlessPickaxe", 6,
				8, ModItems.stainlessPickaxe, achievementStainless);

		achievementFluorite = new Achievement("achievement.mineFluorite", "mineFluorite", 9, 10,
				new ItemStack(ModItems.fluoriteIngot), achievementLeadPickaxe);
		achievementFluoritePickaxe = new Achievement("achievement.craftFluoritePickaxe", "craftFluoritePickaxe", 7, 10,
				ModItems.fluoritePickaxe, achievementFluorite);

		achievementJade = new Achievement("achievement.mineJade", "mineJade", 1, 5, new ItemStack(ModItems.jadeGem),
				achievementRubyPickaxe);
		achievementJadePickaxe = new Achievement("achievement.craftJadePickaxe", "craftJadePickaxe", -1, 5,
				ModItems.jadePickaxe, achievementJade);

		achievementTitanium = new Achievement("achievement.mineTitanium", "mineTitanium", 2, 7,
				new ItemStack(ModItems.titaniumIngot), achievementRubyPickaxe);
		achievementTitaniumPickaxe = new Achievement("achievement.craftTitaniumPickaxe", "craftTitaniumPickaxe", 0, 7,
				ModItems.titaniumPickaxe, achievementTitanium);

		achievementUranium = new Achievement("achievement.mineUranium", "mineUranium", -4, 5,
				new ItemStack(ModItems.uraniumIngot), achievementJadePickaxe);
		achievementUraniumPickaxe = new Achievement("achievement.craftUraniumPickaxe", "craftUraniumPickaxe", -6, 5,
				ModItems.uraniumPickaxe, achievementUranium);

		achievementAmethyst = new Achievement("achievement.mineAmethyst", "mineAmethyst", -3, 7,
				new ItemStack(ModItems.amethystIngot), achievementJadePickaxe);
		achievementAmethystPickaxe = new Achievement("achievement.craftAmethystPickaxe", "craftAmethystPickaxe", -5, 7,
				ModItems.amethystPickaxe, achievementAmethyst);

		achievementPlatinum = new Achievement("achievement.minePlatinum", "minePlatinum", -5, 2,
				new ItemStack(ModItems.platinumIngot), achievementUraniumPickaxe);
		achievementPlatinumPickaxe = new Achievement("achievement.craftPlatinumPickaxe", "craftPlatinumPickaxe", -5, 0,
				ModItems.platinumPickaxe, achievementPlatinum);

		achievementMeteorite = new Achievement("achievement.mineMeteorite", "mineMeteorite", -7, 2,
				new ItemStack(ModItems.meteorite), achievementUraniumPickaxe);
		achievementMeteoritePickaxe = new Achievement("achievement.craftMeteoritePickaxe", "craftMeteoritePickaxe", -7,
				0, ModItems.meteoritePickaxe, achievementMeteorite);

		AchievementPage.registerAchievementPage(new AchievementPage("Miner's Heaven",
				new Achievement[] { achievementPortalIgniter, achievementCopper, achievementCopperPickaxe,
						achievementTin, achievementTinPickaxe, achievementBronze, achievementBronzePickaxe,
						achievementBauxite, achievementBauxitePickaxe, achievementChrome, achievementChromePickaxe,
						achievementSilver, achievementSilverPickaxe, achievementLead, achievementLeadPickaxe,
						achievementRuby, achievementRubyPickaxe, achievementSapphire, achievementSapphirePickaxe,
						achievementStainless, achievementStainlessPickaxe, achievementFluorite,
						achievementFluoritePickaxe, achievementJade, achievementJadePickaxe, achievementTitanium,
						achievementTitaniumPickaxe, achievementUranium, achievementUraniumPickaxe, achievementAmethyst,
						achievementAmethystPickaxe, achievementPlatinum, achievementPlatinumPickaxe,
						achievementMeteorite, achievementMeteoritePickaxe }));

		registerAchievementOnCraftEvent(achievementPortalIgniter, MinersDimension.portalIgniter);

		registerAchievementOnSmeltedEvent(achievementCopper, ModItems.copperIngot);
		registerAchievementOnCraftEvent(achievementCopperPickaxe, ModItems.copperPickaxe);

		registerAchievementOnSmeltedEvent(achievementTin, ModItems.tinIngot);
		registerAchievementOnCraftEvent(achievementTinPickaxe, ModItems.tinPickaxe);

		registerAchievementOnCraftEvent(achievementBronze, ModItems.bronzeIngot);
		registerAchievementOnCraftEvent(achievementBronzePickaxe, ModItems.bronzePickaxe);

		registerAchievementOnSmeltedEvent(achievementBauxite, ModItems.bauxiteIngot);
		registerAchievementOnCraftEvent(achievementBauxitePickaxe, ModItems.bauxitePickaxe);

		registerAchievementOnSmeltedEvent(achievementChrome, ModItems.chromeIngot);
		registerAchievementOnCraftEvent(achievementChromePickaxe, ModItems.chromePickaxe);

		registerAchievementOnSmeltedEvent(achievementSilver, ModItems.silverIngot);
		registerAchievementOnCraftEvent(achievementSilverPickaxe, ModItems.silverPickaxe);

		registerAchievementOnSmeltedEvent(achievementLead, ModItems.leadIngot);
		registerAchievementOnCraftEvent(achievementLeadPickaxe, ModItems.leadPickaxe);

		registerAchievementOnMineEvent(achievementRuby, ModItems.rubyGem);
		registerAchievementOnCraftEvent(achievementRubyPickaxe, ModItems.rubyPickaxe);

		registerAchievementOnMineEvent(achievementSapphire, ModItems.sapphireGem);
		registerAchievementOnCraftEvent(achievementSapphirePickaxe, ModItems.sapphirePickaxe);

		registerAchievementOnSmeltedEvent(achievementStainless, ModItems.stainlessIngot);
		registerAchievementOnCraftEvent(achievementStainlessPickaxe, ModItems.stainlessPickaxe);

		registerAchievementOnSmeltedEvent(achievementFluorite, ModItems.fluoriteIngot);
		registerAchievementOnCraftEvent(achievementFluoritePickaxe, ModItems.fluoritePickaxe);

		registerAchievementOnMineEvent(achievementJade, ModItems.jadeGem);
		registerAchievementOnCraftEvent(achievementJadePickaxe, ModItems.jadePickaxe);

		registerAchievementOnSmeltedEvent(achievementTitanium, ModItems.titaniumIngot);
		registerAchievementOnCraftEvent(achievementTitaniumPickaxe, ModItems.titaniumPickaxe);

		registerAchievementOnSmeltedEvent(achievementUranium, ModItems.uraniumIngot);
		registerAchievementOnCraftEvent(achievementUraniumPickaxe, ModItems.uraniumPickaxe);

		registerAchievementOnSmeltedEvent(achievementAmethyst, ModItems.amethystIngot);
		registerAchievementOnCraftEvent(achievementAmethystPickaxe, ModItems.amethystPickaxe);

		registerAchievementOnSmeltedEvent(achievementPlatinum, ModItems.platinumIngot);
		registerAchievementOnCraftEvent(achievementPlatinumPickaxe, ModItems.platinumPickaxe);

		registerAchievementOnMineEvent(achievementMeteorite, ModItems.meteorite);
		registerAchievementOnCraftEvent(achievementMeteoritePickaxe, ModItems.meteoritePickaxe);
	}

	public static void registerAchievementOnCraftEvent(final Achievement achievement, final Item item) {
		FMLCommonHandler.instance().bus().register(new AchievementOnCraftEvent(achievement, item));
	}

	public static void registerAchievementOnMineEvent(final Achievement achievement, final Item item) {
		FMLCommonHandler.instance().bus().register(new AchievementOnMineEvent(achievement, item));
	}

	public static void registerAchievementOnSmeltedEvent(final Achievement achievement, final Item item) {
		FMLCommonHandler.instance().bus().register(new AchievementOnSmeltedEvent(achievement, item));
	}
}
