package com.watschman.betterenhancement.handler;

import com.watschman.betterenhancement.blocks.ModBlocks;
import com.watschman.betterenhancement.items.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler extends OreDictionary{


    public static void init(){
        //Blocks
        registerOre("oreRuby", ModBlocks.RUBY_ORE);
        registerOre("oreSapphire", ModBlocks.SAPPHIRE_ORE);
        registerOre("orePeridot", ModBlocks.PERIDOT_ORE);
        //Items
        registerOre("gemRuby", ModItems.RUBY);
        registerOre("gemSapphire", ModItems.SAPPHIRE);
        registerOre("gemPeridot", ModItems.PERIDOT);

        registerOre("seedBarley", ModItems.BARLEY_SEED);
        registerOre("cropBarley", ModItems.BARLEY);
        registerOre("foodBarley", ModItems.BARLEY);
    }

}