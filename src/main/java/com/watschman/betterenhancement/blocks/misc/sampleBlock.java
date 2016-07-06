package com.watschman.betterenhancement.blocks.misc;

import com.watschman.betterenhancement.tileentity.misc.SampleBlockTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class SampleBlock extends Block implements ITileEntityProvider{
    public SampleBlock() {
        super(Material.ROCK);
        setUnlocalizedName("sample_block");
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new SampleBlockTileEntity();
    }
}
