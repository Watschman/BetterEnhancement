package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RubyPickaxe extends ItemPickaxe{
    public RubyPickaxe(String name) {
        super(ItemToolMaterial.RUBY_TOOL);
        setUnlocalizedName(name);
        canRepair = true;
    }
}
