package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorShip extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;

	private static EnumType plankType;
	private static IBlockState woolType;

	private final ArrayList<String> mobs;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorShip(final World world, final ArrayList<IBlockState> blocks, final ArrayList<String> mobs,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);

		this.mobs = mobs;

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		if (this.getEquals(this.world, this.block2.getBlock(), Blocks.planks)) {
			final int r = random.nextInt(6);

			switch (r) {
			case 0:
				DungeonGeneratorShip.plankType = BlockPlanks.EnumType.OAK;
				break;
			case 1:
				DungeonGeneratorShip.plankType = BlockPlanks.EnumType.SPRUCE;
				break;
			case 2:
				DungeonGeneratorShip.plankType = BlockPlanks.EnumType.BIRCH;
				break;
			case 3:
				DungeonGeneratorShip.plankType = BlockPlanks.EnumType.JUNGLE;
				break;
			case 4:
				DungeonGeneratorShip.plankType = BlockPlanks.EnumType.ACACIA;
				break;
			case 5:
				DungeonGeneratorShip.plankType = BlockPlanks.EnumType.DARK_OAK;
				break;
			default:
				DungeonGeneratorShip.plankType = BlockPlanks.EnumType.OAK;
				break;
			}
		}

		if (this.getEquals(this.world, this.block3.getBlock(), Blocks.wool)) {
			DungeonGeneratorShip.woolType = Blocks.wool.getDefaultState().withProperty(BlockColored.COLOR,
					EnumDyeColor.byMetadata(random.nextInt(16)));
		}

		for (int vx = 0; vx <= 14; vx++) {
			for (int vz = -2; vz <= 2; vz++) {
				for (int vy = 0; vy <= 7; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vz = -1; vz <= 1; vz++) {
			this.placeBlock(random, new BlockPos(x, y + 1, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 1, y + 1, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 1, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 2, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 3, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 9, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 9, y + 1, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 10, y, z + vz), this.block1);
			this.placeBlock(random, new BlockPos(x + 10, y + 1, z + vz), this.block1);
		}
		for (int vx = 2; vx <= 8; vx++) {
			for (int vz = -1; vz <= 1; vz++) {
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block2);
			}
		}
		for (int vx = 2; vx <= 9; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y, z + 2), this.block2);
			this.placeBlock(random, new BlockPos(x + vx, y, z - 2), this.block2);
		}
		for (int vx = 10; vx <= 14; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y + 1, z), this.block2);
		}
		for (int vy = 0; vy <= 2; vy++) {
			this.placeBlock(random, new BlockPos(x + 4, y + vy, z), this.block1);
		}
		for (int vy = 0; vy <= 2; vy++) {
			this.placeBlock(random, new BlockPos(x + 7, y + vy, z), this.block1);
		}
		for (int vz = -3; vz <= 3; vz++) {
			for (int vy = 3; vy <= 7; vy++) {
				this.placeBlock(random, new BlockPos(x + 4, y + vy, z + vz), this.block3);
			}
		}
		for (int vz = -2; vz <= 2; vz++) {
			for (int vy = 3; vy <= 6; vy++) {
				this.placeBlock(random, new BlockPos(x + 7, y + vy, z + vz), this.block3);
			}
		}
		this.placeBlock(random, new BlockPos(x + 2, y + 1, z + 1), this.block2);
		this.placeBlock(random, new BlockPos(x + 2, y + 1, z - 1), this.block2);

		this.addChestWithCustomItemsLoot(this.world, random, x, y + 2, z, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 8, y, z + 1, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 8, y, z - 1, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x + 2, y + 1, z, this.items);

		this.addMobSpawner(this.world, x + 5, y, z, this.mobs.get(random.nextInt(this.mobs.size())));
	}

	@SuppressWarnings("unused")
	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockOldLog || state.getBlock() instanceof BlockNewLog) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorShip.plankType.ordinal() % 4));
		} else if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos, state.getBlock().getStateFromMeta(DungeonGeneratorShip.plankType.ordinal()));
		} else if (state.getBlock() instanceof BlockColored) {
			this.world.setBlockState(pos, woolType);
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
