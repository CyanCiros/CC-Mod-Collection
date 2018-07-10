package cc_more.world;

import java.util.Random;

import cc_more.Config;
import cc_more.blocks.ModBlocks;
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
		if (world.provider.getDimensionId() == Config.minersDimension) {
			this.generateHeaven(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateHeaven(final World world, final Random random, final int chunkX, final int chunkZ) {
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
		for (int i = 0; i < (int) (Config.quartzSpawnTries * Config.quartzSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier * 3); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.quartzSpawnMaxHeight - Config.quartzSpawnMinHeight)
					+ Config.quartzSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(Blocks.quartz_ore.getDefaultState(),
					(int) (Config.quartzSpawnSize * Config.quartzSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}

		for (int i = 0; i < (int) (Config.copperSpawnTries * Config.copperSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.copperSpawnMaxHeight - Config.copperSpawnMinHeight)
					+ Config.copperSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.copperOre.getDefaultState(),
					(int) (Config.copperSpawnSize * Config.copperSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.tinSpawnTries * Config.tinSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.tinSpawnMaxHeight - Config.tinSpawnMinHeight)
					+ Config.tinSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.tinOre.getDefaultState(),
					(int) (Config.tinSpawnSize * Config.tinSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.bauxiteSpawnTries * Config.bauxiteSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.bauxiteSpawnMaxHeight - Config.bauxiteSpawnMinHeight)
					+ Config.bauxiteSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.bauxiteOre.getDefaultState(),
					(int) (Config.bauxiteSpawnSize * Config.bauxiteSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.chromeSpawnTries * Config.chromeSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier * 3); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.chromeSpawnMaxHeight - Config.chromeSpawnMinHeight)
					+ Config.chromeSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.chromeOre.getDefaultState(),
					(int) (Config.chromeSpawnSize * Config.chromeSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.silverSpawnTries * Config.silverSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.silverSpawnMaxHeight - Config.silverSpawnMinHeight)
					+ Config.silverSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.silverOre.getDefaultState(),
					(int) (Config.silverSpawnSize * Config.silverSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.leadSpawnTries * Config.leadSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.leadSpawnMaxHeight - Config.leadSpawnMinHeight)
					+ Config.leadSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.leadOre.getDefaultState(),
					(int) (Config.leadSpawnSize * Config.leadSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.rubySpawnTries * Config.rubySpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.rubySpawnMaxHeight - Config.rubySpawnMinHeight)
					+ Config.rubySpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.rubyOre.getDefaultState(),
					(int) (Config.rubySpawnSize * Config.rubySpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.sapphireSpawnTries * Config.sapphireSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.sapphireSpawnMaxHeight - Config.sapphireSpawnMinHeight)
					+ Config.sapphireSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.sapphireOre.getDefaultState(),
					(int) (Config.sapphireSpawnSize * Config.sapphireSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.stainlessSpawnTries * Config.stainlessSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.stainlessSpawnMaxHeight - Config.stainlessSpawnMinHeight)
					+ Config.stainlessSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.stainlessOre.getDefaultState(),
					(int) (Config.stainlessSpawnSize * Config.stainlessSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.fluoriteSpawnTries * Config.fluoriteSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.fluoriteSpawnMaxHeight - Config.fluoriteSpawnMinHeight)
					+ Config.fluoriteSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.fluoriteOre.getDefaultState(),
					(int) (Config.fluoriteSpawnSize * Config.fluoriteSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.titaniumSpawnTries * Config.titaniumSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.titaniumSpawnMaxHeight - Config.titaniumSpawnMinHeight)
					+ Config.titaniumSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.titaniumOre.getDefaultState(),
					(int) (Config.titaniumSpawnSize * Config.titaniumSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.jadeSpawnTries * Config.jadeSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.jadeSpawnMaxHeight - Config.jadeSpawnMinHeight)
					+ Config.jadeSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.jadeOre.getDefaultState(),
					(int) (Config.jadeSpawnSize * Config.jadeSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.uraniumSpawnTries * Config.uraniumSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.uraniumSpawnMaxHeight - Config.uraniumSpawnMinHeight)
					+ Config.uraniumSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.uraniumOre.getDefaultState(),
					(int) (Config.uraniumSpawnSize * Config.uraniumSpawnSizeMultiplier * Config.oreSpawnSizeMultiplier))
							.generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.amethystSpawnTries * Config.amethystSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.amethystSpawnMaxHeight - Config.amethystSpawnMinHeight)
					+ Config.amethystSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.amethystOre.getDefaultState(),
					(int) (Config.amethystSpawnSize * Config.amethystSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.platinumSpawnTries * Config.platinumSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.platinumSpawnMaxHeight - Config.platinumSpawnMinHeight)
					+ Config.platinumSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.platinumOre.getDefaultState(),
					(int) (Config.platinumSpawnSize * Config.platinumSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.meteoriteSpawnTries * Config.meteoriteSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier * 3); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(Config.meteoriteSpawnMaxHeight - Config.meteoriteSpawnMinHeight)
					+ Config.meteoriteSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.meteoriteOre.getDefaultState(),
					(int) (Config.meteoriteSpawnSize * Config.meteoriteSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.minersGlowstoneSpawnTries * Config.minersGlowstoneSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier * 3); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random
					.nextInt(Config.minersGlowstoneSpawnMaxHeight - Config.minersGlowstoneSpawnMinHeight)
					+ Config.minersGlowstoneSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.minersGlowstone.getDefaultState(),
					(int) (Config.minersGlowstoneSpawnSize * Config.minersGlowstoneSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.minersGlowstoneSpawnTries * Config.minersGlowstoneSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier * 3); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random
					.nextInt(Config.minersGlowstoneSpawnMaxHeight - Config.minersGlowstoneSpawnMinHeight)
					+ Config.minersGlowstoneSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new WorldGenMinable(ModBlocks.minersGlowstone.getDefaultState(),
					(int) (Config.minersGlowstoneSpawnSize * Config.minersGlowstoneSpawnSizeMultiplier
							* Config.oreSpawnSizeMultiplier)).generate(world, random,
									new BlockPos(xCoord, yCoord, zCoord));
		}
		for (int i = 0; i < (int) (Config.minersGlowstoneSpawnTries * Config.minersGlowstoneSpawnTriesMultiplier
				* Config.oreSpawnTriesMultiplier * 3); i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random
					.nextInt(Config.minersGlowstoneSpawnMaxHeight - Config.minersGlowstoneSpawnMinHeight)
					+ Config.minersGlowstoneSpawnMinHeight;
			final int zCoord = chunkZ + random.nextInt(16);

			new ModGenGlowstone().generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
	}
}
