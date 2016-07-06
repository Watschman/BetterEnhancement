package com.watschman.betterenhancement.tileentity;

import com.watschman.betterenhancement.reference.ArrayReference;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.util.LogHelper;
import com.watschman.betterenhancement.util.RegistryHelper;
import net.minecraft.tileentity.TileEntity;

public class TileEntityInit {
    public static void init(){
        for(TileEntity tile : ArrayReference.MOD_TILE_ENTITIES){
            try {
                LogHelper.info("Registering TileEntity: " + tile.getClass().getSimpleName());
                RegistryHelper.registerTileEntity(tile, Reference.MOD_ID + ":" + tile.getClass().getSimpleName());
            }catch (Exception ex){
                LogHelper.fatal("There was an Exception during the initialization from TileEntity: " + tile.getClass().getSimpleName());
                ex.printStackTrace();
            }
        }
    }
}
