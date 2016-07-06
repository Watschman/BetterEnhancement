package com.watschman.betterenhancement.items;

import com.watschman.betterenhancement.reference.ArrayReference;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.util.LogHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RenderItems {
    public static void registerRenders(){
        for (Item item : ArrayReference.MOD_ITEMS){
            try {
                registerRender(item);
                LogHelper.info("registerRenders for Item: " + item.getClass().getSimpleName());
            }catch (Exception ex){
                LogHelper.fatal("There was an exception while registering the renders for Item: " + item.getClass().getSimpleName());
                ex.printStackTrace();
            }
        }
    }


    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
