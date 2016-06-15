package com.watschman.betterenhancement.items.tools.goldinfuseddiamond;

import com.google.common.collect.Sets;
import com.watschman.betterenhancement.items.itemBase;
import com.watschman.betterenhancement.items.tools.itemToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.Set;

public class goldInfusedDiamondPaxel extends ItemTool{
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(
            Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE,
            Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.WOODEN_SLAB,
            Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.OBSIDIAN
            );
    public goldInfusedDiamondPaxel() {
        super(1.0F, -2.8F, itemToolMaterial.GOLD_INFUSED_DIAMOND, EFFECTIVE_ON);
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "xyz",
                " a ",
                " a ",
                'a', new ItemStack(Blocks.GOLD_BLOCK),
                'x', new ItemStack(itemBase.gold_infused_diamond_axe),
                'y', new ItemStack(itemBase.gold_infused_diamond_pickaxe),
                'z', new ItemStack(itemBase.gold_infused_diamond_shovel)));
    }
    public boolean canHarvestBlock(IBlockState blockin){
        return true;
    }
}
