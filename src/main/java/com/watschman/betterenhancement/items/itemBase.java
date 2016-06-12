package com.watschman.betterenhancement.items;

import com.watschman.betterenhancement.items.food.carrotApple;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.util.RegistryHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemBase {
    public static sampleItem sample_item = new sampleItem();
    public static carrotApple carrot_apple = new carrotApple();
    public static void init(){
        RegistryHelper.registerItem(sample_item, "sample_item", CreativeTabs.DECORATIONS);
        RegistryHelper.registerItem(carrot_apple, "carrot_apple", CreativeTabs.FOOD);
    }
    public static void registerRenders(){
        registerRender(sample_item);
        registerRender(carrot_apple);
    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
