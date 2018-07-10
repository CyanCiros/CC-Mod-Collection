package cc_harvest.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class WorldGenFruitPalmTree extends WorldGenAbstractTree {
	private final int minTreeHeight;
	private final int metaWood;
	private final int metaLeaves;
	private final Block fruitType;

	public WorldGenFruitPalmTree(final boolean par1, final int minTreeHeight, final int metaWood, final int metaLeaves,
			final Block fruitType) {
		super(par1);
		this.minTreeHeight = minTreeHeight;
		this.metaWood = metaWood;
		this.metaLeaves = metaLeaves;
		this.fruitType = fruitType;
	}

	@Override
	public boolean generate(final World world, final Random random, final BlockPos pos) {
		final int treeHeight = random.nextInt(2) + this.minTreeHeight;

		if (pos.getY() >= 1 && pos.getY() + treeHeight + 1 <= 256) {
			final Block groundBlock = world.getBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()))
					.getBlock();

			if (groundBlock != Blocks.grass && groundBlock != Blocks.dirt || pos.getY() >= 256 - treeHeight - 1) {
				return false;
			}
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), Blocks.dirt.getDefaultState());

			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight + 2, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight + 1, pos.getZ()),
					Blocks.log.getStateFromMeta(this.metaWood));
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight, pos.getZ()),
					Blocks.log.getStateFromMeta(this.metaWood));

			for (int y1 = 0; y1 < treeHeight; y1++) {
				final BlockPos newPos = new BlockPos(pos.getX(), pos.getY() + y1, pos.getZ());
				final Block groundBlock2 = world.getBlockState(newPos).getBlock();

				if (groundBlock2 != Blocks.dirt && groundBlock2 != Blocks.grass) {
					world.setBlockState(newPos, Blocks.log.getStateFromMeta(this.metaWood));
				}
			}

			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight + 1, pos.getZ() + 1),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight, pos.getZ() + 1),
					this.fruitType.getDefaultState());
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight + 1, pos.getZ() + 2),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight + 1, pos.getZ() + 3),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight, pos.getZ() + 4),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));

			world.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + treeHeight + 1, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + treeHeight, pos.getZ()),
					this.fruitType.getDefaultState());
			world.setBlockState(new BlockPos(pos.getX() + 2, pos.getY() + treeHeight + 1, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() + 3, pos.getY() + treeHeight + 1, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() + 4, pos.getY() + treeHeight, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));

			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight + 1, pos.getZ() - 1),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight, pos.getZ() - 1),
					this.fruitType.getDefaultState());
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight + 1, pos.getZ() - 2),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight + 1, pos.getZ() - 3),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX(), pos.getY() + treeHeight, pos.getZ() - 4),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));

			world.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + treeHeight + 1, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + treeHeight, pos.getZ()),
					this.fruitType.getDefaultState());
			world.setBlockState(new BlockPos(pos.getX() - 2, pos.getY() + treeHeight + 1, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() - 3, pos.getY() + treeHeight + 1, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() - 4, pos.getY() + treeHeight, pos.getZ()),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));

			world.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + treeHeight + 1, pos.getZ() - 1),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + treeHeight + 1, pos.getZ() + 1),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + treeHeight + 1, pos.getZ() - 1),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + treeHeight + 1, pos.getZ() + 1),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));

			world.setBlockState(new BlockPos(pos.getX() + 2, pos.getY() + treeHeight + 1, pos.getZ() + 2),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() + 2, pos.getY() + treeHeight + 1, pos.getZ() - 2),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() - 2, pos.getY() + treeHeight + 1, pos.getZ() + 2),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() - 2, pos.getY() + treeHeight + 1, pos.getZ() - 2),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));

			world.setBlockState(new BlockPos(pos.getX() + 3, pos.getY() + treeHeight, pos.getZ() + 3),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() + 3, pos.getY() + treeHeight, pos.getZ() - 3),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() - 3, pos.getY() + treeHeight, pos.getZ() + 3),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));
			world.setBlockState(new BlockPos(pos.getX() - 3, pos.getY() + treeHeight, pos.getZ() - 3),
					Blocks.leaves.getStateFromMeta(this.metaLeaves));

			return true;
		}
		return true;
	}
}
