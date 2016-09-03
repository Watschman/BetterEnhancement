package com.watschman.betterenhancement.blocks.ore;

import com.watschman.betterenhancement.items.ModItems;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class RubyOre extends BlockOre{
    public RubyOre(String name){
        setUnlocalizedName(name);
        setHarvestLevel("pickaxe", 2);
        setHardness(1F);
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return ModItems.RUBY;
    }
    public int quantityDropped(Random random){
        return 1 + random.nextInt(5);
    }
}
