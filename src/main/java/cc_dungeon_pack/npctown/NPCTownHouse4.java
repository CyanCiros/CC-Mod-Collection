package cc_dungeon_pack.npctown;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class NPCTownHouse4 extends NPCTownHouse1 {
	public NPCTownHouse4(final World world, final ArrayList<IBlockState> blocks,
			final ArrayList<ArrayList<Item>> items) {
		super(world, blocks, items);
	}

	@Override
	public void generate(final Random random, final int x, final int y, final int z) {
		this.getBlocks(random);

		for (int vx = -3; vx <= 2; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				for (int vy = 0; vy <= 3; vy++) {
					this.placeBlock(random, new BlockPos(x + vx, y + vy, z + vz), this.block3);
				}
				this.placeBlock(random, new BlockPos(x + vx, y - 1, z + vz), this.block3);
			}
		}
		for (int vx = -2; vx <= 2; vx++) {
			for (int vz = -2; vz <= 2; vz++) {
				for (int vy = 0; vy <= 2; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vx = 1; vx <= 2; vx++) {
			for (int vz = -3; vz <= 3; vz++) {
				for (int vy = 0; vy <= 3; vy++) {
					this.world.setBlockToAir(new BlockPos(x + vx, y + vy, z + vz));
				}
			}
		}
		for (int vz = -2; vz <= 2; vz++) {
			this.placeBlock(random, new BlockPos(x - 2, y, z + vz),
					Blocks.furnace.getBlockState().getBaseState().withProperty(BlockFurnace.FACING, EnumFacing.EAST));
		}
		this.placeBlock(random, new BlockPos(x - 2, y + 1, z), Blocks.crafting_table.getDefaultState());

		this.placeBlock(random, new BlockPos(x + 1, y, z + 3), this.block5);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 3), this.block5);
		this.placeBlock(random, new BlockPos(x + 2, y + 1, z + 3), this.block14);
		this.placeBlock(random, new BlockPos(x + 2, y, z + 2), this.block5);

		this.placeBlock(random, new BlockPos(x + 1, y, z - 3), this.block5);
		this.placeBlock(random, new BlockPos(x + 2, y, z - 3), this.block5);
		this.placeBlock(random, new BlockPos(x + 2, y + 1, z - 3), this.block14);
		this.placeBlock(random, new BlockPos(x + 2, y, z - 2), this.block5);

		this.addChestWithCustomItemsLoot(this.world, random, x - 2, y + 1, z + 2, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x - 2, y + 1, z + 1, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x - 2, y + 1, z - 1, this.items);
		this.addChestWithCustomItemsLoot(this.world, random, x - 2, y + 1, z - 2, this.items);

		new NPCTownHouse1(this.world, this.blocks, this.items).generate(random, x, y, z);
	}
}
