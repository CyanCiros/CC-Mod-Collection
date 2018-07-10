package cc_harvest.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenGarden extends WorldGenerator {
	private final Block plantBlockId;
	private final int flowerType;

	public WorldGenGarden(final Block block, final int i) {
		this.plantBlockId = block;
		this.flowerType = i;
	}

	@Override
	public boolean generate(final World world, final Random random, final BlockPos blockPos) {
		for (int l = 0; l < 8; l++) {
			final int x1 = blockPos.getX() + random.nextInt(8) - random.nextInt(8);
			final int y1 = blockPos.getY() + random.nextInt(4) - random.nextInt(4);
			final int z1 = blockPos.getZ() + random.nextInt(8) - random.nextInt(8);

			if (world.isAirBlock(new BlockPos(x1, y1, z1))
					&& this.plantBlockId.canPlaceBlockAt(world, new BlockPos(x1, y1, z1))) {
				world.setBlockState(new BlockPos(x1, y1, z1), this.plantBlockId.getStateFromMeta(this.flowerType));
			}
		}
		return true;
	}
}
