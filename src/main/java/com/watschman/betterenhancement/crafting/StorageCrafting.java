package com.watschman.betterenhancement.crafting;

import com.watschman.betterenhancement.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

class StorageCrafting {
    static void registerStorage(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.RUBY_CHEST),
                "xxx",
                "xyx",
                "xxx",
                'x', "gemRuby",
                'y', new ItemStack(Blocks.CHEST)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.SAPPHIRE_CHEST),
                "xxx",
                "xyx",
                "xxx",
                'x', "gemSapphire",
                'y', new ItemStack(Blocks.CHEST)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.GREEN_SAPPHIRE_CHEST),
                "xxx",
                "xyx",
                "xxx",
                'x', "gemGreenSapphire",
                'y', new ItemStack(Blocks.CHEST)));
    }
}
