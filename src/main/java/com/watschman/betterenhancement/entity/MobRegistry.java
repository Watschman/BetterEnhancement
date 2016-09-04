package com.watschman.betterenhancement.entity;

import com.watschman.betterenhancement.BetterEnhancement;
import com.watschman.betterenhancement.entity.models.ModelPig;
import com.watschman.betterenhancement.entity.passive.EntityPeridotPig;
import com.watschman.betterenhancement.entity.passive.EntityRubyPig;
import com.watschman.betterenhancement.entity.passive.EntitySapphirePig;
import com.watschman.betterenhancement.entity.renderers.RenderPeridotPig;
import com.watschman.betterenhancement.entity.renderers.RenderRubyPig;
import com.watschman.betterenhancement.entity.renderers.RenderSapphirePig;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@SuppressWarnings("deprecation")
public class MobRegistry {
    public static void register(){
        registerRender();
        registerEntity();
    }
    public static void registerRender(){
        RenderingRegistry.registerEntityRenderingHandler(EntitySapphirePig.class, new RenderSapphirePig(Minecraft.getMinecraft().getRenderManager(), new ModelPig(0.5F), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRubyPig.class, new RenderRubyPig(Minecraft.getMinecraft().getRenderManager(), new ModelPig(0.5F), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPeridotPig.class, new RenderPeridotPig(Minecraft.getMinecraft().getRenderManager(), new ModelPig(0.5F), 0.5F));
    }
    public static void registerEntity(){
        EntityRegistry.registerModEntity(EntitySapphirePig.class, "sapphire_pig", 50248, BetterEnhancement.instance, 64, 1, true, 0x17D7D7, 0x1013F3);
        EntityRegistry.registerModEntity(EntityRubyPig.class, "ruby_pig", 50249, BetterEnhancement.instance, 64, 1, true, 0xFF8E8E, 0xFF0000);
        EntityRegistry.registerModEntity(EntityPeridotPig.class, "peridot_pig", 50250, BetterEnhancement.instance, 64, 1, true, 0x9FF184, 0x4FE51D);

        EntityRegistry.addSpawn(EntitySapphirePig.class, 10, 1, 6, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS));
        EntityRegistry.addSpawn(EntityRubyPig.class, 10, 1, 6, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS));
        EntityRegistry.addSpawn(EntityPeridotPig.class, 10, 1, 6, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS));
    }
}
