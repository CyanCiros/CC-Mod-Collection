package cc_cyan_weapons.swords;

import java.util.Random;

import cc_cyan_weapons.Config;
import cc_cyan_weapons.CCCyanWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemEnderPortalSword extends ItemSword {
	private final Random random;

	public ItemEnderPortalSword(final ToolMaterial toolMaterial, final String name) {
		super(toolMaterial);
		this.setCreativeTab(CCCyanWeapons.creativeTab);
		this.setUnlocalizedName(name);

		this.random = new Random();
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (Config.enderPortalSwordRightClickEffect) {
			// final MovingObjectPosition movingobjectposition =
			// this.getMovingObjectPositionFromPlayer(world,
			// entityPlayer, false);
			//
			// if (movingobjectposition != null
			// && movingobjectposition.typeOfHit ==
			// MovingObjectPosition.MovingObjectType.BLOCK) {
			// world.getBlockMetadata(new
			// BlockPos(movingobjectposition.getBlockPos().getX(),
			// movingobjectposition.getBlockPos().getY(),
			// movingobjectposition.getBlockPos().getZ()));
			// }
			// if (!world.isRemote) {
			// final ChunkPosition chunkposition =
			// world.findClosestStructure("Stronghold", (int) entityPlayer.posX,
			// (int) entityPlayer.posY, (int) entityPlayer.posZ);
			//
			// if (chunkposition != null) {
			// final EntityEnderEye entityendereye = new EntityEnderEye(world,
			// entityPlayer.posX,
			// entityPlayer.posY + 1.62D - entityPlayer.getYOffset(),
			// entityPlayer.posZ);
			// entityendereye.moveTowards(chunkposition.chunkPosX,
			// chunkposition.chunkPosY,
			// chunkposition.chunkPosZ);
			//
			// world.spawnEntityInWorld(entityendereye);
			//
			// world.playSoundAtEntity(entityPlayer, "random.bow", 0.5F,
			// 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
			// world.playAuxSFXAtEntity((EntityPlayer) null, 1002, new
			// BlockPos((int) entityPlayer.posX,
			// (int) entityPlayer.posY, (int) entityPlayer.posZ), 0);
			//
			// itemStack.damageItem(3, entityPlayer);
			// }
			// }
		}
		return itemStack;
	}

	@Override
	public boolean hitEntity(final ItemStack itemStack, final EntityLivingBase entity1,
			final EntityLivingBase entity2) {
		if (Config.enderPortalSwordHitEntityEffect) {
			entity1.setPositionAndRotation(entity2.posX + (this.random.nextInt(21) - 10),
					entity2.posY + this.random.nextInt(11), entity2.posZ + (this.random.nextInt(21) - 10), 90.0F,
					45.0F);
		}
		itemStack.damageItem(1, entity2);

		return true;
	}
}
