package com.watschman.betterenhancement.blocks;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class sampleBlock extends Block{
    public sampleBlock() {
        super(Material.ROCK);
        setRegistryName(Reference.MOD_ID, "sample_block");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}
