package cc_more.world;

import java.util.ArrayList;
import java.util.Random;

import cc_more.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModGenGlowstone extends WorldGenerator {
	@Override
	public boolean generate(final World world, final Random random, final BlockPos pos) {
		if (world.isAirBlock(pos) && !world.isAirBlock(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()))) {
			final ArrayList<Integer> xArray = new ArrayList<Integer>();
			final ArrayList<Integer> yArray = new ArrayList<Integer>();
			final ArrayList<Integer> zArray = new ArrayList<Integer>();

			world.setBlockState(pos, ModBlocks.minersGlowstone.getDefaultState());
			xArray.add(pos.getX());
			yArray.add(pos.getY());
			zArray.add(pos.getZ());

			for (int l = 0; l < 30; l++) {
				final int r = random.nextInt(xArray.size());

				int gx = xArray.get(r);
				int gy = yArray.get(r);
				int gz = zArray.get(r);

				final int d = random.nextInt(6);

				if (d == 0) {
					gx++;
				} else if (d == 1) {
					gx--;
				} else if (d == 2) {
					gy++;
				} else if (d == 3) {
					gy--;
				} else if (d == 4) {
					gz++;
				} else if (d == 5) {
					gz--;
				}

				if (world.getBlockState(new BlockPos(gx, gy, gz)).getBlock() == Blocks.air) {
					world.setBlockState(new BlockPos(gx, gy, gz), ModBlocks.minersGlowstone.getDefaultState());
					xArray.add(gx);
					yArray.add(gy);
					zArray.add(gz);
				}
			}
			return true;
		}
		return false;
	}
}
