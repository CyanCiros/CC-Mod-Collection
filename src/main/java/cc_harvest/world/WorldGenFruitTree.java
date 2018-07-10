package cc_harvest.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class WorldGenFruitTree extends WorldGenAbstractTree {
	private final int minTreeHeight;
	private final int metaWood;
	private final int metaLeaves;
	private final Block fruitType;

	public WorldGenFruitTree(final boolean par1, final int treeHeight, final int metaWood, final int metaLeaves,
			final Block fruitType) {
		super(par1);
		this.minTreeHeight = treeHeight;
		this.metaWood = metaWood;
		this.metaLeaves = metaLeaves;
		this.fruitType = fruitType;
	}

	@Override
	public boolean generate(final World world, final Random random, final BlockPos blockPos) {
		final int treeHeight = random.nextInt(2) + this.minTreeHeight + 1;

		if (blockPos.getY() >= 1 && blockPos.getY() + treeHeight + 1 <= 256) {
			final Block groundBlock = world
					.getBlockState(new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ())).getBlock();

			final boolean isSoil = groundBlock.canSustainPlant(world,
					new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ()), EnumFacing.UP,
					(BlockSapling) Blocks.sapling);

			if (isSoil && blockPos.getY() < 256 - treeHeight - 1) {
				groundBlock.onPlantGrow(world, new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ()),
						new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ()));
				final byte b = 3;

				for (int y1 = blockPos.getY() - b + treeHeight; y1 <= blockPos.getY() + treeHeight; y1++) {
					final int i3 = y1 - (blockPos.getY() + treeHeight);
					final int l1 = 1 - i3 / 2;

					for (int x1 = blockPos.getX() - l1; x1 <= blockPos.getX() + l1; x1++) {
						final int j2 = x1 - blockPos.getX();

						for (int z1 = blockPos.getZ() - l1; z1 <= blockPos.getZ() + l1; z1++) {
							final int l2 = z1 - blockPos.getZ();

							if (Math.abs(j2) != l1 || Math.abs(l2) != l1 || random.nextInt(2) != 0 && i3 != 0) {
								final BlockPos newPos = new BlockPos(x1, y1, z1);
								final Block leavesBlock = world.getBlockState(newPos).getBlock();

								if (leavesBlock.isAir(world, newPos) || leavesBlock.isLeaves(world, newPos)) {
									world.setBlockState(newPos, Blocks.leaves.getStateFromMeta(this.metaLeaves));
								}
							}
						}
					}
				}

				for (int y1 = 0; y1 < treeHeight; y1++) {
					final BlockPos newPos = new BlockPos(blockPos.getX(), blockPos.getY() + y1, blockPos.getZ());
					final Block groundBlock2 = world.getBlockState(newPos).getBlock();

					if (groundBlock2 != Blocks.dirt && groundBlock2 != Blocks.grass) {
						world.setBlockState(newPos, Blocks.log.getStateFromMeta(this.metaWood));
					}
				}

				final int fy = blockPos.getY() - b + treeHeight - 1;

				for (int f = 0; f < random.nextInt(6) + 4; f++) {
					final int x1 = blockPos.getX() + random.nextInt(5) - 2;
					final int z1 = blockPos.getZ() + random.nextInt(5) - 2;

					if (world.isAirBlock(new BlockPos(x1, fy, z1))
							&& world.getBlockState(new BlockPos(x1, fy + 1, z1)).getBlock() == Blocks.leaves) {
						world.setBlockState(new BlockPos(x1, fy, z1), this.fruitType.getDefaultState());
					}
				}
				return true;
			}
			return false;
		}
		return false;
	}
}
