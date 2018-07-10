package cc_harvest.items;

import cc_harvest.CCHarvest;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ModItemPotionFood extends ItemFood {
	public ModItemPotionFood(final int healAmount, final float saturation, final boolean wolfsMeat, final String name) {
		super(healAmount, saturation, wolfsMeat);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCHarvest.creativeTab);
		this.setAlwaysEdible();
	}

	@Override
	public EnumAction getItemUseAction(final ItemStack itemStack) {
		return EnumAction.DRINK;
	}
}
