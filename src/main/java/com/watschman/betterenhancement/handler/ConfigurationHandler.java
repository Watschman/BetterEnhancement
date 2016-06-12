package com.watschman.betterenhancement.handler;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {
    public static final ConfigurationHandler INSTANCE = new ConfigurationHandler();
    public static Configuration configuration;

    public static void init(File configFile){
        if (configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    public static void loadConfiguration(){
        boolean ex = configuration.getBoolean("Test", Configuration.CATEGORY_GENERAL, true, "A Test Value for the configuration File");
        if (configuration.hasChanged())
            configuration.save();
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
            loadConfiguration();
    }
}
