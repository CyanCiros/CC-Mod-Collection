package cc_mob_drops.items;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItemMaterial {
	public static int creeperDurability = 5;
	public static int creeperEnchantability = 13;

	public static int wolfDurability = 5;
	public static int wolfEnchantability = 13;

	public static int enderDurability = 37;
	public static int enderEnchantability = 26;

	public static int magmaGooHarvestLevel = 2;
	public static int magmaGooMaxUses = ToolMaterial.IRON.getMaxUses();
	public static float magmaGooEfficiency = 6.0F;
	public static int magmaGooEnchantability = ToolMaterial.IRON.getEnchantability();
	public static float magmaGooDamage = 2.0F;

	public static int gooHarvestLevel = 1;
	public static int gooMaxUses = ToolMaterial.STONE.getMaxUses();
	public static float gooEfficiency = 4.0F;
	public static int gooEnchantability = ToolMaterial.STONE.getEnchantability();
	public static float gooDamage = 1.0F;

	public static int zombieHarvestLevel = 1;
	public static int zombieMaxUses = ToolMaterial.STONE.getMaxUses();
	public static float zombieEfficiency = 4.0F;
	public static int zombieEnchantability = ToolMaterial.STONE.getEnchantability();
	public static float zombieDamage = 1.0F;

	public static int spiderHarvestLevel = 1;
	public static int spiderMaxUses = ToolMaterial.STONE.getMaxUses();
	public static float spiderEfficiency = 4.0F;
	public static int spiderEnchantability = ToolMaterial.STONE.getEnchantability();
	public static float spiderDamage = 1.0F;

	// Armor
	public static ArmorMaterial creeperArmor = EnumHelper.addArmorMaterial("creeper", "creeper", creeperDurability,
			new int[] { 2, 5, 4, 1 }, creeperEnchantability);
	public static ArmorMaterial wolfArmor = EnumHelper.addArmorMaterial("wolf", "wolf", wolfDurability,
			new int[] { 2, 5, 4, 1 }, wolfEnchantability);
	public static ArmorMaterial enderArmor = EnumHelper.addArmorMaterial("ender", "ender", enderDurability,
			new int[] { 4, 10, 7, 3 }, enderEnchantability);

	public static ToolMaterial toolMagmaGoo = EnumHelper.addToolMaterial("magmaGoo", magmaGooHarvestLevel,
			magmaGooMaxUses, magmaGooEfficiency, magmaGooDamage, magmaGooEnchantability);
	public static ToolMaterial toolGoo = EnumHelper.addToolMaterial("goo", gooHarvestLevel, gooMaxUses, gooEfficiency,
			gooDamage, gooEnchantability);
	public static ToolMaterial toolZombie = EnumHelper.addToolMaterial("zombie", zombieHarvestLevel, zombieMaxUses,
			zombieEfficiency, zombieDamage, zombieEnchantability);
	public static ToolMaterial toolSpider = EnumHelper.addToolMaterial("spider", spiderHarvestLevel, spiderMaxUses,
			spiderEfficiency, spiderDamage, spiderEnchantability);
}
