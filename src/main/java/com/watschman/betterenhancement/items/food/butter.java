package com.watschman.betterenhancement.items.food;

import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Butter extends ItemFood {
    private static int heal_amount = 3;
    private static float saturation = 6F;
    private static boolean isWolfFood = false;
    public Butter(String name){
        super(heal_amount, saturation, isWolfFood);
        setUnlocalizedName(name);
    }
}
