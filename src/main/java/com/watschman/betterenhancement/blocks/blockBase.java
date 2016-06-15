package com.watschman.betterenhancement.blocks;

import com.watschman.betterenhancement.blocks.misc.sampleBlock;
import com.watschman.betterenhancement.blocks.ore.rubyOre;
import com.watschman.betterenhancement.client.creativetabs.CreativeTab;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.util.RegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class blockBase {

    public static Block sample_Block= new sampleBlock();
    public static Block ruby_ore = new rubyOre();

    public static void init(){

        RegistryHelper.registerBlock(sample_Block, "sample_block", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerBlock(ruby_ore, "ruby_ore", CreativeTab.BetterEnhancementTab);
    }

    public static void registerRenders(){

        registerRender(sample_Block);
        registerRender(ruby_ore);
    }


    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
