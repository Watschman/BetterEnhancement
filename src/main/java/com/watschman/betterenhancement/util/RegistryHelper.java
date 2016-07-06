package com.watschman.betterenhancement.util;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHelper {
    public static void registerBlock(Block block, String name, CreativeTabs creativeTab){
        block.setRegistryName(Reference.MOD_ID, name).setCreativeTab(creativeTab);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }
    public static void registerItem(Item item, String name, CreativeTabs creativeTab){
        item.setCreativeTab(creativeTab);
        GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, name));
    }
    public static void registerTileEntity(TileEntity tileEntity, String name){
        GameRegistry.registerTileEntity(tileEntity.getClass(), name);
    }
}
