package com.watschman.betterenhancement.proxy;

import com.watschman.betterenhancement.blocks.blockBase;
import com.watschman.betterenhancement.items.sampleItem;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        sampleItem.init();
        blockBase.init();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        sampleItem.registerRenders();
        blockBase.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
