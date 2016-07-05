package com.watschman.betterenhancement.items.tools.goldinfuseddiamond;

import com.google.common.collect.ImmutableSet;
import com.watschman.betterenhancement.items.ModItems;
import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import com.watschman.betterenhancement.reference.ArrayReference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.Set;

public class GoldInfusedDiamondPaxel extends ItemPickaxe{
    public GoldInfusedDiamondPaxel() {
        super(ItemToolMaterial.GOLD_INFUSED_DIAMOND_TOOL);
        setUnlocalizedName("gold_infused_diamond_paxel");
        canRepair = true;
    }
    @Override
    public Set<String> getToolClasses(ItemStack stack){
        return ImmutableSet.of("pickaxe", "spade", "axe");
    }

    @Override
    public boolean canHarvestBlock(IBlockState blockIn){
        Block block = blockIn.getBlock();
        return ArrayReference.PAXEL_EFFECTIVE_ON.contains(block) || super.canHarvestBlock(blockIn);
    }

    @Override
    public float getStrVsBlock(ItemStack stack, IBlockState blockIn){
        Block block = blockIn.getBlock();
        if (blockIn.getMaterial() == Material.WOOD || blockIn.getMaterial() == Material.VINE || blockIn.getMaterial() == Material.PLANTS)
            return this.efficiencyOnProperMaterial;
        return ArrayReference.PAXEL_EFFECTIVE_ON.contains(block) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(stack, blockIn);
    }
}
