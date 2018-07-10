package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemSword;

public class ModKhopesh extends ItemSword {
	public ModKhopesh(final ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModKhopesh(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
