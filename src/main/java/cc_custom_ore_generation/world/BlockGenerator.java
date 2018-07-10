package cc_custom_ore_generation.world;

import java.util.Random;

import cc_custom_ore_generation.Config;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class BlockGenerator implements IWorldGenerator {
	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world,
			final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case -1:
			this.generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			this.generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		default:
			break;
		}
	}

	private void generateNether(final World world, final Random random, final int chunkX, final int chunkZ) {
		for (int i = 0; i < (int) (Config.quartzSpawnTries * Config.quartzSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.quartzSpawnMaxHeight - Config.quartzSpawnMinHeight)
					+ Config.quartzSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.quartz_ore.getDefaultState(),
					(int) (Config.quartzSpawnSize * Config.quartzSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
	}

	private void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
		for (int i = 0; i < (int) (Config.coalSpawnTries * Config.coalSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.coalSpawnMaxHeight - Config.coalSpawnMinHeight)
					+ Config.coalSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.coal_ore.getDefaultState(),
					(int) (Config.coalSpawnSize * Config.coalSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.ironSpawnTries * Config.ironSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.ironSpawnMaxHeight - Config.ironSpawnMinHeight)
					+ Config.ironSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.iron_ore.getDefaultState(),
					(int) (Config.ironSpawnSize * Config.ironSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.lapisSpawnTries * Config.lapisSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.lapisSpawnMaxHeight - Config.lapisSpawnMinHeight)
					+ Config.lapisSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.lapis_ore.getDefaultState(),
					(int) (Config.lapisSpawnSize * Config.lapisSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.goldSpawnTries * Config.goldSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.goldSpawnMaxHeight - Config.goldSpawnMinHeight)
					+ Config.goldSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.gold_ore.getDefaultState(),
					(int) (Config.goldSpawnSize * Config.goldSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.redstoneSpawnTries * Config.redstoneSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.redstoneSpawnMaxHeight - Config.redstoneSpawnMinHeight)
					+ Config.redstoneSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.redstone_ore.getDefaultState(),
					(int) (Config.redstoneSpawnSize * Config.redstoneSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.diamondSpawnTries * Config.diamondSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.diamondSpawnMaxHeight - Config.diamondSpawnMinHeight)
					+ Config.diamondSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.diamond_ore.getDefaultState(),
					(int) (Config.diamondSpawnSize * Config.diamondSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.emeraldSpawnTries * Config.emeraldSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.emeraldSpawnMaxHeight - Config.emeraldSpawnMinHeight)
					+ Config.emeraldSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.emerald_ore.getDefaultState(),
					(int) (Config.emeraldSpawnSize * Config.emeraldSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
	}

	@SuppressWarnings("unused")
	private void generateEnd(final World world, final Random random, final int i, final int j) {

	}
}
