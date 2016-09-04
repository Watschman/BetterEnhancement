package com.watschman.betterenhancement.items.tools.peridot;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemSpade;

public class PeridotShovel extends ItemSpade{
    public PeridotShovel(String name) {
        super(ItemToolMaterial.PERIDOT_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
