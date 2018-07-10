package cc_more.blocks;

import java.util.Random;

import cc_more.world.MinersDimension;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockPortalFire extends BlockFire {

	public BlockPortalFire(final String name) {
		this.setUnlocalizedName(name);
		this.setTickRandomly(true);
		this.setLightLevel(1.0F);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return 3;
	}

	@Override
	public int quantityDropped(final Random p_149745_1_) {
		return 0;
	}

	@Override
	public int tickRate(final World p_149738_1_) {
		return 30;
	}

	@Override
	public boolean isCollidable() {
		return false;
	}

	private boolean canNeighborBurn(final World world, final int x, final int y, final int z) {
		return this.canCatchFire(world, new BlockPos(x + 1, y, z), EnumFacing.WEST)
				|| this.canCatchFire(world, new BlockPos(x - 1, y, z), EnumFacing.EAST)
				|| this.canCatchFire(world, new BlockPos(x, y - 1, z), EnumFacing.UP)
				|| this.canCatchFire(world, new BlockPos(x, y + 1, z), EnumFacing.DOWN)
				|| this.canCatchFire(world, new BlockPos(x, y, z - 1), EnumFacing.SOUTH)
				|| this.canCatchFire(world, new BlockPos(x, y, z + 1), EnumFacing.NORTH);
	}

	@Override
	public boolean canPlaceBlockAt(final World world, final BlockPos pos) {
		return World.doesBlockHaveSolidTopSurface(world, new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()))
				|| this.canNeighborBurn(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void onNeighborBlockChange(final World world, final BlockPos pos, final IBlockState state,
			final Block block) {
		if (!World.doesBlockHaveSolidTopSurface(world, new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()))
				&& !this.canNeighborBurn(world, pos.getX(), pos.getY(), pos.getZ())) {
			world.setBlockToAir(pos);
		}
	}

	@Override
	public void onBlockAdded(final World world, final BlockPos pos, final IBlockState state) {
		if (world.provider.getDimensionId() > 0 || !MinersDimension.minersPortal.canPlaceBlockAt(world, pos)) {
			if (!World.doesBlockHaveSolidTopSurface(world, new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()))
					&& !this.canNeighborBurn(world, pos.getX(), pos.getY(), pos.getZ())) {
				world.setBlockToAir(pos);
			} else {
				// world.scheduleBlockUpdate(pos.getX(), pos.getY(), pos.getZ(),
				// this, this.tickRate(world) + world.rand.nextInt(10));
			}
		}
	}

	// @Override
	// @SideOnly(Side.CLIENT)
	// public void randomDisplayTick(final World world, final BlockPos pos,
	// final IBlockState state, final Random random) {
	// if (random.nextInt(24) == 0) {
	// world.playSound(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F,
	// "fire.fire",
	// 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
	// }
	// if (!World.doesBlockHaveSolidTopSurface(world, new BlockPos(pos.getX(),
	// pos.getY() - 1, pos.getZ()))
	// && !MinersDimension.portalFire.canCatchFire(world, new
	// BlockPos(pos.getX(), pos.getY() - 1, pos.getZ()),
	// EnumFacing.UP)
	// ) {
	// if (MinersDimension.portalFire.canCatchFire(world, new
	// BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()),
	// EnumFacing.EAST)) {
	// for (int l = 0; l < 2; l++) {
	// final float f = pos.getX() + random.nextFloat() * 0.1F;
	// final float f1 = pos.getY() + random.nextFloat();
	// final float f2 = pos.getZ() + random.nextFloat();
	// world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, f, f1, f2, 0.0D, 0.0D,
	// 0.0D);
	// }
	// }
	// if (MinersDimension.portalFire.canCatchFire(world, new
	// BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()),
	// EnumFacing.WEST)) {
	// for (int l = 0; l < 2; l++) {
	// final float f = pos.getX() + 1 - random.nextFloat() * 0.1F;
	// final float f1 = pos.getY() + random.nextFloat();
	// final float f2 = pos.getZ() + random.nextFloat();
	// world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, f, f1, f2, 0.0D, 0.0D,
	// 0.0D);
	// }
	// }
	// if (MinersDimension.portalFire.canCatchFire(world, new
	// BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1),
	// EnumFacing.SOUTH)) {
	// for (int l = 0; l < 2; l++) {
	// final float f = pos.getX() + random.nextFloat();
	// final float f1 = pos.getY() + random.nextFloat();
	// final float f2 = pos.getZ() + random.nextFloat() * 0.1F;
	// world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, f, f1, f2, 0.0D, 0.0D,
	// 0.0D);
	// }
	// }
	// if (MinersDimension.portalFire.canCatchFire(world, new
	// BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1),
	// EnumFacing.NORTH)) {
	// for (int l = 0; l < 2; l++) {
	// final float f = pos.getX() + random.nextFloat();
	// final float f1 = pos.getY() + random.nextFloat();
	// final float f2 = pos.getZ() + 1 - random.nextFloat() * 0.1F;
	// world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, f, f1, f2, 0.0D, 0.0D,
	// 0.0D);
	// }
	// }
	// if (!MinersDimension.portalFire.canCatchFire(world, new
	// BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()),
	// EnumFacing.DOWN)) {
	// return;
	// }
	// for (int l = 0; l < 2; l++) {
	// final float f = pos.getX() + random.nextFloat();
	// final float f1 = pos.getY() + 1 - random.nextFloat() * 0.1F;
	// final float f2 = pos.getZ() + random.nextFloat();
	// world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, f, f1, f2, 0.0D, 0.0D,
	// 0.0D);
	// continue;
	//
	// // for (int a = 0; a < 3; a++) { final float b = p_149734_2_ +
	// // p_149734_5_.nextFloat(); final float b1 = p_149734_3_ +
	// // p_149734_5_.nextFloat() 0.5F + 0.5F; final float b2 =
	// // p_149734_4_ + p_149734_5_.nextFloat();
	// // p_149734_1_.spawnParticle("largesmoke", b, b1, b2, 0.0D,
	// // 0.0D, 0.0D); }
	//
	// }
	// }
	// }
}
