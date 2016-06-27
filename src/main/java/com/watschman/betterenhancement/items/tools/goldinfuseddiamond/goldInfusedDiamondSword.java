package com.watschman.betterenhancement.items.tools.goldinfuseddiamond;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class GoldInfusedDiamondSword extends ItemSword{
    public GoldInfusedDiamondSword() {
        super(ItemToolMaterial.GOLD_INFUSED_DIAMOND);
        setUnlocalizedName("gold_infused_diamond_sword");
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "xyx",
                "xzx",
                "xyx",
                'x', new ItemStack(Blocks.GOLD_BLOCK),
                'y', new ItemStack(Blocks.DIAMOND_BLOCK),
                'z', new ItemStack(Items.DIAMOND_SWORD)));
    }
}
