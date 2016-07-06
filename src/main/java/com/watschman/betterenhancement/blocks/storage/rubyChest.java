package com.watschman.betterenhancement.blocks.storage;

import com.watschman.betterenhancement.tileentity.storage.RubyChestTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;

import static net.minecraft.util.EnumBlockRenderType.MODEL;

public class RubyChest extends BlockContainer{
    public RubyChest() {
        super(Material.ROCK);
        setUnlocalizedName("ruby_chest");
        setHarvestLevel("pickaxe", 1);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new RubyChestTileEntity();
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return MODEL;
    }
}
