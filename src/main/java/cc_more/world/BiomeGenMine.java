package cc_more.world;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
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
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenMine extends BiomeGenBase {
	@SuppressWarnings("unchecked")
	public BiomeGenMine(final int biomeId, final Boolean bool) {
		super(biomeId, bool);
		this.setHeight(height_ShallowWaters);
		this.topBlock = Blocks.stone.getDefaultState();
		this.fillerBlock = Blocks.stone.getDefaultState();

		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySheep.class, 22, 1, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityPig.class, 22, 1, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityChicken.class, 22, 1, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityCow.class, 22, 1, 4));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityHorse.class, 12, 1, 4));

		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySpider.class, 18, 1, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityZombie.class, 18, 1, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySkeleton.class, 18, 1, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityCreeper.class, 18, 1, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntitySlime.class, 10, 1, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityEnderman.class, 8, 1, 4));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityWitch.class, 10, 1, 1));

		this.spawnableWaterCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySquid.class, 10, 1, 4));

		this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityBat.class, 10, 1, 8));

		this.setColor(0);
		this.setDisableRain();
		this.setBiomeName("Miner's Heaven");
	}
}
