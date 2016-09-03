package com.watschman.betterenhancement.blocks;

import com.watschman.betterenhancement.blocks.crops.BarleyCrop;
import com.watschman.betterenhancement.blocks.furnaces.RubyFurnace;
import com.watschman.betterenhancement.blocks.misc.*;
import com.watschman.betterenhancement.blocks.ore.*;
import com.watschman.betterenhancement.blocks.storage.PeridotChest;
import com.watschman.betterenhancement.blocks.storage.RubyChest;
import com.watschman.betterenhancement.blocks.storage.SapphireChest;
import net.minecraft.block.Block;

public class ModBlocks {

    public static Block SAMPLE_BLOCK = new SampleBlock("sample_block");
    public static Block RUBY_ORE = new RubyOre("ruby_ore");
    public static Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore");
    public static Block PERIDOT_ORE = new PeridotOre("peridot_ore");
    public static Block RUBY_CHEST = new RubyChest("ruby_chest");
    public static Block SAPPHIRE_CHEST = new SapphireChest("sapphire_chest");
    public static Block PERIDOT_CHEST = new PeridotChest("peridot_chest");
    public static Block BARLEY_CROP = new BarleyCrop("barley_crop");
    public static Block RUBY_FURNACE = new RubyFurnace(false, "ruby_furnace");
    public static Block LIT_RUBY_FURNACE = new RubyFurnace(true, "lit_ruby_furnace");

}
