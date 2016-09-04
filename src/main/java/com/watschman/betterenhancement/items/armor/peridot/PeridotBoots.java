package com.watschman.betterenhancement.items.armor.peridot;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class PeridotBoots extends ItemArmor{
    public PeridotBoots(String name) {
        super(ArmorToolMaterial.PERIDOT_ARMOR, 1, EntityEquipmentSlot.FEET);
        setUnlocalizedName(name);
    }
}
