package cc_harvest.container;

import cc_harvest.entity.TileEntityStorageBox;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerStorageBox extends Container {
	private final TileEntityStorageBox tileEntity;
	private final int numRows;

	public ContainerStorageBox(final InventoryPlayer playerInventory, final TileEntityStorageBox tileEntity) {
		this.tileEntity = tileEntity;
		this.numRows = tileEntity.getSizeInventory() / 9;
		final int i = (this.numRows - 4) * 18;
		int j;
		int k;

		for (j = 0; j < this.numRows; ++j) {
			for (k = 0; k < 9; ++k) {
				this.addSlotToContainer(new Slot(tileEntity, k + j * 9, 8 + k * 18, 19 + j * 18));
			}
		}

		for (j = 0; j < 3; ++j) {
			for (k = 0; k < 9; ++k) {
				this.addSlotToContainer(new Slot(playerInventory, k + j * 9 + 9, 8 + k * 18, 102 + j * 18 + i));
			}
		}

		for (j = 0; j < 9; ++j) {
			this.addSlotToContainer(new Slot(playerInventory, j, 8 + j * 18, 160 + i));
		}
	}

	@Override
	public boolean canInteractWith(final EntityPlayer playerIn) {
		return this.tileEntity.isUseableByPlayer(playerIn);
	}

	@Override
	public ItemStack transferStackInSlot(final EntityPlayer playerIn, final int index) {
		ItemStack itemstack = null;
		final Slot slot = (Slot) this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack()) {
			final ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (index < this.numRows * 9) {
				if (!this.mergeItemStack(itemstack1, this.numRows * 9, this.inventorySlots.size(), true)) {
					return null;
				}
			} else if (!this.mergeItemStack(itemstack1, 0, this.numRows * 9, false)) {
				return null;
			}

			if (itemstack1.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}

	@Override
	public void onContainerClosed(final EntityPlayer playerIn) {
		super.onContainerClosed(playerIn);
		this.tileEntity.closeInventory(playerIn);
	}

	public IInventory getLowerChestInventory() {
		return this.tileEntity;
	}
}
