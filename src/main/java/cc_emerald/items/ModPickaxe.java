package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemPickaxe;

public class ModPickaxe extends ItemPickaxe {
	protected ModPickaxe(final ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModPickaxe(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
