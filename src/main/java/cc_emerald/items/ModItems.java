package cc_emerald.items;

import cc_emerald.Config;
import cc_emerald.CCEmerald;
import cc_emerald.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	// Seeds
	public static ModSeeds coalSeeds;
	public static ModSeeds lapisSeeds;
	public static ModSeeds ironSeeds;
	public static ModSeeds goldSeeds;
	public static ModSeeds redstoneSeeds;
	public static ModSeeds diamondSeeds;
	public static ModSeeds quartzSeeds;
	public static ModSeeds glowstoneSeeds;
	public static ModSeeds emeraldSeeds;

	// Items
	// public static ModFlintAndSteel flintAndEmerald;
	// public static ModItem emeraldRod;
	// public static ModItem emeraldDust;
	// public static ModItem emeraldBone;

	public static ModItemDoor doorItem;
	public static ModItemDoor doorItemObsidian;

	// Tools
	public static ModStaff woodStaff;
	public static ModKatana woodKatana;
	public static ModKhopesh woodKhopesh;
	public static ModBattleaxe woodBattleaxe;
	public static ModBigSword woodBigSword;

	public static ModStaff stoneStaff;
	public static ModKatana stoneKatana;
	public static ModKhopesh stoneKhopesh;
	public static ModBattleaxe stoneBattleaxe;
	public static ModBigSword stoneBigSword;

	public static ModHoe coalHoe;
	public static ModAxe coalAxe;
	public static ModPickaxe coalPickaxe;
	public static ModSpade coalShovel;
	public static ModSword coalSword;

	public static ModStaff coalStaff;
	public static ModKatana coalKatana;
	public static ModKhopesh coalKhopesh;
	public static ModBattleaxe coalBattleaxe;
	public static ModBigSword coalBigSword;

	public static ModHoe lapisHoe;
	public static ModAxe lapisAxe;
	public static ModPickaxe lapisPickaxe;
	public static ModSpade lapisShovel;
	public static ModSword lapisSword;

	public static ModStaff lapisStaff;
	public static ModKatana lapisKatana;
	public static ModKhopesh lapisKhopesh;
	public static ModBattleaxe lapisBattleaxe;
	public static ModBigSword lapisBigSword;

	public static ModStaff ironStaff;
	public static ModKatana ironKatana;
	public static ModKhopesh ironKhopesh;
	public static ModBattleaxe ironBattleaxe;
	public static ModBigSword ironBigSword;

	public static ModStaff goldStaff;
	public static ModKatana goldKatana;
	public static ModKhopesh goldKhopesh;
	public static ModBattleaxe goldBattleaxe;
	public static ModBigSword goldBigSword;

	public static ModHoe redstoneHoe;
	public static ModAxe redstoneAxe;
	public static ModPickaxe redstonePickaxe;
	public static ModSpade redstoneShovel;
	public static ModSword redstoneSword;

	public static ModStaff redstoneStaff;
	public static ModKatana redstoneKatana;
	public static ModKhopesh redstoneKhopesh;
	public static ModBattleaxe redstoneBattleaxe;
	public static ModBigSword redstoneBigSword;

	public static ModStaff diamondStaff;
	public static ModKatana diamondKatana;
	public static ModKhopesh diamondKhopesh;
	public static ModBattleaxe diamondBattleaxe;
	public static ModBigSword diamondBigSword;

	public static ModHoe quartzHoe;
	public static ModAxe quartzAxe;
	public static ModPickaxe quartzPickaxe;
	public static ModSpade quartzShovel;
	public static ModSword quartzSword;

	public static ModStaff quartzStaff;
	public static ModKatana quartzKatana;
	public static ModKhopesh quartzKhopesh;
	public static ModBattleaxe quartzBattleaxe;
	public static ModBigSword quartzBigSword;

	public static ModHoe glowstoneHoe;
	public static ModAxe glowstoneAxe;
	public static ModPickaxe glowstonePickaxe;
	public static ModSpade glowstoneShovel;
	public static ModSword glowstoneSword;

	public static ModStaff glowstoneStaff;
	public static ModKatana glowstoneKatana;
	public static ModKhopesh glowstoneKhopesh;
	public static ModBattleaxe glowstoneBattleaxe;
	public static ModBigSword glowstoneBigSword;

	public static ModHoe emeraldHoe;
	public static ModAxe emeraldAxe;
	public static ModPickaxe emeraldPickaxe;
	public static ModSpade emeraldShovel;
	public static ModSword emeraldSword;

	public static ModStaff emeraldStaff;
	public static ModKatana emeraldKatana;
	public static ModKhopesh emeraldKhopesh;
	public static ModBattleaxe emeraldBattleaxe;
	public static ModBigSword emeraldBigSword;

	// Armor
	public static ItemArmor coalHelmet;
	public static ItemArmor coalChestplate;
	public static ItemArmor coalLeggings;
	public static ItemArmor coalBoots;

	public static ItemArmor lapisHelmet;
	public static ItemArmor lapisChestplate;
	public static ItemArmor lapisLeggings;
	public static ItemArmor lapisBoots;

	public static ItemArmor redstoneHelmet;
	public static ItemArmor redstoneChestplate;
	public static ItemArmor redstoneLeggings;
	public static ItemArmor redstoneBoots;

	public static ItemArmor quartzHelmet;
	public static ItemArmor quartzChestplate;
	public static ItemArmor quartzLeggings;
	public static ItemArmor quartzBoots;

	public static ItemArmor glowstoneHelmet;
	public static ItemArmor glowstoneChestplate;
	public static ItemArmor glowstoneLeggings;
	public static ItemArmor glowstoneBoots;

	public static ItemArmor emeraldHelmet;
	public static ItemArmor emeraldChestplate;
	public static ItemArmor emeraldLeggings;
	public static ItemArmor emeraldBoots;

	// Bows
	public static ModBow coalBow;
	public static ModBow stoneBow;
	public static ModBow lapisBow;
	public static ModBow ironBow;
	public static ModBow goldBow;
	public static ModBow redstoneBow;
	public static ModBow diamondBow;
	public static ModBow quartzBow;
	public static ModBow glowstoneBow;
	public static ModBow emeraldBow;

	// Apples
	public static Item coalApple;
	public static Item lapisApple;
	public static Item redstoneApple;
	public static Item quartzApple;
	public static Item glowstoneApple;
	public static Item emeraldApple;

	// Potions
	// public static Item emeraldPotion;
	// public static Item emeraldPotionThrow;

	public static void createItems() {
		// Seeds
		coalSeeds = new ModSeeds("coalSeeds", ModBlocks.coalCrop, Blocks.farmland);
		lapisSeeds = new ModSeeds("lapisSeeds", ModBlocks.lapisCrop, Blocks.farmland);
		ironSeeds = new ModSeeds("ironSeeds", ModBlocks.ironCrop, Blocks.farmland);
		goldSeeds = new ModSeeds("goldSeeds", ModBlocks.goldCrop, Blocks.farmland);
		redstoneSeeds = new ModSeeds("redstoneSeeds", ModBlocks.redstoneCrop, Blocks.farmland);
		diamondSeeds = new ModSeeds("diamondSeeds", ModBlocks.diamondCrop, Blocks.farmland);
		quartzSeeds = new ModSeeds("quartzSeeds", ModBlocks.quartzCrop, Blocks.farmland);
		glowstoneSeeds = new ModSeeds("glowstoneSeeds", ModBlocks.glowstoneCrop, Blocks.farmland);
		emeraldSeeds = new ModSeeds("emeraldSeeds", ModBlocks.emeraldCrop, Blocks.farmland);

		ModItems.registerItem(coalSeeds);
		ModItems.registerItem(lapisSeeds);
		ModItems.registerItem(ironSeeds);
		ModItems.registerItem(goldSeeds);
		ModItems.registerItem(redstoneSeeds);
		ModItems.registerItem(diamondSeeds);
		ModItems.registerItem(quartzSeeds);
		ModItems.registerItem(glowstoneSeeds);
		ModItems.registerItem(emeraldSeeds);

		if (Config.enableCoalSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(coalSeeds, 1, 0), 3);
		}
		if (Config.enableLapisSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(lapisSeeds, 1, 0), 3);
		}
		if (Config.enableIronSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(ironSeeds, 1, 0), 3);
		}
		if (Config.enableGoldSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(goldSeeds, 1, 0), 3);
		}
		if (Config.enableRedstoneSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(redstoneSeeds, 1, 0), 3);
		}
		if (Config.enableDiamondSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(diamondSeeds, 1, 0), 3);
		}
		if (Config.enableQuartzSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(quartzSeeds, 1, 0), 3);
		}
		if (Config.enableGlowstoneSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(glowstoneSeeds, 1, 0), 3);
		}
		if (Config.enableEmeraldSeedsFromGrass) {
			MinecraftForge.addGrassSeed(new ItemStack(emeraldSeeds, 1, 0), 3);
		}

		// Items
		// flintAndEmerald = new ModFlintAndSteel("flintAndEmerald");
		// emeraldRod = new ModItem("emeraldRod");
		// emeraldDust = new ModItem("emeraldDust");
		// emeraldBone = new ModItem("emeraldBone");
		//
		// ModItems.registerItem(flintAndEmerald);
		// ModItems.registerItem(emeraldRod);
		// ModItems.registerItem(emeraldDust);
		// ModItems.registerItem(emeraldBone);

		doorItem = new ModItemDoor(ModBlocks.doorBlock, "doorItem");
		doorItemObsidian = new ModItemDoor(ModBlocks.doorBlockObsidian, "doorItemObsidian");

		ModItems.registerItem(doorItem);
		ModItems.registerItem(doorItemObsidian);

		// Tools
		woodStaff = new ModStaff(ModItemMaterial.enumToolMaterialWoodStaff, "woodStaff");
		woodKatana = new ModKatana(ModItemMaterial.enumToolMaterialWoodKatana, "woodKatana");
		woodKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialWoodKhopesh, "woodKhopesh");
		woodBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialWoodBattleaxe, "woodBattleaxe");
		woodBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialWoodBigSword, "woodBigSword");

		ModItems.registerItem(woodStaff);
		ModItems.registerItem(woodKatana);
		ModItems.registerItem(woodKhopesh);
		ModItems.registerItem(woodBattleaxe);
		ModItems.registerItem(woodBigSword);

		stoneStaff = new ModStaff(ModItemMaterial.enumToolMaterialStoneStaff, "stoneStaff");
		stoneKatana = new ModKatana(ModItemMaterial.enumToolMaterialStoneKatana, "stoneKatana");
		stoneKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialStoneKhopesh, "stoneKhopesh");
		stoneBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialStoneBattleaxe, "stoneBattleaxe");
		stoneBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialStoneBigSword, "stoneBigSword");

		ModItems.registerItem(stoneStaff);
		ModItems.registerItem(stoneKatana);
		ModItems.registerItem(stoneKhopesh);
		ModItems.registerItem(stoneBattleaxe);
		ModItems.registerItem(stoneBigSword);

		coalHoe = new ModHoe(ModItemMaterial.enumToolMaterialCoal, "coalHoe");
		coalAxe = new ModAxe(ModItemMaterial.enumToolMaterialCoal, "coalAxe");
		coalPickaxe = new ModPickaxe(ModItemMaterial.enumToolMaterialCoal, "coalPickaxe");
		coalShovel = new ModSpade(ModItemMaterial.enumToolMaterialCoal, "coalShovel");
		coalSword = new ModSword(ModItemMaterial.enumToolMaterialCoal, "coalSword");

		ModItems.registerItem(coalHoe);
		ModItems.registerItem(coalAxe);
		ModItems.registerItem(coalPickaxe);
		ModItems.registerItem(coalShovel);
		ModItems.registerItem(coalSword);

		coalStaff = new ModStaff(ModItemMaterial.enumToolMaterialCoalStaff, "coalStaff");
		coalKatana = new ModKatana(ModItemMaterial.enumToolMaterialCoalKatana, "coalKatana");
		coalKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialCoalKhopesh, "coalKhopesh");
		coalBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialCoalBattleaxe, "coalBattleaxe");
		coalBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialCoalBigSword, "coalBigSword");

		ModItems.registerItem(coalStaff);
		ModItems.registerItem(coalKatana);
		ModItems.registerItem(coalKhopesh);
		ModItems.registerItem(coalBattleaxe);
		ModItems.registerItem(coalBigSword);

		lapisHoe = new ModHoe(ModItemMaterial.enumToolMaterialLapis, "lapisHoe");
		lapisAxe = new ModAxe(ModItemMaterial.enumToolMaterialLapis, "lapisAxe");
		lapisPickaxe = new ModPickaxe(ModItemMaterial.enumToolMaterialLapis, "lapisPickaxe");
		lapisShovel = new ModSpade(ModItemMaterial.enumToolMaterialLapis, "lapisShovel");
		lapisSword = new ModSword(ModItemMaterial.enumToolMaterialLapis, "lapisSword");

		ModItems.registerItem(lapisHoe);
		ModItems.registerItem(lapisAxe);
		ModItems.registerItem(lapisPickaxe);
		ModItems.registerItem(lapisShovel);
		ModItems.registerItem(lapisSword);

		lapisStaff = new ModStaff(ModItemMaterial.enumToolMaterialLapisStaff, "lapisStaff");
		lapisKatana = new ModKatana(ModItemMaterial.enumToolMaterialLapisKatana, "lapisKatana");
		lapisKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialLapisKhopesh, "lapisKhopesh");
		lapisBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialLapisBattleaxe, "lapisBattleaxe");
		lapisBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialLapisBigSword, "lapisBigSword");

		ModItems.registerItem(lapisStaff);
		ModItems.registerItem(lapisKatana);
		ModItems.registerItem(lapisKhopesh);
		ModItems.registerItem(lapisBattleaxe);
		ModItems.registerItem(lapisBigSword);

		ironStaff = new ModStaff(ModItemMaterial.enumToolMaterialIronStaff, "ironStaff");
		ironKatana = new ModKatana(ModItemMaterial.enumToolMaterialIronKatana, "ironKatana");
		ironKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialIronKhopesh, "ironKhopesh");
		ironBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialIronBattleaxe, "ironBattleaxe");
		ironBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialIronBigSword, "ironBigSword");

		ModItems.registerItem(ironStaff);
		ModItems.registerItem(ironKatana);
		ModItems.registerItem(ironKhopesh);
		ModItems.registerItem(ironBattleaxe);
		ModItems.registerItem(ironBigSword);

		goldStaff = new ModStaff(ModItemMaterial.enumToolMaterialGoldStaff, "goldStaff");
		goldKatana = new ModKatana(ModItemMaterial.enumToolMaterialGoldKatana, "goldKatana");
		goldKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialGoldKhopesh, "goldKhopesh");
		goldBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialGoldBattleaxe, "goldBattleaxe");
		goldBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialGoldBigSword, "goldBigSword");

		ModItems.registerItem(goldStaff);
		ModItems.registerItem(goldKatana);
		ModItems.registerItem(goldKhopesh);
		ModItems.registerItem(goldBattleaxe);
		ModItems.registerItem(goldBigSword);

		redstoneHoe = new ModHoe(ModItemMaterial.enumToolMaterialRedstone, "redstoneHoe");
		redstoneAxe = new ModAxe(ModItemMaterial.enumToolMaterialRedstone, "redstoneAxe");
		redstonePickaxe = new ModPickaxe(ModItemMaterial.enumToolMaterialRedstone, "redstonePickaxe");
		redstoneShovel = new ModSpade(ModItemMaterial.enumToolMaterialRedstone, "redstoneShovel");
		redstoneSword = new ModSword(ModItemMaterial.enumToolMaterialRedstone, "redstoneSword");

		ModItems.registerItem(redstoneHoe);
		ModItems.registerItem(redstoneAxe);
		ModItems.registerItem(redstonePickaxe);
		ModItems.registerItem(redstoneShovel);
		ModItems.registerItem(redstoneSword);

		redstoneStaff = new ModStaff(ModItemMaterial.enumToolMaterialRedstoneStaff, "redstoneStaff");
		redstoneKatana = new ModKatana(ModItemMaterial.enumToolMaterialRedstoneKatana, "redstoneKatana");
		redstoneKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialRedstoneKhopesh, "redstoneKhopesh");
		redstoneBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialRedstoneBattleaxe, "redstoneBattleaxe");
		redstoneBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialRedstoneBigSword, "redstoneBigSword");

		ModItems.registerItem(redstoneStaff);
		ModItems.registerItem(redstoneKatana);
		ModItems.registerItem(redstoneKhopesh);
		ModItems.registerItem(redstoneBattleaxe);
		ModItems.registerItem(redstoneBigSword);

		diamondStaff = new ModStaff(ModItemMaterial.enumToolMaterialDiamondStaff, "diamondStaff");
		diamondKatana = new ModKatana(ModItemMaterial.enumToolMaterialDiamondKatana, "diamondKatana");
		diamondKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialDiamondKhopesh, "diamondKhopesh");
		diamondBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialDiamondBattleaxe, "diamondBattleaxe");
		diamondBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialDiamondBigSword, "diamondBigSword");

		ModItems.registerItem(diamondStaff);
		ModItems.registerItem(diamondKatana);
		ModItems.registerItem(diamondKhopesh);
		ModItems.registerItem(diamondBattleaxe);
		ModItems.registerItem(diamondBigSword);

		quartzHoe = new ModHoe(ModItemMaterial.enumToolMaterialQuartz, "quartzHoe");
		quartzAxe = new ModAxe(ModItemMaterial.enumToolMaterialQuartz, "quartzAxe");
		quartzPickaxe = new ModPickaxe(ModItemMaterial.enumToolMaterialQuartz, "quartzPickaxe");
		quartzShovel = new ModSpade(ModItemMaterial.enumToolMaterialQuartz, "quartzShovel");
		quartzSword = new ModSword(ModItemMaterial.enumToolMaterialQuartz, "quartzSword");

		ModItems.registerItem(quartzHoe);
		ModItems.registerItem(quartzAxe);
		ModItems.registerItem(quartzPickaxe);
		ModItems.registerItem(quartzShovel);
		ModItems.registerItem(quartzSword);

		quartzStaff = new ModStaff(ModItemMaterial.enumToolMaterialQuartzStaff, "quartzStaff");
		quartzKatana = new ModKatana(ModItemMaterial.enumToolMaterialQuartzKatana, "quartzKatana");
		quartzKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialQuartzKhopesh, "quartzKhopesh");
		quartzBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialQuartzBattleaxe, "quartzBattleaxe");
		quartzBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialQuartzBigSword, "quartzBigSword");

		ModItems.registerItem(quartzStaff);
		ModItems.registerItem(quartzKatana);
		ModItems.registerItem(quartzKhopesh);
		ModItems.registerItem(quartzBattleaxe);
		ModItems.registerItem(quartzBigSword);

		glowstoneHoe = new ModHoe(ModItemMaterial.enumToolMaterialGlowstone, "glowstoneHoe");
		glowstoneAxe = new ModAxe(ModItemMaterial.enumToolMaterialGlowstone, "glowstoneAxe");
		glowstonePickaxe = new ModPickaxe(ModItemMaterial.enumToolMaterialGlowstone, "glowstonePickaxe");
		glowstoneShovel = new ModSpade(ModItemMaterial.enumToolMaterialGlowstone, "glowstoneShovel");
		glowstoneSword = new ModSword(ModItemMaterial.enumToolMaterialGlowstone, "glowstoneSword");

		ModItems.registerItem(glowstoneHoe);
		ModItems.registerItem(glowstoneAxe);
		ModItems.registerItem(glowstonePickaxe);
		ModItems.registerItem(glowstoneShovel);
		ModItems.registerItem(glowstoneSword);

		glowstoneStaff = new ModStaff(ModItemMaterial.enumToolMaterialGlowstoneStaff, "glowstoneStaff");
		glowstoneKatana = new ModKatana(ModItemMaterial.enumToolMaterialGlowstoneKatana, "glowstoneKatana");
		glowstoneKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialGlowstoneKhopesh, "glowstoneKhopesh");
		glowstoneBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialGlowstoneBattleaxe, "glowstoneBattleaxe");
		glowstoneBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialGlowstoneBigSword, "glowstoneBigSword");

		ModItems.registerItem(glowstoneStaff);
		ModItems.registerItem(glowstoneKatana);
		ModItems.registerItem(glowstoneKhopesh);
		ModItems.registerItem(glowstoneBattleaxe);
		ModItems.registerItem(glowstoneBigSword);

		emeraldHoe = new ModHoe(ModItemMaterial.enumToolMaterialEmerald, "emeraldHoe");
		emeraldAxe = new ModAxe(ModItemMaterial.enumToolMaterialEmerald, "emeraldAxe");
		emeraldPickaxe = new ModPickaxe(ModItemMaterial.enumToolMaterialEmerald, "emeraldPickaxe");
		emeraldShovel = new ModSpade(ModItemMaterial.enumToolMaterialEmerald, "emeraldShovel");
		emeraldSword = new ModSword(ModItemMaterial.enumToolMaterialEmerald, "emeraldSword");

		ModItems.registerItem(emeraldHoe);
		ModItems.registerItem(emeraldAxe);
		ModItems.registerItem(emeraldPickaxe);
		ModItems.registerItem(emeraldShovel);
		ModItems.registerItem(emeraldSword);

		emeraldStaff = new ModStaff(ModItemMaterial.enumToolMaterialEmeraldStaff, "emeraldStaff");
		emeraldKatana = new ModKatana(ModItemMaterial.enumToolMaterialEmeraldKatana, "emeraldKatana");
		emeraldKhopesh = new ModKhopesh(ModItemMaterial.enumToolMaterialEmeraldKhopesh, "emeraldKhopesh");
		emeraldBattleaxe = new ModBattleaxe(ModItemMaterial.enumToolMaterialEmeraldBattleaxe, "emeraldBattleaxe");
		emeraldBigSword = new ModBigSword(ModItemMaterial.enumToolMaterialEmeraldBigSword, "emeraldBigSword");

		ModItems.registerItem(emeraldStaff);
		ModItems.registerItem(emeraldKatana);
		ModItems.registerItem(emeraldKhopesh);
		ModItems.registerItem(emeraldBattleaxe);
		ModItems.registerItem(emeraldBigSword);

		// Armor
		// RenderingRegistry.addNewArmourRendererPrefix("5");

		coalHelmet = new ModArmor(ModItemMaterial.coal, 1, 0, "coalHelmet");
		coalChestplate = new ModArmor(ModItemMaterial.coal, 1, 1, "coalChestplate");
		coalLeggings = new ModArmor(ModItemMaterial.coal, 2, 2, "coalLeggings");
		coalBoots = new ModArmor(ModItemMaterial.coal, 1, 3, "coalBoots");

		ModItems.registerItem(coalHelmet);
		ModItems.registerItem(coalChestplate);
		ModItems.registerItem(coalLeggings);
		ModItems.registerItem(coalBoots);

		lapisHelmet = new ModArmor(ModItemMaterial.lapis, 1, 0, "lapisHelmet");
		lapisChestplate = new ModArmor(ModItemMaterial.lapis, 1, 1, "lapisChestplate");
		lapisLeggings = new ModArmor(ModItemMaterial.lapis, 2, 2, "lapisLeggings");
		lapisBoots = new ModArmor(ModItemMaterial.lapis, 1, 3, "lapisBoots");

		ModItems.registerItem(lapisHelmet);
		ModItems.registerItem(lapisChestplate);
		ModItems.registerItem(lapisLeggings);
		ModItems.registerItem(lapisBoots);

		redstoneHelmet = new ModArmor(ModItemMaterial.redstone, 1, 0, "redstoneHelmet");
		redstoneChestplate = new ModArmor(ModItemMaterial.redstone, 1, 1, "redstoneChestplate");
		redstoneLeggings = new ModArmor(ModItemMaterial.redstone, 2, 2, "redstoneLeggings");
		redstoneBoots = new ModArmor(ModItemMaterial.redstone, 1, 3, "redstoneBoots");

		ModItems.registerItem(redstoneHelmet);
		ModItems.registerItem(redstoneChestplate);
		ModItems.registerItem(redstoneLeggings);
		ModItems.registerItem(redstoneBoots);

		quartzHelmet = new ModArmor(ModItemMaterial.quartz, 1, 0, "quartzHelmet");
		quartzChestplate = new ModArmor(ModItemMaterial.quartz, 1, 1, "quartzChestplate");
		quartzLeggings = new ModArmor(ModItemMaterial.quartz, 2, 2, "quartzLeggings");
		quartzBoots = new ModArmor(ModItemMaterial.quartz, 1, 3, "quartzBoots");

		ModItems.registerItem(quartzHelmet);
		ModItems.registerItem(quartzChestplate);
		ModItems.registerItem(quartzLeggings);
		ModItems.registerItem(quartzBoots);

		glowstoneHelmet = new ModArmor(ModItemMaterial.glowstone, 1, 0, "glowstoneHelmet");
		glowstoneChestplate = new ModArmor(ModItemMaterial.glowstone, 1, 1, "glowstoneChestplate");
		glowstoneLeggings = new ModArmor(ModItemMaterial.glowstone, 2, 2, "glowstoneLeggings");
		glowstoneBoots = new ModArmor(ModItemMaterial.glowstone, 1, 3, "glowstoneBoots");

		ModItems.registerItem(glowstoneHelmet);
		ModItems.registerItem(glowstoneChestplate);
		ModItems.registerItem(glowstoneLeggings);
		ModItems.registerItem(glowstoneBoots);

		emeraldHelmet = new ModArmor(ModItemMaterial.emerald, 1, 0, "emeraldHelmet");
		emeraldChestplate = new ModArmor(ModItemMaterial.emerald, 1, 1, "emeraldChestplate");
		emeraldLeggings = new ModArmor(ModItemMaterial.emerald, 2, 2, "emeraldLeggings");
		emeraldBoots = new ModArmor(ModItemMaterial.emerald, 1, 3, "emeraldBoots");

		ModItems.registerItem(emeraldHelmet);
		ModItems.registerItem(emeraldChestplate);
		ModItems.registerItem(emeraldLeggings);
		ModItems.registerItem(emeraldBoots);

		// Bows
		coalBow = new ModBow("coalBow", ModItemMaterial.enumToolMaterialCoal.getMaxUses(),
				ModItemMaterial.coalDamage[0] / 2);
		stoneBow = new ModBow("stoneBow", ToolMaterial.STONE.getMaxUses(), ModItemMaterial.stoneDamage[0] / 2);
		lapisBow = new ModBow("lapisBow", ModItemMaterial.enumToolMaterialLapis.getMaxUses(),
				ModItemMaterial.lapisDamage[0] / 2);
		ironBow = new ModBow("ironBow", ToolMaterial.IRON.getMaxUses(), ModItemMaterial.ironDamage[0] / 2);
		goldBow = new ModBow("goldBow", ToolMaterial.GOLD.getMaxUses(), ModItemMaterial.goldDamage[0] / 2);
		redstoneBow = new ModBow("redstoneBow", ModItemMaterial.enumToolMaterialRedstone.getMaxUses(),
				ModItemMaterial.redstoneDamage[0] / 2);
		diamondBow = new ModBow("diamondBow", ToolMaterial.EMERALD.getMaxUses(), ModItemMaterial.diamondDamage[0] / 2);
		quartzBow = new ModBow("quartzBow", ModItemMaterial.enumToolMaterialQuartz.getMaxUses(),
				ModItemMaterial.quartzDamage[0] / 2);
		glowstoneBow = new ModBow("glowstoneBow", ModItemMaterial.enumToolMaterialGlowstone.getMaxUses(),
				ModItemMaterial.glowstoneDamage[0] / 2);
		emeraldBow = new ModBow("emeraldBow", ModItemMaterial.enumToolMaterialEmerald.getMaxUses(),
				ModItemMaterial.emeraldDamage[0] / 2);

		ModItems.registerItem(coalBow);
		ModItems.registerItem(stoneBow);
		ModItems.registerItem(lapisBow);
		ModItems.registerItem(ironBow);
		ModItems.registerItem(goldBow);
		ModItems.registerItem(redstoneBow);
		ModItems.registerItem(diamondBow);
		ModItems.registerItem(quartzBow);
		ModItems.registerItem(glowstoneBow);
		ModItems.registerItem(emeraldBow);

		// Apples
		final int appleHealAmount = 6;
		final float appleSaturation = 1.2F;

		coalApple = new ItemFood(appleHealAmount, appleSaturation, false)
				.setPotionEffect(Potion.digSpeed.id, 180, 0, 2.0F).setAlwaysEdible().setUnlocalizedName("coalApple")
				.setCreativeTab(CCEmerald.creativeTab);
		lapisApple = new ItemFood(appleHealAmount, appleSaturation, false)
				.setPotionEffect(Potion.waterBreathing.id, 180, 0, 2.0F).setAlwaysEdible()
				.setUnlocalizedName("lapisApple").setCreativeTab(CCEmerald.creativeTab);
		redstoneApple = new ItemFood(appleHealAmount, appleSaturation, false)
				.setPotionEffect(Potion.damageBoost.id, 180, 0, 2.0F).setAlwaysEdible()
				.setUnlocalizedName("redstoneApple").setCreativeTab(CCEmerald.creativeTab);
		quartzApple = new ItemFood(appleHealAmount, appleSaturation, false)
				.setPotionEffect(Potion.resistance.id, 180, 0, 2.0F)
				.setPotionEffect(Potion.fireResistance.id, 180, 0, 2.0F).setAlwaysEdible()
				.setUnlocalizedName("quartzApple").setCreativeTab(CCEmerald.creativeTab);
		glowstoneApple = new ItemFood(appleHealAmount, appleSaturation, false)
				.setPotionEffect(Potion.nightVision.id, 180, 0, 2.0F).setAlwaysEdible()
				.setUnlocalizedName("glowstoneApple").setCreativeTab(CCEmerald.creativeTab);
		emeraldApple = new ModAppleEmerald(appleHealAmount, appleSaturation, false).setAlwaysEdible()
				.setUnlocalizedName("emeraldApple").setCreativeTab(CCEmerald.creativeTab);

		ModItems.registerItem(coalApple);
		ModItems.registerItem(lapisApple);
		ModItems.registerItem(redstoneApple);
		ModItems.registerItem(quartzApple);
		ModItems.registerItem(glowstoneApple);
		ModItems.registerItem(emeraldApple);

		// Potions
		// emeraldPotion = new ModItemPotion("emeraldPotion");
		// emeraldPotionThrow = new ModItemSplashPotion("emeraldSplashPotion");
		//
		// ModItems.registerItem(emeraldPotion);
		// ModItems.registerItem(emeraldPotionThrow);
	}

	public static void registerItem(final Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
}
