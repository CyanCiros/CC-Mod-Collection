package cc_cyan_weapons.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItemMaterial {
	public static int cyanMaxUses = 2342;
	public static int cyanEnchantability = 30;

	public static ToolMaterial dam7 = EnumHelper.addToolMaterial("dam7", 0,
			cyanMaxUses, 0.0F, 3.0F, cyanEnchantability);
	public static ToolMaterial dam8 = EnumHelper.addToolMaterial("dam8", 0,
			cyanMaxUses, 0.0F, 4.0F, cyanEnchantability);
	public static ToolMaterial dam9 = EnumHelper.addToolMaterial("dam9", 0,
			cyanMaxUses, 0.0F, 5.0F, cyanEnchantability);
	public static ToolMaterial dam10 = EnumHelper.addToolMaterial("dam10", 0,
			cyanMaxUses, 0.0F, 6.0F, cyanEnchantability);
	public static ToolMaterial dam11 = EnumHelper.addToolMaterial("dam11", 0,
			cyanMaxUses, 0.0F, 7.0F, cyanEnchantability);
	public static ToolMaterial dam12 = EnumHelper.addToolMaterial("dam12", 0,
			cyanMaxUses, 0.0F, 8.0F, cyanEnchantability);

	public static ToolMaterial essence = EnumHelper.addToolMaterial("essence",
			0, cyanMaxUses, 0.0F, 0.0F, cyanEnchantability);
}
