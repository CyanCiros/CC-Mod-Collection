package cc_dungeon_pack;

import java.util.ArrayList;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class Enchantments {
	public final ArrayList<Enchantment> enchantments;
	public final Integer[] enchantmentLevels;

	public final ArrayList<ItemArmor> armorHelmet;
	public final ArrayList<Enchantment> armorHelmetEnchantments;
	public final ArrayList<ItemArmor> armorChestplate;
	public final ArrayList<Enchantment> armorChestplateEnchantments;
	public final ArrayList<ItemArmor> armorLeggings;
	public final ArrayList<Enchantment> armorLeggingsEnchantments;
	public final ArrayList<ItemArmor> armorBoots;
	public final ArrayList<Enchantment> armorBootsEnchantments;

	public final ArrayList<ItemBow> itemBow;
	public final ArrayList<Enchantment> itemBowEnchantments;
	public final ArrayList<ItemAxe> itemAxe;
	public final ArrayList<Enchantment> itemAxeEnchantments;
	public final ArrayList<ItemFishingRod> itemFishingRod;
	public final ArrayList<Enchantment> itemFishingRodEnchantments;
	public final ArrayList<ItemPickaxe> itemPickaxe;
	public final ArrayList<Enchantment> itemPickaxeEnchantments;
	public final ArrayList<ItemSpade> itemShovel;
	public final ArrayList<Enchantment> itemShovelEnchantments;
	public final ArrayList<ItemSword> itemSword;
	public final ArrayList<Enchantment> itemSwordEnchantments;

	public Enchantments() {
		// Enchantment
		this.enchantments = new ArrayList<Enchantment>();
		this.enchantments.add(Enchantment.protection);
		this.enchantments.add(Enchantment.fireProtection);
		this.enchantments.add(Enchantment.featherFalling);
		this.enchantments.add(Enchantment.blastProtection);
		this.enchantments.add(Enchantment.projectileProtection);
		this.enchantments.add(Enchantment.respiration);
		this.enchantments.add(Enchantment.aquaAffinity);
		this.enchantments.add(Enchantment.thorns);
		this.enchantments.add(Enchantment.sharpness);
		this.enchantments.add(Enchantment.smite);
		this.enchantments.add(Enchantment.baneOfArthropods);
		this.enchantments.add(Enchantment.knockback);
		this.enchantments.add(Enchantment.fireAspect);
		this.enchantments.add(Enchantment.looting);
		this.enchantments.add(Enchantment.efficiency);
		this.enchantments.add(Enchantment.silkTouch);
		this.enchantments.add(Enchantment.unbreaking);
		this.enchantments.add(Enchantment.fortune);
		this.enchantments.add(Enchantment.power);
		this.enchantments.add(Enchantment.punch);
		this.enchantments.add(Enchantment.flame);
		this.enchantments.add(Enchantment.infinity);
		this.enchantments.add(Enchantment.luckOfTheSea);
		this.enchantments.add(Enchantment.lure);
		this.enchantments.add(Enchantment.depthStrider);

		// Enchantment Levels
		this.enchantmentLevels = new Integer[64];
		this.enchantmentLevels[Enchantment.protection.effectId] = 4;
		this.enchantmentLevels[Enchantment.fireProtection.effectId] = 4;
		this.enchantmentLevels[Enchantment.featherFalling.effectId] = 4;
		this.enchantmentLevels[Enchantment.blastProtection.effectId] = 4;
		this.enchantmentLevels[Enchantment.projectileProtection.effectId] = 4;
		this.enchantmentLevels[Enchantment.respiration.effectId] = 3;
		this.enchantmentLevels[Enchantment.aquaAffinity.effectId] = 1;
		this.enchantmentLevels[Enchantment.thorns.effectId] = 3;
		this.enchantmentLevels[Enchantment.sharpness.effectId] = 5;
		this.enchantmentLevels[Enchantment.smite.effectId] = 5;
		this.enchantmentLevels[Enchantment.baneOfArthropods.effectId] = 5;
		this.enchantmentLevels[Enchantment.knockback.effectId] = 2;
		this.enchantmentLevels[Enchantment.fireAspect.effectId] = 2;
		this.enchantmentLevels[Enchantment.looting.effectId] = 3;
		this.enchantmentLevels[Enchantment.efficiency.effectId] = 5;
		this.enchantmentLevels[Enchantment.silkTouch.effectId] = 1;
		this.enchantmentLevels[Enchantment.unbreaking.effectId] = 3;
		this.enchantmentLevels[Enchantment.fortune.effectId] = 3;
		this.enchantmentLevels[Enchantment.power.effectId] = 5;
		this.enchantmentLevels[Enchantment.punch.effectId] = 2;
		this.enchantmentLevels[Enchantment.flame.effectId] = 1;
		this.enchantmentLevels[Enchantment.infinity.effectId] = 1;
		this.enchantmentLevels[Enchantment.luckOfTheSea.effectId] = 3;
		this.enchantmentLevels[Enchantment.lure.effectId] = 3;
		this.enchantmentLevels[Enchantment.depthStrider.effectId] = 3;

		// Helmet
		this.armorHelmet = new ArrayList<ItemArmor>();
		this.armorHelmet.add(Items.chainmail_helmet);
		this.armorHelmet.add(Items.diamond_helmet);
		this.armorHelmet.add(Items.golden_helmet);
		this.armorHelmet.add(Items.iron_helmet);
		this.armorHelmet.add(Items.leather_helmet);

		// Helmet - Emerald
		this.armorHelmet.add(cc_emerald.items.ModItems.coalHelmet);
		this.armorHelmet.add(cc_emerald.items.ModItems.lapisHelmet);
		this.armorHelmet.add(cc_emerald.items.ModItems.redstoneHelmet);
		this.armorHelmet.add(cc_emerald.items.ModItems.quartzHelmet);
		this.armorHelmet.add(cc_emerald.items.ModItems.glowstoneHelmet);
		this.armorHelmet.add(cc_emerald.items.ModItems.emeraldHelmet);

		// Helmet - Harvest
		this.armorHelmet
				.add(cc_harvest.items.ModItems.hardenedLeatherHelmetItem);

		// Helmet - Mob Drops
		this.armorHelmet.add(cc_mob_drops.items.ModItems.creeperHelmet);
		this.armorHelmet.add(cc_mob_drops.items.ModItems.wolfHelmet);
		this.armorHelmet.add(cc_mob_drops.items.ModItems.enderHelmet);

		// Helmet Enchantment
		this.armorHelmetEnchantments = new ArrayList<Enchantment>();
		this.armorHelmetEnchantments.add(Enchantment.protection);
		this.armorHelmetEnchantments.add(Enchantment.fireProtection);
		this.armorHelmetEnchantments.add(Enchantment.blastProtection);
		this.armorHelmetEnchantments.add(Enchantment.projectileProtection);
		this.armorHelmetEnchantments.add(Enchantment.respiration);
		this.armorHelmetEnchantments.add(Enchantment.aquaAffinity);
		this.armorHelmetEnchantments.add(Enchantment.thorns);
		this.armorHelmetEnchantments.add(Enchantment.unbreaking);

		// Chestplate
		this.armorChestplate = new ArrayList<ItemArmor>();
		this.armorChestplate.add(Items.chainmail_chestplate);
		this.armorChestplate.add(Items.diamond_chestplate);
		this.armorChestplate.add(Items.golden_chestplate);
		this.armorChestplate.add(Items.iron_chestplate);
		this.armorChestplate.add(Items.leather_chestplate);

		// Chestplate - Emerald
		this.armorChestplate.add(cc_emerald.items.ModItems.coalChestplate);
		this.armorChestplate.add(cc_emerald.items.ModItems.lapisChestplate);
		this.armorChestplate.add(cc_emerald.items.ModItems.redstoneChestplate);
		this.armorChestplate.add(cc_emerald.items.ModItems.quartzChestplate);
		this.armorChestplate.add(cc_emerald.items.ModItems.glowstoneChestplate);
		this.armorChestplate.add(cc_emerald.items.ModItems.emeraldChestplate);

		// Chestplate - Harvest
		this.armorChestplate
				.add(cc_harvest.items.ModItems.hardenedLeatherChestplateItem);

		// Chestplate - Mob Drops
		this.armorChestplate.add(cc_mob_drops.items.ModItems.creeperChestplate);
		this.armorChestplate.add(cc_mob_drops.items.ModItems.wolfChestplate);
		this.armorChestplate.add(cc_mob_drops.items.ModItems.enderChestplate);

		// Chestplate Enchantment
		this.armorChestplateEnchantments = new ArrayList<Enchantment>();
		this.armorChestplateEnchantments.add(Enchantment.protection);
		this.armorChestplateEnchantments.add(Enchantment.fireProtection);
		this.armorChestplateEnchantments.add(Enchantment.blastProtection);
		this.armorChestplateEnchantments.add(Enchantment.projectileProtection);
		this.armorChestplateEnchantments.add(Enchantment.thorns);
		this.armorChestplateEnchantments.add(Enchantment.unbreaking);

		// Leggings
		this.armorLeggings = new ArrayList<ItemArmor>();
		this.armorLeggings.add(Items.chainmail_leggings);
		this.armorLeggings.add(Items.diamond_leggings);
		this.armorLeggings.add(Items.golden_leggings);
		this.armorLeggings.add(Items.iron_leggings);
		this.armorLeggings.add(Items.leather_leggings);

		// Leggings - Emerald
		this.armorLeggings.add(cc_emerald.items.ModItems.coalLeggings);
		this.armorLeggings.add(cc_emerald.items.ModItems.lapisLeggings);
		this.armorLeggings.add(cc_emerald.items.ModItems.redstoneLeggings);
		this.armorLeggings.add(cc_emerald.items.ModItems.quartzLeggings);
		this.armorLeggings.add(cc_emerald.items.ModItems.glowstoneLeggings);
		this.armorLeggings.add(cc_emerald.items.ModItems.emeraldLeggings);

		// Leggings - Harvest
		this.armorLeggings
				.add(cc_harvest.items.ModItems.hardenedLeatherLeggingsItem);

		// Leggings - Mob Drops
		this.armorLeggings.add(cc_mob_drops.items.ModItems.creeperLeggings);
		this.armorLeggings.add(cc_mob_drops.items.ModItems.wolfLeggings);
		this.armorLeggings.add(cc_mob_drops.items.ModItems.enderLeggings);

		// Leggings Enchantment
		this.armorLeggingsEnchantments = new ArrayList<Enchantment>();
		this.armorLeggingsEnchantments.add(Enchantment.protection);
		this.armorLeggingsEnchantments.add(Enchantment.fireProtection);
		this.armorLeggingsEnchantments.add(Enchantment.blastProtection);
		this.armorLeggingsEnchantments.add(Enchantment.projectileProtection);
		this.armorLeggingsEnchantments.add(Enchantment.thorns);
		this.armorLeggingsEnchantments.add(Enchantment.unbreaking);

		// Boots
		this.armorBoots = new ArrayList<ItemArmor>();
		this.armorBoots.add(Items.chainmail_boots);
		this.armorBoots.add(Items.diamond_boots);
		this.armorBoots.add(Items.golden_boots);
		this.armorBoots.add(Items.iron_boots);
		this.armorBoots.add(Items.leather_boots);

		// Boots - Emerald
		this.armorBoots.add(cc_emerald.items.ModItems.coalBoots);
		this.armorBoots.add(cc_emerald.items.ModItems.lapisBoots);
		this.armorBoots.add(cc_emerald.items.ModItems.redstoneBoots);
		this.armorBoots.add(cc_emerald.items.ModItems.quartzBoots);
		this.armorBoots.add(cc_emerald.items.ModItems.glowstoneBoots);
		this.armorBoots.add(cc_emerald.items.ModItems.emeraldBoots);

		// Boots - Harvest
		this.armorBoots.add(cc_harvest.items.ModItems.hardenedLeatherBootsItem);

		// Boots - Mob Drops
		this.armorBoots.add(cc_mob_drops.items.ModItems.creeperBoots);
		this.armorBoots.add(cc_mob_drops.items.ModItems.wolfBoots);
		this.armorBoots.add(cc_mob_drops.items.ModItems.enderBoots);

		// Boots Enchantment
		this.armorBootsEnchantments = new ArrayList<Enchantment>();
		this.armorBootsEnchantments.add(Enchantment.protection);
		this.armorBootsEnchantments.add(Enchantment.fireProtection);
		this.armorBootsEnchantments.add(Enchantment.featherFalling);
		this.armorBootsEnchantments.add(Enchantment.blastProtection);
		this.armorBootsEnchantments.add(Enchantment.projectileProtection);
		this.armorBootsEnchantments.add(Enchantment.thorns);
		this.armorBootsEnchantments.add(Enchantment.unbreaking);
		this.armorBootsEnchantments.add(Enchantment.depthStrider);

		// Bow
		this.itemBow = new ArrayList<ItemBow>();
		this.itemBow.add(Items.bow);

		// Bow - Cyan Weapons
		this.itemBow.add(cc_cyan_weapons.items.ModItems.darkBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.fireBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.lightBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.windBow);

		this.itemBow.add(cc_cyan_weapons.items.ModItems.darkNetherBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.enderPortalBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.iceBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.lightNetherBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.meteorBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.peacefulNatureBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.steamBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.timeBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.windBlastBow);

		this.itemBow.add(cc_cyan_weapons.items.ModItems.blizzardBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.enderFireBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.enderWindBow);
		this.itemBow
		.add(cc_cyan_weapons.items.ModItems.meteoricThunderstormBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.wildNatureBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.windWhirlBow);

		this.itemBow.add(cc_cyan_weapons.items.ModItems.cyanBow);
		this.itemBow.add(cc_cyan_weapons.items.ModItems.triEnderBow);

		// Bow - Emerald
		this.itemBow.add(cc_emerald.items.ModItems.coalBow);
		this.itemBow.add(cc_emerald.items.ModItems.stoneBow);
		this.itemBow.add(cc_emerald.items.ModItems.lapisBow);
		this.itemBow.add(cc_emerald.items.ModItems.ironBow);
		this.itemBow.add(cc_emerald.items.ModItems.goldBow);
		this.itemBow.add(cc_emerald.items.ModItems.redstoneBow);
		this.itemBow.add(cc_emerald.items.ModItems.diamondBow);
		this.itemBow.add(cc_emerald.items.ModItems.quartzBow);
		this.itemBow.add(cc_emerald.items.ModItems.glowstoneBow);
		this.itemBow.add(cc_emerald.items.ModItems.emeraldBow);

		// Bow Enchantment
		this.itemBowEnchantments = new ArrayList<Enchantment>();
		this.itemBowEnchantments.add(Enchantment.power);
		this.itemBowEnchantments.add(Enchantment.punch);
		this.itemBowEnchantments.add(Enchantment.flame);
		this.itemBowEnchantments.add(Enchantment.infinity);
		this.itemBowEnchantments.add(Enchantment.unbreaking);

		// Axe
		this.itemAxe = new ArrayList<ItemAxe>();
		this.itemAxe.add((ItemAxe) Items.diamond_axe);
		this.itemAxe.add((ItemAxe) Items.golden_axe);
		this.itemAxe.add((ItemAxe) Items.iron_axe);
		this.itemAxe.add((ItemAxe) Items.stone_axe);
		this.itemAxe.add((ItemAxe) Items.wooden_axe);

		// Axe - Emerald
		this.itemAxe.add(cc_emerald.items.ModItems.coalAxe);
		this.itemAxe.add(cc_emerald.items.ModItems.lapisAxe);
		this.itemAxe.add(cc_emerald.items.ModItems.redstoneAxe);
		this.itemAxe.add(cc_emerald.items.ModItems.quartzAxe);
		this.itemAxe.add(cc_emerald.items.ModItems.glowstoneAxe);
		this.itemAxe.add(cc_emerald.items.ModItems.emeraldAxe);

		// Axe Enchantment
		this.itemAxeEnchantments = new ArrayList<Enchantment>();
		this.itemAxeEnchantments.add(Enchantment.sharpness);
		this.itemAxeEnchantments.add(Enchantment.smite);
		this.itemAxeEnchantments.add(Enchantment.baneOfArthropods);
		this.itemAxeEnchantments.add(Enchantment.efficiency);
		this.itemAxeEnchantments.add(Enchantment.silkTouch);
		this.itemAxeEnchantments.add(Enchantment.unbreaking);
		this.itemAxeEnchantments.add(Enchantment.fortune);

		// Fishing Rod
		this.itemFishingRod = new ArrayList<ItemFishingRod>();
		this.itemFishingRod.add(Items.fishing_rod);

		// Fishing Rod Enchantment
		this.itemFishingRodEnchantments = new ArrayList<Enchantment>();
		this.itemFishingRodEnchantments.add(Enchantment.unbreaking);
		this.itemFishingRodEnchantments.add(Enchantment.luckOfTheSea);
		this.itemFishingRodEnchantments.add(Enchantment.lure);

		// Pickaxe
		this.itemPickaxe = new ArrayList<ItemPickaxe>();
		this.itemPickaxe.add((ItemPickaxe) Items.diamond_pickaxe);
		this.itemPickaxe.add((ItemPickaxe) Items.golden_pickaxe);
		this.itemPickaxe.add((ItemPickaxe) Items.iron_pickaxe);
		this.itemPickaxe.add((ItemPickaxe) Items.stone_pickaxe);
		this.itemPickaxe.add((ItemPickaxe) Items.wooden_pickaxe);

		// Pickaxe - Emerald
		this.itemPickaxe.add(cc_emerald.items.ModItems.coalPickaxe);
		this.itemPickaxe.add(cc_emerald.items.ModItems.lapisPickaxe);
		this.itemPickaxe.add(cc_emerald.items.ModItems.redstonePickaxe);
		this.itemPickaxe.add(cc_emerald.items.ModItems.quartzPickaxe);
		this.itemPickaxe.add(cc_emerald.items.ModItems.glowstonePickaxe);
		this.itemPickaxe.add(cc_emerald.items.ModItems.emeraldPickaxe);

		// Pickaxe Enchantment
		this.itemPickaxeEnchantments = new ArrayList<Enchantment>();
		this.itemPickaxeEnchantments.add(Enchantment.efficiency);
		this.itemPickaxeEnchantments.add(Enchantment.silkTouch);
		this.itemPickaxeEnchantments.add(Enchantment.unbreaking);
		this.itemPickaxeEnchantments.add(Enchantment.fortune);

		// Shovel
		this.itemShovel = new ArrayList<ItemSpade>();
		this.itemShovel.add((ItemSpade) Items.diamond_shovel);
		this.itemShovel.add((ItemSpade) Items.golden_shovel);
		this.itemShovel.add((ItemSpade) Items.iron_shovel);
		this.itemShovel.add((ItemSpade) Items.stone_shovel);
		this.itemShovel.add((ItemSpade) Items.wooden_shovel);

		// Shovel - Emerald
		this.itemShovel.add(cc_emerald.items.ModItems.coalShovel);
		this.itemShovel.add(cc_emerald.items.ModItems.lapisShovel);
		this.itemShovel.add(cc_emerald.items.ModItems.redstoneShovel);
		this.itemShovel.add(cc_emerald.items.ModItems.quartzShovel);
		this.itemShovel.add(cc_emerald.items.ModItems.glowstoneShovel);
		this.itemShovel.add(cc_emerald.items.ModItems.emeraldShovel);

		// Shovel Enchantment
		this.itemShovelEnchantments = new ArrayList<Enchantment>();
		this.itemShovelEnchantments.add(Enchantment.efficiency);
		this.itemShovelEnchantments.add(Enchantment.silkTouch);
		this.itemShovelEnchantments.add(Enchantment.unbreaking);
		this.itemShovelEnchantments.add(Enchantment.fortune);

		// Sword
		this.itemSword = new ArrayList<ItemSword>();
		this.itemSword.add((ItemSword) Items.diamond_sword);
		this.itemSword.add((ItemSword) Items.golden_sword);
		this.itemSword.add((ItemSword) Items.iron_sword);
		this.itemSword.add((ItemSword) Items.stone_sword);
		this.itemSword.add((ItemSword) Items.wooden_sword);

		// Sword - Cyan Swords
		this.itemSword.add(cc_cyan_weapons.items.ModItems.beastSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.darkSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.earthSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.enderSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.fireSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.lightSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.thunderShockSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.waterSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.windSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.wolfSword);

		this.itemSword.add(cc_cyan_weapons.items.ModItems.darkNetherSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.enderPortalSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.iceSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.lightNetherSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.meteorSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.peacefulNatureSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.steamSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.thunderSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.timeSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.windBlastSword);

		this.itemSword.add(cc_cyan_weapons.items.ModItems.blizzardSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.enderFireSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.enderThunderSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.enderWindSword);
		this.itemSword
		.add(cc_cyan_weapons.items.ModItems.meteoricThunderstormSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.thunderstormSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.wildNatureSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.windWhirlSword);

		this.itemSword.add(cc_cyan_weapons.items.ModItems.cyanSword);
		this.itemSword.add(cc_cyan_weapons.items.ModItems.triEnderSword);

		// Sword - Emerald
		this.itemSword.add(cc_emerald.items.ModItems.woodStaff);
		this.itemSword.add(cc_emerald.items.ModItems.woodBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.woodKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.woodKatana);
		this.itemSword.add(cc_emerald.items.ModItems.woodBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.stoneStaff);
		this.itemSword.add(cc_emerald.items.ModItems.stoneBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.stoneKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.stoneKatana);
		this.itemSword.add(cc_emerald.items.ModItems.stoneBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.coalSword);
		this.itemSword.add(cc_emerald.items.ModItems.coalStaff);
		this.itemSword.add(cc_emerald.items.ModItems.coalBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.coalKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.coalKatana);
		this.itemSword.add(cc_emerald.items.ModItems.coalBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.lapisSword);
		this.itemSword.add(cc_emerald.items.ModItems.lapisStaff);
		this.itemSword.add(cc_emerald.items.ModItems.lapisBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.lapisKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.lapisKatana);
		this.itemSword.add(cc_emerald.items.ModItems.lapisBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.ironStaff);
		this.itemSword.add(cc_emerald.items.ModItems.ironBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.ironKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.ironKatana);
		this.itemSword.add(cc_emerald.items.ModItems.ironBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.goldStaff);
		this.itemSword.add(cc_emerald.items.ModItems.goldBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.goldKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.goldKatana);
		this.itemSword.add(cc_emerald.items.ModItems.goldBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.redstoneSword);
		this.itemSword.add(cc_emerald.items.ModItems.redstoneStaff);
		this.itemSword.add(cc_emerald.items.ModItems.redstoneBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.redstoneKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.redstoneKatana);
		this.itemSword.add(cc_emerald.items.ModItems.redstoneBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.diamondStaff);
		this.itemSword.add(cc_emerald.items.ModItems.diamondBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.diamondKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.diamondKatana);
		this.itemSword.add(cc_emerald.items.ModItems.diamondBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.quartzSword);
		this.itemSword.add(cc_emerald.items.ModItems.quartzStaff);
		this.itemSword.add(cc_emerald.items.ModItems.quartzBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.quartzKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.quartzKatana);
		this.itemSword.add(cc_emerald.items.ModItems.quartzBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.glowstoneSword);
		this.itemSword.add(cc_emerald.items.ModItems.glowstoneStaff);
		this.itemSword.add(cc_emerald.items.ModItems.glowstoneBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.glowstoneKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.glowstoneKatana);
		this.itemSword.add(cc_emerald.items.ModItems.glowstoneBigSword);

		this.itemSword.add(cc_emerald.items.ModItems.emeraldSword);
		this.itemSword.add(cc_emerald.items.ModItems.emeraldStaff);
		this.itemSword.add(cc_emerald.items.ModItems.emeraldBattleaxe);
		this.itemSword.add(cc_emerald.items.ModItems.emeraldKhopesh);
		this.itemSword.add(cc_emerald.items.ModItems.emeraldKatana);
		this.itemSword.add(cc_emerald.items.ModItems.emeraldBigSword);

		// Sword - Mob Drops
		this.itemSword.add(cc_mob_drops.items.ModItems.gooSword);
		this.itemSword.add(cc_mob_drops.items.ModItems.magmaGooSword);
		this.itemSword.add(cc_mob_drops.items.ModItems.spiderLeg);
		this.itemSword.add(cc_mob_drops.items.ModItems.zombieArm);

		// Sword Enchantment
		this.itemSwordEnchantments = new ArrayList<Enchantment>();
		this.itemSwordEnchantments.add(Enchantment.sharpness);
		this.itemSwordEnchantments.add(Enchantment.smite);
		this.itemSwordEnchantments.add(Enchantment.baneOfArthropods);
		this.itemSwordEnchantments.add(Enchantment.knockback);
		this.itemSwordEnchantments.add(Enchantment.fireAspect);
		this.itemSwordEnchantments.add(Enchantment.looting);
		this.itemSwordEnchantments.add(Enchantment.unbreaking);
	}
}
