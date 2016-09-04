package com.watschman.betterenhancement.items.tools;

import com.watschman.betterenhancement.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemToolMaterial {
    public static Item.ToolMaterial GOLD_INFUSED_DIAMOND_TOOL = EnumHelper.addToolMaterial("GOLD_INFUSED_DIAMOND_TOOL", 3, 9999, 18.0F, 10.0F, 30).setRepairItem(new ItemStack(Items.DIAMOND));
    public static Item.ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial("RUBY_TOOL", 2, 750, 7.0F, 3.0F, 15).setRepairItem(new ItemStack(ModItems.RUBY));
    public static Item.ToolMaterial SAPPHIRE_TOOL = EnumHelper.addToolMaterial("SAPPHIRE_TOOL", 2, 750, 7.0F, 3.0F, 15).setRepairItem(new ItemStack(ModItems.SAPPHIRE));
    public static Item.ToolMaterial PERIDOT_TOOL = EnumHelper.addToolMaterial("PERIDOT_TOOL", 2, 750, 7.0F, 3.0F, 15).setRepairItem(new ItemStack(ModItems.PERIDOT));
}
