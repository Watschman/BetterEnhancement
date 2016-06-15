package com.watschman.betterenhancement.handler;

import com.watschman.betterenhancement.blocks.blockBase;
import com.watschman.betterenhancement.items.itemBase;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHandler extends OreDictionary{
    public static void init(){
        registerOre("oreRuby", blockBase.ruby_ore);
        registerOre("gemRuby", itemBase.ruby);
    }

}
