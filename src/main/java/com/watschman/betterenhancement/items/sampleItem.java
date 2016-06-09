package com.watschman.betterenhancement.items;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class sampleItem {
    public static Item sample_item;
    public static void init(){
        sample_item = registerItem(new Item(), "sample_item").setUnlocalizedName("sample_item").setCreativeTab(CreativeTabs.COMBAT);
    }
    public static void  registerRenders(){
        registerRender(sample_item);
    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static Item registerItem(Item item, String name){
        return  registerItem(item, name, null);
    }
    public static Item registerItem(Item item, String name, CreativeTabs creativeTabs){
        GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, name));
        return item;
    }
}
