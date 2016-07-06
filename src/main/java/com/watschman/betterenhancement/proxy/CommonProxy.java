package com.watschman.betterenhancement.proxy;

import com.watschman.betterenhancement.blocks.BlockInit;
import com.watschman.betterenhancement.items.ItemInit;
import com.watschman.betterenhancement.tileentity.TileEntityInit;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy implements IProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ItemInit.init();
        BlockInit.init();
        TileEntityInit.init();
    }

    @Override
    public void init(FMLInitializationEvent event) {
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
    }

    @Override
    public void isSinglePlayer() {

    }
}
