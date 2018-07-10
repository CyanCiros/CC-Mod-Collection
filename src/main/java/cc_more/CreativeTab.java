package cc_more;

import cc_more.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {

	public CreativeTab(final String name) {
		super(name);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.meteoriteOre);
	}
}
