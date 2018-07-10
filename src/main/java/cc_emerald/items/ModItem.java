package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.Item;

public class ModItem extends Item {
	public ModItem(final String name) {
		super();
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
