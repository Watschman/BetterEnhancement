package com.watschman.betterenhancement.blocks.ore;

import com.watschman.betterenhancement.items.itemBase;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class rubyOre extends BlockOre{
    public rubyOre(){
        setHarvestLevel("pickaxe", 2);
        setHardness(1F);
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return itemBase.ruby;
    }
    public int quantityDropped(Random random){
        return 1 + random.nextInt(5);
    }
}
