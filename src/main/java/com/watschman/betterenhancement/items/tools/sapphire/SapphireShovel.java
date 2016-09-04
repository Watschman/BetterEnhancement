package com.watschman.betterenhancement.items.tools.sapphire;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemSpade;

public class SapphireShovel extends ItemSpade{
    public SapphireShovel(String name) {
        super(ItemToolMaterial.SAPPHIRE_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
