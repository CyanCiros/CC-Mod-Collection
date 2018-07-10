package cc_mob_drops.event;

import java.util.Random;

import cc_mob_drops.Config;
import cc_mob_drops.items.ModItems;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
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

	private final Item[] itemsBat = { ModItems.batEars, ModItems.batEyes, ModItems.batFur, ModItems.batWings };

	private final Item[] itemsChicken = { ModItems.chickenLegs };

	private final Item[] itemsCow = { ModItems.cowHorn, ModItems.rawRibs };

	private final Item[] itemsCreeper = { ModItems.creeperEye, ModItems.creeperSkin };

	private final Item[] itemsEnderman = { ModItems.enderSkin, ModItems.enderTear };

	private final Item[] itemsHorse = { ModItems.horseHoof, ModItems.horseShoe, ModItems.horseSkin };

	private final Item[] itemsMagmaCube = { ModItems.magmaGoo };

	private final Item[] itemsPig = { ModItems.ham };

	private final Item[] itemsPigZombie = { ModItems.pigmanMeat };

	private final Item[] itemsSheep = { ModItems.rawLambchop };

	private final Item[] itemsSlime = { ModItems.goo };

	private final Item[] itemsSpider = { ModItems.spiderLeg };

	private final Item[] itemsSquid = { ModItems.squidEye, ModItems.squidTentacle, ModItems.calamari, ModItems.squid };

	private final Item[] itemsWolf = { ModItems.wolfSkin };

	private final Item[] itemsZombie = { ModItems.zombieBrain, ModItems.zombieArm };

	@SubscribeEvent
	public void onEntityDrop(final LivingDropsEvent event) {
		if (event.entityLiving instanceof EntityBat && Config.dropsBat) {
			this.dropItems(event, this.itemsBat, 4, 2);

		} else if (event.entityLiving instanceof EntityChicken && Config.dropsChicken) {
			this.dropItems(event, this.itemsChicken, 8, 2);

		} else if (event.entityLiving instanceof EntityCow && Config.dropsCow) {
			this.dropItem(event, this.itemsCow[0], 4, 2);
			this.dropItem(event, this.itemsCow[1], 8, 3);

		} else if (event.entityLiving instanceof EntityCreeper && Config.dropsCreeper) {
			this.dropItem(event, this.itemsCreeper[0], 4, 2);
			this.dropItem(event, this.itemsCreeper[1], 6, 4);

		} else if (event.entityLiving instanceof EntityEnderman && Config.dropsEnderman) {
			this.dropItem(event, this.itemsEnderman[0], 6, 4);
			this.dropItem(event, this.itemsEnderman[1], 4, 2);

		} else if (event.entityLiving instanceof EntityHorse && Config.dropsHorse) {
			this.dropItem(event, this.itemsHorse[0], 4, 4);
			this.dropItem(event, this.itemsHorse[1], 4, 4);
			this.dropItem(event, this.itemsHorse[2], 6, 6);

		} else if (event.entityLiving instanceof EntityMagmaCube && Config.dropsMagmaCube) {
			this.dropItems(event, this.itemsMagmaCube, 4, 3);

		} else if (event.entityLiving instanceof EntityPig && Config.dropsPig) {
			this.dropItems(event, this.itemsPig, 8, 3);

		} else if (event.entityLiving instanceof EntityPigZombie && Config.dropsPigZombie) {
			this.dropItems(event, this.itemsPigZombie, 8, 2);

		} else if (event.entityLiving instanceof EntitySheep && Config.dropsSheep) {
			this.dropItems(event, this.itemsSheep, 8, 3);

		} else if (event.entityLiving instanceof EntitySlime && Config.dropsSlime) {
			this.dropItems(event, this.itemsSlime, 4, 3);

		} else if (event.entityLiving instanceof EntitySpider && Config.dropsSpider) {
			this.dropItems(event, this.itemsSpider, 1, 1);

		} else if (event.entityLiving instanceof EntitySquid && Config.dropsSquid) {
			this.dropItem(event, this.itemsSquid[0], 4, 2);
			this.dropItem(event, this.itemsSquid[1], 4, 4);
			this.dropItem(event, this.itemsSquid[2], 8, 2);
			this.dropItem(event, this.itemsSquid[3], 8, 1);

		} else if (event.entityLiving instanceof EntityWolf && Config.dropsWolf) {
			this.dropItems(event, this.itemsWolf, 6, 4);

		} else if (event.entityLiving instanceof EntityZombie && Config.dropsZombie) {
			this.dropItem(event, this.itemsZombie[0], 4, 1);
			this.dropItem(event, this.itemsZombie[1], 1, 1);
		}
	}

	private void dropItems(final LivingDropsEvent event, final Item[] items, final int chance, final int amount) {
		for (final Item item : items) {
			if (this.random.nextInt(10) <= chance - 1) {
				event.entityLiving.dropItem(item, this.random.nextInt(amount) + 1);
			}
		}
	}

	private void dropItem(final LivingDropsEvent event, final Item item, final int chance, final int amount) {
		if (this.random.nextInt(10) <= chance - 1) {
			event.entityLiving.dropItem(item, this.random.nextInt(amount) + 1);
		}
	}
}
