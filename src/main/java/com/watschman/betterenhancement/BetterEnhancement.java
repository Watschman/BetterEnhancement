package com.watschman.betterenhancement;

import com.watschman.betterenhancement.handler.ConfigurationHandler;
import com.watschman.betterenhancement.handler.OreGenHandler;
import com.watschman.betterenhancement.proxy.IProxy;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.server.BetterEnhancementCommand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

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
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        MinecraftForge.EVENT_BUS.register(ConfigurationHandler.INSTANCE);
        proxy.preInit(event);
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        OreGenHandler.init();
    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event){
        proxy.isSinglePlayer();
        event.registerServerCommand(new BetterEnhancementCommand());
    }
}
