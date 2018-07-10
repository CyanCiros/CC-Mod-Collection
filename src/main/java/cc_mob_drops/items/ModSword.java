package cc_mob_drops.items;

import cc_mob_drops.CCMobDrops;
import net.minecraft.item.ItemSword;

public class ModSword extends ItemSword {
	public ModSword(final ToolMaterial material, final String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMobDrops.creativeTab);
	}
}
