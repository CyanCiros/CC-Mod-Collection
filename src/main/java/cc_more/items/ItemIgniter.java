package cc_more.items;

import cc_more.CCMore;
import cc_more.world.MinersDimension;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemIgniter extends Item {
	public ItemIgniter(final String name) {
		this.setUnlocalizedName(name);
		this.maxStackSize = 1;
		this.setMaxDamage(64);
		this.setCreativeTab(CCMore.creativeTab);
	}

	@Override
	public boolean onItemUse(final ItemStack stack, final EntityPlayer player, final World world, final BlockPos pos,
			final EnumFacing side, final float hitX, final float hitY, final float hitZ) {
		int vx = pos.getX();
		int vy = pos.getY();
		int vz = pos.getZ();

		if (side == EnumFacing.DOWN) {
			vy--;
		}
		if (side == EnumFacing.UP) {
			vy++;
		}
		if (side == EnumFacing.NORTH) {
			vz--;
		}
		if (side == EnumFacing.SOUTH) {
			vz++;
		}
		if (side == EnumFacing.WEST) {
			vx--;
		}
		if (side == EnumFacing.EAST) {
			vx++;
		}
		if (!player.canPlayerEdit(new BlockPos(vx, vy, vz), side, stack)) {
			return false;
		}
		if (world.isAirBlock(new BlockPos(vx, vy, vz))) {
			world.playSoundEffect(vx + 0.5D, vy + 0.5D, vz + 0.5D, "fire.ignite", 1.0F,
					itemRand.nextFloat() * 0.4F + 0.8F);
			world.setBlockState(new BlockPos(vx, vy, vz), Blocks.fire.getDefaultState());
			// world.setBlockState(new BlockPos(vx, vy, zy),
			// MinersDimension.portalFire.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(vx, vy - 1, vz)).getBlock() == Blocks.diamond_block) {
			for (int ax = -3; ax <= 3; ax++) {
				for (int az = -3; az <= 3; az++) {
					for (int ay = -1; ay <= 3; ay++) {
						if (ay == -1 || ay == 3) {
							world.setBlockState(new BlockPos(vx + ax, vy + ay, vz + az),
									Blocks.quartz_block.getDefaultState());
						} else {
							world.setBlockState(new BlockPos(vx + ax, vy + ay, vz + az), Blocks.air.getDefaultState());
						}
					}
				}
			}

			world.playSoundEffect(vx + 0.5D, vy + 0.5D, vz + 0.5D, "fire.ignite", 1.0F,
					itemRand.nextFloat() * 0.4F + 0.8F);
			world.playSoundEffect(vx + 0.5D, vy + 0.5D, vz + 0.5D, "ambient.cave.cave", 1.0F,
					itemRand.nextFloat() * 0.4F + 0.8F);

			for (int by = 0; by <= 2; by++) {
				if (by < 2) {
					world.setBlockState(new BlockPos(vx + 2, vy + by, vz + 2), Blocks.quartz_block.getDefaultState());
					world.setBlockState(new BlockPos(vx - 2, vy + by, vz + 2), Blocks.quartz_block.getDefaultState());
					world.setBlockState(new BlockPos(vx + 2, vy + by, vz - 2), Blocks.quartz_block.getDefaultState());
					world.setBlockState(new BlockPos(vx - 2, vy + by, vz - 2), Blocks.quartz_block.getDefaultState());
				} else {
					world.setBlockState(new BlockPos(vx + 2, vy + by, vz + 2), Blocks.glowstone.getDefaultState());
					world.setBlockState(new BlockPos(vx - 2, vy + by, vz + 2), Blocks.glowstone.getDefaultState());
					world.setBlockState(new BlockPos(vx + 2, vy + by, vz - 2), Blocks.glowstone.getDefaultState());
					world.setBlockState(new BlockPos(vx - 2, vy + by, vz - 2), Blocks.glowstone.getDefaultState());
				}
				world.setBlockState(new BlockPos(vx, vy + by, vz), MinersDimension.minersPortal.getDefaultState());
			}
		}
		stack.damageItem(1, player);
		return true;
	}
}
