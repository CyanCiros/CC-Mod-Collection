package cc_dungeon_pack.generator;

import java.util.ArrayList;
import java.util.Random;

import cc_dungeon_pack.Enchantments;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower.EnumFlowerType;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSandStone;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass.EnumType;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;

public abstract class DungeonGenerator {

	public abstract void generate(final Random random, final int x, final int y, final int z);

	protected void addBlockAndMetadata(final World world, final int x, final int y, final int z, final Block block,
			final int meta) {
		world.setBlockState(new BlockPos(x, y, z), block.getDefaultState(), meta);// ,
	}

	protected int getTop(final World world, final int x, final int y) {
		return world.getTopSolidOrLiquidBlock(new BlockPos(x, y, 0)).getY();
	}

	protected void addMobSpawner(final World world, final int x, final int y, final int z, final String string) {
		world.setBlockState(new BlockPos(x, y, z), Blocks.mob_spawner.getDefaultState());
		final TileEntityMobSpawner mobSpawner = (TileEntityMobSpawner) world.getTileEntity(new BlockPos(x, y, z));

		if (mobSpawner != null) {
			mobSpawner.getSpawnerBaseLogic().setEntityName(string);
		}
	}

	protected void addChestWithDefaultLoot(final World world, final Random random, final int x, final int y,
			final int z) {
		world.setBlockState(new BlockPos(x, y, z), Blocks.chest.getDefaultState());
		final TileEntityChest chest = (TileEntityChest) world.getTileEntity(new BlockPos(x, y, z));

		if (chest != null) {
			for (int var1 = 0; var1 < ChestGenHooks.getCount("dungeonChest", random); var1++) {
				final ItemStack loot = ChestGenHooks.getOneItem("dungeonChest", random);

				if (loot != null) {
					chest.setInventorySlotContents(random.nextInt(chest.getSizeInventory()), loot);
				}
			}
		}
	}

	protected void addTrappedChestWithDefaultLoot(final World world, final Random random, final int x, final int y,
			final int z) {
		world.setBlockState(new BlockPos(x, y, z), Blocks.trapped_chest.getDefaultState());
		final TileEntityChest chest = (TileEntityChest) world.getTileEntity(new BlockPos(x, y, z));

		if (chest != null) {
			for (int var1 = 0; var1 < ChestGenHooks.getCount("dungeonChest", random); var1++) {
				final ItemStack loot = ChestGenHooks.getOneItem("dungeonChest", random);

				if (loot != null) {
					chest.setInventorySlotContents(random.nextInt(chest.getSizeInventory()), loot);
				}
			}
		}
	}

	protected void addChestWithMagicalLoot(final World world, final Random random, final int x, final int y,
			final int z) {
		world.setBlockState(new BlockPos(x, y, z), Blocks.chest.getDefaultState());
		final TileEntityChest chest = (TileEntityChest) world.getTileEntity(new BlockPos(x, y, z));

		if (chest != null) {
			for (int var1 = 0; var1 < ChestGenHooks.getCount("dungeonChest", random); var1++) {
				final ItemStack loot = this.getMagicalLoot(random);

				if (loot != null) {
					chest.setInventorySlotContents(random.nextInt(chest.getSizeInventory()), loot);
				}
			}
		}
	}

	private ItemStack getMagicalLoot(final Random random) {
		final int var2 = random.nextInt(6);

		switch (var2) {
		case 0:
			return new ItemStack(Items.brewing_stand);
		case 1:
			return new ItemStack(Items.nether_wart, random.nextInt(3) + 1);
		case 2:
			return new ItemStack(Items.book, random.nextInt(3) + 1);
		case 3:
			return new ItemStack(Blocks.bookshelf, random.nextInt(2) + 1);
		case 4:
			return new ItemStack(Items.glass_bottle, random.nextInt(3) + 1);
		default:
			return new ItemStack(Items.experience_bottle, random.nextInt(3) + 1);
		}
	}

