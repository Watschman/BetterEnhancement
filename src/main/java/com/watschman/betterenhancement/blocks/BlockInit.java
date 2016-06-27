package com.watschman.betterenhancement.blocks;

import com.watschman.betterenhancement.client.creativetabs.CreativeTab;
import com.watschman.betterenhancement.reference.ArrayReference;
import com.watschman.betterenhancement.util.LogHelper;
import com.watschman.betterenhancement.util.RegistryHelper;
import net.minecraft.block.Block;

public class BlockInit {
    public static void init(){
        for (Block block : ArrayReference.MOD_BLOCKS){
            try {
                RegistryHelper.registerBlock(block, block.getUnlocalizedName().substring(5), CreativeTab.BetterEnhancementTab);
                LogHelper.info("Registering Block: " + block.getUnlocalizedName().substring(5));
            }catch (Exception ex){
                LogHelper.fatal("There was a fatal Problem with the initialization from Block: " + block);
                ex.printStackTrace();
            }
        }

    }
}
