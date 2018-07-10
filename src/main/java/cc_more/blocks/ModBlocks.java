package cc_more.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block copperOre;
	public static Block copperBlock;

	public static Block tinOre;
	public static Block tinBlock;

	public static Block bronzeBlock;

	public static Block bauxiteOre;
	public static Block bauxiteBlock;

	public static Block chromeOre;
	public static Block chromeBlock;

	public static Block silverOre;
	public static Block silverBlock;

	public static Block leadOre;
	public static Block leadBlock;

	public static Block rubyOre;
	public static Block rubyBlock;

	public static Block sapphireOre;
	public static Block sapphireBlock;

	public static Block stainlessOre;
	public static Block stainlessBlock;

	public static Block fluoriteOre;
	public static Block fluoriteBlock;

	public static Block titaniumOre;
	public static Block titaniumBlock;

	public static Block jadeOre;
	public static Block jadeBlock;

	public static Block uraniumOre;
	public static Block uraniumBlock;

	public static Block amethystOre;
	public static Block amethystBlock;

	public static Block platinumOre;
	public static Block platinumBlock;

	public static Block meteoriteOre;
	public static Block meteoriteBlock;

	public static int copperHarvestLevel = 0;
	public static int tinHarvestLevel = 0;
	public static int bronzeHarvestLevel = 0;
	public static int bauxiteHarvestLevel = 0;
	public static int chromeHarvestLevel = 1;
	public static int silverHarvestLevel = 1;
	public static int leadHarvestLevel = 1;

	public static int rubyQuantity = 4;
	public static int rubyExperience = 4;
	public static int rubyHarvestLevel = 2;

	public static int sapphireQuantity = 4;
	public static int sapphireExperience = 5;
	public static int sapphireHarvestLevel = 2;

	public static int stainlessHarvestLevel = 2;
	public static int fluoriteHarvestLevel = 2;
	public static int titaniumHarvestLevel = 3;

	public static int jadeQuantity = 3;
	public static int jadeExperience = 6;
	public static int jadeHarvestLevel = 3;

	public static int uraniumHarvestLevel = 4;
	public static int amethystHarvestLevel = 4;
	public static int platinumHarvestLevel = 5;

	public static int meteoriteQuantity = 2;
	public static int meteoriteExperience = 8;
	public static int meteoriteHarvestLevel = 5;

	public static Block uraniumTNT;

	public static Block minersGlowstone;

	public static void main() {
		copperOre = new ModBlock(Material.rock, "copperOre", copperHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone);
		copperBlock = new ModBlock(Material.rock, "copperBlock", copperHarvestLevel, 5.0F, 10.0F, Block.soundTypeMetal);

		tinOre = new ModBlock(Material.rock, "tinOre", tinHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone);
		tinBlock = new ModBlock(Material.rock, "tinBlock", tinHarvestLevel, 5.0F, 10.0F, Block.soundTypeMetal);

		bronzeBlock = new ModBlock(Material.rock, "bronzeBlock", bronzeHarvestLevel, 5.0F, 10.0F, Block.soundTypeMetal);

		bauxiteOre = new ModBlock(Material.rock, "bauxiteOre", bauxiteHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone);
		bauxiteBlock = new ModBlock(Material.rock, "bauxiteBlock", bauxiteHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeMetal);

		chromeOre = new ModBlock(Material.rock, "chromeOre", chromeHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone);
		chromeBlock = new ModBlock(Material.rock, "chromeBlock", chromeHarvestLevel, 5.0F, 10.0F, Block.soundTypeMetal);

		silverOre = new ModBlock(Material.rock, "silverOre", silverHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone);
		silverBlock = new ModBlock(Material.rock, "silverBlock", silverHarvestLevel, 5.0F, 10.0F, Block.soundTypeMetal);

		leadOre = new ModBlock(Material.rock, "leadOre", leadHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone);
		leadBlock = new ModBlock(Material.rock, "leadBlock", leadHarvestLevel, 5.0F, 10.0F, Block.soundTypeMetal);

		rubyOre = new ModBlock(Material.rock, "rubyOre", rubyHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone,
				rubyQuantity, rubyExperience);
		rubyBlock = new ModBlock(Material.rock, "rubyBlock", rubyHarvestLevel, 5.0F, 10.0F, Block.soundTypeMetal);

		sapphireOre = new ModBlock(Material.rock, "sapphireOre", sapphireHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone,
				sapphireQuantity, sapphireExperience);
		sapphireBlock = new ModBlock(Material.rock, "sapphireBlock", sapphireHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeMetal);

		stainlessOre = new ModBlock(Material.rock, "stainlessOre", stainlessHarvestLevel, 3.0F, 5.0F,
				Block.soundTypeStone);
		stainlessBlock = new ModBlock(Material.rock, "stainlessBlock", stainlessHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeMetal);

		fluoriteOre = new ModBlock(Material.rock, "fluoriteOre", fluoriteHarvestLevel, 3.0F, 5.0F,
				Block.soundTypeStone);
		fluoriteBlock = new ModBlock(Material.rock, "fluoriteBlock", fluoriteHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeMetal);

		titaniumOre = new ModBlock(Material.rock, "titaniumOre", titaniumHarvestLevel, 3.0F, 5.0F,
				Block.soundTypeStone);
		titaniumBlock = new ModBlock(Material.rock, "titaniumBlock", titaniumHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeMetal);

		jadeOre = new ModBlock(Material.rock, "jadeOre", jadeHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone,
				jadeQuantity, jadeExperience);
		jadeBlock = new ModBlock(Material.rock, "jadeBlock", jadeHarvestLevel, 5.0F, 10.0F, Block.soundTypeMetal);

		uraniumOre = new ModBlock(Material.rock, "uraniumOre", uraniumHarvestLevel, 3.0F, 5.0F, Block.soundTypeStone);
		uraniumBlock = new ModBlock(Material.rock, "uraniumBlock", uraniumHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeMetal);

		amethystOre = new ModBlock(Material.rock, "amethystOre", amethystHarvestLevel, 3.0F, 5.0F,
				Block.soundTypeStone);
		amethystBlock = new ModBlock(Material.rock, "amethystBlock", amethystHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeMetal);

		platinumOre = new ModBlock(Material.rock, "platinumOre", platinumHarvestLevel, 3.0F, 5.0F,
				Block.soundTypeStone);
		platinumBlock = new ModBlock(Material.rock, "platinumBlock", platinumHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeMetal);

		meteoriteOre = new ModBlock(Material.rock, "meteoriteOre", meteoriteHarvestLevel, 3.0F, 5.0F,
				Block.soundTypeStone, meteoriteQuantity, meteoriteExperience, 1.0F);
		meteoriteBlock = new ModBlock(Material.rock, "meteoriteBlock", meteoriteHarvestLevel, 5.0F, 10.0F,
				Block.soundTypeStone, 1.0F);

		uraniumTNT = new ModBlock(Material.rock, "uraniumTNT", 0.0F, Block.soundTypeStone);

		minersGlowstone = new ModBlock(Material.glass, "minersGlowstone", 0.3F, Block.soundTypeGlass, 4, 2, 1.0F);

		ModBlocks.registerBlock(copperOre);
		ModBlocks.registerBlock(copperBlock);

		ModBlocks.registerBlock(tinOre);
		ModBlocks.registerBlock(tinBlock);

		ModBlocks.registerBlock(bronzeBlock);

		ModBlocks.registerBlock(bauxiteOre);
		ModBlocks.registerBlock(bauxiteBlock);

		ModBlocks.registerBlock(chromeOre);
		ModBlocks.registerBlock(chromeBlock);

		ModBlocks.registerBlock(silverOre);
		ModBlocks.registerBlock(silverBlock);

		ModBlocks.registerBlock(leadOre);
		ModBlocks.registerBlock(leadBlock);

		ModBlocks.registerBlock(rubyOre);
		ModBlocks.registerBlock(rubyBlock);

		ModBlocks.registerBlock(sapphireOre);
		ModBlocks.registerBlock(sapphireBlock);

		ModBlocks.registerBlock(stainlessOre);
		ModBlocks.registerBlock(stainlessBlock);

		ModBlocks.registerBlock(fluoriteOre);
		ModBlocks.registerBlock(fluoriteBlock);

		ModBlocks.registerBlock(titaniumOre);
		ModBlocks.registerBlock(titaniumBlock);

		ModBlocks.registerBlock(jadeOre);
		ModBlocks.registerBlock(jadeBlock);

		ModBlocks.registerBlock(uraniumOre);
		ModBlocks.registerBlock(uraniumBlock);

		ModBlocks.registerBlock(amethystOre);
		ModBlocks.registerBlock(amethystBlock);

		ModBlocks.registerBlock(platinumOre);
		ModBlocks.registerBlock(platinumBlock);

		ModBlocks.registerBlock(meteoriteOre);
		ModBlocks.registerBlock(meteoriteBlock);

		ModBlocks.registerBlock(uraniumTNT);

		ModBlocks.registerBlock(minersGlowstone);
	}

	public static void registerBlock(final Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}
}
