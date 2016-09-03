package com.watschman.betterenhancement.items.armor.ruby;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class RubyHelmet extends ItemArmor{
    public RubyHelmet(String name) {
        super(ArmorToolMaterial.RUBY_ARMOR, 1, EntityEquipmentSlot.HEAD);
        setUnlocalizedName(name);
    }
}
