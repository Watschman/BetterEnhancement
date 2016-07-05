package com.watschman.betterenhancement.crafting;

public class InitCrafting {
    public InitCrafting(){

        AlterVanillaBehaviorCrafting.registerBread();

        ArmorCrafting.registerRubyArmor();

        FoodCrafting.registerFood();

        SeedCrafting.registerSeeds();

        StorageCrafting.registerStorage();

        ToolsCrafting.registerRubyTools();
        ToolsCrafting.registerGoldInfusedDiamondTools();

    }
}
