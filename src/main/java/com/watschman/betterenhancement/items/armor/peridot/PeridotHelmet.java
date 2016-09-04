package com.watschman.betterenhancement.items.armor.peridot;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class PeridotHelmet extends ItemArmor{
    public PeridotHelmet(String name) {
        super(ArmorToolMaterial.PERIDOT_ARMOR, 1, EntityEquipmentSlot.HEAD);
        setUnlocalizedName(name);
    }
}
