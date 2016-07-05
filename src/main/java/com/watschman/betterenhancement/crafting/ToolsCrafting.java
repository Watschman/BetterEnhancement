package com.watschman.betterenhancement.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.watschman.betterenhancement.items.ModItems.*;

class ToolsCrafting {
    static void registerGoldInfusedDiamondTools(){
        //AXE
        GameRegistry.addRecipe(new ShapedOreRecipe(GOLD_INFUSED_DIAMOND_AXE,
                "xyx",
                "xzx",
                "xyx",
                'x', new ItemStack(Blocks.GOLD_BLOCK),
                'y', new ItemStack(Blocks.DIAMOND_BLOCK),
                'z', new ItemStack(Items.DIAMOND_AXE)));
        //HOE
        GameRegistry.addRecipe(new ShapedOreRecipe(GOLD_INFUSED_DIAMOND_HOE,
                "xyx",
                "xzx",
                "xyx",
                'x', new ItemStack(Blocks.GOLD_BLOCK),
                'y', new ItemStack(Blocks.DIAMOND_BLOCK),
                'z', new ItemStack(Items.DIAMOND_HOE)));
        //PAXEL
        GameRegistry.addRecipe(new ShapedOreRecipe(GOLD_INFUSED_DIAMOND_PAXEL,
                "xyz",
                " a ",
                " a ",
                'a', new ItemStack(Blocks.GOLD_BLOCK),
                'x', new ItemStack(GOLD_INFUSED_DIAMOND_AXE),
                'y', new ItemStack(GOLD_INFUSED_DIAMOND_PICKAXE),
                'z', new ItemStack(GOLD_INFUSED_DIAMOND_SHOVEL)));
        //PICKAXE
        GameRegistry.addRecipe(new ShapedOreRecipe(GOLD_INFUSED_DIAMOND_PICKAXE,
                "xyx",
                "xzx",
                "xyx",
                'x', new ItemStack(Blocks.GOLD_BLOCK),
                'y', new ItemStack(Blocks.DIAMOND_BLOCK),
                'z', new ItemStack(Items.DIAMOND_PICKAXE)));
        //SHOVEL
        GameRegistry.addRecipe(new ShapedOreRecipe(GOLD_INFUSED_DIAMOND_SHOVEL,
                "xyx",
                "xzx",
                "xyx",
                'x', new ItemStack(Blocks.GOLD_BLOCK),
                'y', new ItemStack(Blocks.DIAMOND_BLOCK),
                'z', new ItemStack(Items.DIAMOND_SHOVEL)));
        //SWORD
        GameRegistry.addRecipe(new ShapedOreRecipe(GOLD_INFUSED_DIAMOND_SWORD,
                "xyx",
                "xzx",
                "xyx",
                'x', new ItemStack(Blocks.GOLD_BLOCK),
                'y', new ItemStack(Blocks.DIAMOND_BLOCK),
                'z', new ItemStack(Items.DIAMOND_SWORD)));
    }
    static void registerRubyTools(){
        //AXE
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_AXE,
                "xx ",
                "xy ",
                " y ",
                'x', "gemRuby",
                'y', "stickWood"));
        //HOE
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_HOE,
                "xx ",
                " y ",
                " y ",
                'x', "gemRuby",
                'y', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_HOE,
                " xx",
                " y ",
                " y ",
                'x', "gemRuby",
                'y', "stickWood"));
        //PICKAXE
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_PICKAXE,
                "xxx",
                " y ",
                " y ",
                'x', "gemRuby",
                'y', "stickWood"));
        //SHOVEL
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_SHOVEL,
                "x",
                "y",
                "y",
                'x', "gemRuby",
                'y', "stickWood"));
        //SWORD
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_SWORD,
                "x",
                "x",
                "y",
                'x', "gemRuby",
                'y', "stickWood"));
    }
}