	protected void addChestWithCustomLoot(final World world, final Random random, final int x, final int y, final int z,
			final ArrayList<Item> items) {
		world.setBlockState(new BlockPos(x, y, z), Blocks.chest.getDefaultState());

		final TileEntityChest chest = (TileEntityChest) world.getTileEntity(new BlockPos(x, y, z));

		if (chest != null) {
			final ArrayList<Item> chestItems = new ArrayList<Item>();

			for (int c = 0; c < 2 + random.nextInt(5); c++) {
				chestItems.add(items.get(random.nextInt(items.size())));
			}
			for (final Item item : chestItems) {
				final ItemStack chestItem = new ItemStack(item, random.nextInt(8) + 1);

				chest.setInventorySlotContents(random.nextInt(chest.getSizeInventory()), chestItem);
			}
		}
	}

	protected void addTrappedChestWithCustomItemsLoot(final World world, final Random random, final int x, final int y,
			final int z, final ArrayList<ArrayList<Item>> items) {
		world.setBlockState(new BlockPos(x, y, z), Blocks.trapped_chest.getDefaultState());

		this.fillChestWithCustomItemsLoot(world, random, x, y, z, items);
	}

	protected void addChestWithCustomItemsLoot(final World world, final Random random, final int x, final int y,
			final int z, final ArrayList<ArrayList<Item>> items) {
		EnumFacing facingChest = EnumFacing.NORTH;

		if (!world.isAirBlock(new BlockPos(x - 1, y, z))) {
			facingChest = EnumFacing.EAST;
		} else if (!world.isAirBlock(new BlockPos(x + 1, y, z))) {
			facingChest = EnumFacing.WEST;
		} else if (!world.isAirBlock(new BlockPos(x, y, z - 1))) {
			facingChest = EnumFacing.SOUTH;
		} else if (!world.isAirBlock(new BlockPos(x, y, z + 1))) {
			facingChest = EnumFacing.NORTH;
		}

		world.setBlockState(new BlockPos(x, y, z),
				Blocks.chest.getDefaultState().withProperty(BlockChest.FACING, facingChest));

		this.fillChestWithCustomItemsLoot(world, random, x, y, z, items);
	}

