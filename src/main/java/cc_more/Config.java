package cc_more;

import net.minecraftforge.common.config.Configuration;

public class Config {
	// Dimension
	private static int minersDimensionDefault = 2;
	public static int minersDimension;

	// All
	private static double oreSpawnSizeMultiplierDefault = 1.0;
	private static double oreSpawnTriesMultiplierDefault = 1.0;

	public static double oreSpawnSizeMultiplier;
	public static double oreSpawnTriesMultiplier;

	// Ores
	private static double coalSpawnSizeMultiplierDefault = 1.0;
	private static double coalSpawnTriesMultiplierDefault = 1.0;
	private static int coalSpawnSizeDefault = 17;
	private static int coalSpawnTriesDefault = 20;
	private static int coalSpawnMinHeightDefault = 0;
	private static int coalSpawnMaxHeightDefault = 128;

	public static double coalSpawnSizeMultiplier;
	public static double coalSpawnTriesMultiplier;
	public static int coalSpawnSize;
	public static int coalSpawnTries;
	public static int coalSpawnMinHeight;
	public static int coalSpawnMaxHeight;

	private static double ironSpawnSizeMultiplierDefault = 1.0;
	private static double ironSpawnTriesMultiplierDefault = 1.0;
	private static int ironSpawnSizeDefault = 9;
	private static int ironSpawnTriesMCDefault = 20;
	private static int ironSpawnTriesDefault = 40;
	private static int ironSpawnMinHeightDefault = 0;
	private static int ironSpawnMaxHeightMCDefault = 64;
	private static int ironSpawnMaxHeightDefault = 128;

	public static double ironSpawnSizeMultiplier;
	public static double ironSpawnTriesMultiplier;
	public static int ironSpawnSize;
	public static int ironSpawnTries;
	public static int ironSpawnMinHeight;
	public static int ironSpawnMaxHeight;

	private static double lapisSpawnSizeMultiplierDefault = 1.0;
	private static double lapisSpawnTriesMultiplierDefault = 1.0;
	private static int lapisSpawnSizeDefault = 7;
	private static int lapisSpawnTriesMCDefault = 1;
	private static int lapisSpawnTriesDefault = 8;
	private static int lapisSpawnMinHeightDefault = 0;
	private static int lapisSpawnMaxHeightMCDefault = 16;
	private static int lapisSpawnMaxHeightDefault = 128;

	public static double lapisSpawnSizeMultiplier;
	public static double lapisSpawnTriesMultiplier;
	public static int lapisSpawnSize;
	public static int lapisSpawnTries;
	public static int lapisSpawnMinHeight;
	public static int lapisSpawnMaxHeight;

	private static double goldSpawnSizeMultiplierDefault = 1.0;
	private static double goldSpawnTriesMultiplierDefault = 1.0;
	private static int goldSpawnSizeDefault = 9;
	private static int goldSpawnTriesMCDefault = 2;
	private static int goldSpawnTriesDefault = 8;
	private static int goldSpawnMinHeightDefault = 0;
	private static int goldSpawnMaxHeightMCDefault = 32;
	private static int goldSpawnMaxHeightDefault = 128;

	public static double goldSpawnSizeMultiplier;
	public static double goldSpawnTriesMultiplier;
	public static int goldSpawnSize;
	public static int goldSpawnTries;
	public static int goldSpawnMinHeight;
	public static int goldSpawnMaxHeight;

	private static double redstoneSpawnSizeMultiplierDefault = 1.0;
	private static double redstoneSpawnTriesMultiplierDefault = 1.0;
	private static int redstoneSpawnSizeDefault = 8;
	private static int redstoneSpawnTriesMCDefault = 8;
	private static int redstoneSpawnTriesDefault = 32;
	private static int redstoneSpawnMinHeightDefault = 0;
	private static int redstoneSpawnMaxHeightMCDefault = 16;
	private static int redstoneSpawnMaxHeightDefault = 128;

	public static double redstoneSpawnSizeMultiplier;
	public static double redstoneSpawnTriesMultiplier;
	public static int redstoneSpawnSize;
	public static int redstoneSpawnTries;
	public static int redstoneSpawnMinHeight;
	public static int redstoneSpawnMaxHeight;

	private static double diamondSpawnSizeMultiplierDefault = 1.0;
	private static double diamondSpawnTriesMultiplierDefault = 1.0;
	private static int diamondSpawnSizeDefault = 8;
	private static int diamondSpawnTriesMCDefault = 1;
	private static int diamondSpawnTriesDefault = 8;
	private static int diamondSpawnMinHeightDefault = 0;
	private static int diamondSpawnMaxHeightMCDefault = 16;
	private static int diamondSpawnMaxHeightDefault = 128;

	public static double diamondSpawnSizeMultiplier;
	public static double diamondSpawnTriesMultiplier;
	public static int diamondSpawnSize;
	public static int diamondSpawnTries;
	public static int diamondSpawnMinHeight;
	public static int diamondSpawnMaxHeight;

	private static double emeraldSpawnSizeMultiplierDefault = 1.0;
	private static double emeraldSpawnTriesMultiplierDefault = 1.0;
	private static int emeraldSpawnSizeMCDefault = 1;
	private static int emeraldSpawnSizeDefault = 4;
	private static int emeraldSpawnTriesMCDefault = 1;
	private static int emeraldSpawnTriesDefault = 4;
	private static int emeraldSpawnMinHeightDefault = 0;
	private static int emeraldSpawnMaxHeightDefault = 128;

	public static double emeraldSpawnSizeMultiplier;
	public static double emeraldSpawnTriesMultiplier;
	public static int emeraldSpawnSize;
	public static int emeraldSpawnTries;
	public static int emeraldSpawnMinHeight;
	public static int emeraldSpawnMaxHeight;

	private static double quartzSpawnSizeMultiplierDefault = 1.0;
	private static double quartzSpawnTriesMultiplierDefault = 1.0;
	private static int quartzSpawnSizeDefault = 6;
	private static int quartzSpawnTriesDefault = 6;
	private static int quartzSpawnMinHeightDefault = 0;
	private static int quartzSpawnMaxHeightDefault = 128;

	public static double quartzSpawnSizeMultiplier;
	public static double quartzSpawnTriesMultiplier;
	public static int quartzSpawnSize;
	public static int quartzSpawnTries;
	public static int quartzSpawnMinHeight;
	public static int quartzSpawnMaxHeight;

	private static double copperSpawnSizeMultiplierDefault = 1.0;
	private static double copperSpawnTriesMultiplierDefault = 1.0;
	private static int copperSpawnSizeDefault = 7;
	private static int copperSpawnTriesDefault = 8;
	private static int copperSpawnMinHeightDefault = 0;
	private static int copperSpawnMaxHeightDefault = 128;

	public static double copperSpawnSizeMultiplier;
	public static double copperSpawnTriesMultiplier;
	public static int copperSpawnSize;
	public static int copperSpawnTries;
	public static int copperSpawnMinHeight;
	public static int copperSpawnMaxHeight;

