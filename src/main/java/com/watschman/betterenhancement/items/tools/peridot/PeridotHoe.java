package com.watschman.betterenhancement.items.tools.peridot;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemHoe;

public class PeridotHoe extends ItemHoe{
    public PeridotHoe(String name) {
        super(ItemToolMaterial.PERIDOT_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
