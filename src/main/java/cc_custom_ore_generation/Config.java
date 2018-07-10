package cc_custom_ore_generation;

import net.minecraftforge.common.config.Configuration;

public class Config {
	// All
	public static double oreSpawnSizeMultiplierDefault = 1.0;
	public static double oreSpawnTriesMultiplierDefault = 1.0;
	public static double oreSpawnSizeMultiplier;
	public static double oreSpawnTriesMultiplier;

	private static String oreSpawnSizeComment = "As long as the Size Multipliers stay '0.0', no extra ore is generated.\r\n"
			+ "This setting has effect on all ores.";
	private static String oreSpawnTriesComment = "As long as the Tries Multipliers stay '0.0', no extra ore is generated.\r\n"
			+ "This setting has effect on all ores.";

	// Ores
	public static double coalSpawnSizeMultiplierDefault = 1.0;
	public static double coalSpawnTriesMultiplierDefault = 1.0;
	public static int coalSpawnSizeDefault = 17;
	public static int coalSpawnTriesDefault = 20;
	public static int coalSpawnMinHeightDefault = 0;
	public static int coalSpawnMaxHeightDefault = 128;

	public static double coalSpawnSizeMultiplier;
	public static double coalSpawnTriesMultiplier;
	public static int coalSpawnSize;
	public static int coalSpawnTries;
	public static int coalSpawnMinHeight;
	public static int coalSpawnMaxHeight;

	private static String coalSpawnTriesComment = "Suggested Settings - Default World: 20, Amplified World: 40";
	private static String coalSpawnHeightComment = "Suggested Settings - Default World: 128, Amplified World: 256";

	public static double ironSpawnSizeMultiplierDefault = 1.0;
	public static double ironSpawnTriesMultiplierDefault = 1.0;
	public static int ironSpawnSizeDefault = 9;
	public static int ironSpawnTriesDefault = 20;
	public static int ironSpawnMinHeightDefault = 0;
	public static int ironSpawnMaxHeightDefault = 64;

	public static double ironSpawnSizeMultiplier;
	public static double ironSpawnTriesMultiplier;
	public static int ironSpawnSize;
	public static int ironSpawnTries;
	public static int ironSpawnMinHeight;
	public static int ironSpawnMaxHeight;

	private static String ironSpawnTriesComment = "Suggested Settings - Default World: 20, Amplified World: 40";
	private static String ironSpawnHeightComment = "Suggested Settings - Default World: 128, Amplified World: 256";

	public static double lapisSpawnSizeMultiplierDefault = 1.0;
	public static double lapisSpawnTriesMultiplierDefault = 1.0;
	public static int lapisSpawnSizeDefault = 7;
	public static int lapisSpawnTriesDefault = 1;
	public static int lapisSpawnMinHeightDefault = 0;
	public static int lapisSpawnMaxHeightDefault = 16;

	public static double lapisSpawnSizeMultiplier;
	public static double lapisSpawnTriesMultiplier;
	public static int lapisSpawnSize;
	public static int lapisSpawnTries;
	public static int lapisSpawnMinHeight;
	public static int lapisSpawnMaxHeight;

	private static String lapisSpawnTriesComment = "Suggested Settings - Default World: 7, Amplified World: 14";
	private static String lapisSpawnHeightComment = "Suggested Settings - Default World: 128, Amplified World: 256";

	public static double goldSpawnSizeMultiplierDefault = 1.0;
	public static double goldSpawnTriesMultiplierDefault = 1.0;
	public static int goldSpawnSizeDefault = 9;
	public static int goldSpawnTriesDefault = 2;
	public static int goldSpawnMinHeightDefault = 0;
	public static int goldSpawnMaxHeightDefault = 32;

	public static double goldSpawnSizeMultiplier;
	public static double goldSpawnTriesMultiplier;
	public static int goldSpawnSize;
	public static int goldSpawnTries;
	public static int goldSpawnMinHeight;
	public static int goldSpawnMaxHeight;

	private static String goldSpawnTriesComment = "Suggested Settings - Default World: 6, Amplified World: 12";
	private static String goldSpawnHeightComment = "Suggested Settings - Default World: 128, Amplified World: 256";

	public static double redstoneSpawnSizeMultiplierDefault = 1.0;
	public static double redstoneSpawnTriesMultiplierDefault = 1.0;
	public static int redstoneSpawnSizeDefault = 8;
	public static int redstoneSpawnTriesDefault = 8;
	public static int redstoneSpawnMinHeightDefault = 0;
	public static int redstoneSpawnMaxHeightDefault = 16;

