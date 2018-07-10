package cc_cyan_weapons.entity;

import java.util.List;

import cc_cyan_weapons.Config;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IThrowableEntity;

public class EntityEnderPortalArrow extends EntityArrow implements IThrowableEntity {
	private int xTile = -1;
	private int yTile = -1;
	private int zTile = -1;
	private Block inTile;
	private int inData;
	private boolean inGround;
	private int ticksInGround;
	private int ticksInAir;
	private final double damage = 2.0D;
	private int knockbackStrength;

	public EntityEnderPortalArrow(final World world) {
		super(world);
		this.renderDistanceWeight = 10.0D;
		this.setSize(0.5F, 0.5F);
	}

	public EntityEnderPortalArrow(final World world, final double x, final double y, final double z) {
		super(world);
		this.renderDistanceWeight = 10.0D;
		this.setSize(0.5F, 0.5F);
		this.setPosition(x, y, z);
		// this.yOffset = 0.0F;
	}

	public EntityEnderPortalArrow(final World world, final EntityLivingBase entityLivingBase,
			final EntityLivingBase entityLivingBase2, final float par4, final float par5) {
		super(world);
		this.renderDistanceWeight = 10.0D;
		this.shootingEntity = entityLivingBase;

		if (entityLivingBase instanceof EntityPlayer) {
			this.canBePickedUp = 1;
		}
		this.posY = entityLivingBase.posY + entityLivingBase.getEyeHeight() - 0.1000000014901161D;
		final double d0 = entityLivingBase2.posX - entityLivingBase.posX;
		final double d1 = entityLivingBase2.getBoundingBox().minY + entityLivingBase2.height / 3.0F - this.posY;
		final double d2 = entityLivingBase2.posZ - entityLivingBase.posZ;
		final double d3 = MathHelper.sqrt_double(d0 * d0 + d2 * d2);

		if (d3 >= 1.0E-007D) {
			final float f2 = (float) (Math.atan2(d2, d0) * 180.0D / 3.141592653589793D) - 90.0F;
			final float f3 = (float) -(Math.atan2(d1, d3) * 180.0D / 3.141592653589793D);
			final double d4 = d0 / d3;
			final double d5 = d2 / d3;
			this.setLocationAndAngles(entityLivingBase.posX + d4, this.posY, entityLivingBase.posZ + d5, f2, f3);
			// this.yOffset = 0.0F;
			final float f4 = (float) d3 * 0.2F;
			this.setThrowableHeading(d0, d1 + f4, d2, par4, par5);
		}
	}

