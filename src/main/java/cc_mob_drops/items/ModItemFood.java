package cc_mob_drops.items;

import cc_mob_drops.CCMobDrops;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModItemFood extends ItemFood {
	public int itemUseDuration;
	private final boolean isWolfsFavoriteMeat;
	private boolean alwaysEdible;
	private int potionId;
	private int potionDuration;
	private int potionAmplifier;
	private float potionEffectProbability;

	public ModItemFood(final String name, final int healAmount, final float saturationModifier,
			final boolean isWolfsFavoriteMeat) {
		super(healAmount, saturationModifier, isWolfsFavoriteMeat);
		this.setUnlocalizedName(name);
		this.itemUseDuration = 32;
		this.isWolfsFavoriteMeat = isWolfsFavoriteMeat;
		this.setCreativeTab(CCMobDrops.creativeTab);
	}

	public ModItemFood(final String name, final int healAmount, final boolean isWolfsFavoriteMeat) {
		this(name, healAmount, 0.6F, isWolfsFavoriteMeat);
	}

	@Override
	protected void onFoodEaten(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (!world.isRemote && this.potionId > 0 && world.rand.nextFloat() < this.potionEffectProbability) {
			entityPlayer
					.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * 20, this.potionAmplifier));
		}
	}

	@Override
	public int getMaxItemUseDuration(final ItemStack itemStack) {
		return 32;
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemStack, final World world, final EntityPlayer entityPlayer) {
		if (entityPlayer.canEat(this.alwaysEdible)) {
			entityPlayer.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
		}

		return itemStack;
	}

	@Override
	public boolean isWolfsFavoriteMeat() {
		return this.isWolfsFavoriteMeat;
	}

	@Override
	public ItemFood setPotionEffect(final int potionId, final int potionDuration, final int potionAmplifier,
			final float potionEffectProbability) {
		this.potionId = potionId;
		this.potionDuration = potionDuration;
		this.potionAmplifier = potionAmplifier;
		this.potionEffectProbability = potionEffectProbability;
		return this;
	}

	@Override
	public ItemFood setAlwaysEdible() {
		this.alwaysEdible = true;
		return this;
	}
}
