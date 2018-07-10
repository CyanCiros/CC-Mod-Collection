package cc_harvest.event;

import java.util.Random;

import cc_harvest.items.ModItems;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModLivingDropsEvent {
	public Random random = new Random();

	private final Item[] itemsSheep = { ModItems.muttonRawItem };
	private final Item[] itemsSquid = { ModItems.calamariRawItem };

	@SubscribeEvent
	public void onEntityDrop(final LivingDropsEvent event) {
		if (event.entityLiving instanceof EntitySheep) {
			this.dropItems(event, this.itemsSheep, 8, 3);
		} else if (event.entityLiving instanceof EntitySquid) {
			this.dropItems(event, this.itemsSquid, 8, 3);
		}
	}

	private void dropItems(final LivingDropsEvent event, final Item[] items, final int chance, final int amount) {
		for (final Item item : items) {
			if (this.random.nextInt(10) <= chance - 1) {
				event.entityLiving.dropItem(item, this.random.nextInt(amount) + 1);
			}
		}
	}

	@SuppressWarnings("unused")
	private void dropItem(final LivingDropsEvent event, final Item item, final int chance, final int amount) {
		if (this.random.nextInt(10) <= chance - 1) {
			event.entityLiving.dropItem(item, this.random.nextInt(amount) + 1);
		}
	}
}