	public EntityEnderPortalArrow(final World world, final EntityLivingBase entityLivingBase, final float par3) {
		super(world);
		this.renderDistanceWeight = 10.0D;
		this.shootingEntity = entityLivingBase;

		if (entityLivingBase instanceof EntityPlayer) {
			this.canBePickedUp = 1;
		}
		this.setSize(0.5F, 0.5F);
		this.setLocationAndAngles(entityLivingBase.posX, entityLivingBase.posY + entityLivingBase.getEyeHeight(),
				entityLivingBase.posZ, entityLivingBase.rotationYaw, entityLivingBase.rotationPitch);
		this.posX -= MathHelper.cos(this.rotationYaw / 180.0F * 3.141593F) * 0.16F;
		this.posY -= 0.1000000014901161D;
		this.posZ -= MathHelper.sin(this.rotationYaw / 180.0F * 3.141593F) * 0.16F;
		this.setPosition(this.posX, this.posY, this.posZ);
		// this.yOffset = 0.0F;
		this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * 3.141593F)
				* MathHelper.cos(this.rotationPitch / 180.0F * 3.141593F);
		this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * 3.141593F)
				* MathHelper.cos(this.rotationPitch / 180.0F * 3.141593F);
		this.motionY = -MathHelper.sin(this.rotationPitch / 180.0F * 3.141593F);
		this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, par3 * 1.5F, 1.0F);
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	public void onUpdate() {
		super.onUpdate();

		if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
			final float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
			this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(this.motionX, this.motionZ) * 180.0D
					/ Math.PI);
			this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(this.motionY, f) * 180.0D / Math.PI);
		}

		final BlockPos blockpos = new BlockPos(this.xTile, this.yTile, this.zTile);
		IBlockState iblockstate = this.worldObj.getBlockState(blockpos);
		final Block block = iblockstate.getBlock();

		if (block.getMaterial() != Material.air) {
			block.setBlockBoundsBasedOnState(this.worldObj, blockpos);
			final AxisAlignedBB axisalignedbb = block.getCollisionBoundingBox(this.worldObj, blockpos, iblockstate);

			if (axisalignedbb != null && axisalignedbb.isVecInside(new Vec3(this.posX, this.posY, this.posZ))) {
				this.inGround = true;
			}
		}

		if (this.arrowShake > 0) {
			--this.arrowShake;
		}

		if (this.inGround) {
			final int j = block.getMetaFromState(iblockstate);

			if (block == this.inTile && j == this.inData) {
				++this.ticksInGround;

				if (this.ticksInGround >= 1200) {
					this.setDead();
				}
			} else {
				this.inGround = false;
				this.motionX *= this.rand.nextFloat() * 0.2F;
				this.motionY *= this.rand.nextFloat() * 0.2F;
				this.motionZ *= this.rand.nextFloat() * 0.2F;
				this.ticksInGround = 0;
				this.ticksInAir = 0;
			}
		} else {
			++this.ticksInAir;
			Vec3 vec31 = new Vec3(this.posX, this.posY, this.posZ);
			Vec3 vec3 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec31, vec3, false, true, false);
			vec31 = new Vec3(this.posX, this.posY, this.posZ);
			vec3 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

			if (movingobjectposition != null) {
				vec3 = new Vec3(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord,
						movingobjectposition.hitVec.zCoord);
			}

			Entity entity = null;
			final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox()
					.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
			double d0 = 0.0D;
			int i;
			float f1;

			for (i = 0; i < list.size(); ++i) {
				final Entity entity1 = (Entity) list.get(i);

				if (entity1.canBeCollidedWith() && (entity1 != this.shootingEntity || this.ticksInAir >= 5)) {
					f1 = 0.3F;
					final AxisAlignedBB axisalignedbb1 = entity1.getEntityBoundingBox().expand(f1, f1, f1);
					final MovingObjectPosition movingobjectposition1 = axisalignedbb1.calculateIntercept(vec31, vec3);

					if (movingobjectposition1 != null) {
						final double d1 = vec31.distanceTo(movingobjectposition1.hitVec);

						if (d1 < d0 || d0 == 0.0D) {
							entity = entity1;
							d0 = d1;
						}
					}
				}
			}

			if (entity != null) {
				movingobjectposition = new MovingObjectPosition(entity);
			}

			if (movingobjectposition != null && movingobjectposition.entityHit != null
					&& movingobjectposition.entityHit instanceof EntityPlayer) {
				final EntityPlayer entityplayer = (EntityPlayer) movingobjectposition.entityHit;

				if (entityplayer.capabilities.disableDamage || this.shootingEntity instanceof EntityPlayer
						&& !((EntityPlayer) this.shootingEntity).canAttackPlayer(entityplayer)) {
					movingobjectposition = null;
				}
			}

			float f2;
			float f3;
			float f4;

			if (movingobjectposition != null) {
				if (movingobjectposition.entityHit != null) {
					f2 = MathHelper.sqrt_double(
							this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
					int k = MathHelper.ceiling_double_int(f2 * this.damage);

					if (this.getIsCritical()) {
						k += this.rand.nextInt(k / 2 + 2);
					}

					DamageSource damagesource;

					if (this.shootingEntity == null) {
						damagesource = DamageSource.causeArrowDamage(this, this);
					} else {
						damagesource = DamageSource.causeArrowDamage(this, this.shootingEntity);
					}

					if (this.isBurning() && !(movingobjectposition.entityHit instanceof EntityEnderman)) {
						movingobjectposition.entityHit.setFire(5);
					}

					if (movingobjectposition.entityHit.attackEntityFrom(damagesource, k)) {
						if (movingobjectposition.entityHit instanceof EntityLivingBase) {
							final EntityLivingBase entitylivingbase = (EntityLivingBase) movingobjectposition.entityHit;

							if (!this.worldObj.isRemote) {
								entitylivingbase.setArrowCountInEntity(entitylivingbase.getArrowCountInEntity() + 1);
							}

							if (this.knockbackStrength > 0) {
								f4 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);

								if (f4 > 0.0F) {
									movingobjectposition.entityHit.addVelocity(
											this.motionX * this.knockbackStrength * 0.6000000238418579D / f4, 0.1D,
											this.motionZ * this.knockbackStrength * 0.6000000238418579D / f4);
								}
							}

							if (this.shootingEntity instanceof EntityLivingBase) {
								EnchantmentHelper.func_151384_a(entitylivingbase, this.shootingEntity);
								EnchantmentHelper.func_151385_b((EntityLivingBase) this.shootingEntity,
										entitylivingbase);
							}

							if (this.shootingEntity != null && movingobjectposition.entityHit != this.shootingEntity
									&& movingobjectposition.entityHit instanceof EntityPlayer
									&& this.shootingEntity instanceof EntityPlayerMP) {
								((EntityPlayerMP) this.shootingEntity).playerNetServerHandler
										.sendPacket(new S2BPacketChangeGameState(6, 0.0F));
							}

							if (Config.enderPortalBowHitEntityEffect) {
								entitylivingbase.setPositionAndRotation(
										entitylivingbase.posX + (this.rand.nextInt(21) - 10),
										entitylivingbase.posY + this.rand.nextInt(11),
										entitylivingbase.posZ + (this.rand.nextInt(21) - 10), 90.0F, 45.0F);
							}
						}

						this.playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));

						if (!(movingobjectposition.entityHit instanceof EntityEnderman)) {
							this.setDead();
						}
					} else {
						this.motionX *= -0.10000000149011612D;
						this.motionY *= -0.10000000149011612D;
						this.motionZ *= -0.10000000149011612D;
						this.rotationYaw += 180.0F;
						this.prevRotationYaw += 180.0F;
						this.ticksInAir = 0;
					}
				} else {
					final BlockPos blockpos1 = movingobjectposition.getBlockPos();
					this.xTile = blockpos1.getX();
					this.yTile = blockpos1.getY();
					this.zTile = blockpos1.getZ();
					iblockstate = this.worldObj.getBlockState(blockpos1);
					this.inTile = iblockstate.getBlock();
					this.inData = this.inTile.getMetaFromState(iblockstate);
					this.motionX = (float) (movingobjectposition.hitVec.xCoord - this.posX);
					this.motionY = (float) (movingobjectposition.hitVec.yCoord - this.posY);
					this.motionZ = (float) (movingobjectposition.hitVec.zCoord - this.posZ);
					f3 = MathHelper.sqrt_double(
							this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
					this.posX -= this.motionX / f3 * 0.05000000074505806D;
					this.posY -= this.motionY / f3 * 0.05000000074505806D;
					this.posZ -= this.motionZ / f3 * 0.05000000074505806D;
					this.playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
					this.inGround = true;
					this.arrowShake = 7;
					this.setIsCritical(false);

					if (this.inTile.getMaterial() != Material.air) {
						this.inTile.onEntityCollidedWithBlock(this.worldObj, blockpos1, iblockstate, this);
					}
				}
			}

			if (this.getIsCritical()) {
				for (i = 0; i < 4; ++i) {
					this.worldObj.spawnParticle(EnumParticleTypes.CRIT, this.posX + this.motionX * i / 4.0D,
							this.posY + this.motionY * i / 4.0D, this.posZ + this.motionZ * i / 4.0D, -this.motionX,
							-this.motionY + 0.2D, -this.motionZ, new int[0]);
				}
			}

			this.posX += this.motionX;
			this.posY += this.motionY;
			this.posZ += this.motionZ;
			f2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
			this.rotationYaw = (float) (Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

			// for (this.rotationPitch = (float) (Math.atan2(this.motionY, f2) * 180.0D /
			// Math.PI); this.rotationPitch
			// - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
			// ;
			// }

			while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
				this.prevRotationPitch += 360.0F;
			}

			while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
				this.prevRotationYaw -= 360.0F;
			}

			while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
				this.prevRotationYaw += 360.0F;
			}

			this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
			this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
			f3 = 0.99F;
			f1 = 0.05F;

			if (this.isInWater()) {
				for (int l = 0; l < 4; ++l) {
					f4 = 0.25F;
					this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * f4,
							this.posY - this.motionY * f4, this.posZ - this.motionZ * f4, this.motionX, this.motionY,
							this.motionZ, new int[0]);
				}

				f3 = 0.6F;
			}

			if (this.isWet()) {
				this.extinguish();
			}

			this.motionX *= f3;
			this.motionY *= f3;
			this.motionZ *= f3;
			this.motionY -= f1;
			this.setPosition(this.posX, this.posY, this.posZ);
			this.doBlockCollisions();
		}
	}

	@Override
	public Entity getThrower() {
		return this.shootingEntity;
	}

	@Override
	public void setThrower(final Entity entity) {
		this.shootingEntity = entity;
	}
}
