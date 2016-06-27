package com.watschman.betterenhancement.blocks.storage;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class RubyChest extends Block{
    public RubyChest() {
        super(Material.ROCK);
        setUnlocalizedName("ruby_chest");
    }
}
