package cc_emerald.client.render.items;

import cc_emerald.CCEmerald;
import cc_emerald.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	public static void registerItemRenderer() {
		// Seeds
		ItemRenderRegister.registerItemRender(ModItems.coalSeeds);
		ItemRenderRegister.registerItemRender(ModItems.lapisSeeds);
		ItemRenderRegister.registerItemRender(ModItems.ironSeeds);
		ItemRenderRegister.registerItemRender(ModItems.goldSeeds);
		ItemRenderRegister.registerItemRender(ModItems.redstoneSeeds);
		ItemRenderRegister.registerItemRender(ModItems.diamondSeeds);
		ItemRenderRegister.registerItemRender(ModItems.quartzSeeds);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneSeeds);
		ItemRenderRegister.registerItemRender(ModItems.emeraldSeeds);

		// Items
		// ItemRenderRegister.registerItemRender(ModItems.flintAndEmerald);
		// ItemRenderRegister.registerItemRender(ModItems.emeraldRod);
		// ItemRenderRegister.registerItemRender(ModItems.emeraldDust);
		// ItemRenderRegister.registerItemRender(ModItems.emeraldBone);

		ItemRenderRegister.registerItemRender(ModItems.doorItem);
		ItemRenderRegister.registerItemRender(ModItems.doorItemObsidian);

		// Tools
		ItemRenderRegister.registerItemRender(ModItems.woodStaff);
		ItemRenderRegister.registerItemRender(ModItems.woodKatana);
		ItemRenderRegister.registerItemRender(ModItems.woodKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.woodBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.woodBigSword);

		ItemRenderRegister.registerItemRender(ModItems.stoneStaff);
		ItemRenderRegister.registerItemRender(ModItems.stoneKatana);
		ItemRenderRegister.registerItemRender(ModItems.stoneKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.stoneBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.stoneBigSword);

		ItemRenderRegister.registerItemRender(ModItems.coalHoe);
		ItemRenderRegister.registerItemRender(ModItems.coalAxe);
		ItemRenderRegister.registerItemRender(ModItems.coalPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.coalShovel);
		ItemRenderRegister.registerItemRender(ModItems.coalSword);

		ItemRenderRegister.registerItemRender(ModItems.coalStaff);
		ItemRenderRegister.registerItemRender(ModItems.coalKatana);
		ItemRenderRegister.registerItemRender(ModItems.coalKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.coalBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.coalBigSword);

		ItemRenderRegister.registerItemRender(ModItems.lapisHoe);
		ItemRenderRegister.registerItemRender(ModItems.lapisAxe);
		ItemRenderRegister.registerItemRender(ModItems.lapisPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.lapisShovel);
		ItemRenderRegister.registerItemRender(ModItems.lapisSword);

		ItemRenderRegister.registerItemRender(ModItems.lapisStaff);
		ItemRenderRegister.registerItemRender(ModItems.lapisKatana);
		ItemRenderRegister.registerItemRender(ModItems.lapisKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.lapisBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.lapisBigSword);

		ItemRenderRegister.registerItemRender(ModItems.ironStaff);
		ItemRenderRegister.registerItemRender(ModItems.ironKatana);
		ItemRenderRegister.registerItemRender(ModItems.ironKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.ironBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.ironBigSword);

		ItemRenderRegister.registerItemRender(ModItems.goldStaff);
		ItemRenderRegister.registerItemRender(ModItems.goldKatana);
		ItemRenderRegister.registerItemRender(ModItems.goldKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.goldBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.goldBigSword);

		ItemRenderRegister.registerItemRender(ModItems.redstoneHoe);
		ItemRenderRegister.registerItemRender(ModItems.redstoneAxe);
		ItemRenderRegister.registerItemRender(ModItems.redstonePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.redstoneShovel);
		ItemRenderRegister.registerItemRender(ModItems.redstoneSword);

		ItemRenderRegister.registerItemRender(ModItems.redstoneStaff);
		ItemRenderRegister.registerItemRender(ModItems.redstoneKatana);
		ItemRenderRegister.registerItemRender(ModItems.redstoneKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.redstoneBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.redstoneBigSword);

		ItemRenderRegister.registerItemRender(ModItems.diamondStaff);
		ItemRenderRegister.registerItemRender(ModItems.diamondKatana);
		ItemRenderRegister.registerItemRender(ModItems.diamondKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.diamondBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.diamondBigSword);

		ItemRenderRegister.registerItemRender(ModItems.quartzHoe);
		ItemRenderRegister.registerItemRender(ModItems.quartzAxe);
		ItemRenderRegister.registerItemRender(ModItems.quartzPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.quartzShovel);
		ItemRenderRegister.registerItemRender(ModItems.quartzSword);

		ItemRenderRegister.registerItemRender(ModItems.quartzStaff);
		ItemRenderRegister.registerItemRender(ModItems.quartzKatana);
		ItemRenderRegister.registerItemRender(ModItems.quartzKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.quartzBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.quartzBigSword);

		ItemRenderRegister.registerItemRender(ModItems.glowstoneHoe);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneAxe);
		ItemRenderRegister.registerItemRender(ModItems.glowstonePickaxe);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneShovel);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneSword);

		ItemRenderRegister.registerItemRender(ModItems.glowstoneStaff);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneKatana);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneBigSword);

		ItemRenderRegister.registerItemRender(ModItems.emeraldHoe);
		ItemRenderRegister.registerItemRender(ModItems.emeraldAxe);
		ItemRenderRegister.registerItemRender(ModItems.emeraldPickaxe);
		ItemRenderRegister.registerItemRender(ModItems.emeraldShovel);
		ItemRenderRegister.registerItemRender(ModItems.emeraldSword);

		ItemRenderRegister.registerItemRender(ModItems.emeraldStaff);
		ItemRenderRegister.registerItemRender(ModItems.emeraldKatana);
		ItemRenderRegister.registerItemRender(ModItems.emeraldKhopesh);
		ItemRenderRegister.registerItemRender(ModItems.emeraldBattleaxe);
		ItemRenderRegister.registerItemRender(ModItems.emeraldBigSword);

		// Armor
		ItemRenderRegister.registerItemRender(ModItems.coalHelmet);
		ItemRenderRegister.registerItemRender(ModItems.coalChestplate);
		ItemRenderRegister.registerItemRender(ModItems.coalLeggings);
		ItemRenderRegister.registerItemRender(ModItems.coalBoots);

		ItemRenderRegister.registerItemRender(ModItems.lapisHelmet);
		ItemRenderRegister.registerItemRender(ModItems.lapisChestplate);
		ItemRenderRegister.registerItemRender(ModItems.lapisLeggings);
		ItemRenderRegister.registerItemRender(ModItems.lapisBoots);

		ItemRenderRegister.registerItemRender(ModItems.redstoneHelmet);
		ItemRenderRegister.registerItemRender(ModItems.redstoneChestplate);
		ItemRenderRegister.registerItemRender(ModItems.redstoneLeggings);
		ItemRenderRegister.registerItemRender(ModItems.redstoneBoots);

		ItemRenderRegister.registerItemRender(ModItems.quartzHelmet);
		ItemRenderRegister.registerItemRender(ModItems.quartzChestplate);
		ItemRenderRegister.registerItemRender(ModItems.quartzLeggings);
		ItemRenderRegister.registerItemRender(ModItems.quartzBoots);

		ItemRenderRegister.registerItemRender(ModItems.glowstoneHelmet);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneChestplate);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneLeggings);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneBoots);

		ItemRenderRegister.registerItemRender(ModItems.emeraldHelmet);
		ItemRenderRegister.registerItemRender(ModItems.emeraldChestplate);
		ItemRenderRegister.registerItemRender(ModItems.emeraldLeggings);
		ItemRenderRegister.registerItemRender(ModItems.emeraldBoots);

		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		// Bows
		ModItems.coalBow.registerBowRender(itemModelMesher);
		ModItems.stoneBow.registerBowRender(itemModelMesher);
		ModItems.lapisBow.registerBowRender(itemModelMesher);
		ModItems.ironBow.registerBowRender(itemModelMesher);
		ModItems.goldBow.registerBowRender(itemModelMesher);
		ModItems.redstoneBow.registerBowRender(itemModelMesher);
		ModItems.diamondBow.registerBowRender(itemModelMesher);
		ModItems.quartzBow.registerBowRender(itemModelMesher);
		ModItems.glowstoneBow.registerBowRender(itemModelMesher);
		ModItems.emeraldBow.registerBowRender(itemModelMesher);

		// Apples
		ItemRenderRegister.registerItemRender(ModItems.coalApple);
		ItemRenderRegister.registerItemRender(ModItems.lapisApple);
		ItemRenderRegister.registerItemRender(ModItems.redstoneApple);
		ItemRenderRegister.registerItemRender(ModItems.quartzApple);
		ItemRenderRegister.registerItemRender(ModItems.glowstoneApple);
		ItemRenderRegister.registerItemRender(ModItems.emeraldApple);

		// Potions
		// ItemRenderRegister.registerItemRender(ModItems.emeraldPotion);
		// ItemRenderRegister.registerItemRender(ModItems.emeraldPotionThrow);
	}

	public static void registerItemRender(final Item item) {
		final ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		itemModelMesher.register(item, 0,
				new ModelResourceLocation(CCEmerald.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