	private void fillChestWithCustomItemsLoot(final World world, final Random random, final int x, final int y,
			final int z, final ArrayList<ArrayList<Item>> itemsArray) {
		final TileEntityChest chest = (TileEntityChest) world.getTileEntity(new BlockPos(x, y, z));

		if (chest != null) {
			final ArrayList<Item> items = itemsArray.get(random.nextInt(itemsArray.size()));
			final ArrayList<Item> chestItems = new ArrayList<Item>();

			for (int i = 0; i < 2 + random.nextInt(5); i++) {
				chestItems.add(items.get(random.nextInt(items.size())));
			}
			for (final Item item : chestItems) {
				final ItemStack itemStack = new ItemStack(item);
				final ItemStack chestItem;

				if (item.getItemStackLimit(itemStack) > 1) {
					if (item == Items.fish) {
						final int meta = random.nextInt(4);

						chestItem = new ItemStack(item, random.nextInt(8) + 1, meta);
					} else if (item == Items.golden_apple) {
						final int meta = random.nextInt(2);

						chestItem = new ItemStack(item, random.nextInt(8) + 1, meta);
					} else if (item == Items.arrow) {
						chestItem = new ItemStack(item, random.nextInt(57) + 8);
					} else if (item == Items.dye) {
						chestItem = new ItemStack(item, random.nextInt(8) + 1, 4);
					} else if (item == Items.skull) {
						chestItem = new ItemStack(item, random.nextInt(8) + 1, 1);
					} else {
						chestItem = new ItemStack(item, random.nextInt(8) + 1);
					}
				} else {
					if (item == Items.potionitem) {
						final int meta = this.getPotionItemMeta(random);

						chestItem = new ItemStack(item, 1, meta);
					} else {
						ItemStack chestItemStack = new ItemStack(item);
						final Enchantments enchantments = new Enchantments();

						if (item == Items.enchanted_book) {
							final ArrayList<Enchantment> itemEnchantments = enchantments.enchantments;

							for (int e = 0; e <= random.nextInt(3); e++) {
								final int r = random.nextInt(itemEnchantments.size());
								final Enchantment enchantment = itemEnchantments.get(r);

								if (enchantment.effectId != Enchantment.silkTouch.effectId
										&& enchantment.effectId != Enchantment.fortune.effectId) {
									final int level = random
											.nextInt(enchantments.enchantmentLevels[enchantment.effectId]) + 1;

									chestItemStack.addEnchantment(enchantment, level);

									itemEnchantments.remove(r);
								} else if (enchantment.effectId == Enchantment.silkTouch.effectId
										&& itemEnchantments.contains(Enchantment.fortune)
										|| enchantment.effectId == Enchantment.fortune.effectId
												&& itemEnchantments.contains(Enchantment.silkTouch)) {
									final int level = random
											.nextInt(enchantments.enchantmentLevels[enchantment.effectId]) + 1;

									chestItemStack.addEnchantment(enchantment, level);

									itemEnchantments.remove(r);
								} else {
									e--;
								}
							}
						} else if (random.nextBoolean()) {
							ArrayList<Enchantment> itemEnchantments = null;

							if (enchantments.armorHelmet.contains(item)) {
								itemEnchantments = enchantments.armorHelmetEnchantments;
							} else if (enchantments.armorChestplate.contains(item)) {
								itemEnchantments = enchantments.armorChestplateEnchantments;
							} else if (enchantments.armorLeggings.contains(item)) {
								itemEnchantments = enchantments.armorLeggingsEnchantments;
							} else if (enchantments.armorBoots.contains(item)) {
								itemEnchantments = enchantments.armorBootsEnchantments;
							} else if (enchantments.itemBow.contains(item)) {
								itemEnchantments = enchantments.itemBowEnchantments;
							} else if (enchantments.itemAxe.contains(item)) {
								itemEnchantments = enchantments.itemAxeEnchantments;
							} else if (enchantments.itemFishingRod.contains(item)) {
								itemEnchantments = enchantments.itemFishingRodEnchantments;
							} else if (enchantments.itemPickaxe.contains(item)) {
								itemEnchantments = enchantments.itemPickaxeEnchantments;
							} else if (enchantments.itemShovel.contains(item)) {
								itemEnchantments = enchantments.itemShovelEnchantments;
							} else if (enchantments.itemSword.contains(item)) {
								itemEnchantments = enchantments.itemSwordEnchantments;
							}
							if (itemEnchantments != null) {
								chestItemStack = this.addEnchantments(chestItemStack, itemEnchantments, random,
										enchantments);
							}
						}

						chestItem = chestItemStack;
					}
				}

				if (chestItem != null) {
					chest.setInventorySlotContents(random.nextInt(chest.getSizeInventory()), chestItem);
				}
			}
		}
	}

