package cc_more.items;

import cc_more.CCMore;
import net.minecraft.item.ItemHoe;

public class ModHoe extends ItemHoe {

	public ModHoe(final ToolMaterial material, final String name) {
		super(material);
		this.setCreativeTab(CCMore.creativeTab);
		this.setUnlocalizedName(name);
	}
}
