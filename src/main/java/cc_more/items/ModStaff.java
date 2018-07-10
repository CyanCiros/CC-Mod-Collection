package cc_more.items;

import cc_more.CCMore;
import net.minecraft.item.ItemSword;

public class ModStaff extends ItemSword {

	public ModStaff(final ToolMaterial material, final String name) {
		super(material);
		this.setCreativeTab(CCMore.creativeTab);
		this.setUnlocalizedName(name);
	}
}
