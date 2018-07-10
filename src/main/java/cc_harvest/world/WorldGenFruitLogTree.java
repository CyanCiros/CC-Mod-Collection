package cc_harvest.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

@SuppressWarnings("unused")
public class WorldGenFruitLogTree extends WorldGenAbstractTree {
	private final int minTreeHeight;
	private final int metaLeaves;
	private final Block fruitType;

	public WorldGenFruitLogTree(final boolean par1, final int minTreeHeight, final int x, final int metaLeaves,
			final Block fruitType) {
		super(par1);
		this.minTreeHeight = minTreeHeight;
		this.metaLeaves = metaLeaves;
		this.fruitType = fruitType;
	}

	@Override
	public boolean generate(final World world, final Random random, final BlockPos pos) {
		final int treeHeight = random.nextInt(2) + this.minTreeHeight + 1;

		if (pos.getY() >= 1 && pos.getY() + treeHeight + 1 <= 256) {
			final Block groundBlock = world.getBlockState(new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()))
					.getBlock();

			final boolean isSoil = groundBlock.canSustainPlant(world,
					new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()), EnumFacing.UP, (BlockSapling) Blocks.sapling);

			if (isSoil && pos.getY() < 256 - treeHeight - 1) {
				groundBlock.onPlantGrow(world, new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()),
						new BlockPos(pos.getX(), pos.getY(), pos.getZ()));

				for (int vy = pos.getY(); vy < pos.getY() + treeHeight; vy++) {
					world.setBlockState(new BlockPos(pos.getX(), vy, pos.getZ()), this.fruitType.getDefaultState());
				}

				return true;
			}
			return false;
		}
		return false;
	}
}
