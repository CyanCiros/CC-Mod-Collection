package cc_harvest.container;

import cc_harvest.entity.TileEntityChurn;
import cc_harvest.slot.SlotChurn;
import cc_harvest.slot.SlotResult;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerChurn extends Container {
	private final TileEntityChurn tileEntityChurn;
	private int lastCookTime = 0;
	private int lastBurnTime = 0;
	private int lastChurnBurnTime = 0;

	public ContainerChurn(final InventoryPlayer inventoryPlayer, final TileEntityChurn tileEntityChurn) {
		this.tileEntityChurn = tileEntityChurn;

		this.addSlotToContainer(new SlotChurn(inventoryPlayer.player, tileEntityChurn, 0, 56, 17));
		this.addSlotToContainer(new SlotResult(inventoryPlayer.player, tileEntityChurn, 1, 116, 35));

		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 9; x++) {
				this.addSlotToContainer(new Slot(inventoryPlayer, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
			}
		}
		for (int x = 0; x < 9; x++) {
			this.addSlotToContainer(new Slot(inventoryPlayer, x, 8 + x * 18, 142));
		}
	}

	@Override
	public boolean canInteractWith(final EntityPlayer entityPlayer) {
		return this.tileEntityChurn.isUseableByPlayer(entityPlayer);
	}

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		for (int i = 0; i < this.crafters.size(); i++) {
			final ICrafting iCrafting = (ICrafting) this.crafters.get(i);

			if (this.lastCookTime != this.tileEntityChurn.churnCookTime) {
				iCrafting.sendProgressBarUpdate(this, 0, this.tileEntityChurn.churnCookTime);
			}
			if (this.lastBurnTime != this.tileEntityChurn.churnBurnTime) {
				iCrafting.sendProgressBarUpdate(this, 1, this.tileEntityChurn.churnBurnTime);
			}
			if (this.lastChurnBurnTime != this.tileEntityChurn.currentChurnBurnTime) {
				iCrafting.sendProgressBarUpdate(this, 2, this.tileEntityChurn.currentChurnBurnTime);
			}
		}
		this.lastCookTime = this.tileEntityChurn.churnCookTime;
		this.lastBurnTime = this.tileEntityChurn.churnBurnTime;
		this.lastChurnBurnTime = this.tileEntityChurn.currentChurnBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(final int side, final int meta) {
		if (side == 0) {
			this.tileEntityChurn.churnCookTime = meta;
		}
		if (side == 1) {
			this.tileEntityChurn.churnBurnTime = meta;
		}
		if (side == 2) {
			this.tileEntityChurn.currentChurnBurnTime = meta;
		}
	}

	@Override
	public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int index) {
		ItemStack itemstack = null;
		final Slot slot = (Slot) this.inventorySlots.get(index);

		if (slot != null && slot.getHasStack()) {
			final ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (index == 1) {
				if (!this.mergeItemStack(itemstack1, this.tileEntityChurn.churnSlotCount,
						this.tileEntityChurn.totalSlotCount, true)) {
					return null;
				}

				slot.onSlotChange(itemstack1, itemstack);
			} else if (!this.mergeItemStack(itemstack1, this.tileEntityChurn.churnSlotCount,
					this.tileEntityChurn.totalSlotCount, false)) {
				return null;
			}

			if (itemstack1.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}

			if (itemstack1.stackSize == itemstack.stackSize) {
				return null;
			}

			slot.onPickupFromSlot(entityPlayer, itemstack1);
		}

		return itemstack;
	}
}
