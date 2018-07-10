package cc_emerald.items;

import cc_emerald.Config;
import cc_emerald.CCEmerald;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModArmor extends ItemArmor {
	public ModArmor(final ArmorMaterial armorMaterial, final int renderIndex, final int armorType) {
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModArmor(final ArmorMaterial armorMaterial, final int renderIndex, final int armorType, final String name) {
		super(armorMaterial, renderIndex, armorType);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	@Override
	public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
		boolean flagEmerald = false;
		boolean flagCoal = false;
		boolean flagRedstone = false;
		boolean flagGlowstone = false;
		boolean flagQuartz = false;
		boolean flagLapis = false;

		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(2) != null
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(0) != null) {
			if (player.inventory.armorItemInSlot(3).getItem() == ModItems.emeraldHelmet
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.emeraldChestplate
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.emeraldLeggings
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.emeraldBoots) {
				flagEmerald = true;
			} else if (player.inventory.armorItemInSlot(3).getItem() == ModItems.coalHelmet
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.coalChestplate
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.coalLeggings
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.coalBoots) {
				flagCoal = true;
			} else if (player.inventory.armorItemInSlot(3).getItem() == ModItems.redstoneHelmet
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.redstoneChestplate
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.redstoneLeggings
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.redstoneBoots) {
				flagRedstone = true;
			} else if (player.inventory.armorItemInSlot(3).getItem() == ModItems.glowstoneHelmet
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.glowstoneChestplate
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.glowstoneLeggings
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.glowstoneBoots) {
				flagGlowstone = true;
			} else if (player.inventory.armorItemInSlot(3).getItem() == ModItems.quartzHelmet
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.quartzChestplate
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.quartzLeggings
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.quartzBoots) {
				flagQuartz = true;
			} else if (player.inventory.armorItemInSlot(3).getItem() == ModItems.lapisHelmet
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.lapisChestplate
					&& player.inventory.armorItemInSlot(1).getItem() == ModItems.lapisLeggings
					&& player.inventory.armorItemInSlot(0).getItem() == ModItems.lapisBoots) {
				flagLapis = true;
			}
		}
		if (flagEmerald && Config.enableEmeraldArmorPotion) {
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 180, 0));
			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 180, 1));
		} else if (flagCoal && Config.enableCoalArmorPotion) {
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 180, 0));
		} else if (flagRedstone && Config.enableRedstoneArmorPotion) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 180, 0));
		} else if (flagGlowstone && Config.enableGlowstoneArmorPotion) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 180, 0));
		} else if (flagQuartz && Config.enableQuartzArmorPotion) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 180, 0));
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 180, 0));
		} else if (flagLapis && Config.enableLapisArmorPotion) {
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 180, 0));
		}
	}
}
