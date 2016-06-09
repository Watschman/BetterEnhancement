package com.watschman.betterenhancement.blocks;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class blockBase {
    public static sampleBlock sample_Block;
    public static void init(){
        sample_Block = new sampleBlock();
        sample_Block.setUnlocalizedName("sample_block").setCreativeTab(CreativeTabs.COMBAT);
    }
    public static void registerRenders(){
        registerRender(sample_Block);
    }
    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
