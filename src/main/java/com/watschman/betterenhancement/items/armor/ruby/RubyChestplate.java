package com.watschman.betterenhancement.items.armor.ruby;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class RubyChestplate extends ItemArmor{
    public RubyChestplate() {
        super(ArmorToolMaterial.RUBY_ARMOR, 1, EntityEquipmentSlot.CHEST);
        setUnlocalizedName("ruby_chestplate");
    }
}
