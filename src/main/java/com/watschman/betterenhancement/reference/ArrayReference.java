package com.watschman.betterenhancement.reference;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Set;

import static com.watschman.betterenhancement.items.ModItems.*;
import static com.watschman.betterenhancement.blocks.ModBlocks.*;

public class ArrayReference {
    public static final Item[] MOD_ITEMS = new Item[]{
            sample_item,
            carrot_apple,
            butter,
            gold_infused_diamond_axe,
            gold_infused_diamond_hoe,
            gold_infused_diamond_paxel,
            gold_infused_diamond_pickaxe,
            gold_infused_diamond_shovel,
            gold_infused_diamond_sword,
            ruby,
            ruby_axe,
            ruby_hoe,
            ruby_pickaxe,
            ruby_shovel,
            ruby_sword
    };

    // ----------------------

    public static final Block[] MOD_BLOCKS = new Block[]{
            sample_block,
            ruby_ore,
            ruby_chest
    };

    // ----------------------

    public static final Set<Block> PAXEL_EFFECTIVE_ON = Sets.newHashSet(
            Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB,
            Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH
    );
}
