package galaxyspace.systems.SolarSystem.planets.mars.world.gen.we;

import asmodeuscore.core.astronomy.dimension.world.worldengine.WE_Biome;
import asmodeuscore.core.astronomy.dimension.world.worldengine.standardcustomgen.WE_BiomeLayer;
import galaxyspace.core.prefab.entities.EntityEvolvedColdBlaze;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedEnderman;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSkeleton;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.Biome;

public class Mars_Plains extends WE_Biome {
	
	public Mars_Plains(double min, double max) {
		super(new BiomeProperties("mars_plains"), new int[] {ColorizerGrass.getGrassColor(0.5D, 1.0D), 0xFFFFFF, ColorizerGrass.getGrassColor(0.5D, 1.0D)});
				
		biomeMinValueOnMap      =  	min;
		biomeMaxValueOnMap      =   max;
		biomePersistence        =   1.5D;
		biomeNumberOfOctaves    =      4;
		biomeScaleX             = 280.0D;
		biomeScaleY             =   1.7D;
		biomeSurfaceHeight      =     80;
		biomeInterpolateQuality =     30;
		
		//-//
		decorateChunkGen_List.clear();		
		createChunkGen_InXZ_List.clear();
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedSpider.class, 10, 1, 2));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedSkeleton.class, 10, 1, 2));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedZombie.class, 10, 1, 2));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedEnderman.class, 10, 1, 2));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedColdBlaze.class, 10, 1, 2));
		
		WE_BiomeLayer standardBiomeLayers = new WE_BiomeLayer();
		standardBiomeLayers.add(MarsBlocks.marsBlock.getStateFromMeta(6), MarsBlocks.marsBlock.getStateFromMeta(9), -256, 0,   -4, -2,  true);
		standardBiomeLayers.add(MarsBlocks.marsBlock.getStateFromMeta(5), MarsBlocks.marsBlock.getStateFromMeta(6), -256, 0,   -2, -1,  true);
		standardBiomeLayers.add(Blocks.BEDROCK.getDefaultState(), 0, 2, 0, 0, true);
		createChunkGen_InXZ_List.add(standardBiomeLayers);
	}
}
