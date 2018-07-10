package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemHoe;

public class ModHoe extends ItemHoe {
	public ModHoe(final ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModHoe(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
