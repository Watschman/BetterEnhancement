package com.watschman.betterenhancement.items.tools.ruby;

import com.google.common.collect.Sets;
import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.Set;

public class RubyAxe extends ItemTool{
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB);
    public RubyAxe(String name) {
        super(1.0F, -2.6F, ItemToolMaterial.RUBY_TOOL, EFFECTIVE_ON);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
