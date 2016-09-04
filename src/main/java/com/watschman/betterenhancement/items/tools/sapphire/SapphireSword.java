package com.watschman.betterenhancement.items.tools.sapphire;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemSword;

public class SapphireSword extends ItemSword{
    public SapphireSword(String name) {
        super(ItemToolMaterial.SAPPHIRE_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
