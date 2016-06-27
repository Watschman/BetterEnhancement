package com.watschman.betterenhancement.handler;

import com.watschman.betterenhancement.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class OreGenHandler implements IWorldGenerator{

    public static void init(){
        GameRegistry.registerWorldGenerator(new OreGenHandler(), 7);
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int dim = world.provider.getDimension();
        if (dim != 1 && dim != -1){
            if (world.getWorldType() != WorldType.FLAT){
                this.generate(world, random, chunkX*16, chunkZ*16);
            }
        }
    }
    private void generate(World world, Random random, int x, int z){
        this.oreSpawn(ModBlocks.ruby_ore, Blocks.STONE, world, random, x, z, MathHelper.getRandomIntegerInRange(random, 5, 8), 7, 0, 30);
    }
    public void oreSpawn(Block block, Block blockIn, World world, Random random, int xPos, int zPos, int maxVeinSize, int changetoSpawn, int minY, int maxY){
        if (maxY > minY){
            int yDifference = maxY - minY;
            for (int i = 0; i < changetoSpawn; i++) {
                int posX = xPos + random.nextInt(16);
                int posY = minY + random.nextInt(yDifference);
                int posZ = zPos + random.nextInt(16);
                new WorldGenMinable(block.getBlockState().getBaseState(), maxVeinSize, BlockMatcher.forBlock(blockIn)).generate(world, random, new BlockPos(posX, posY, posZ));
            }
        }
    }
}
