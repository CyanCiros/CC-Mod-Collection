package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.ItemFood;

public class ModAppleEmerald extends ItemFood {
	public ModAppleEmerald(final int amount, final boolean isWolfFood) {
		super(amount, isWolfFood);
		this.setCreativeTab(CCEmerald.creativeTab);
	}

	public ModAppleEmerald(final int amount, final float saturation, final boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(CCEmerald.creativeTab);
	}
}
