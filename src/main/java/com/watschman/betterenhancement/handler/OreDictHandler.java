package com.watschman.betterenhancement.handler;

import com.watschman.betterenhancement.blocks.ModBlocks;
import com.watschman.betterenhancement.items.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler extends OreDictionary{


    public static void init(){
        //Blocks
        registerOre("oreRuby", ModBlocks.RUBY_ORE);
        registerOre("oreSapphire", ModBlocks.SAPPHIRE_ORE);
        registerOre("oreGreenSapphire", ModBlocks.GREEN_SAPPHIRE_ORE);
        //Items
        registerOre("gemRuby", ModItems.RUBY);
        registerOre("gemSapphire", ModItems.SAPPHIRE);
        registerOre("gemGreenSapphire", ModItems.GREEN_SAPPHIRE);

        registerOre("seedBarley", ModItems.BARLEY_SEED);
        registerOre("cropBarley", ModItems.BARLEY);
        registerOre("foodBarley", ModItems.BARLEY);
    }

}