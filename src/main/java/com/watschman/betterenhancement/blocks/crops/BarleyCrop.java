package com.watschman.betterenhancement.blocks.crops;

import com.watschman.betterenhancement.items.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BarleyCrop extends BlockCrops{
    public BarleyCrop(){
        setUnlocalizedName("barley_crop");
    }

    @Override
    protected Item getSeed() {
        return ModItems.BARLEY_SEED;
    }

    @Override
    protected Item getCrop() {
        return ModItems.BARLEY;
    }
}
