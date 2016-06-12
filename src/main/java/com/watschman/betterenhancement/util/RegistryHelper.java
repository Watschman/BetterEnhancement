package com.watschman.betterenhancement.util;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHelper {
    public static void registerBlock(Block block, String name, CreativeTabs creativeTab){
        block.setRegistryName(Reference.MOD_ID, name).setCreativeTab(creativeTab).setUnlocalizedName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }
    public static void registerItem(Item item, String name, CreativeTabs creativeTab){
        item.setCreativeTab(creativeTab).setUnlocalizedName(name);
        GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, name));
    }
}
