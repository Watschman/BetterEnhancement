package com.watschman.betterenhancement.items.tools.peridot;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class PeridotPickaxe extends ItemPickaxe{
    public PeridotPickaxe(String name) {
        super(ItemToolMaterial.PERIDOT_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
