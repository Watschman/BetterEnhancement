package com.watschman.betterenhancement.items.armor.ruby;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class RubyBoots extends ItemArmor{
    public RubyBoots(String name) {
        super(ArmorToolMaterial.RUBY_ARMOR, 1, EntityEquipmentSlot.FEET);
        setUnlocalizedName(name);
    }
}
