package cc_more.items;

import cc_more.CCMore;
import net.minecraft.item.ItemAxe;

public class ModAxe extends ItemAxe {

	public ModAxe(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCMore.creativeTab);
		this.setUnlocalizedName(name);
	}
}
