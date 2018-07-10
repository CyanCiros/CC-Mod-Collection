package cc_emerald.blocks;

import cc_emerald.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	public static ModCropEmerald emeraldCrop;
	public static ModCropIron ironCrop;
	public static ModCropLapis lapisCrop;
	public static ModCropGold goldCrop;
	public static ModCropDiamond diamondCrop;
	public static ModCropRedstone redstoneCrop;
	public static ModCropCoal coalCrop;
	public static ModCropGlowstone glowstoneCrop;
	public static ModCropQuartz quartzCrop;

	public static ModBlock glowstoneBlock;
	public static ModBlock quartzBlock;

	// public static ModTNT emeraldTnt;

	public static ModBlock emeraldObsidian;

	// public static ModStairs emeraldStairs;

	// public static ModFire emeraldFire;

	public static ModTorch emeraldTorch;
	public static ModTorch diamondTorch;
	public static ModTorch redstoneTorch;
	public static ModTorch glowstoneTorch;
	public static ModTorch quartzTorch;
	public static ModTorch lapisTorch;
	public static ModTorch coalTorch;

	public static ModLamp emeraldLamp;
	public static ModLampEmerald emeraldRedstoneLamp;
	public static ModLampEmerald emeraldRedstoneLampActive;
	public static ModLamp diamondLamp;
	public static ModLampDiamond diamondRedstoneLamp;
	public static ModLampDiamond diamondRedstoneLampActive;
	public static ModLamp redstoneLamp;
	public static ModLampRedstone redstoneRedstoneLamp;
	public static ModLampRedstone redstoneRedstoneLampActive;
	public static ModLamp glowstoneLamp;
	public static ModLampGlowstone glowstoneRedstoneLamp;
	public static ModLampGlowstone glowstoneRedstoneLampActive;
	public static ModLamp quartzLamp;
	public static ModLampQuartz quartzRedstoneLamp;
	public static ModLampQuartz quartzRedstoneLampActive;
	public static ModLamp lapisLamp;
	public static ModLampLapis lapisRedstoneLamp;
	public static ModLampLapis lapisRedstoneLampActive;
	public static ModLamp coalLamp;
	public static ModLampCoal coalRedstoneLamp;
	public static ModLampCoal coalRedstoneLampActive;

	public static ModDoor doorBlock;
	public static ModDoor doorBlockObsidian;

	public static final void createBlocks() {
		emeraldCrop = new ModCropEmerald("emeraldCrop");
		ironCrop = new ModCropIron("ironCrop", ModItems.ironSeeds, Items.iron_ingot);
		lapisCrop = new ModCropLapis("lapisCrop", ModItems.lapisSeeds, Items.dye);
		goldCrop = new ModCropGold("goldCrop", ModItems.goldSeeds, Items.gold_ingot);
		diamondCrop = new ModCropDiamond("diamondCrop", ModItems.diamondSeeds, Items.diamond);
		redstoneCrop = new ModCropRedstone("redstoneCrop", ModItems.redstoneSeeds, Items.redstone);
		coalCrop = new ModCropCoal("coalCrop", ModItems.coalSeeds, Items.coal);
		glowstoneCrop = new ModCropGlowstone("glowstoneCrop", ModItems.glowstoneSeeds, Items.glowstone_dust);
		quartzCrop = new ModCropQuartz("quartzCrop", ModItems.quartzSeeds, Items.quartz);

		ModBlocks.registerBlock(emeraldCrop);
		ModBlocks.registerBlock(ironCrop);
		ModBlocks.registerBlock(lapisCrop);
		ModBlocks.registerBlock(goldCrop);
		ModBlocks.registerBlock(diamondCrop);
		ModBlocks.registerBlock(redstoneCrop);
		ModBlocks.registerBlock(coalCrop);
		ModBlocks.registerBlock(glowstoneCrop);
		ModBlocks.registerBlock(quartzCrop);

		glowstoneBlock = new ModBlock(Material.rock, "glowstoneBlock", 3.0F, 15.0f, 1.0F);
		quartzBlock = new ModBlock(Material.rock, "quartzBlock", 3.0F);

		ModBlocks.registerBlock(glowstoneBlock);
		ModBlocks.registerBlock(quartzBlock);

		// emeraldTnt = new ModTNT("emeraldTnt", 0.0F, Block.soundTypeGrass);
		//
		// ModBlocks.registerBlock(emeraldTnt);

		emeraldObsidian = new ModBlock(Material.rock, "emeraldObsidian", 50.0F, 2000.0F);

		ModBlocks.registerBlock(emeraldObsidian);

		// emeraldStairs = new ModStairs("emeraldStairs", Blocks.emerald_block);
		//
		// ModBlocks.registerBlock(emeraldStairs);

		// emeraldFire = new ModFire("emeraldFire", 1.0F);
		//
		// ModBlocks.registerBlock(emeraldFire);

		emeraldTorch = new ModTorch("emeraldTorch", 0.0F, 0.91F, Block.soundTypeWood);
		diamondTorch = new ModTorch("diamondTorch", 0.0F, 0.91F, Block.soundTypeWood);
		redstoneTorch = new ModTorch("redstoneTorch", 0.0F, 0.91F, Block.soundTypeWood);
		glowstoneTorch = new ModTorch("glowstoneTorch", 0.0F, 0.91F, Block.soundTypeWood);
		quartzTorch = new ModTorch("quartzTorch", 0.0F, 0.91F, Block.soundTypeWood);
		lapisTorch = new ModTorch("lapisTorch", 0.0F, 0.91F, Block.soundTypeWood);
		coalTorch = new ModTorch("coalTorch", 0.0F, 0.91F, Block.soundTypeWood);

		ModBlocks.registerBlock(emeraldTorch);
		ModBlocks.registerBlock(diamondTorch);
		ModBlocks.registerBlock(redstoneTorch);
		ModBlocks.registerBlock(glowstoneTorch);
		ModBlocks.registerBlock(quartzTorch);
		ModBlocks.registerBlock(lapisTorch);
		ModBlocks.registerBlock(coalTorch);

		emeraldLamp = new ModLamp("emeraldLamp", 0.3F, Block.soundTypeGlass);
		emeraldRedstoneLamp = new ModLampEmerald("emeraldRedstoneLamp", 0.3F, Block.soundTypeGlass, false);
		emeraldRedstoneLampActive = new ModLampEmerald("emeraldRedstoneLampActive", 0.3F, Block.soundTypeGlass, true);

		ModBlocks.registerBlock(emeraldLamp);
		ModBlocks.registerBlock(emeraldRedstoneLamp);
		ModBlocks.registerBlock(emeraldRedstoneLampActive);

		diamondLamp = new ModLamp("diamondLamp", 0.3F, Block.soundTypeGlass);
		diamondRedstoneLamp = new ModLampDiamond("diamondRedstoneLamp", 0.3F, Block.soundTypeGlass, false);
		diamondRedstoneLampActive = new ModLampDiamond("diamondRedstoneLampActive", 0.3F, Block.soundTypeGlass, true);

		ModBlocks.registerBlock(diamondLamp);
		ModBlocks.registerBlock(diamondRedstoneLamp);
		ModBlocks.registerBlock(diamondRedstoneLampActive);

		redstoneLamp = new ModLamp("redstoneLamp", 0.3F, Block.soundTypeGlass);
		redstoneRedstoneLamp = new ModLampRedstone("redstoneRedstoneLamp", 0.3F, Block.soundTypeGlass, false);
		redstoneRedstoneLampActive = new ModLampRedstone("redstoneRedstoneLampActive", 0.3F, Block.soundTypeGlass,
				true);

		ModBlocks.registerBlock(redstoneLamp);
		ModBlocks.registerBlock(redstoneRedstoneLamp);
		ModBlocks.registerBlock(redstoneRedstoneLampActive);

		glowstoneLamp = new ModLamp("glowstoneLamp", 0.3F, Block.soundTypeGlass);
		glowstoneRedstoneLamp = new ModLampGlowstone("glowstoneRedstoneLamp", 0.3F, Block.soundTypeGlass, false);
		glowstoneRedstoneLampActive = new ModLampGlowstone("glowstoneRedstoneLampActive", 0.3F, Block.soundTypeGlass,
				true);

		ModBlocks.registerBlock(glowstoneLamp);
		ModBlocks.registerBlock(glowstoneRedstoneLamp);
		ModBlocks.registerBlock(glowstoneRedstoneLampActive);

		quartzLamp = new ModLamp("quartzLamp", 0.3F, Block.soundTypeGlass);
		quartzRedstoneLamp = new ModLampQuartz("quartzRedstoneLamp", 0.3F, Block.soundTypeGlass, false);
		quartzRedstoneLampActive = new ModLampQuartz("quartzRedstoneLampActive", 0.3F, Block.soundTypeGlass, true);

		ModBlocks.registerBlock(quartzLamp);
		ModBlocks.registerBlock(quartzRedstoneLamp);
		ModBlocks.registerBlock(quartzRedstoneLampActive);

		lapisLamp = new ModLamp("lapisLamp", 0.3F, Block.soundTypeGlass);
		lapisRedstoneLamp = new ModLampLapis("lapisRedstoneLamp", 0.3F, Block.soundTypeGlass, false);
		lapisRedstoneLampActive = new ModLampLapis("lapisRedstoneLampActive", 0.3F, Block.soundTypeGlass, true);

		ModBlocks.registerBlock(lapisLamp);
		ModBlocks.registerBlock(lapisRedstoneLamp);
		ModBlocks.registerBlock(lapisRedstoneLampActive);

		coalLamp = new ModLamp("coalLamp", 0.3F, Block.soundTypeGlass);
		coalRedstoneLamp = new ModLampCoal("coalRedstoneLamp", 0.3F, Block.soundTypeGlass, false);
		coalRedstoneLampActive = new ModLampCoal("coalRedstoneLampActive", 0.3F, Block.soundTypeGlass, true);

		ModBlocks.registerBlock(coalLamp);
		ModBlocks.registerBlock(coalRedstoneLamp);
		ModBlocks.registerBlock(coalRedstoneLampActive);

		doorBlock = new ModDoor(Material.iron, "doorBlock", 5.0F, 10.0F, Block.soundTypeMetal);
		doorBlockObsidian = new ModDoor(Material.iron, "doorBlockObsidian", 10.0F, 2000.0F, Block.soundTypeStone);

		ModBlocks.registerBlock(doorBlock);
		ModBlocks.registerBlock(doorBlockObsidian);
	}

	public static void registerBlock(final Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}
}
