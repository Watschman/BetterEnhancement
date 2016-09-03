package com.watschman.betterenhancement.items.seeds;

import com.watschman.betterenhancement.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class BarleySeed extends ItemSeeds{
    public BarleySeed(String name) {
        super(ModBlocks.BARLEY_CROP, Blocks.FARMLAND);
        setUnlocalizedName(name);
    }
}
