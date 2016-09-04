package com.watschman.betterenhancement.items.tools.peridot;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemSword;

public class PeridotSword extends ItemSword{
    public PeridotSword(String name) {
        super(ItemToolMaterial.PERIDOT_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
