package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RubySword extends ItemSword{
    public RubySword() {
        super(ItemToolMaterial.RUBY_TOOL);
        setUnlocalizedName("ruby_sword");
        canRepair = true;
    }
}