	private ItemStack addEnchantments(final ItemStack chestItemStack, final ArrayList<Enchantment> itemEnchantments,
			final Random random, final Enchantments enchantments) {
		int d = 0;

		final ArrayList<Enchantment> exclusive1 = new ArrayList<Enchantment>();
		exclusive1.add(Enchantment.silkTouch);
		exclusive1.add(Enchantment.fortune);

		final ArrayList<Enchantment> exclusive2 = new ArrayList<Enchantment>();
		exclusive2.add(Enchantment.sharpness);
		exclusive2.add(Enchantment.smite);
		exclusive2.add(Enchantment.baneOfArthropods);

		if (itemEnchantments.containsAll(exclusive1)) {
			d += -1;
		}
		if (itemEnchantments.containsAll(exclusive2)) {
			d += -2;
		}

		final ArrayList<Enchantment> itemStackEnchantments = new ArrayList<Enchantment>();

		boolean exclusive;
		int r;
		Enchantment itemEnchantment;

		for (int e = 0; e <= random.nextInt(itemEnchantments.size() + d); e++) {
			r = random.nextInt(itemEnchantments.size());
			itemEnchantment = itemEnchantments.get(r);
			exclusive = true;

			if (!itemStackEnchantments.contains(itemEnchantment)) {
				if (exclusive1.contains(itemEnchantment)) {
					if (this.containsAny(itemStackEnchantments, exclusive1)) {
						exclusive = false;
					}
				} else if (exclusive2.contains(itemEnchantment)) {
					if (this.containsAny(itemStackEnchantments, exclusive2)) {
						exclusive = false;
					}
				}

				if (exclusive) {
					itemStackEnchantments.add(itemEnchantment);
				}
			}
		}

		int level;

		for (final Enchantment enchantment : itemStackEnchantments) {
			level = random.nextInt(enchantments.enchantmentLevels[enchantment.effectId]) + 1;

			chestItemStack.addEnchantment(enchantment, level);
		}

		return chestItemStack;
	}

	private boolean containsAny(final ArrayList<Enchantment> itemStackEnchantments,
			final ArrayList<Enchantment> exclusive) {
		for (final Enchantment enchantment : exclusive) {
			if (itemStackEnchantments.contains(enchantment)) {
				return true;
			}
		}
		return false;
	}

	private int getPotionItemMeta(final Random random) {
		final int r = random.nextInt(6);
		int meta;

		if (r == 0) {
			meta = 8193;
		} else if (r == 1) {
			meta = 8225;
		} else if (r == 2) {
			meta = 8257;
		} else if (r == 3) {
			meta = 16385;
		} else if (r == 4) {
			meta = 16417;
		} else {
			meta = 16449;
		}
		meta += random.nextInt(14);

		return meta;
	}

	protected void addChestWithCustomLoot(final World world, final Random random, final int x, final int y, final int z,
			final int par4, final int par5) {
		EnumFacing facingChest = EnumFacing.NORTH;

		if (!world.isAirBlock(new BlockPos(x - 1, y, z))) {
			facingChest = EnumFacing.EAST;
		} else if (!world.isAirBlock(new BlockPos(x + 1, y, z))) {
			facingChest = EnumFacing.WEST;
		} else if (!world.isAirBlock(new BlockPos(x, y, z - 1))) {
			facingChest = EnumFacing.SOUTH;
		} else if (!world.isAirBlock(new BlockPos(x, y, z + 1))) {
			facingChest = EnumFacing.NORTH;
		}

		world.setBlockState(new BlockPos(x, y, z),
				Blocks.chest.getDefaultState().withProperty(BlockChest.FACING, facingChest));

		final TileEntityChest chest = (TileEntityChest) world.getTileEntity(new BlockPos(x, y, z));

		if (chest != null) {
			for (int var1 = 0; var1 < par5; var1++) {
				ItemStack customLoot = null;

				if (par4 != 0) {
					if (par4 < 256) {
						customLoot = new ItemStack(Block.getBlockById(par4));
					} else {
						customLoot = new ItemStack(Item.getItemById(par4));
					}
				}
				if (customLoot != null) {
					chest.setInventorySlotContents(random.nextInt(chest.getSizeInventory()), customLoot);
				}
			}
		}
	}

	protected void spawnVillager(final World world, final int x, final int y, final int z, final int profession) {
		final EntityVillager entity = new EntityVillager(world, profession);

		entity.setPositionAndRotation(x + 0.5D, y, z + 0.5D, 0.0F, 0.0F);

		world.spawnEntityInWorld(entity);
	}

