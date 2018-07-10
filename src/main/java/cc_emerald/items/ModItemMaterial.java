package cc_emerald.items;

import cc_emerald.CCEmerald;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItemMaterial {
	public static int durability = 50;

	public static int coalHarvestLevel = 1;
	public static int coalMaxUses = 195;
	public static int coalDurability = Math.round(coalMaxUses / durability);
	public static float coalEfficiency = 4.0F;
	public static int coalEnchantability = 11;

	public static int lapisHarvestLevel = 2;
	public static int lapisMaxUses = 225;
	public static int lapisDurability = Math.round(lapisMaxUses / durability);
	public static float lapisEfficiency = 4.0F;
	public static int lapisEnchantability = 15;

	public static int redstoneHarvestLevel = 3;
	public static int redstoneMaxUses = 1405;
	public static int redstoneDurability = Math.round(redstoneMaxUses / durability);
	public static float redstoneEfficiency = 7.0F;
	public static int redstoneEnchantability = 20;

	public static int quartzHarvestLevel = 3;
	public static int quartzMaxUses = 1795;
	public static int quartzDurability = Math.round(quartzMaxUses / durability);
	public static float quartzEfficiency = 9.0F;
	public static int quartzEnchantability = 25;

	public static int glowstoneHarvestLevel = 3;
	public static int glowstoneMaxUses = 2107;
	public static int glowstoneDurability = Math.round(glowstoneMaxUses / durability);
	public static float glowstoneEfficiency = 11.0F;
	public static int glowstoneEnchantability = 29;

	public static int emeraldHarvestLevel = 3;
	public static int emeraldMaxUses = 2341;
	public static int emeraldDurability = Math.round(emeraldMaxUses / durability);
	public static float emeraldEfficiency = 12.0F;
	public static int emeraldEnchantability = 33;

	public static float[] coalDamage = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F, 6.0F };
	public static float[] lapisDamage = { 2.0F, 3.0F, 4.0F, 5.0F, 6.0F, 7.0F };
	public static float[] redstoneDamage = { 3.0F, 4.0F, 5.0F, 6.0F, 7.0F, 8.0F };
	public static float[] quartzDamage = { 3.0F, 4.0F, 5.0F, 6.0F, 7.0F, 8.0F };
	public static float[] glowstoneDamage = { 4.0F, 5.0F, 6.0F, 7.0F, 8.0F, 9.0F };
	public static float[] emeraldDamage = { 5.0F, 6.0F, 7.0F, 8.0F, 9.0F, 10.0F };

	public static float[] woodDamage = { 0.0F, 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
	public static float[] stoneDamage = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F, 6.0F };
	public static float[] ironDamage = { 2.0F, 3.0F, 4.0F, 5.0F, 6.0F, 7.0F };
	public static float[] diamondDamage = { 3.0F, 4.0F, 5.0F, 6.0F, 7.0F, 8.0F };
	public static float[] goldDamage = { 0.0F, 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };

	// Armor
	public static final ArmorMaterial coal = EnumHelper.addArmorMaterial("coal", CCEmerald.MODID + ":" + "coal",
			coalDurability, new int[] { 2, 4, 3, 1 }, coalEnchantability);
	public static final ArmorMaterial lapis = EnumHelper.addArmorMaterial("lapis", CCEmerald.MODID + ":" + "lapis",
			lapisDurability, new int[] { 3, 5, 4, 2 }, lapisEnchantability);
	public static final ArmorMaterial redstone = EnumHelper.addArmorMaterial("redstone", CCEmerald.MODID + ":" + "redstone",
			redstoneDurability, new int[] { 3, 8, 5, 2 }, redstoneEnchantability);
	public static final ArmorMaterial quartz = EnumHelper.addArmorMaterial("quartz", CCEmerald.MODID + ":" + "quartz",
			quartzDurability, new int[] { 4, 9, 7, 3 }, quartzEnchantability);
	public static final ArmorMaterial glowstone = EnumHelper.addArmorMaterial("glowstone",
			CCEmerald.MODID + ":" + "glowstone", glowstoneDurability, new int[] { 4, 11, 8, 4 }, glowstoneEnchantability);
	public static final ArmorMaterial emerald = EnumHelper.addArmorMaterial("emerald", CCEmerald.MODID + ":" + "emerald",
			emeraldDurability, new int[] { 5, 12, 9, 4 }, emeraldEnchantability);

	// Coal
	public static ToolMaterial enumToolMaterialCoal = EnumHelper.addToolMaterial("coal", coalHarvestLevel, coalMaxUses,
			coalEfficiency, coalDamage[0], coalEnchantability);

	public static ToolMaterial enumToolMaterialCoalStaff = EnumHelper.addToolMaterial("coalStaff", 0, coalMaxUses, 0.0F,
			coalDamage[1], coalEnchantability);
	public static ToolMaterial enumToolMaterialCoalKatana = EnumHelper.addToolMaterial("coalKatana", 0, coalMaxUses,
			0.0F, coalDamage[2], coalEnchantability);
	public static ToolMaterial enumToolMaterialCoalKhopesh = EnumHelper.addToolMaterial("coalKhopesh", 0, coalMaxUses,
			0.0F, coalDamage[3], coalEnchantability);
	public static ToolMaterial enumToolMaterialCoalBattleaxe = EnumHelper.addToolMaterial("coalBattleaxe", 0,
			coalMaxUses, 0.0F, coalDamage[4], coalEnchantability);
	public static ToolMaterial enumToolMaterialCoalBigSword = EnumHelper.addToolMaterial("coalBigSword", 0, coalMaxUses,
			0.0F, coalDamage[5], coalEnchantability);

	// Lapis
	public static ToolMaterial enumToolMaterialLapis = EnumHelper.addToolMaterial("lapis", lapisHarvestLevel,
			lapisMaxUses, lapisEfficiency, lapisDamage[0], lapisEnchantability);

	public static ToolMaterial enumToolMaterialLapisStaff = EnumHelper.addToolMaterial("lapisStaff", 0, lapisMaxUses,
			0.0F, lapisDamage[1], lapisEnchantability);
	public static ToolMaterial enumToolMaterialLapisKatana = EnumHelper.addToolMaterial("lapisKatana", 0, lapisMaxUses,
			0.0F, lapisDamage[2], lapisEnchantability);
	public static ToolMaterial enumToolMaterialLapisKhopesh = EnumHelper.addToolMaterial("lapisKhopesh", 0,
			lapisMaxUses, 0.0F, lapisDamage[3], lapisEnchantability);
	public static ToolMaterial enumToolMaterialLapisBattleaxe = EnumHelper.addToolMaterial("lapisBattleaxe", 0,
			lapisMaxUses, 0.0F, lapisDamage[4], lapisEnchantability);
	public static ToolMaterial enumToolMaterialLapisBigSword = EnumHelper.addToolMaterial("lapisBigSword", 0,
			lapisMaxUses, 0.0F, lapisDamage[5], lapisEnchantability);

	// Redstone
	public static ToolMaterial enumToolMaterialRedstone = EnumHelper.addToolMaterial("redstone", redstoneHarvestLevel,
			redstoneMaxUses, redstoneEfficiency, redstoneDamage[0], redstoneEnchantability);

	public static ToolMaterial enumToolMaterialRedstoneStaff = EnumHelper.addToolMaterial("redstoneStaff", 0,
			redstoneMaxUses, 0.0F, redstoneDamage[1], redstoneEnchantability);
	public static ToolMaterial enumToolMaterialRedstoneKatana = EnumHelper.addToolMaterial("redstoneKatana", 0,
			redstoneMaxUses, 0.0F, redstoneDamage[2], redstoneEnchantability);
	public static ToolMaterial enumToolMaterialRedstoneKhopesh = EnumHelper.addToolMaterial("redstoneKhopesh", 0,
			redstoneMaxUses, 0.0F, redstoneDamage[3], redstoneEnchantability);
	public static ToolMaterial enumToolMaterialRedstoneBattleaxe = EnumHelper.addToolMaterial("redstoneBattleaxe", 0,
			redstoneMaxUses, 0.0F, redstoneDamage[4], redstoneEnchantability);
	public static ToolMaterial enumToolMaterialRedstoneBigSword = EnumHelper.addToolMaterial("redstoneBigSword", 0,
			redstoneMaxUses, 0.0F, redstoneDamage[5], redstoneEnchantability);

	// Quartz
	public static ToolMaterial enumToolMaterialQuartz = EnumHelper.addToolMaterial("quartz", quartzHarvestLevel,
			quartzMaxUses, quartzEfficiency, quartzDamage[0], quartzEnchantability);

	public static ToolMaterial enumToolMaterialQuartzStaff = EnumHelper.addToolMaterial("quartzStaff", 0, quartzMaxUses,
			0.0F, quartzDamage[1], quartzEnchantability);
	public static ToolMaterial enumToolMaterialQuartzKatana = EnumHelper.addToolMaterial("quartzKatana", 0,
			quartzMaxUses, 0.0F, quartzDamage[2], quartzEnchantability);
	public static ToolMaterial enumToolMaterialQuartzKhopesh = EnumHelper.addToolMaterial("quartzKhopesh", 0,
			quartzMaxUses, 0.0F, quartzDamage[3], quartzEnchantability);
	public static ToolMaterial enumToolMaterialQuartzBattleaxe = EnumHelper.addToolMaterial("quartzBattleaxe", 0,
			quartzMaxUses, 0.0F, quartzDamage[4], quartzEnchantability);
	public static ToolMaterial enumToolMaterialQuartzBigSword = EnumHelper.addToolMaterial("quartzBigSword", 0,
			quartzMaxUses, 0.0F, quartzDamage[5], quartzEnchantability);

	// Glowstone
	public static ToolMaterial enumToolMaterialGlowstone = EnumHelper.addToolMaterial("glowstone",
			glowstoneHarvestLevel, glowstoneMaxUses, glowstoneEfficiency, glowstoneDamage[0], glowstoneEnchantability);

	public static ToolMaterial enumToolMaterialGlowstoneStaff = EnumHelper.addToolMaterial("glowstoneStaff", 0,
			glowstoneMaxUses, 0.0F, glowstoneDamage[1], glowstoneEnchantability);
	public static ToolMaterial enumToolMaterialGlowstoneKatana = EnumHelper.addToolMaterial("glowstoneKatana", 0,
			glowstoneMaxUses, 0.0F, glowstoneDamage[2], glowstoneEnchantability);
	public static ToolMaterial enumToolMaterialGlowstoneKhopesh = EnumHelper.addToolMaterial("glowstoneKhopesh", 0,
			glowstoneMaxUses, 0.0F, glowstoneDamage[3], glowstoneEnchantability);
	public static ToolMaterial enumToolMaterialGlowstoneBattleaxe = EnumHelper.addToolMaterial("glowstoneBattleaxe", 0,
			glowstoneMaxUses, 0.0F, glowstoneDamage[4], glowstoneEnchantability);
	public static ToolMaterial enumToolMaterialGlowstoneBigSword = EnumHelper.addToolMaterial("glowstoneBigSword", 0,
			glowstoneMaxUses, 0.0F, glowstoneDamage[5], glowstoneEnchantability);

	// Emerald
	public static ToolMaterial enumToolMaterialEmerald = EnumHelper.addToolMaterial("Emerald", emeraldHarvestLevel,
			emeraldMaxUses, emeraldEfficiency, emeraldDamage[0], emeraldEnchantability);

	public static ToolMaterial enumToolMaterialEmeraldStaff = EnumHelper.addToolMaterial("emeraldStaff", 0,
			emeraldMaxUses, 0.0F, emeraldDamage[1], emeraldEnchantability);
	public static ToolMaterial enumToolMaterialEmeraldKatana = EnumHelper.addToolMaterial("emeraldKatana", 0,
			emeraldMaxUses, 0.0F, emeraldDamage[2], emeraldEnchantability);
	public static ToolMaterial enumToolMaterialEmeraldKhopesh = EnumHelper.addToolMaterial("emeraldKhopesh", 0,
			emeraldMaxUses, 0.0F, emeraldDamage[3], emeraldEnchantability);
	public static ToolMaterial enumToolMaterialEmeraldBattleaxe = EnumHelper.addToolMaterial("emeraldBattleaxe", 0,
			emeraldMaxUses, 0.0F, emeraldDamage[4], emeraldEnchantability);
	public static ToolMaterial enumToolMaterialEmeraldBigSword = EnumHelper.addToolMaterial("emeraldBigSword", 0,
			emeraldMaxUses, 0.0F, emeraldDamage[5], emeraldEnchantability);

	// Wood
	public static ToolMaterial enumToolMaterialWoodStaff = EnumHelper.addToolMaterial("woodStaff", 0,
			ToolMaterial.WOOD.getMaxUses(), 0.0F, woodDamage[1], ToolMaterial.WOOD.getEnchantability());
	public static ToolMaterial enumToolMaterialWoodKatana = EnumHelper.addToolMaterial("woodKatana", 0,
			ToolMaterial.WOOD.getMaxUses(), 0.0F, woodDamage[2], ToolMaterial.WOOD.getEnchantability());
	public static ToolMaterial enumToolMaterialWoodKhopesh = EnumHelper.addToolMaterial("woodKhopesh", 0,
			ToolMaterial.WOOD.getMaxUses(), 0.0F, woodDamage[3], ToolMaterial.WOOD.getEnchantability());
	public static ToolMaterial enumToolMaterialWoodBattleaxe = EnumHelper.addToolMaterial("woodBattleaxe", 0,
			ToolMaterial.WOOD.getMaxUses(), 0.0F, woodDamage[4], ToolMaterial.WOOD.getEnchantability());
	public static ToolMaterial enumToolMaterialWoodBigSword = EnumHelper.addToolMaterial("woodBigSword", 0,
			ToolMaterial.WOOD.getMaxUses(), 0.0F, woodDamage[5], ToolMaterial.WOOD.getEnchantability());

	// Stone
	public static ToolMaterial enumToolMaterialStoneStaff = EnumHelper.addToolMaterial("stoneStaff", 0,
			ToolMaterial.STONE.getMaxUses(), 0.0F, stoneDamage[1], ToolMaterial.STONE.getEnchantability());
	public static ToolMaterial enumToolMaterialStoneKatana = EnumHelper.addToolMaterial("stoneKatana", 0,
			ToolMaterial.STONE.getMaxUses(), 0.0F, stoneDamage[2], ToolMaterial.STONE.getEnchantability());
	public static ToolMaterial enumToolMaterialStoneKhopesh = EnumHelper.addToolMaterial("stoneKhopesh", 0,
			ToolMaterial.STONE.getMaxUses(), 0.0F, stoneDamage[3], ToolMaterial.STONE.getEnchantability());
	public static ToolMaterial enumToolMaterialStoneBattleaxe = EnumHelper.addToolMaterial("stoneBattleaxe", 0,
			ToolMaterial.STONE.getMaxUses(), 0.0F, stoneDamage[4], ToolMaterial.STONE.getEnchantability());
	public static ToolMaterial enumToolMaterialStoneBigSword = EnumHelper.addToolMaterial("stoneBigSword", 0,
			ToolMaterial.STONE.getMaxUses(), 0.0F, stoneDamage[5], ToolMaterial.STONE.getEnchantability());

	// Iron
	public static ToolMaterial enumToolMaterialIronStaff = EnumHelper.addToolMaterial("ironStaff", 0,
			ToolMaterial.IRON.getMaxUses(), 0.0F, ironDamage[1], ToolMaterial.IRON.getEnchantability());
	public static ToolMaterial enumToolMaterialIronKatana = EnumHelper.addToolMaterial("ironKatana", 0,
			ToolMaterial.IRON.getMaxUses(), 0.0F, ironDamage[2], ToolMaterial.IRON.getEnchantability());
	public static ToolMaterial enumToolMaterialIronKhopesh = EnumHelper.addToolMaterial("ironKhopesh", 0,
			ToolMaterial.IRON.getMaxUses(), 0.0F, ironDamage[3], ToolMaterial.IRON.getEnchantability());
	public static ToolMaterial enumToolMaterialIronBattleaxe = EnumHelper.addToolMaterial("ironBattleaxe", 0,
			ToolMaterial.IRON.getMaxUses(), 0.0F, ironDamage[4], ToolMaterial.IRON.getEnchantability());
	public static ToolMaterial enumToolMaterialIronBigSword = EnumHelper.addToolMaterial("ironBigSword", 0,
			ToolMaterial.IRON.getMaxUses(), 0.0F, ironDamage[5], ToolMaterial.IRON.getEnchantability());

	// Diamond
	public static ToolMaterial enumToolMaterialDiamondStaff = EnumHelper.addToolMaterial("diamondStaff", 0,
			ToolMaterial.EMERALD.getMaxUses(), 0.0F, diamondDamage[1], ToolMaterial.EMERALD.getEnchantability());
	public static ToolMaterial enumToolMaterialDiamondKatana = EnumHelper.addToolMaterial("diamondKatana", 0,
			ToolMaterial.EMERALD.getMaxUses(), 0.0F, diamondDamage[2], ToolMaterial.EMERALD.getEnchantability());
	public static ToolMaterial enumToolMaterialDiamondKhopesh = EnumHelper.addToolMaterial("diamondKhopesh", 0,
			ToolMaterial.EMERALD.getMaxUses(), 0.0F, diamondDamage[3], ToolMaterial.EMERALD.getEnchantability());
	public static ToolMaterial enumToolMaterialDiamondBattleaxe = EnumHelper.addToolMaterial("diamondBattleaxe", 0,
			ToolMaterial.EMERALD.getMaxUses(), 0.0F, diamondDamage[4], ToolMaterial.EMERALD.getEnchantability());
	public static ToolMaterial enumToolMaterialDiamondBigSword = EnumHelper.addToolMaterial("diamondBigSword", 0,
			ToolMaterial.EMERALD.getMaxUses(), 0.0F, diamondDamage[5], ToolMaterial.EMERALD.getEnchantability());

	// Gold
	public static ToolMaterial enumToolMaterialGoldStaff = EnumHelper.addToolMaterial("goldStaff", 0,
			ToolMaterial.GOLD.getMaxUses(), 0.0F, goldDamage[1], ToolMaterial.GOLD.getEnchantability());
	public static ToolMaterial enumToolMaterialGoldKatana = EnumHelper.addToolMaterial("goldKatana", 0,
			ToolMaterial.GOLD.getMaxUses(), 0.0F, goldDamage[2], ToolMaterial.GOLD.getEnchantability());
	public static ToolMaterial enumToolMaterialGoldKhopesh = EnumHelper.addToolMaterial("goldKhopesh", 0,
			ToolMaterial.GOLD.getMaxUses(), 0.0F, goldDamage[3], ToolMaterial.GOLD.getEnchantability());
	public static ToolMaterial enumToolMaterialGoldBattleaxe = EnumHelper.addToolMaterial("goldBattleaxe", 0,
			ToolMaterial.GOLD.getMaxUses(), 0.0F, goldDamage[4], ToolMaterial.GOLD.getEnchantability());
	public static ToolMaterial enumToolMaterialGoldBigSword = EnumHelper.addToolMaterial("goldBigSword", 0,
			ToolMaterial.GOLD.getMaxUses(), 0.0F, goldDamage[5], ToolMaterial.GOLD.getEnchantability());
}
