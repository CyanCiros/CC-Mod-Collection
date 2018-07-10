package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemEnderSword extends ItemSword {
	public ItemEnderSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.enderSwordRightClickEffect) {
			if (!world.isRemote) {
				final Vec3 look = entityPlayer.getLookVec();
				final EntityEnderPearl enderPearl = new EntityEnderPearl(world, entityPlayer);
				entityPlayer.setPosition(entityPlayer.posX + look.xCoord * 5.0D, entityPlayer.posY + look.yCoord * 5.0D,
						entityPlayer.posZ + look.zCoord * 5.0D);

				world.spawnEntityInWorld(enderPearl);

				entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 240, 0));

				itemStack.damageItem(6, entityPlayer);
			}
		}
		return itemStack;
	}
}
