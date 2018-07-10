package cc_emerald;

import cc_emerald.blocks.ModBlocks;
import cc_emerald.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void initCrafting() {
		// Emerald
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldHoe, 1, 0),
				new Object[] { "EE ", " S ", " S ", 'E', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldAxe, 1, 0),
				new Object[] { "EE ", "ES ", " S ", 'E', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldPickaxe, 1, 0),
				new Object[] { "EEE", " S ", " S ", 'E', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldShovel, 1, 0),
				new Object[] { "E", "S", "S", 'E', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldSword, 1, 0),
				new Object[] { "E", "E", "S", 'E', Items.emerald, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldStaff, 1, 0),
				new Object[] { "  E", " S ", "S  ", 'E', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldKatana, 1, 0),
				new Object[] { "  E", " E ", "S  ", 'E', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldKhopesh, 1, 0),
				new Object[] { "  E", "  E", "SE ", 'E', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldBattleaxe, 1, 0),
				new Object[] { "EEE", "ESE", " S ", 'E', Items.emerald, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldBigSword, 1, 0),
				new Object[] { " EE", "EEE", "SE ", 'E', Items.emerald, 'S', Items.stick });

		// Coal
		GameRegistry.addRecipe(new ItemStack(ModItems.coalHoe, 1, 0),
				new Object[] { "EE ", " S ", " S ", 'E', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalAxe, 1, 0),
				new Object[] { "EE ", "ES ", " S ", 'E', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalPickaxe, 1, 0),
				new Object[] { "EEE", " S ", " S ", 'E', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalShovel, 1, 0),
				new Object[] { "E", "S", "S", 'E', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalSword, 1, 0),
				new Object[] { "E", "E", "S", 'E', Items.coal, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.coalStaff, 1, 0),
				new Object[] { "  E", " S ", "S  ", 'E', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalKatana, 1, 0),
				new Object[] { "  E", " E ", "S  ", 'E', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalKhopesh, 1, 0),
				new Object[] { "  E", "  E", "SE ", 'E', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalBattleaxe, 1, 0),
				new Object[] { "EEE", "ESE", " S ", 'E', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalBigSword, 1, 0),
				new Object[] { " EE", "EEE", "SE ", 'E', Items.coal, 'S', Items.stick });

		// Glowstone
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneHoe, 1, 0),
				new Object[] { "EE ", " S ", " S ", 'E', Items.glowstone_dust, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneAxe, 1, 0),
				new Object[] { "EE ", "ES ", " S ", 'E', Items.glowstone_dust, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstonePickaxe, 1, 0),
				new Object[] { "EEE", " S ", " S ", 'E', Items.glowstone_dust, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneShovel, 1, 0),
				new Object[] { "E", "S", "S", 'E', Items.glowstone_dust, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneSword, 1, 0),
				new Object[] { "E", "E", "S", 'E', Items.glowstone_dust, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneStaff, 1, 0),
				new Object[] { "  E", " S ", "S  ", 'E', Items.glowstone_dust, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneKatana, 1, 0),
				new Object[] { "  E", " E ", "S  ", 'E', Items.glowstone_dust, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneKhopesh, 1, 0),
				new Object[] { "  E", "  E", "SE ", 'E', Items.glowstone_dust, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneBattleaxe, 1, 0),
				new Object[] { "EEE", "ESE", " S ", 'E', Items.glowstone_dust, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneBigSword, 1, 0),
				new Object[] { " EE", "EEE", "SE ", 'E', Items.glowstone_dust, 'S', Items.stick });

		// Redstone
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneHoe, 1, 0),
				new Object[] { "EE ", " S ", " S ", 'E', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneAxe, 1, 0),
				new Object[] { "EE ", "ES ", " S ", 'E', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstonePickaxe, 1, 0),
				new Object[] { "EEE", " S ", " S ", 'E', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneShovel, 1, 0),
				new Object[] { "E", "S", "S", 'E', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneSword, 1, 0),
				new Object[] { "E", "E", "S", 'E', Items.redstone, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneStaff, 1, 0),
				new Object[] { "  E", " S ", "S  ", 'E', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneKatana, 1, 0),
				new Object[] { "  E", " E ", "S  ", 'E', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneKhopesh, 1, 0),
				new Object[] { "  E", "  E", "SE ", 'E', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneBattleaxe, 1, 0),
				new Object[] { "EEE", "ESE", " S ", 'E', Items.redstone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneBigSword, 1, 0),
				new Object[] { " EE", "EEE", "SE ", 'E', Items.redstone, 'S', Items.stick });

		// Quartz
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzHoe, 1, 0),
				new Object[] { "EE ", " S ", " S ", 'E', Items.quartz, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzAxe, 1, 0),
				new Object[] { "EE ", "ES ", " S ", 'E', Items.quartz, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzPickaxe, 1, 0),
				new Object[] { "EEE", " S ", " S ", 'E', Items.quartz, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzShovel, 1, 0),
				new Object[] { "E", "S", "S", 'E', Items.quartz, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzSword, 1, 0),
				new Object[] { "E", "E", "S", 'E', Items.quartz, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.quartzStaff, 1, 0),
				new Object[] { "  E", " S ", "S  ", 'E', Items.quartz, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzKatana, 1, 0),
				new Object[] { "  E", " E ", "S  ", 'E', Items.quartz, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzKhopesh, 1, 0),
				new Object[] { "  E", "  E", "SE ", 'E', Items.quartz, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzBattleaxe, 1, 0),
				new Object[] { "EEE", "ESE", " S ", 'E', Items.quartz, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzBigSword, 1, 0),
				new Object[] { " EE", "EEE", "SE ", 'E', Items.quartz, 'S', Items.stick });

		// Lapis
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisHoe, 1, 0),
				new Object[] { "EE ", " S ", " S ", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisAxe, 1, 0),
				new Object[] { "EE ", "ES ", " S ", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisPickaxe, 1, 0),
				new Object[] { "EEE", " S ", " S ", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisShovel, 1, 0),
				new Object[] { "E", "S", "S", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisSword, 1, 0),
				new Object[] { "E", "E", "S", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.lapisStaff, 1, 0),
				new Object[] { "  E", " S ", "S  ", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisKatana, 1, 0),
				new Object[] { "  E", " E ", "S  ", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisKhopesh, 1, 0),
				new Object[] { "  E", "  E", "SE ", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisBattleaxe, 1, 0),
				new Object[] { "EEE", "ESE", " S ", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisBigSword, 1, 0),
				new Object[] { " EE", "EEE", "SE ", 'E', new ItemStack(Items.dye, 1, 4), 'S', Items.stick });

		// Wood
		GameRegistry.addRecipe(new ItemStack(ModItems.woodStaff, 1, 0),
				new Object[] { "  W", " S ", "S  ", 'W', Blocks.planks, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.woodKatana, 1, 0),
				new Object[] { "  W", " W ", "S  ", 'W', Blocks.planks, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.woodKhopesh, 1, 0),
				new Object[] { "  W", "  W", "SW ", 'W', Blocks.planks, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.woodBattleaxe, 1, 0),
				new Object[] { "WWW", "WSW", " S ", 'W', Blocks.planks, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.woodBigSword, 1, 0),
				new Object[] { " WW", "WWW", "SW ", 'W', Blocks.planks, 'S', Items.stick });

		// Stone
		GameRegistry.addRecipe(new ItemStack(ModItems.stoneStaff, 1, 0),
				new Object[] { "  C", " S ", "S  ", 'C', Blocks.cobblestone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stoneKatana, 1, 0),
				new Object[] { "  C", " C ", "S  ", 'C', Blocks.cobblestone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stoneKhopesh, 1, 0),
				new Object[] { "  C", "  C", "SC ", 'C', Blocks.cobblestone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stoneBattleaxe, 1, 0),
				new Object[] { "CCC", "CSC", " S ", 'C', Blocks.cobblestone, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stoneBigSword, 1, 0),
				new Object[] { " CC", "CCC", "SC ", 'C', Blocks.cobblestone, 'S', Items.stick });

		// Iron
		GameRegistry.addRecipe(new ItemStack(ModItems.ironStaff, 1, 0),
				new Object[] { "  I", " S ", "S  ", 'I', Items.iron_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.ironKatana, 1, 0),
				new Object[] { "  I", " I ", "S  ", 'I', Items.iron_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.ironKhopesh, 1, 0),
				new Object[] { "  I", "  I", "SI ", 'I', Items.iron_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.ironBattleaxe, 1, 0),
				new Object[] { "III", "ISI", " S ", 'I', Items.iron_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.ironBigSword, 1, 0),
				new Object[] { " II", "III", "SI ", 'I', Items.iron_ingot, 'S', Items.stick });

		// Diamond
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondStaff, 1, 0),
				new Object[] { "  D", " S ", "S  ", 'D', Items.diamond, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondKatana, 1, 0),
				new Object[] { "  D", " D ", "S  ", 'D', Items.diamond, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondKhopesh, 1, 0),
				new Object[] { "  D", "  D", "SD ", 'D', Items.diamond, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondBattleaxe, 1, 0),
				new Object[] { "DDD", "DSD", " S ", 'D', Items.diamond, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondBigSword, 1, 0),
				new Object[] { " DD", "DDD", "SD ", 'D', Items.diamond, 'S', Items.stick });

		// Gold
		GameRegistry.addRecipe(new ItemStack(ModItems.goldStaff, 1, 0),
				new Object[] { "  G", " S ", "S  ", 'G', Items.gold_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.goldKatana, 1, 0),
				new Object[] { "  G", " G ", "S  ", 'G', Items.gold_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.goldKhopesh, 1, 0),
				new Object[] { "  G", "  G", "SG ", 'G', Items.gold_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.goldBattleaxe, 1, 0),
				new Object[] { "GGG", "GSG", " S ", 'G', Items.gold_ingot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.goldBigSword, 1, 0),
				new Object[] { " GG", "GGG", "SG ", 'G', Items.gold_ingot, 'S', Items.stick });

		// Emerald
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldHelmet, 1, 0),
				new Object[] { "EEE", "E E", 'E', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldChestplate, 1, 0),
				new Object[] { "E E", "EEE", "EEE", 'E', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldLeggings, 1, 0),
				new Object[] { "EEE", "E E", "E E", 'E', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldBoots, 1, 0),
				new Object[] { "E E", "E E", 'E', Items.emerald });

		// Coal
		GameRegistry.addRecipe(new ItemStack(ModItems.coalHelmet, 1, 0),
				new Object[] { "EEE", "E E", 'E', Items.coal });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalChestplate, 1, 0),
				new Object[] { "E E", "EEE", "EEE", 'E', Items.coal });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalLeggings, 1, 0),
				new Object[] { "EEE", "E E", "E E", 'E', Items.coal });
		GameRegistry.addRecipe(new ItemStack(ModItems.coalBoots, 1, 0), new Object[] { "E E", "E E", 'E', Items.coal });

		// Glowstone
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneHelmet, 1, 0),
				new Object[] { "EEE", "E E", 'E', Items.glowstone_dust });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneChestplate, 1, 0),
				new Object[] { "E E", "EEE", "EEE", 'E', Items.glowstone_dust });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneLeggings, 1, 0),
				new Object[] { "EEE", "E E", "E E", 'E', Items.glowstone_dust });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneBoots, 1, 0),
				new Object[] { "E E", "E E", 'E', Items.glowstone_dust });

		// Redstone
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneHelmet, 1, 0),
				new Object[] { "EEE", "E E", 'E', Items.redstone });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneChestplate, 1, 0),
				new Object[] { "E E", "EEE", "EEE", 'E', Items.redstone });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneLeggings, 1, 0),
				new Object[] { "EEE", "E E", "E E", 'E', Items.redstone });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneBoots, 1, 0),
				new Object[] { "E E", "E E", 'E', Items.redstone });

		// Quartz
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzHelmet, 1, 0),
				new Object[] { "EEE", "E E", 'E', Items.quartz });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzChestplate, 1, 0),
				new Object[] { "E E", "EEE", "EEE", 'E', Items.quartz });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzLeggings, 1, 0),
				new Object[] { "EEE", "E E", "E E", 'E', Items.quartz });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzBoots, 1, 0),
				new Object[] { "E E", "E E", 'E', Items.quartz });

		// Lapis
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisHelmet, 1, 0),
				new Object[] { "EEE", "E E", 'E', new ItemStack(Items.dye, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisChestplate, 1, 0),
				new Object[] { "E E", "EEE", "EEE", 'E', new ItemStack(Items.dye, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisLeggings, 1, 0),
				new Object[] { "EEE", "E E", "E E", 'E', new ItemStack(Items.dye, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisBoots, 1, 0),
				new Object[] { "E E", "E E", 'E', new ItemStack(Items.dye, 1, 4) });

		// Bows
		GameRegistry.addRecipe(new ItemStack(ModItems.coalBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Items.coal });
		GameRegistry.addRecipe(new ItemStack(ModItems.stoneBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Blocks.cobblestone });
		GameRegistry.addRecipe(new ItemStack(ModItems.lapisBow, 1, 0), new Object[] { " IS", "IES", " IS", 'I',
				Items.stick, 'S', Items.string, 'E', new ItemStack(Items.dye, 1, 4) });
		GameRegistry.addRecipe(new ItemStack(ModItems.ironBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(ModItems.redstoneBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Items.redstone });
		GameRegistry.addRecipe(new ItemStack(ModItems.goldBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Items.gold_ingot });
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Items.diamond });
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Items.quartz });
		GameRegistry.addRecipe(new ItemStack(ModItems.glowstoneBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Items.glowstone_dust });
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', Items.emerald });

		// Apples
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coalApple, 1), new Object[] { Items.coal, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.redstoneApple, 1),
				new Object[] { Items.redstone, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.glowstoneApple, 1),
				new Object[] { Items.glowstone_dust, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.quartzApple, 1),
				new Object[] { Items.quartz, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lapisApple, 1),
				new Object[] { new ItemStack(Items.dye, 1, 4), Items.apple });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.emeraldApple, 1, 0),
				new Object[] { Items.emerald, Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.emeraldApple, 1, 1),
				new Object[] { ModItems.emeraldApple, Items.emerald, Items.quartz, Items.redstone });

		// Seeds
		if (Config.enableEmeraldSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.emeraldSeeds, 1), new Object[] { Items.emerald });
		}
		if (Config.enableIronSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironSeeds, 1), new Object[] { Items.iron_ingot });
		}
		if (Config.enableGoldSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.goldSeeds, 1), new Object[] { Items.gold_nugget });
		}
		if (Config.enableDiamondSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamondSeeds, 1), new Object[] { Items.diamond });
		}
		if (Config.enableCoalSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.coalSeeds, 1), new Object[] { Items.coal });
		}
		if (Config.enableRedstoneSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.redstoneSeeds, 1), new Object[] { Items.redstone });
		}
		if (Config.enableGlowstoneSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.glowstoneSeeds, 1),
					new Object[] { Items.glowstone_dust });
		}
		if (Config.enableQuartzSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.quartzSeeds, 1), new Object[] { Items.quartz });
		}
		if (Config.enableLapisSeedsRecipes) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lapisSeeds, 1),
					new Object[] { new ItemStack(Items.dye, 1, 4) });
		}

		// Items
		// GameRegistry.addRecipe(new ItemStack(ModItems.emeraldRod, 1, 0), new
		// Object[] { "E", "E", 'E', Items.emerald });
		// GameRegistry.addRecipe(new ItemStack(ModItems.emeraldDust, 1), new
		// Object[] { "EE", 'E', Items.emerald });
		// GameRegistry.addShapelessRecipe(new ItemStack(ModItems.emeraldBone,
		// 1),
		// new Object[] { Items.emerald, Items.bone });
		// GameRegistry.addRecipe(new ItemStack(ModItems.flintAndEmerald, 1),
		// new Object[] { "E ", " F", 'E', Items.emerald, 'F', Items.flint });

		// Blocks
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.emeraldObsidian, 1),
				new Object[] { Items.emerald, Blocks.obsidian });

		GameRegistry.addRecipe(new ItemStack(ModItems.doorItem, 1),
				new Object[] { "EE", "EE", "EE", 'E', Items.emerald });
		GameRegistry.addRecipe(new ItemStack(ModItems.doorItemObsidian, 1),
				new Object[] { "OO", "OO", "OO", 'O', ModBlocks.emeraldObsidian });

		// GameRegistry.addRecipe(new ItemStack(ModBlocks.emeraldStairs, 4),
		// new Object[] { "E ", "EE ", "EEE", 'E', Items.emerald });
		//
		// GameRegistry.addRecipe(new ItemStack(ModBlocks.emeraldTnt, 1),
		// new Object[] { "GEG", "EGE", "GEG", 'E', Items.emerald, 'G',
		// Items.gunpowder });

		// Potion
		// GameRegistry.addShapelessRecipe(new ItemStack(ModItems.emeraldPotion,
		// 1),
		// new Object[] { Items.emerald, Items.glass_bottle,
		// ModItems.emeraldDust, ModItems.emeraldRod,
		// ModItems.emeraldBone, ModItems.emeraldApple, Items.golden_apple });
		// GameRegistry.addShapelessRecipe(new
		// ItemStack(ModItems.emeraldPotionThrow, 1),
		// new Object[] { Items.gunpowder, ModItems.emeraldPotion });

		// Blocks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.glowstoneBlock, 1),
				new Object[] { "EEE", "EEE", "EEE", 'E', Items.glowstone_dust });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 9),
				new Object[] { ModBlocks.glowstoneBlock });

		GameRegistry.addRecipe(new ItemStack(ModBlocks.quartzBlock, 1),
				new Object[] { "EEE", "EEE", "EEE", 'E', Items.quartz });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 9), new Object[] { ModBlocks.quartzBlock });

		// Torches
		GameRegistry.addRecipe(new ItemStack(ModBlocks.emeraldTorch, 4),
				new Object[] { "EC", " S", 'E', Items.emerald, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.emeraldTorch, 4),
				new Object[] { "CE", "S ", 'E', Items.emerald, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diamondTorch, 4),
				new Object[] { "EC", " S", 'E', Items.diamond, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.diamondTorch, 4),
				new Object[] { "CE", "S ", 'E', Items.diamond, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.redstoneTorch, 4),
				new Object[] { "EC", " S", 'E', Items.redstone, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.redstoneTorch, 4),
				new Object[] { "CE", "S ", 'E', Items.redstone, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.glowstoneTorch, 4),
				new Object[] { "EC", " S", 'E', Items.glowstone_dust, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.glowstoneTorch, 4),
				new Object[] { "CE", "S ", 'E', Items.glowstone_dust, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.quartzTorch, 4),
				new Object[] { "EC", " S", 'E', Items.quartz, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.quartzTorch, 4),
				new Object[] { "CE", "S ", 'E', Items.quartz, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lapisTorch, 4),
				new Object[] { "EC", " S", 'E', new ItemStack(Items.dye, 1, 4), 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lapisTorch, 4),
				new Object[] { "CE", "S ", 'E', new ItemStack(Items.dye, 1, 4), 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coalTorch, 4),
				new Object[] { "EC", " S", 'E', Items.coal, 'C', Items.coal, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coalTorch, 4),
				new Object[] { "CE", "S ", 'E', Items.coal, 'C', Items.coal, 'S', Items.stick });

		// Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.emeraldLamp, 1),
				new Object[] { Items.emerald, Blocks.glowstone });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.diamondLamp, 1),
				new Object[] { Items.diamond, Blocks.glowstone });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.redstoneLamp, 1),
				new Object[] { Items.redstone, Blocks.glowstone });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.glowstoneLamp, 1),
				new Object[] { Items.glowstone_dust, Blocks.glowstone });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quartzLamp, 1),
				new Object[] { Items.quartz, Blocks.glowstone });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.lapisLamp, 1),
				new Object[] { new ItemStack(Items.dye, 1, 4), Blocks.glowstone });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.coalLamp, 1),
				new Object[] { Items.coal, Blocks.glowstone });

		// Redstone Lamp
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.emeraldRedstoneLamp, 1),
				new Object[] { Items.emerald, Blocks.redstone_lamp });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.diamondRedstoneLamp, 1),
				new Object[] { Items.diamond, Blocks.redstone_lamp });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.redstoneRedstoneLamp, 1),
				new Object[] { Items.redstone, Blocks.redstone_lamp });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.glowstoneRedstoneLamp, 1),
				new Object[] { Items.glowstone_dust, Blocks.redstone_lamp });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.quartzRedstoneLamp, 1),
				new Object[] { Items.quartz, Blocks.redstone_lamp });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.lapisRedstoneLamp, 1),
				new Object[] { new ItemStack(Items.dye, 1, 4), Blocks.redstone_lamp });
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.coalRedstoneLamp, 1),
				new Object[] { Items.coal, Blocks.redstone_lamp });
	}
}
