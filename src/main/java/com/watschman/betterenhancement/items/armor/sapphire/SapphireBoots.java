package com.watschman.betterenhancement.items.armor.sapphire;

import com.watschman.betterenhancement.items.armor.ArmorToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class SapphireBoots extends ItemArmor{
    public SapphireBoots(String name) {
        super(ArmorToolMaterial.SAPPHIRE_ARMOR, 1, EntityEquipmentSlot.FEET);
        setUnlocalizedName(name);
    }
}
