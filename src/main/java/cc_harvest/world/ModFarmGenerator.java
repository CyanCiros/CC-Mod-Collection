package cc_harvest.world;

import java.util.ArrayList;
import java.util.Random;

import cc_harvest.CCHarvest;
import cc_harvest.ChestItems;
import cc_harvest.Config;
import cc_harvest.blocks.ModBlocks;
import cc_harvest.generator.GeneratorFarm;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModFarmGenerator implements IWorldGenerator {
	private final Random randomHash = new Random();

	private final ArrayList<BiomeGenBase> farmBiome = new ArrayList<BiomeGenBase>();

	private final ChestItems chestItems;

	private final ArrayList<Block> candles;
	private final ArrayList<Block> crops;
	private final ArrayList<Block> boxes;
	private final ArrayList<ArrayList<Item>> boxItems;

	public ModFarmGenerator() {
		this.randomHash.setSeed(CCHarvest.MODID.hashCode());

		this.farmBiome.add(BiomeGenBase.plains);
		this.farmBiome.add(BiomeGenBase.forest);
		this.farmBiome.add(BiomeGenBase.birchForest);
		this.farmBiome.add(BiomeGenBase.roofedForest);
		this.farmBiome.add(BiomeGenBase.savanna);

		this.chestItems = new ChestItems();

		this.candles = new ArrayList<Block>();
		this.candles.add(ModBlocks.candle_0);
		this.candles.add(ModBlocks.candle_1);
		this.candles.add(ModBlocks.candle_2);
		this.candles.add(ModBlocks.candle_3);
		this.candles.add(ModBlocks.candle_4);
		this.candles.add(ModBlocks.candle_5);
		this.candles.add(ModBlocks.candle_6);
		this.candles.add(ModBlocks.candle_7);
		this.candles.add(ModBlocks.candle_8);
		this.candles.add(ModBlocks.candle_9);
		this.candles.add(ModBlocks.candle_10);
		this.candles.add(ModBlocks.candle_11);
		this.candles.add(ModBlocks.candle_12);
		this.candles.add(ModBlocks.candle_13);
		this.candles.add(ModBlocks.candle_14);
		this.candles.add(ModBlocks.candle_15);

		this.crops = new ArrayList<Block>();
		this.crops.add(ModBlocks.artichokeCrop);
		this.crops.add(ModBlocks.asparagusCrop);
		this.crops.add(ModBlocks.bambooShootCrop);
		this.crops.add(ModBlocks.barleyCrop);
		this.crops.add(ModBlocks.beanCrop);
		this.crops.add(ModBlocks.beetCrop);
		this.crops.add(ModBlocks.bellpepperCrop);
		this.crops.add(ModBlocks.blackberryCrop);
		this.crops.add(ModBlocks.blueberryCrop);
		this.crops.add(ModBlocks.broccoliCrop);
		this.crops.add(ModBlocks.brusselSproutCrop);
		this.crops.add(ModBlocks.cabbageCrop);
		this.crops.add(ModBlocks.cactusFruitCrop);
		this.crops.add(ModBlocks.candleberryCrop);
		this.crops.add(ModBlocks.cantaloupeCrop);
		this.crops.add(ModBlocks.cauliflowerCrop);
		this.crops.add(ModBlocks.celeryCrop);
		this.crops.add(ModBlocks.chilipepperCrop);
		this.crops.add(ModBlocks.coffeeBeanCrop);
		this.crops.add(ModBlocks.cornCrop);
		this.crops.add(ModBlocks.cottonCrop);
		this.crops.add(ModBlocks.cranberryCrop);
		this.crops.add(ModBlocks.cucumberCrop);
		this.crops.add(ModBlocks.eggplantCrop);
		this.crops.add(ModBlocks.garlicCrop);
		this.crops.add(ModBlocks.gingerCrop);
		this.crops.add(ModBlocks.grapeCrop);
		this.crops.add(ModBlocks.kiwiCrop);
		this.crops.add(ModBlocks.leekCrop);
		this.crops.add(ModBlocks.lettuceCrop);
		this.crops.add(ModBlocks.mustardSeedsCrop);
		this.crops.add(ModBlocks.oatsCrop);
		this.crops.add(ModBlocks.okraCrop);
		this.crops.add(ModBlocks.onionCrop);
		this.crops.add(ModBlocks.parsnipCrop);
		this.crops.add(ModBlocks.peanutCrop);
		this.crops.add(ModBlocks.peasCrop);
		this.crops.add(ModBlocks.pineappleCrop);
		this.crops.add(ModBlocks.radishCrop);
		this.crops.add(ModBlocks.raspberryCrop);
		this.crops.add(ModBlocks.rhubarbCrop);
		this.crops.add(ModBlocks.riceCrop);
		this.crops.add(ModBlocks.rutabagaCrop);
		this.crops.add(ModBlocks.ryeCrop);
		this.crops.add(ModBlocks.scallionCrop);
		this.crops.add(ModBlocks.seaweedCrop);
		this.crops.add(ModBlocks.soybeanCrop);
		this.crops.add(ModBlocks.spiceLeafCrop);
		this.crops.add(ModBlocks.strawberryCrop);
		this.crops.add(ModBlocks.sweetPotatoCrop);
		this.crops.add(ModBlocks.teaLeafCrop);
		this.crops.add(ModBlocks.tomatoCrop);
		this.crops.add(ModBlocks.turnipCrop);
		this.crops.add(ModBlocks.whiteMushroomCrop);
		this.crops.add(ModBlocks.winterSquashCrop);
		this.crops.add(ModBlocks.zucchiniCrop);

		this.boxes = new ArrayList<Block>();
		this.boxes.add(ModBlocks.storageCropsBox);
		this.boxes.add(ModBlocks.storageSeedsBox);
		this.boxes.add(ModBlocks.storageTemperateFruitsBox);
		this.boxes.add(ModBlocks.storageWarmFruitsBox);
		this.boxes.add(ModBlocks.storageLogFruitsBox);

		this.boxes.add(ModBlocks.storageToolsBox);
		this.boxes.add(ModBlocks.storageHoneyBox);
		this.boxes.add(ModBlocks.storageSodaBox);
		this.boxes.add(ModBlocks.storageJuiceBox);
		this.boxes.add(ModBlocks.storageJellyBox);
		this.boxes.add(ModBlocks.storageSmoothieBox);
		this.boxes.add(ModBlocks.storageYogurtBox);
		this.boxes.add(ModBlocks.storageSandwichBox);
		this.boxes.add(ModBlocks.storageSoupBox);

		this.boxItems = new ArrayList<ArrayList<Item>>();
		this.boxItems.add(this.chestItems.itemCrops);
		this.boxItems.add(this.chestItems.itemSeeds);
		this.boxItems.add(this.chestItems.itemTemperateFruits);
		this.boxItems.add(this.chestItems.itemWarmFruits);
		this.boxItems.add(this.chestItems.itemLogFruits);

		this.boxItems.add(this.chestItems.itemTools);
		this.boxItems.add(this.chestItems.itemHoney);
		this.boxItems.add(this.chestItems.itemSoda);
		this.boxItems.add(this.chestItems.itemJuice);
		this.boxItems.add(this.chestItems.itemJelly);
		this.boxItems.add(this.chestItems.itemSmoothie);
		this.boxItems.add(this.chestItems.itemYogurt);
		this.boxItems.add(this.chestItems.itemSandwich);
		this.boxItems.add(this.chestItems.itemSoup);
	}

	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world,
			final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0:
			this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		default:
			break;
		}
	}

	private void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
		final BiomeGenBase biome = world.getBiomeGenForCoords(new BlockPos(chunkX, 0, chunkZ));

		if (this.farmBiome.contains(biome) || !Config.biomeSpawn) {
			if (this.randomHash.nextInt(Config.farmSpawnRate) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);
				// System.out.println("Farm: " + chunkX + ", " + y + ", " +
				// chunkZ);

				new GeneratorFarm(world, this.candles, this.crops, this.boxes, this.boxItems).generate(random, chunkX,
						y, chunkZ);
			}
		}
	}

	private int surfaceSpawn(final World world, final int x, final int z) {
		int y = 63;

		for (int yt = y; yt < 256; yt++) {
			if (world.isAirBlock(new BlockPos(x, yt, z))
					|| world.getBlockState(new BlockPos(x, yt, z)).getBlock() == Blocks.log
					|| world.getBlockState(new BlockPos(x, yt, z)).getBlock() == Blocks.log2
					|| world.getBlockState(new BlockPos(x, yt, z)).getBlock() == Blocks.leaves
					|| world.getBlockState(new BlockPos(x, yt, z)).getBlock() == Blocks.leaves2) {
				y = yt;
				break;
			}
		}
		return y;
	}
}
