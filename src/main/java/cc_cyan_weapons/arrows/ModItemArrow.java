package cc_cyan_weapons.arrows;

import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.item.Item;

public class ModItemArrow extends Item {
	public ModItemArrow(final String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
	}
}
