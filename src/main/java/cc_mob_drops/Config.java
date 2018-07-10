package cc_mob_drops;

import net.minecraftforge.common.config.Configuration;

public class Config {
	private static boolean dropsBatDefault = true;
	private static boolean dropsChickenDefault = true;
	private static boolean dropsCowDefault = true;
	private static boolean dropsCreeperDefault = true;
	private static boolean dropsEndermanDefault = true;
	private static boolean dropsHorseDefault = true;
	private static boolean dropsMagmaCubeDefault = true;
	private static boolean dropsPigDefault = true;
	private static boolean dropsPigZombieDefault = true;
	private static boolean dropsSheepDefault = true;
	private static boolean dropsSlimeDefault = true;
	private static boolean dropsSpiderDefault = true;
	private static boolean dropsSquidDefault = true;
	private static boolean dropsWolfDefault = true;
	private static boolean dropsZombieDefault = true;

	public static boolean dropsBat;
	public static boolean dropsChicken;
	public static boolean dropsCow;
	public static boolean dropsCreeper;
	public static boolean dropsEnderman;
	public static boolean dropsHorse;
	public static boolean dropsMagmaCube;
	public static boolean dropsPig;
	public static boolean dropsPigZombie;
	public static boolean dropsSheep;
	public static boolean dropsSlime;
	public static boolean dropsSpider;
	public static boolean dropsSquid;
	public static boolean dropsWolf;
	public static boolean dropsZombie;

	public static void main(final Configuration config) {
		dropsBat = config.get("drops",
				"Bat (Default: " + dropsBatDefault + ")", dropsBatDefault)
				.getBoolean(dropsBatDefault);
		dropsChicken = config.get("drops",
				"Chicken (Default: " + dropsChickenDefault + ")",
				dropsChickenDefault).getBoolean(dropsChickenDefault);
		dropsCow = config.get("drops",
				"Cow (Default: " + dropsCowDefault + ")", dropsCowDefault)
				.getBoolean(dropsCowDefault);
		dropsCreeper = config.get("drops",
				"Creeper (Default: " + dropsCreeperDefault + ")",
				dropsCreeperDefault).getBoolean(dropsCreeperDefault);
		dropsEnderman = config.get("drops",
				"Enderman (Default: " + dropsEndermanDefault + ")",
				dropsEndermanDefault).getBoolean(dropsEndermanDefault);
		dropsHorse = config
				.get("drops", "Horse (Default: " + dropsHorseDefault + ")",
						dropsHorseDefault).getBoolean(dropsHorseDefault);
		dropsMagmaCube = config.get("drops",
				"MagmaCube (Default: " + dropsMagmaCubeDefault + ")",
				dropsMagmaCubeDefault).getBoolean(dropsMagmaCubeDefault);
		dropsPig = config.get("drops",
				"Pig (Default: " + dropsPigDefault + ")", dropsPigDefault)
				.getBoolean(dropsPigDefault);
		dropsPigZombie = config.get("drops",
				"PigZombie (Default: " + dropsPigZombieDefault + ")",
				dropsPigZombieDefault).getBoolean(dropsPigZombieDefault);
		dropsSheep = config
				.get("drops", "Sheep (Default: " + dropsSheepDefault + ")",
						dropsSheepDefault).getBoolean(dropsSheepDefault);
		dropsSlime = config
				.get("drops", "Slime (Default: " + dropsSlimeDefault + ")",
						dropsSlimeDefault).getBoolean(dropsSlimeDefault);
		dropsSpider = config.get("drops",
				"Spider (Default: " + dropsSpiderDefault + ")",
				dropsSpiderDefault).getBoolean(dropsSpiderDefault);
		dropsSquid = config
				.get("drops", "Squid (Default: " + dropsSquidDefault + ")",
						dropsSquidDefault).getBoolean(dropsSquidDefault);
		dropsWolf = config.get("drops",
				"Wolf (Default: " + dropsWolfDefault + ")", dropsWolfDefault)
				.getBoolean(dropsWolfDefault);
		dropsZombie = config.get("drops",
				"Zombie (Default: " + dropsZombieDefault + ")",
				dropsZombieDefault).getBoolean(dropsZombieDefault);
	}
}
