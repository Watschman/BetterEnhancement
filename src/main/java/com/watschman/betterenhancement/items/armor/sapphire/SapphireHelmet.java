package com.watschman.betterenhancement.items.armor.sapphire;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class SapphireHelmet extends ItemArmor{
    public SapphireHelmet(String name) {
        super(ArmorToolMaterial.SAPPHIRE_ARMOR, 1, EntityEquipmentSlot.HEAD);
        setUnlocalizedName(name);
    }
}
