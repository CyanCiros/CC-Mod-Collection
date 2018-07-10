package cc_harvest.blocks;

import java.util.Random;

import cc_harvest.Config;
import cc_harvest.CCHarvest;
import cc_harvest.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockNormalGarden extends BlockBush {
	Random random;

	public BlockNormalGarden(final String name) {
		this.setUnlocalizedName(name);
		final float var4 = 0.2F;
		this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
		this.setStepSound(Block.soundTypeGrass);
		this.setCreativeTab(CCHarvest.creativeTab);

		this.random = new Random();
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		if (this == ModBlocks.berryGarden) {
			final int i = rand.nextInt(5);

			switch (i) {
			case 0:
				return ModItems.blackberryItem;
			case 1:
				return ModItems.blueberryItem;
			case 2:
				return ModItems.candleberryItem;
			case 3:
				return ModItems.raspberryItem;
			default:
				return ModItems.strawberryItem;
			}
		}
		if (this == ModBlocks.grassGarden) {
			final int i = rand.nextInt(6);

			switch (i) {
			case 0:
				return ModItems.asparagusItem;
			case 1:
				return ModItems.barleyItem;
			case 2:
				return ModItems.oatsItem;
			case 3:
				return ModItems.ryeItem;
			case 4:
				return ModItems.cornItem;
			default:
				return ModItems.bambooShootItem;
			}
		}
		if (this == ModBlocks.gourdGarden) {
			final int i = rand.nextInt(5);

			switch (i) {
			case 0:
				return ModItems.cantaloupeItem;
			case 1:
				return ModItems.cucumberItem;
			case 2:
				return ModItems.winterSquashItem;
			case 3:
				return ModItems.zucchiniItem;
			default:
				return Item.getItemFromBlock(Blocks.pumpkin);
			}
		}
		if (this == ModBlocks.groundGarden) {
			final int i = rand.nextInt(11);

			switch (i) {
			case 0:
				return ModItems.beetItem;
			case 1:
				return ModItems.onionItem;
			case 2:
				return ModItems.parsnipItem;
			case 3:
				return ModItems.peanutItem;
			case 4:
				return ModItems.radishItem;
			case 5:
				return ModItems.rutabagaItem;
			case 6:
				return ModItems.sweetPotatoItem;
			case 7:
				return ModItems.turnipItem;
			case 8:
				return ModItems.rhubarbItem;
			case 9:
				return Items.potato;
			default:
				return Items.carrot;
			}
		}
		if (this == ModBlocks.herbGarden) {
			final int i = rand.nextInt(8);

			switch (i) {
			case 0:
				return ModItems.celeryItem;
			case 1:
				return ModItems.garlicItem;
			case 2:
				return ModItems.gingerItem;
			case 3:
				return ModItems.spiceleafItem;
			case 4:
				return ModItems.edibleRootItem;
			case 5:
				return ModItems.teaLeafItem;
			case 6:
				return ModItems.coffeeBeanItem;
			default:
				return ModItems.mustardSeedsItem;
			}
		}
		if (this == ModBlocks.leafyGarden) {
			final int i = rand.nextInt(8);

			switch (i) {
			case 0:
				return ModItems.broccoliItem;
			case 1:
				return ModItems.cauliflowerItem;
			case 2:
				return ModItems.leekItem;
			case 3:
				return ModItems.lettuceItem;
			case 4:
				return ModItems.scallionItem;
			case 5:
				return ModItems.artichokeItem;
			case 6:
				return ModItems.brusselSproutItem;
			default:
				return ModItems.cabbageItem;
			}
		}
		if (this == ModBlocks.stalkGarden) {
			final int i = rand.nextInt(8);

			switch (i) {
			case 0:
				return ModItems.beanItem;
			case 1:
				return ModItems.soybeanItem;
			case 2:
				return ModItems.bellpepperItem;
			case 3:
				return ModItems.chilipepperItem;
			case 4:
				return ModItems.eggplantItem;
			case 5:
				return ModItems.okraItem;
			case 6:
				return ModItems.peasItem;
			default:
				return ModItems.tomatoItem;
			}
		}
		if (this == ModBlocks.textileGarden) {
			return ModItems.cottonItem;
		}
		if (this == ModBlocks.tropicalGarden) {
			final int i = rand.nextInt(4);

			switch (i) {
			case 0:
				return ModItems.pineappleItem;
			case 1:
				return ModItems.grapeItem;
			case 2:
				return ModItems.kiwiItem;
			default:
				return Items.melon;
			}
		}
		return ModItems.whiteMushroomItem;
	}

	@Override
	public int quantityDropped(final Random random) {
		return Config.gardenDropAmount;
	}

	@Override
	public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {

	}

	@Override
	public void breakBlock(final World world, final BlockPos pos, final IBlockState state) {
		for (int i = 0; i < 3; i++) {
			final EntityItem entity = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(
					this.getItemDropped(state, this.random, 0), this.random.nextInt(Config.gardenDropAmount) + 1));

			world.spawnEntityInWorld(entity);
		}
	}
}
