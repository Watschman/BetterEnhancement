package com.watschman.betterenhancement.crafting;

import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

class AlterVanillaBehaviorCrafting {
    static void registerBread(){
        //Add Barley to Bread
        GameRegistry.addRecipe(new ShapedOreRecipe(Items.BREAD,
                "xxx",
                'x', "cropBarley"
        ));
    }
}
