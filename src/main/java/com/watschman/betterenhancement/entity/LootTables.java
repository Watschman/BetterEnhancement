package com.watschman.betterenhancement.entity;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTables extends LootTableList{
    public static final ResourceLocation ENTITIES_RUBY_PIG = register("ruby_pig");
    public static final ResourceLocation ENTITIES_SAPPHIRE_PIG = register("sapphire_pig");
    public static final ResourceLocation ENTITIES_PERIDOT_PIG = register("peridot_pig");
    private static ResourceLocation register(String id){
        return register(new ResourceLocation(Reference.MOD_ID, id));
    }
}
