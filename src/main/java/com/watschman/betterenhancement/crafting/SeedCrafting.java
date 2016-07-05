package com.watschman.betterenhancement.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.watschman.betterenhancement.items.ModItems.*;

class SeedCrafting {
    static void registerSeeds(){
        GameRegistry.addRecipe(new ShapelessOreRecipe(BARLEY_SEED,
                "cropBarley"));
    }
}
