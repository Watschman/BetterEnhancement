package com.watschman.betterenhancement.reference;

import com.google.common.collect.Sets;
import com.watschman.betterenhancement.tileentity.ModTileEntites;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;

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
            SAPPHIRE,
            PERIDOT,
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
            SAPPHIRE_ORE,
            PERIDOT_ORE,
            RUBY_CHEST,
            SAPPHIRE_CHEST,
            PERIDOT_CHEST,
            BARLEY_CROP,
            RUBY_FURNACE,
            LIT_RUBY_FURNACE
    };

    // ----------------------

    public static final TileEntity[] MOD_TILE_ENTITIES = new TileEntity[]{
            ModTileEntites.TILE_ENTITY_RUBY_CHEST,
            ModTileEntites.TILE_ENTITY_SAMPLE_BLOCK,
            ModTileEntites.TILE_ENTITY_SAPPHIRE_CHEST,
            ModTileEntites.TILE_ENTITY_PERIDOT_CHEST,
            ModTileEntites.TILE_ENTITY_RUBY_FURNACE
    };

    // ----------------------

    public static final Set<Block> PAXEL_EFFECTIVE_ON = Sets.newHashSet(
            Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB,
            Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH
    );
}
