package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBeastSword extends ItemSword {
	public ItemBeastSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.beastSwordRightClickEffect) {
			entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 0));

			itemStack.damageItem(3, entityPlayer);
		}
		return itemStack;
	}
}
