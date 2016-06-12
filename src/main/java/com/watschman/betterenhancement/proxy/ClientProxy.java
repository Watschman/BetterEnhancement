package com.watschman.betterenhancement.proxy;

import com.watschman.betterenhancement.blocks.blockBase;
import com.watschman.betterenhancement.items.itemBase;
import com.watschman.betterenhancement.reference.Reference;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        itemBase.init();
        blockBase.init();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        itemBase.registerRenders();
        blockBase.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public void isSinglePlayer() {
        Reference.isSinglePlayer = true;
    }
}
