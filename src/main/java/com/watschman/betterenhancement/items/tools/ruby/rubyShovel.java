package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.ItemToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RubyShovel extends ItemSpade{
    public RubyShovel() {
        super(ItemToolMaterial.RUBY);
        setUnlocalizedName("ruby_shovel");
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "x",
                "y",
                "y",
                'x', "gemRuby",
                'y', "stickWood"
        ));
    }
}
