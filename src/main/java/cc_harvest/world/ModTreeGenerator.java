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

public class ModTreeGenerator implements IWorldGenerator {
	private final ArrayList<BiomeDictionary.Type> BiomeList1 = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> BiomeList2 = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> BiomeList3 = new ArrayList<BiomeDictionary.Type>();
	private final ArrayList<BiomeDictionary.Type> BiomeList4 = new ArrayList<BiomeDictionary.Type>();

	public ModTreeGenerator() {
		this.BiomeList1.add(BiomeDictionary.Type.FOREST);
		this.BiomeList1.add(BiomeDictionary.Type.HILLS);
		this.BiomeList1.add(BiomeDictionary.Type.PLAINS);

		this.BiomeList2.add(BiomeDictionary.Type.JUNGLE);
		this.BiomeList2.add(BiomeDictionary.Type.SANDY);
		this.BiomeList2.add(BiomeDictionary.Type.SWAMP);

		this.BiomeList3.add(BiomeDictionary.Type.SNOWY);

		this.BiomeList4.add(BiomeDictionary.Type.JUNGLE);
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

		if (this.getBiomeOfType(biome, this.BiomeList1)) {
			if (Config.appleTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("apple: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.apple).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.avocadoTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("avocado: " + x + ", " + y + ", "
						// + z);
						new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.avocado).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.cherryTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("cherry: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.cherry).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.chestnutTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("chestnut: " + x + ", " + y + ", "
						// + z);
						new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.chestnut).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.nutmegTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("nutmeg: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.nutmeg).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.pearTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("pear: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.pear).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.plumTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("plum: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.plum).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.walnutTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("walnut: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 0, 0, ModBlocks.walnut).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
		}
		if (this.getBiomeOfType(biome, this.BiomeList2)) {
			if (Config.bananaTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("banana: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.banana).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.coconutTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("coconut: " + x + ", " + y + ", "
						// + z);
						new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.coconut).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.dateTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("date: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.date).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.dragonfruitTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("dragonfruit: " + x + ", " + y +
						// ", " + z);
						new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.dragonfruit).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.papayaTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("papaya: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitPalmTree(true, 5, 3, 3, ModBlocks.papaya).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.almondTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("almond: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.almond).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.apricotTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("apricot: " + x + ", " + y + ", "
						// + z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.apricot).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.cashewTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("cashew: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.cashew).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.durianTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("durian: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.durian).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.figTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("fig: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.fig).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.grapefruitTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("grapefruit: " + x + ", " + y + ",
						// " + z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.grapefruit).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.lemonTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("lemon: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.lemon).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.limeTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("lime: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.lime).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.mangoTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("mango: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.mango).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.orangeTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("orange: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.orange).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.peachTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("peach: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.peach).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.pecanTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("pecan: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.pecan).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.peppercornTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("peppercorn: " + x + ", " + y + ",
						// " + z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.peppercorn).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.persimmonTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("persimmon: " + x + ", " + y + ",
						// " + z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.persimmon).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.pistachioTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("pistachio: " + x + ", " + y + ",
						// " + z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.pistachio).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.pomegranateTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("pomegranate: " + x + ", " + y +
						// ", " + z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.pomegranate).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.starfruitTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("starfruit: " + x + ", " + y + ",
						// " + z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.starfruit).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.vanillabeanTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("vanillabean: " + x + ", " + y +
						// ", " + z);
						new WorldGenFruitTree(true, 5, 3, 3, ModBlocks.vanillaBean).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
		}
		if (this.getBiomeOfType(biome, this.BiomeList3)) {
			if (Config.mapleTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("maple: " + x + ", " + y + ", " +
						// z);
						new WorldGenFruitLogTree(true, 2, 1, 1, ModBlocks.maple).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
		}
		if (this.getBiomeOfType(biome, this.BiomeList4)) {
			if (Config.paperbarkTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("paperbark: " + x + ", " + y + ",
						// " + z);
						new WorldGenFruitLogTree(true, 2, 3, 3, ModBlocks.paperbark).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
			if (Config.cinnamonTreeGeneration) {
				for (int i = 0; i < Config.fruitTreeRarity; i++) {
					final int x = chunkX + random.nextInt(16);
					final int y = random.nextInt(64) + 63;
					final int z = chunkZ + random.nextInt(16);

					if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.grass
							|| world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.dirt) {
						// System.out.println("cinnamon: " + x + ", " + y + ", "
						// + z);
						new WorldGenFruitLogTree(true, 2, 3, 3, ModBlocks.cinnamon).generate(world, random,
								new BlockPos(x, y, z));
					}
				}
			}
		}
	}
}
