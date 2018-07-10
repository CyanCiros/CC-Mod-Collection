package cc_harvest.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.item.ItemStack;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;

public class TileEntityCuttingBoard extends TileEntity implements IUpdatePlayerListBox, ISidedInventory {

	private final ItemStack[] inventory;
	public IInventory craftResult = new InventoryCraftResult();
	public ItemStack[] craftMatrixInventory;

	public TileEntityCuttingBoard() {
		super();
		this.inventory = new ItemStack[32];
		this.craftMatrixInventory = new ItemStack[9];
	}

	@Override
	public int getSizeInventory() {
		return this.inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(final int index) {
		return this.inventory[index];
	}

	@Override
	public ItemStack decrStackSize(final int index, final int count) {
		ItemStack itemStack = this.getStackInSlot(index);

		if (itemStack != null) {
			if (itemStack.stackSize <= count) {
				this.setInventorySlotContents(index, null);
			} else {
				itemStack = itemStack.splitStack(count);

				if (itemStack.stackSize == 0) {
					this.setInventorySlotContents(index, null);
				}
			}
		}
		return itemStack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(final int index) {
		if (this.inventory[index] != null) {
			final ItemStack itemStack = this.inventory[index];
			this.inventory[index] = null;
			return itemStack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(final int index, final ItemStack stack) {
		this.inventory[index] = stack;

		if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
			stack.stackSize = this.getInventoryStackLimit();
		}
		this.markDirty();
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(final EntityPlayer player) {
		return this.worldObj.getTileEntity(this.pos) == this;
	}

	@Override
	public void openInventory(final EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeInventory(final EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isItemValidForSlot(final int index, final ItemStack stack) {
		return true;
	}

	@Override
	public int getField(final int id) {
		return 0;
	}

	@Override
	public void setField(final int id, final int value) {

	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.inventory.length; ++i) {
			this.inventory[i] = null;
		}
	}

	@Override
	public String getName() {
		return "Cutting Board";
	}

	@Override
	public boolean hasCustomName() {
		return false;
	}

	@Override
	public IChatComponent getDisplayName() {
		return null;
	}

	@Override
	public int[] getSlotsForFace(final EnumFacing side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canInsertItem(final int index, final ItemStack itemStackIn, final EnumFacing direction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canExtractItem(final int index, final ItemStack stack, final EnumFacing direction) {
		return true;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}
}
