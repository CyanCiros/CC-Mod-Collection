package cc_harvest.items;

import java.util.Random;

import cc_harvest.CCHarvest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemPacket extends Item {
	private final ModItemSeeds seeds;
	private final Random random;

	public ModItemPacket(final String name, final ModItemSeeds seeds) {
		this.setUnlocalizedName(name);
		this.setMaxStackSize(64);
		this.setCreativeTab(CCHarvest.creativeTab);

		this.seeds = seeds;
		this.random = new Random();
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		itemStack.stackSize--;

		final ItemStack newItemStack = new ItemStack(this.seeds, this.random.nextInt(3) + 2);
		final EntityItem entityItem = new EntityItem(world, entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ,
				newItemStack);

		if (!world.isRemote) {
			world.spawnEntityInWorld(entityItem);
		}

		return itemStack;
	}
}
