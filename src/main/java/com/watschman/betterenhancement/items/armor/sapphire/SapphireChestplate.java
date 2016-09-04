package com.watschman.betterenhancement.items.armor.sapphire;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class SapphireChestplate extends ItemArmor{
    public SapphireChestplate(String name) {
        super(ArmorToolMaterial.SAPPHIRE_ARMOR, 1, EntityEquipmentSlot.CHEST);
        setUnlocalizedName(name);
    }
}
