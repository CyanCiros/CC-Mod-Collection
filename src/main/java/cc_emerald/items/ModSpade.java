package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemSpade;

public class ModSpade extends ItemSpade {
	public ModSpade(final ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModSpade(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
