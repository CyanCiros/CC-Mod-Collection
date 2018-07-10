package cc_harvest.entity;

import cc_harvest.recipes.RecipesChurn;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityChurn extends TileEntity implements IUpdatePlayerListBox, ISidedInventory {
	private ItemStack[] churnItemStacks = new ItemStack[3];

	public int churnCookTime;
	public int churnBurnTime;
	public int currentChurnBurnTime;

	private String churnCustomName;

	public int churnSlotCount = 2;
	public int inventorySlotCount = 36;
	public int totalSlotCount = this.churnSlotCount + this.inventorySlotCount;

	private static final int[] slotsRight = { 0 };
	private static final int[] slotsLeft = { 1 };

	@Override
	public int getSizeInventory() {
		return this.churnItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(final int index) {
		return this.churnItemStacks[index];
	}

	@Override
	public ItemStack decrStackSize(final int slot, final int amount) {
		if (this.churnItemStacks[slot] != null) {
			if (this.churnItemStacks[slot].stackSize <= amount) {
				final ItemStack itemStack1 = this.churnItemStacks[slot];
				this.churnItemStacks[slot] = null;

				return itemStack1;
			}
			final ItemStack itemStack2 = this.churnItemStacks[slot].splitStack(amount);

			if (this.churnItemStacks[slot].stackSize == 0) {
				this.churnItemStacks[slot] = null;
			}
			return itemStack2;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(final int index) {
		if (this.churnItemStacks[index] != null) {
			final ItemStack itemstack = this.churnItemStacks[index];
			this.churnItemStacks[index] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(final int index, final ItemStack itemStack) {
		final boolean flag = itemStack != null && itemStack.isItemEqual(this.churnItemStacks[index])
				&& ItemStack.areItemStackTagsEqual(itemStack, this.churnItemStacks[index]);
		this.churnItemStacks[index] = itemStack;

		if (itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
			itemStack.stackSize = this.getInventoryStackLimit();
		}

		if (index == 0 && !flag) {
			this.churnCookTime = 0;
			this.markDirty();
		}
	}

	@Override
	public boolean isUseableByPlayer(final EntityPlayer entityPlayer) {
		return this.worldObj.getTileEntity(this.pos) == this;
	}

	@Override
	public boolean isItemValidForSlot(final int index, final ItemStack itemStack) {
		return index == 0 ? true : false;
	}

	@Override
	public boolean canInsertItem(final int index, final ItemStack itemStackIn, final EnumFacing direction) {
		return this.isItemValidForSlot(index, itemStackIn);
	}

	@Override
	public void readFromNBT(final NBTTagCompound compound) {
		super.readFromNBT(compound);
		final NBTTagList nbttaglist = compound.getTagList("Items", 10);
		this.churnItemStacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); ++i) {
			final NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			final byte b0 = nbttagcompound1.getByte("Slot");

			if (b0 >= 0 && b0 < this.churnItemStacks.length) {
				this.churnItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		this.churnBurnTime = compound.getShort("BurnTime");
		this.churnCookTime = compound.getShort("CookTime");
		this.currentChurnBurnTime = this.getItemBurnTime(this.churnItemStacks[1]);

		if (compound.hasKey("CustomName", 8)) {
			this.churnCustomName = compound.getString("CustomName");
		}
	}

	@Override
	public void writeToNBT(final NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setShort("BurnTime", (short) this.churnBurnTime);
		compound.setShort("CookTime", (short) this.churnCookTime);
		final NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < this.churnItemStacks.length; ++i) {
			if (this.churnItemStacks[i] != null) {
				final NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.churnItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		compound.setTag("Items", nbttaglist);

		if (this.hasCustomName()) {
			compound.setString("CustomName", this.churnCustomName);
		}
	}

	@Override
	public void update() {
		boolean var2 = false;

		if (this.churnBurnTime > 0) {
			this.churnBurnTime -= 1;
		}
		if (!this.worldObj.isRemote) {
			if (this.churnBurnTime == 0 && this.canRun()) {
				this.currentChurnBurnTime = this.churnBurnTime = this.getItemBurnTime(this.churnItemStacks[1]);
			}
			if (this.canRun()) {
				// BlockChurn.updateBlockState(true, this.worldObj, this.pos);
				this.churnCookTime += 1;

				if (this.churnCookTime == 125) {
					this.churnCookTime = 0;
					this.pressComb();

					var2 = true;
				}
			} else {
				// BlockChurn.updateBlockState(false, this.worldObj, this.pos);
				this.churnCookTime = 0;
			}
			if (var2 != this.churnBurnTime > 0) {
				var2 = true;
			}
		}
		if (var2) {
			this.markDirty();
		}
	}

	@SuppressWarnings("unused")
	private int getItemBurnTime(final ItemStack itemStack) {
		return 300;
	}

	@Override
	public Packet getDescriptionPacket() {
		final NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);

		return new S35PacketUpdateTileEntity(this.pos, 1, tag);
	}

	// @Override
	// public void onDataPacket(final NetworkManager net,
	// final S35PacketUpdateTileEntity packet) {
	// this.readFromNBT(packet.func_148857_g());
	// }

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(final int par1) {
		return this.churnCookTime * par1 / 125;
	}

	public boolean isBurning() {
		return this.churnBurnTime > 0;
	}

	public int getDamage(final ItemStack itemStack) {
		return itemStack.getItemDamage();
	}

	private boolean canRun() {
		if (this.churnItemStacks[0] == null) {
			return false;
		}
		final ItemStack itemstack = RecipesChurn.smelting().getSmeltingResult(this.churnItemStacks[0]);

		if (itemstack == null) {
			return false;
		}
		if (this.churnItemStacks[1] == null) {
			return true;
		}
		if (!this.churnItemStacks[1].isItemEqual(itemstack)) {
			return false;
		}
		final int result = this.churnItemStacks[1].stackSize + itemstack.stackSize;

		return result <= this.getInventoryStackLimit() && result <= this.churnItemStacks[1].getMaxStackSize();
	}

	public void pressComb() {
		if (this.canRun()) {
			final ItemStack itemstack = RecipesChurn.smelting().getSmeltingResult(this.churnItemStacks[0]);

			if (this.churnItemStacks[1] == null) {
				this.churnItemStacks[1] = itemstack.copy();
			} else if (this.churnItemStacks[1].getItem() == itemstack.getItem()) {
				this.churnItemStacks[1].stackSize += itemstack.stackSize;
			}
			this.churnItemStacks[0].stackSize -= 1;

			if (this.churnItemStacks[0].stackSize <= 0) {
				this.churnItemStacks[0] = null;
			}
		}
	}

	public void openChest() {
	}

	public void closeChest() {
	}

	public boolean isInvNameLocalized() {
		return false;
	}

	@SuppressWarnings("unused")
	public boolean isStackValidForSlot(final int i, final ItemStack itemstack) {
		return true;
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
	public int getField(final int id) {
		switch (id) {
		case 0:
			return this.churnBurnTime;
		case 1:
			return this.churnCookTime;
		case 2:
			return this.currentChurnBurnTime;
		default:
			return 0;
		}
	}

	@Override
	public void setField(final int id, final int value) {
		switch (id) {
		case 0:
			this.churnBurnTime = value;
			break;
		case 1:
			this.churnCookTime = value;
			break;
		case 2:
			this.currentChurnBurnTime = value;
			break;
		default:
			break;
		}
	}

	@Override
	public int getFieldCount() {
		return this.churnSlotCount;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.churnItemStacks.length; ++i) {
			this.churnItemStacks[i] = null;
		}
	}

	@Override
	public String getName() {
		return this.hasCustomName() ? this.churnCustomName : "container.presser";
	}

	@Override
	public boolean hasCustomName() {
		return this.churnCustomName != null && this.churnCustomName.length() > 0;
	}

	@Override
	public IChatComponent getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getSlotsForFace(final EnumFacing side) {
		return side == EnumFacing.DOWN ? slotsRight : side == EnumFacing.UP ? slotsLeft : null;
	}

	@Override
	public boolean canExtractItem(final int index, final ItemStack stack, final EnumFacing direction) {
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}
}
