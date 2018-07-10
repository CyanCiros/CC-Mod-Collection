package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemDarkNetherSword extends ItemSword {
	public ItemDarkNetherSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.darkNetherSwordRightClickEffect) {
			final int x = (int) (entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX));
			final int y = (int) (entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) + 1.62D
					- entityPlayer.getYOffset());
			final int z = (int) (entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ));

			if (!world.isRemote) {
				final Vec3 look = entityPlayer.getLookVec();
				final EntityWitherSkull witherSkull = new EntityWitherSkull(world, entityPlayer, 0.0D, 0.0D, 0.0D);

				witherSkull.setPosition(entityPlayer.posX, entityPlayer.posY + 1, entityPlayer.posZ);
				witherSkull.accelerationX = look.xCoord;
				witherSkull.accelerationY = look.yCoord;
				witherSkull.accelerationZ = look.zCoord;

				world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D, "mob.wither.idle", 1.0F, 1.0F);

				world.spawnEntityInWorld(witherSkull);

				itemStack.damageItem(3, entityPlayer);
			}
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.darkNetherSwordHitEntityEffect) {
			entity1.addPotionEffect(new PotionEffect(Potion.wither.id, 180, 0));
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
