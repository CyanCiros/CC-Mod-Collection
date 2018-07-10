package cc_harvest.slot;

import cc_harvest.items.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotApiary extends Slot {
	private EntityPlayer thePlayer;

	public SlotApiary(final EntityPlayer entityPlayer,
			final IInventory iInventory, final int slotIndex,
			final int xDisplayPosition, final int yDisplayPosition) {
		super(iInventory, slotIndex, xDisplayPosition, yDisplayPosition);

		this.setThePlayer(entityPlayer);
	}

	@Override
	public int getSlotStackLimit() {
		return 1;
	}

	@Override
	public boolean isItemValid(final ItemStack itemStack) {
		return itemStack.getItem() == ModItems.queenBeeItem;
	}

	@Override
	public void onPickupFromSlot(final EntityPlayer entityPlayer,
			final ItemStack itemStack) {
		super.onPickupFromSlot(entityPlayer, itemStack);
	}

	public EntityPlayer getThePlayer() {
		return this.thePlayer;
	}

	public void setThePlayer(final EntityPlayer thePlayer) {
		this.thePlayer = thePlayer;
	}
}
