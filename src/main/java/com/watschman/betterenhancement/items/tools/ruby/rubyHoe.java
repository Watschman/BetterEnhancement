package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RubyHoe extends ItemHoe{
    public RubyHoe() {
        super(ItemToolMaterial.RUBY);
        setUnlocalizedName("ruby_hoe");
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
