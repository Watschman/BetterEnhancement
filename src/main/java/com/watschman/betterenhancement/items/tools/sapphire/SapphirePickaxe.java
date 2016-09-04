package com.watschman.betterenhancement.items.tools.sapphire;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class SapphirePickaxe extends ItemPickaxe{
    public SapphirePickaxe(String name) {
        super(ItemToolMaterial.SAPPHIRE_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
