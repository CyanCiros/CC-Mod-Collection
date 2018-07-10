package cc_harvest.world;

import java.util.ArrayList;
import java.util.Random;

import cc_harvest.Config;
import cc_harvest.ModCrafting;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModBoxGenerator implements IWorldGenerator {
	private final ArrayList<BiomeDictionary.Type> boxBiome = new ArrayList<BiomeDictionary.Type>();

	public ModBoxGenerator() {
		this.boxBiome.add(BiomeDictionary.Type.BEACH);
		this.boxBiome.add(BiomeDictionary.Type.COLD);
		this.boxBiome.add(BiomeDictionary.Type.CONIFEROUS);
		this.boxBiome.add(BiomeDictionary.Type.DEAD);
		this.boxBiome.add(BiomeDictionary.Type.DENSE);
		// this.boxBiome.add(BiomeDictionary.Type.DRY);
		this.boxBiome.add(BiomeDictionary.Type.FOREST);
		this.boxBiome.add(BiomeDictionary.Type.HILLS);
		// this.boxBiome.add(BiomeDictionary.Type.HOT);
		this.boxBiome.add(BiomeDictionary.Type.JUNGLE);
		this.boxBiome.add(BiomeDictionary.Type.LUSH);
		this.boxBiome.add(BiomeDictionary.Type.MAGICAL);
		// this.boxBiome.add(BiomeDictionary.Type.MESA);
		this.boxBiome.add(BiomeDictionary.Type.MOUNTAIN);
		// this.boxBiome.add(BiomeDictionary.Type.MUSHROOM);
		// this.boxBiome.add(BiomeDictionary.Type.OCEAN);
		this.boxBiome.add(BiomeDictionary.Type.PLAINS);
		// this.boxBiome.add(BiomeDictionary.Type.RIVER);
		// this.boxBiome.add(BiomeDictionary.Type.SANDY);
		this.boxBiome.add(BiomeDictionary.Type.SAVANNA);
		this.boxBiome.add(BiomeDictionary.Type.SNOWY);
		this.boxBiome.add(BiomeDictionary.Type.SPARSE);
		this.boxBiome.add(BiomeDictionary.Type.SPOOKY);
		this.boxBiome.add(BiomeDictionary.Type.SWAMP);
		// this.boxBiome.add(BiomeDictionary.Type.WASTELAND);
		// this.boxBiome.add(BiomeDictionary.Type.WATER);
		// this.boxBiome.add(BiomeDictionary.Type.WET);
	}

	private boolean getBiomeOfType(final BiomeGenBase[] biome, final ArrayList<Type> types) {
		for (final BiomeGenBase b : biome) {
			for (final BiomeDictionary.Type type : types) {
				if (BiomeDictionary.isBiomeOfType(b, type)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world,
			final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
		this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
	}

	private void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
		final BiomeGenBase[] biome = world.getWorldChunkManager().getBiomeGenAt(null, chunkX, chunkZ, 16, 16, false);

		if (this.getBiomeOfType(biome, this.boxBiome)) {
			for (int i = 0; i < Config.boxRarity; i++) {
				final int x = chunkX + random.nextInt(16);
				final int y = random.nextInt(64) + 63;
				final int z = chunkZ + random.nextInt(16);

				if (world.isAirBlock(new BlockPos(x, y, z))
						&& (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt
								|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass)) {
					Block box;
					final int r = random.nextInt(5);

					switch (r) {
					case 0:
						box = ModCrafting.luckyCropsBox;
						break;
					case 1:
						box = ModCrafting.luckySeedsBox;
						break;
					case 2:
						box = ModCrafting.luckyTemperateFruitsBox;
						break;
					case 3:
						box = ModCrafting.luckyWarmFruitsBox;
						break;
					default:
						box = ModCrafting.luckyLogFruitsBox;
						break;
					}

					// System.out.println("Box: " + x + ", " + y + ", " + z);
					world.setBlockState(new BlockPos(x, y, z), box.getDefaultState());
				}
			}
		}
	}
}
