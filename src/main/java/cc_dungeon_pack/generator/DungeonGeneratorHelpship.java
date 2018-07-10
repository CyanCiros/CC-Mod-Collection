package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class DungeonGeneratorHelpship extends DungeonGenerator {
	private final World world;

	private final IBlockState block1;
	private final IBlockState block2;
	private final IBlockState block3;
	private final IBlockState block4;

	private static EnumType plankType;
	private static IBlockState woolType;

	private final ArrayList<ArrayList<Item>> items;

	public DungeonGeneratorHelpship(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		this.world = world;

		this.block1 = blocks.get(0);
		this.block2 = blocks.get(1);
		this.block3 = blocks.get(2);
		this.block4 = blocks.get(3);

		this.items = items;
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		if (this.getEquals(this.world, this.block1.getBlock(), Blocks.planks)) {
			final int r = random.nextInt(6);

			switch (r) {
			case 0:
				DungeonGeneratorHelpship.plankType = BlockPlanks.EnumType.OAK;
				break;
			case 1:
				DungeonGeneratorHelpship.plankType = BlockPlanks.EnumType.SPRUCE;
				break;
			case 2:
				DungeonGeneratorHelpship.plankType = BlockPlanks.EnumType.BIRCH;
				break;
			case 3:
				DungeonGeneratorHelpship.plankType = BlockPlanks.EnumType.JUNGLE;
				break;
			case 4:
				DungeonGeneratorHelpship.plankType = BlockPlanks.EnumType.ACACIA;
				break;
			case 5:
				DungeonGeneratorHelpship.plankType = BlockPlanks.EnumType.DARK_OAK;
				break;
			default:
				DungeonGeneratorHelpship.plankType = BlockPlanks.EnumType.OAK;
				break;
			}
		}

		if (this.getEquals(this.world, this.block3.getBlock(), Blocks.wool)) {
			DungeonGeneratorHelpship.woolType = Blocks.wool.getDefaultState().withProperty(BlockColored.COLOR,
					EnumDyeColor.byMetadata(random.nextInt(16)));
		}

		for (int vx = -1; vx <= 3; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y - 1, z), this.block1);
			this.placeBlock(random, new BlockPos(x + vx, y - 1, z + 1), this.block1);
		}
		this.placeBlock(random, new BlockPos(x + 1, y, z), this.block2);

		for (int vy = 1; vy <= 3; vy++) {
			this.placeBlock(random, new BlockPos(x + 1, y + vy, z), this.block3);
			this.placeBlock(random, new BlockPos(x + 1, y + vy, z - 1), this.block3);
		}
		this.placeBlock(random, new BlockPos(x, y, z), this.block4);

		this.addChestWithCustomItemsLoot(this.world, random, x + 2, y, z, this.items);
	}

	@SuppressWarnings("unused")
	public void placeBlock(final Random random, final BlockPos pos, final IBlockState state) {
		if (state.getBlock() instanceof BlockPlanks) {
			this.world.setBlockState(pos,
					state.getBlock().getStateFromMeta(DungeonGeneratorHelpship.plankType.ordinal()));
		} else if (state.getBlock() instanceof BlockColored) {
			this.world.setBlockState(pos, woolType);
		} else {
			this.world.setBlockState(pos, state);
		}
	}
}