	protected void spawnCow(final World world, final int x, final int y, final int z) {
		final EntityCow entity = new EntityCow(world);

		entity.setPositionAndRotation(x + 0.5D, y, z + 0.5D, 0.0F, 0.0F);

		world.spawnEntityInWorld(entity);
	}

	protected void spawnPig(final World world, final int x, final int y, final int z) {
		final EntityPig entity = new EntityPig(world);

		entity.setPositionAndRotation(x + 0.5D, y, z + 0.5D, 0.0F, 0.0F);

		world.spawnEntityInWorld(entity);
	}

	protected void spawnSheep(final World world, final int x, final int y, final int z) {
		final EntitySheep entity = new EntitySheep(world);

		entity.setPositionAndRotation(x + 0.5D, y, z + 0.5D, 0.0F, 0.0F);

		world.spawnEntityInWorld(entity);
	}

	protected void spawnChicken(final World world, final int x, final int y, final int z) {
		final EntityChicken entity = new EntityChicken(world);

		entity.setPositionAndRotation(x + 0.5D, y, z + 0.5D, 0.0F, 0.0F);

		world.spawnEntityInWorld(entity);
	}

	protected void spawnGolem(final World world, final int x, final int y, final int z) {
		final EntityIronGolem entity = new EntityIronGolem(world);

		entity.setPositionAndRotation(x + 0.5D, y, z + 0.5D, 0.0F, 0.0F);

		world.spawnEntityInWorld(entity);
	}

	protected void spawnWitch(final World world, final int x, final int y, final int z) {
		final EntityCow entity = new EntityCow(world);

		entity.setPositionAndRotation(x + 0.5D, y, z + 0.5D, 0.0F, 0.0F);

		world.spawnEntityInWorld(entity);
	}

	protected void addDispenserAndInv(final World world, final Random random, final int x, final int y, final int z,
			final Item item, final int amount) {
		world.setBlockState(new BlockPos(x, y, z), Blocks.dispenser.getDefaultState());

		final TileEntityDispenser dispenser = (TileEntityDispenser) world.getTileEntity(new BlockPos(x, y, z));

		if (item != null && amount != 0) {
			ItemStack inv;

			inv = new ItemStack(item, amount);

			dispenser.setInventorySlotContents(random.nextInt(dispenser.getSizeInventory()), inv);
		}
	}

	protected boolean getEquals(final World world, final BlockPos blockPos, final Block block) {
		return world.getBlockState(blockPos).getBlock().getDefaultState().equals(block.getDefaultState());
	}

	@SuppressWarnings("unused")
	protected boolean getEquals(final World world, final Block block1, final Block block2) {
		return block1.getDefaultState().equals(block2.getDefaultState());
	}

	protected void placeBlock(final World world, final int x, final int y, final int z, final Block block,
			final EnumFacing facing) {
		if (block instanceof BlockDoor) {
			ItemDoor.placeDoor(world, new BlockPos(x, y, z), facing, block);
		} else if (block instanceof BlockLadder) {
			world.setBlockState(new BlockPos(x, y, z),
					block.getDefaultState().withProperty(BlockLadder.FACING, facing));
		} else if (block instanceof BlockFence) {
			final IProperty fenceFacing = BlockFence.NORTH.getName() == facing.getName()
					|| BlockFence.SOUTH.getName() == facing.getName() ? BlockFence.NORTH : BlockFence.EAST;
			world.setBlockState(new BlockPos(x, y, z), block.getDefaultState().withProperty(fenceFacing, true));
		} else if (block instanceof BlockStairs) {
			world.setBlockState(new BlockPos(x, y, z),
					block.getDefaultState().withProperty(BlockStairs.FACING, facing));
		} else {
			world.setBlockState(new BlockPos(x, y, z), block.getDefaultState());
		}
	}

	@SuppressWarnings("unused")
	protected void placeBlockPlanks(final World world, final Random random, final BlockPos blockPos, final Block block,
			final BlockPlanks.EnumType type) {
		world.setBlockState(blockPos, block.getDefaultState().withProperty(BlockPlanks.VARIANT, type));
	}

