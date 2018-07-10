package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemSword;

public class ModBattleaxe extends ItemSword {
	public ModBattleaxe(final ToolMaterial toolMaterial) {
		super(toolMaterial);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModBattleaxe(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
