package cc_cyan_weapons.swords;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemTrienderSword extends ItemSword {
	public ItemTrienderSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.triEnderSwordRightClickEffect) {
			final int x = (int) (entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX));
			final int y = (int) (entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) + 1.62D
					- entityPlayer.getYOffset());
			final int z = (int) (entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ));

			if (!world.isRemote) {
				final Vec3 look = entityPlayer.getLookVec();
				final EntityEnderPearl enderPearl = new EntityEnderPearl(world, entityPlayer);
				entityPlayer.setPosition(entityPlayer.posX + look.xCoord * 5.0D, entityPlayer.posY + look.yCoord * 5.0D,
						entityPlayer.posZ + look.zCoord * 5.0D);

				world.spawnEntityInWorld(enderPearl);

				this.placeFire(world, x + 1, y - 1, z - 3);
				this.placeFire(world, x - 3, y - 1, z - 3);
				this.placeFire(world, x - 3, y - 1, z + 1);
				this.placeFire(world, x + 1, y - 1, z + 1);

				entityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 180, 0));
				entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 0));
				entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 1));

				entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 240, 0));

				this.placeLightningBolt(world, x + 2, y - 1, z - 1);
				this.placeLightningBolt(world, x - 4, y - 1, z - 1);
				this.placeLightningBolt(world, x - 1, y - 1, z + 2);
				this.placeLightningBolt(world, x - 1, y - 1, z - 4);

				itemStack.damageItem(39, entityPlayer);
			}
		}
		return itemStack;
	}

	private void placeFire(final World world, final int x, final int y, final int z) {
		for (int vy = -3; vy <= 3; vy++) {
			if (world.isAirBlock(new BlockPos(x, y + vy, z)) && !world.isAirBlock(new BlockPos(x, y + vy - 1, z))) {
				world.setBlockState(new BlockPos(x, y + vy, z), Blocks.fire.getDefaultState());

				break;
			}
		}
	}

	private void placeLightningBolt(final World world, final int x, final int y, final int z) {
		for (int vy = -3; vy <= 3; vy++) {
			if (world.isAirBlock(new BlockPos(x, y + vy, z)) && !world.isAirBlock(new BlockPos(x, y + vy - 1, z))) {
				world.spawnEntityInWorld(new EntityLightningBolt(world, x, y + vy, z));

				break;
			}
		}
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.triEnderSwordHitEntityEffect) {
			entity1.setFire(9);

			final int y = (int) (entity1.prevPosY + (entity1.posY - entity1.prevPosY) + 1.62D - entity1.getYOffset());

			entity1.addVelocity(-MathHelper.sin(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.15F / 8.0D, 0.1D,
					MathHelper.cos(entity2.rotationYaw * 3.141593F / 180.0F) * y * 0.15F / 8.0D);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
