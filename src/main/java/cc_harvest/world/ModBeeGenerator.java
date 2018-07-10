package cc_harvest.world;

import java.util.Random;

import cc_harvest.Config;
import cc_harvest.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModBeeGenerator implements IWorldGenerator {
	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world,
			final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
		this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
	}

	public void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
		for (int i = 0; i < Config.beehiveRarity; i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(64) + 64;
			final int zCoord = chunkZ + random.nextInt(16);

			if (world.getBlockState(new BlockPos(xCoord, yCoord, zCoord)).getBlock() == Blocks.leaves
					&& world.isAirBlock(new BlockPos(xCoord, yCoord - 1, zCoord))) {
				// System.out.println("BeeHive: " + xCoord + ", " + yCoord + ",
				// " + zCoord);
				world.setBlockState(new BlockPos(xCoord, yCoord - 1, zCoord), ModBlocks.beehive.getDefaultState());
			}
		}
	}
}
