package com.watschman.betterenhancement.handler;

import com.watschman.betterenhancement.blocks.ModBlocks;
import com.watschman.betterenhancement.items.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler extends OreDictionary{


    public static void init(){
        //Blocks
        registerOre("oreRuby", ModBlocks.RUBY_ORE);
        //Items
        registerOre("gemRuby", ModItems.RUBY);
        registerOre("seedBarley", ModItems.BARLEY_SEED);
        registerOre("cropBarley", ModItems.BARLEY);
        registerOre("foodBarley", ModItems.BARLEY);
    }

}