	public static double redstoneSpawnSizeMultiplier;
	public static double redstoneSpawnTriesMultiplier;
	public static int redstoneSpawnSize;
	public static int redstoneSpawnTries;
	public static int redstoneSpawnMinHeight;
	public static int redstoneSpawnMaxHeight;

	private static String redstoneSpawnTriesComment = "Suggested Settings - Default World: 32, Amplified World: 64";
	private static String redstoneSpawnHeightComment = "Suggested Settings - Default World: 128, Amplified World: 256";

	public static double diamondSpawnSizeMultiplierDefault = 1.0;
	public static double diamondSpawnTriesMultiplierDefault = 1.0;
	public static int diamondSpawnSizeDefault = 8;
	public static int diamondSpawnTriesDefault = 1;
	public static int diamondSpawnMinHeightDefault = 0;
	public static int diamondSpawnMaxHeightDefault = 16;

	public static double diamondSpawnSizeMultiplier;
	public static double diamondSpawnTriesMultiplier;
	public static int diamondSpawnSize;
	public static int diamondSpawnTries;
	public static int diamondSpawnMinHeight;
	public static int diamondSpawnMaxHeight;

	private static String diamondSpawnTriesComment = "Suggested Settings - Default World: 7, Amplified World: 14";
	private static String diamondSpawnHeightComment = "Suggested Settings - Default World: 128, Amplified World: 256";

	public static double emeraldSpawnSizeMultiplierDefault = 1.0;
	public static double emeraldSpawnTriesMultiplierDefault = 1.0;
	public static int emeraldSpawnSizeDefault = 1;
	public static int emeraldSpawnTriesDefault = 1;
	public static int emeraldSpawnMinHeightDefault = 0;
	public static int emeraldSpawnMaxHeightDefault = 128;

	public static double emeraldSpawnSizeMultiplier;
	public static double emeraldSpawnTriesMultiplier;
	public static int emeraldSpawnSize;
	public static int emeraldSpawnTries;
	public static int emeraldSpawnMinHeight;
	public static int emeraldSpawnMaxHeight;

	private static String emeraldSpawnSizeComment = "Suggested Settings - Default World: 4, Amplified World: 4";
	private static String emeraldSpawnTriesComment = "Suggested Settings - Default World: 4, Amplified World: 8";
	private static String emeraldSpawnHeightComment = "Suggested Settings - Default World: 128, Amplified World: 256";

	public static double quartzSpawnSizeMultiplierDefault = 1.0;
	public static double quartzSpawnTriesMultiplierDefault = 1.0;
	public static int quartzSpawnSizeDefault = 6;
	public static int quartzSpawnTriesDefault = 6;
	public static int quartzSpawnMinHeightDefault = 0;
	public static int quartzSpawnMaxHeightDefault = 128;

	public static double quartzSpawnSizeMultiplier;
	public static double quartzSpawnTriesMultiplier;
	public static int quartzSpawnSize;
	public static int quartzSpawnTries;
	public static int quartzSpawnMinHeight;
	public static int quartzSpawnMaxHeight;

