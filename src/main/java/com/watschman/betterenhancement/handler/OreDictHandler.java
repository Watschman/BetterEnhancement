package com.watschman.betterenhancement.handler;

import com.watschman.betterenhancement.blocks.ModBlocks;
import com.watschman.betterenhancement.items.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler extends OreDictionary{
    public static void init(){
        registerOre("oreRuby", ModBlocks.ruby_ore);
        registerOre("gemRuby", ModItems.ruby);
    }

}
