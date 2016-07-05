package com.watschman.betterenhancement.items.armor.ruby;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class RubyLeggings extends ItemArmor{
    public RubyLeggings() {
        super(ArmorToolMaterial.RUBY_ARMOR, 2, EntityEquipmentSlot.LEGS);
        setUnlocalizedName("ruby_leggings");
    }
}
