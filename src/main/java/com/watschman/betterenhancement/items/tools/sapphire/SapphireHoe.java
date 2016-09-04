package com.watschman.betterenhancement.items.tools.sapphire;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemHoe;

public class SapphireHoe extends ItemHoe{
    public SapphireHoe(String name) {
        super(ItemToolMaterial.SAPPHIRE_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
