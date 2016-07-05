package com.watschman.betterenhancement.reference;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Set;

import static com.watschman.betterenhancement.items.ModItems.*;
import static com.watschman.betterenhancement.blocks.ModBlocks.*;

public class ArrayReference {
    public static final Item[] MOD_ITEMS = new Item[]{
            SAMPLE_ITEM,
            CARROT_APPLE,
            BARLEY,
            BARLEY_SEED,
            BUTTER,
            GOLD_INFUSED_DIAMOND_AXE,
            GOLD_INFUSED_DIAMOND_HOE,
            GOLD_INFUSED_DIAMOND_PAXEL,
            GOLD_INFUSED_DIAMOND_PICKAXE,
            GOLD_INFUSED_DIAMOND_SHOVEL,
            GOLD_INFUSED_DIAMOND_SWORD,
            RUBY,
            RUBY_AXE,
            RUBY_HOE,
            RUBY_PICKAXE,
            RUBY_SHOVEL,
            RUBY_SWORD,
            RUBY_HELMET,
            RUBY_CHESTPLATE,
            RUBY_LEGGINGS,
            RUBY_BOOTS
    };

    // ----------------------

    public static final Block[] MOD_BLOCKS = new Block[]{
            SAMPLE_BLOCK,
            RUBY_ORE,
            RUBY_CHEST,
            BARLEY_CROP
    };

    // ----------------------

    public static final Set<Block> PAXEL_EFFECTIVE_ON = Sets.newHashSet(
            Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB,
            Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH
    );
}
