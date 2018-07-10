package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemAxe;

public class ModAxe extends ItemAxe {
	protected ModAxe(final ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModAxe(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
