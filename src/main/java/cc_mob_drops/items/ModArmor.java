package cc_mob_drops.items;

import cc_mob_drops.CCMobDrops;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ModArmor extends ItemArmor {
	public String texture;

	public ModArmor(final ArmorMaterial material, final int renderIndex, final int armourType, final String name,
			final String texture) {
		super(material, renderIndex, armourType);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMobDrops.creativeTab);
		this.setMaxStackSize(1);
		this.texture = texture;
	}

	@Override
	public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String layer) {
		if (slot == 0 || slot == 1 || slot == 3) {
			return CCMobDrops.MODID + ":textures/models/armor/" + this.texture + "_1.png";
		} else if (slot == 2) {
			return CCMobDrops.MODID + ":textures/models/armor/" + this.texture + "_2.png";
		} else {
			return null;
		}
	}
}
