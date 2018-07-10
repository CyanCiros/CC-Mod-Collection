package cc_harvest.container;

import cc_harvest.entity.TileEntityCuttingBoard;
import cc_harvest.manager.CraftingManagerCuttingBoard;
import cc_harvest.slot.SlotCuttingBoard;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerCuttingBoard extends Container {
	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
	public IInventory craftResult = new InventoryCraftResult();

	public TileEntityCuttingBoard tileEntity;

	private final World world;

	public ContainerCuttingBoard(final InventoryPlayer inventoryPlayer,
			final TileEntityCuttingBoard tileEntityCuttingBoard, final World world) {
		this.tileEntity = tileEntityCuttingBoard;

		this.world = world;

		this.addSlotToContainer(
				new SlotCuttingBoard(inventoryPlayer.player, this.craftMatrix, this.craftResult, 0, 124, 35));

		for (int l = 0; l < 3; l++) {
			for (int i1 = 0; i1 < 3; i1++) {
				this.addSlotToContainer(new Slot(this.craftMatrix, i1 + l * 3, 30 + i1 * 18, 17 + l * 18));
			}
		}
		for (int l = 0; l < 3; l++) {
			for (int i1 = 0; i1 < 9; i1++) {
				this.addSlotToContainer(new Slot(inventoryPlayer, i1 + l * 9 + 9, 8 + i1 * 18, 84 + l * 18));
			}
		}
		for (int l = 0; l < 9; l++) {
			this.addSlotToContainer(new Slot(inventoryPlayer, l, 8 + l * 18, 142));
		}

		this.onCraftMatrixChanged(this.craftMatrix);
	}

	@Override
	public void onCraftMatrixChanged(final IInventory iInventory) {
		this.craftResult.setInventorySlotContents(0,
				CraftingManagerCuttingBoard.getInstance().findMatchingRecipe(this.craftMatrix, this.world));
	}

	@Override
	public boolean canInteractWith(final EntityPlayer entityPlayer) {
		return this.tileEntity.isUseableByPlayer(entityPlayer);
	}

	@Override
	public void onContainerClosed(final EntityPlayer entityPlayer) {
		super.onContainerClosed(entityPlayer);

		if (!this.world.isRemote) {
			for (int i = 0; i < 9; i++) {
				final ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);

				if (itemstack != null) {
					entityPlayer.dropPlayerItemWithRandomChoice(itemstack, false);
				}
			}
		}
	}

	@Override
	public ItemStack transferStackInSlot(final EntityPlayer entityPlayer, final int slotIndex) {
		ItemStack itemstack = null;
		final Slot slot = (Slot) this.inventorySlots.get(slotIndex);

		if (slot != null && slot.getHasStack()) {
			final ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (slotIndex == 0) {
				if (!this.mergeItemStack(itemstack1, 10, 46, true)) {
					return null;
				}
				slot.onSlotChange(itemstack1, itemstack);
			} else if (slotIndex >= 10 && slotIndex < 37) {
				if (!this.mergeItemStack(itemstack1, 37, 46, false)) {
					return null;
				}
			} else if (slotIndex >= 37 && slotIndex < 46) {
				if (!this.mergeItemStack(itemstack1, 10, 37, false)) {
					return null;
				}
			} else if (!this.mergeItemStack(itemstack1, 10, 46, false)) {
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

	@Override
	public boolean canMergeSlot(final ItemStack slack, final Slot slot) {
		return slot.inventory != this.craftResult && super.canMergeSlot(slack, slot);
	}
}
