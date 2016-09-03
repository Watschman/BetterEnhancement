package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RubyShovel extends ItemSpade{
    public RubyShovel(String name) {
        super(ItemToolMaterial.RUBY_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
