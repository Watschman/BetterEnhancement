package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.itemToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class rubyHoe extends ItemHoe{
    public rubyHoe() {
        super(itemToolMaterial.RUBY);
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "xx ",
                " y ",
                " y ",
                'x', "gemRuby",
                'y', "stickWood"
        ));
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                " xx",
                " y ",
                " y ",
                'x', "gemRuby",
                'y', "stickWood"
        ));
    }
}
