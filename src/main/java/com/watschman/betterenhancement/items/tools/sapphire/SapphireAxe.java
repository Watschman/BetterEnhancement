package com.watschman.betterenhancement.items.tools.sapphire;

import com.google.common.collect.Sets;
import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class SapphireAxe extends ItemTool{
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB);
    public SapphireAxe(String name) {
        super(1.0F, -2.6F, ItemToolMaterial.SAPPHIRE_TOOL, EFFECTIVE_ON);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
