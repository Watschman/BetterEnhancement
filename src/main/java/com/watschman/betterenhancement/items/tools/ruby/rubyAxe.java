package com.watschman.betterenhancement.items.tools.ruby;

import com.google.common.collect.Sets;
import com.watschman.betterenhancement.items.tools.itemToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.Set;

public class rubyAxe extends ItemTool{
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB);
    public rubyAxe() {
        super(1.0F, -2.6F, itemToolMaterial.RUBY, EFFECTIVE_ON);
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "xx ",
                "xy ",
                " y ",
                'x', "gemRuby",
                'y', "stickWood"
        ));
    }
}
