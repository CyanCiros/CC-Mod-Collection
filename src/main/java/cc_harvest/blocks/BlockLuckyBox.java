package cc_harvest.blocks;

import java.util.ArrayList;
import java.util.Random;

import cc_harvest.CCHarvest;
import cc_harvest.items.ModItemBox;
import cc_harvest.items.ModItemPacket;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockLuckyBox extends BlockContainer {
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	private final Random random;
	private final ArrayList<Item> boxItems;

	public BlockLuckyBox(final String name, final ArrayList<Item> boxItems) {
		super(Material.wood);
		this.setUnlocalizedName(name);
		this.setHardness(2.5F);
		this.setStepSound(Block.soundTypeWood);
		this.setCreativeTab(CCHarvest.creativeTab);

		this.random = new Random();
		this.boxItems = boxItems;
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { FACING });
	}

	@Override
	public IBlockState getStateFromMeta(final int meta) {
		EnumFacing enumfacing = EnumFacing.getFront(meta);

		if (enumfacing.getAxis() == EnumFacing.Axis.Y) {
			enumfacing = EnumFacing.NORTH;
		}

		return this.getDefaultState().withProperty(FACING, enumfacing);
	}

	@Override
	public int getMetaFromState(final IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getIndex();
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		return null;
	}

	@Override
	public boolean removedByPlayer(final World world, final BlockPos pos, final EntityPlayer player,
			final boolean willHarvest) {
		return this.removeBlock(world, player, pos);
	}

	public boolean removeBlock(final World world, final EntityPlayer player, final BlockPos pos) {
		final IBlockState block = world.getBlockState(pos);

		if (!world.setBlockToAir(pos)) {
			return false;
		}
		if (!world.isRemote) {
			if (player.capabilities.isCreativeMode) {
				return true;
			}
			if (EnchantmentHelper.getSilkTouchModifier(player)) {
				final ItemStack itemStack = new ItemStack(block.getBlock());

				final float f = 0.7F;
				final double x = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
				final double y = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
				final double z = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;

				final EntityItem entityitem = new EntityItem(world, pos.getX() + x, pos.getY() + y, pos.getZ() + z,
						itemStack);

				world.spawnEntityInWorld(entityitem);

				return true;
			}
			for (int i = 0; i < 8; i++) {
				final int s = this.boxItems.size();
				final int r = this.random.nextInt(s);
				final Item item = this.boxItems.get(r);
				int a;

				if (item instanceof ModItemBox) {
					a = this.random.nextInt(4) + 1;
				} else if (item instanceof ModItemPacket) {
					a = this.random.nextInt(6) + 1;
				} else {
					a = this.random.nextInt(8) + 1;
				}

				final ItemStack itemStack = new ItemStack(item, a);

				final float f = 0.7F;
				final double x = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
				final double y = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
				final double z = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;

				final EntityItem entityItem = new EntityItem(world, pos.getX() + x, pos.getY() + y, pos.getZ() + z,
						itemStack);

				world.spawnEntityInWorld(entityItem);
			}
		}

		return true;
	}

	@Override
	public TileEntity createNewTileEntity(final World world, final int meta) {
		return null;
	}

	@Override
	public void onBlockAdded(final World worldIn, final BlockPos pos, final IBlockState state) {
		this.setDefaultFacing(worldIn, pos, state);
	}

	private void setDefaultFacing(final World worldIn, final BlockPos pos, final IBlockState state) {
		if (!worldIn.isRemote) {
			final Block block = worldIn.getBlockState(pos.north()).getBlock();
			final Block block1 = worldIn.getBlockState(pos.south()).getBlock();
			final Block block2 = worldIn.getBlockState(pos.west()).getBlock();
			final Block block3 = worldIn.getBlockState(pos.east()).getBlock();
			EnumFacing enumfacing = (EnumFacing) state.getValue(FACING);

			if (enumfacing == EnumFacing.NORTH && block.isFullBlock() && !block1.isFullBlock()) {
				enumfacing = EnumFacing.SOUTH;
			} else if (enumfacing == EnumFacing.SOUTH && block1.isFullBlock() && !block.isFullBlock()) {
				enumfacing = EnumFacing.NORTH;
			} else if (enumfacing == EnumFacing.WEST && block2.isFullBlock() && !block3.isFullBlock()) {
				enumfacing = EnumFacing.EAST;
			} else if (enumfacing == EnumFacing.EAST && block3.isFullBlock() && !block2.isFullBlock()) {
				enumfacing = EnumFacing.WEST;
			}

			worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
		}
	}

	@Override
	public IBlockState onBlockPlaced(final World worldIn, final BlockPos pos, final EnumFacing facing, final float hitX,
			final float hitY, final float hitZ, final int meta, final EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	@Override
	public void onBlockPlacedBy(final World world, final BlockPos pos, final IBlockState state,
			final EntityLivingBase placer, final ItemStack itemStack) {
		world.setBlockState(pos, state.withProperty(FACING, placer.getHorizontalFacing().getOpposite()), 2);
	}

	@Override
	public int getRenderType() {
		return 3;
	}
}
