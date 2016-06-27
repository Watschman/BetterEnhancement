package com.watschman.betterenhancement.client.creativetabs;

import com.watschman.betterenhancement.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab {
    public static CreativeTabs BetterEnhancementTab = new CreativeTabs("better_enhancement_tab") {
        @Override
        public Item getTabIconItem() {
            return ModItems.sample_item;
        }
    };
}
