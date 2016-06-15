package com.watschman.betterenhancement.items.tools;

import com.watschman.betterenhancement.items.itemBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class itemToolMaterial {
    public static Item.ToolMaterial GOLD_INFUSED_DIAMOND = EnumHelper.addToolMaterial("GOLD_INFUSED_DIAMOND", 3, 9999, 18.0F, 10.0F, 22).setRepairItem(new ItemStack(Items.DIAMOND));
    public static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 2, 750, 8.0F, 5.0F, 11).setRepairItem(new ItemStack(itemBase.ruby));
}
