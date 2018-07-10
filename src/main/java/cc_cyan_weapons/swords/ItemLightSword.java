package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemLightSword extends ItemSword {
	public ItemLightSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.lightSwordRightClickEffect) {
			entityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));

			itemStack.damageItem(3, entityPlayer);
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.lightSwordHitEntityEffect) {
			entity1.addPotionEffect(new PotionEffect(Potion.weakness.id, 180, 0));
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
