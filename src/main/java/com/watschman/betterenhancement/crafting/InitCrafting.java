package com.watschman.betterenhancement.crafting;

public class InitCrafting {
    public InitCrafting(){

        AlterVanillaBehaviorCrafting.registerBread();

        ArmorCrafting.registerRubyArmor();
        ArmorCrafting.registerSapphireArmor();
        ArmorCrafting.registerPeridotArmor();

        FoodCrafting.registerFood();

        SeedCrafting.registerSeeds();

        StorageCrafting.registerStorage();

        FurnaceCrafting.registerFurnaces();

        ToolsCrafting.registerRubyTools();
        ToolsCrafting.registerSapphireTools();
        ToolsCrafting.registerPeridotTools();
        ToolsCrafting.registerGoldInfusedDiamondTools();

    }
}
