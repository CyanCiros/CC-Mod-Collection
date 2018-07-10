package cc_cyan_weapons.event;

import java.util.Random;

import cc_cyan_weapons.items.ModItems;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModLivingDropsEvent {
	public Random random = new Random();

	private final Item[] itemsEssence = { ModItems.essenceBeast, ModItems.essenceDark, ModItems.essenceEarth,
			ModItems.essenceEnder, ModItems.essenceFire, ModItems.essenceLight, ModItems.essenceThunder,
			ModItems.essenceWater, ModItems.essenceWind };

	private final int[] itemsEssenceChance = { 4, 5, 5, 1, 6, 4, 5, 2, 6 };

	private final Item[] itemsBat = { ModItems.essenceDark, ModItems.essenceWind };

	private final Item[] itemsBlaze = { ModItems.essenceFire, ModItems.essenceThunder, ModItems.essenceWind };

	private final Item[] itemsCaveSpider = { ModItems.essenceBeast, ModItems.essenceFire, ModItems.essenceWind };

	private final Item[] itemsChicken = { ModItems.essenceLight, ModItems.essenceWind };

	private final Item[] itemsCow = { ModItems.essenceEarth, ModItems.essenceLight };

	private final Item[] itemsCreeper = { ModItems.essenceThunder, ModItems.essenceFire };

	private final Item[] itemsEnderman = { ModItems.essenceDark, ModItems.essenceEnder };

	private final Item[] itemsGhast = { ModItems.essenceFire, ModItems.essenceThunder, ModItems.essenceWind };

	private final Item[] itemsHorse = { ModItems.essenceBeast };

	private final Item[] itemsMagmaCube = { ModItems.essenceFire, ModItems.essenceThunder };

	private final Item[] itemsPig = { ModItems.essenceEarth };

	private final Item[] itemsPigZombie = { ModItems.essenceDark, ModItems.essenceFire };

	private final Item[] itemsSheep = { ModItems.essenceLight };

	private final Item[] itemsSkeleton = { ModItems.essenceDark, ModItems.essenceEarth };

	private final Item[] itemsSlime = { ModItems.essenceEarth, ModItems.essenceWater };

	private final Item[] itemsSnowman = { ModItems.essenceLight };

	private final Item[] itemsSpider = { ModItems.essenceBeast, ModItems.essenceEarth, ModItems.essenceWind };

	private final Item[] itemsSquid = { ModItems.essenceWater };

	private final Item[] itemsWitch = { ModItems.essenceThunder };

	private final Item[] itemsWolf = { ModItems.essenceBeast };

	private final Item[] itemsZombie = { ModItems.essenceDark };

	@SubscribeEvent
	public void onEntityDrop(final LivingDropsEvent event) {
		if (event.entityLiving instanceof EntityBat) {
			this.dropEssence(event, this.itemsBat);

		} else if (event.entityLiving instanceof EntityBlaze) {
			this.dropEssence(event, this.itemsBlaze);

		} else if (event.entityLiving instanceof EntityCaveSpider) {
			this.dropEssence(event, this.itemsCaveSpider);

		} else if (event.entityLiving instanceof EntityChicken) {
			this.dropEssence(event, this.itemsChicken);

		} else if (event.entityLiving instanceof EntityCow) {
			this.dropEssence(event, this.itemsCow);

		} else if (event.entityLiving instanceof EntityCreeper) {
			this.dropEssence(event, this.itemsCreeper);

		} else if (event.entityLiving instanceof EntityEnderman) {
			this.dropEssence(event, this.itemsEnderman);

		} else if (event.entityLiving instanceof EntityGhast) {
			this.dropEssence(event, this.itemsGhast);

		} else if (event.entityLiving instanceof EntityHorse) {
			this.dropEssence(event, this.itemsHorse);

		} else if (event.entityLiving instanceof EntityMagmaCube) {
			this.dropEssence(event, this.itemsMagmaCube);

		} else if (event.entityLiving instanceof EntityPig) {
			this.dropEssence(event, this.itemsPig);

		} else if (event.entityLiving instanceof EntityPigZombie) {
			this.dropEssence(event, this.itemsPigZombie);

		} else if (event.entityLiving instanceof EntitySheep) {
			this.dropEssence(event, this.itemsSheep);

		} else if (event.entityLiving instanceof EntitySkeleton) {
			this.dropEssence(event, this.itemsSkeleton);

		} else if (event.entityLiving instanceof EntitySlime) {
			this.dropEssence(event, this.itemsSlime);

		} else if (event.entityLiving instanceof EntitySnowman) {
			this.dropEssence(event, this.itemsSnowman);

		} else if (event.entityLiving instanceof EntitySpider) {
			this.dropEssence(event, this.itemsSpider);

		} else if (event.entityLiving instanceof EntitySquid) {
			this.dropEssence(event, this.itemsSquid);

		} else if (event.entityLiving instanceof EntityWitch) {
			this.dropEssence(event, this.itemsWitch);

		} else if (event.entityLiving instanceof EntityWolf) {
			this.dropEssence(event, this.itemsWolf);

		} else if (event.entityLiving instanceof EntityZombie) {
			this.dropEssence(event, this.itemsZombie);

		} else {
			this.dropEssence(event, this.itemsEssence);
		}
	}

	private void dropEssence(final LivingDropsEvent event, final Item[] items) {
		float chance;

		if (items.length > 3) {
			for (int i = 0; i < items.length; i++) {
				chance = 36.0f;

				if (this.random.nextInt((int) chance) == 0) {
					event.entityLiving.dropItem(items[i], 1);
				}
			}
		} else {
			for (int i = 0; i < items.length; i++) {
				chance = 1.0f / (1.0f / this.itemsEssenceChance[i] / 4.0f);

				if (this.random.nextInt((int) chance) == 0) {
					event.entityLiving.dropItem(items[i], 1);
				}
			}
		}
	}
}
