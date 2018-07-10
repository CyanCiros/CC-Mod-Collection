package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ItemBlizzardSword extends ItemSword {
	public ItemBlizzardSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.blizzardSwordRightClickEffect) {
			float closest = 3.4028235E+38F;
			Entity thisOne = null;

			for (int i = 0; i < world.loadedEntityList.size(); i++) {
				if (((Entity) world.loadedEntityList.get(i)).getDistanceToEntity(entityPlayer) < closest) {
					if (world.loadedEntityList.get(i) instanceof EntityLiving) {
						closest = ((Entity) world.loadedEntityList.get(i)).getDistanceToEntity(entityPlayer);
						thisOne = (Entity) world.loadedEntityList.get(i);
					}
				}
			}
			if (thisOne != null) {
				final int x = (int) (thisOne.prevPosX + (thisOne.posX - thisOne.prevPosX));
				final int y = (int) (thisOne.prevPosY + (thisOne.posY - thisOne.prevPosY) + 1.62D
						- thisOne.getYOffset());
				final int z = (int) (thisOne.prevPosZ + (thisOne.posZ - thisOne.prevPosZ));

				if (thisOne.posX < entityPlayer.posX && thisOne.posX - entityPlayer.posX <= 4.0D) {
					if (thisOne.posZ < entityPlayer.posZ && thisOne.posX - entityPlayer.posX <= 4.0D) {
						if (world.isAirBlock(new BlockPos(x, y, z - 1))) {
							world.setBlockState(new BlockPos(x, y, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 2, y, z - 1))) {
							world.setBlockState(new BlockPos(x - 2, y, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y, z))) {
							world.setBlockState(new BlockPos(x - 1, y, z), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y, z - 2))) {
							world.setBlockState(new BlockPos(x - 1, y, z - 2), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x, y - 1, z - 1))) {
							world.setBlockState(new BlockPos(x, y - 1, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 2, y - 1, z - 1))) {
							world.setBlockState(new BlockPos(x - 2, y - 1, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y - 1, z))) {
							world.setBlockState(new BlockPos(x - 1, y - 1, z), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y - 1, z - 2))) {
							world.setBlockState(new BlockPos(x - 1, y - 1, z - 2), Blocks.ice.getDefaultState());
						}
					}
					if (thisOne.posZ > entityPlayer.posZ && entityPlayer.posZ - thisOne.posZ >= -4.0D) {
						if (world.isAirBlock(new BlockPos(x, y, z - 1))) {
							world.setBlockState(new BlockPos(x, y, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 2, y, z - 1))) {
							world.setBlockState(new BlockPos(x - 2, y, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y, z))) {
							world.setBlockState(new BlockPos(x - 1, y, z), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y, z - 2))) {
							world.setBlockState(new BlockPos(x - 1, y, z - 2), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x, y - 1, z - 1))) {
							world.setBlockState(new BlockPos(x, y - 1, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 2, y - 1, z - 1))) {
							world.setBlockState(new BlockPos(x - 2, y - 1, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y - 1, z))) {
							world.setBlockState(new BlockPos(x - 1, y - 1, z), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y - 1, z - 2))) {
							world.setBlockState(new BlockPos(x - 1, y - 1, z - 2), Blocks.ice.getDefaultState());
						}
					}
				}
				if (thisOne.posX > entityPlayer.posX && entityPlayer.posX - thisOne.posX >= -4.0D) {
					if (thisOne.posZ < entityPlayer.posZ && thisOne.posX - entityPlayer.posX <= 4.0D) {
						if (world.isAirBlock(new BlockPos(x, y, z - 1))) {
							world.setBlockState(new BlockPos(x, y, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 2, y, z - 1))) {
							world.setBlockState(new BlockPos(x - 2, y, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y, z))) {
							world.setBlockState(new BlockPos(x - 1, y, z), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y, z - 2))) {
							world.setBlockState(new BlockPos(x - 1, y, z - 2), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x, y - 1, z - 1))) {
							world.setBlockState(new BlockPos(x, y - 1, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 2, y - 1, z - 1))) {
							world.setBlockState(new BlockPos(x - 2, y - 1, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y - 1, z))) {
							world.setBlockState(new BlockPos(x - 1, y - 1, z), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y - 1, z - 2))) {
							world.setBlockState(new BlockPos(x - 1, y - 1, z - 2), Blocks.ice.getDefaultState());
						}
					}
					if (thisOne.posZ > entityPlayer.posZ && entityPlayer.posZ - thisOne.posZ >= -4.0D) {
						if (world.isAirBlock(new BlockPos(x, y, z - 1))) {
							world.setBlockState(new BlockPos(x, y, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 2, y, z - 1))) {
							world.setBlockState(new BlockPos(x - 2, y, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y, z))) {
							world.setBlockState(new BlockPos(x - 1, y, z), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y, z - 2))) {
							world.setBlockState(new BlockPos(x - 1, y, z - 2), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x, y - 1, z - 1))) {
							world.setBlockState(new BlockPos(x, y - 1, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 2, y - 1, z - 1))) {
							world.setBlockState(new BlockPos(x - 2, y - 1, z - 1), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y - 1, z))) {
							world.setBlockState(new BlockPos(x - 1, y - 1, z), Blocks.ice.getDefaultState());
						}
						if (world.isAirBlock(new BlockPos(x - 1, y - 1, z - 2))) {
							world.setBlockState(new BlockPos(x - 1, y - 1, z - 2), Blocks.ice.getDefaultState());
						}
					}
				}
				itemStack.damageItem(24, entityPlayer);
			}
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.blizzardSwordHitEntityEffect) {
			entity1.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 180, 0));
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
