package cc_harvest.items;

import java.util.List;

import cc_harvest.CCHarvest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItemBee extends Item {
	public ModItemBee(final String name) {
		this.setUnlocalizedName(name);
		this.maxStackSize = 1;
		this.setMaxDamage(18);
		this.isDamageable();
		this.setCreativeTab(CCHarvest.creativeTab);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
		par3List.add(new ItemStack(par1, 1, 0));
		par3List.add(new ItemStack(par1, 1, 18));
	}
}
