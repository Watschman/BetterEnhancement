package com.watschman.betterenhancement.proxy;

import com.watschman.betterenhancement.blocks.blockBase;
import com.watschman.betterenhancement.items.itemBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy implements IProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        itemBase.init();
        blockBase.init();
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
