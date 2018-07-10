package cc_dungeon_pack;

public class Directions {
	public static enum DirectionStairs {
		EastUp, WestUp, SouthUp, NorthUp, EastDown, WestDown, SouthDown, NorthDown
	}

	public static int getDirectionStair(final DirectionStairs direction) {
		switch (direction) {
		case EastUp:
			return 0;
		case WestUp:
			return 1;
		case SouthUp:
			return 2;
		case NorthUp:
			return 3;
		case EastDown:
			return 4;
		case WestDown:
			return 5;
		case SouthDown:
			return 6;
		case NorthDown:
			return 7;
		default:
			return 0;
		}
	}

	public static enum DirectionDoors {
		East, West, South, North
	}

	public static int getDirectionDoor(final DirectionDoors direction) {
		switch (direction) {
		case East:
			return 2;
		case West:
			return 0;
		case South:
			return 3;
		case North:
			return 1;
		default:
			return 0;
		}
	}

	public static enum DirectionBeds {
		East, West, South, North
	}

	public static int getDirectionBed(final DirectionBeds direction) {
		switch (direction) {
		case East:
			return 3;
		case West:
			return 1;
		case South:
			return 0;
		case North:
			return 2;
		default:
			return 0;
		}
	}

	public static enum DirectionBlocks {
		East, West, South, North
	}

	public static int getDirectionBlock(final DirectionBlocks direction) {
		switch (direction) {
		case East:
			return 5;
		case West:
			return 4;
		case South:
			return 3;
		case North:
			return 2;
		default:
			return 2;
		}
	}
}
