package cc_more.items;

import cc_more.CCMore;
import net.minecraft.item.ItemSpade;

public class ModSpade extends ItemSpade {

	public ModSpade(final ToolMaterial material, final String name) {
		super(material);
		this.setCreativeTab(CCMore.creativeTab);
		this.setUnlocalizedName(name);
	}
}