	private static double tinSpawnSizeMultiplierDefault = 1.0;
	private static double tinSpawnTriesMultiplierDefault = 1.0;
	private static int tinSpawnSizeDefault = 7;
	private static int tinSpawnTriesDefault = 8;
	private static int tinSpawnMinHeightDefault = 0;
	private static int tinSpawnMaxHeightDefault = 128;

	public static double tinSpawnSizeMultiplier;
	public static double tinSpawnTriesMultiplier;
	public static int tinSpawnSize;
	public static int tinSpawnTries;
	public static int tinSpawnMinHeight;
	public static int tinSpawnMaxHeight;

	private static double bauxiteSpawnSizeMultiplierDefault = 1.0;
	private static double bauxiteSpawnTriesMultiplierDefault = 1.0;
	private static int bauxiteSpawnSizeDefault = 7;
	private static int bauxiteSpawnTriesDefault = 7;
	private static int bauxiteSpawnMinHeightDefault = 0;
	private static int bauxiteSpawnMaxHeightDefault = 128;

	public static double bauxiteSpawnSizeMultiplier;
	public static double bauxiteSpawnTriesMultiplier;
	public static int bauxiteSpawnSize;
	public static int bauxiteSpawnTries;
	public static int bauxiteSpawnMinHeight;
	public static int bauxiteSpawnMaxHeight;

	private static double chromeSpawnSizeMultiplierDefault = 1.0;
	private static double chromeSpawnTriesMultiplierDefault = 1.0;
	private static int chromeSpawnSizeDefault = 6;
	private static int chromeSpawnTriesDefault = 8;
	private static int chromeSpawnMinHeightDefault = 0;
	private static int chromeSpawnMaxHeightDefault = 128;

	public static double chromeSpawnSizeMultiplier;
	public static double chromeSpawnTriesMultiplier;
	public static int chromeSpawnSize;
	public static int chromeSpawnTries;
	public static int chromeSpawnMinHeight;
	public static int chromeSpawnMaxHeight;

	private static double silverSpawnSizeMultiplierDefault = 1.0;
	private static double silverSpawnTriesMultiplierDefault = 1.0;
	private static int silverSpawnSizeDefault = 9;
	private static int silverSpawnTriesDefault = 5;
	private static int silverSpawnMinHeightDefault = 0;
	private static int silverSpawnMaxHeightDefault = 128;

	public static double silverSpawnSizeMultiplier;
	public static double silverSpawnTriesMultiplier;
	public static int silverSpawnSize;
	public static int silverSpawnTries;
	public static int silverSpawnMinHeight;
	public static int silverSpawnMaxHeight;

	private static double leadSpawnSizeMultiplierDefault = 1.0;
	private static double leadSpawnTriesMultiplierDefault = 1.0;
	private static int leadSpawnSizeDefault = 7;
	private static int leadSpawnTriesDefault = 6;
	private static int leadSpawnMinHeightDefault = 0;
	private static int leadSpawnMaxHeightDefault = 128;

	public static double leadSpawnSizeMultiplier;
	public static double leadSpawnTriesMultiplier;
	public static int leadSpawnSize;
	public static int leadSpawnTries;
	public static int leadSpawnMinHeight;
	public static int leadSpawnMaxHeight;

	private static double rubySpawnSizeMultiplierDefault = 1.0;
	private static double rubySpawnTriesMultiplierDefault = 1.0;
	private static int rubySpawnSizeDefault = 6;
	private static int rubySpawnTriesDefault = 6;
	private static int rubySpawnMinHeightDefault = 0;
	private static int rubySpawnMaxHeightDefault = 128;

	public static double rubySpawnSizeMultiplier;
	public static double rubySpawnTriesMultiplier;
	public static int rubySpawnSize;
	public static int rubySpawnTries;
	public static int rubySpawnMinHeight;
	public static int rubySpawnMaxHeight;

	private static double sapphireSpawnSizeMultiplierDefault = 1.0;
	private static double sapphireSpawnTriesMultiplierDefault = 1.0;
	private static int sapphireSpawnSizeDefault = 5;
	private static int sapphireSpawnTriesDefault = 7;
	private static int sapphireSpawnMinHeightDefault = 0;
	private static int sapphireSpawnMaxHeightDefault = 128;

	public static double sapphireSpawnSizeMultiplier;
	public static double sapphireSpawnTriesMultiplier;
	public static int sapphireSpawnSize;
	public static int sapphireSpawnTries;
	public static int sapphireSpawnMinHeight;
	public static int sapphireSpawnMaxHeight;

	private static double stainlessSpawnSizeMultiplierDefault = 1.0;
	private static double stainlessSpawnTriesMultiplierDefault = 1.0;
	private static int stainlessSpawnSizeDefault = 7;
	private static int stainlessSpawnTriesDefault = 5;
	private static int stainlessSpawnMinHeightDefault = 0;
	private static int stainlessSpawnMaxHeightDefault = 128;

	public static double stainlessSpawnSizeMultiplier;
	public static double stainlessSpawnTriesMultiplier;
	public static int stainlessSpawnSize;
	public static int stainlessSpawnTries;
	public static int stainlessSpawnMinHeight;
	public static int stainlessSpawnMaxHeight;

	private static double fluoriteSpawnSizeMultiplierDefault = 1.0;
	private static double fluoriteSpawnTriesMultiplierDefault = 1.0;
	private static int fluoriteSpawnSizeDefault = 5;
	private static int fluoriteSpawnTriesDefault = 7;
	private static int fluoriteSpawnMinHeightDefault = 0;
	private static int fluoriteSpawnMaxHeightDefault = 128;

	public static double fluoriteSpawnSizeMultiplier;
	public static double fluoriteSpawnTriesMultiplier;
	public static int fluoriteSpawnSize;
	public static int fluoriteSpawnTries;
	public static int fluoriteSpawnMinHeight;
	public static int fluoriteSpawnMaxHeight;

	private static double titaniumSpawnSizeMultiplierDefault = 1.0;
	private static double titaniumSpawnTriesMultiplierDefault = 1.0;
	private static int titaniumSpawnSizeDefault = 6;
	private static int titaniumSpawnTriesDefault = 6;
	private static int titaniumSpawnMinHeightDefault = 0;
	private static int titaniumSpawnMaxHeightDefault = 128;

	public static double titaniumSpawnSizeMultiplier;
	public static double titaniumSpawnTriesMultiplier;
	public static int titaniumSpawnSize;
	public static int titaniumSpawnTries;
	public static int titaniumSpawnMinHeight;
	public static int titaniumSpawnMaxHeight;

	private static double jadeSpawnSizeMultiplierDefault = 1.0;
	private static double jadeSpawnTriesMultiplierDefault = 1.0;
	private static int jadeSpawnSizeDefault = 4;
	private static int jadeSpawnTriesDefault = 8;
	private static int jadeSpawnMinHeightDefault = 0;
	private static int jadeSpawnMaxHeightDefault = 128;

