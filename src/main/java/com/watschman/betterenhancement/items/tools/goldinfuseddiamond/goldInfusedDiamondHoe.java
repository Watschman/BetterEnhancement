package com.watschman.betterenhancement.items.tools.goldinfuseddiamond;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class GoldInfusedDiamondHoe extends ItemHoe{
    public GoldInfusedDiamondHoe(String name) {
        super(ItemToolMaterial.GOLD_INFUSED_DIAMOND_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
