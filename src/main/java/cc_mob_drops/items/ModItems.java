package cc_mob_drops.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	// Armor
	public static ItemArmor creeperHelmet;
	public static ItemArmor creeperChestplate;
	public static ItemArmor creeperLeggings;
	public static ItemArmor creeperBoots;

	public static ItemArmor wolfHelmet;
	public static ItemArmor wolfChestplate;
	public static ItemArmor wolfLeggings;
	public static ItemArmor wolfBoots;

	public static ItemArmor enderHelmet;
	public static ItemArmor enderChestplate;
	public static ItemArmor enderLeggings;
	public static ItemArmor enderBoots;

	// Items
	public static ModItem batEars;
	public static ModItem batEyes;
	public static ModItem batFur;
	public static ModItem batWings;
	public static ModItem cowHorn;
	public static ModItem creeperEye;
	public static ModItem creeperSkin;
	public static ModItem enderJewel;
	public static ModItem enderSkin;
	public static ModItem enderTear;
	public static ModItem goo;
	public static ModItem horseHoof;
	public static ModItem horseShoe;
	public static ModItem horseSkin;
	public static ModItem magmaGoo;
	public static ModItem squidEye;
	public static ModItem squidTentacle;
	public static ModItem wolfSkin;

	// Food
	public static ModItemFood bacon;
	public static ModItemFood calamari;
	public static ModItemFood chickenLegs;
	public static ModItemFood cookedCarrot;
	public static ModItemFood cookedCalamari;
	public static ModItemFood cookedChickenLeg;
	public static ModItemFood cookedLambchop;
	public static ModItemFood cookedSquid;
	public static ModItemFood friedEggs;
	public static ModItemFood ham;
	public static ModItemFood pigmanMeat;
	public static ModItemFood rawLambchop;
	public static ModItemFood rawRibs;
	public static ModItemFood ribs;
	public static ModItemFood squid;
	public static ModItemFood zombieBrain;

	// Weapon
	public static ItemSword gooSword;
	public static ItemSword magmaGooSword;
	public static ItemSword spiderLeg;
	public static ItemSword zombieArm;

	public static void main() {
		// Armor
		creeperHelmet = new ModArmor(ModItemMaterial.creeperArmor, 5, 0, "creeperHelmet", "creeper");
		creeperChestplate = new ModArmor(ModItemMaterial.creeperArmor, 5, 1, "creeperChestplate", "creeper");
		creeperLeggings = new ModArmor(ModItemMaterial.creeperArmor, 5, 2, "creeperLeggings", "creeper");
		creeperBoots = new ModArmor(ModItemMaterial.creeperArmor, 5, 3, "creeperBoots", "creeper");

		wolfHelmet = new ModArmor(ModItemMaterial.wolfArmor, 5, 0, "wolfHelmet", "wolf");
		wolfChestplate = new ModArmor(ModItemMaterial.wolfArmor, 5, 1, "wolfChestplate", "wolf");
		wolfLeggings = new ModArmor(ModItemMaterial.wolfArmor, 5, 2, "wolfLeggings", "wolf");
		wolfBoots = new ModArmor(ModItemMaterial.wolfArmor, 5, 3, "wolfBoots", "wolf");

		enderHelmet = new ModArmor(ModItemMaterial.enderArmor, 5, 0, "enderHelmet", "ender");
		enderChestplate = new ModArmor(ModItemMaterial.enderArmor, 5, 1, "enderChestplate", "ender");
		enderLeggings = new ModArmor(ModItemMaterial.enderArmor, 5, 2, "enderLeggings", "ender");
		enderBoots = new ModArmor(ModItemMaterial.enderArmor, 5, 3, "enderBoots", "ender");

		ModItems.registerItem(creeperHelmet);
		ModItems.registerItem(creeperChestplate);
		ModItems.registerItem(creeperLeggings);
		ModItems.registerItem(creeperBoots);

		ModItems.registerItem(wolfHelmet);
		ModItems.registerItem(wolfChestplate);
		ModItems.registerItem(wolfLeggings);
		ModItems.registerItem(wolfBoots);

		ModItems.registerItem(enderHelmet);
		ModItems.registerItem(enderChestplate);
		ModItems.registerItem(enderLeggings);
		ModItems.registerItem(enderBoots);

		// Items
		batEars = new ModItem("batEars");
		batEyes = new ModItem("batEyes");
		batFur = new ModItem("batFur");
		batWings = new ModItem("batWings");
		cowHorn = new ModItem("cowHorn");
		creeperEye = new ModItem("creeperEye");
		creeperSkin = new ModItem("creeperSkin");
		enderJewel = new ModItem("enderJewel");
		enderSkin = new ModItem("enderSkin");
		enderTear = new ModItem("enderTear");
		goo = new ModItem("goo");
		horseHoof = new ModItem("horseHoof");
		horseShoe = new ModItem("horseShoe");
		horseSkin = new ModItem("horseSkin");
		magmaGoo = new ModItem("magmaGoo");
		squidEye = new ModItem("squidEye");
		squidTentacle = new ModItem("squidTentacle");
		wolfSkin = new ModItem("wolfSkin");

		ModItems.registerItem(batEars);
		ModItems.registerItem(batEyes);
		ModItems.registerItem(batFur);
		ModItems.registerItem(batWings);
		ModItems.registerItem(cowHorn);
		ModItems.registerItem(creeperEye);
		ModItems.registerItem(creeperSkin);
		ModItems.registerItem(enderJewel);
		ModItems.registerItem(enderSkin);
		ModItems.registerItem(enderTear);
		ModItems.registerItem(goo);
		ModItems.registerItem(horseHoof);
		ModItems.registerItem(horseShoe);
		ModItems.registerItem(horseSkin);
		ModItems.registerItem(magmaGoo);
		ModItems.registerItem(squidEye);
		ModItems.registerItem(squidTentacle);
		ModItems.registerItem(wolfSkin);

		// Food
		bacon = new ModItemFood("bacon", 4, 4.8F, true);
		calamari = new ModItemFood("calamari", 3, 2.0F, false);
		cookedCarrot = new ModItemFood("cookedCarrot", 4, 6.4F, false);
		cookedCalamari = new ModItemFood("cookedCalamari", 6, 7.2F, true);
		cookedChickenLeg = new ModItemFood("cookedChickenLeg", 4, 4.8F, true);
		cookedLambchop = new ModItemFood("cookedLambchop", 5, 6.0F, true);
		cookedSquid = new ModItemFood("cookedSquid", 4, 4.8F, true);
		chickenLegs = new ModItemFood("chickenLegs", 2, 1.2F, true);
		friedEggs = new ModItemFood("friedEggs", 3, 1.6F, false);
		ham = new ModItemFood("ham", 5, 3.0F, true);
		pigmanMeat = new ModItemFood("pigmanMeat", 2, 0.4F, false);
		rawLambchop = new ModItemFood("rawLambchop", 2, 1.2F, false);
		rawRibs = new ModItemFood("rawRibs", 2, 1.2F, true);
		ribs = new ModItemFood("ribs", 6, 7.2F, true);
		squid = new ModItemFood("squid", 2, 0.4F, false);
		zombieBrain = new ModItemFood("zombieBrain", 2, 0.4F, false);

		ModItems.registerItem(bacon);
		ModItems.registerItem(calamari);
		ModItems.registerItem(chickenLegs);
		ModItems.registerItem(cookedCarrot);
		ModItems.registerItem(cookedCalamari);
		ModItems.registerItem(cookedChickenLeg);
		ModItems.registerItem(cookedLambchop);
		ModItems.registerItem(cookedSquid);
		ModItems.registerItem(friedEggs);
		ModItems.registerItem(ham);
		ModItems.registerItem(pigmanMeat);
		ModItems.registerItem(rawLambchop);
		ModItems.registerItem(rawRibs);
		ModItems.registerItem(ribs);
		ModItems.registerItem(squid);
		ModItems.registerItem(zombieBrain);

		// Weapon
		gooSword = new ModSword(ModItemMaterial.toolGoo, "gooSword");
		magmaGooSword = new ModSword(ModItemMaterial.toolMagmaGoo, "magmaGooSword");
		spiderLeg = new ModSword(ModItemMaterial.toolSpider, "spiderLeg");
		zombieArm = new ModSword(ModItemMaterial.toolZombie, "zombieArm");

		ModItems.registerItem(gooSword);
		ModItems.registerItem(magmaGooSword);
		ModItems.registerItem(spiderLeg);
		ModItems.registerItem(zombieArm);
	}

	public static void registerItem(final Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
}
