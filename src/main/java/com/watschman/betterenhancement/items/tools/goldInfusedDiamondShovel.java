package com.watschman.betterenhancement.items.tools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class goldInfusedDiamondShovel extends ItemSpade{
    public goldInfusedDiamondShovel() {
        super(itemToolMaterial.GOLD_INFUSED_DIAMOND);
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "xyx",
                "xzx",
                "xyx",
                'x', new ItemStack(Blocks.GOLD_BLOCK),
                'y', new ItemStack(Blocks.DIAMOND_BLOCK),
                'z', new ItemStack(Items.DIAMOND_SHOVEL)));
    }
}
