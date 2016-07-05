package com.watschman.betterenhancement.items.tools.goldinfuseddiamond;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class GoldInfusedDiamondShovel extends ItemSpade{
    public GoldInfusedDiamondShovel() {
        super(ItemToolMaterial.GOLD_INFUSED_DIAMOND_TOOL);
        setUnlocalizedName("gold_infused_diamond_shovel");
        canRepair = true;
    }
}
