package cc_harvest.items;

import cc_harvest.CCHarvest;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

class ModItemArmor extends ItemArmor {
	public String texture;

	public ModItemArmor(final ArmorMaterial material, final int renderIndex, final String name, final String texture) {
		super(material, 0, renderIndex);
		this.setUnlocalizedName(name);
		this.maxStackSize = 1;
		this.setCreativeTab(CCHarvest.creativeTab);
		this.texture = texture;
	}

	@Override
	public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
		if (slot == 0 || slot == 1 || slot == 3) {
			return CCHarvest.MODID + ":textures/models/armor/" + this.texture + "_1.png";
		} else if (slot == 2) {
			return CCHarvest.MODID + ":textures/models/armor/" + this.texture + "_2.png";
		} else {
			return null;
		}
	}
}
