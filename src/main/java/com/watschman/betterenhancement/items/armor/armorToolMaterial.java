package com.watschman.betterenhancement.items.armor;

import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorToolMaterial {
    public static ItemArmor.ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial("RUBY_ARMOR", Reference.MOD_ID + ":" + "ruby", 25, new int[] {3, 4, 6, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static ItemArmor.ArmorMaterial SAPPHIRE_ARMOR = EnumHelper.addArmorMaterial("SAPPHIRE_ARMOR", Reference.MOD_ID + ":" + "sapphire", 25, new int[] {3, 4, 6, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static ItemArmor.ArmorMaterial PERIDOT_ARMOR = EnumHelper.addArmorMaterial("PERIDOT_ARMOR", Reference.MOD_ID + ":" + "peridot", 25, new int[] {3, 4, 6, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
}
