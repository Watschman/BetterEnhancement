package com.watschman.betterenhancement;

import com.watschman.betterenhancement.proxy.IProxy;
import com.watschman.betterenhancement.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.MOD_NAME)
public class BetterEnhancement
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance
    public static BetterEnhancement instance;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    }
}
