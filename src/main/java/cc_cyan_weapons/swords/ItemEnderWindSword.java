package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemEnderWindSword extends ItemSword {
	public ItemEnderWindSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.enderWindSwordRightClickEffect) {
			if (!world.isRemote) {
				final Vec3 look = entityPlayer.getLookVec();
				final EntityEnderPearl enderPearl = new EntityEnderPearl(world, entityPlayer);
				entityPlayer.setPosition(entityPlayer.posX + look.xCoord * 5.0D, entityPlayer.posY + look.yCoord * 5.0D,
						entityPlayer.posZ + look.zCoord * 5.0D);

				world.spawnEntityInWorld(enderPearl);

				entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 0));
				entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 1));

				entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 240, 0));

				itemStack.damageItem(12, entityPlayer);
			}
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.enderWindSwordHitEntityEffect) {
			final int y = (int) (entity1.prevPosY + (entity1.posY - entity1.prevPosY) + 1.62D - entity1.getYOffset());

			entity1.addVelocity(-MathHelper.sin(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.15F / 8.0D, 0.1D,
					MathHelper.cos(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.15F / 8.0D);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