	public static double jadeSpawnSizeMultiplier;
	public static double jadeSpawnTriesMultiplier;
	public static int jadeSpawnSize;
	public static int jadeSpawnTries;
	public static int jadeSpawnMinHeight;
	public static int jadeSpawnMaxHeight;

	private static double uraniumSpawnSizeMultiplierDefault = 1.0;
	private static double uraniumSpawnTriesMultiplierDefault = 1.0;
	private static int uraniumSpawnSizeDefault = 8;
	private static int uraniumSpawnTriesDefault = 4;
	private static int uraniumSpawnMinHeightDefault = 0;
	private static int uraniumSpawnMaxHeightDefault = 128;

	public static double uraniumSpawnSizeMultiplier;
	public static double uraniumSpawnTriesMultiplier;
	public static int uraniumSpawnSize;
	public static int uraniumSpawnTries;
	public static int uraniumSpawnMinHeight;
	public static int uraniumSpawnMaxHeight;

	private static double amethystSpawnSizeMultiplierDefault = 1.0;
	private static double amethystSpawnTriesMultiplierDefault = 1.0;
	private static int amethystSpawnSizeDefault = 5;
	private static int amethystSpawnTriesDefault = 6;
	private static int amethystSpawnMinHeightDefault = 0;
	private static int amethystSpawnMaxHeightDefault = 128;

	public static double amethystSpawnSizeMultiplier;
	public static double amethystSpawnTriesMultiplier;
	public static int amethystSpawnSize;
	public static int amethystSpawnTries;
	public static int amethystSpawnMinHeight;
	public static int amethystSpawnMaxHeight;

	private static double platinumSpawnSizeMultiplierDefault = 1.0;
	private static double platinumSpawnTriesMultiplierDefault = 1.0;
	private static int platinumSpawnSizeDefault = 6;
	private static int platinumSpawnTriesDefault = 5;
	private static int platinumSpawnMinHeightDefault = 0;
	private static int platinumSpawnMaxHeightDefault = 128;

	public static double platinumSpawnSizeMultiplier;
	public static double platinumSpawnTriesMultiplier;
	public static int platinumSpawnSize;
	public static int platinumSpawnTries;
	public static int platinumSpawnMinHeight;
	public static int platinumSpawnMaxHeight;

	private static double meteoriteSpawnSizeMultiplierDefault = 1.0;
	private static double meteoriteSpawnTriesMultiplierDefault = 1.0;
	private static int meteoriteSpawnSizeDefault = 5;
	private static int meteoriteSpawnTriesDefault = 6;
	private static int meteoriteSpawnMinHeightDefault = 0;
	private static int meteoriteSpawnMaxHeightDefault = 128;

	public static double meteoriteSpawnSizeMultiplier;
	public static double meteoriteSpawnTriesMultiplier;
	public static int meteoriteSpawnSize;
	public static int meteoriteSpawnTries;
	public static int meteoriteSpawnMinHeight;
	public static int meteoriteSpawnMaxHeight;

	private static double minersGlowstoneSpawnSizeMultiplierDefault = 1.0;
	private static double minersGlowstoneSpawnTriesMultiplierDefault = 1.0;
	private static int minersGlowstoneSpawnSizeDefault = 6;
	private static int minersGlowstoneSpawnTriesDefault = 12;
	private static int minersGlowstoneSpawnMinHeightDefault = 0;
	private static int minersGlowstoneSpawnMaxHeightDefault = 128;

	public static double minersGlowstoneSpawnSizeMultiplier;
	public static double minersGlowstoneSpawnTriesMultiplier;
	public static int minersGlowstoneSpawnSize;
	public static int minersGlowstoneSpawnTries;
	public static int minersGlowstoneSpawnMinHeight;
	public static int minersGlowstoneSpawnMaxHeight;

