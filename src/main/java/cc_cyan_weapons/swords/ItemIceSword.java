package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemIceSword extends ItemSword {
	public ItemIceSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.iceSwordRightClickEffect) {
			final MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world,
					entityPlayer, true);

			if (movingobjectposition == null) {
				return itemStack;
			}
			if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
				final int x = movingobjectposition.getBlockPos().getX();
				final int y = movingobjectposition.getBlockPos().getY();
				final int z = movingobjectposition.getBlockPos().getZ();

				if (!world.isBlockModifiable(entityPlayer, new BlockPos(x, y, z))) {
					return itemStack;
				}
				if (!entityPlayer.canPlayerEdit(new BlockPos(x, y, z), movingobjectposition.sideHit, itemStack)) {
					return itemStack;
				}
				if (world.isAirBlock(new BlockPos(x + 1, y + 2, z - 1))) {
					world.setBlockState(new BlockPos(x + 1, y + 2, z - 1), Blocks.ice.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 3, y + 2, z - 1))) {
					world.setBlockState(new BlockPos(x - 3, y + 2, z - 1), Blocks.ice.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 1, y + 2, z + 1))) {
					world.setBlockState(new BlockPos(x - 1, y + 2, z + 1), Blocks.ice.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 1, y + 2, z - 3))) {
					world.setBlockState(new BlockPos(x - 1, y + 2, z - 3), Blocks.ice.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x + 1, y + 1, z - 1))) {
					world.setBlockState(new BlockPos(x + 1, y + 1, z - 1), Blocks.ice.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 3, y + 1, z - 1))) {
					world.setBlockState(new BlockPos(x - 3, y + 1, z - 1), Blocks.ice.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 1, y + 1, z + 1))) {
					world.setBlockState(new BlockPos(x - 1, y + 1, z + 1), Blocks.ice.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 1, y + 1, z - 3))) {
					world.setBlockState(new BlockPos(x - 1, y + 1, z - 3), Blocks.ice.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 1, y + 1, z - 1))) {
					world.setBlockState(new BlockPos(x - 1, y + 1, z - 1), Blocks.snow.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 1, y + 2, z - 1))) {
					world.setBlockState(new BlockPos(x - 1, y + 2, z - 1), Blocks.snow.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(x - 1, y + 3, z - 1))) {
					world.setBlockState(new BlockPos(x - 1, y + 3, z - 1), Blocks.pumpkin.getDefaultState());
				}

				itemStack.damageItem(24, entityPlayer);
			}
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.iceSwordHitEntityEffect) {
			entity1.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 180, 0));
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
