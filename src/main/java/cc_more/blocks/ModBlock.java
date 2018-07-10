package cc_more.blocks;

import java.util.Random;

import cc_more.CCMore;
import cc_more.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class ModBlock extends Block {

	private final Random rand = new Random();
	private int quantity = 1;
	private int experience = 0;

	public ModBlock(final Material material, final String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(1.5F);
	}

	public ModBlock(final Material material, final float light, final String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setLightLevel(light);
		this.setHardness(1.5F);
	}

	public ModBlock(final Material material, final float light, final String name, final int quantity,
			final int experience) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setLightLevel(light);
		this.setHardness(1.5F);
		this.quantity = quantity;
		this.experience = experience;
	}

	public ModBlock(final Material material, final String name, final int harvestLevel) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setHardness(1.5F);
	}

	public ModBlock(final Material material, final String name, final int harvestLevel, final float hardness) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setHardness(hardness);
	}

	public ModBlock(final Material material, final String name, final float hardness, final float resistance) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setResistance(resistance);
		this.setHardness(hardness);
	}

	public ModBlock(final Material material, final String name, final float hardness, final SoundType sound) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(hardness);
		this.setStepSound(sound);
	}

	public ModBlock(final Material material, final String name, final float resistance) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setResistance(resistance);
		this.setHardness(1.5F);
	}

	public ModBlock(final Material material, final String name, final float hardness, final float resistance,
			final SoundType sound) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(sound);
	}

	public ModBlock(final Material material, final String name, final int harvestLevel, final float hardness,
			final float resistance, final SoundType sound) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(sound);
	}

	public ModBlock(final Material material, final String name, final float hardness, final float resistance,
			final SoundType sound, final int quantity, final int experience) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(sound);
		this.quantity = quantity;
		this.experience = experience;
	}

	public ModBlock(final Material material, final String name, final int harvestLevel, final float hardness,
			final float resistance, final SoundType sound, final int quantity, final int experience) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(sound);
		this.quantity = quantity;
		this.experience = experience;
	}

	public ModBlock(final Material material, final String name, final int harvestLevel, final float hardness,
			final float resistance, final SoundType sound, final float light) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setHardness(hardness);
		this.setLightLevel(light);
		this.setResistance(resistance);
		this.setStepSound(sound);
	}

	public ModBlock(final Material material, final String name, final float hardness, final SoundType sound,
			final int quantity, final int experience, final float light) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setHardness(hardness);
		this.setLightLevel(light);
		this.setStepSound(sound);
		this.quantity = quantity;
		this.experience = experience;
	}

	public ModBlock(final Material material, final String name, final int harvestLevel, final float hardness,
			final float resistance, final SoundType sound, final int quantity, final int experience,
			final float light) {
		super(material);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CCMore.creativeTab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setHardness(hardness);
		this.setLightLevel(light);
		this.setResistance(resistance);
		this.setStepSound(sound);
		this.quantity = quantity;
		this.experience = experience;
	}

	@Override
	public int quantityDropped(final Random r) {
		return this.quantity > 1 ? MathHelper.getRandomIntegerInRange(this.rand, 1, this.quantity) : 1;
	}

	@Override
	public int quantityDroppedWithBonus(final int fortune, final Random random) {
		if (fortune > 0) {
			int j = random.nextInt(fortune + 2) - 1;

			if (j < 0) {
				j = 0;
			}

			return this.quantityDropped(random) * (j + 1);
		}
		return this.quantityDropped(random);
	}

	@Override
	public int getExpDrop(final IBlockAccess world, final BlockPos pos, final int fortune) {
		int e = 0;

		if (this.experience != 0) {
			e = MathHelper.getRandomIntegerInRange(this.rand, 0, this.experience);
		}

		return e;
	}

	@Override
	public Item getItemDropped(final IBlockState state, final Random rand, final int fortune) {
		if (this == ModBlocks.sapphireOre) {
			return ModItems.sapphireGem;
		} else if (this == ModBlocks.rubyOre) {
			return ModItems.rubyGem;
		} else if (this == ModBlocks.jadeOre) {
			return ModItems.jadeGem;
		} else if (this == ModBlocks.meteoriteOre) {
			return ModItems.meteorite;
		} else if (this == ModBlocks.minersGlowstone) {
			return Items.glowstone_dust;
		}
		return Item.getItemFromBlock(this);
	}
}