	public static void main(final Configuration config) {
		// Dimension
		minersDimension = config.get(
				"dimension",
				"Miners Heaven Dimension Id (Default: "
						+ minersDimensionDefault + ")", minersDimensionDefault)
				.getInt(minersDimensionDefault);

		// All
		oreSpawnSizeMultiplier = config.get(
				"all",
				"Spawn Size Multiplier",
				oreSpawnSizeMultiplierDefault,
				"As long as the Size Multipliers stay '0.0', no extra ore is generated.\r\n"
						+ "This setting has effect on all ores.").getDouble(
				oreSpawnSizeMultiplierDefault);
		oreSpawnTriesMultiplier = config.get(
				"all",
				"Spawn Tries Multiplier",
				oreSpawnTriesMultiplierDefault,
				"As long as the Tries Multipliers stay '0.0', no extra ore is generated.\r\n"
						+ "This setting has effect on all ores.").getDouble(
				oreSpawnTriesMultiplierDefault);

		// Ores
		coalSpawnSizeMultiplier = config.get("coal", "Spawn Size Multiplier",
				coalSpawnSizeMultiplierDefault).getDouble(
				coalSpawnSizeMultiplierDefault);
		coalSpawnTriesMultiplier = config.get("coal", "Spawn Tries Multiplier",
				coalSpawnTriesMultiplierDefault).getDouble(
				coalSpawnTriesMultiplierDefault);
		coalSpawnSize = config.get("coal",
				"Spawn Size (MC 1.8 Default: " + coalSpawnSizeDefault + ")",
				coalSpawnSizeDefault).getInt(coalSpawnSizeDefault);
		coalSpawnTries = config.get("coal",
				"Spawn Tries (MC 1.8 Default: " + coalSpawnTriesDefault + ")",
				coalSpawnTriesDefault).getInt(coalSpawnTriesDefault);
		coalSpawnMinHeight = config.get(
				"coal",
				"Spawn Min Height (MC 1.8 Default: "
						+ coalSpawnMinHeightDefault + ")",
				coalSpawnMinHeightDefault).getInt(coalSpawnMinHeightDefault);
		coalSpawnMaxHeight = config.get(
				"coal",
				"Spawn Max Height (MC 1.8 Default: "
						+ coalSpawnMaxHeightDefault + ")",
				coalSpawnMaxHeightDefault).getInt(coalSpawnMaxHeightDefault);

		ironSpawnSizeMultiplier = config.get("iron", "Spawn Size Multiplier",
				ironSpawnSizeMultiplierDefault).getDouble(
				ironSpawnSizeMultiplierDefault);
		ironSpawnTriesMultiplier = config.get("iron", "Spawn Tries Multiplier",
				ironSpawnTriesMultiplierDefault).getDouble(
				ironSpawnTriesMultiplierDefault);
		ironSpawnSize = config.get("iron",
				"Spawn Size (MC 1.8 Default: " + ironSpawnSizeDefault + ")",
				ironSpawnSizeDefault).getInt(ironSpawnSizeDefault);
		ironSpawnTries = config.get(
				"iron",
				"Spawn Tries (MC 1.8 Default: " + ironSpawnTriesMCDefault
						+ ", MH Default: " + ironSpawnTriesDefault + ")",
				ironSpawnTriesDefault).getInt(ironSpawnTriesDefault);
		ironSpawnMinHeight = config.get(
				"iron",
				"Spawn Min Height (MC 1.8 Default: "
						+ ironSpawnMinHeightDefault + ")",
				ironSpawnMinHeightDefault).getInt(ironSpawnMinHeightDefault);
		ironSpawnMaxHeight = config.get(
				"iron",
				"Spawn Max Height (MC 1.8 Default: "
						+ ironSpawnMaxHeightMCDefault + ", MH Default: "
						+ ironSpawnMaxHeightDefault + ")",
				ironSpawnMaxHeightDefault).getInt(ironSpawnMaxHeightDefault);

		lapisSpawnSizeMultiplier = config.get("lapis", "Spawn Size Multiplier",
				lapisSpawnSizeMultiplierDefault).getDouble(
				lapisSpawnSizeMultiplierDefault);
		lapisSpawnTriesMultiplier = config.get("lapis",
				"Spawn Tries Multiplier", lapisSpawnTriesMultiplierDefault)
				.getDouble(lapisSpawnTriesMultiplierDefault);
		lapisSpawnSize = config.get("lapis",
				"Spawn Size (MC 1.8 Default: " + lapisSpawnSizeDefault + ")",
				lapisSpawnSizeDefault).getInt(lapisSpawnSizeDefault);
		lapisSpawnTries = config.get(
				"lapis",
				"Spawn Tries (MC 1.8 Default: " + lapisSpawnTriesMCDefault
						+ ", MH Default: " + lapisSpawnTriesDefault + ")",
				lapisSpawnTriesDefault).getInt(lapisSpawnTriesDefault);
		lapisSpawnMinHeight = config.get(
				"lapis",
				"Spawn Min Height (MC 1.8 Default: "
						+ lapisSpawnMinHeightDefault + ")",
				lapisSpawnMinHeightDefault).getInt(lapisSpawnMinHeightDefault);
		lapisSpawnMaxHeight = config.get(
				"lapis",
				"Spawn Max Height (MC 1.8 Default: "
						+ lapisSpawnMaxHeightMCDefault + ", MH Default: "
						+ lapisSpawnMaxHeightDefault + ")",
				lapisSpawnMaxHeightDefault).getInt(lapisSpawnMaxHeightDefault);

		goldSpawnSizeMultiplier = config.get("gold", "Spawn Size Multiplier",
				goldSpawnSizeMultiplierDefault).getDouble(
				goldSpawnSizeMultiplierDefault);
		goldSpawnTriesMultiplier = config.get("gold", "Spawn Tries Multiplier",
				goldSpawnTriesMultiplierDefault).getDouble(
				goldSpawnTriesMultiplierDefault);
		goldSpawnSize = config.get("gold",
				"Spawn Size (MC 1.8 Default: " + goldSpawnSizeDefault + ")",
				goldSpawnSizeDefault).getInt(goldSpawnSizeDefault);
		goldSpawnTries = config.get(
				"gold",
				"Spawn Tries (MC 1.8 Default: " + goldSpawnTriesMCDefault
						+ ", MH Default: " + goldSpawnTriesDefault + ")",
				goldSpawnTriesDefault).getInt(goldSpawnTriesDefault);
		goldSpawnMinHeight = config.get(
				"gold",
				"Spawn Min Height (MC 1.8 Default: "
						+ goldSpawnMinHeightDefault + ")",
				goldSpawnMinHeightDefault).getInt(goldSpawnMinHeightDefault);
		goldSpawnMaxHeight = config.get(
				"gold",
				"Spawn Max Height (MC 1.8 Default: "
						+ goldSpawnMaxHeightMCDefault + ", MH Default: "
						+ goldSpawnMaxHeightDefault + ")",
				goldSpawnMaxHeightDefault).getInt(goldSpawnMaxHeightDefault);

		redstoneSpawnSizeMultiplier = config.get("redstone",
				"Spawn Size Multiplier", redstoneSpawnSizeMultiplierDefault)
				.getDouble(redstoneSpawnSizeMultiplierDefault);
		redstoneSpawnTriesMultiplier = config.get("redstone",
				"Spawn Tries Multiplier", redstoneSpawnTriesMultiplierDefault)
				.getDouble(redstoneSpawnTriesMultiplierDefault);
		redstoneSpawnSize = config
				.get("redstone",
						"Spawn Size (MC 1.8 Default: "
								+ redstoneSpawnSizeDefault + ")",
						redstoneSpawnSizeDefault).getInt(
						redstoneSpawnSizeDefault);
		redstoneSpawnTries = config.get(
				"redstone",
				"Spawn Tries (MC 1.8 Default: " + redstoneSpawnTriesMCDefault
						+ ", MH Default: " + redstoneSpawnTriesDefault + ")",
				redstoneSpawnTriesDefault).getInt(redstoneSpawnTriesDefault);
		redstoneSpawnMinHeight = config.get(
				"redstone",
				"Spawn Min Height (MC 1.8 Default: "
						+ redstoneSpawnMinHeightDefault + ")",
				redstoneSpawnMinHeightDefault).getInt(
				redstoneSpawnMinHeightDefault);
		redstoneSpawnMaxHeight = config.get(
				"redstone",
				"Spawn Max Height (MC 1.8 Default: "
						+ redstoneSpawnMaxHeightMCDefault + ", MH Default: "
						+ redstoneSpawnMaxHeightDefault + ")",
				redstoneSpawnMaxHeightDefault).getInt(
				redstoneSpawnMaxHeightDefault);

		diamondSpawnSizeMultiplier = config.get("diamond",
				"Spawn Size Multiplier", diamondSpawnSizeMultiplierDefault)
				.getDouble(diamondSpawnSizeMultiplierDefault);
		diamondSpawnTriesMultiplier = config.get("diamond",
				"Spawn Tries Multiplier", diamondSpawnTriesMultiplierDefault)
				.getDouble(diamondSpawnTriesMultiplierDefault);
		diamondSpawnSize = config.get("diamond",
				"Spawn Size (MC 1.8 Default: " + diamondSpawnSizeDefault + ")",
				diamondSpawnSizeDefault).getInt(diamondSpawnSizeDefault);
		diamondSpawnTries = config.get(
				"diamond",
				"Spawn Tries (MC 1.8 Default: " + diamondSpawnTriesMCDefault
						+ ", MH Default: " + diamondSpawnTriesDefault + ")",
				diamondSpawnTriesDefault).getInt(diamondSpawnTriesDefault);
		diamondSpawnMinHeight = config.get(
				"diamond",
				"Spawn Min Height (MC 1.8 Default: "
						+ diamondSpawnMinHeightDefault + ")",
				diamondSpawnMinHeightDefault).getInt(
				diamondSpawnMinHeightDefault);
		diamondSpawnMaxHeight = config.get(
				"diamond",
				"Spawn Max Height (MC 1.8 Default: "
						+ diamondSpawnMaxHeightMCDefault + ", MH Default: "
						+ diamondSpawnMaxHeightDefault + ")",
				diamondSpawnMaxHeightDefault).getInt(
				diamondSpawnMaxHeightDefault);

		emeraldSpawnSizeMultiplier = config.get("emerald",
				"Spawn Size Multiplier", emeraldSpawnSizeMultiplierDefault)
				.getDouble(emeraldSpawnSizeMultiplierDefault);
		emeraldSpawnTriesMultiplier = config.get("emerald",
				"Spawn Tries Multiplier", emeraldSpawnTriesMultiplierDefault)
				.getDouble(emeraldSpawnTriesMultiplierDefault);
		emeraldSpawnSize = config.get(
				"emerald",
				"Spawn Size (MC 1.8 Default: " + emeraldSpawnSizeMCDefault
						+ ", MH Default: " + emeraldSpawnSizeDefault + ")",
				emeraldSpawnSizeDefault).getInt(emeraldSpawnSizeDefault);
		emeraldSpawnTries = config.get(
				"emerald",
				"Spawn Tries (MC 1.8 Default: " + emeraldSpawnTriesMCDefault
						+ ", MH Default: " + emeraldSpawnTriesDefault + ")",
				emeraldSpawnTriesDefault).getInt(emeraldSpawnTriesDefault);
		emeraldSpawnMinHeight = config.get(
				"emerald",
				"Spawn Min Height (MC 1.8 Default: "
						+ emeraldSpawnMinHeightDefault + ")",
				emeraldSpawnMinHeightDefault).getInt(
				emeraldSpawnMinHeightDefault);
		emeraldSpawnMaxHeight = config.get(
				"emerald",
				"Spawn Max Height (MC 1.8 Default: "
						+ emeraldSpawnMaxHeightDefault + ")",
				emeraldSpawnMaxHeightDefault).getInt(
				emeraldSpawnMaxHeightDefault);

		quartzSpawnSizeMultiplier = config.get("quartz",
				"Spawn Size Multiplier", quartzSpawnSizeMultiplierDefault)
				.getDouble(quartzSpawnSizeMultiplierDefault);
		quartzSpawnTriesMultiplier = config.get("quartz",
				"Spawn Tries Multiplier", quartzSpawnTriesMultiplierDefault)
				.getDouble(quartzSpawnTriesMultiplierDefault);
		quartzSpawnSize = config.get("quartz",
				"Spawn Size (Default: " + quartzSpawnSizeDefault + ")",
				quartzSpawnSizeDefault).getInt(quartzSpawnSizeDefault);
		quartzSpawnTries = config.get("quartz",
				"Spawn Tries (Default: " + quartzSpawnTriesDefault + ")",
				quartzSpawnTriesDefault).getInt(quartzSpawnTriesDefault);
		quartzSpawnMinHeight = config.get(
				"quartz",
				"Spawn Min Height (MC 1.8 Default: "
						+ quartzSpawnMinHeightDefault + ")",
				quartzSpawnMinHeightDefault)
				.getInt(quartzSpawnMinHeightDefault);
		quartzSpawnMaxHeight = config.get(
				"quartz",
				"Spawn Max Height (MC 1.8 Default: "
						+ quartzSpawnMaxHeightDefault + ")",
				quartzSpawnMaxHeightDefault)
				.getInt(quartzSpawnMaxHeightDefault);

		copperSpawnSizeMultiplier = config.get("copper",
				"Spawn Size Multiplier", copperSpawnSizeMultiplierDefault)
				.getDouble(copperSpawnSizeMultiplierDefault);
		copperSpawnTriesMultiplier = config.get("copper",
				"Spawn Tries Multiplier", copperSpawnTriesMultiplierDefault)
				.getDouble(copperSpawnTriesMultiplierDefault);
		copperSpawnSize = config.get("copper",
				"Spawn Size (Default: " + copperSpawnSizeDefault + ")",
				copperSpawnSizeDefault).getInt(copperSpawnSizeDefault);
		copperSpawnTries = config.get("copper",
				"Spawn Tries (Default: " + copperSpawnTriesDefault + ")",
				copperSpawnTriesDefault).getInt(copperSpawnTriesDefault);
		copperSpawnMinHeight = config.get(
				"copper",
				"Spawn Min Height (Default: " + copperSpawnMinHeightDefault
						+ ")", copperSpawnMinHeightDefault).getInt(
				copperSpawnMinHeightDefault);
		copperSpawnMaxHeight = config.get(
				"copper",
				"Spawn Max Height (Default: " + copperSpawnMaxHeightDefault
						+ ")", copperSpawnMaxHeightDefault).getInt(
				copperSpawnMaxHeightDefault);

		tinSpawnSizeMultiplier = config.get("tin", "Spawn Size Multiplier",
				tinSpawnSizeMultiplierDefault).getDouble(
				tinSpawnSizeMultiplierDefault);
		tinSpawnTriesMultiplier = config.get("tin", "Spawn Tries Multiplier",
				tinSpawnTriesMultiplierDefault).getDouble(
				tinSpawnTriesMultiplierDefault);
		tinSpawnSize = config.get("tin",
				"Spawn Size (Default: " + tinSpawnSizeDefault + ")",
				tinSpawnSizeDefault).getInt(tinSpawnSizeDefault);
		tinSpawnTries = config.get("tin",
				"Spawn Tries (Default: " + tinSpawnTriesDefault + ")",
				tinSpawnTriesDefault).getInt(tinSpawnTriesDefault);
		tinSpawnMinHeight = config.get("tin",
				"Spawn Min Height (Default: " + tinSpawnMinHeightDefault + ")",
				tinSpawnMinHeightDefault).getInt(tinSpawnMinHeightDefault);
		tinSpawnMaxHeight = config.get("tin",
				"Spawn Max Height (Default: " + tinSpawnMaxHeightDefault + ")",
				tinSpawnMaxHeightDefault).getInt(tinSpawnMaxHeightDefault);

		bauxiteSpawnSizeMultiplier = config.get("bauxite",
				"Spawn Size Multiplier", bauxiteSpawnSizeMultiplierDefault)
				.getDouble(bauxiteSpawnSizeMultiplierDefault);
		bauxiteSpawnTriesMultiplier = config.get("bauxite",
				"Spawn Tries Multiplier", bauxiteSpawnTriesMultiplierDefault)
				.getDouble(bauxiteSpawnTriesMultiplierDefault);
		bauxiteSpawnSize = config.get("bauxite",
				"Spawn Size (Default: " + bauxiteSpawnSizeDefault + ")",
				bauxiteSpawnSizeDefault).getInt(bauxiteSpawnSizeDefault);
		bauxiteSpawnTries = config.get("bauxite",
				"Spawn Tries (Default: " + bauxiteSpawnTriesDefault + ")",
				bauxiteSpawnTriesDefault).getInt(bauxiteSpawnTriesDefault);
		bauxiteSpawnMinHeight = config.get(
				"bauxite",
				"Spawn Min Height (Default: " + bauxiteSpawnMinHeightDefault
						+ ")", bauxiteSpawnMinHeightDefault).getInt(
				bauxiteSpawnMinHeightDefault);
		bauxiteSpawnMaxHeight = config.get(
				"bauxite",
				"Spawn Max Height (Default: " + bauxiteSpawnMaxHeightDefault
						+ ")", bauxiteSpawnMaxHeightDefault).getInt(
				bauxiteSpawnMaxHeightDefault);

		chromeSpawnSizeMultiplier = config.get("chrome",
				"Spawn Size Multiplier", chromeSpawnSizeMultiplierDefault)
				.getDouble(chromeSpawnSizeMultiplierDefault);
		chromeSpawnTriesMultiplier = config.get("chrome",
				"Spawn Tries Multiplier", chromeSpawnTriesMultiplierDefault)
				.getDouble(chromeSpawnTriesMultiplierDefault);
		chromeSpawnSize = config.get("chrome",
				"Spawn Size (Default: " + chromeSpawnSizeDefault + ")",
				chromeSpawnSizeDefault).getInt(chromeSpawnSizeDefault);
		chromeSpawnTries = config.get("chrome",
				"Spawn Tries (Default: " + chromeSpawnTriesDefault + ")",
				chromeSpawnTriesDefault).getInt(chromeSpawnTriesDefault);
		chromeSpawnMinHeight = config.get(
				"chrome",
				"Spawn Min Height (Default: " + chromeSpawnMinHeightDefault
						+ ")", chromeSpawnMinHeightDefault).getInt(
				chromeSpawnMinHeightDefault);
		chromeSpawnMaxHeight = config.get(
				"chrome",
				"Spawn Max Height (Default: " + chromeSpawnMaxHeightDefault
						+ ")", chromeSpawnMaxHeightDefault).getInt(
				chromeSpawnMaxHeightDefault);

		silverSpawnSizeMultiplier = config.get("silver",
				"Spawn Size Multiplier", silverSpawnSizeMultiplierDefault)
				.getDouble(silverSpawnSizeMultiplierDefault);
		silverSpawnTriesMultiplier = config.get("silver",
				"Spawn Tries Multiplier", silverSpawnTriesMultiplierDefault)
				.getDouble(silverSpawnTriesMultiplierDefault);
		silverSpawnSize = config.get("silver",
				"Spawn Size (Default: " + silverSpawnSizeDefault + ")",
				silverSpawnSizeDefault).getInt(silverSpawnSizeDefault);
		silverSpawnTries = config.get("silver",
				"Spawn Tries (Default: " + silverSpawnTriesDefault + ")",
				silverSpawnTriesDefault).getInt(silverSpawnTriesDefault);
		silverSpawnMinHeight = config.get(
				"silver",
				"Spawn Min Height (Default: " + silverSpawnMinHeightDefault
						+ ")", silverSpawnMinHeightDefault).getInt(
				silverSpawnMinHeightDefault);
		silverSpawnMaxHeight = config.get(
				"silver",
				"Spawn Max Height (Default: " + silverSpawnMaxHeightDefault
						+ ")", silverSpawnMaxHeightDefault).getInt(
				silverSpawnMaxHeightDefault);

		leadSpawnSizeMultiplier = config.get("lead", "Spawn Size Multiplier",
				leadSpawnSizeMultiplierDefault).getDouble(
				leadSpawnSizeMultiplierDefault);
		leadSpawnTriesMultiplier = config.get("lead", "Spawn Tries Multiplier",
				leadSpawnTriesMultiplierDefault).getDouble(
				leadSpawnTriesMultiplierDefault);
		leadSpawnSize = config.get("lead",
				"Spawn Size (Default: " + leadSpawnSizeDefault + ")",
				leadSpawnSizeDefault).getInt(leadSpawnSizeDefault);
		leadSpawnTries = config.get("lead",
				"Spawn Tries (Default: " + leadSpawnTriesDefault + ")",
				leadSpawnTriesDefault).getInt(leadSpawnTriesDefault);
		leadSpawnMinHeight = config
				.get("lead",
						"Spawn Min Height (Default: "
								+ leadSpawnMinHeightDefault + ")",
						leadSpawnMinHeightDefault).getInt(
						leadSpawnMinHeightDefault);
		leadSpawnMaxHeight = config
				.get("lead",
						"Spawn Max Height (Default: "
								+ leadSpawnMaxHeightDefault + ")",
						leadSpawnMaxHeightDefault).getInt(
						leadSpawnMaxHeightDefault);

		rubySpawnSizeMultiplier = config.get("ruby", "Spawn Size Multiplier",
				rubySpawnSizeMultiplierDefault).getDouble(
				rubySpawnSizeMultiplierDefault);
		rubySpawnTriesMultiplier = config.get("ruby", "Spawn Tries Multiplier",
				rubySpawnTriesMultiplierDefault).getDouble(
				rubySpawnTriesMultiplierDefault);
		rubySpawnSize = config.get("ruby",
				"Spawn Size (Default: " + rubySpawnSizeDefault + ")",
				rubySpawnSizeDefault).getInt(rubySpawnSizeDefault);
		rubySpawnTries = config.get("ruby",
				"Spawn Tries (Default: " + rubySpawnTriesDefault + ")",
				rubySpawnTriesDefault).getInt(rubySpawnTriesDefault);
		rubySpawnMinHeight = config
				.get("ruby",
						"Spawn Min Height (Default: "
								+ rubySpawnMinHeightDefault + ")",
						rubySpawnMinHeightDefault).getInt(
						rubySpawnMinHeightDefault);
		rubySpawnMaxHeight = config
				.get("ruby",
						"Spawn Max Height (Default: "
								+ rubySpawnMaxHeightDefault + ")",
						rubySpawnMaxHeightDefault).getInt(
						rubySpawnMaxHeightDefault);

		sapphireSpawnSizeMultiplier = config.get("sapphire",
				"Spawn Size Multiplier", sapphireSpawnSizeMultiplierDefault)
				.getDouble(sapphireSpawnSizeMultiplierDefault);
		sapphireSpawnTriesMultiplier = config.get("sapphire",
				"Spawn Tries Multiplier", sapphireSpawnTriesMultiplierDefault)
				.getDouble(sapphireSpawnTriesMultiplierDefault);
		sapphireSpawnSize = config.get("sapphire",
				"Spawn Size (Default: " + sapphireSpawnSizeDefault + ")",
				sapphireSpawnSizeDefault).getInt(sapphireSpawnSizeDefault);
		sapphireSpawnTries = config.get("sapphire",
				"Spawn Tries (Default: " + sapphireSpawnTriesDefault + ")",
				sapphireSpawnTriesDefault).getInt(sapphireSpawnTriesDefault);
		sapphireSpawnMinHeight = config.get(
				"sapphire",
				"Spawn Min Height (Default: " + sapphireSpawnMinHeightDefault
						+ ")", sapphireSpawnMinHeightDefault).getInt(
				sapphireSpawnMinHeightDefault);
		sapphireSpawnMaxHeight = config.get(
				"sapphire",
				"Spawn Max Height (Default: " + sapphireSpawnMaxHeightDefault
						+ ")", sapphireSpawnMaxHeightDefault).getInt(
				sapphireSpawnMaxHeightDefault);

		stainlessSpawnSizeMultiplier = config.get("stainless",
				"Spawn Size Multiplier", stainlessSpawnSizeMultiplierDefault)
				.getDouble(stainlessSpawnSizeMultiplierDefault);
		stainlessSpawnTriesMultiplier = config.get("stainless",
				"Spawn Tries Multiplier", stainlessSpawnTriesMultiplierDefault)
				.getDouble(stainlessSpawnTriesMultiplierDefault);
		stainlessSpawnSize = config.get("stainless",
				"Spawn Size (Default: " + stainlessSpawnSizeDefault + ")",
				stainlessSpawnSizeDefault).getInt(stainlessSpawnSizeDefault);
		stainlessSpawnTries = config.get("stainless",
				"Spawn Tries (Default: " + stainlessSpawnTriesDefault + ")",
				stainlessSpawnTriesDefault).getInt(stainlessSpawnTriesDefault);
		stainlessSpawnMinHeight = config.get(
				"stainless",
				"Spawn Min Height (Default: " + stainlessSpawnMinHeightDefault
						+ ")", stainlessSpawnMinHeightDefault).getInt(
				stainlessSpawnMinHeightDefault);
		stainlessSpawnMaxHeight = config.get(
				"stainless",
				"Spawn Max Height (Default: " + stainlessSpawnMaxHeightDefault
						+ ")", stainlessSpawnMaxHeightDefault).getInt(
				stainlessSpawnMaxHeightDefault);

		fluoriteSpawnSizeMultiplier = config.get("fluorite",
				"Spawn Size Multiplier", fluoriteSpawnSizeMultiplierDefault)
				.getDouble(fluoriteSpawnSizeMultiplierDefault);
		fluoriteSpawnTriesMultiplier = config.get("fluorite",
				"Spawn Tries Multiplier", fluoriteSpawnTriesMultiplierDefault)
				.getDouble(fluoriteSpawnTriesMultiplierDefault);
		fluoriteSpawnSize = config.get("fluorite",
				"Spawn Size (Default: " + fluoriteSpawnSizeDefault + ")",
				fluoriteSpawnSizeDefault).getInt(fluoriteSpawnSizeDefault);
		fluoriteSpawnTries = config.get("fluorite",
				"Spawn Tries (Default: " + fluoriteSpawnTriesDefault + ")",
				fluoriteSpawnTriesDefault).getInt(fluoriteSpawnTriesDefault);
		fluoriteSpawnMinHeight = config.get(
				"fluorite",
				"Spawn Min Height (Default: " + fluoriteSpawnMinHeightDefault
						+ ")", fluoriteSpawnMinHeightDefault).getInt(
				fluoriteSpawnMinHeightDefault);
		fluoriteSpawnMaxHeight = config.get(
				"fluorite",
				"Spawn Max Height (Default: " + fluoriteSpawnMaxHeightDefault
						+ ")", fluoriteSpawnMaxHeightDefault).getInt(
				fluoriteSpawnMaxHeightDefault);

		titaniumSpawnSizeMultiplier = config.get("titanium",
				"Spawn Size Multiplier", titaniumSpawnSizeMultiplierDefault)
				.getDouble(titaniumSpawnSizeMultiplierDefault);
		titaniumSpawnTriesMultiplier = config.get("titanium",
				"Spawn Tries Multiplier", titaniumSpawnTriesMultiplierDefault)
				.getDouble(titaniumSpawnTriesMultiplierDefault);
		titaniumSpawnSize = config.get("titanium",
				"Spawn Size (Default: " + titaniumSpawnSizeDefault + ")",
				titaniumSpawnSizeDefault).getInt(titaniumSpawnSizeDefault);
		titaniumSpawnTries = config.get("titanium",
				"Spawn Tries (Default: " + titaniumSpawnTriesDefault + ")",
				titaniumSpawnTriesDefault).getInt(titaniumSpawnTriesDefault);
		titaniumSpawnMinHeight = config.get(
				"titanium",
				"Spawn Min Height (Default: " + titaniumSpawnMinHeightDefault
						+ ")", titaniumSpawnMinHeightDefault).getInt(
				titaniumSpawnMinHeightDefault);
		titaniumSpawnMaxHeight = config.get(
				"titanium",
				"Spawn Max Height (Default: " + titaniumSpawnMaxHeightDefault
						+ ")", titaniumSpawnMaxHeightDefault).getInt(
				titaniumSpawnMaxHeightDefault);

		jadeSpawnSizeMultiplier = config.get("jade", "Spawn Size Multiplier",
				jadeSpawnSizeMultiplierDefault).getDouble(
				jadeSpawnSizeMultiplierDefault);
		jadeSpawnTriesMultiplier = config.get("jade", "Spawn Tries Multiplier",
				jadeSpawnTriesMultiplierDefault).getDouble(
				jadeSpawnTriesMultiplierDefault);
		jadeSpawnSize = config.get("jade",
				"Spawn Size (Default: " + jadeSpawnSizeDefault + ")",
				jadeSpawnSizeDefault).getInt(jadeSpawnSizeDefault);
		jadeSpawnTries = config.get("jade",
				"Spawn Tries (Default: " + jadeSpawnTriesDefault + ")",
				jadeSpawnTriesDefault).getInt(jadeSpawnTriesDefault);
		jadeSpawnMinHeight = config
				.get("jade",
						"Spawn Min Height (Default: "
								+ jadeSpawnMinHeightDefault + ")",
						jadeSpawnMinHeightDefault).getInt(
						jadeSpawnMinHeightDefault);
		jadeSpawnMaxHeight = config
				.get("jade",
						"Spawn Max Height (Default: "
								+ jadeSpawnMaxHeightDefault + ")",
						jadeSpawnMaxHeightDefault).getInt(
						jadeSpawnMaxHeightDefault);

		uraniumSpawnSizeMultiplier = config.get("uranium",
				"Spawn Size Multiplier", uraniumSpawnSizeMultiplierDefault)
				.getDouble(uraniumSpawnSizeMultiplierDefault);
		uraniumSpawnTriesMultiplier = config.get("uranium",
				"Spawn Tries Multiplier", uraniumSpawnTriesMultiplierDefault)
				.getDouble(uraniumSpawnTriesMultiplierDefault);
		uraniumSpawnSize = config.get("uranium",
				"Spawn Size (Default: " + uraniumSpawnSizeDefault + ")",
				uraniumSpawnSizeDefault).getInt(uraniumSpawnSizeDefault);
		uraniumSpawnTries = config.get("uranium",
				"Spawn Tries (Default: " + uraniumSpawnTriesDefault + ")",
				uraniumSpawnTriesDefault).getInt(uraniumSpawnTriesDefault);
		uraniumSpawnMinHeight = config.get(
				"uranium",
				"Spawn Min Height (Default: " + uraniumSpawnMinHeightDefault
						+ ")", uraniumSpawnMinHeightDefault).getInt(
				uraniumSpawnMinHeightDefault);
		uraniumSpawnMaxHeight = config.get(
				"uranium",
				"Spawn Max Height (Default: " + uraniumSpawnMaxHeightDefault
						+ ")", uraniumSpawnMaxHeightDefault).getInt(
				uraniumSpawnMaxHeightDefault);

		amethystSpawnSizeMultiplier = config.get("amethyst",
				"Spawn Size Multiplier", amethystSpawnSizeMultiplierDefault)
				.getDouble(amethystSpawnSizeMultiplierDefault);
		amethystSpawnTriesMultiplier = config.get("amethyst",
				"Spawn Tries Multiplier", amethystSpawnTriesMultiplierDefault)
				.getDouble(amethystSpawnTriesMultiplierDefault);
		amethystSpawnSize = config.get("amethyst",
				"Spawn Size (Default: " + amethystSpawnSizeDefault + ")",
				amethystSpawnSizeDefault).getInt(amethystSpawnSizeDefault);
		amethystSpawnTries = config.get("amethyst",
				"Spawn Tries (Default: " + amethystSpawnTriesDefault + ")",
				amethystSpawnTriesDefault).getInt(amethystSpawnTriesDefault);
		amethystSpawnMinHeight = config.get(
				"amethyst",
				"Spawn Min Height (Default: " + amethystSpawnMinHeightDefault
						+ ")", amethystSpawnMinHeightDefault).getInt(
				amethystSpawnMinHeightDefault);
		amethystSpawnMaxHeight = config.get(
				"amethyst",
				"Spawn Max Height (Default: " + amethystSpawnMaxHeightDefault
						+ ")", amethystSpawnMaxHeightDefault).getInt(
				amethystSpawnMaxHeightDefault);

		platinumSpawnSizeMultiplier = config.get("platinum",
				"Spawn Size Multiplier", platinumSpawnSizeMultiplierDefault)
				.getDouble(platinumSpawnSizeMultiplierDefault);
		platinumSpawnTriesMultiplier = config.get("platinum",
				"Spawn Tries Multiplier", platinumSpawnTriesMultiplierDefault)
				.getDouble(platinumSpawnTriesMultiplierDefault);
		platinumSpawnSize = config.get("platinum",
				"Spawn Size (Default: " + platinumSpawnSizeDefault + ")",
				platinumSpawnSizeDefault).getInt(platinumSpawnSizeDefault);
		platinumSpawnTries = config.get("platinum",
				"Spawn Tries (Default: " + platinumSpawnTriesDefault + ")",
				platinumSpawnTriesDefault).getInt(platinumSpawnTriesDefault);
		platinumSpawnMinHeight = config.get(
				"platinum",
				"Spawn Min Height (Default: " + platinumSpawnMinHeightDefault
						+ ")", platinumSpawnMinHeightDefault).getInt(
				platinumSpawnMinHeightDefault);
		platinumSpawnMaxHeight = config.get(
				"platinum",
				"Spawn Max Height (Default: " + platinumSpawnMaxHeightDefault
						+ ")", platinumSpawnMaxHeightDefault).getInt(
				platinumSpawnMaxHeightDefault);

		meteoriteSpawnSizeMultiplier = config.get("meteorite",
				"Spawn Size Multiplier", meteoriteSpawnSizeMultiplierDefault)
				.getDouble(meteoriteSpawnSizeMultiplierDefault);
		meteoriteSpawnTriesMultiplier = config.get("meteorite",
				"Spawn Tries Multiplier", meteoriteSpawnTriesMultiplierDefault)
				.getDouble(meteoriteSpawnTriesMultiplierDefault);
		meteoriteSpawnSize = config.get("meteorite",
				"Spawn Size (Default: " + meteoriteSpawnSizeDefault + ")",
				meteoriteSpawnSizeDefault).getInt(meteoriteSpawnSizeDefault);
		meteoriteSpawnTries = config.get("meteorite",
				"Spawn Tries (Default: " + meteoriteSpawnTriesDefault + ")",
				meteoriteSpawnTriesDefault).getInt(meteoriteSpawnTriesDefault);
		meteoriteSpawnMinHeight = config.get(
				"meteorite",
				"Spawn Min Height (Default: " + meteoriteSpawnMinHeightDefault
						+ ")", meteoriteSpawnMinHeightDefault).getInt(
				meteoriteSpawnMinHeightDefault);
		meteoriteSpawnMaxHeight = config.get(
				"meteorite",
				"Spawn Max Height (Default: " + meteoriteSpawnMaxHeightDefault
						+ ")", meteoriteSpawnMaxHeightDefault).getInt(
				meteoriteSpawnMaxHeightDefault);

		minersGlowstoneSpawnSizeMultiplier = config.get("minersGlowstone",
				"Spawn Size Multiplier",
				minersGlowstoneSpawnSizeMultiplierDefault).getDouble(
				minersGlowstoneSpawnSizeMultiplierDefault);
		minersGlowstoneSpawnTriesMultiplier = config.get("minersGlowstone",
				"Spawn Tries Multiplier",
				minersGlowstoneSpawnTriesMultiplierDefault).getDouble(
				minersGlowstoneSpawnTriesMultiplierDefault);
		minersGlowstoneSpawnSize = config
				.get("minersGlowstone",
						"Spawn Size (Default: "
								+ minersGlowstoneSpawnSizeDefault + ")",
						minersGlowstoneSpawnSizeDefault).getInt(
						minersGlowstoneSpawnSizeDefault);
		minersGlowstoneSpawnTries = config.get(
				"minersGlowstone",
				"Spawn Tries (Default: " + minersGlowstoneSpawnTriesDefault
						+ ")", minersGlowstoneSpawnTriesDefault).getInt(
				minersGlowstoneSpawnTriesDefault);
		minersGlowstoneSpawnMinHeight = config.get(
				"minersGlowstone",
				"Spawn Min Height (Default: "
						+ minersGlowstoneSpawnMinHeightDefault + ")",
				minersGlowstoneSpawnMinHeightDefault).getInt(
				minersGlowstoneSpawnMinHeightDefault);
		minersGlowstoneSpawnMaxHeight = config.get(
				"minersGlowstone",
				"Spawn Max Height (Default: "
						+ minersGlowstoneSpawnMaxHeightDefault + ")",
				minersGlowstoneSpawnMaxHeightDefault).getInt(
				minersGlowstoneSpawnMaxHeightDefault);
	}
}
