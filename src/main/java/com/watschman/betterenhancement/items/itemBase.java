package com.watschman.betterenhancement.items;

import com.watschman.betterenhancement.client.creativetabs.CreativeTab;
import com.watschman.betterenhancement.items.food.butter;
import com.watschman.betterenhancement.items.food.carrotApple;
import com.watschman.betterenhancement.items.gems.ruby;
import com.watschman.betterenhancement.items.misc.sampleItem;
import com.watschman.betterenhancement.items.tools.goldinfuseddiamond.*;
import com.watschman.betterenhancement.items.tools.ruby.rubyAxe;
import com.watschman.betterenhancement.items.tools.ruby.rubyPickaxe;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.util.RegistryHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class itemBase {


    public static Item sample_item = new sampleItem();
    public static Item carrot_apple = new carrotApple();
    public static Item butter = new butter();
    public static Item gold_infused_diamond_pickaxe = new goldInfusedDiamondPickaxe();
    public static Item gold_infused_diamond_axe = new goldInfusedDiamondAxe();
    public static Item gold_infused_diamond_shovel = new goldInfusedDiamondShovel();
    public static Item gold_infused_diamond_hoe = new goldInfusedDiamondHoe();
    public static Item gold_infused_diamond_sword = new goldInfusedDiamondSword();
    public static Item gold_infused_diamond_paxel = new goldInfusedDiamondPaxel();
    public static Item ruby = new ruby();
    public static Item ruby_pickaxe = new rubyPickaxe();
    public static Item ruby_axe = new rubyAxe();


    public static void init(){
        RegistryHelper.registerItem(sample_item, "sample_item", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(ruby, "ruby", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(gold_infused_diamond_pickaxe, "gold_infused_diamond_pickaxe", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(gold_infused_diamond_axe, "gold_infused_diamond_axe", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(gold_infused_diamond_shovel, "gold_infused_diamond_shovel", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(gold_infused_diamond_hoe, "gold_infused_diamond_hoe", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(gold_infused_diamond_sword, "gold_infused_diamond_sword", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(gold_infused_diamond_paxel, "gold_infused_diamond_paxel", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(carrot_apple, "carrot_apple", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(butter, "butter", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(ruby_pickaxe, "ruby_pickaxe", CreativeTab.BetterEnhancementTab);
        RegistryHelper.registerItem(ruby_axe, "ruby_axe", CreativeTab.BetterEnhancementTab);
    }


    public static void registerRenders(){
        registerRender(sample_item);
        registerRender(carrot_apple);
        registerRender(butter);
        registerRender(gold_infused_diamond_pickaxe);
        registerRender(gold_infused_diamond_axe);
        registerRender(gold_infused_diamond_shovel);
        registerRender(gold_infused_diamond_hoe);
        registerRender(gold_infused_diamond_sword);
        registerRender(gold_infused_diamond_paxel);
        registerRender(ruby);
        registerRender(ruby_pickaxe);
        registerRender(ruby_axe);
    }


    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
