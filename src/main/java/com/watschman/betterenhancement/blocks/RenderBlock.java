package com.watschman.betterenhancement.blocks;

import com.watschman.betterenhancement.reference.ArrayReference;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.util.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RenderBlock {
    public static void registerRenders(){
        for (Block block : ArrayReference.MOD_BLOCKS){
            try {
                registerRender(block);
                LogHelper.info("registerRenders for Block: " + block.getClass().getSimpleName());
            }catch (Exception ex){
                LogHelper.fatal("There was an exception while registering the renders for Block: " + block.getClass().getSimpleName());
                LogHelper.fatal("Following exception has been detected: " + ex);
            }
        }
    }

    private static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
