package com.dudi.vbmod.world;

import com.dudi.vbmod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

@SuppressWarnings({"unused", "FieldCanBeLocal", "SameParameterValue"})
public class ModWorldGen implements IWorldGenerator {

    private Random random = new Random();

    private final int variableMinY = 1;
    private final int variableMaxY = 20;
    private final int variableChances = 10;
    private final int minClusterSize = 1;
    private final int medClusterSize = 3;
    private int clusterSize = 0;

    //MaxClusterSize is minClusterSize + medClusterSize


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        for(int i = 0; i<variableChances; i++) {
            clusterSize = random.nextInt(medClusterSize)+minClusterSize;
        }
        if(world.provider.getDimension() == 0)
        {
            generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }

    }

    private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        generateOre(ModBlocks.VIBRANIUM_ORE.getDefaultState(),world, random,chunkX * 16, chunkZ*16, variableMinY, variableMaxY, clusterSize, variableChances);
    }

    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
        int deltaY = maxY - minY;

        for (int i = 0; i < chances; i++) {

            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world,random, pos);
        }
    }
}
