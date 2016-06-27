package com.watschman.betterenhancement.items.tools;

import com.watschman.betterenhancement.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemToolMaterial {
    public static Item.ToolMaterial GOLD_INFUSED_DIAMOND = EnumHelper.addToolMaterial("GOLD_INFUSED_DIAMOND", 3, 9999, 18.0F, 10.0F, 30).setRepairItem(new ItemStack(Items.DIAMOND));
    public static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 750, 7.0F, 3.0F, 15).setRepairItem(new ItemStack(ModItems.ruby));
}
