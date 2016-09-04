package com.watschman.betterenhancement.items.armor.peridot;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class PeridotChestplate extends ItemArmor{
    public PeridotChestplate(String name) {
        super(ArmorToolMaterial.PERIDOT_ARMOR, 1, EntityEquipmentSlot.CHEST);
        setUnlocalizedName(name);
    }
}
