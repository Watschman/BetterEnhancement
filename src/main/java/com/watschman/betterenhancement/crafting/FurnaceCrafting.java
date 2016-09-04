package com.watschman.betterenhancement.crafting;

import com.watschman.betterenhancement.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

class FurnaceCrafting {
    static void registerFurnaces(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.RUBY_FURNACE),
                "xxx",
                "xyx",
                "xxx",
                'x', "gemRuby",
                'y', new ItemStack(Blocks.FURNACE)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SAPPHIRE_FURNACE),
                "xxx",
                "xyx",
                "xxx",
                'x', "gemSapphire",
                'y', new ItemStack(Blocks.FURNACE)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.PERIDOT_FURNACE),
                "xxx",
                "xyx",
                "xxx",
                'x', "gemPeridot",
                'y', new ItemStack(Blocks.FURNACE)));
    }
}
