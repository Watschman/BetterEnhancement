package com.watschman.betterenhancement.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.watschman.betterenhancement.items.ModItems.*;

class ArmorCrafting {
    static void registerRubyArmor(){
        //HELMET
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_HELMET,
                "xxx",
                "x x",
                'x', "gemRuby"));
        //CHESTPLATE
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_CHESTPLATE,
                "x x",
                "xxx",
                "xxx",
                'x', "gemRuby"));
        //LEGGINGS
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_LEGGINGS,
                "xxx",
                "x x",
                "x x",
                'x', "gemRuby"));
        //BOOTS
        GameRegistry.addRecipe(new ShapedOreRecipe(RUBY_BOOTS,
                "x x",
                "x x",
                'x', "gemRuby"));
    }
    static void registerSapphireArmor(){
        //HELMET
        GameRegistry.addRecipe(new ShapedOreRecipe(SAPPHIRE_HELMET,
                "xxx",
                "x x",
                'x', "gemSapphire"));
        //CHESTPLATE
        GameRegistry.addRecipe(new ShapedOreRecipe(SAPPHIRE_CHESTPLATE,
                "x x",
                "xxx",
                "xxx",
                'x', "gemSapphire"));
        //LEGGINGS
        GameRegistry.addRecipe(new ShapedOreRecipe(SAPPHIRE_LEGGINGS,
                "xxx",
                "x x",
                "x x",
                'x', "gemSapphire"));
        //BOOTS
        GameRegistry.addRecipe(new ShapedOreRecipe(SAPPHIRE_BOOTS,
                "x x",
                "x x",
                'x', "gemSapphire"));
    }
    static void registerPeridotArmor(){
        //HELMET
        GameRegistry.addRecipe(new ShapedOreRecipe(PERIDOT_HELMET,
                "xxx",
                "x x",
                'x', "gemPeridot"));
        //CHESTPLATE
        GameRegistry.addRecipe(new ShapedOreRecipe(PERIDOT_CHESTPLATE,
                "x x",
                "xxx",
                "xxx",
                'x', "gemPeridot"));
        //LEGGINGS
        GameRegistry.addRecipe(new ShapedOreRecipe(PERIDOT_LEGGINGS,
                "xxx",
                "x x",
                "x x",
                'x', "gemPeridot"));
        //BOOTS
        GameRegistry.addRecipe(new ShapedOreRecipe(PERIDOT_BOOTS,
                "x x",
                "x x",
                'x', "gemPeridot"));
    }
}