	@SuppressWarnings("unused")
	protected void placeBlockGrass(final World world, final Random random, final BlockPos blockPos, final Block block,
			final BlockTallGrass.EnumType type) {
		final EnumType grassType = BlockTallGrass.EnumType
				.values()[random.nextInt(BlockTallGrass.EnumType.values().length - 1) + 1];
		final IBlockState blockGrass = Blocks.tallgrass.getDefaultState().withProperty(BlockTallGrass.TYPE, grassType);
		world.setBlockState(blockPos, blockGrass);
	}

	@SuppressWarnings("unused")
	protected void placeBlockFlower(final World world, final Random random, final BlockPos blockPos, final Block block,
			final BlockFlower.EnumFlowerType type) {
		final EnumFlowerType flowerType = BlockFlower.EnumFlowerType.values()[random
				.nextInt(BlockFlower.EnumFlowerType.values().length)];
		final IBlockState blockFlower = flowerType.getBlockType().getBlock().getStateFromMeta(flowerType.getMeta());
		world.setBlockState(blockPos, blockFlower);
	}

	protected void placeBlockSandStone(final World world, final Random random, final BlockPos blockPos,
			final Block block, final BlockSandStone.EnumType type) {
		if (type == null) {
			final BlockSandStone.EnumType randomType = BlockSandStone.EnumType.values()[random
					.nextInt(BlockSandStone.EnumType.values().length)];
			world.setBlockState(blockPos, block.getDefaultState().withProperty(BlockSandStone.TYPE, randomType));
		} else {
			world.setBlockState(blockPos, block.getDefaultState().withProperty(BlockSandStone.TYPE, type));
		}
	}

	protected void placeBlockStoneBrick(final World world, final Random random, final BlockPos blockPos,
			final Block block, final BlockStoneBrick.EnumType type) {
		if (type == null) {
			final BlockStoneBrick.EnumType randomType = BlockStoneBrick.EnumType.values()[random
					.nextInt(BlockStoneBrick.EnumType.values().length)];
			world.setBlockState(blockPos, block.getDefaultState().withProperty(BlockStoneBrick.VARIANT, randomType));
		} else {
			world.setBlockState(blockPos, block.getDefaultState().withProperty(BlockStoneBrick.VARIANT, type));
		}
	}

	@SuppressWarnings("unused")
	protected void placeBlockTorch(final World world, final Random random, final BlockPos blockPos, final Block block) {
		EnumFacing facingTorch = EnumFacing.UP;

		if (!world.isAirBlock(blockPos.west())) {
			facingTorch = EnumFacing.EAST;
		} else if (!world.isAirBlock(blockPos.east())) {
			facingTorch = EnumFacing.WEST;
		} else if (!world.isAirBlock(blockPos.north())) {
			facingTorch = EnumFacing.SOUTH;
		} else if (!world.isAirBlock(blockPos.south())) {
			facingTorch = EnumFacing.NORTH;
		}

		world.setBlockState(blockPos,
				block.getBlockState().getBaseState().withProperty(BlockTorch.FACING, facingTorch));
	}

	@SuppressWarnings("unused")
	protected void placeBlockDoor(final World world, final Random random, final BlockPos blockPos, final Block block) {
		EnumFacing facingDoor = EnumFacing.UP;

		if (world.isAirBlock(blockPos.west())) {
			facingDoor = EnumFacing.EAST;
		} else if (world.isAirBlock(blockPos.east())) {
			facingDoor = EnumFacing.WEST;
		} else if (world.isAirBlock(blockPos.north())) {
			facingDoor = EnumFacing.SOUTH;
		} else if (world.isAirBlock(blockPos.south())) {
			facingDoor = EnumFacing.NORTH;
		}

		ItemDoor.placeDoor(world, blockPos, facingDoor, block);
	}
}
