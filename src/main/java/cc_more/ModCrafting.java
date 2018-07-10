package cc_more;

import cc_more.blocks.ModBlocks;
import cc_more.items.ModItems;
import cc_more.world.MinersDimension;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void main() {
		// Igniter
		GameRegistry.addRecipe(new ItemStack(MinersDimension.portalIgniter, 1),
				new Object[] { " D ", "IFI", 'D', Items.diamond, 'F', Items.flint_and_steel, 'I', Items.iron_ingot });

		// Ore
		GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.tinOre, new ItemStack(ModItems.tinIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.bauxiteOre, new ItemStack(ModItems.bauxiteIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.chromeOre, new ItemStack(ModItems.chromeIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack(ModItems.silverIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.leadOre, new ItemStack(ModItems.leadIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.rubyOre, new ItemStack(ModItems.rubyGem, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.sapphireOre, new ItemStack(ModItems.sapphireGem, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.stainlessOre, new ItemStack(ModItems.stainlessIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.fluoriteOre, new ItemStack(ModItems.fluoriteIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.titaniumOre, new ItemStack(ModItems.titaniumIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.jadeOre, new ItemStack(ModItems.jadeGem, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.uraniumOre, new ItemStack(ModItems.uraniumIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.amethystOre, new ItemStack(ModItems.amethystIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.platinumOre, new ItemStack(ModItems.platinumIngot, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.meteoriteOre, new ItemStack(ModItems.meteorite, 1), 1.0F);

		// Block
		GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.copperIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tinBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.tinIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.bronzeBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.bronzeIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.bauxiteBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.bauxiteIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.chromeBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.chromeIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.silverBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.silverIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.leadBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.leadIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rubyBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.rubyGem });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sapphireBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.sapphireGem });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stainlessBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.stainlessIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.fluoriteBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.fluoriteIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.titaniumBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.titaniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.jadeBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.jadeGem });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.uraniumBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.uraniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.amethystBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.amethystIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.platinumBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.platinumIngot });
		GameRegistry.addRecipe(new ItemStack(ModBlocks.meteoriteBlock, 1),
				new Object[] { "XXX", "XXX", "XXX", 'X', ModItems.meteorite });

		// Ingot
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bronzeIngot, 1),
				new Object[] { ModItems.tinIngot, ModItems.copperIngot });

		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperIngot, 9), new Object[] { ModBlocks.copperBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinIngot, 9), new Object[] { ModBlocks.tinBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bronzeIngot, 9), new Object[] { ModBlocks.bronzeBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bauxiteIngot, 9),
				new Object[] { ModBlocks.bauxiteBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chromeIngot, 9), new Object[] { ModBlocks.chromeBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silverIngot, 9), new Object[] { ModBlocks.silverBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.leadIngot, 9), new Object[] { ModBlocks.leadBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rubyGem, 9), new Object[] { ModBlocks.rubyBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sapphireGem, 9),
				new Object[] { ModBlocks.sapphireBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stainlessIngot, 9),
				new Object[] { ModBlocks.stainlessBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.amethystIngot, 9),
				new Object[] { ModBlocks.amethystBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.titaniumIngot, 9),
				new Object[] { ModBlocks.titaniumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.jadeGem, 9), new Object[] { ModBlocks.jadeBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uraniumIngot, 9),
				new Object[] { ModBlocks.uraniumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fluoriteIngot, 9),
				new Object[] { ModBlocks.fluoriteBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.platinumIngot, 9),
				new Object[] { ModBlocks.platinumBlock });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.meteorite, 9),
				new Object[] { ModBlocks.meteoriteBlock });

		// Copper
		GameRegistry.addRecipe(new ItemStack(ModItems.copperHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.copperIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.copperIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.copperIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.copperIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.copperHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.copperIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.copperIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.copperIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.copperIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.copperIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.copperStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.copperIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.copperIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.copperIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.copperIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.copperBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.copperIngot, 'S', Items.stick });

		// Tin
		GameRegistry.addRecipe(new ItemStack(ModItems.tinHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.tinIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.tinIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.tinIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.tinIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.tinHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.tinIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.tinIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.tinIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.tinIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.tinIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.tinStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.tinIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.tinIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.tinIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.tinIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.tinIngot, 'S', Items.stick });

		// Bronze
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.bronzeIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.bronzeIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.bronzeIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.bronzeIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.bronzeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.bronzeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzePickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.bronzeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.bronzeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.bronzeIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.bronzeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.bronzeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.bronzeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.bronzeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.bronzeIngot, 'S', Items.stick });

		// Bauxite
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.bauxiteIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.bauxiteIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.bauxiteIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.bauxiteIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.bauxiteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.bauxiteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxitePickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.bauxiteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.bauxiteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.bauxiteIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.bauxiteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.bauxiteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.bauxiteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.bauxiteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.bauxiteIngot, 'S', Items.stick });

		// Chrome
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.chromeIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.chromeIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.chromeIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.chromeIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.chromeHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.chromeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.chromeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromePickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.chromeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.chromeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.chromeIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.chromeStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.chromeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.chromeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.chromeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.chromeIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.chromeIngot, 'S', Items.stick });

		// Silver
		GameRegistry.addRecipe(new ItemStack(ModItems.silverHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.silverIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.silverIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.silverIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.silverIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.silverHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.silverIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.silverIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.silverIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.silverIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.silverIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.silverStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.silverIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.silverIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.silverIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.silverIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.silverIngot, 'S', Items.stick });

		// Lead
		GameRegistry.addRecipe(new ItemStack(ModItems.leadHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.leadIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.leadIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.leadIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.leadIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.leadHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.leadIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.leadIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.leadIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.leadIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.leadIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.leadStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.leadIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.leadIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.leadIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.leadIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.leadIngot, 'S', Items.stick });

		// Ruby
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.rubyGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.rubyGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.rubyGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.rubyGem });

		GameRegistry.addRecipe(new ItemStack(ModItems.rubyHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.rubyGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.rubyGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.rubyGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.rubyGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubySword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.rubyGem, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.rubyStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.rubyGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.rubyGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.rubyGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.rubyGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.rubyGem, 'S', Items.stick });

		// Sapphire
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.sapphireGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.sapphireGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.sapphireGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.sapphireGem });

		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.sapphireGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.sapphireGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphirePickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.sapphireGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.sapphireGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.sapphireGem, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.sapphireGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.sapphireGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.sapphireGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.sapphireGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.sapphireGem, 'S', Items.stick });

		// Stainless
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.stainlessIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.stainlessIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.stainlessIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.stainlessIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.stainlessIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.stainlessIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.stainlessIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.stainlessIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.stainlessIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.stainlessIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.stainlessIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.stainlessIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.stainlessIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.stainlessIngot, 'S', Items.stick });

		// Fluorite
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.fluoriteIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.fluoriteIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.fluoriteIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.fluoriteIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.fluoriteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.fluoriteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoritePickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.fluoriteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.fluoriteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.fluoriteIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.fluoriteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.fluoriteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.fluoriteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.fluoriteIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.fluoriteIngot, 'S', Items.stick });

		// Titanium
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.titaniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.titaniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.titaniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.titaniumIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.titaniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.titaniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.titaniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.titaniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.titaniumIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.titaniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.titaniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.titaniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.titaniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.titaniumIngot, 'S', Items.stick });

		// Jade
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.jadeGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.jadeGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.jadeGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.jadeGem });

		GameRegistry.addRecipe(new ItemStack(ModItems.jadeHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.jadeGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.jadeGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadePickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.jadeGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.jadeGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.jadeGem, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.jadeStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.jadeGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.jadeGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.jadeGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.jadeGem, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.jadeGem, 'S', Items.stick });

		// Uranium
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.uraniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.uraniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.uraniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.uraniumIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.uraniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.uraniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.uraniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.uraniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.uraniumIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.uraniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.uraniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.uraniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.uraniumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.uraniumIngot, 'S', Items.stick });

		// Amethyst
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.amethystIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.amethystIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.amethystIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.amethystIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.amethystHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.amethystIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.amethystIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.amethystIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.amethystIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.amethystIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.amethystStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.amethystIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.amethystIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.amethystIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.amethystIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.amethystIngot, 'S', Items.stick });

		// Platinum
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.platinumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.platinumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.platinumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.platinumIngot });

		GameRegistry.addRecipe(new ItemStack(ModItems.platinumHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.platinumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.platinumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumPickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.platinumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.platinumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.platinumIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.platinumStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.platinumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.platinumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.platinumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.platinumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.platinumIngot, 'S', Items.stick });

		// Meteorite
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteHelmet, 1, 0),
				new Object[] { "MMM", "M M", 'M', ModItems.meteorite });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteChestplate, 1, 0),
				new Object[] { "M M", "MMM", "MMM", 'M', ModItems.meteorite });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteLeggings, 1, 0),
				new Object[] { "MMM", "M M", "M M", 'M', ModItems.meteorite });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteBoots, 1, 0),
				new Object[] { "M M", "M M", 'M', ModItems.meteorite });

		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteHoe, 1, 0),
				new Object[] { "MM ", " S ", " S ", 'M', ModItems.meteorite, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteAxe, 1, 0),
				new Object[] { "MM ", "MS ", " S ", 'M', ModItems.meteorite, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoritePickaxe, 1, 0),
				new Object[] { "MMM", " S ", " S ", 'M', ModItems.meteorite, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteShovel, 1, 0),
				new Object[] { "M", "S", "S", 'M', ModItems.meteorite, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteSword, 1, 0),
				new Object[] { "M", "M", "S", 'M', ModItems.meteorite, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteStaff, 1, 0),
				new Object[] { "  M", " S ", "S  ", 'M', ModItems.meteorite, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteBattleaxe, 1, 0),
				new Object[] { "MMM", "MSM", " S ", 'M', ModItems.meteorite, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteKhopesh, 1, 0),
				new Object[] { " M ", "  M", " S ", 'M', ModItems.meteorite, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteKatana, 1, 0),
				new Object[] { "  M", " M ", "S  ", 'M', ModItems.meteorite, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteBigSword, 1, 0),
				new Object[] { " MM", "MMM", "SM ", 'M', ModItems.meteorite, 'S', Items.stick });

		// Bow
		GameRegistry.addRecipe(new ItemStack(ModItems.copperBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.copperIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.tinBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.tinIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.bronzeBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.bronzeIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.bauxiteBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.bauxiteIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.chromeBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.chromeIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.silverBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.silverIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.leadBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.leadIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.rubyGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.sapphireGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.stainlessBow, 1, 0), new Object[] { " IS", "IES", " IS", 'I',
				Items.stick, 'S', Items.string, 'E', ModItems.stainlessIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.fluoriteBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.fluoriteIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.titaniumBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.titaniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.jadeBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.jadeGem });
		GameRegistry.addRecipe(new ItemStack(ModItems.uraniumBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.uraniumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.amethystIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.platinumBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.platinumIngot });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoriteBow, 1, 0),
				new Object[] { " IS", "IES", " IS", 'I', Items.stick, 'S', Items.string, 'E', ModItems.meteorite });

		// Items
		GameRegistry.addRecipe(new ItemStack(ModItems.minersDream, 1, 0), new Object[] { "TGT", "RPR", "SGS", 'T',
				Blocks.torch, 'G', Items.gunpowder, 'R', Items.redstone, 'P', Items.paper, 'S', Blocks.stone });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.minersShaft, 1),
				new Object[] { ModItems.minersDream, ModItems.minersDream });
	}
}
