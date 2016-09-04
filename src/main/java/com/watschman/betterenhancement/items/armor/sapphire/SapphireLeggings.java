package com.watschman.betterenhancement.items.armor.sapphire;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class SapphireLeggings extends ItemArmor{
    public SapphireLeggings(String name) {
        super(ArmorToolMaterial.SAPPHIRE_ARMOR, 2, EntityEquipmentSlot.LEGS);
        setUnlocalizedName(name);
    }
}
