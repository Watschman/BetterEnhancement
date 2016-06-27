package com.watschman.betterenhancement.items;

import com.watschman.betterenhancement.client.creativetabs.CreativeTab;
import com.watschman.betterenhancement.reference.ArrayReference;
import com.watschman.betterenhancement.util.LogHelper;
import com.watschman.betterenhancement.util.RegistryHelper;
import net.minecraft.item.Item;


public class ItemInit {

    public static void init(){
        for (Item item : ArrayReference.MOD_ITEMS) {
            try {
                RegistryHelper.registerItem(item, item.getUnlocalizedName().substring(5), CreativeTab.BetterEnhancementTab);
                LogHelper.info("Registering Item: " + item.getUnlocalizedName().substring(5));
            }catch (Exception ex){
                LogHelper.fatal("There was a fatal Problem with the initialization from Item: " + item);
                ex.printStackTrace();
            }
        }
    }
}
