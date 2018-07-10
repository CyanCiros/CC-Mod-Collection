package cc_harvest.items;

import net.minecraft.item.ItemEditableBook;

public class ModItemBook extends ItemEditableBook {
	public ModItemBook(final String name) {
		this.setUnlocalizedName(name);
		// this.setMaxStackSize(1);
	}

	// @Override
	// public ItemStack onItemRightClick(final ItemStack itemStack, final World
	// world, final EntityPlayer player) {
	// player.openGui(main.instance, GuiHandler.GuiBook, world, (int)
	// player.posX, (int) player.posY,
	// (int) player.posZ);
	// return itemStack;
	// }
}
