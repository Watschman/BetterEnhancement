package com.watschman.betterenhancement.items.armor.peridot;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class PeridotLeggings extends ItemArmor{
    public PeridotLeggings(String name) {
        super(ArmorToolMaterial.PERIDOT_ARMOR, 2, EntityEquipmentSlot.LEGS);
        setUnlocalizedName(name);
    }
}
