package galaxyspace.systems.BarnardsSystem.planets.barnarda_c.world.gen;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Predicate;

import asmodeuscore.core.astronomy.dimension.world.gen.features.trees.WorldGenTree_Forest;
import asmodeuscore.core.astronomy.dimension.world.gen.features.trees.WorldGenTree_Forest2;
import asmodeuscore.core.astronomy.dimension.world.worldengine.WE_Biome;
import galaxyspace.systems.BarnardsSystem.core.registers.BRBlocks;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.blocks.Barnarda_C_Blocks;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.blocks.Barnarda_C_Dandelions;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.blocks.Barnarda_C_Falling_Blocks;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.blocks.Barnarda_C_Grass;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.world.gen.we.Barnarda_C_Dunes;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.world.gen.we.Barnarda_C_Forest;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.world.gen.we.Barnarda_C_Mountains;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.world.gen.we.Barnarda_C_Plains;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.world.gen.we.Barnarda_C_Swampland;
import galaxyspace.systems.BarnardsSystem.planets.barnarda_c.world.gen.we.Barnarda_C_YellowPlains;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecoratorBarnarda_C extends BiomeDecoratorSpace
{
    private World currentWorld;  
    
    private WorldGenerator dirtGen, coalGen, ironGen, goldGen, lapisGen, redstoneGen, diamondGen, siliconGen, copperGen, tinGen, aluminumGen, quartzGen, cobaltumGen, nickelGen;
   
    public BiomeDecoratorBarnarda_C()
    {
    	dirtGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_BLOCKS, 30, 0, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    
    	coalGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 15, 0, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	ironGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 6, 1, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	goldGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 6, 2, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	redstoneGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 6, 3, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	lapisGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 6, 4, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	diamondGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 6, 5, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	siliconGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 6, 6, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	copperGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 8, 7, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	tinGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 8, 8, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	aluminumGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 5, 9, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	quartzGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 4, 10, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	cobaltumGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 2, 11, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    	nickelGen = new WorldGenMinableMeta(BRBlocks.BARNARDA_C_ORES, 4, 12, true, BRBlocks.BARNARDA_C_BLOCKS, 1);
    }

    @Override
    protected void decorate()
    {    	    	
    	
    	int randPosX = this.posX + this.rand.nextInt(16) + 8;
		int randPosZ = this.posZ + this.rand.nextInt(16) + 8;
		
		BlockPos pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
		
		this.generateOre(30, dirtGen, 5, 180);
		
		this.generateOre(20, coalGen, 5, 180);
		this.generateOre(15, ironGen, 5, 180);
		this.generateOre(10, goldGen, 5, 45);
		this.generateOre(20, redstoneGen, 5, 25);
		this.generateOre(4, lapisGen, 5, 40);
		this.generateOre(8, diamondGen, 5, 15);
		this.generateOre(8, siliconGen, 5, 40);
		this.generateOre(20, copperGen, 5, 120);
		this.generateOre(15, tinGen, 5, 120);
		this.generateOre(10, aluminumGen, 5, 50);
		this.generateOre(8, quartzGen, 5, 15);
		this.generateOre(8, cobaltumGen, 5, 40);
		this.generateOre(8, nickelGen, 5, 15);
		
	//	WE_ChunkProvider chunk = ((WE_WorldProvider)this.getCurrentWorld().provider).getChunkProvider();
		
		/*double scaleX = chunk.biomemapScaleX;
		double persistance = chunk.biomemapPersistence;
		GalaxySpace.debug("" + WE_PerlinNoise.PerlinNoise2D((this.getCurrentWorld().getSeed() * 11) ^ 6,
				this.posX / scaleX, this.posZ / scaleX,
				persistance, chunk.biomemapNumberOfOctaves)
			* chunk.biomemapScaleY);
		
		*/

		if(getBiome(randPosX, randPosZ) instanceof Barnarda_C_Forest)
    	{
    		for(int i = 0; i < 40; i++){
        		randPosX = this.posX + this.rand.nextInt(16) + 8;
    			//int randPosY = this.rand.nextInt(256);
    			randPosZ = this.posZ + this.rand.nextInt(16) + 8;
    			pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
    			
    			if(this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS))
        			this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.GRASS));
        	}
    		
    		if(rand.nextInt(5) == 0){
        		randPosX = this.posX + this.rand.nextInt(16) + 8;
    			//int randPosY = this.rand.nextInt(256);
    			randPosZ = this.posZ + this.rand.nextInt(16) + 8;
    			pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
    			
    			if(this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS))
        			this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.HOPPER));
        	}
    		    		
    		/*
			if(!this.getCurrentWorld().isAreaLoaded(pos, 13, false))
			{
				boolean cangen = true;
				
				for(BlockPos pos1 : pos.getAllInBox(pos.add(-3, -1, -3), pos.add(3, -1, 3)))
					if(this.getCurrentWorld().isAirBlock(pos1)) 
						cangen = false;
				
				if(cangen && this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS))
    			{
    				new WorldGenTree_BigJungle(BRBlocks.BARNARDA_C_TEST_GLOW_LOG.getStateFromMeta(0), BRBlocks.BARNARDA_C_LEAVES.getStateFromMeta(0), rand.nextInt(3)).generate(getCurrentWorld(), rand, pos);
    			}
			}
			*/
			for(int i = 0; i < 105; i++){
				randPosX = this.posX + this.rand.nextInt(16) + 8;
				randPosZ = this.posZ + this.rand.nextInt(16) + 8;
				pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
				
				boolean cangen = true;
				
				cangen = true;
				for(BlockPos pos1 : pos.getAllInBox(pos.add(-3, -1, -3), pos.add(3, -1, 3)))
					if(this.getCurrentWorld().isAirBlock(pos1) || this.getCurrentWorld().getBlockState(pos1) == BRBlocks.BARNARDA_C_VIOLET_LOG.getStateFromMeta(0)) 
						cangen = false;
				
	    		if(!this.getCurrentWorld().isAreaLoaded(pos, 18, false))
		    		if(cangen && pos.getY() > 50 && this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS))
		    		{
		    			switch(rand.nextInt(2))
						{
							case 0:						
								new WorldGenTree_Forest(BRBlocks.BARNARDA_C_VIOLET_LOG.getStateFromMeta(0), BRBlocks.BARNARDA_C_LEAVES.getStateFromMeta(0), rand.nextInt(3)).generate(getCurrentWorld(), rand, pos);
								break;
							case 1:
								new WorldGenTree_Forest2(BRBlocks.BARNARDA_C_VIOLET_LOG.getStateFromMeta(0), BRBlocks.BARNARDA_C_LEAVES.getStateFromMeta(0), rand.nextInt(3)).generate(getCurrentWorld(), rand, pos);
								break;
						}
					}
			}
			
			for(int i = 0; i < 8; i++){
				for(int y = 40; y < 150; y++) {
	        		randPosX = this.posX + this.rand.nextInt(16) + 8;    			
	    			randPosZ = this.posZ + this.rand.nextInt(16) + 8;
	    			pos = new BlockPos(randPosX, y, randPosZ);
	    			
	    			if(this.getCurrentWorld().isAirBlock(pos) && this.getCurrentWorld().getBlockState(pos.up()) == BRBlocks.BARNARDA_C_LEAVES.getStateFromMeta(0))
	        		{
	    				this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.LEAVES_BALLS));
	        		}
				}
        	}
			
			for(int i = 0; i < 40; i++){
        		randPosX = this.posX + this.rand.nextInt(16) + 8;
    			//int randPosY = this.rand.nextInt(256);
    			randPosZ = this.posZ + this.rand.nextInt(16) + 8;
    			pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
    			
    			boolean cangen = false;
    			int range = 2;
    			for(BlockPos pos1 : pos.getAllInBox(pos.add(-range, -range, -range), pos.add(range, range, range)))
					if(this.getCurrentWorld().getBlockState(pos1).getMaterial() == Material.WATER) 
						cangen = true;
    			
    			if(cangen && 
    					(this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS) ||
    					this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_BLOCKS.getDefaultState().withProperty(Barnarda_C_Blocks.BASIC_TYPE, Barnarda_C_Blocks.EnumBlockBarnardaC.DIRT)))
        		{
    				this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.LIGHT_BALLS));
    			}
        	}
	    }
    	
		
	    for(int i = 0; i < 180; i++){
	    	randPosX = this.posX + this.rand.nextInt(16) + 8;
				//int randPosY = this.rand.nextInt(256);
			randPosZ = this.posZ + this.rand.nextInt(16) + 8;
			pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
		    		
			if(getBiome(randPosX, randPosZ) instanceof Barnarda_C_Plains)
		    {
	    			if(this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS))
	        			this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.GRASS));
  
		    }
	    }
	    
	    	
	    if(rand.nextInt(5) == 0){
			randPosX = this.posX + this.rand.nextInt(16) + 8;
			randPosZ = this.posZ + this.rand.nextInt(16) + 8;
			pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
				
			if(getBiome(randPosX, randPosZ) instanceof Barnarda_C_Plains)
		    {
				boolean cangen = true;
					
				cangen = true;
				for(BlockPos pos1 : pos.getAllInBox(pos.add(-3, -1, -3), pos.add(3, -1, 3)))
					if(this.getCurrentWorld().isAirBlock(pos1) || this.getCurrentWorld().getBlockState(pos1) == BRBlocks.BARNARDA_C_VIOLET_GLOW_LOG.getStateFromMeta(0)) 
						cangen = false;
					
		    	if(!this.getCurrentWorld().isAreaLoaded(pos, 13, false))
			    	if(cangen && this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS))
			    	{
			    		switch(rand.nextInt(2))
						{
							case 0:						
								new WorldGenTree_Forest(BRBlocks.BARNARDA_C_VIOLET_LOG.getStateFromMeta(0), BRBlocks.BARNARDA_C_LEAVES.getStateFromMeta(0), rand.nextInt(3)).generate(getCurrentWorld(), rand, pos);
								break;
							case 1:
								new WorldGenTree_Forest2(rand.nextInt(10) == 0 ? BRBlocks.BARNARDA_C_VIOLET_GLOW_LOG.getStateFromMeta(0) : BRBlocks.BARNARDA_C_VIOLET_LOG.getStateFromMeta(0), BRBlocks.BARNARDA_C_LEAVES.getStateFromMeta(0), rand.nextInt(3)).generate(getCurrentWorld(), rand, pos);
								break;
						}
					}
		    }
			
	    }
	    
	    if(getBiome(randPosX, randPosZ) instanceof Barnarda_C_Mountains)
    	{
	    	if(rand.nextInt(2) == 0){
	    		randPosX = this.posX + this.rand.nextInt(16) + 8;
	    		randPosZ = this.posZ + this.rand.nextInt(16) + 8;
	    		pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
	    		
	    		if(pos.getY() > 120 && pos.getY() < 125)
	    		{
	    			this.getCurrentWorld().setBlockState(pos, Blocks.FLOWING_WATER.getDefaultState(), 3);
	    		}			
	    	}
	    	
	    	for(int i = 0; i < 40; i++){
	    		randPosX = this.posX + this.rand.nextInt(16) + 8;
	    		randPosZ = this.posZ + this.rand.nextInt(16) + 8;
	    		pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
	    		
	    		if(this.getCurrentWorld().isAreaLoaded(pos, 13, false))
	    			new WorldGenMinable(BRBlocks.BARNARDA_C_BLOCKS.getDefaultState().withProperty(Barnarda_C_Blocks.BASIC_TYPE, Barnarda_C_Blocks.EnumBlockBarnardaC.STONE), 25, new BRStonePredicate()).generate(getCurrentWorld(), rand, pos);
	    	}
	    	
	    	for(int y = 0; y < 10; y++) {
        		randPosX = this.posX + this.rand.nextInt(16) + 8;    			
    			randPosZ = this.posZ + this.rand.nextInt(16) + 8;
    			pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
    			
    			if(this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS))
    				this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.GRASS));
	    	}

    	}
	    
	    
	    for(int i = 0; i < 180; i++){
	    	randPosX = this.posX + this.rand.nextInt(16) + 8;
	    	randPosZ = this.posZ + this.rand.nextInt(16) + 8;
	    	pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
	    	
			if(getBiome(randPosX, randPosZ) instanceof Barnarda_C_YellowPlains)
		    {
				if(pos.getY() > 63 && this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS))
				{
					if(this.rand.nextInt(5) == 0)
						this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.YELLOW_GRASS_UP));
					else {
						this.getCurrentWorld().setBlockState(pos.up(), BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.YELLOW_GRASS_UP));
						this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.YELLOW_GRASS_DOWN));
					}
				}

		    }
    	}
	    
	    if(getBiome(randPosX, randPosZ) instanceof Barnarda_C_Swampland)
    	{
	    	for(int i = 0; i < 5; i++){
				randPosX = this.posX + this.rand.nextInt(16) + 8;
				randPosZ = this.posZ + this.rand.nextInt(16) + 8;
				pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
			   
			
		    	boolean cangen = true;
				
		  
		    	while(!this.currentWorld.isBlockNormalCube(pos, true))
		    	{
		    		pos = pos.down();
		    	}
		    		
				/*for(BlockPos pos1 : pos.getAllInBox(pos.add(-4, -1, -4), pos.add(4, -1, 4)))
					if(!this.getCurrentWorld().isAirBlock(pos1) || this.getCurrentWorld().getBlockState(pos1) == BRBlocks.BARNARDA_C_TEST_LOG.getStateFromMeta(0)) 
						cangen = false;
					*/
		    	if(!this.getCurrentWorld().isAreaLoaded(pos, 10, false))
			    	if(cangen && (
			    			this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS) 
			    			|| this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_BLOCKS.getDefaultState().withProperty(Barnarda_C_Blocks.BASIC_TYPE, Barnarda_C_Blocks.EnumBlockBarnardaC.DIRT) 
			    			|| this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_BLOCKS.getDefaultState().withProperty(Barnarda_C_Blocks.BASIC_TYPE, Barnarda_C_Blocks.EnumBlockBarnardaC.DIRT_1)) )
			    	{
			    		switch(rand.nextInt(2))
						{
							case 0:						
								new WorldGenTree_Swampland(BRBlocks.BARNARDA_C_VIOLET_LOG.getStateFromMeta(0), BRBlocks.BARNARDA_C_LEAVES.getStateFromMeta(0), rand.nextInt(3)).generate(getCurrentWorld(), rand, pos);
								break;
							case 1:
								new WorldGenTree_Swampland_2(BRBlocks.BARNARDA_C_VIOLET_LOG.getStateFromMeta(0), BRBlocks.BARNARDA_C_LEAVES.getStateFromMeta(0), rand.nextInt(3)).generate(getCurrentWorld(), rand, pos);
								break;
						}
					}
	    	}
	    	
	    	for(int i = 0; i < 16; i++){
	    		for(int k = 0; k < 16; k++){
					randPosX = this.posX + i + 8;
					randPosZ = this.posZ + k + 8;
					
					pos = this.currentWorld.getTopSolidOrLiquidBlock(new BlockPos(randPosX, 0, randPosZ));
					
					if(this.getCurrentWorld().getBlockState(pos).getMaterial() == Material.WATER && this.rand.nextInt(2) == 0)
					{
						this.getCurrentWorld().setBlockState(pos.up(), BRBlocks.BARNARDA_C_WATER_GRASS.getDefaultState());
					}
	    		}
			}
				    	
			for(int i = 0; i < 30; i++){
        		randPosX = this.posX + this.rand.nextInt(16) + 8;
    			//int randPosY = this.rand.nextInt(256);
    			randPosZ = this.posZ + this.rand.nextInt(16) + 8;
    			pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
    			
    			boolean cangen = false;
    			int range = 2;
    			for(BlockPos pos1 : pos.getAllInBox(pos.add(-range, -range, -range), pos.add(range, range, range)))
					if(this.getCurrentWorld().getBlockState(pos1).getMaterial() == Material.WATER) 
						cangen = true;
    			
    			if(cangen && 
    					(this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_GRASS.getDefaultState().withProperty(Barnarda_C_Grass.BASIC_TYPE, Barnarda_C_Grass.EnumBlockGrass.GRASS) ||
    					this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_BLOCKS.getDefaultState().withProperty(Barnarda_C_Blocks.BASIC_TYPE, Barnarda_C_Blocks.EnumBlockBarnardaC.DIRT)))
        		{
    				if(rand.nextInt(15) == 0)
    				{
    					for(int size = 0; size < 2 + rand.nextInt(2); size++)
    					{
    						this.getCurrentWorld().setBlockState(pos.up(size), BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.REEDS));
    					}
    				}
    				else
    					this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.LIGHT_BALLS));
    			}
        	}
	    }
	    
	    
	    for(int i = 0; i < 2; i++){
	    	randPosX = this.posX + this.rand.nextInt(16) + 8;
    		randPosZ = this.posZ + this.rand.nextInt(16) + 8;
    		pos = this.currentWorld.getHeight(new BlockPos(randPosX, 0, randPosZ));
    		
    		if(getBiome(randPosX, randPosZ) instanceof Barnarda_C_Dunes)
    	    {
    			boolean cangen = true;
    			int range = 2;
    			for(BlockPos pos1 : pos.getAllInBox(pos.add(-range, -range, -range), pos.add(range, range, range))) 
					if(this.getCurrentWorld().getBlockState(pos1) == Blocks.CACTUS.getDefaultState()) 
						cangen = false;    			
    			
    			for(BlockPos pos1 : pos.getAllInBox(pos.add(-range, 0, -range), pos.add(range, 0, range))) 
    				if(this.getCurrentWorld().getBlockState(pos1) != Blocks.AIR.getDefaultState())
    					cangen = false;
    			
    			if(cangen && this.getCurrentWorld().getBlockState(pos.down()) == BRBlocks.BARNARDA_C_FALLING_BLOCKS.getDefaultState().withProperty(Barnarda_C_Falling_Blocks.BASIC_TYPE, Barnarda_C_Falling_Blocks.EnumFallingBlockBarnardaC.SAND)) {
    				if(rand.nextInt(2) == 0)
    				{
	    				for(int size = 0; size < 1 + rand.nextInt(3); size++)
						{
							this.getCurrentWorld().setBlockState(pos.up(size), Blocks.CACTUS.getDefaultState());
						}
    				}
    				else {
    					this.getCurrentWorld().setBlockState(pos, BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.DESERT_DOWN));
    					if(rand.nextInt(3) == 0)
    						this.getCurrentWorld().setBlockState(pos.up(), BRBlocks.BARNARDA_C_DANDELIONS.getDefaultState().withProperty(Barnarda_C_Dandelions.BASIC_TYPE, Barnarda_C_Dandelions.EnumBlockDandelions.DESERT_UP));
    				}
    			}
	    	}
    	}
    }
    
    @Override
    protected void setCurrentWorld(World world)
    {
        this.currentWorld = world;
    }

    @Override
    protected World getCurrentWorld()
    {
        return this.currentWorld;
    }
    
    private WE_Biome getBiome(int x, int z)
    {
    	return WE_Biome.getBiomeAt(x, z);
    }
    
    static class BRStonePredicate implements Predicate<IBlockState>
    {
    	List<IBlockState> states = new ArrayList<IBlockState>();
        private BRStonePredicate() {
        	states.add(BRBlocks.BARNARDA_C_GRASS.getDefaultState());
        	states.add(BRBlocks.BARNARDA_C_BLOCKS.getDefaultState().withProperty(Barnarda_C_Blocks.BASIC_TYPE, Barnarda_C_Blocks.EnumBlockBarnardaC.DIRT));
        	states.add(BRBlocks.BARNARDA_C_BLOCKS.getDefaultState().withProperty(Barnarda_C_Blocks.BASIC_TYPE, Barnarda_C_Blocks.EnumBlockBarnardaC.DIRT_1));
        	states.add(BRBlocks.BARNARDA_C_BLOCKS.getDefaultState().withProperty(Barnarda_C_Blocks.BASIC_TYPE, Barnarda_C_Blocks.EnumBlockBarnardaC.STONE));
        }

        public boolean apply(IBlockState state)
        {
            if (state != null && states.contains(state))
            {
            	return true;
            }           
            return false;            
        }
    }
}
