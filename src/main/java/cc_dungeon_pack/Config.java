package cc_dungeon_pack;

import net.minecraftforge.common.config.Configuration;

public class Config {
	// General
	public static boolean biomeSpawn;
	private static boolean biomeSpawnDefault = true;

	public static boolean netherMobsInOverworld;
	private static boolean netherMobsInOverworldDefault = true;

	public static double spawnRateMultiplier;
	private static double spawnRateMultiplierDefault = 1.0;
	private static String spawnRateMultiplierComment = "Multiplies the Spawn Rate of all Generators.";

	// Overworld
	public static boolean barn;
	public static int barnSpawnRate;
	private static int barnSpawnRateDefault = 480;

	public static boolean creeperColossSand;
	public static int creeperColossSandSpawnRate;
	private static int creeperColossSandSpawnRateDefault = 480;

	public static boolean creeperColossStone;
	public static int creeperColossStoneSpawnRate;
	private static int creeperColossStoneSpawnRateDefault = 480;

	public static boolean deathTempleStone;
	public static int deathTempleStoneSpawnRate;
	private static int deathTempleStoneSpawnRateDefault = 480;

	public static boolean deathTempleSand;
	public static int deathTempleSandSpawnRate;
	private static int deathTempleSandSpawnRateDefault = 480;

	public static boolean floatingIsland;
	public static int floatingIslandHeight;
	private static int floatingIslandHeightDefault = 112;
	public static int floatingIslandHeightVariation;
	private static int floatingIslandHeightVariationDefault = 16;
	public static int floatingIslandSpawnRate;
	private static int floatingIslandSpawnRateDefault = 720;

	public static boolean fortIce;
	public static int fortIceSpawnRate;
	private static int fortIceSpawnRateDefault = 720;

	public static boolean fortStone;
	public static int fortStoneSpawnRate;
	private static int fortStoneSpawnRateDefault = 720;

	public static boolean fortWooden;
	public static int fortWoodenSpawnRate;
	private static int fortWoodenSpawnRateDefault = 720;

	public static boolean fortSand;
	public static int fortSandSpawnRate;
	private static int fortSandSpawnRateDefault = 720;

	public static boolean graveyard;
	public static int graveyardSpawnRate;
	private static int graveyardSpawnRateDefault = 480;

	public static boolean helpship;
	public static int helpshipSpawnRate;
	private static int helpshipSpawnRateDefault = 600;

	public static boolean hugeShip;
	public static int hugeShipSpawnRate;
	private static int hugeShipSpawnRateDefault = 1280;

	public static boolean igloo;
	public static int iglooSpawnRate;
	private static int iglooSpawnRateDefault = 480;

	public static boolean mysteryStone;
	public static int mysteryStoneSpawnRate;
	private static int mysteryStoneSpawnRateDefault = 480;

	public static boolean mysteryWooden;
	public static int mysteryWoodenSpawnRate;
	private static int mysteryWoodenSpawnRateDefault = 480;

	public static boolean mysterySand;
	public static int mysterySandSpawnRate;
	private static int mysterySandSpawnRateDefault = 480;

	// public static boolean mysteryRooms;
	// public static int mysteryRoomsSpawnRate;
	// private static int mysteryRoomsSpawnRateDefault = 480;

	public static boolean npcFlyObsidian;
	public static int npcFlyObsidianHeight;
	private static int npcFlyObsidianHeightDefault = 112;
	public static int npcFlyObsidianHeightVariation;
	private static int npcFlyObsidianHeightVariationDefault = 16;
	public static int npcFlyObsidianSpawnRate;
	private static int npcFlyObsidianSpawnRateDefault = 720;

	public static boolean npcFlyStone;
	public static int npcFlyStoneHeight;
	private static int npcFlyStoneHeightDefault = 112;
	public static int npcFlyStoneHeightVariation;
	private static int npcFlyStoneHeightVariationDefault = 16;
	public static int npcFlyStoneSpawnRate;
	private static int npcFlyStoneSpawnRateDefault = 720;

