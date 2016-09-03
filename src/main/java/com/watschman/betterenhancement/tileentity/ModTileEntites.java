package com.watschman.betterenhancement.tileentity;

import com.watschman.betterenhancement.tileentity.furnaces.RubyFurnaceTileEntity;
import com.watschman.betterenhancement.tileentity.misc.SampleBlockTileEntity;
import com.watschman.betterenhancement.tileentity.storage.PeridotChestTileEntity;
import com.watschman.betterenhancement.tileentity.storage.RubyChestTileEntity;
import com.watschman.betterenhancement.tileentity.storage.SapphireChestTileEntity;
import net.minecraft.tileentity.TileEntity;

public class ModTileEntites {
    public static TileEntity TILE_ENTITY_RUBY_CHEST = new RubyChestTileEntity();
    public static TileEntity TILE_ENTITY_SAPPHIRE_CHEST = new SapphireChestTileEntity();
    public static TileEntity TILE_ENTITY_PERIDOT_CHEST = new PeridotChestTileEntity();
    public static TileEntity TILE_ENTITY_SAMPLE_BLOCK = new SampleBlockTileEntity();
    public static TileEntity TILE_ENTITY_RUBY_FURNACE = new RubyFurnaceTileEntity();
}
