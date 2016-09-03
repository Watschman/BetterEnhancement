package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RubyHoe extends ItemHoe{
    public RubyHoe(String name) {
        super(ItemToolMaterial.RUBY_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
