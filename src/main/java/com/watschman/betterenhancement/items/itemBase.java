package com.watschman.betterenhancement.items;

import com.watschman.betterenhancement.items.food.butter;
import com.watschman.betterenhancement.items.food.carrotApple;
import com.watschman.betterenhancement.items.tools.*;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.util.RegistryHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itemBase {
    public static sampleItem sample_item = new sampleItem();
    public static carrotApple carrot_apple = new carrotApple();
    public static butter butter = new butter();
    public static goldInfusedDiamondPickaxe gold_infused_diamond_pickaxe = new goldInfusedDiamondPickaxe();
//    public static goldInfusedDiamondAxe gold_infused_diamond_axe = new goldInfusedDiamondAxe();
    public static goldInfusedDiamondShovel gold_infused_diamond_shovel = new goldInfusedDiamondShovel();
    public static goldInfusedDiamondHoe gold_infused_diamond_hoe = new goldInfusedDiamondHoe();
    public static goldInfusedDiamondSword gold_infused_diamond_sword = new goldInfusedDiamondSword();

    public static void init(){
        RegistryHelper.registerItem(sample_item, "sample_item", CreativeTabs.DECORATIONS);
        RegistryHelper.registerItem(gold_infused_diamond_pickaxe, "gold_infused_diamond_pickaxe", CreativeTabs.TOOLS);
  //      RegistryHelper.registerItem(gold_infused_diamond_axe, "gold_infused_diamond_axe", CreativeTabs.TOOLS);
        RegistryHelper.registerItem(gold_infused_diamond_shovel, "gold_infused_diamond_shovel", CreativeTabs.TOOLS);
        RegistryHelper.registerItem(gold_infused_diamond_hoe, "gold_infused_diamond_hoe", CreativeTabs.TOOLS);
        RegistryHelper.registerItem(gold_infused_diamond_sword, "gold_infused_diamond_sword", CreativeTabs.COMBAT);
        RegistryHelper.registerItem(carrot_apple, "carrot_apple", CreativeTabs.FOOD);
        RegistryHelper.registerItem(butter, "butter", CreativeTabs.FOOD);
    }
    public static void registerRenders(){
        registerRender(sample_item);
        registerRender(carrot_apple);
        registerRender(butter);
        registerRender(gold_infused_diamond_pickaxe);
    //    registerRender(gold_infused_diamond_axe);
        registerRender(gold_infused_diamond_shovel);
        registerRender(gold_infused_diamond_hoe);
        registerRender(gold_infused_diamond_sword);
    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
