package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemEnderFireSword extends ItemSword {
	public ItemEnderFireSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.enderFireSwordRightClickEffect) {
			final int x = (int) (entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX));
			final int y = (int) (entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) + 1.62D
					- entityPlayer.getYOffset());
			final int z = (int) (entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ));

			if (!world.isRemote) {
				final Vec3 look = entityPlayer.getLookVec();
				final EntityEnderPearl enderPearl = new EntityEnderPearl(world, entityPlayer);
				entityPlayer.setPosition(entityPlayer.posX + look.xCoord * 5.0D, entityPlayer.posY + look.yCoord * 5.0D,
						entityPlayer.posZ + look.zCoord * 5.0D);

				this.placeFire(world, x + 2, y - 1, z - 1);
				this.placeFire(world, x + 1, y - 1, z - 3);
				this.placeFire(world, x - 1, y - 1, z - 4);
				this.placeFire(world, x - 3, y - 1, z - 3);
				this.placeFire(world, x - 4, y - 1, z - 1);
				this.placeFire(world, x - 3, y - 1, z + 1);
				this.placeFire(world, x - 1, y - 1, z + 2);
				this.placeFire(world, x + 1, y - 1, z + 1);

				entityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 180, 0));

				world.spawnEntityInWorld(enderPearl);

				entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 240, 0));

				itemStack.damageItem(33, entityPlayer);
			}
		}
		return itemStack;
	}

	private void placeFire(final World world, final int x, final int y, final int z) {
		for (int vy = -3; vy <= 3; vy++) {
			if (world.isAirBlock(new BlockPos(x, y + vy, z)) && !world.isAirBlock(new BlockPos(x, y + vy - 1, z))) {
				world.setBlockState(new BlockPos(x, y + vy, z), Blocks.fire.getDefaultState());

				break;
			}
		}
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.enderFireSwordHitEntityEffect) {
			entity1.setFire(9);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
