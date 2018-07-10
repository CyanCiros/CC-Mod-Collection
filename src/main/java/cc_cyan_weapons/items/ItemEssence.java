package cc_cyan_weapons.items;

import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.item.Item;

public class ItemEssence extends Item {
	public ItemEssence(final ToolMaterial toolMaterial, final String name) {
		this.setMaxDamage(toolMaterial.getMaxUses());
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}
}
