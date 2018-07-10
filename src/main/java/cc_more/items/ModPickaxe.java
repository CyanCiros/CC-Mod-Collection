package cc_more.items;

import cc_more.CCMore;
import net.minecraft.item.ItemPickaxe;

public class ModPickaxe extends ItemPickaxe {

	public ModPickaxe(final ToolMaterial material, final String name) {
		super(material);
		this.setCreativeTab(CCMore.creativeTab);
		this.setUnlocalizedName(name);
	}
}
