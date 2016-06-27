package com.watschman.betterenhancement.items.food;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CarrotApple extends ItemFood {
    private static int heal_amount = 10;
    private static float saturation = 12F;
    private static boolean isWolfFood = false;
    public CarrotApple(){
        super(heal_amount, saturation, isWolfFood);
        setUnlocalizedName("carrot_apple");
        setMaxStackSize(32);
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                " x ",
                "xyx",
                " x ",
                'x', "cropCarrot",
                'y', new ItemStack(Items.APPLE)
                ));
    }
}