	public static boolean npcTown;
	public static int npcTownSpawnRate;
	private static int npcTownSpawnRateDefault = 720;

	// public static boolean pq2Obsidian;
	// public static int pq2ObsidianSpawnRate;
	// private static int pq2ObsidianSpawnRateDefault = 480;
	//
	// public static boolean pq2Stone;
	// public static int pq2StoneSpawnRate;
	// private static int pq2StoneSpawnRateDefault = 480;

	public static boolean prisonDesert;
	public static int prisonDesertSpawnRate;
	private static int prisonDesertSpawnRateDefault = 480;

	public static boolean prisonForest;
	public static int prisonForestSpawnRate;
	private static int prisonForestSpawnRateDefault = 480;

	public static boolean prisonStone;
	public static int prisonStoneSpawnRate;
	private static int prisonStoneSpawnRateDefault = 480;

	public static boolean pyramideSand;
	public static int pyramideSandSpawnRate;
	private static int pyramideSandSpawnRateDefault = 720;

	public static boolean pyramideStone;
	public static int pyramideStoneSpawnRate;
	private static int pyramideStoneSpawnRateDefault = 720;

	public static boolean ship;
	public static int shipSpawnRate;
	private static int shipSpawnRateDefault = 600;

	public static boolean smallTemple;
	public static int smallTempleSpawnRate;
	private static int smallTempleSpawnRateDefault = 480;

	public static boolean spiderBox;
	public static int spiderBoxSpawnRate;
	private static int spiderBoxSpawnRateDefault = 480;

	public static boolean swampTemple;
	public static int swampTempleSpawnRate;
	private static int swampTempleSpawnRateDefault = 480;

	// public static boolean towerObsidian;
	// public static int towerObsidianSpawnRate;
	// private static int towerObsidianSpawnRateDefault = 480;
	//
	// public static boolean towerStone;
	// public static int towerStoneSpawnRate;
	// private static int towerStoneSpawnRateDefault = 480;

	public static boolean treehouse;
	public static int treehouseSpawnRate;
	private static int treehouseSpawnRateDefault = 480;

	public static boolean treasure;
	public static int treasureDepth;
	private static int treasureDepthDefault = 10;
	public static int treasureHeight;
	private static int treasureHeightDefault = 50;
	public static int treasureSize;
	private static int treasureSizeDefault = 27;
	public static int treasureSpawnRate;
	private static int treasureSpawnRateDefault = 720;

	// Nether
	public static boolean barnNether;
	public static int barnNetherSpawnRate;
	private static int barnNetherSpawnRateDefault = 600;

	public static boolean creeperColossNether;
	public static int creeperColossNetherSpawnRate;
	private static int creeperColossNetherSpawnRateDefault = 600;

	public static boolean deathTempleNether;
	public static int deathTempleNetherSpawnRate;
	private static int deathTempleNetherSpawnRateDefault = 600;

	public static boolean floatingIslandNether;
	public static int floatingIslandNetherHeight;
	private static int floatingIslandNetherHeightDefault = 80;
	public static int floatingIslandNetherHeightVariation;
	private static int floatingIslandNetherHeightVariationDefault = 8;
	public static int floatingIslandNetherSpawnRate;
	private static int floatingIslandNetherSpawnRateDefault = 600;

	public static boolean fortNether;
	public static int fortNetherSpawnRate;
	private static int fortNetherSpawnRateDefault = 600;

	public static boolean helpshipNether;
	public static int helpshipNetherSpawnRate;
	private static int helpshipNetherSpawnRateDefault = 600;

	public static boolean hugeShipNether;
	public static int hugeShipNetherSpawnRate;
	private static int hugeShipNetherSpawnRateDefault = 600;

	public static boolean mysteryNether;
	public static int mysteryNetherSpawnRate;
	private static int mysteryNetherSpawnRateDefault = 600;

	public static boolean netherTemple;
	public static int netherTempleSpawnRate;
	private static int netherTempleSpawnRateDefault = 600;

