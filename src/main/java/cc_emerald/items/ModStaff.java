package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemSword;

public class ModStaff extends ItemSword {
	public ModStaff(final ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModStaff(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
