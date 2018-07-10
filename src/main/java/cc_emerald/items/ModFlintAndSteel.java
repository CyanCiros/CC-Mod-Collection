package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemFlintAndSteel;

public class ModFlintAndSteel extends ItemFlintAndSteel {
	public ModFlintAndSteel(final String name) {
		super();
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
