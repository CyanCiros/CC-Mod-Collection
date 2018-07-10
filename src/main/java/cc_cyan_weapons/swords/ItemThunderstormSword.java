package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemThunderstormSword extends ItemSword {
	public ItemThunderstormSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.thunderstormSwordRightClickEffect) {
			final int x = (int) (entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX));
			final int y = (int) (entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) + 1.62D
					- entityPlayer.getYOffset());
			final int z = (int) (entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ));

			entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 180, 0));

			entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 0));
			entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 1));
			entityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 180, 0));

			entityPlayer.addVelocity(-MathHelper.sin(entityPlayer.rotationYaw * 3.141593F / 180.0F) * y * 0.25F / 8.0D,
					0.1D, MathHelper.cos(entityPlayer.rotationYaw * 3.141593F / 180.0F) * y * 0.25F / 8.0D);

			world.spawnEntityInWorld(new EntityLightningBolt(world, x - 1, y - 1, z - 1));

			itemStack.damageItem(18, entityPlayer);
		}
		return itemStack;
	}
}
