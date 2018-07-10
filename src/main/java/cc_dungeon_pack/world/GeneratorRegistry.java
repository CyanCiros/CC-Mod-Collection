package cc_dungeon_pack.world;

import java.util.ArrayList;
import java.util.Random;

import cc_dungeon_pack.CCDungeonPack;
import cc_dungeon_pack.ChestItems;
import cc_dungeon_pack.Config;
import cc_dungeon_pack.generator.DungeonGeneratorBarn;
import cc_dungeon_pack.generator.DungeonGeneratorCreeperColoss;
import cc_dungeon_pack.generator.DungeonGeneratorDeathTemple;
import cc_dungeon_pack.generator.DungeonGeneratorFloatingIsland;
import cc_dungeon_pack.generator.DungeonGeneratorFort;
import cc_dungeon_pack.generator.DungeonGeneratorGraveyard;
import cc_dungeon_pack.generator.DungeonGeneratorHelpship;
import cc_dungeon_pack.generator.DungeonGeneratorIgloo;
import cc_dungeon_pack.generator.DungeonGeneratorMystery;
import cc_dungeon_pack.generator.DungeonGeneratorNPCFly;
import cc_dungeon_pack.generator.DungeonGeneratorNetherTemple;
import cc_dungeon_pack.generator.DungeonGeneratorPrison;
import cc_dungeon_pack.generator.DungeonGeneratorPyramide;
import cc_dungeon_pack.generator.DungeonGeneratorShip;
import cc_dungeon_pack.generator.DungeonGeneratorSmallTemple;
import cc_dungeon_pack.generator.DungeonGeneratorSpiderBox;
import cc_dungeon_pack.generator.DungeonGeneratorSwampTemple;
import cc_dungeon_pack.generator.DungeonGeneratorTreasure;
import cc_dungeon_pack.generator.DungeonGeneratorTreeHouse;
import cc_dungeon_pack.npctown.NPCTownBase;
import cc_dungeon_pack.ship.Ship;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GeneratorRegistry implements IWorldGenerator {
	private final Random randomHash = new Random();

	private final ArrayList<BiomeGenBase> barnBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> creeperColossSandBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> creeperColossStoneBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> deathTempleStoneBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> deathTempleSandBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> floatingIslandBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> fortIceBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> fortStoneBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> fortWoodenBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> fortSandBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> graveyardBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> helpshipBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> hugeShipBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> iglooBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> mysteryStoneBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> mysteryWoodenBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> mysterySandBiome = new ArrayList<BiomeGenBase>();
	// private final ArrayList<BiomeGenBase> mysteryRoomsBiome = new
	// ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> npcFlyObsidianBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> npcFlyStoneBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> npcTownBiome = new ArrayList<BiomeGenBase>();
	// private final ArrayList<BiomeGenBase> pq2ObsidianBiome = new
	// ArrayList<BiomeGenBase>();
	// private final ArrayList<BiomeGenBase> pq2StoneBiome = new
	// ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> prisonDesertBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> prisonForestBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> prisonStoneBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> pyramideSandBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> pyramideStoneBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> shipBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> smallTempleBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> spiderBoxBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> swampTempleBiome = new ArrayList<BiomeGenBase>();
	// private final ArrayList<BiomeGenBase> towerObsidianBiome = new
	// ArrayList<BiomeGenBase>();
	// private final ArrayList<BiomeGenBase> towerStoneBiome = new
	// ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> treasureBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> treehouseBiome = new ArrayList<BiomeGenBase>();

	private final ArrayList<BiomeGenBase> barnNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> creeperColossNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> deathTempleNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> floatingIslandNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> fortNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> helpshipNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> hugeShipNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> mysteryNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> netherTempleBiome = new ArrayList<BiomeGenBase>();
	// private final ArrayList<BiomeGenBase> pq2NetherBiome = new
	// ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> prisonNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> pyramideNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> shipNetherBiome = new ArrayList<BiomeGenBase>();
	private final ArrayList<BiomeGenBase> treasureNetherBiome = new ArrayList<BiomeGenBase>();

	private final ChestItems chestItems;

	public GeneratorRegistry() {
		this.randomHash.setSeed(CCDungeonPack.MODID.hashCode());

		if (Config.barn) {
			this.barnBiome.add(BiomeGenBase.icePlains);
			this.barnBiome.add(BiomeGenBase.plains);
			this.barnBiome.add(BiomeGenBase.savanna);
		}
		if (Config.creeperColossSand) {
			this.creeperColossSandBiome.add(BiomeGenBase.desert);
			this.creeperColossSandBiome.add(BiomeGenBase.desertHills);
		}
		if (Config.creeperColossStone) {
			this.creeperColossStoneBiome.add(BiomeGenBase.jungle);
			this.creeperColossStoneBiome.add(BiomeGenBase.jungleEdge);
			this.creeperColossStoneBiome.add(BiomeGenBase.jungleHills);
		}
		if (Config.deathTempleStone) {
			this.deathTempleStoneBiome.add(BiomeGenBase.swampland);
			this.deathTempleStoneBiome.add(BiomeGenBase.taiga);
			this.deathTempleStoneBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.deathTempleSand) {
			this.deathTempleSandBiome.add(BiomeGenBase.desert);
			this.deathTempleSandBiome.add(BiomeGenBase.desertHills);
		}
		if (Config.floatingIsland) {
			this.floatingIslandBiome.add(BiomeGenBase.birchForestHills);
			this.floatingIslandBiome.add(BiomeGenBase.coldTaigaHills);
			this.floatingIslandBiome.add(BiomeGenBase.desertHills);
			this.floatingIslandBiome.add(BiomeGenBase.extremeHills);
			this.floatingIslandBiome.add(BiomeGenBase.extremeHillsEdge);
			this.floatingIslandBiome.add(BiomeGenBase.extremeHillsPlus);
			this.floatingIslandBiome.add(BiomeGenBase.forestHills);
			this.floatingIslandBiome.add(BiomeGenBase.iceMountains);
			this.floatingIslandBiome.add(BiomeGenBase.jungleHills);
			this.floatingIslandBiome.add(BiomeGenBase.megaTaigaHills);
			this.floatingIslandBiome.add(BiomeGenBase.mesaPlateau_F);
			this.floatingIslandBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.fortIce) {
			this.fortIceBiome.add(BiomeGenBase.frozenOcean);
			this.fortIceBiome.add(BiomeGenBase.frozenRiver);
			this.fortIceBiome.add(BiomeGenBase.iceMountains);
			this.fortIceBiome.add(BiomeGenBase.icePlains);
		}
		if (Config.fortStone) {
			this.fortStoneBiome.add(BiomeGenBase.coldBeach);
			this.fortStoneBiome.add(BiomeGenBase.coldTaiga);
			this.fortStoneBiome.add(BiomeGenBase.coldTaigaHills);
			this.fortStoneBiome.add(BiomeGenBase.extremeHills);
			this.fortStoneBiome.add(BiomeGenBase.extremeHillsEdge);
			this.fortStoneBiome.add(BiomeGenBase.extremeHillsPlus);
			this.fortStoneBiome.add(BiomeGenBase.stoneBeach);
			this.fortStoneBiome.add(BiomeGenBase.taiga);
			this.fortStoneBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.fortWooden) {
			this.fortWoodenBiome.add(BiomeGenBase.birchForest);
			this.fortWoodenBiome.add(BiomeGenBase.birchForestHills);
			this.fortWoodenBiome.add(BiomeGenBase.forest);
			this.fortWoodenBiome.add(BiomeGenBase.forestHills);
			this.fortWoodenBiome.add(BiomeGenBase.jungle);
			this.fortWoodenBiome.add(BiomeGenBase.jungleEdge);
			this.fortWoodenBiome.add(BiomeGenBase.jungleHills);
			this.fortWoodenBiome.add(BiomeGenBase.megaTaiga);
			this.fortWoodenBiome.add(BiomeGenBase.megaTaigaHills);
			this.fortWoodenBiome.add(BiomeGenBase.roofedForest);
			this.fortWoodenBiome.add(BiomeGenBase.savanna);
			this.fortWoodenBiome.add(BiomeGenBase.savannaPlateau);
			this.fortWoodenBiome.add(BiomeGenBase.taiga);
			this.fortWoodenBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.fortSand) {
			this.fortSandBiome.add(BiomeGenBase.desert);
			this.fortSandBiome.add(BiomeGenBase.desertHills);
		}
		if (Config.graveyard) {
			this.graveyardBiome.add(BiomeGenBase.forest);
			this.graveyardBiome.add(BiomeGenBase.plains);
			this.graveyardBiome.add(BiomeGenBase.roofedForest);
			this.graveyardBiome.add(BiomeGenBase.taiga);
		}
		if (Config.helpship) {
			this.helpshipBiome.add(BiomeGenBase.deepOcean);
			this.helpshipBiome.add(BiomeGenBase.frozenOcean);
			this.helpshipBiome.add(BiomeGenBase.frozenRiver);
			this.helpshipBiome.add(BiomeGenBase.ocean);
			this.helpshipBiome.add(BiomeGenBase.river);
		}
		if (Config.hugeShip) {
			this.hugeShipBiome.add(BiomeGenBase.deepOcean);
			this.hugeShipBiome.add(BiomeGenBase.frozenOcean);
			this.hugeShipBiome.add(BiomeGenBase.frozenRiver);
			this.hugeShipBiome.add(BiomeGenBase.ocean);
		}
		if (Config.igloo) {
			this.iglooBiome.add(BiomeGenBase.iceMountains);
			this.iglooBiome.add(BiomeGenBase.icePlains);
		}
		if (Config.mysteryStone) {
			this.mysteryStoneBiome.add(BiomeGenBase.extremeHills);
			this.mysteryStoneBiome.add(BiomeGenBase.extremeHillsEdge);
			this.mysteryStoneBiome.add(BiomeGenBase.extremeHillsPlus);
			this.mysteryStoneBiome.add(BiomeGenBase.stoneBeach);
		}
		if (Config.mysteryWooden) {
			this.mysteryWoodenBiome.add(BiomeGenBase.birchForestHills);
			this.mysteryWoodenBiome.add(BiomeGenBase.forestHills);
			this.mysteryWoodenBiome.add(BiomeGenBase.jungleHills);
			this.mysteryWoodenBiome.add(BiomeGenBase.megaTaigaHills);
			this.mysteryWoodenBiome.add(BiomeGenBase.savannaPlateau);
			this.mysteryWoodenBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.mysterySand) {
			this.mysterySandBiome.add(BiomeGenBase.desert);
			this.mysterySandBiome.add(BiomeGenBase.desertHills);
		}
		// if (Config.mysteryRooms) {
		// this.mysteryRoomsBiome.add(BiomeGenBase.extremeHills);
		// this.mysteryRoomsBiome.add(BiomeGenBase.extremeHillsEdge);
		// this.mysteryRoomsBiome.add(BiomeGenBase.extremeHillsPlus);
		// }
		if (Config.npcFlyObsidian) {
			this.npcFlyObsidianBiome.add(BiomeGenBase.birchForestHills);
			this.npcFlyObsidianBiome.add(BiomeGenBase.coldTaigaHills);
			this.npcFlyObsidianBiome.add(BiomeGenBase.desertHills);
			this.npcFlyObsidianBiome.add(BiomeGenBase.extremeHills);
			this.npcFlyObsidianBiome.add(BiomeGenBase.extremeHillsEdge);
			this.npcFlyObsidianBiome.add(BiomeGenBase.extremeHillsPlus);
			this.npcFlyObsidianBiome.add(BiomeGenBase.forestHills);
			this.npcFlyObsidianBiome.add(BiomeGenBase.iceMountains);
			this.npcFlyObsidianBiome.add(BiomeGenBase.jungleHills);
			this.npcFlyObsidianBiome.add(BiomeGenBase.megaTaigaHills);
			this.npcFlyObsidianBiome.add(BiomeGenBase.mesaPlateau_F);
			this.npcFlyObsidianBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.npcFlyStone) {
			this.npcFlyStoneBiome.add(BiomeGenBase.birchForestHills);
			this.npcFlyStoneBiome.add(BiomeGenBase.coldTaigaHills);
			this.npcFlyStoneBiome.add(BiomeGenBase.desertHills);
			this.npcFlyStoneBiome.add(BiomeGenBase.extremeHills);
			this.npcFlyStoneBiome.add(BiomeGenBase.extremeHillsEdge);
			this.npcFlyStoneBiome.add(BiomeGenBase.extremeHillsPlus);
			this.npcFlyStoneBiome.add(BiomeGenBase.forestHills);
			this.npcFlyStoneBiome.add(BiomeGenBase.iceMountains);
			this.npcFlyStoneBiome.add(BiomeGenBase.jungleHills);
			this.npcFlyStoneBiome.add(BiomeGenBase.megaTaigaHills);
			this.npcFlyStoneBiome.add(BiomeGenBase.mesaPlateau_F);
			this.npcFlyStoneBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.npcTown) {
			this.npcTownBiome.add(BiomeGenBase.plains);
			this.npcTownBiome.add(BiomeGenBase.savanna);
		}
		// if (Config.pq2Obsidian) {
		// this.pq2ObsidianBiome.add(BiomeGenBase.coldBeach);
		// this.pq2ObsidianBiome.add(BiomeGenBase.coldTaiga);
		// this.pq2ObsidianBiome.add(BiomeGenBase.coldTaigaHills);
		// this.pq2ObsidianBiome.add(BiomeGenBase.mesa);
		// this.pq2ObsidianBiome.add(BiomeGenBase.mesaPlateau);
		// this.pq2ObsidianBiome.add(BiomeGenBase.mesaPlateau_F);
		// }
		// if (Config.pq2Stone) {
		// this.pq2StoneBiome.add(BiomeGenBase.extremeHills);
		// this.pq2StoneBiome.add(BiomeGenBase.extremeHillsEdge);
		// this.pq2StoneBiome.add(BiomeGenBase.extremeHillsPlus);
		// this.pq2StoneBiome.add(BiomeGenBase.stoneBeach);
		// }
		if (Config.prisonDesert) {
			this.prisonDesertBiome.add(BiomeGenBase.desert);
			this.prisonDesertBiome.add(BiomeGenBase.desertHills);
		}
		if (Config.prisonForest) {
			this.prisonForestBiome.add(BiomeGenBase.birchForest);
			this.prisonForestBiome.add(BiomeGenBase.birchForestHills);
			this.prisonForestBiome.add(BiomeGenBase.forest);
			this.prisonForestBiome.add(BiomeGenBase.forestHills);
			this.prisonForestBiome.add(BiomeGenBase.jungle);
			this.prisonForestBiome.add(BiomeGenBase.jungleEdge);
			this.prisonForestBiome.add(BiomeGenBase.jungleHills);
			this.prisonForestBiome.add(BiomeGenBase.megaTaiga);
			this.prisonForestBiome.add(BiomeGenBase.megaTaigaHills);
			this.prisonForestBiome.add(BiomeGenBase.roofedForest);
			this.prisonForestBiome.add(BiomeGenBase.savanna);
			this.prisonForestBiome.add(BiomeGenBase.savannaPlateau);
			this.prisonForestBiome.add(BiomeGenBase.taiga);
			this.prisonForestBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.prisonStone) {
			this.prisonStoneBiome.add(BiomeGenBase.coldBeach);
			this.prisonStoneBiome.add(BiomeGenBase.coldTaiga);
			this.prisonStoneBiome.add(BiomeGenBase.coldTaigaHills);
			this.prisonStoneBiome.add(BiomeGenBase.extremeHills);
			this.prisonStoneBiome.add(BiomeGenBase.extremeHillsEdge);
			this.prisonStoneBiome.add(BiomeGenBase.extremeHillsPlus);
			this.prisonStoneBiome.add(BiomeGenBase.stoneBeach);
			this.prisonStoneBiome.add(BiomeGenBase.taiga);
			this.prisonStoneBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.pyramideSand) {
			this.pyramideSandBiome.add(BiomeGenBase.desert);
			this.pyramideSandBiome.add(BiomeGenBase.desertHills);
		}
		if (Config.pyramideStone) {
			this.pyramideStoneBiome.add(BiomeGenBase.jungle);
		}
		if (Config.ship) {
			this.shipBiome.add(BiomeGenBase.frozenOcean);
			this.shipBiome.add(BiomeGenBase.frozenRiver);
			this.shipBiome.add(BiomeGenBase.deepOcean);
			this.shipBiome.add(BiomeGenBase.ocean);
			this.shipBiome.add(BiomeGenBase.river);
		}
		if (Config.smallTemple) {
			this.smallTempleBiome.add(BiomeGenBase.jungle);
			this.smallTempleBiome.add(BiomeGenBase.jungleEdge);
			this.smallTempleBiome.add(BiomeGenBase.jungleHills);
		}
		if (Config.spiderBox) {
			this.spiderBoxBiome.add(BiomeGenBase.coldBeach);
			this.spiderBoxBiome.add(BiomeGenBase.coldTaiga);
			this.spiderBoxBiome.add(BiomeGenBase.coldTaigaHills);
			this.spiderBoxBiome.add(BiomeGenBase.megaTaiga);
			this.spiderBoxBiome.add(BiomeGenBase.megaTaigaHills);
			this.spiderBoxBiome.add(BiomeGenBase.taiga);
			this.spiderBoxBiome.add(BiomeGenBase.taigaHills);
		}
		if (Config.swampTemple) {
			this.swampTempleBiome.add(BiomeGenBase.swampland);
			this.swampTempleBiome.add(BiomeGenBase.jungle);
			this.swampTempleBiome.add(BiomeGenBase.jungleEdge);
			this.swampTempleBiome.add(BiomeGenBase.jungleHills);
		}
		// if (Config.towerObsidian) {
		// this.towerObsidianBiome.add(BiomeGenBase.mesa);
		// this.towerObsidianBiome.add(BiomeGenBase.mesaPlateau);
		// this.towerObsidianBiome.add(BiomeGenBase.mesaPlateau_F);
		// }
		// if (Config.towerStone) {
		// this.towerStoneBiome.add(BiomeGenBase.mesa);
		// this.towerStoneBiome.add(BiomeGenBase.mesaPlateau);
		// this.towerStoneBiome.add(BiomeGenBase.mesaPlateau_F);
		// }
		if (Config.treasure) {
			this.treasureBiome.add(BiomeGenBase.birchForestHills);
			this.treasureBiome.add(BiomeGenBase.coldTaigaHills);
			this.treasureBiome.add(BiomeGenBase.desertHills);
			this.treasureBiome.add(BiomeGenBase.extremeHills);
			this.treasureBiome.add(BiomeGenBase.extremeHillsEdge);
			this.treasureBiome.add(BiomeGenBase.extremeHillsPlus);
			this.treasureBiome.add(BiomeGenBase.forestHills);
			this.treasureBiome.add(BiomeGenBase.iceMountains);
			this.treasureBiome.add(BiomeGenBase.jungleHills);
			this.treasureBiome.add(BiomeGenBase.megaTaigaHills);
			this.treasureBiome.add(BiomeGenBase.mesaPlateau_F);
			this.treasureBiome.add(BiomeGenBase.taigaHills);

			this.treasureBiome.add(BiomeGenBase.deepOcean);
			this.treasureBiome.add(BiomeGenBase.frozenOcean);
			this.treasureBiome.add(BiomeGenBase.frozenRiver);
			this.treasureBiome.add(BiomeGenBase.ocean);
		}
		if (Config.treehouse) {
			this.treehouseBiome.add(BiomeGenBase.jungle);
			this.treehouseBiome.add(BiomeGenBase.jungleHills);
		}

		if (Config.barnNether) {
			this.barnNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.creeperColossNether) {
			this.creeperColossNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.deathTempleNether) {
			this.deathTempleNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.floatingIslandNether) {
			this.floatingIslandNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.fortNether) {
			this.fortNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.helpshipNether) {
			this.helpshipNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.hugeShipNether) {
			this.hugeShipNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.mysteryNether) {
			this.mysteryNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.netherTemple) {
			this.netherTempleBiome.add(BiomeGenBase.hell);
		}
		// if (Config.pq2Nether) {
		// this.pq2NetherBiome.add(BiomeGenBase.hell);
		// }
		if (Config.prisonNether) {
			this.prisonNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.pyramideNether) {
			this.pyramideNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.shipNether) {
			this.shipNetherBiome.add(BiomeGenBase.hell);
		}
		if (Config.treasureNether) {
			this.treasureNetherBiome.add(BiomeGenBase.hell);
		}

		this.chestItems = new ChestItems();
	}

	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world,
			final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case -1:
			this.generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 2:
			this.generateHeaven(world, random, chunkX * 16, chunkZ * 16);
			break;
		default:
			break;
		}
	}

	private void generateSurface(final World world, final Random random, final int chunkX, final int chunkZ) {
		final BiomeGenBase biome = world.getBiomeGenForCoords(new BlockPos(chunkX, chunkZ, 0));

		if (Config.barn && (!Config.biomeSpawn || this.barnBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.barnSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.mossy_cobblestone.getDefaultState());
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Spider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemTools);
				items.add(this.chestItems.itemFoods);

				new DungeonGeneratorBarn(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("barn: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.creeperColossSand && (!Config.biomeSpawn || this.creeperColossSandBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.creeperColossSandSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sand.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Creeper");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemMobs);

				new DungeonGeneratorCreeperColoss(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("creeperColossSand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.creeperColossStone && (!Config.biomeSpawn || this.creeperColossStoneBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.creeperColossStoneSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.gravel.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Creeper");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemMobs);

				new DungeonGeneratorCreeperColoss(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("creeperColossStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.deathTempleStone && (!Config.biomeSpawn || this.deathTempleStoneBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.deathTempleStoneSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorDeathTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("deathTempleStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.deathTempleSand && (!Config.biomeSpawn || this.deathTempleSandBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.deathTempleSandSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorDeathTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("deathTempleSand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.floatingIsland && (!Config.biomeSpawn || this.floatingIslandBiome.contains(biome))) {
			final int height = Config.floatingIslandHeight
					+ random.nextInt(Config.floatingIslandHeightVariation * 2 + 1)
					- Config.floatingIslandHeightVariation;

			if (this.randomHash.nextInt((int) (Config.floatingIslandSpawnRate / Config.spawnRateMultiplier)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, height, chunkZ))) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.end_stone.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.mossy_cobblestone.getDefaultState());
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.web.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.enchanting_table.getDefaultState());
				blocks.add(Blocks.red_mushroom.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();

				mobs.add("Skeleton");

				if (Config.netherMobsInOverworld) {
					mobs.add("Blaze");
					mobs.add("Ghast");
					mobs.add("LavaSlime");
				} else {
					mobs.add("Zombie");
					mobs.add("Creeper");
					mobs.add("Witch");
				}

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);

				new DungeonGeneratorFloatingIsland(world, blocks, mobs, items).generate(random, chunkX, height, chunkZ);
				System.out.println("floatingIsland: x: " + chunkX + ", y: " + height + ", z: " + chunkZ);
			}
		}
		if (Config.fortIce && (!Config.biomeSpawn || this.fortIceBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.fortIceSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.packed_ice.getDefaultState());
				blocks.add(Blocks.snow.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.air.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortIce: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.fortStone && (!Config.biomeSpawn || this.fortStoneBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.fortStoneSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Witch");

				if (Config.netherMobsInOverworld) {
					mobs.add("Blaze");
					mobs.add("LavaSlime");
				}

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.fortWooden && (!Config.biomeSpawn || this.fortWoodenBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.fortWoodenSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortWooden: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.fortSand && (!Config.biomeSpawn || this.fortSandBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.fortSandSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.air.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortSand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.graveyard && (!Config.biomeSpawn || this.graveyardBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.graveyardSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.grass.getDefaultState());
				blocks.add(Blocks.dirt.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.double_stone_slab.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorGraveyard(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("graveyard: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.helpship && (!Config.biomeSpawn || this.helpshipBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.helpshipSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.water)) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.planks.getDefaultState());
					blocks.add(Blocks.oak_fence.getDefaultState());
					blocks.add(Blocks.wool.getDefaultState());
					blocks.add(Blocks.lit_pumpkin.getDefaultState());

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemFoods);

					new DungeonGeneratorHelpship(world, blocks, items).generate(random, chunkX, y, chunkZ);
					System.out.println("helpship: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.hugeShip && (!Config.biomeSpawn || this.hugeShipBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.hugeShipSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX + 80, y - 1, chunkZ), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX + 80, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX + 160, y - 1, chunkZ), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX + 160, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ + 16), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX, y + 32, chunkZ + 16))
						&& this.getEquals(world, new BlockPos(chunkX + 80, y - 1, chunkZ + 16), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX + 80, y + 32, chunkZ + 16))
						&& this.getEquals(world, new BlockPos(chunkX + 160, y - 1, chunkZ + 16), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX + 160, y + 32, chunkZ + 16))) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.log.getDefaultState());
					blocks.add(Blocks.glass_pane.getDefaultState());
					blocks.add(Blocks.iron_bars.getDefaultState());
					blocks.add(Blocks.oak_fence.getDefaultState());
					blocks.add(Blocks.wool.getDefaultState());
					blocks.add(Blocks.planks.getDefaultState());
					blocks.add(Blocks.obsidian.getDefaultState());
					blocks.add(Blocks.oak_stairs.getDefaultState());
					blocks.add(Blocks.tnt.getDefaultState());
					blocks.add(Blocks.torch.getDefaultState());
					blocks.add(Blocks.iron_door.getDefaultState());
					blocks.add(Blocks.oak_door.getDefaultState());

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemArmor);
					items.add(this.chestItems.itemEnchant);
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemMobs);
					items.add(this.chestItems.itemOres);
					items.add(this.chestItems.itemPotion);
					items.add(this.chestItems.itemRecords);
					items.add(this.chestItems.itemTools);

					new Ship(world, blocks, items).generate(random, chunkX, y + 12, chunkZ);
					System.out.println("hugeShip: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.igloo && (!Config.biomeSpawn || this.iglooBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.iglooSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.snow.getDefaultState());
				blocks.add(Blocks.snow_layer.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.wooden_pressure_plate.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("SnowMan");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorIgloo(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("igloo: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.mysteryStone && (!Config.biomeSpawn || this.mysteryStoneBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.mysteryStoneSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemOres);

				new DungeonGeneratorMystery(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("mysteryStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.mysteryWooden && (!Config.biomeSpawn || this.mysteryWoodenBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.mysteryWoodenSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemOres);

				new DungeonGeneratorMystery(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("mysteryWooden: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.mysterySand && (!Config.biomeSpawn || this.mysterySandBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.mysterySandSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemOres);

				new DungeonGeneratorMystery(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("mysterySand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		// if (Config.mysteryRooms && (!Config.biomeSpawn ||
		// this.mysteryRoomsBiome.contains(biome))) {
		// if (random.nextInt(Config.mysteryRoomsSpawnRate) == 0) {
		// final int y = this.surfaceSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
		// blocks.add(Blocks.stone.getDefaultState());
		// blocks.add(Blocks.netherrack.getDefaultState());
		// blocks.add(Blocks.fire.getDefaultState());
		// blocks.add(Blocks.iron_bars.getDefaultState());
		//
		// final ArrayList<String> mobs = new ArrayList<String>();
		// mobs.add("Zombie");
		// mobs.add("Skeleton");
		// mobs.add("Creeper");
		// mobs.add("Spider");
		// mobs.add("CaveSpider");
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		// items.add(this.chestItems.itemArmor);
		// items.add(this.chestItems.itemEnchant);
		// items.add(this.chestItems.itemOres);
		// items.add(this.chestItems.itemRecords);
		// items.add(this.chestItems.itemTools);
		//
		// new DungeonGeneratorMysteryRooms(world, blocks, mobs,
		// items).generate(random, chunkX, y, chunkZ);
		// System.out.println("mysteryRooms: x: " + chunkX + ", y: " + y + ", z:
		// " + chunkZ);
		// }
		// }
		if (Config.npcFlyObsidian && (!Config.biomeSpawn || this.npcFlyObsidianBiome.contains(biome))) {
			final int height = Config.npcFlyObsidianHeight
					+ random.nextInt(Config.npcFlyObsidianHeightVariation * 2 + 1)
					- Config.npcFlyObsidianHeightVariation;

			if (this.randomHash.nextInt((int) (Config.npcFlyObsidianSpawnRate / Config.spawnRateMultiplier)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, height, chunkZ))) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.end_stone.getDefaultState());
				blocks.add(Blocks.glass_pane.getDefaultState());
				blocks.add(Blocks.melon_block.getDefaultState());
				blocks.add(Blocks.water.getDefaultState());
				blocks.add(Blocks.gold_block.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.end_stone.getDefaultState());
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorNPCFly(world, blocks, items).generate(random, chunkX, height, chunkZ);
				System.out.println("npcFlyObsidian: x: " + chunkX + ", y: " + height + ", z: " + chunkZ);
			}
		}
		if (Config.npcFlyStone && (!Config.biomeSpawn || this.npcFlyStoneBiome.contains(biome))) {
			final int height = Config.npcFlyStoneHeight + random.nextInt(Config.npcFlyStoneHeightVariation * 2 + 1)
					- Config.npcFlyStoneHeightVariation;

			if (this.randomHash.nextInt((int) (Config.npcFlyStoneSpawnRate / Config.spawnRateMultiplier)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, height, chunkZ))) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stone.getDefaultState());
				blocks.add(Blocks.grass.getDefaultState());
				blocks.add(Blocks.glass_pane.getDefaultState());
				blocks.add(Blocks.melon_block.getDefaultState());
				blocks.add(Blocks.water.getDefaultState());
				blocks.add(Blocks.gold_block.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorNPCFly(world, blocks, items).generate(random, chunkX, height, chunkZ);
				System.out.println("npcFlyStone: x: " + chunkX + ", y: " + height + ", z: " + chunkZ);
			}
		}
		if (Config.npcTown && (!Config.biomeSpawn || this.npcTownBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.npcTownSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.water.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.gravel.getDefaultState());
				blocks.add(Blocks.glass.getDefaultState());
				blocks.add(Blocks.glass_pane.getDefaultState());
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());
				blocks.add(Blocks.dirt.getDefaultState());
				blocks.add(Blocks.grass.getDefaultState());
				blocks.add(Blocks.oak_door.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.cobblestone_wall.getDefaultState());

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);
				items.add(this.chestItems.itemTools);

				new NPCTownBase(world, blocks, items).generate(random, chunkX, y, chunkZ);
				System.out.println("npcTown: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		// if (Config.pq2Obsidian && (!Config.biomeSpawn ||
		// this.pq2ObsidianBiome.contains(biome))) {
		// if (random.nextInt(Config.pq2ObsidianSpawnRate) == 0) {
		// final int y = this.surfaceSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
		// blocks.add(Blocks.obsidian.getDefaultState());
		// blocks.add(Blocks.tnt.getDefaultState());
		// blocks.add(Blocks.web.getDefaultState());
		// blocks.add(Blocks.redstone_lamp.getDefaultState());
		// blocks.add(Blocks.oak_fence.getDefaultState());
		// blocks.add(Blocks.iron_bars.getDefaultState());
		// blocks.add(Blocks.netherrack.getDefaultState());
		// blocks.add(Blocks.fire.getDefaultState());
		// blocks.add(Blocks.emerald_block.getDefaultState());
		// blocks.add(Blocks.torch.getDefaultState());
		// blocks.add(Blocks.water.getDefaultState());
		// blocks.add(Blocks.lava.getDefaultState());
		//
		// final ArrayList<String> mobs = new ArrayList<String>();
		//
		// mobs.add("Zombie");
		// mobs.add("Skeleton");
		//
		// if (Config.netherMobsInOverworld) {
		// mobs.add("Blaze");
		// }
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		// items.add(this.chestItems.itemOres);
		//
		// new TemplePQ2(world, blocks, mobs, items).generate(random, chunkX, y,
		// chunkZ);
		// System.out.println("pq2Obsidian: x: " + chunkX + ", y: " + y + ", z:
		// " + chunkZ);
		// }
		// }
		// if (Config.pq2Stone && (!Config.biomeSpawn ||
		// this.pq2StoneBiome.contains(biome))) {
		// if (random.nextInt(Config.pq2StoneSpawnRate) == 0) {
		// final int y = this.surfaceSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
		// blocks.add(Blocks.stonebrick.getDefaultState());
		// blocks.add(Blocks.tnt.getDefaultState());
		// blocks.add(Blocks.web.getDefaultState());
		// blocks.add(Blocks.redstone_lamp.getDefaultState());
		// blocks.add(Blocks.oak_fence.getDefaultState());
		// blocks.add(Blocks.iron_bars.getDefaultState());
		// blocks.add(Blocks.stonebrick.getDefaultState());
		// blocks.add(Blocks.torch.getDefaultState());
		// blocks.add(Blocks.emerald_block.getDefaultState());
		// blocks.add(Blocks.torch.getDefaultState());
		// blocks.add(Blocks.water.getDefaultState());
		// blocks.add(Blocks.water.getDefaultState());
		//
		// final ArrayList<String> mobs = new ArrayList<String>();
		//
		// mobs.add("Zombie");
		// mobs.add("Skeleton");
		//
		// if (Config.netherMobsInOverworld) {
		// mobs.add("Blaze");
		// }
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		// items.add(this.chestItems.itemOres);
		//
		// new TemplePQ2(world, blocks, mobs, items).generate(random, chunkX, y,
		// chunkZ);
		// System.out.println("pq2Stone: x: " + chunkX + ", y: " + y + ", z: " +
		// chunkZ);
		// }
		// }
		if (Config.prisonDesert && (!Config.biomeSpawn || this.prisonDesertBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.prisonDesertSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.glass_pane.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorPrison(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("prisonDesert: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.prisonForest && (!Config.biomeSpawn || this.prisonForestBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.prisonForestSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.mossy_cobblestone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorPrison(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("prisonForest: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.prisonStone && (!Config.biomeSpawn || this.prisonStoneBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.prisonStoneSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.cobblestone_wall.getDefaultState());
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.mossy_cobblestone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorPrison(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("prisonStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.pyramideSand && (!Config.biomeSpawn || this.pyramideSandBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.pyramideSandSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.lava.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");

				if (Config.netherMobsInOverworld) {
					mobs.add("Blaze");
					mobs.add("LavaSlime");
				}

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorPyramide(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("pyramideSand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.pyramideStone && (!Config.biomeSpawn || this.pyramideStoneBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.pyramideStoneSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.water.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorPyramide(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("pyramideStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.ship && (!Config.biomeSpawn || this.shipBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.shipSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.water)) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.log.getDefaultState());
					blocks.add(Blocks.planks.getDefaultState());
					blocks.add(Blocks.wool.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Zombie");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemArmor);
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemPotion);
					items.add(this.chestItems.itemTools);

					new DungeonGeneratorShip(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("ship: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.smallTemple && (!Config.biomeSpawn || this.smallTempleBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.smallTempleSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Spider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemOres);

				new DungeonGeneratorSmallTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("smallTemple: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.spiderBox && (!Config.biomeSpawn || this.spiderBoxBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.spiderBoxSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.web.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemOres);

				new DungeonGeneratorSpiderBox(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("spiderBox: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.swampTemple && (!Config.biomeSpawn || this.swampTempleBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.swampTempleSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());
				blocks.add(Blocks.cauldron.getDefaultState());
				blocks.add(Blocks.brewing_stand.getDefaultState());
				blocks.add(Blocks.nether_wart.getDefaultState());
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.vine.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.netherrack.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Spider");
				mobs.add("Witch");

				if (Config.netherMobsInOverworld) {
					mobs.add("Blaze");
					mobs.add("LavaSlime");
				}

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);

				new DungeonGeneratorSwampTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("swampTemple: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		// if (Config.towerObsidian && (!Config.biomeSpawn ||
		// this.towerObsidianBiome.contains(biome))) {
		// if (random.nextInt(Config.towerObsidianSpawnRate) == 0) {
		// final int y = this.surfaceSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
		// blocks.add(Blocks.obsidian.getDefaultState());
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		// items.add(this.chestItems.itemEnchant);
		//
		// new DungeonGeneratorObsidianTower(world, blocks,
		// items).generate(random, chunkX, y, chunkZ);
		// System.out.println("towerObsidian: x: " + chunkX + ", y: " + y + ",
		// z: " + chunkZ);
		// }
		// }
		// if (Config.towerStone && (!Config.biomeSpawn ||
		// this.towerStoneBiome.contains(biome))) {
		// if (random.nextInt(Config.towerStoneSpawnRate) == 0) {
		// final int y = this.surfaceSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
		// blocks.add(Blocks.stonebrick.getDefaultState());
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		// items.add(this.chestItems.itemEnchant);
		//
		// new DungeonGeneratorObsidianTower(world, blocks,
		// items).generate(random, chunkX, y, chunkZ);
		// System.out.println("towerStone: x: " + chunkX + ", y: " + y + ", z: "
		// + chunkZ);
		// }
		// }
		if (Config.treasure && (!Config.biomeSpawn || this.treasureBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.treasureSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.cake.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorTreasure(world, blocks, mobs, items).generate(random, chunkX, 0, chunkZ);
				System.out.println("treasure: x: " + chunkX + ", y: " + 0 + ", z: " + chunkZ);
			}
		}
		if (Config.treehouse && (!Config.biomeSpawn || this.treehouseBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.treehouseSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.surfaceSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.planks.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemEnchant);

				new DungeonGeneratorTreeHouse(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("treehouse: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
	}

	private int surfaceSpawn(final World world, final int x, final int z) {
		int y = 60;

		for (int yt = y; yt < 256; yt++) {
			if (world.isAirBlock(new BlockPos(x, yt, z)) || this.getEquals(world, new BlockPos(x, yt, z), Blocks.log)
					|| this.getEquals(world, new BlockPos(x, yt, z), Blocks.log2)
					|| this.getEquals(world, new BlockPos(x, yt, z), Blocks.leaves)
					|| this.getEquals(world, new BlockPos(x, yt, z), Blocks.leaves2)) {
				y = yt;
				break;
			}
		}
		return y;
	}

	private void generateNether(final World world, final Random random, final int chunkX, final int chunkZ) {
		final BiomeGenBase biome = world.getBiomeGenForCoords(new BlockPos(chunkX, chunkZ, 0));

		if (Config.barnNether && this.barnNetherBiome.contains(biome)) {
			if (this.randomHash.nextInt((int) (Config.barnNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.netherSpawn(world, chunkX, chunkZ);

				if (y + 20 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.netherrack.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.soul_sand.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.glowstone.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("LavaSlime");
					mobs.add("Skeleton");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemTools);
					items.add(this.chestItems.itemFoods);

					new DungeonGeneratorBarn(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("barnNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.creeperColossNether && this.creeperColossNetherBiome.contains(biome)) {
			if (this.randomHash
					.nextInt((int) (Config.creeperColossNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.netherSpawn(world, chunkX, chunkZ);

				if (y + 14 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.soul_sand.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Blaze");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemMobs);

					new DungeonGeneratorCreeperColoss(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("creeperColossNether: x: " + chunkX + ", y:" + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.deathTempleNether && this.deathTempleNetherBiome.contains(biome)) {
			if (this.randomHash.nextInt((int) (Config.deathTempleNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.netherSpawn(world, chunkX, chunkZ);

				if (y + 10 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.glowstone.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("LavaSlime");
					mobs.add("Skeleton");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemArmor);
					items.add(this.chestItems.itemMobs);
					items.add(this.chestItems.itemTools);

					new DungeonGeneratorDeathTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("deathTempleNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.floatingIslandNether && this.floatingIslandNetherBiome.contains(biome)) {
			final int height = Config.floatingIslandNetherHeight
					+ random.nextInt(Config.floatingIslandNetherHeightVariation * 2 + 1)
					- Config.floatingIslandNetherHeightVariation;

			if (this.randomHash.nextInt((int) (Config.floatingIslandNetherSpawnRate / Config.spawnRateMultiplier)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, height, chunkZ)) && height + 19 <= 128) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.netherrack.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.web.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.enchanting_table.getDefaultState());
				blocks.add(Blocks.red_mushroom.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Blaze");
				mobs.add("Ghast");
				mobs.add("Skeleton");
				mobs.add("LavaSlime");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);

				new DungeonGeneratorFloatingIsland(world, blocks, mobs, items).generate(random, chunkX, height, chunkZ);
				System.out.println("floatingIslandNether: x: " + chunkX + ", y: " + height + ", z: " + chunkZ);
			}
		}
		if (Config.fortNether && this.fortNetherBiome.contains(biome)) {
			if (this.randomHash.nextInt((int) (Config.fortNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.netherSpawn(world, chunkX, chunkZ);

				if (y + 23 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.glowstone.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Blaze");
					mobs.add("Ghast");
					mobs.add("Skeleton");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemArmor);
					items.add(this.chestItems.itemEnchant);
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemMobs);
					items.add(this.chestItems.itemOres);
					items.add(this.chestItems.itemPotion);
					items.add(this.chestItems.itemTools);

					new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("fortNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.helpshipNether && (!Config.biomeSpawn || this.helpshipNetherBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.helpshipNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = 32;

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.lava) && y + 7 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.netherrack.getDefaultState());
					blocks.add(Blocks.glowstone.getDefaultState());

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemFoods);

					new DungeonGeneratorHelpship(world, blocks, items).generate(random, chunkX, y, chunkZ);
					System.out.println("helpshipNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.hugeShipNether && (!Config.biomeSpawn || this.hugeShipNetherBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.hugeShipNetherSpawnRate / 4 / Config.spawnRateMultiplier)) == 0
					&& this.randomHash.nextBoolean()) {
				final int y = 32;

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX + 80, y - 1, chunkZ), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX + 80, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX + 160, y - 1, chunkZ), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX + 160, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ + 16), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX, y + 32, chunkZ + 16))
						&& this.getEquals(world, new BlockPos(chunkX + 80, y - 1, chunkZ + 16), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX + 80, y + 32, chunkZ + 16))
						&& this.getEquals(world, new BlockPos(chunkX + 160, y - 1, chunkZ + 16), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX + 160, y + 32, chunkZ + 16)) && y + 63 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.netherrack.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.obsidian.getDefaultState());
					blocks.add(Blocks.nether_brick_stairs.getDefaultState());
					blocks.add(Blocks.tnt.getDefaultState());
					blocks.add(Blocks.torch.getDefaultState());
					blocks.add(Blocks.iron_door.getDefaultState());
					blocks.add(Blocks.oak_door.getDefaultState());

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemArmor);
					items.add(this.chestItems.itemEnchant);
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemMobs);
					items.add(this.chestItems.itemOres);
					items.add(this.chestItems.itemPotion);
					items.add(this.chestItems.itemRecords);
					items.add(this.chestItems.itemTools);

					new Ship(world, blocks, items).generate(random, chunkX, y + 12, chunkZ);
					System.out.println("hugeShipNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.mysteryNether && (!Config.biomeSpawn || this.mysteryNetherBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.mysteryNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.netherSpawn(world, chunkX, chunkZ);

				if (y + 9 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Skeleton");
					mobs.add("Blaze");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemArmor);
					items.add(this.chestItems.itemOres);

					new DungeonGeneratorMystery(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("mysteryNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.netherTemple && this.netherTempleBiome.contains(biome)) {
			if (this.randomHash.nextInt((int) (Config.netherTempleSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.netherSpawn(world, chunkX, chunkZ);

				if (y + 12 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.obsidian.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.iron_bars.getDefaultState());
					blocks.add(Blocks.glowstone.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Blaze");
					mobs.add("Ghast");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemArmor);
					items.add(this.chestItems.itemEnchant);
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemPotion);
					items.add(this.chestItems.itemTools);

					new DungeonGeneratorNetherTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("netherTemple: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		// if (Config.pq2Nether && (!Config.biomeSpawn ||
		// this.pq2NetherBiome.contains(biome))) {
		// if (this.randomHash.nextInt(Config.pq2NetherSpawnRate) == 0 &&
		// this.randomHash.nextBoolean()) {
		// final int y = this.netherSpawn(world, chunkX, chunkZ);
		//
		// if (y + 50 <= 128) {
		// final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
		// blocks.add(Blocks.nether_brick.getDefaultState());
		// blocks.add(Blocks.tnt.getDefaultState());
		// blocks.add(Blocks.web.getDefaultState());
		// blocks.add(Blocks.redstone_lamp.getDefaultState());
		// blocks.add(Blocks.nether_brick_fence.getDefaultState());
		// blocks.add(Blocks.iron_bars.getDefaultState());
		// blocks.add(Blocks.netherrack.getDefaultState());
		// blocks.add(Blocks.fire.getDefaultState());
		// blocks.add(Blocks.emerald_block.getDefaultState());
		// blocks.add(Blocks.glowstone.getDefaultState());
		// blocks.add(Blocks.lava.getDefaultState());
		// blocks.add(Blocks.lava.getDefaultState());
		//
		// final ArrayList<String> mobs = new ArrayList<String>();
		//
		// mobs.add("Zombie");
		// mobs.add("Skeleton");
		//
		// if (Config.netherMobsInOverworld) {
		// mobs.add("Blaze");
		// }
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		// items.add(this.chestItems.itemOres);
		//
		// new TemplePQ2(world, blocks, mobs, items).generate(random, chunkX, y,
		// chunkZ);
		// }
		// }
		// }
		if (Config.prisonNether && this.prisonNetherBiome.contains(biome)) {
			if (this.randomHash.nextInt((int) (Config.prisonNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = this.netherSpawn(world, chunkX, chunkZ);

				if (y + 14 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.netherrack.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.soul_sand.getDefaultState());
					blocks.add(Blocks.glowstone.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Blaze");
					mobs.add("Skeleton");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemMobs);
					items.add(this.chestItems.itemTools);

					new DungeonGeneratorPrison(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("prisonNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.pyramideNether && (!Config.biomeSpawn || this.pyramideNetherBiome.contains(biome))) {
			final int y = 32;

			if (this.randomHash.nextInt((int) (Config.pyramideNetherSpawnRate / Config.spawnRateMultiplier)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, y, chunkZ))
					&& world.isAirBlock(new BlockPos(chunkX + 32, y, chunkZ))
					&& world.isAirBlock(new BlockPos(chunkX - 32, y, chunkZ))
					&& world.isAirBlock(new BlockPos(chunkX, y, chunkZ + 32))
					&& world.isAirBlock(new BlockPos(chunkX, y, chunkZ - 32)) && y + 45 <= 128) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.lava.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");
				mobs.add("Blaze");
				mobs.add("LavaSlime");
				mobs.add("Ghast");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorPyramide(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("pyramideNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.shipNether && (!Config.biomeSpawn || this.shipNetherBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.shipNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final int y = 32;

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.lava) && y + 13 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.netherrack.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Ghast");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemArmor);
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemPotion);
					items.add(this.chestItems.itemTools);

					new DungeonGeneratorShip(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("shipNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.treasureNether && (!Config.biomeSpawn || this.treasureNetherBiome.contains(biome))) {
			if (this.randomHash.nextInt((int) (Config.treasureNetherSpawnRate / Config.spawnRateMultiplier)) == 0) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.cake.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Blaze");
				mobs.add("Skeleton");
				mobs.add("LavaSlime");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemArmor);
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);
				items.add(this.chestItems.itemOres);
				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);
				items.add(this.chestItems.itemTools);

				new DungeonGeneratorTreasure(world, blocks, mobs, items).generate(random, chunkX, 0, chunkZ);
				System.out.println("treasureNether: x: " + chunkX + ", y: " + 0 + ", z: " + chunkZ);
			}
		}
	}

	private int netherSpawn(final World world, final int x, final int z) {
		int y = 16;

		for (int yt = y; yt < 128; yt++) {
			if (world.isAirBlock(new BlockPos(x, yt, z))) {
				y = yt;
				break;
			}
		}
		return y;
	}

	private void generateHeaven(final World world, final Random random, final int chunkX, final int chunkZ) {
		final float heavenSpawnRate = 0.5f;

		if (Config.barn) {
			if (this.randomHash
					.nextInt((int) (Config.barnSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.mossy_cobblestone.getDefaultState());
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Spider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				items.add(this.chestItems.itemFoods);

				new DungeonGeneratorBarn(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("barn: x: " + chunkX + ", y: " + y + ", z:" + chunkZ);
			}
		}
		if (Config.creeperColossSand) {
			if (this.randomHash.nextInt(
					(int) (Config.creeperColossSandSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sand.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Creeper");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemMobs);

				new DungeonGeneratorCreeperColoss(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("creeperColossSand: x: " + chunkX + ", y:" + y + ", z: " + chunkZ);
			}
		}
		if (Config.creeperColossStone) {
			if (this.randomHash.nextInt(
					(int) (Config.creeperColossStoneSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.gravel.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Creeper");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemMobs);

				new DungeonGeneratorCreeperColoss(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("creeperColossStone: x: " + chunkX + ", y:" + y + ", z: " + chunkZ);
			}
		}
		if (Config.deathTempleStone) {
			if (this.randomHash.nextInt(
					(int) (Config.deathTempleStoneSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorDeathTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("deathTempleStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.deathTempleSand) {
			if (this.randomHash.nextInt(
					(int) (Config.deathTempleSandSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorDeathTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("deathTempleSand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.floatingIsland) {
			final int height = Config.floatingIslandHeight
					+ random.nextInt(Config.floatingIslandHeightVariation * 2 + 1)
					- Config.floatingIslandHeightVariation;

			if (this.randomHash
					.nextInt((int) (Config.floatingIslandSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, height, chunkZ))) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.end_stone.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.mossy_cobblestone.getDefaultState());
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.web.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.enchanting_table.getDefaultState());
				blocks.add(Blocks.red_mushroom.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();

				mobs.add("Skeleton");

				if (Config.netherMobsInOverworld) {
					mobs.add("Blaze");
					mobs.add("Ghast");
					mobs.add("LavaSlime");
				} else {
					mobs.add("Zombie");
					mobs.add("Creeper");
					mobs.add("Witch");
				}

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);

				new DungeonGeneratorFloatingIsland(world, blocks, mobs, items).generate(random, chunkX, height, chunkZ);
				System.out.println("floatingIsland: x: " + chunkX + ", y: " + height + ", z: " + chunkZ);
			}
		}
		if (Config.fortIce) {
			if (this.randomHash
					.nextInt((int) (Config.fortIceSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.packed_ice.getDefaultState());
				blocks.add(Blocks.snow.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.air.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortIce: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.fortStone) {
			if (this.randomHash
					.nextInt((int) (Config.fortStoneSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Witch");

				if (Config.netherMobsInOverworld) {
					mobs.add("Blaze");
					mobs.add("LavaSlime");
				}

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.fortWooden) {
			if (this.randomHash
					.nextInt((int) (Config.fortWoodenSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortWooden: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.fortSand) {
			if (this.randomHash
					.nextInt((int) (Config.fortSandSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.air.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortSand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.graveyard) {
			if (this.randomHash
					.nextInt((int) (Config.graveyardSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.grass.getDefaultState());
				blocks.add(Blocks.dirt.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.double_stone_slab.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorGraveyard(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("graveyard: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.helpship) {
			if (this.randomHash
					.nextInt((int) (Config.helpshipSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.water)) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.planks.getDefaultState());
					blocks.add(Blocks.oak_fence.getDefaultState());
					blocks.add(Blocks.wool.getDefaultState());
					blocks.add(Blocks.lit_pumpkin.getDefaultState());

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemFoods);

					new DungeonGeneratorHelpship(world, blocks, items).generate(random, chunkX, y, chunkZ);
					System.out.println("helpship: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.hugeShip) {
			if (this.randomHash
					.nextInt((int) (Config.hugeShipSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX + 80, y - 1, chunkZ), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX + 80, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX + 160, y - 1, chunkZ), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX + 160, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ + 16), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX, y + 32, chunkZ + 16))
						&& this.getEquals(world, new BlockPos(chunkX + 80, y - 1, chunkZ + 16), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX + 80, y + 32, chunkZ + 16))
						&& this.getEquals(world, new BlockPos(chunkX + 160, y - 1, chunkZ + 16), Blocks.water)
						&& world.isAirBlock(new BlockPos(chunkX + 160, y + 32, chunkZ + 16))) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.log.getDefaultState());
					blocks.add(Blocks.glass_pane.getDefaultState());
					blocks.add(Blocks.iron_bars.getDefaultState());
					blocks.add(Blocks.oak_fence.getDefaultState());
					blocks.add(Blocks.wool.getDefaultState());
					blocks.add(Blocks.planks.getDefaultState());
					blocks.add(Blocks.obsidian.getDefaultState());
					blocks.add(Blocks.oak_stairs.getDefaultState());
					blocks.add(Blocks.tnt.getDefaultState());
					blocks.add(Blocks.torch.getDefaultState());
					blocks.add(Blocks.iron_door.getDefaultState());
					blocks.add(Blocks.oak_door.getDefaultState());

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

					final ArrayList<Item> itemArmor = new ArrayList<Item>();
					itemArmor.addAll(this.chestItems.itemArmor);
					itemArmor.addAll(this.chestItems.itemHeavenArmor);
					items.add(itemArmor);

					items.add(this.chestItems.itemEnchant);
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemMobs);

					final ArrayList<Item> itemOres = new ArrayList<Item>();
					itemOres.addAll(this.chestItems.itemOres);
					itemOres.addAll(this.chestItems.itemHeavenOres);
					items.add(itemOres);

					items.add(this.chestItems.itemPotion);
					items.add(this.chestItems.itemRecords);

					final ArrayList<Item> itemTools = new ArrayList<Item>();
					itemTools.addAll(this.chestItems.itemTools);
					itemTools.addAll(this.chestItems.itemHeavenTools);
					items.add(itemTools);

					new Ship(world, blocks, items).generate(random, chunkX, y + 12, chunkZ);
					System.out.println("hugeShip: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.igloo) {
			if (this.randomHash
					.nextInt((int) (Config.iglooSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.snow.getDefaultState());
				blocks.add(Blocks.snow_layer.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.wooden_pressure_plate.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("SnowMan");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorIgloo(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("igloo: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.mysteryStone) {
			if (this.randomHash.nextInt(
					(int) (Config.mysteryStoneSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				new DungeonGeneratorMystery(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("mysteryStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.mysteryWooden) {
			if (this.randomHash.nextInt(
					(int) (Config.mysteryWoodenSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				new DungeonGeneratorMystery(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("mysteryWooden: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.mysterySand) {
			if (this.randomHash
					.nextInt((int) (Config.mysterySandSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				new DungeonGeneratorMystery(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("mysterySand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		// if (Config.mysteryRooms) {
		// if (this.randomHash.nextInt((int) (Config.mysteryRoomsSpawnRate /
		// Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
		// final int y = this.heavenSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<Block> blocks = new ArrayList<Block>();
		// blocks.add(Blocks.stone);
		// blocks.add(Blocks.netherrack);
		// blocks.add(Blocks.fire);
		// blocks.add(Blocks.iron_bars);
		//
		// final ArrayList<String> mobs = new ArrayList<String>();
		// mobs.add("Zombie");
		// mobs.add("Skeleton");
		// mobs.add("Creeper");
		// mobs.add("Spider");
		// mobs.add("CaveSpider");
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		//
		// final ArrayList<Item> itemArmor = new ArrayList<Item>();
		//
		// itemArmor.addAll(this.chestItems.itemArmor);
		// itemArmor.addAll(this.chestItems.itemHeavenArmor);
		//
		// items.add(itemArmor);
		//
		// items.add(this.chestItems.itemEnchant);
		//
		// final ArrayList<Item> itemOres = new ArrayList<Item>();
		//
		// itemOres.addAll(this.chestItems.itemOres);
		// itemOres.addAll(this.chestItems.itemHeavenOres);
		//
		// items.add(itemOres);
		//
		// items.add(this.chestItems.itemRecords);
		//
		// final ArrayList<Item> itemTools = new ArrayList<Item>();
		//
		// itemTools.addAll(this.chestItems.itemTools);
		// itemTools.addAll(this.chestItems.itemHeavenTools);
		//
		// items.add(itemTools);
		//
		// new DungeonGeneratorMysteryRooms(world, blocks, mobs,
		// items).generate(random, chunkX, y, chunkZ);
		// }
		// }
		if (Config.npcFlyObsidian) {
			final int height = Config.npcFlyObsidianHeight
					+ random.nextInt(Config.npcFlyObsidianHeightVariation * 2 + 1)
					- Config.npcFlyObsidianHeightVariation;

			if (this.randomHash
					.nextInt((int) (Config.npcFlyObsidianSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, height, chunkZ))) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.end_stone.getDefaultState());
				blocks.add(Blocks.glass_pane.getDefaultState());
				blocks.add(Blocks.melon_block.getDefaultState());
				blocks.add(Blocks.water.getDefaultState());
				blocks.add(Blocks.gold_block.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.end_stone.getDefaultState());
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorNPCFly(world, blocks, items).generate(random, chunkX, height, chunkZ);
				System.out.println("npcFlyObsidian: x: " + chunkX + ", y: " + height + ", z: " + chunkZ);
			}
		}
		if (Config.npcFlyStone) {
			final int height = Config.npcFlyStoneHeight + random.nextInt(Config.npcFlyStoneHeightVariation * 2 + 1)
					- Config.npcFlyStoneHeightVariation;

			if (this.randomHash
					.nextInt((int) (Config.npcFlyStoneSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, height, chunkZ))) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stone.getDefaultState());
				blocks.add(Blocks.grass.getDefaultState());
				blocks.add(Blocks.glass_pane.getDefaultState());
				blocks.add(Blocks.melon_block.getDefaultState());
				blocks.add(Blocks.water.getDefaultState());
				blocks.add(Blocks.gold_block.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorNPCFly(world, blocks, items).generate(random, chunkX, height, chunkZ);
				System.out.println("npcFlyStone: x: " + chunkX + ", y: " + height + ", z: " + chunkZ);
			}
		}
		if (Config.npcTown) {
			if (this.randomHash
					.nextInt((int) (Config.npcTownSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.water.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.gravel.getDefaultState());
				blocks.add(Blocks.glass.getDefaultState());
				blocks.add(Blocks.glass_pane.getDefaultState());
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());
				blocks.add(Blocks.dirt.getDefaultState());
				blocks.add(Blocks.grass.getDefaultState());
				blocks.add(Blocks.oak_door.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.cobblestone_wall.getDefaultState());

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new NPCTownBase(world, blocks, items).generate(random, chunkX, y, chunkZ);
				System.out.println("npcTown: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		// if (Config.pq2Obsidian) {
		// if (this.randomHash.nextInt((int) (Config.pq2ObsidianSpawnRate /
		// Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
		// final int y = this.heavenSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<Block> blocks = new ArrayList<Block>();
		// blocks.add(Blocks.obsidian);
		// blocks.add(Blocks.tnt);
		// blocks.add(Blocks.web);
		// blocks.add(Blocks.redstone_lamp);
		// blocks.add(Blocks.fence);
		// blocks.add(Blocks.iron_bars);
		// blocks.add(Blocks.netherrack);
		// blocks.add(Blocks.fire);
		// blocks.add(Blocks.emerald_block);
		// blocks.add(Blocks.torch);
		// blocks.add(Blocks.water);
		// blocks.add(Blocks.lava);
		//
		// final ArrayList<String> mobs = new ArrayList<String>();
		//
		// mobs.add("Zombie");
		// mobs.add("Skeleton");
		//
		// if (Config.netherMobsInOverworld) {
		// mobs.add("Blaze");
		// }
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		//
		// final ArrayList<Item> itemOres = new ArrayList<Item>();
		//
		// itemOres.addAll(this.chestItems.itemOres);
		// itemOres.addAll(this.chestItems.itemHeavenOres);
		//
		// items.add(itemOres);
		//
		// new TemplePQ2(world, blocks, mobs, items).generate(random, chunkX, y,
		// chunkZ);
		// }
		// }
		// if (Config.pq2Stone) {
		// if (this.randomHash.nextInt((int) (Config.pq2StoneSpawnRate /
		// Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
		// final int y = this.heavenSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<Block> blocks = new ArrayList<Block>();
		// blocks.add(Blocks.stonebrick);
		// blocks.add(Blocks.tnt);
		// blocks.add(Blocks.web);
		// blocks.add(Blocks.redstone_lamp);
		// blocks.add(Blocks.fence);
		// blocks.add(Blocks.iron_bars);
		// blocks.add(Blocks.stonebrick);
		// blocks.add(Blocks.torch);
		// blocks.add(Blocks.emerald_block);
		// blocks.add(Blocks.torch);
		// blocks.add(Blocks.water);
		// blocks.add(Blocks.water);
		//
		// final ArrayList<String> mobs = new ArrayList<String>();
		//
		// mobs.add("Zombie");
		// mobs.add("Skeleton");
		//
		// if (Config.netherMobsInOverworld) {
		// mobs.add("Blaze");
		// }
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		//
		// final ArrayList<Item> itemOres = new ArrayList<Item>();
		//
		// itemOres.addAll(this.chestItems.itemOres);
		// itemOres.addAll(this.chestItems.itemHeavenOres);
		//
		// items.add(itemOres);
		//
		// new TemplePQ2(world, blocks, mobs, items).generate(random, chunkX, y,
		// chunkZ);
		// }
		// }
		if (Config.prisonDesert) {
			if (this.randomHash.nextInt(
					(int) (Config.prisonDesertSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.glass_pane.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorPrison(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("prisonDesert: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.prisonForest) {
			if (this.randomHash.nextInt(
					(int) (Config.prisonForestSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.planks.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.mossy_cobblestone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorPrison(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("prisonForest: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.prisonStone) {
			if (this.randomHash
					.nextInt((int) (Config.prisonStoneSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.cobblestone_wall.getDefaultState());
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.mossy_cobblestone.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Witch");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorPrison(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("prisonStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.pyramideSand) {
			if (this.randomHash.nextInt(
					(int) (Config.pyramideSandSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.lava.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");

				if (Config.netherMobsInOverworld) {
					mobs.add("Blaze");
					mobs.add("LavaSlime");
				}

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorPyramide(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("pyramideSand: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.pyramideStone) {
			if (this.randomHash.nextInt(
					(int) (Config.pyramideStoneSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.water.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorPyramide(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("pyramideStone: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.ship) {
			if (this.randomHash
					.nextInt((int) (Config.shipSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.water)) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.log.getDefaultState());
					blocks.add(Blocks.planks.getDefaultState());
					blocks.add(Blocks.wool.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Zombie");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

					final ArrayList<Item> itemArmor = new ArrayList<Item>();
					itemArmor.addAll(this.chestItems.itemArmor);
					itemArmor.addAll(this.chestItems.itemHeavenArmor);
					items.add(itemArmor);

					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemPotion);

					final ArrayList<Item> itemTools = new ArrayList<Item>();
					itemTools.addAll(this.chestItems.itemTools);
					itemTools.addAll(this.chestItems.itemHeavenTools);
					items.add(itemTools);

					new DungeonGeneratorShip(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("ship: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.smallTemple) {
			if (this.randomHash
					.nextInt((int) (Config.smallTempleSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Spider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				new DungeonGeneratorSmallTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("smallTemple: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.spiderBox) {
			if (this.randomHash
					.nextInt((int) (Config.spiderBoxSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.web.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				new DungeonGeneratorSpiderBox(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("spiderBox: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.swampTemple) {
			if (this.randomHash
					.nextInt((int) (Config.swampTempleSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.cobblestone.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());
				blocks.add(Blocks.cauldron.getDefaultState());
				blocks.add(Blocks.brewing_stand.getDefaultState());
				blocks.add(Blocks.nether_wart.getDefaultState());
				blocks.add(Blocks.log.getDefaultState());
				blocks.add(Blocks.sandstone.getDefaultState());
				blocks.add(Blocks.vine.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.netherrack.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Spider");
				mobs.add("Witch");

				if (Config.netherMobsInOverworld) {
					mobs.add("Blaze");
					mobs.add("LavaSlime");
				}

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);

				new DungeonGeneratorSwampTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("swampTemple: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		// if (Config.towerObsidian) {
		// if (this.randomHash.nextInt((int) (Config.towerObsidianSpawnRate /
		// Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
		// final int y = this.heavenSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<Block> blocks = new ArrayList<Block>();
		// blocks.add(Blocks.obsidian);
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		// items.add(this.chestItems.itemEnchant);
		//
		// new DungeonGeneratorObsidianTower(world, blocks,
		// items).generate(random, chunkX, y, chunkZ);
		// }
		// }
		// if (Config.towerStone) {
		// if (this.randomHash.nextInt((int) (Config.towerStoneSpawnRate /
		// Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
		// final int y = this.heavenSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<Block> blocks = new ArrayList<Block>();
		// blocks.add(Blocks.stonebrick);
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		// items.add(this.chestItems.itemEnchant);
		//
		// new DungeonGeneratorObsidianTower(world, blocks,
		// items).generate(random, chunkX, y, chunkZ);
		// }
		// }
		if (Config.treasure) {
			if (this.randomHash
					.nextInt((int) (Config.treasureSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.stonebrick.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.oak_fence.getDefaultState());
				blocks.add(Blocks.cake.getDefaultState());
				blocks.add(Blocks.torch.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");
				mobs.add("Skeleton");
				mobs.add("Creeper");
				mobs.add("Spider");
				mobs.add("CaveSpider");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorTreasure(world, blocks, mobs, items).generate(random, chunkX, 0, chunkZ);
				System.out.println("treasure: x: " + chunkX + ", y: " + 0 + ", z: " + chunkZ);
			}
		}
		if (Config.treehouse) {
			if (this.randomHash
					.nextInt((int) (Config.treehouseSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.planks.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Zombie");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemEnchant);

				new DungeonGeneratorTreeHouse(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("treehouse: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.barnNether) {
			if (this.randomHash
					.nextInt((int) (Config.barnNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.netherrack.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("LavaSlime");
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				items.add(this.chestItems.itemFoods);

				new DungeonGeneratorBarn(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("barnNether: x: " + chunkX + ", y: " + y + ", z:" + chunkZ);
			}
		}
		if (Config.creeperColossNether) {
			if (this.randomHash.nextInt(
					(int) (Config.creeperColossNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Blaze");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemMobs);

				new DungeonGeneratorCreeperColoss(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("creeperColossNether: x: " + chunkX + ", y:" + y + ", z: " + chunkZ);
			}
		}
		if (Config.deathTempleNether) {
			if (this.randomHash.nextInt(
					(int) (Config.deathTempleNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("LavaSlime");
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorDeathTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("deathTempleNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.floatingIslandNether) {
			final int height = Config.floatingIslandNetherHeight
					+ random.nextInt(Config.floatingIslandNetherHeightVariation * 2 + 1)
					- Config.floatingIslandNetherHeightVariation;

			if (this.randomHash
					.nextInt((int) (Config.floatingIslandSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, height, chunkZ))) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.netherrack.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.web.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.enchanting_table.getDefaultState());
				blocks.add(Blocks.red_mushroom.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Blaze");
				mobs.add("Ghast");
				mobs.add("Skeleton");
				mobs.add("LavaSlime");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);

				new DungeonGeneratorFloatingIsland(world, blocks, mobs, items).generate(random, chunkX, height, chunkZ);
				System.out.println("floatingIslandNether: x: " + chunkX + ", y: " + height + ", z: " + chunkZ);
			}
		}
		if (Config.fortNether) {
			if (this.randomHash
					.nextInt((int) (Config.fortNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Blaze");
				mobs.add("Ghast");
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorFort(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("fortNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.helpshipNether) {
			if (this.randomHash.nextInt(
					(int) (Config.helpshipNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = 32;

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.lava) && y + 7 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.netherrack.getDefaultState());
					blocks.add(Blocks.glowstone.getDefaultState());

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
					items.add(this.chestItems.itemFoods);

					new DungeonGeneratorHelpship(world, blocks, items).generate(random, chunkX, y, chunkZ);
					System.out.println("helpshipNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.hugeShipNether) {
			if (this.randomHash.nextInt(
					(int) (Config.hugeShipNetherSpawnRate / 4 / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = 32;

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX + 80, y - 1, chunkZ), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX + 80, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX + 160, y - 1, chunkZ), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX + 160, y + 32, chunkZ))
						&& this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ + 16), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX, y + 32, chunkZ + 16))
						&& this.getEquals(world, new BlockPos(chunkX + 80, y - 1, chunkZ + 16), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX + 80, y + 32, chunkZ + 16))
						&& this.getEquals(world, new BlockPos(chunkX + 160, y - 1, chunkZ + 16), Blocks.lava)
						&& world.isAirBlock(new BlockPos(chunkX + 160, y + 32, chunkZ + 16)) && y + 63 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.nether_brick_fence.getDefaultState());
					blocks.add(Blocks.netherrack.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.obsidian.getDefaultState());
					blocks.add(Blocks.nether_brick_stairs.getDefaultState());
					blocks.add(Blocks.tnt.getDefaultState());
					blocks.add(Blocks.torch.getDefaultState());
					blocks.add(Blocks.iron_door.getDefaultState());
					blocks.add(Blocks.oak_door.getDefaultState());

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

					final ArrayList<Item> itemArmor = new ArrayList<Item>();
					itemArmor.addAll(this.chestItems.itemArmor);
					itemArmor.addAll(this.chestItems.itemHeavenArmor);
					items.add(itemArmor);

					items.add(this.chestItems.itemEnchant);
					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemMobs);

					final ArrayList<Item> itemOres = new ArrayList<Item>();
					itemOres.addAll(this.chestItems.itemOres);
					itemOres.addAll(this.chestItems.itemHeavenOres);
					items.add(itemOres);

					items.add(this.chestItems.itemPotion);
					items.add(this.chestItems.itemRecords);

					final ArrayList<Item> itemTools = new ArrayList<Item>();
					itemTools.addAll(this.chestItems.itemTools);
					itemTools.addAll(this.chestItems.itemHeavenTools);
					items.add(itemTools);

					new Ship(world, blocks, items).generate(random, chunkX, y + 12, chunkZ);
					System.out.println("hugeShipNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.mysteryNether) {
			if (this.randomHash.nextInt(
					(int) (Config.mysteryNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");
				mobs.add("Blaze");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				new DungeonGeneratorMystery(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("mysteryNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.netherTemple) {
			if (this.randomHash.nextInt(
					(int) (Config.netherTempleSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.obsidian.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.iron_bars.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Blaze");
				mobs.add("Ghast");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemPotion);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorNetherTemple(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("netherTemple: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		// if (Config.pq2Nether) {
		// if (this.randomHash.nextInt((int) (Config.pq2NetherSpawnRate /
		// Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
		// final int y = this.heavenSpawn(world, chunkX, chunkZ);
		//
		// final ArrayList<Block> blocks = new ArrayList<Block>();
		// blocks.add(Blocks.nether_brick);
		// blocks.add(Blocks.tnt);
		// blocks.add(Blocks.web);
		// blocks.add(Blocks.redstone_lamp);
		// blocks.add(Blocks.nether_brick_fence);
		// blocks.add(Blocks.iron_bars);
		// blocks.add(Blocks.netherrack);
		// blocks.add(Blocks.fire);
		// blocks.add(Blocks.emerald_block);
		// blocks.add(Blocks.glowstone);
		// blocks.add(Blocks.lava);
		// blocks.add(Blocks.lava);
		//
		// final ArrayList<String> mobs = new ArrayList<String>();
		//
		// mobs.add("Zombie");
		// mobs.add("Skeleton");
		//
		// if (Config.netherMobsInOverworld) {
		// mobs.add("Blaze");
		// }
		//
		// final ArrayList<ArrayList<Item>> items = new
		// ArrayList<ArrayList<Item>>();
		//
		// final ArrayList<Item> itemOres = new ArrayList<Item>();
		//
		// itemOres.addAll(this.chestItems.itemOres);
		// itemOres.addAll(this.chestItems.itemHeavenOres);
		//
		// items.add(itemOres);
		//
		// new TemplePQ2(world, blocks, mobs, items).generate(random, chunkX, y,
		// chunkZ);
		// }
		// }
		if (Config.prisonNether) {
			if (this.randomHash.nextInt(
					(int) (Config.prisonNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = this.heavenSpawn(world, chunkX, chunkZ);

				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.netherrack.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Blaze");
				mobs.add("Skeleton");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorPrison(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("prisonNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.pyramideNether) {
			final int y = 32;

			if (this.randomHash
					.nextInt((int) (Config.pyramideNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0
					&& world.isAirBlock(new BlockPos(chunkX, y, chunkZ))
					&& world.isAirBlock(new BlockPos(chunkX + 32, y, chunkZ))
					&& world.isAirBlock(new BlockPos(chunkX - 32, y, chunkZ))
					&& world.isAirBlock(new BlockPos(chunkX, y, chunkZ + 32))
					&& world.isAirBlock(new BlockPos(chunkX, y, chunkZ - 32)) && y + 45 <= 128) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.lava.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Skeleton");
				mobs.add("Blaze");
				mobs.add("LavaSlime");
				mobs.add("Ghast");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorPyramide(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
				System.out.println("pyramideNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
			}
		}
		if (Config.shipNether) {
			if (this.randomHash
					.nextInt((int) (Config.shipNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final int y = 32;

				if (this.getEquals(world, new BlockPos(chunkX, y - 1, chunkZ), Blocks.lava) && y + 13 <= 128) {
					final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.nether_brick.getDefaultState());
					blocks.add(Blocks.netherrack.getDefaultState());

					final ArrayList<String> mobs = new ArrayList<String>();
					mobs.add("Ghast");

					final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

					final ArrayList<Item> itemArmor = new ArrayList<Item>();
					itemArmor.addAll(this.chestItems.itemArmor);
					itemArmor.addAll(this.chestItems.itemHeavenArmor);
					items.add(itemArmor);

					items.add(this.chestItems.itemFoods);
					items.add(this.chestItems.itemPotion);

					final ArrayList<Item> itemTools = new ArrayList<Item>();
					itemTools.addAll(this.chestItems.itemTools);
					itemTools.addAll(this.chestItems.itemHeavenTools);
					items.add(itemTools);

					new DungeonGeneratorShip(world, blocks, mobs, items).generate(random, chunkX, y, chunkZ);
					System.out.println("shipNether: x: " + chunkX + ", y: " + y + ", z: " + chunkZ);
				}
			}
		}
		if (Config.treasureNether) {
			if (this.randomHash.nextInt(
					(int) (Config.treasureNetherSpawnRate / Config.spawnRateMultiplier / heavenSpawnRate)) == 0) {
				final ArrayList<IBlockState> blocks = new ArrayList<IBlockState>();
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.nether_brick.getDefaultState());
				blocks.add(Blocks.stone_slab.getDefaultState());
				blocks.add(Blocks.nether_brick_fence.getDefaultState());
				blocks.add(Blocks.cake.getDefaultState());
				blocks.add(Blocks.glowstone.getDefaultState());
				blocks.add(Blocks.soul_sand.getDefaultState());

				final ArrayList<String> mobs = new ArrayList<String>();
				mobs.add("Blaze");
				mobs.add("Skeleton");
				mobs.add("LavaSlime");

				final ArrayList<ArrayList<Item>> items = new ArrayList<ArrayList<Item>>();

				final ArrayList<Item> itemArmor = new ArrayList<Item>();
				itemArmor.addAll(this.chestItems.itemArmor);
				itemArmor.addAll(this.chestItems.itemHeavenArmor);
				items.add(itemArmor);

				items.add(this.chestItems.itemEnchant);
				items.add(this.chestItems.itemFoods);
				items.add(this.chestItems.itemMobs);

				final ArrayList<Item> itemOres = new ArrayList<Item>();
				itemOres.addAll(this.chestItems.itemOres);
				itemOres.addAll(this.chestItems.itemHeavenOres);
				items.add(itemOres);

				items.add(this.chestItems.itemPotion);
				items.add(this.chestItems.itemRecords);

				final ArrayList<Item> itemTools = new ArrayList<Item>();
				itemTools.addAll(this.chestItems.itemTools);
				itemTools.addAll(this.chestItems.itemHeavenTools);
				items.add(itemTools);

				new DungeonGeneratorTreasure(world, blocks, mobs, items).generate(random, chunkX, 0, chunkZ);
				System.out.println("treasureNether: x: " + chunkX + ", y: " + 0 + ", z: " + chunkZ);
			}
		}
	}

	private int heavenSpawn(final World world, final int x, final int z) {
		int y = 16;

		for (int yt = y; yt < 128; yt++) {
			if (world.isAirBlock(new BlockPos(x, yt, z))) {
				y = yt;
				break;
			}
		}
		return y;
	}

	public boolean getEquals(final World world, final BlockPos blockPos, final Block block) {
		return world.getBlockState(blockPos).getBlock().getDefaultState().equals(block.getDefaultState());
	}

	@SuppressWarnings("unused")
	public boolean getEquals(final World world, final Block block1, final Block block2) {
		return block1.getDefaultState().equals(block2.getDefaultState());
	}
}
