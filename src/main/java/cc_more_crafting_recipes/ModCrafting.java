package cc_more_crafting_recipes;

import cc_more_crafting_recipes.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void main() {
		// Misc Items
		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				new Object[] { "aaa", "aba", 'a', Items.leather, 'b', Items.string });

		GameRegistry.addRecipe(new ItemStack(Items.experience_bottle, 8),
				new Object[] { "aaa", "aba", "aaa", 'a', Items.glass_bottle, 'b', Items.book });

		GameRegistry.addRecipe(new ItemStack(Blocks.dragon_egg),
				new Object[] { "aba", "bab", "aba", 'a', Blocks.obsidian, 'b', new ItemStack(Items.ender_eye) });

		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 0),
				new Object[] { "aaa", "aba", "aaa", 'a', Items.bone, 'b', new ItemStack(Blocks.wool, 1, 8) });

		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 1),
				new Object[] { "aaa", "aba", "aaa", 'a', Items.coal, 'b', new ItemStack(Blocks.wool, 1, 15) });

		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 2),
				new Object[] { "aaa", "aba", "aaa", 'a', Items.rotten_flesh, 'b', new ItemStack(Blocks.wool, 1, 13) });

		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 3),
				new Object[] { "aaa", "aba", "aaa", 'a', Items.iron_ingot, 'b', new ItemStack(Blocks.wool, 1, 12) });

		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 4),
				new Object[] { "aaa", "aba", "aaa", 'a', Items.gunpowder, 'b', new ItemStack(Blocks.wool, 1, 5) });

		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor),
				new Object[] { " ba", "aab", "aa ", 'a', Items.iron_ingot, 'b', Items.string });

		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor),
				new Object[] { " ba", "aab", "aa ", 'a', Items.gold_ingot, 'b', Items.string });

		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor),
				new Object[] { " ba", "aab", "aa ", 'a', Items.diamond, 'b', Items.string });

		GameRegistry.addRecipe(new ItemStack(Items.name_tag),
				new Object[] { "a", "b", "b", 'a', Items.string, 'b', Items.paper });

		// Record
		GameRegistry.addRecipe(new ItemStack(Items.record_13),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 11) });

		GameRegistry.addRecipe(new ItemStack(Items.record_cat),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.stone, 'b', new ItemStack(Items.dye, 1, 10) });

		// Blocks
		GameRegistry.addRecipe(new ItemStack(Blocks.grass),
				new Object[] { "a", "b", 'a', Items.wheat_seeds, 'b', Blocks.dirt });

		GameRegistry.addRecipe(new ItemStack(Blocks.dirt, 8, 2),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.dirt, 'b', Items.water_bucket });

		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 2), new Object[] { "aa", "aa", 'a', Items.stick });

		GameRegistry.addRecipe(new ItemStack(Blocks.sand, 8, 1),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.sand, 'b', new ItemStack(Items.dye, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(Blocks.ice, 8),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.snow, 'b', Items.water_bucket });

		GameRegistry.addRecipe(new ItemStack(Blocks.packed_ice, 4), new Object[] { "aa", "aa", 'a', Blocks.ice });

		GameRegistry.addRecipe(new ItemStack(Blocks.end_stone, 8),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.sandstone, 'b', Items.ender_pearl });

		GameRegistry.addRecipe(new ItemStack(Blocks.end_portal_frame),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.end_stone, 'b', Items.ender_pearl });

		GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone, 8),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.cobblestone, 'b', Blocks.vine });

		GameRegistry.addRecipe(new ItemStack(Blocks.mycelium),
				new Object[] { "a", "b", 'a', Blocks.red_mushroom, 'b', Blocks.dirt });

		GameRegistry.addRecipe(new ItemStack(Blocks.mycelium),
				new Object[] { "a", "b", 'a', Blocks.brown_mushroom, 'b', Blocks.dirt });

		GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 8, 1),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.stonebrick, 'b', Blocks.vine });

		GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 8, 2),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.stonebrick, 'b', Items.flint });

		GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 4, 3),
				new Object[] { "aa", "aa", 'a', Blocks.stonebrick });

		GameRegistry.addRecipe(new ItemStack(Blocks.sponge, 8),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.wool, 'b', Items.water_bucket });

		GameRegistry.addRecipe(new ItemStack(Blocks.web, 5), new Object[] { "a a", " a ", "a a", 'a', Items.string });

		GameRegistry.addRecipe(new ItemStack(Blocks.netherrack, 8),
				new Object[] { "aaa", "aba", "aaa", 'a', Blocks.cobblestone, 'b', Items.flint_and_steel });

		GameRegistry.addRecipe(new ItemStack(Blocks.soul_sand, 8),
				new Object[] { "aaa", "aba", "aaa", 'a', new ItemStack(Blocks.sand), 'b', Blocks.web });

		GameRegistry.addRecipe(new ItemStack(Blocks.command_block), new Object[] { "aba", "bcb", "aba", 'a',
				Items.diamond, 'b', Blocks.crafting_table, 'c', Blocks.redstone_block });

		GameRegistry.addRecipe(new ItemStack(Blocks.vine, 6), new Object[] { "aa", "aa", "aa", 'a', Blocks.leaves });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian),
				new Object[] { Items.lava_bucket, Items.water_bucket });

		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[] { "aa", "aa", 'a', Blocks.netherrack });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.lava_bucket),
				new Object[] { Blocks.obsidian, Items.bucket });

		GameRegistry.addRecipe(new ItemStack(Blocks.dirt, 9),
				new Object[] { "aaa", "aaa", "aaa", 'a', Blocks.cobblestone });

		GameRegistry.addRecipe(new ItemStack(Blocks.clay), new Object[] { "a  ", "   ", "   ", 'a', Blocks.dirt });

		GameRegistry.addRecipe(new ItemStack(Blocks.gravel), new Object[] { " a ", "   ", "   ", 'a', Blocks.dirt });

		GameRegistry.addRecipe(new ItemStack(Blocks.sand), new Object[] { "   ", "a  ", "   ", 'a', Blocks.dirt });

		GameRegistry.addRecipe(new ItemStack(Blocks.snow), new Object[] { "   ", " a ", "   ", 'a', Blocks.dirt });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cactus),
				new Object[] { Blocks.sand, new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 11) });

		GameRegistry.addRecipe(new ItemStack(Blocks.leaves, 1, 0), new Object[] { "aa", "aa", 'a', Blocks.tallgrass });

		GameRegistry.addRecipe(new ItemStack(Items.reeds),
				new Object[] { "ws", 'w', Items.water_bucket, 's', Blocks.sand });

		// Trees
		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 1, 0),
				new Object[] { "a", "b", 'a', new ItemStack(Blocks.leaves, 1, 0), 'b', Items.stick });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 1, 1),
				new Object[] { "a", "b", 'a', new ItemStack(Blocks.leaves, 1, 1), 'b', Items.stick });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 1, 2),
				new Object[] { "a", "b", 'a', new ItemStack(Blocks.leaves, 1, 2), 'b', Items.stick });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 1, 3),
				new Object[] { "a", "b", 'a', new ItemStack(Blocks.leaves, 1, 3), 'b', Items.stick });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 1, 4),
				new Object[] { "a", "b", 'a', new ItemStack(Blocks.leaves2, 1, 0), 'b', Items.stick });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 1, 5),
				new Object[] { "a", "b", 'a', new ItemStack(Blocks.leaves2, 1, 1), 'b', Items.stick });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 6, 1),
				new Object[] { "aa", "aa", "aa", 'a', new ItemStack(Blocks.sapling, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 2, 2),
				new Object[] { "a", "a", 'a', new ItemStack(Blocks.sapling, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 3, 3),
				new Object[] { "a", "a", "a", 'a', new ItemStack(Blocks.sapling, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 4, 4),
				new Object[] { "aaa", " a ", 'a', new ItemStack(Blocks.sapling, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 4, 5),
				new Object[] { "aa", "aa", 'a', new ItemStack(Blocks.sapling, 1, 0) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 4, 0),
				new Object[] { "aa", "aa", 'a', new ItemStack(Blocks.sapling, 1, 1) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 4, 0),
				new Object[] { "aa", "aa", 'a', new ItemStack(Blocks.sapling, 1, 2) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 4, 0),
				new Object[] { "aa", "aa", 'a', new ItemStack(Blocks.sapling, 1, 3) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 4, 0),
				new Object[] { "aa", "aa", 'a', new ItemStack(Blocks.sapling, 1, 4) });

		GameRegistry.addRecipe(new ItemStack(Blocks.sapling, 4, 0),
				new Object[] { "aa", "aa", 'a', new ItemStack(Blocks.sapling, 1, 5) });

		// Items
		GameRegistry.addRecipe(new ItemStack(Items.flint), new Object[] { "a", 'a', Blocks.gravel });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.red_mushroom),
				new Object[] { Blocks.dirt, new ItemStack(Blocks.mycelium, 1, 0) });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.brown_mushroom),
				new Object[] { Blocks.dirt, new ItemStack(Blocks.dirt, 1, 2) });

		GameRegistry.addRecipe(new ItemStack(Blocks.waterlily, 4),
				new Object[] { "a a", "aaa", "aaa", 'a', Items.wheat_seeds });

		GameRegistry.addRecipe(new ItemStack(Items.string, 4), new Object[] { "a", 'a', Blocks.wool });

		GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 1);

		GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod),
				new Object[] { Items.stick, Blocks.netherrack });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.ghast_tear),
				new Object[] { Items.blaze_powder, new ItemStack(Items.dye, 1, 15) });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 3),
				new Object[] { Blocks.pumpkin, new ItemStack(Blocks.sapling, 1, 3) });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball, 4), new Object[] { Blocks.clay });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 5), new Object[] { Items.leather_helmet });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 8), new Object[] { Items.leather_chestplate });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 7), new Object[] { Items.leather_leggings });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 4), new Object[] { Items.leather_boots });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), new Object[] { Items.iron_helmet });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 8), new Object[] { Items.iron_chestplate });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 7), new Object[] { Items.iron_leggings });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 4), new Object[] { Items.iron_boots });

		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 5), new Object[] { Items.diamond_helmet });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 8), new Object[] { Items.diamond_chestplate });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 7), new Object[] { Items.diamond_leggings });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new Object[] { Items.diamond_boots });

		// Ore
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.coal_ore), new Object[] { Blocks.stone, Items.coal });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.iron_ore),
				new Object[] { Blocks.stone, Items.iron_ingot });

		GameRegistry.addRecipe(new ItemStack(Blocks.lapis_ore),
				new Object[] { "aaa", "aba", "aaa", 'a', new ItemStack(Items.dye, 1, 4), 'b', Blocks.stone });

		GameRegistry.addRecipe(new ItemStack(Blocks.redstone_ore),
				new Object[] { "aaa", "aba", "aaa", 'a', Items.redstone, 'b', Blocks.stone });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_ore),
				new Object[] { Blocks.stone, Items.gold_ingot });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_ore),
				new Object[] { Blocks.stone, Items.diamond });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.emerald_ore),
				new Object[] { Blocks.stone, Items.emerald });

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_ore),
				new Object[] { Blocks.netherrack, Items.quartz });

		// Armor
		GameRegistry.addRecipe(new ItemStack(Items.chainmail_helmet),
				new Object[] { "aaa", "a a", 'a', Items.flint_and_steel });

		GameRegistry.addRecipe(new ItemStack(Items.chainmail_chestplate),
				new Object[] { "a a", "aaa", "aaa", 'a', Items.flint_and_steel });

		GameRegistry.addRecipe(new ItemStack(Items.chainmail_leggings),
				new Object[] { "aaa", "a a", "a a", 'a', Items.flint_and_steel });

		GameRegistry.addRecipe(new ItemStack(Items.chainmail_boots),
				new Object[] { "a a", "a a", 'a', Items.flint_and_steel });

		// Spawners
		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 90),
				new Object[] { " a ", "aba", " a ", 'a', Items.porkchop, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 90), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 90), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 91),
				new Object[] { " a ", "aba", " a ", 'a', Blocks.wool, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 91), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 91), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 92),
				new Object[] { " c ", "aba", " c ", 'a', Items.beef, 'b', Items.egg, 'c', Items.leather });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 92), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 92), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 93),
				new Object[] { " c ", "aba", " c ", 'a', Items.chicken, 'b', Items.egg, 'c', Items.feather });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 93), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 93), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 94),
				new Object[] { " a ", "aba", " a ", 'a', Items.dye, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 94), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 94), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 95),
				new Object[] { " a ", "aba", " a ", 'a', Items.bone, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 95), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 95), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 96),
				new Object[] { " c ", "aba", " c ", 'a', Items.beef, 'b', Items.egg, 'c', Blocks.mycelium });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 96), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 96), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 98),
				new Object[] { " a ", "aba", " a ", 'a', Items.fish, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 98), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 98), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 100),
				new Object[] { " a ", "aba", " a ", 'a', Items.leather, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 100), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 100), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 120),
				new Object[] { " a ", "aba", " a ", 'a', Items.book, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 120), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 120), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 50),
				new Object[] { " a ", "aba", " a ", 'a', Items.gunpowder, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 50), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 50), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 51),
				new Object[] { " c ", "aba", " c ", 'a', Items.bone, 'b', Items.egg, 'c', Items.arrow });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 51), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 51), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 52),
				new Object[] { " a ", "aba", " a ", 'a', Items.string, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 52), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 52), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 54),
				new Object[] { " a ", "aba", " a ", 'a', Items.rotten_flesh, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 54), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 54), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 55),
				new Object[] { " a ", "aba", " a ", 'a', Items.slime_ball, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 55), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 55), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 56),
				new Object[] { " a ", "cbc", " a ", 'a', Items.ghast_tear, 'b', Items.egg, 'c', Items.gunpowder });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 56), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 56), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 57),
				new Object[] { " c ", "aba", " c ", 'a', Items.rotten_flesh, 'b', Items.egg, 'c', Items.gold_nugget });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 57), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 57), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 58),
				new Object[] { " a ", "aba", " a ", 'a', Items.ender_pearl, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 58), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 58), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 59),
				new Object[] { " a ", "aba", " a ", 'a', Blocks.web, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 59), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 59), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 60),
				new Object[] { " a ", "aba", " a ", 'a', Blocks.stone, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 60), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 60), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 61),
				new Object[] { " a ", "aba", " a ", 'a', Items.blaze_rod, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 61), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 61), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 62),
				new Object[] { " a ", "aba", " a ", 'a', Items.magma_cream, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 62), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 62), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 65),
				new Object[] { " a ", "aba", " a ", 'a', Items.stick, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 65), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 65), 'i', Blocks.iron_bars });

		GameRegistry.addRecipe(new ItemStack(Items.spawn_egg, 1, 66),
				new Object[] { " a ", "aba", " a ", 'a', Items.glass_bottle, 'b', Items.egg });

		GameRegistry.addRecipe(new ItemStack(Blocks.mob_spawner, 1, 66), new Object[] { " i ", "iai", " i ", 'a',
				new ItemStack(Items.spawn_egg, 1, 66), 'i', Blocks.iron_bars });

		// Stacks
		GameRegistry.addRecipe(new ItemStack(ModItems.appleStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.apple });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.apple, 9), new Object[] { ModItems.appleStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.arrowStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.arrow });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.arrow, 9), new Object[] { ModItems.arrowStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.blazeRodStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.blaze_rod });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod, 9), new Object[] { ModItems.blazeRodStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.boneStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.bone });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.bone, 9), new Object[] { ModItems.boneStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.breadStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.bread });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.bread, 9), new Object[] { ModItems.breadStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderPearlStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.ender_pearl });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl, 9), new Object[] { ModItems.enderPearlStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.featherStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.feather });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.feather, 9), new Object[] { ModItems.featherStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.leatherStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.leather });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 9), new Object[] { ModItems.leatherStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.magmaCreamStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.magma_cream });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.magma_cream, 9), new Object[] { ModItems.magmaCreamStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.rottenFleshStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.rotten_flesh });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.rotten_flesh, 9),
				new Object[] { ModItems.rottenFleshStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.slimeballStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.slime_ball });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball, 9), new Object[] { ModItems.slimeballStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.snowballStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.snowball });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.snowball, 9), new Object[] { ModItems.snowballStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.spiderEyeStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.spider_eye });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.spider_eye, 9), new Object[] { ModItems.spiderEyeStack });

		GameRegistry.addRecipe(new ItemStack(ModItems.stringStack, 1),
				new Object[] { "aaa", "aaa", "aaa", 'a', Items.string });
		GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 9), new Object[] { ModItems.stringStack });

		// Other
		MinecraftForge.addGrassSeed(new ItemStack(Items.melon_seeds, 1, 0), 3);
		MinecraftForge.addGrassSeed(new ItemStack(Items.pumpkin_seeds, 1, 0), 3);

		// Flowers
		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 0),
				new Object[] { "f  ", "   ", "   ", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 0), new Object[] { "f", 'f', Blocks.red_flower });

		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 1),
				new Object[] { " f ", "   ", "   ", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 1), new Object[] { "f", 'f', Blocks.red_flower });

		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 2),
				new Object[] { "  f", "   ", "   ", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 2), new Object[] { "f", 'f', Blocks.red_flower });

		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 3),
				new Object[] { "   ", "f  ", "   ", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 3), new Object[] { "f", 'f', Blocks.red_flower });

		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 4),
				new Object[] { "   ", " f ", "   ", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 4), new Object[] { "f", 'f', Blocks.red_flower });

		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 5),
				new Object[] { "   ", "  f", "   ", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 5), new Object[] { "f", 'f', Blocks.red_flower });

		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 6),
				new Object[] { "   ", "   ", "f  ", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 6), new Object[] { "f", 'f', Blocks.red_flower });

		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 7),
				new Object[] { "   ", "   ", " f ", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 7), new Object[] { "f", 'f', Blocks.red_flower });

		GameRegistry.addRecipe(new ItemStack(Blocks.red_flower, 1, 8),
				new Object[] { "   ", "   ", "  f", 'f', Blocks.yellow_flower });
		GameRegistry.addRecipe(new ItemStack(Blocks.yellow_flower, 1, 8), new Object[] { "f", 'f', Blocks.red_flower });
	}
}
