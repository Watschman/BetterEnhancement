package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.itemToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class rubySword extends ItemSword{
    public rubySword() {
        super(itemToolMaterial.RUBY);
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "x",
                "x",
                "y",
                'x', "gemRuby",
                'y', "stickWood"
        ));
    }
}
