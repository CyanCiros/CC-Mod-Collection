package cc_harvest.world;

import java.util.Random;

import cc_harvest.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class WorldGenSalt {
	private final Block BlockID;
	private final int numberOfBlocks;

	public WorldGenSalt(final int par1) {
		this.BlockID = ModBlocks.salt;
		this.numberOfBlocks = par1;
	}

	public boolean generate(final World world, final Random random, final int x, final int y, final int z) {
		final float var6 = random.nextFloat() * 3.141593F;
		final double var7 = x + 8 + MathHelper.sin(var6) * this.numberOfBlocks / 8.0F;
		final double var9 = x + 8 - MathHelper.sin(var6) * this.numberOfBlocks / 8.0F;
		final double var11 = z + 8 + MathHelper.cos(var6) * this.numberOfBlocks / 8.0F;
		final double var13 = z + 8 - MathHelper.cos(var6) * this.numberOfBlocks / 8.0F;
		final double var15 = y + random.nextInt(3) - 2;
		final double var17 = y + random.nextInt(3) - 2;

		for (int var19 = 0; var19 <= this.numberOfBlocks; var19++) {
			final double var20 = var7 + (var9 - var7) * var19 / this.numberOfBlocks;
			final double var22 = var15 + (var17 - var15) * var19 / this.numberOfBlocks;
			final double var24 = var11 + (var13 - var11) * var19 / this.numberOfBlocks;
			final double var26 = random.nextDouble() * this.numberOfBlocks / 16.0D;
			final double var28 = (MathHelper.sin(var19 * 3.141593F / this.numberOfBlocks) + 1.0F) * var26 + 1.0D;
			final double var30 = (MathHelper.sin(var19 * 3.141593F / this.numberOfBlocks) + 1.0F) * var26 + 1.0D;
			final int var32 = MathHelper.floor_double(var20 - var28 / 2.0D);
			final int var33 = MathHelper.floor_double(var22 - var30 / 2.0D);
			final int var34 = MathHelper.floor_double(var24 - var28 / 2.0D);
			final int var35 = MathHelper.floor_double(var20 + var28 / 2.0D);
			final int var36 = MathHelper.floor_double(var22 + var30 / 2.0D);
			final int var37 = MathHelper.floor_double(var24 + var28 / 2.0D);

			for (int var38 = var32; var38 <= var35; var38++) {
				final double var39 = (var38 + 0.5D - var20) / (var28 / 2.0D);

				if (var39 * var39 < 1.0D) {
					for (int var41 = var33; var41 <= var36; var41++) {
						final double var42 = (var41 + 0.5D - var22) / (var30 / 2.0D);

						if (var39 * var39 + var42 * var42 < 1.0D) {
							for (int var44 = var34; var44 <= var37; var44++) {
								final double var45 = (var44 + 0.5D - var24) / (var28 / 2.0D);

								if (var39 * var39 + var42 * var42 + var45 * var45 < 1.0D && world
										.getBlockState(new BlockPos(var38, var41, var44)).getBlock() == Blocks.stone) {
									world.setBlockState(new BlockPos(var38, var41, var44),
											this.BlockID.getDefaultState());
								}
							}
						}
					}
				}
			}
		}
		return true;
	}
}
