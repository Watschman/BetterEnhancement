package com.watschman.betterenhancement.proxy;

import com.watschman.betterenhancement.blocks.RenderBlock;
import com.watschman.betterenhancement.items.RenderItems;
import com.watschman.betterenhancement.reference.Reference;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        RenderItems.registerRenders();
        RenderBlock.registerRenders();
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
