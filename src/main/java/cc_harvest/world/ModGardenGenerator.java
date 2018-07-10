package cc_harvest.world;

import java.util.ArrayList;
import java.util.Random;

import cc_harvest.Config;
import cc_harvest.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModGardenGenerator implements IWorldGenerator {
	private final ArrayList<BiomeDictionary.Type> berryGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> desertGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> grassGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> gourdGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> groundGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> herbGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> leafyGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> mushroomGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> stalkGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> textileGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> tropicalGardenBiome = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> waterGardenBiome = new ArrayList<BiomeDictionary.Type>();

	public ModGardenGenerator() {
		if (Config.enableBerryGardenGeneration) {
			this.berryGardenBiome.add(BiomeDictionary.Type.FOREST);
			this.berryGardenBiome.add(BiomeDictionary.Type.HILLS);
			this.berryGardenBiome.add(BiomeDictionary.Type.JUNGLE);
			this.berryGardenBiome.add(BiomeDictionary.Type.PLAINS);
			this.berryGardenBiome.add(BiomeDictionary.Type.SAVANNA);
			this.berryGardenBiome.add(BiomeDictionary.Type.SPARSE);
			this.berryGardenBiome.add(BiomeDictionary.Type.SWAMP);
		}
		if (Config.enableDesertGardenGeneration) {
			this.desertGardenBiome.add(BiomeDictionary.Type.DRY);
			this.desertGardenBiome.add(BiomeDictionary.Type.HOT);
			this.desertGardenBiome.add(BiomeDictionary.Type.SANDY);
		}
		if (Config.enableGrassGardenGeneration) {
			this.grassGardenBiome.add(BiomeDictionary.Type.FOREST);
			this.grassGardenBiome.add(BiomeDictionary.Type.HILLS);
			this.grassGardenBiome.add(BiomeDictionary.Type.JUNGLE);
			this.grassGardenBiome.add(BiomeDictionary.Type.PLAINS);
			this.grassGardenBiome.add(BiomeDictionary.Type.SAVANNA);
			this.grassGardenBiome.add(BiomeDictionary.Type.SPARSE);
			this.grassGardenBiome.add(BiomeDictionary.Type.SWAMP);
		}
		if (Config.enableGourdGardenGeneration) {
			this.gourdGardenBiome.add(BiomeDictionary.Type.FOREST);
			this.gourdGardenBiome.add(BiomeDictionary.Type.HILLS);
			this.gourdGardenBiome.add(BiomeDictionary.Type.JUNGLE);
			this.gourdGardenBiome.add(BiomeDictionary.Type.PLAINS);
			this.gourdGardenBiome.add(BiomeDictionary.Type.SAVANNA);
			this.gourdGardenBiome.add(BiomeDictionary.Type.SPARSE);
			this.gourdGardenBiome.add(BiomeDictionary.Type.SWAMP);
		}
		if (Config.enableGroundGardenGeneration) {
			this.groundGardenBiome.add(BiomeDictionary.Type.HILLS);
			this.groundGardenBiome.add(BiomeDictionary.Type.PLAINS);
			this.groundGardenBiome.add(BiomeDictionary.Type.MOUNTAIN);
			this.groundGardenBiome.add(BiomeDictionary.Type.WASTELAND);
		}
		if (Config.enableHerbGardenGeneration) {
			this.herbGardenBiome.add(BiomeDictionary.Type.DENSE);
			this.herbGardenBiome.add(BiomeDictionary.Type.FOREST);
			this.herbGardenBiome.add(BiomeDictionary.Type.SPARSE);
			this.herbGardenBiome.add(BiomeDictionary.Type.SWAMP);
		}
		if (Config.enableLeafyGardenGeneration) {
			this.leafyGardenBiome.add(BiomeDictionary.Type.DENSE);
			this.leafyGardenBiome.add(BiomeDictionary.Type.PLAINS);
			this.leafyGardenBiome.add(BiomeDictionary.Type.FOREST);
			this.leafyGardenBiome.add(BiomeDictionary.Type.SPARSE);
			this.leafyGardenBiome.add(BiomeDictionary.Type.SWAMP);
		}
		if (Config.enableMushroomGardenGeneration) {
			this.mushroomGardenBiome.add(BiomeDictionary.Type.DENSE);
			this.mushroomGardenBiome.add(BiomeDictionary.Type.FOREST);
			this.mushroomGardenBiome.add(BiomeDictionary.Type.SPARSE);
			this.mushroomGardenBiome.add(BiomeDictionary.Type.SWAMP);
		}
		if (Config.enableStalkGardenGeneration) {
			this.stalkGardenBiome.add(BiomeDictionary.Type.DENSE);
			this.stalkGardenBiome.add(BiomeDictionary.Type.PLAINS);
			this.stalkGardenBiome.add(BiomeDictionary.Type.FOREST);
			this.stalkGardenBiome.add(BiomeDictionary.Type.SWAMP);
		}
		if (Config.enableTextileGardenGeneration) {
			this.textileGardenBiome.add(BiomeDictionary.Type.HILLS);
			this.textileGardenBiome.add(BiomeDictionary.Type.MOUNTAIN);
		}
		if (Config.enableTropicalGardenGeneration) {
			this.tropicalGardenBiome.add(BiomeDictionary.Type.HOT);
			this.tropicalGardenBiome.add(BiomeDictionary.Type.JUNGLE);
			this.tropicalGardenBiome.add(BiomeDictionary.Type.SAVANNA);
		}
		if (Config.enableWaterGardenGeneration) {
			this.waterGardenBiome.add(BiomeDictionary.Type.BEACH);
			this.waterGardenBiome.add(BiomeDictionary.Type.RIVER);
			this.waterGardenBiome.add(BiomeDictionary.Type.SWAMP);
			this.waterGardenBiome.add(BiomeDictionary.Type.WET);
		}
	}

	private boolean getBiomeOfType(final BiomeGenBase[] biome, final ArrayList<BiomeDictionary.Type> types) {
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

	public void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
		final BiomeGenBase[] biome = world.getWorldChunkManager().getBiomeGenAt(null, chunkX, chunkZ, 16, 16, false);

		if (Config.enableBerryGardenGeneration && this.getBiomeOfType(biome, this.berryGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 6; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.berryGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableDesertGardenGeneration && this.getBiomeOfType(biome, this.desertGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.sand) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.desertGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableGrassGardenGeneration && this.getBiomeOfType(biome, this.grassGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.grassGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableGourdGardenGeneration && this.getBiomeOfType(biome, this.gourdGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.gourdGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableGroundGardenGeneration && this.getBiomeOfType(biome, this.groundGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.groundGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableHerbGardenGeneration && this.getBiomeOfType(biome, this.herbGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.herbGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableLeafyGardenGeneration && this.getBiomeOfType(biome, this.leafyGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.leafyGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableMushroomGardenGeneration && this.getBiomeOfType(biome, this.mushroomGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), Blocks.log.getDefaultState());
						world.setBlockState(new BlockPos(x2 + 1, y2, z2), Blocks.log.getDefaultState());
						world.setBlockState(new BlockPos(x2 - 1, y2, z2), Blocks.log.getDefaultState());
						world.setBlockState(new BlockPos(x2, y2 + 1, z2), ModBlocks.mushroomGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableStalkGardenGeneration && this.getBiomeOfType(biome, this.stalkGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.stalkGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableTextileGardenGeneration && this.getBiomeOfType(biome, this.textileGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.textileGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableTropicalGardenGeneration && this.getBiomeOfType(biome, this.tropicalGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.grass) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.tropicalGarden.getDefaultState());
					}
				}
			}
		}
		if (Config.enableWaterGardenGeneration && this.getBiomeOfType(biome, this.waterGardenBiome)) {
			for (int i = 0; i < Config.gardenRarity; i++) {
				final int x1 = chunkX + random.nextInt(16);
				final int y1 = random.nextInt(64) + 63;
				final int z1 = chunkZ + random.nextInt(16);

				for (int l = 0; l < 8; l++) {
					final int x2 = x1 + random.nextInt(16);
					final int y2 = y1 + random.nextInt(8);
					final int z2 = z1 + random.nextInt(16);

					if (world.isAirBlock(new BlockPos(x2, y2, z2))
							&& world.getBlockState(new BlockPos(x2, y2 - 1, z2)).getBlock() == Blocks.water) {
						world.setBlockState(new BlockPos(x2, y2, z2), ModBlocks.waterGarden.getDefaultState());
					}
				}
			}
		}
	}
}
