package cc_cyan_weapons;

import cc_cyan_weapons.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void initCrafting() {
		// Essence
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.essenceMixed),
				new Object[] { ModItems.essenceEnder, ModItems.essenceThunder, ModItems.essenceFire,
						ModItems.essenceWater, ModItems.essenceBeast, ModItems.essenceLight, ModItems.essenceDark,
						ModItems.essenceEarth, ModItems.essenceWind });

		// Swords - Light
		GameRegistry.addRecipe(new ItemStack(ModItems.beastSword),
				new Object[] { "E", "S", 'E', ModItems.essenceBeast, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.darkSword),
				new Object[] { "E", "S", 'E', ModItems.essenceDark, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.earthSword),
				new Object[] { "E", "S", 'E', ModItems.essenceEarth, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderSword),
				new Object[] { "E", "S", 'E', ModItems.essenceEnder, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.fireSword),
				new Object[] { "E", "S", 'E', ModItems.essenceFire, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.lightSword),
				new Object[] { "E", "S", 'E', ModItems.essenceLight, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.thunderShockSword),
				new Object[] { "E", "S", 'E', ModItems.essenceThunder, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.waterSword),
				new Object[] { "E", "S", 'E', ModItems.essenceWater, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.windSword),
				new Object[] { "E", "S", 'E', ModItems.essenceWind, 'S', Items.blaze_rod });

		// Swords - Medium
		GameRegistry.addRecipe(new ItemStack(ModItems.darkNetherSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceDark, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderPortalSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceEnder, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.iceSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceWater, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.lightNetherSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceLight, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.meteorSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceFire, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.peacefulNatureSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceEarth, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.steamSword), new Object[] { "E", "F", "S", 'E',
				ModItems.essenceWater, 'F', ModItems.essenceFire, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.thunderSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceThunder, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.timeSword), new Object[] { "E", "F", "S", 'E',
				ModItems.essenceDark, 'F', ModItems.essenceLight, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.windBlastSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceWind, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.wolfSword),
				new Object[] { "E", "E", "S", 'E', ModItems.essenceBeast, 'S', Items.blaze_rod });

		// Swords - Strong
		GameRegistry.addRecipe(new ItemStack(ModItems.blizzardSword),
				new Object[] { " E ", "ESE", 'E', ModItems.essenceWater, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderFireSword), new Object[] { " E ", "FSF", 'E',
				ModItems.essenceEnder, 'F', ModItems.essenceFire, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderThunderSword), new Object[] { " E ", "FSF", 'E',
				ModItems.essenceEnder, 'F', ModItems.essenceThunder, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.enderWindSword), new Object[] { " E ", "FSF", 'E',
				ModItems.essenceEnder, 'F', ModItems.essenceWind, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.meteoricThunderstormSword), new Object[] { " E ", "FSF", 'E',
				ModItems.essenceFire, 'F', ModItems.essenceThunder, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.thunderstormSword), new Object[] { " E ", "FSF", 'E',
				ModItems.essenceWind, 'F', ModItems.essenceThunder, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.wildNatureSword),
				new Object[] { " E ", "ESE", 'E', ModItems.essenceEarth, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.windWhirlSword),
				new Object[] { " E ", "ESE", 'E', ModItems.essenceWind, 'S', Items.blaze_rod });

		// Swords - Super
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanSword),
				new Object[] { "M", "S", 'M', ModItems.essenceMixed, 'S', Items.blaze_rod });

		GameRegistry.addRecipe(new ItemStack(ModItems.triEnderSword),
				new Object[] { " W ", " E ", "TSF", 'E', ModItems.essenceEnder, 'W', ModItems.essenceWind, 'F',
						ModItems.essenceFire, 'T', ModItems.essenceThunder, 'S', Items.blaze_rod });

		// Bows - Light
		GameRegistry.addRecipe(new ItemStack(ModItems.darkBow, 1, 0), new Object[] { " IS", "IES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceDark });
		GameRegistry.addRecipe(new ItemStack(ModItems.fireBow, 1, 0), new Object[] { " IS", "IES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceFire });
		GameRegistry.addRecipe(new ItemStack(ModItems.lightBow, 1, 0), new Object[] { " IS", "IES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceLight });
		GameRegistry.addRecipe(new ItemStack(ModItems.windBow, 1, 0), new Object[] { " IS", "IES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceWind });

		// Bows - Medium
		GameRegistry.addRecipe(new ItemStack(ModItems.darkNetherBow, 1, 0), new Object[] { " IS", "EES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceDark });
		GameRegistry.addRecipe(new ItemStack(ModItems.enderPortalBow, 1, 0), new Object[] { " IS", "EES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceEnder });
		GameRegistry.addRecipe(new ItemStack(ModItems.iceBow, 1, 0), new Object[] { " IS", "EES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceWater });
		GameRegistry.addRecipe(new ItemStack(ModItems.lightNetherBow, 1, 0), new Object[] { " IS", "EES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceLight });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteorBow, 1, 0), new Object[] { " IS", "EES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceFire });
		GameRegistry.addRecipe(new ItemStack(ModItems.peacefulNatureBow, 1, 0), new Object[] { " IS", "EES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceEarth });
		GameRegistry.addRecipe(new ItemStack(ModItems.steamBow, 1, 0), new Object[] { " IS", "FES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceWater, 'F', ModItems.essenceFire });
		GameRegistry.addRecipe(new ItemStack(ModItems.timeBow, 1, 0), new Object[] { " IS", "FES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceDark, 'F', ModItems.essenceLight });
		GameRegistry.addRecipe(new ItemStack(ModItems.windBlastBow, 1, 0), new Object[] { " IS", "EES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceWind });

		// Bows - Strong
		GameRegistry.addRecipe(new ItemStack(ModItems.blizzardBow, 1, 0), new Object[] { " ES", "IES", " ES", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceWater });
		GameRegistry.addRecipe(new ItemStack(ModItems.enderFireBow, 1, 0), new Object[] { " FS", "IES", " FS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceEnder, 'F', ModItems.essenceFire });
		GameRegistry.addRecipe(new ItemStack(ModItems.enderWindBow, 1, 0), new Object[] { " FS", "IES", " FS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceEnder, 'F', ModItems.essenceWind });
		GameRegistry.addRecipe(new ItemStack(ModItems.meteoricThunderstormBow, 1, 0),
				new Object[] { " FS", "IES", " FS", 'I', Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceFire,
						'F', ModItems.essenceThunder });
		GameRegistry.addRecipe(new ItemStack(ModItems.wildNatureBow, 1, 0), new Object[] { " ES", "IES", " ES", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceEarth });
		GameRegistry.addRecipe(new ItemStack(ModItems.windWhirlBow, 1, 0), new Object[] { " ES", "IES", " ES", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceWind });

		// Bows - Super
		GameRegistry.addRecipe(new ItemStack(ModItems.cyanBow, 1, 0), new Object[] { " IS", "IES", " IS", 'I',
				Items.blaze_rod, 'S', Items.string, 'E', ModItems.essenceMixed });
		GameRegistry
				.addRecipe(new ItemStack(ModItems.triEnderBow, 1, 0),
						new Object[] { " HS", "IEF", " GS", 'I', Items.blaze_rod, 'S', Items.string, 'E',
								ModItems.essenceEnder, 'F', ModItems.essenceWind, 'G', ModItems.essenceFire, 'H',
								ModItems.essenceThunder });

		// Arrows - Light
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.darkArrow, 4),
				new Object[] { Items.arrow, ModItems.essenceDark });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fireArrow, 4),
				new Object[] { Items.arrow, ModItems.essenceFire });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lightArrow, 4),
				new Object[] { Items.arrow, ModItems.essenceLight });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.windArrow, 4),
				new Object[] { Items.arrow, ModItems.essenceWind });

		// Arrows - Medium
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.darkNetherArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceDark, ModItems.essenceDark });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderPortalArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceEnder, ModItems.essenceEnder });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.iceArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceWater, ModItems.essenceWater });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lightNetherArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceLight, ModItems.essenceLight });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.meteorArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceFire, ModItems.essenceFire });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.peacefulNatureArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceEarth, ModItems.essenceEarth });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steamArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceWater, ModItems.essenceFire });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.timeArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceDark, ModItems.essenceLight });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.windBlastArrow, 8),
				new Object[] { Items.arrow, ModItems.essenceWind, ModItems.essenceWind });

		// Arrows - Strong
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blizzardArrow, 12),
				new Object[] { Items.arrow, ModItems.essenceWater, ModItems.essenceWater, ModItems.essenceWater });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderFireArrow, 12),
				new Object[] { Items.arrow, ModItems.essenceEnder, ModItems.essenceFire, ModItems.essenceFire });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.enderWindArrow, 12),
				new Object[] { Items.arrow, ModItems.essenceEnder, ModItems.essenceWind, ModItems.essenceWind });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.meteoricThunderstormArrow, 12),
				new Object[] { Items.arrow, ModItems.essenceFire, ModItems.essenceThunder, ModItems.essenceThunder });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.wildNatureArrow, 12),
				new Object[] { Items.arrow, ModItems.essenceEarth, ModItems.essenceEarth, ModItems.essenceEarth });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.windWhirlArrow, 12),
				new Object[] { Items.arrow, ModItems.essenceWind, ModItems.essenceWind, ModItems.essenceWind });

		// Arrows - Super
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cyanArrow, 36),
				new Object[] { Items.arrow, ModItems.essenceMixed });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.triEnderArrow, 16), new Object[] { Items.arrow,
				ModItems.essenceEnder, ModItems.essenceWind, ModItems.essenceFire, ModItems.essenceThunder });
	}
}
