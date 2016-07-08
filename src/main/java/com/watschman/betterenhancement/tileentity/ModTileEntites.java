package com.watschman.betterenhancement.tileentity;

import com.watschman.betterenhancement.tileentity.misc.SampleBlockTileEntity;
import com.watschman.betterenhancement.tileentity.storage.GreenSapphireChestTileEntity;
import com.watschman.betterenhancement.tileentity.storage.RubyChestTileEntity;
import com.watschman.betterenhancement.tileentity.storage.SapphireChestTileEntity;
import net.minecraft.tileentity.TileEntity;

public class ModTileEntites {
    public static TileEntity TILE_ENTITY_RUBY_CHEST = new RubyChestTileEntity();
    public static TileEntity TILE_ENTITY_SAPPHIRE_CHEST = new SapphireChestTileEntity();
    public static TileEntity TILE_ENTITY_GREEN_SAPPHIRE_CHEST = new GreenSapphireChestTileEntity();
    public static TileEntity TILE_ENTITY_SAMPLE_BLOCK = new SampleBlockTileEntity();
}
