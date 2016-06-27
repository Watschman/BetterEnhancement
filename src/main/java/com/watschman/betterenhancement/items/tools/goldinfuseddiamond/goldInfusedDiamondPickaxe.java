package com.watschman.betterenhancement.items.tools.goldinfuseddiamond;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class GoldInfusedDiamondPickaxe extends ItemPickaxe{
    public GoldInfusedDiamondPickaxe() {
        super(ItemToolMaterial.GOLD_INFUSED_DIAMOND);
        setUnlocalizedName("gold_infused_diamond_pickaxe");
        canRepair = true;
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "xyx",
                "xzx",
                "xyx",
                'x', new ItemStack(Blocks.GOLD_BLOCK),
                'y', new ItemStack(Blocks.DIAMOND_BLOCK),
                'z', new ItemStack(Items.DIAMOND_PICKAXE)));
    }
}