	// public static boolean pq2Nether;
	// public static int pq2NetherSpawnRate;
	// private static int pq2NetherSpawnRateDefault = 600;

	public static boolean prisonNether;
	public static int prisonNetherSpawnRate;
	private static int prisonNetherSpawnRateDefault = 600;

	public static boolean pyramideNether;
	public static int pyramideNetherSpawnRate;
	private static int pyramideNetherSpawnRateDefault = 600;

	public static boolean shipNether;
	public static int shipNetherSpawnRate;
	private static int shipNetherSpawnRateDefault = 600;

	public static boolean treasureNether;
	public static int treasureNetherDepth;
	private static int treasureNetherDepthDefault = 10;
	public static int treasureNetherHeight;
	private static int treasureNetherHeightDefault = 50;
	public static int treasureNetherSize;
	private static int treasureNetherSizeDefault = 27;
	public static int treasureNetherSpawnRate;
	private static int treasureNetherSpawnRateDefault = 600;

	public static void main(final Configuration config) {
		// General
		biomeSpawn = config.get("general", "Biome Spawn", biomeSpawnDefault).getBoolean(biomeSpawnDefault);

		netherMobsInOverworld = config.get("general", "Spawn Nether Mobs In Overworld", netherMobsInOverworldDefault)
				.getBoolean(netherMobsInOverworldDefault);

		spawnRateMultiplier = config
				.get("general", "Spawn Rate Multiplier", spawnRateMultiplierDefault, spawnRateMultiplierComment)
				.getDouble(spawnRateMultiplierDefault);

		// Overworld
		barn = config.get("barn", "Spawn Barn", true).getBoolean(true);
		barnSpawnRate = config.get("barn", "Spawn Rate (Default: " + barnSpawnRateDefault + ")", barnSpawnRateDefault)
				.getInt(barnSpawnRateDefault);

		creeperColossSand = config.get("creeper_coloss_sand", "Spawn Creeper Coloss Sand", true).getBoolean(true);
		creeperColossSandSpawnRate = config.get("creeper_coloss_sand",
				"Spawn Rate (Default: " + creeperColossSandSpawnRateDefault + ")", creeperColossSandSpawnRateDefault)
				.getInt(creeperColossSandSpawnRateDefault);

		creeperColossStone = config.get("creeper_coloss_stone", "Spawn Creeper Coloss Stone", true).getBoolean(true);
		creeperColossStoneSpawnRate = config.get("creeper_coloss_stone",
				"Spawn Rate (Default: " + creeperColossStoneSpawnRateDefault + ")", creeperColossStoneSpawnRateDefault)
				.getInt(creeperColossStoneSpawnRateDefault);

		deathTempleStone = config.get("temple_of_death_stone", "Spawn Temple Of Death Stone", true).getBoolean(true);
		deathTempleStoneSpawnRate = config.get("temple_of_death_stone",
				"Spawn Rate (Default: " + deathTempleStoneSpawnRateDefault + ")", deathTempleStoneSpawnRateDefault)
				.getInt(deathTempleStoneSpawnRateDefault);

		deathTempleSand = config.get("temple_of_death_sand", "Spawn Temple Of Death Sand", true).getBoolean(true);
		deathTempleSandSpawnRate = config.get("temple_of_death_sand",
				"Spawn Rate (Default: " + deathTempleSandSpawnRateDefault + ")", deathTempleSandSpawnRateDefault)
				.getInt(deathTempleSandSpawnRateDefault);

		floatingIsland = config.get("floating_island", "Spawn Floating Island", true).getBoolean(true);
		floatingIslandHeight = config.get("floating_island",
				"Spawn Height Of Floating Island (Default: " + floatingIslandHeightDefault + ")",
				floatingIslandHeightDefault).getInt(floatingIslandHeightDefault);
		floatingIslandHeightVariation = config
				.get("floating_island",
						"Spawn Height Variation Of Floating Island (Default: " + floatingIslandHeightVariationDefault
								+ ")",
						floatingIslandHeightVariationDefault)
				.getInt(floatingIslandHeightVariationDefault);
		floatingIslandSpawnRate = config.get("floating_island",
				"Spawn Rate (Default: " + floatingIslandSpawnRateDefault + ")", floatingIslandSpawnRateDefault)
				.getInt(floatingIslandSpawnRateDefault);

		fortIce = config.get("fort_ice", "Spawn Ice Fort", true).getBoolean(true);
		fortIceSpawnRate = config
				.get("fort_ice", "Spawn Rate (Default: " + fortIceSpawnRateDefault + ")", fortIceSpawnRateDefault)
				.getInt(fortIceSpawnRateDefault);

		fortStone = config.get("fort_stone", "Spawn Stone Fort", true).getBoolean(true);
		fortStoneSpawnRate = config
				.get("fort_stone", "Spawn Rate (Default: " + fortStoneSpawnRateDefault + ")", fortStoneSpawnRateDefault)
				.getInt(fortStoneSpawnRateDefault);

		fortWooden = config.get("fort_wooden", "Spawn Wooden Fort", true).getBoolean(true);
		fortWoodenSpawnRate = config.get("fort_wooden", "Spawn Rate (Default: " + fortWoodenSpawnRateDefault + ")",
				fortWoodenSpawnRateDefault).getInt(fortWoodenSpawnRateDefault);

		fortSand = config.get("fort_sand", "Spawn Sand Fort", true).getBoolean(true);
		fortSandSpawnRate = config
				.get("fort_sand", "Spawn Rate (Default: " + fortSandSpawnRateDefault + ")", fortSandSpawnRateDefault)
				.getInt(fortSandSpawnRateDefault);

		graveyard = config.get("graveyard", "Spawn Graveyard", true).getBoolean(true);
		graveyardSpawnRate = config
				.get("graveyard", "Spawn Rate (Default: " + graveyardSpawnRateDefault + ")", graveyardSpawnRateDefault)
				.getInt(graveyardSpawnRateDefault);

		helpship = config.get("helpship", "Spawn Helpship", true).getBoolean(true);
		helpshipSpawnRate = config
				.get("helpship", "Spawn Rate (Default: " + helpshipSpawnRateDefault + ")", helpshipSpawnRateDefault)
				.getInt(helpshipSpawnRateDefault);

		hugeShip = config.get("huge_ship", "Spawn Huge Ship", true).getBoolean(true);
		hugeShipSpawnRate = config
				.get("huge_ship", "Spawn Rate (Default: " + hugeShipSpawnRateDefault + ")", hugeShipSpawnRateDefault)
				.getInt(hugeShipSpawnRateDefault);

		igloo = config.get("igloo", "Spawn Igloo", true).getBoolean(true);
		iglooSpawnRate = config
				.get("igloo", "Spawn Rate (Default: " + iglooSpawnRateDefault + ")", iglooSpawnRateDefault)
				.getInt(iglooSpawnRateDefault);

		mysteryStone = config.get("mystery_dungeon_stone", "Spawn Stone Mystery Dungeon", true).getBoolean(true);
		mysteryStoneSpawnRate = config.get("mystery_dungeon_stone",
				"Spawn Rate (Default: " + mysteryStoneSpawnRateDefault + ")", mysteryStoneSpawnRateDefault)
				.getInt(mysteryStoneSpawnRateDefault);

		mysteryWooden = config.get("mystery_dungeon_wooden", "Spawn Wooden Mystery Dungeon", true).getBoolean(true);
		mysteryWoodenSpawnRate = config.get("mystery_dungeon_wooden",
				"Spawn Rate (Default: " + mysteryWoodenSpawnRateDefault + ")", mysteryWoodenSpawnRateDefault)
				.getInt(mysteryWoodenSpawnRateDefault);

		mysterySand = config.get("mystery_dungeon_sand", "Spawn Sand Mystery Dungeon", true).getBoolean(true);
		mysterySandSpawnRate = config.get("mystery_dungeon_sand",
				"Spawn Rate (Default: " + mysterySandSpawnRateDefault + ")", mysterySandSpawnRateDefault)
				.getInt(mysterySandSpawnRateDefault);

		// mysteryRooms = config.get("mystery_rooms", "Spawn Mystery Rooms",
		// true).getBoolean(true);
		// mysteryRoomsSpawnRate = config.get("mystery_rooms",
		// "Spawn Rate (Default: " + mysteryRoomsSpawnRateDefault + ")",
		// mysteryRoomsSpawnRateDefault)
		// .getInt(mysteryRoomsSpawnRateDefault);

		npcFlyObsidian = config.get("npc_floating_village_obsidian", "Spawn Obsidian NPC Floating Village", true)
				.getBoolean(true);
		npcFlyObsidianHeight = config.get("npc_floating_village_obsidian",
				"Spawn Height Of Obsidian Floating Village (Default: " + npcFlyObsidianHeightDefault + ")",
				npcFlyObsidianHeightDefault).getInt(npcFlyObsidianHeightDefault);
		npcFlyObsidianHeightVariation = config
				.get("npc_floating_village_obsidian",
						"Spawn Height Variation Of Obsidian Floating Village (Default: "
								+ npcFlyObsidianHeightVariationDefault + ")",
						npcFlyObsidianHeightVariationDefault)
				.getInt(npcFlyObsidianHeightVariationDefault);
		npcFlyObsidianSpawnRate = config.get("npc_floating_village_obsidian",
				"Spawn Rate (Default: " + npcFlyObsidianSpawnRateDefault + ")", npcFlyObsidianSpawnRateDefault)
				.getInt(npcFlyObsidianSpawnRateDefault);

		npcFlyStone = config.get("npc_floating_village_stone", "Spawn Stone NPC Floating Village", true)
				.getBoolean(true);
		npcFlyStoneHeight = config.get("npc_floating_village_stone",
				"Spawn Height Of Stone Floating Village (Default: " + npcFlyStoneHeightDefault + ")",
				npcFlyStoneHeightDefault).getInt(npcFlyStoneHeightDefault);
		npcFlyStoneHeightVariation = config
				.get("npc_floating_village_stone",
						"Spawn Height Variation Of Stone Floating Village (Default: "
								+ npcFlyStoneHeightVariationDefault + ")",
						npcFlyStoneHeightVariationDefault)
				.getInt(npcFlyStoneHeightVariationDefault);
		npcFlyStoneSpawnRate = config.get("npc_floating_village_stone",
				"Spawn Rate (Default: " + npcFlyStoneSpawnRateDefault + ")", npcFlyStoneSpawnRateDefault)
				.getInt(npcFlyStoneSpawnRateDefault);

		npcTown = config.get("npc_town", "Spawn NPC Town", true).getBoolean(true);
		npcTownSpawnRate = config
				.get("npc_town", "Spawn Rate (Default: " + npcTownSpawnRateDefault + ")", npcTownSpawnRateDefault)
				.getInt(npcTownSpawnRateDefault);

		// pq2Obsidian = config.get("glorius_temple_of_pq2_obsidian", "Spawn
		// Obsidian Glorious Temple Of PQ2", true)
		// .getBoolean(true);
		// pq2ObsidianSpawnRate = config.get("glorius_temple_of_pq2_obsidian",
		// "Spawn Rate (Default: " + pq2ObsidianSpawnRateDefault + ")",
		// pq2ObsidianSpawnRateDefault)
		// .getInt(pq2ObsidianSpawnRateDefault);
		//
		// pq2Stone = config.get("glorius_temple_of_pq2_stone", "Spawn Stone
		// Glorious Temple Of PQ2", true)
		// .getBoolean(true);
		// pq2StoneSpawnRate = config.get("glorius_temple_of_pq2_stone",
		// "Spawn Rate (Default: " + pq2StoneSpawnRateDefault + ")",
		// pq2StoneSpawnRateDefault)
		// .getInt(pq2StoneSpawnRateDefault);

		prisonDesert = config.get("prison_desert", "Spawn Desert Prison", true).getBoolean(true);
		prisonDesertSpawnRate = config.get("prison_desert",
				"Spawn Rate (Default: " + prisonDesertSpawnRateDefault + ")", prisonDesertSpawnRateDefault)
				.getInt(prisonDesertSpawnRateDefault);

		prisonForest = config.get("prison_forest", "Spawn Forest Prison", true).getBoolean(true);
		prisonForestSpawnRate = config.get("prison_forest",
				"Spawn Rate (Default: " + prisonForestSpawnRateDefault + ")", prisonForestSpawnRateDefault)
				.getInt(prisonForestSpawnRateDefault);

		prisonStone = config.get("prison_stone", "Spawn Stone Prison", true).getBoolean(true);
		prisonStoneSpawnRate = config.get("prison_stone", "Spawn Rate (Default: " + prisonStoneSpawnRateDefault + ")",
				prisonStoneSpawnRateDefault).getInt(prisonStoneSpawnRateDefault);

		pyramideSand = config.get("pyramide_sand", "Spawn Sand Pyramide", true).getBoolean(true);
		pyramideSandSpawnRate = config.get("pyramide_sand",
				"Spawn Rate (Default: " + pyramideSandSpawnRateDefault + ")", pyramideSandSpawnRateDefault)
				.getInt(pyramideSandSpawnRateDefault);

		pyramideStone = config.get("pyramide_stone", "Spawn Stone Pyramide", true).getBoolean(true);
		pyramideStoneSpawnRate = config.get("pyramide_stone",
				"Spawn Rate (Default: " + pyramideStoneSpawnRateDefault + ")", pyramideStoneSpawnRateDefault)
				.getInt(pyramideStoneSpawnRateDefault);

		ship = config.get("small_ships", "Spawn Small Ships", true).getBoolean(true);
		shipSpawnRate = config
				.get("small_ships", "Spawn Rate (Default: " + shipSpawnRateDefault + ")", shipSpawnRateDefault)
				.getInt(shipSpawnRateDefault);

		smallTemple = config.get("small_temple", "Spawn Small Temple", true).getBoolean(true);
		smallTempleSpawnRate = config.get("small_temple", "Spawn Rate (Default: " + smallTempleSpawnRateDefault + ")",
				smallTempleSpawnRateDefault).getInt(smallTempleSpawnRateDefault);

		spiderBox = config.get("spider_box", "Spawn Spider Box", true).getBoolean(true);
		spiderBoxSpawnRate = config
				.get("spider_box", "Spawn Rate (Default: " + spiderBoxSpawnRateDefault + ")", spiderBoxSpawnRateDefault)
				.getInt(spiderBoxSpawnRateDefault);

		swampTemple = config.get("swamp_temple", "Spawn Swamp Temple", true).getBoolean(true);
		swampTempleSpawnRate = config.get("swamp_temple", "Spawn Rate (Default: " + swampTempleSpawnRateDefault + ")",
				swampTempleSpawnRateDefault).getInt(swampTempleSpawnRateDefault);

		// towerObsidian = config.get("tower_obsidian", "Spawn Obsidian Tower",
		// true).getBoolean(true);
		// towerObsidianSpawnRate = config.get("tower_obsidian",
		// "Spawn Rate (Default: " + towerObsidianSpawnRateDefault + ")",
		// towerObsidianSpawnRateDefault)
		// .getInt(towerObsidianSpawnRateDefault);
		//
		// towerStone = config.get("tower_stone", "Spawn Stone Tower",
		// true).getBoolean(true);
		// towerStoneSpawnRate = config.get("tower_stone", "Spawn Rate (Default:
		// " + towerStoneSpawnRateDefault + ")",
		// towerStoneSpawnRateDefault).getInt(towerStoneSpawnRateDefault);

		treehouse = config.get("treehouse", "Spawn Treehouse", true).getBoolean(true);
		treehouseSpawnRate = config
				.get("treehouse", "Spawn Rate (Default: " + treehouseSpawnRateDefault + ")", treehouseSpawnRateDefault)
				.getInt(treehouseSpawnRateDefault);

		treasure = config.get("treasure_dungeon", "Spawn Treasure Dungeon", true).getBoolean(true);
		treasureDepth = config.get("treasure_dungeon",
				"Spawn Min Height Treasure Dungeon (Default: " + treasureDepthDefault + ")", treasureDepthDefault)
				.getInt(treasureDepthDefault);
		treasureHeight = config.get("treasure_dungeon",
				"Spawn Max Height Treasure Dungeon (Default: " + treasureHeightDefault + ")", treasureHeightDefault)
				.getInt(treasureHeightDefault);
		treasureSize = config.get("treasure_dungeon",
				"Spawn Single Floor Size Treasure Dungeon (Default: " + treasureSizeDefault + ")", treasureSizeDefault)
				.getInt(treasureSizeDefault);
		treasureSpawnRate = config.get("treasure_dungeon", "Spawn Rate (Default: " + treasureSpawnRateDefault + ")",
				treasureSpawnRateDefault).getInt(treasureSpawnRateDefault);

		// Nether
		barnNether = config.get("barn_nether", "Spawn Nether Barn", true).getBoolean(true);
		barnNetherSpawnRate = config.get("barn_nether", "Spawn Rate (Default: " + barnNetherSpawnRateDefault + ")",
				barnNetherSpawnRateDefault).getInt(barnNetherSpawnRateDefault);

		creeperColossNether = config.get("creeper_coloss_nether", "Spawn Nether Creeper Coloss", true).getBoolean(true);
		creeperColossNetherSpawnRate = config
				.get("creeper_coloss_nether", "Spawn Rate (Default: " + creeperColossNetherSpawnRateDefault + ")",
						creeperColossNetherSpawnRateDefault)
				.getInt(creeperColossNetherSpawnRateDefault);

		deathTempleNether = config.get("temple_of_death_nether", "Spawn Nether Temple Of Death", true).getBoolean(true);
		deathTempleNetherSpawnRate = config.get("temple_of_death_nether",
				"Spawn Rate (Default: " + deathTempleNetherSpawnRateDefault + ")", deathTempleNetherSpawnRateDefault)
				.getInt(deathTempleNetherSpawnRateDefault);

		floatingIslandNether = config.get("floating_island_nether", "Spawn Nether Floating Island", true)
				.getBoolean(true);
		floatingIslandNetherHeight = config.get("floating_island_nether",
				"Spawn Height Of Nether Floating Island (Default: " + floatingIslandNetherHeightDefault + ")",
				floatingIslandNetherHeightDefault).getInt(floatingIslandNetherHeightDefault);
		floatingIslandNetherHeightVariation = config.get("floating_island_nether",
				"Spawn Height Variation Of Nether Floating Island (Default: "
						+ floatingIslandNetherHeightVariationDefault + ")",
				floatingIslandNetherHeightVariationDefault).getInt(floatingIslandNetherHeightVariationDefault);
		floatingIslandNetherSpawnRate = config
				.get("floating_island_nether", "Spawn Rate (Default: " + floatingIslandNetherSpawnRateDefault + ")",
						floatingIslandNetherSpawnRateDefault)
				.getInt(floatingIslandNetherSpawnRateDefault);

		fortNether = config.get("fort_nether", "Spawn Nether Fort", true).getBoolean(true);
		fortNetherSpawnRate = config.get("fort_nether", "Spawn Rate (Default: " + fortNetherSpawnRateDefault + ")",
				fortNetherSpawnRateDefault).getInt(fortNetherSpawnRateDefault);

		helpshipNether = config.get("helpship_nether", "Spawn Helpship Nether", true).getBoolean(true);
		helpshipNetherSpawnRate = config.get("helpship_nether",
				"Spawn Rate (Default: " + helpshipNetherSpawnRateDefault + ")", helpshipNetherSpawnRateDefault)
				.getInt(helpshipNetherSpawnRateDefault);

		hugeShipNether = config.get("huge_ship_nether", "Spawn Nether Huge Ship", true).getBoolean(true);
		hugeShipNetherSpawnRate = config.get("huge_ship_nether",
				"Spawn Rate (Default: " + hugeShipNetherSpawnRateDefault + ")", hugeShipNetherSpawnRateDefault)
				.getInt(hugeShipNetherSpawnRateDefault);

		mysteryNether = config.get("mystery_dungeon_nether", "Spawn Nether Mystery Dungeon", true).getBoolean(true);
		mysteryNetherSpawnRate = config.get("mystery_dungeon_nether",
				"Spawn Rate (Default: " + mysteryNetherSpawnRateDefault + ")", mysteryNetherSpawnRateDefault)
				.getInt(mysteryNetherSpawnRateDefault);

		netherTemple = config.get("nether_temple", "Spawn Nether Temple", true).getBoolean(true);
		netherTempleSpawnRate = config.get("nether_temple",
				"Spawn Rate (Default: " + netherTempleSpawnRateDefault + ")", netherTempleSpawnRateDefault)
				.getInt(netherTempleSpawnRateDefault);

		// pq2Nether = config.get("glorius_temple_of_pq2_nether", "Spawn Nether
		// Glorious Temple Of PQ2", true)
		// .getBoolean(true);
		// pq2NetherSpawnRate = config.get("glorius_temple_of_pq2_nether",
		// "Spawn Rate (Default: " + pq2NetherSpawnRateDefault + ")",
		// pq2NetherSpawnRateDefault)
		// .getInt(pq2NetherSpawnRateDefault);

		prisonNether = config.get("prison_nether", "Spawn Nether Prison", true).getBoolean(true);
		prisonNetherSpawnRate = config.get("prison_nether",
				"Spawn Rate (Default: " + prisonNetherSpawnRateDefault + ")", prisonNetherSpawnRateDefault)
				.getInt(prisonNetherSpawnRateDefault);

		pyramideNether = config.get("pyramide_nether", "Spawn Nether Pyramide", true).getBoolean(true);
		pyramideNetherSpawnRate = config.get("pyramide_nether",
				"Spawn Rate (Default: " + pyramideNetherSpawnRateDefault + ")", pyramideNetherSpawnRateDefault)
				.getInt(pyramideNetherSpawnRateDefault);

		shipNether = config.get("small_ships_nether", "Spawn Nether Small Ships", true).getBoolean(true);
		shipNetherSpawnRate = config.get("small_ships_nether",
				"Spawn Rate (Default: " + shipNetherSpawnRateDefault + ")", shipNetherSpawnRateDefault)
				.getInt(shipNetherSpawnRateDefault);

		treasureNether = config.get("treasure_nether_dungeon", "Spawn Treasure Nether Dungeon", true).getBoolean(true);
		treasureNetherDepth = config.get("treasure_nether_dungeon",
				"Spawn Min Height Treasure Nether Dungeon (Default: " + treasureNetherDepthDefault + ")",
				treasureNetherDepthDefault).getInt(treasureNetherDepthDefault);
		treasureNetherHeight = config.get("treasure_nether_dungeon",
				"Spawn Max Height Treasure Nether Dungeon (Default: " + treasureNetherHeightDefault + ")",
				treasureNetherHeightDefault).getInt(treasureNetherHeightDefault);
		treasureNetherSize = config.get("treasure_nether_dungeon",
				"Spawn Single Floor Size Treasure Nether Dungeon (Default: " + treasureNetherSizeDefault + ")",
				treasureNetherSizeDefault).getInt(treasureNetherSizeDefault);
		treasureNetherSpawnRate = config.get("treasure_nether_dungeon",
				"Spawn Rate (Default: " + treasureNetherSpawnRateDefault + ")", treasureNetherSpawnRateDefault)
				.getInt(treasureNetherSpawnRateDefault);
	}
}
