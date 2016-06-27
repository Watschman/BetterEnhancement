package com.watschman.betterenhancement.items;

import com.watschman.betterenhancement.reference.ArrayReference;
import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RenderItems {
    public static void registerRenders(){
        for (Item item : ArrayReference.MOD_ITEMS){
            registerRender(item);
        }
    }


    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
