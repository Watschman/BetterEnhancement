package com.watschman.betterenhancement.crafting;

import static com.watschman.betterenhancement.items.ModItems.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

class FoodCrafting {
    static void registerFood(){
        //BUTTER
        GameRegistry.addRecipe(new ShapelessOreRecipe(BUTTER,
                "cropWheat", new ItemStack(Items.MILK_BUCKET)));
        GameRegistry.addRecipe(new ShapelessOreRecipe(BUTTER,
                "cropBarley", new ItemStack(Items.MILK_BUCKET)));
        //CARROT_APPLE
        GameRegistry.addRecipe(new ShapedOreRecipe(CARROT_APPLE,
                " x ",
                "xyx",
                " x ",
                'x', "cropCarrot",
                'y', new ItemStack(Items.APPLE)));
    }
}
