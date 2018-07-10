package cc_dungeon_pack.npctown;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class NPCTownStable extends NPCTownBase {
	public NPCTownStable(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.getBlocks(random);

		for (int vx = -8; vx <= 8; vx++) {
			this.placeBlock(random, new BlockPos(x + vx, y, z + 8), this.block5);
			this.placeBlock(random, new BlockPos(x + vx, y, z - 8), this.block5);

			if (vx == -8 || vx == 0 || vx == 8) {
				this.placeBlock(random, new BlockPos(x + vx, y + 1, z + 8), this.block14);
				this.placeBlock(random, new BlockPos(x + vx, y + 1, z - 8), this.block14);
			}
		}
		for (int vz = -7; vz <= 7; vz++) {
			this.placeBlock(random, new BlockPos(x + 8, y, z + vz), this.block5);
			this.placeBlock(random, new BlockPos(x - 8, y, z + vz), this.block5);

			if (vz == 0) {
				this.placeBlock(random, new BlockPos(x + 8, y + 1, z + vz), this.block14);
				this.placeBlock(random, new BlockPos(x - 8, y + 1, z + vz), this.block14);
			}
		}

		this.placeBlock(random, new BlockPos(x + 8, y, z), NPCTownBase.gateType, EnumFacing.EAST);
		this.placeBlock(random, new BlockPos(x - 8, y, z), NPCTownBase.gateType, EnumFacing.WEST);
		this.placeBlock(random, new BlockPos(x, y, z + 8), NPCTownBase.gateType, EnumFacing.NORTH);
		this.placeBlock(random, new BlockPos(x, y, z - 8), NPCTownBase.gateType, EnumFacing.SOUTH);

		for (int v = 0; v <= 5; v++) {
			this.spawnCow(this.world, x, y, z);
			this.spawnPig(this.world, x, y, z);
			this.spawnSheep(this.world, x, y, z);
		}
	}
}