	public static void main(final Configuration config) {
		// All
		oreSpawnSizeMultiplier = config
				.get("all", "Spawn Size Multiplier", oreSpawnSizeMultiplierDefault, oreSpawnSizeComment).getDouble();
		oreSpawnTriesMultiplier = config
				.get("all", "Spawn Tries Multiplier", oreSpawnTriesMultiplierDefault, oreSpawnTriesComment).getDouble();

		// Ores
		coalSpawnSizeMultiplier = config.get("coal", "Spawn Size Multiplier", coalSpawnSizeMultiplierDefault)
				.getDouble();
		coalSpawnTriesMultiplier = config.get("coal", "Spawn Tries Multiplier", coalSpawnTriesMultiplierDefault)
				.getDouble();
		coalSpawnSize = config
				.get("coal", "Spawn Size (MC 1.8 Default: " + coalSpawnSizeDefault + ")", coalSpawnSizeDefault)
				.getInt();
		coalSpawnTries = config.get("coal", "Spawn Tries (MC 1.8 Default: " + coalSpawnTriesDefault + ")",
				coalSpawnTriesDefault, coalSpawnTriesComment).getInt();
		coalSpawnMinHeight = config.get("coal", "Spawn Min Height (MC 1.8 Default: " + coalSpawnMinHeightDefault + ")",
				coalSpawnMinHeightDefault).getInt();
		coalSpawnMaxHeight = config.get("coal", "Spawn Max Height (MC 1.8 Default: " + coalSpawnMaxHeightDefault + ")",
				coalSpawnMaxHeightDefault, coalSpawnHeightComment).getInt();

		ironSpawnSizeMultiplier = config.get("iron", "Spawn Size Multiplier", ironSpawnSizeMultiplierDefault)
				.getDouble();
		ironSpawnTriesMultiplier = config.get("iron", "Spawn Tries Multiplier", ironSpawnTriesMultiplierDefault)
				.getDouble();
		ironSpawnSize = config
				.get("iron", "Spawn Size (MC 1.8 Default: " + ironSpawnSizeDefault + ")", ironSpawnSizeDefault)
				.getInt();
		ironSpawnTries = config.get("iron", "Spawn Tries (MC 1.8 Default: " + ironSpawnTriesDefault + ")",
				ironSpawnTriesDefault, ironSpawnTriesComment).getInt();
		ironSpawnMinHeight = config.get("iron", "Spawn Min Height (MC 1.8 Default: " + ironSpawnMinHeightDefault + ")",
				ironSpawnMinHeightDefault).getInt();
		ironSpawnMaxHeight = config.get("iron", "Spawn Max Height (MC 1.8 Default: " + ironSpawnMaxHeightDefault + ")",
				ironSpawnMaxHeightDefault, ironSpawnHeightComment).getInt();

		lapisSpawnSizeMultiplier = config.get("lapis", "Spawn Size Multiplier", lapisSpawnSizeMultiplierDefault)
				.getDouble();
		lapisSpawnTriesMultiplier = config.get("lapis", "Spawn Tries Multiplier", lapisSpawnTriesMultiplierDefault)
				.getDouble();
		lapisSpawnSize = config
				.get("lapis", "Spawn Size (MC 1.8 Default: " + lapisSpawnSizeDefault + ")", lapisSpawnSizeDefault)
				.getInt();
		lapisSpawnTries = config.get("lapis", "Spawn Tries (MC 1.8 Default: " + lapisSpawnTriesDefault + ")",
				lapisSpawnTriesDefault, lapisSpawnTriesComment).getInt();
		lapisSpawnMinHeight = config.get("lapis",
				"Spawn Min Height (MC 1.8 Default: " + lapisSpawnMinHeightDefault + ")", lapisSpawnMinHeightDefault)
				.getInt();
		lapisSpawnMaxHeight = config
				.get("lapis", "Spawn Max Height (MC 1.8 Default: " + lapisSpawnMaxHeightDefault + ")",
						lapisSpawnMaxHeightDefault, lapisSpawnHeightComment)
				.getInt();

		goldSpawnSizeMultiplier = config.get("gold", "Spawn Size Multiplier", goldSpawnSizeMultiplierDefault)
				.getDouble();
		goldSpawnTriesMultiplier = config.get("gold", "Spawn Tries Multiplier", goldSpawnTriesMultiplierDefault)
				.getDouble();
		goldSpawnSize = config
				.get("gold", "Spawn Size (MC 1.8 Default: " + goldSpawnSizeDefault + ")", goldSpawnSizeDefault)
				.getInt();
		goldSpawnTries = config.get("gold", "Spawn Tries (MC 1.8 Default: " + goldSpawnTriesDefault + ")",
				goldSpawnTriesDefault, goldSpawnTriesComment).getInt();
		goldSpawnMinHeight = config.get("gold", "Spawn Min Height (MC 1.8 Default: " + goldSpawnMinHeightDefault + ")",
				goldSpawnMinHeightDefault).getInt();
		goldSpawnMaxHeight = config.get("gold", "Spawn Max Height (MC 1.8 Default: " + goldSpawnMaxHeightDefault + ")",
				goldSpawnMaxHeightDefault, goldSpawnHeightComment).getInt();

		redstoneSpawnSizeMultiplier = config
				.get("redstone", "Spawn Size Multiplier", redstoneSpawnSizeMultiplierDefault).getDouble();
		redstoneSpawnTriesMultiplier = config
				.get("redstone", "Spawn Tries Multiplier", redstoneSpawnTriesMultiplierDefault).getDouble();
		redstoneSpawnSize = config.get("redstone", "Spawn Size (MC 1.8 Default: " + redstoneSpawnSizeDefault + ")",
				redstoneSpawnSizeDefault).getInt();
		redstoneSpawnTries = config.get("redstone", "Spawn Tries (MC 1.8 Default: " + redstoneSpawnTriesDefault + ")",
				redstoneSpawnTriesDefault, redstoneSpawnTriesComment).getInt();
		redstoneSpawnMinHeight = config
				.get("redstone", "Spawn Min Height (MC 1.8 Default: " + redstoneSpawnMinHeightDefault + ")",
						redstoneSpawnMinHeightDefault)
				.getInt();
		redstoneSpawnMaxHeight = config
				.get("redstone", "Spawn Max Height (MC 1.8 Default: " + redstoneSpawnMaxHeightDefault + ")",
						redstoneSpawnMaxHeightDefault, redstoneSpawnHeightComment)
				.getInt();

		diamondSpawnSizeMultiplier = config.get("diamond", "Spawn Size Multiplier", diamondSpawnSizeMultiplierDefault)
				.getDouble();
		diamondSpawnTriesMultiplier = config
				.get("diamond", "Spawn Tries Multiplier", diamondSpawnTriesMultiplierDefault).getDouble();
		diamondSpawnSize = config
				.get("diamond", "Spawn Size (MC 1.8 Default: " + diamondSpawnSizeDefault + ")", diamondSpawnSizeDefault)
				.getInt();
		diamondSpawnTries = config.get("diamond", "Spawn Tries (MC 1.8 Default: " + diamondSpawnTriesDefault + ")",
				diamondSpawnTriesDefault, diamondSpawnTriesComment).getInt();
		diamondSpawnMinHeight = config.get("diamond",
				"Spawn Min Height (MC 1.8 Default: " + diamondSpawnMinHeightDefault + ")", diamondSpawnMinHeightDefault)
				.getInt();
		diamondSpawnMaxHeight = config
				.get("diamond", "Spawn Max Height (MC 1.8 Default: " + diamondSpawnMaxHeightDefault + ")",
						diamondSpawnMaxHeightDefault, diamondSpawnHeightComment)
				.getInt();

		emeraldSpawnSizeMultiplier = config.get("emerald", "Spawn Size Multiplier", emeraldSpawnSizeMultiplierDefault)
				.getDouble();
		emeraldSpawnTriesMultiplier = config
				.get("emerald", "Spawn Tries Multiplier", emeraldSpawnTriesMultiplierDefault).getDouble();
		emeraldSpawnSize = config.get("emerald", "Spawn Size (MC 1.8 Default: " + emeraldSpawnSizeDefault + ")",
				emeraldSpawnSizeDefault, emeraldSpawnSizeComment).getInt();
		emeraldSpawnTries = config.get("emerald", "Spawn Tries (MC 1.8 Default: " + emeraldSpawnTriesDefault + ")",
				emeraldSpawnTriesDefault, emeraldSpawnTriesComment).getInt();
		emeraldSpawnMinHeight = config.get("emerald",
				"Spawn Min Height (MC 1.8 Default: " + emeraldSpawnMinHeightDefault + ")", emeraldSpawnMinHeightDefault)
				.getInt();
		emeraldSpawnMaxHeight = config
				.get("emerald", "Spawn Max Height (MC 1.8 Default: " + emeraldSpawnMaxHeightDefault + ")",
						emeraldSpawnMaxHeightDefault, emeraldSpawnHeightComment)
				.getInt();

		quartzSpawnSizeMultiplier = config.get("quartz", "Spawn Size Multiplier", quartzSpawnSizeMultiplierDefault)
				.getDouble();
		quartzSpawnTriesMultiplier = config.get("quartz", "Spawn Tries Multiplier", quartzSpawnTriesMultiplierDefault)
				.getDouble();
		quartzSpawnSize = config
				.get("quartz", "Spawn Size (Default: " + quartzSpawnSizeDefault + ")", quartzSpawnSizeDefault).getInt();
		quartzSpawnTries = config
				.get("quartz", "Spawn Tries (Default: " + quartzSpawnTriesDefault + ")", quartzSpawnTriesDefault)
				.getInt();
		quartzSpawnMinHeight = config.get("quartz",
				"Spawn Min Height (MC 1.8 Default: " + quartzSpawnMinHeightDefault + ")", quartzSpawnMinHeightDefault)
				.getInt();
		quartzSpawnMaxHeight = config.get("quartz",
				"Spawn Max Height (MC 1.8 Default: " + quartzSpawnMaxHeightDefault + ")", quartzSpawnMaxHeightDefault)
				.getInt();
	}
}
