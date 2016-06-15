package com.watschman.betterenhancement.items.tools.ruby;

import com.watschman.betterenhancement.items.tools.itemToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class rubyPickaxe extends ItemPickaxe{
    public rubyPickaxe() {
        super(itemToolMaterial.RUBY);
        GameRegistry.addRecipe(new ShapedOreRecipe(this,
                "xxx",
                " y ",
                " y ",
                'x', "gemRuby",
                'y', "stickWood"));
    }
}
