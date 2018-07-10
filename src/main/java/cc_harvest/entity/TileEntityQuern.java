package cc_harvest.entity;

import cc_harvest.recipes.RecipesQuern;
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

public class TileEntityQuern extends TileEntity implements IUpdatePlayerListBox, ISidedInventory {
	private ItemStack[] quernItemStacks = new ItemStack[3];

	public int quernCookTime;
	public int quernBurnTime;
	public int currentQuernBurnTime;

	private String quernCustomName;

	public int quernSlotCount = 2;
	public int inventorySlotCount = 36;
	public int totalSlotCount = this.quernSlotCount + this.inventorySlotCount;

	private static final int[] slotsRight = { 0 };
	private static final int[] slotsLeft = { 1 };

	@Override
	public int getSizeInventory() {
		return this.quernItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(final int index) {
		return this.quernItemStacks[index];
	}

	@Override
	public ItemStack decrStackSize(final int slot, final int amount) {
		if (this.quernItemStacks[slot] != null) {
			if (this.quernItemStacks[slot].stackSize <= amount) {
				final ItemStack itemStack1 = this.quernItemStacks[slot];
				this.quernItemStacks[slot] = null;

				return itemStack1;
			}
			final ItemStack itemStack2 = this.quernItemStacks[slot].splitStack(amount);

			if (this.quernItemStacks[slot].stackSize == 0) {
				this.quernItemStacks[slot] = null;
			}
			return itemStack2;
		}
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(final int index) {
		if (this.quernItemStacks[index] != null) {
			final ItemStack itemstack = this.quernItemStacks[index];
			this.quernItemStacks[index] = null;
			return itemstack;
		}
		return null;
	}

	@Override
	public void setInventorySlotContents(final int index, final ItemStack itemStack) {
		final boolean flag = itemStack != null && itemStack.isItemEqual(this.quernItemStacks[index])
				&& ItemStack.areItemStackTagsEqual(itemStack, this.quernItemStacks[index]);
		this.quernItemStacks[index] = itemStack;

		if (itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
			itemStack.stackSize = this.getInventoryStackLimit();
		}

		if (index == 0 && !flag) {
			this.quernCookTime = 0;
			this.markDirty();
		}
	}

	@Override
	public boolean isUseableByPlayer(final EntityPlayer entityPlayer) {
		return this.worldObj.getTileEntity(this.pos) == this;
	}

	@Override
	public boolean isItemValidForSlot(final int var1, final ItemStack itemStack) {
		return true;
	}

	@Override
	public boolean canInsertItem(final int index, final ItemStack itemStackIn, final EnumFacing direction) {
		return this.isItemValidForSlot(index, itemStackIn);
	}

	@Override
	public void readFromNBT(final NBTTagCompound compound) {
		super.readFromNBT(compound);
		final NBTTagList nbttaglist = compound.getTagList("Items", 10);
		this.quernItemStacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); ++i) {
			final NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			final byte b0 = nbttagcompound1.getByte("Slot");

			if (b0 >= 0 && b0 < this.quernItemStacks.length) {
				this.quernItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		this.quernBurnTime = compound.getShort("BurnTime");
		this.quernCookTime = compound.getShort("CookTime");
		this.currentQuernBurnTime = this.getItemBurnTime(this.quernItemStacks[1]);

		if (compound.hasKey("CustomName", 8)) {
			this.quernCustomName = compound.getString("CustomName");
		}
	}

	@Override
	public void writeToNBT(final NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setShort("BurnTime", (short) this.quernBurnTime);
		compound.setShort("CookTime", (short) this.quernCookTime);
		final NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < this.quernItemStacks.length; ++i) {
			if (this.quernItemStacks[i] != null) {
				final NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.quernItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		compound.setTag("Items", nbttaglist);

		if (this.hasCustomName()) {
			compound.setString("CustomName", this.quernCustomName);
		}
	}

	@Override
	public void update() {
		boolean var2 = false;

		if (this.quernBurnTime > 0) {
			this.quernBurnTime -= 1;
		}
		if (!this.worldObj.isRemote) {
			if (this.quernBurnTime == 0 && this.canRun()) {
				this.currentQuernBurnTime = this.quernBurnTime = this.getItemBurnTime(this.quernItemStacks[1]);
			}
			if (this.canRun()) {
				// BlockQuern.updateBlockState(true, this.worldObj, this.pos);
				this.quernCookTime += 1;

				if (this.quernCookTime == 125) {
					this.quernCookTime = 0;
					this.pressComb();

					var2 = true;
				}
			} else {
				// BlockQuern.updateBlockState(false, this.worldObj, this.pos);
				this.quernCookTime = 0;
			}
			if (var2 != this.quernBurnTime > 0) {
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
		return this.quernCookTime * par1 / 125;
	}

	public boolean isBurning() {
		return this.quernBurnTime > 0;
	}

	public int getDamage(final ItemStack itemStack) {
		return itemStack.getItemDamage();
	}

	private boolean canRun() {
		if (this.quernItemStacks[0] == null) {
			return false;
		}
		final ItemStack itemstack = RecipesQuern.smelting().getSmeltingResult(this.quernItemStacks[0]);

		if (itemstack == null) {
			return false;
		}
		if (this.quernItemStacks[1] == null) {
			return true;
		}
		if (!this.quernItemStacks[1].isItemEqual(itemstack)) {
			return false;
		}
		final int result = this.quernItemStacks[1].stackSize + itemstack.stackSize;

		return result <= this.getInventoryStackLimit() && result <= this.quernItemStacks[1].getMaxStackSize();
	}

	public void pressComb() {
		if (this.canRun()) {
			final ItemStack itemstack = RecipesQuern.smelting().getSmeltingResult(this.quernItemStacks[0]);

			if (this.quernItemStacks[1] == null) {
				this.quernItemStacks[1] = itemstack.copy();
			} else if (this.quernItemStacks[1].getItem() == itemstack.getItem()) {
				this.quernItemStacks[1].stackSize += itemstack.stackSize;
			}
			this.quernItemStacks[0].stackSize -= 1;

			if (this.quernItemStacks[0].stackSize <= 0) {
				this.quernItemStacks[0] = null;
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
			return this.quernBurnTime;
		case 1:
			return this.quernCookTime;
		case 2:
			return this.currentQuernBurnTime;
		default:
			return 0;
		}
	}

	@Override
	public void setField(final int id, final int value) {
		switch (id) {
		case 0:
			this.quernBurnTime = value;
			break;
		case 1:
			this.quernCookTime = value;
			break;
		case 2:
			this.currentQuernBurnTime = value;
			break;
		default:
			break;
		}
	}

	@Override
	public int getFieldCount() {
		return this.quernSlotCount;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.quernItemStacks.length; ++i) {
			this.quernItemStacks[i] = null;
		}
	}

	@Override
	public String getName() {
		return this.hasCustomName() ? this.quernCustomName : "container.presser";
	}

	@Override
	public boolean hasCustomName() {
		return this.quernCustomName != null && this.quernCustomName.length() > 0;
	}

	@Override
	public IChatComponent getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getSlotsForFace(final EnumFacing side) {
		return side == EnumFacing.DOWN ? slotsLeft : side == EnumFacing.UP ? slotsRight : null;
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
