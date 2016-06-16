package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.itemToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class rubyShovel extends ItemSpade{
    public rubyShovel() {
        super(itemToolMaterial.RUBY);
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "x",
                "y",
                "y",
                'x', "gemRuby",
                'y', "stickWood"
        ));
    }
}
