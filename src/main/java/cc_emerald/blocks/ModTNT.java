package cc_emerald.blocks;

import cc_emerald.CCEmerald;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class ModTNT extends BlockTNT {
	public static final PropertyBool EXPLODE = PropertyBool.create("explode");

	public ModTNT(final String name, final float resistance, final SoundType soundType) {
		super();
		this.setUnlocalizedName(name);
		this.setResistance(resistance);
		this.setStepSound(soundType);
		this.setCreativeTab(CCEmerald.creativeTab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(EXPLODE, Boolean.valueOf(false)));
	}

	@Override
	public void onBlockAdded(final World worldIn, final BlockPos pos, final IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);

		if (worldIn.isBlockPowered(pos)) {
			this.onBlockDestroyedByPlayer(worldIn, pos, state.withProperty(EXPLODE, Boolean.valueOf(true)));
			worldIn.setBlockToAir(pos);
		}
	}

	@Override
	public void onNeighborBlockChange(final World worldIn, final BlockPos pos, final IBlockState state,
			final Block neighborBlock) {
		if (worldIn.isBlockPowered(pos)) {
			this.onBlockDestroyedByPlayer(worldIn, pos, state.withProperty(EXPLODE, Boolean.valueOf(true)));
			worldIn.setBlockToAir(pos);
		}
	}

	@Override
	public void onBlockDestroyedByExplosion(final World worldIn, final BlockPos pos, final Explosion explosionIn) {
		if (!worldIn.isRemote) {
			final EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(worldIn, pos.getX() + 0.5F, pos.getY() + 0.5F,
					pos.getZ() + 0.5F, explosionIn.getExplosivePlacedBy());
			entitytntprimed.fuse = worldIn.rand.nextInt(entitytntprimed.fuse / 4) + entitytntprimed.fuse / 8;
			worldIn.spawnEntityInWorld(entitytntprimed);
		}
	}

	@Override
	public void onBlockDestroyedByPlayer(final World worldIn, final BlockPos pos, final IBlockState state) {
		this.explode(worldIn, pos, state, (EntityLivingBase) null);
	}

	@Override
	public void explode(final World worldIn, final BlockPos pos, final IBlockState state,
			final EntityLivingBase igniter) {
		if (!worldIn.isRemote) {
			if (((Boolean) state.getValue(EXPLODE)).booleanValue()) {
				final EntityTNTPrimed entitytntprimed = new EntityTNTPrimed(worldIn, pos.getX() + 0.5F,
						pos.getY() + 0.5F, pos.getZ() + 0.5F, igniter);
				worldIn.spawnEntityInWorld(entitytntprimed);
				worldIn.playSoundAtEntity(entitytntprimed, "game.tnt.primed", 1.0F, 1.0F);
			}
		}
	}

	@Override
	public boolean onBlockActivated(final World worldIn, final BlockPos pos, final IBlockState state,
			final EntityPlayer playerIn, final EnumFacing side, final float hitX, final float hitY, final float hitZ) {
		if (playerIn.getCurrentEquippedItem() != null) {
			final Item item = playerIn.getCurrentEquippedItem().getItem();

			if (item == Items.flint_and_steel || item == Items.fire_charge) {
				this.explode(worldIn, pos, state.withProperty(EXPLODE, Boolean.valueOf(true)), playerIn);
				worldIn.setBlockToAir(pos);

				if (item == Items.flint_and_steel) {
					playerIn.getCurrentEquippedItem().damageItem(1, playerIn);
				} else if (!playerIn.capabilities.isCreativeMode) {
					--playerIn.getCurrentEquippedItem().stackSize;
				}

				return true;
			}
		}

		return super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
	}

	@Override
	public void onEntityCollidedWithBlock(final World worldIn, final BlockPos pos, final IBlockState state,
			final Entity entityIn) {
		if (!worldIn.isRemote && entityIn instanceof EntityArrow) {
			final EntityArrow entityarrow = (EntityArrow) entityIn;

			if (entityarrow.isBurning()) {
				this.explode(worldIn, pos, worldIn.getBlockState(pos).withProperty(EXPLODE, Boolean.valueOf(true)),
						entityarrow.shootingEntity instanceof EntityLivingBase
								? (EntityLivingBase) entityarrow.shootingEntity : null);
				worldIn.setBlockToAir(pos);
			}
		}
	}

	@Override
	public boolean canDropFromExplosion(final Explosion explosionIn) {
		return false;
	}

	@Override
	public IBlockState getStateFromMeta(final int meta) {
		return this.getDefaultState().withProperty(EXPLODE, Boolean.valueOf((meta & 1) > 0));
	}

	@Override
	public int getMetaFromState(final IBlockState state) {
		return ((Boolean) state.getValue(EXPLODE)).booleanValue() ? 1 : 0;
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { EXPLODE });
	}
}
