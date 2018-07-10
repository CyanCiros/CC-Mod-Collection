package cc_mob_drops.items;

import cc_mob_drops.CCMobDrops;
import net.minecraft.item.Item;

public class ModItem extends Item {
	public ModItem(final String name) {
		this.setUnlocalizedName(name);
		this.setMaxStackSize(64);
		this.setCreativeTab(CCMobDrops.creativeTab);
	}

	public ModItem(final String name, final int stackSize) {
		this.setUnlocalizedName(name);
		this.setMaxStackSize(stackSize);
		this.setCreativeTab(CCMobDrops.creativeTab);
	}
}
