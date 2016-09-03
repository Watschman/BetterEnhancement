package com.watschman.betterenhancement.crafting;

public class InitCrafting {
    public InitCrafting(){

        AlterVanillaBehaviorCrafting.registerBread();

        ArmorCrafting.registerRubyArmor();

        FoodCrafting.registerFood();

        SeedCrafting.registerSeeds();

        StorageCrafting.registerStorage();

        FurnaceCrafting.registerFurnaces();

        ToolsCrafting.registerRubyTools();
        ToolsCrafting.registerGoldInfusedDiamondTools();

    }
}
