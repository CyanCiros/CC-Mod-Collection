package cc_harvest.blocks;

import java.util.List;
import java.util.Random;

import cc_harvest.items.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCrop extends BlockCrops {
	public int ages = 7;
	public int light = 9;

	public BlockCrop(final String name) {
		this.setUnlocalizedName(name);
	}

	@Override
	public void updateTick(final World worldIn, final BlockPos pos, final IBlockState state, final Random rand) {
		super.updateTick(worldIn, pos, state, rand);

		if (worldIn.getLightFromNeighbors(pos.up()) >= this.light) {
			final int i = ((Integer) state.getValue(AGE)).intValue();

			if (i < this.ages) {
				final float f = getGrowthChance(this, worldIn, pos);

				if (rand.nextInt((int) (25.0F / f) + 1) == 0) {
					worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(i + 1)), 2);
				}
			}
		}
	}

	@Override
	protected Item getSeed() {
		if (this == ModBlocks.artichokeCrop) {
			return ModItems.artichokeSeedItem;
		} else if (this == ModBlocks.asparagusCrop) {
			return ModItems.asparagusSeedItem;
		} else if (this == ModBlocks.bambooShootCrop) {
			return ModItems.bambooShootSeedItem;
		} else if (this == ModBlocks.barleyCrop) {
			return ModItems.barleySeedItem;
		} else if (this == ModBlocks.beanCrop) {
			return ModItems.beanSeedItem;
		} else if (this == ModBlocks.beetCrop) {
			return ModItems.beetSeedItem;
		} else if (this == ModBlocks.bellpepperCrop) {
			return ModItems.bellpepperSeedItem;
		} else if (this == ModBlocks.blackberryCrop) {
			return ModItems.blackberrySeedItem;
		} else if (this == ModBlocks.blueberryCrop) {
			return ModItems.blueberrySeedItem;
		} else if (this == ModBlocks.broccoliCrop) {
			return ModItems.broccoliSeedItem;
		} else if (this == ModBlocks.brusselSproutCrop) {
			return ModItems.brusselSproutSeedItem;
		} else if (this == ModBlocks.cabbageCrop) {
			return ModItems.cabbageSeedItem;
		} else if (this == ModBlocks.cactusFruitCrop) {
			return ModItems.cactusFruitSeedItem;
		} else if (this == ModBlocks.candleberryCrop) {
			return ModItems.candleberrySeedItem;
		} else if (this == ModBlocks.cantaloupeCrop) {
			return ModItems.cantaloupeSeedItem;
		} else if (this == ModBlocks.cauliflowerCrop) {
			return ModItems.cauliflowerSeedItem;
		} else if (this == ModBlocks.celeryCrop) {
			return ModItems.celerySeedItem;
		} else if (this == ModBlocks.chilipepperCrop) {
			return ModItems.chilipepperSeedItem;
		} else if (this == ModBlocks.coffeeBeanCrop) {
			return ModItems.coffeeBeanSeedItem;
		} else if (this == ModBlocks.cornCrop) {
			return ModItems.cornSeedItem;
		} else if (this == ModBlocks.cottonCrop) {
			return ModItems.cottonSeedItem;
		} else if (this == ModBlocks.cranberryCrop) {
			return ModItems.cranberrySeedItem;
		} else if (this == ModBlocks.cucumberCrop) {
			return ModItems.cucumberSeedItem;
		} else if (this == ModBlocks.eggplantCrop) {
			return ModItems.eggplantSeedItem;
		} else if (this == ModBlocks.garlicCrop) {
			return ModItems.garlicSeedItem;
		} else if (this == ModBlocks.gingerCrop) {
			return ModItems.gingerSeedItem;
		} else if (this == ModBlocks.grapeCrop) {
			return ModItems.grapeSeedItem;
		} else if (this == ModBlocks.kiwiCrop) {
			return ModItems.kiwiSeedItem;
		} else if (this == ModBlocks.leekCrop) {
			return ModItems.leekSeedItem;
		} else if (this == ModBlocks.lettuceCrop) {
			return ModItems.lettuceSeedItem;
		} else if (this == ModBlocks.mustardSeedsCrop) {
			return ModItems.mustardSeedItem;
		} else if (this == ModBlocks.oatsCrop) {
			return ModItems.oatsSeedItem;
		} else if (this == ModBlocks.okraCrop) {
			return ModItems.okraSeedItem;
		} else if (this == ModBlocks.onionCrop) {
			return ModItems.onionSeedItem;
		} else if (this == ModBlocks.parsnipCrop) {
			return ModItems.parsnipSeedItem;
		} else if (this == ModBlocks.peanutCrop) {
			return ModItems.peanutSeedItem;
		} else if (this == ModBlocks.peasCrop) {
			return ModItems.peasSeedItem;
		} else if (this == ModBlocks.pineappleCrop) {
			return ModItems.pineappleSeedItem;
		} else if (this == ModBlocks.radishCrop) {
			return ModItems.radishSeedItem;
		} else if (this == ModBlocks.raspberryCrop) {
			return ModItems.raspberrySeedItem;
		} else if (this == ModBlocks.rhubarbCrop) {
			return ModItems.rhubarbSeedItem;
		} else if (this == ModBlocks.riceCrop) {
			return ModItems.riceSeedItem;
		} else if (this == ModBlocks.rutabagaCrop) {
			return ModItems.rutabagaSeedItem;
		} else if (this == ModBlocks.ryeCrop) {
			return ModItems.ryeSeedItem;
		} else if (this == ModBlocks.scallionCrop) {
			return ModItems.scallionSeedItem;
		} else if (this == ModBlocks.seaweedCrop) {
			return ModItems.seaweedSeedItem;
		} else if (this == ModBlocks.soybeanCrop) {
			return ModItems.soybeanSeedItem;
		} else if (this == ModBlocks.spiceLeafCrop) {
			return ModItems.spiceleafSeedItem;
		} else if (this == ModBlocks.strawberryCrop) {
			return ModItems.strawberrySeedItem;
		} else if (this == ModBlocks.sweetPotatoCrop) {
			return ModItems.sweetPotatoSeedItem;
		} else if (this == ModBlocks.teaLeafCrop) {
			return ModItems.teaLeafSeedItem;
		} else if (this == ModBlocks.tomatoCrop) {
			return ModItems.tomatoSeedItem;
		} else if (this == ModBlocks.turnipCrop) {
			return ModItems.turnipSeedItem;
		} else if (this == ModBlocks.whiteMushroomCrop) {
			return ModItems.whiteMushroomSeedItem;
		} else if (this == ModBlocks.winterSquashCrop) {
			return ModItems.winterSquashSeedItem;
		} else if (this == ModBlocks.zucchiniCrop) {
			return ModItems.zucchiniSeedItem;
		}
		return Items.wheat_seeds;
	}

	@Override
	protected Item getCrop() {
		if (this == ModBlocks.artichokeCrop) {
			return ModItems.artichokeItem;
		} else if (this == ModBlocks.asparagusCrop) {
			return ModItems.asparagusItem;
		} else if (this == ModBlocks.bambooShootCrop) {
			return ModItems.bambooShootItem;
		} else if (this == ModBlocks.barleyCrop) {
			return ModItems.barleyItem;
		} else if (this == ModBlocks.beanCrop) {
			return ModItems.beanItem;
		} else if (this == ModBlocks.beetCrop) {
			return ModItems.beetItem;
		} else if (this == ModBlocks.bellpepperCrop) {
			return ModItems.bellpepperItem;
		} else if (this == ModBlocks.blackberryCrop) {
			return ModItems.blackberryItem;
		} else if (this == ModBlocks.blueberryCrop) {
			return ModItems.blueberryItem;
		} else if (this == ModBlocks.broccoliCrop) {
			return ModItems.broccoliItem;
		} else if (this == ModBlocks.brusselSproutCrop) {
			return ModItems.brusselSproutItem;
		} else if (this == ModBlocks.cabbageCrop) {
			return ModItems.cabbageItem;
		} else if (this == ModBlocks.cactusFruitCrop) {
			return ModItems.cactusFruitItem;
		} else if (this == ModBlocks.candleberryCrop) {
			return ModItems.candleberryItem;
		} else if (this == ModBlocks.cantaloupeCrop) {
			return ModItems.cantaloupeItem;
		} else if (this == ModBlocks.cauliflowerCrop) {
			return ModItems.cauliflowerItem;
		} else if (this == ModBlocks.celeryCrop) {
			return ModItems.celeryItem;
		} else if (this == ModBlocks.chilipepperCrop) {
			return ModItems.chilipepperItem;
		} else if (this == ModBlocks.coffeeBeanCrop) {
			return ModItems.coffeeBeanItem;
		} else if (this == ModBlocks.cornCrop) {
			return ModItems.cornItem;
		} else if (this == ModBlocks.cottonCrop) {
			return ModItems.cottonItem;
		} else if (this == ModBlocks.cranberryCrop) {
			return ModItems.cranberryItem;
		} else if (this == ModBlocks.cucumberCrop) {
			return ModItems.cucumberItem;
		} else if (this == ModBlocks.eggplantCrop) {
			return ModItems.eggplantItem;
		} else if (this == ModBlocks.garlicCrop) {
			return ModItems.garlicItem;
		} else if (this == ModBlocks.gingerCrop) {
			return ModItems.gingerItem;
		} else if (this == ModBlocks.grapeCrop) {
			return ModItems.grapeItem;
		} else if (this == ModBlocks.kiwiCrop) {
			return ModItems.kiwiItem;
		} else if (this == ModBlocks.leekCrop) {
			return ModItems.leekItem;
		} else if (this == ModBlocks.lettuceCrop) {
			return ModItems.lettuceItem;
		} else if (this == ModBlocks.mustardSeedsCrop) {
			return ModItems.mustardSeedsItem;
		} else if (this == ModBlocks.oatsCrop) {
			return ModItems.oatsItem;
		} else if (this == ModBlocks.okraCrop) {
			return ModItems.okraItem;
		} else if (this == ModBlocks.onionCrop) {
			return ModItems.onionItem;
		} else if (this == ModBlocks.parsnipCrop) {
			return ModItems.parsnipItem;
		} else if (this == ModBlocks.peanutCrop) {
			return ModItems.peanutItem;
		} else if (this == ModBlocks.peasCrop) {
			return ModItems.peasItem;
		} else if (this == ModBlocks.pineappleCrop) {
			return ModItems.pineappleItem;
		} else if (this == ModBlocks.radishCrop) {
			return ModItems.radishItem;
		} else if (this == ModBlocks.raspberryCrop) {
			return ModItems.raspberryItem;
		} else if (this == ModBlocks.rhubarbCrop) {
			return ModItems.rhubarbItem;
		} else if (this == ModBlocks.riceCrop) {
			return ModItems.riceItem;
		} else if (this == ModBlocks.rutabagaCrop) {
			return ModItems.rutabagaItem;
		} else if (this == ModBlocks.ryeCrop) {
			return ModItems.ryeItem;
		} else if (this == ModBlocks.scallionCrop) {
			return ModItems.scallionItem;
		} else if (this == ModBlocks.seaweedCrop) {
			return ModItems.seaweedItem;
		} else if (this == ModBlocks.soybeanCrop) {
			return ModItems.soybeanItem;
		} else if (this == ModBlocks.spiceLeafCrop) {
			return ModItems.spiceleafItem;
		} else if (this == ModBlocks.strawberryCrop) {
			return ModItems.strawberryItem;
		} else if (this == ModBlocks.sweetPotatoCrop) {
			return ModItems.sweetPotatoItem;
		} else if (this == ModBlocks.teaLeafCrop) {
			return ModItems.teaLeafItem;
		} else if (this == ModBlocks.tomatoCrop) {
			return ModItems.tomatoItem;
		} else if (this == ModBlocks.turnipCrop) {
			return ModItems.turnipItem;
		} else if (this == ModBlocks.whiteMushroomCrop) {
			return ModItems.whiteMushroomItem;
		} else if (this == ModBlocks.winterSquashCrop) {
			return ModItems.winterSquashItem;
		} else if (this == ModBlocks.zucchiniCrop) {
			return ModItems.zucchiniItem;
		}
		return Items.wheat;
	}

	@Override
	public boolean canGrow(final World worldIn, final BlockPos pos, final IBlockState state, final boolean isClient) {
		return ((Integer) state.getValue(AGE)).intValue() < this.ages
				&& worldIn.getLightFromNeighbors(pos.up()) >= this.light;
	}

	@Override
	public boolean canUseBonemeal(final World worldIn, final Random rand, final BlockPos pos, final IBlockState state) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(final IBlockAccess world, final BlockPos pos, final IBlockState state,
			final int fortune) {
		final List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
		final int age = ((Integer) state.getValue(AGE)).intValue();
		final Random rand = world instanceof World ? ((World) world).rand : new Random();

		if (age >= this.ages) {
			ret.add(new ItemStack(this.getSeed(), rand.nextInt(2), 0));
			ret.add(new ItemStack(this.getCrop(), rand.nextInt(3) + 1, 0));
		}
		return ret;
	}
}
