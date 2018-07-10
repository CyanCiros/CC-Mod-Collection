package cc_harvest.slot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotResult extends Slot {
	@SuppressWarnings("unused")
	private final EntityPlayer thePlayer;

	public SlotResult(final EntityPlayer entityPlayer,
			final IInventory iInventory, final int slotIndex,
			final int xDisplayPosition, final int yDisplayPosition) {
		super(iInventory, slotIndex, xDisplayPosition, yDisplayPosition);

		this.thePlayer = entityPlayer;
	}

	@Override
	public boolean isItemValid(final ItemStack itemStack) {
		return false;
	}

	@Override
	public void onPickupFromSlot(final EntityPlayer entityPlayer,
			final ItemStack itemStack) {
		super.onPickupFromSlot(entityPlayer, itemStack);
	}
}
