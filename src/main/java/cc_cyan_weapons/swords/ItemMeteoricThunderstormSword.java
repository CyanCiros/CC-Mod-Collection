package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemMeteoricThunderstormSword extends ItemSword {
	public ItemMeteoricThunderstormSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.meteoricThunderstormSwordRightClickEffect) {
			final int x = (int) (entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX));
			final int y = (int) (entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) + 1.62D
					- entityPlayer.getYOffset());
			final int z = (int) (entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ));

			entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 180, 0));

			entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 0));
			entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 1));
			entityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 300, 0));

			entityPlayer.addVelocity(-MathHelper.sin(entityPlayer.rotationYaw * 3.141593F / 180.0F) * y * 0.25F / 8.0D,
					0.1D, MathHelper.cos(entityPlayer.rotationYaw * 3.141593F / 180.0F) * y * 0.25F / 8.0D);

			this.placeLightningBolt(world, x + 2, y - 1, z - 1);
			this.placeLightningBolt(world, x - 4, y - 1, z - 1);
			this.placeLightningBolt(world, x - 1, y - 1, z + 2);
			this.placeLightningBolt(world, x - 1, y - 1, z - 4);

			itemStack.damageItem(27, entityPlayer);
		}
		return itemStack;
	}

	private void placeLightningBolt(final World world, final int x, final int y, final int z) {
		for (int vy = -3; vy <= 3; vy++) {
			if (world.isAirBlock(new BlockPos(x, y + vy, z)) && !world.isAirBlock(new BlockPos(x, y + vy - 1, z))) {
				world.spawnEntityInWorld(new EntityLightningBolt(world, x, y + vy, z));

				break;
			}
		}
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.meteoricThunderstormSwordHitEntityEffect) {
			entity1.setFire(9);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
