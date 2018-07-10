package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemThunderShockSword extends ItemSword {
	public ItemThunderShockSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.thunderShockSwordRightClickEffect) {
			final MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world,
					entityPlayer, true);

			if (movingobjectposition == null) {
				return itemStack;
			}
			if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
				final int ex = movingobjectposition.getBlockPos().getX();
				final int ey = movingobjectposition.getBlockPos().getY();
				final int ez = movingobjectposition.getBlockPos().getZ();

				entityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 60, 0));

				world.spawnEntityInWorld(new EntityLightningBolt(world, ex, ey, ez));

				entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 180, 0));

				itemStack.damageItem(9, entityPlayer);
			}
		}
		return itemStack;
	}
}
