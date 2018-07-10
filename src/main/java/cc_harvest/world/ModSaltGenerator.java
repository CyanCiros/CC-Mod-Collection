package cc_harvest.world;

import java.util.Random;

import cc_harvest.Config;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModSaltGenerator implements IWorldGenerator {
	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world,
			final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
		this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
	}

	private void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
		for (int i = 0; i < Config.saltRarity; i++) {
			final int xCoord = chunkX + random.nextInt(16);
			final int yCoord = random.nextInt(128);
			final int zCoord = chunkZ + random.nextInt(16);
			// System.out.println("Salt: x: " + xCoord + ", y: " + yCoord + ",
			// z: " + zCoord);

			new WorldGenSalt(12).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}
