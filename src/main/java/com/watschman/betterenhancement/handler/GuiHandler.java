package com.watschman.betterenhancement.handler;

import com.watschman.betterenhancement.client.gui.tileentities.GuiRubyChestTileEntity;
import com.watschman.betterenhancement.gui.container.ContainerRubyChestTileEntity;
import com.watschman.betterenhancement.tileentity.storage.RubyChestTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

    public static final int RUBY_CHEST_TILE_ENTITY_GUI = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == RUBY_CHEST_TILE_ENTITY_GUI)
            return new ContainerRubyChestTileEntity(player.inventory, (RubyChestTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == RUBY_CHEST_TILE_ENTITY_GUI)
            return new GuiRubyChestTileEntity(player.inventory, (RubyChestTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
        return null;
    }
}
