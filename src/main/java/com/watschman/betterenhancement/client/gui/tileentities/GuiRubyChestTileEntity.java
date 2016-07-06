package com.watschman.betterenhancement.client.gui.tileentities;

import com.watschman.betterenhancement.gui.container.ContainerRubyChestTileEntity;
import com.watschman.betterenhancement.reference.Reference;
import com.watschman.betterenhancement.tileentity.storage.RubyChestTileEntity;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiRubyChestTileEntity extends GuiContainer {
    private int x = 184;
    private int y = 238;

    public GuiRubyChestTileEntity(IInventory playerInv, RubyChestTileEntity tileEntity) {
        super(new ContainerRubyChestTileEntity(playerInv, tileEntity));
        this.xSize = x;
        this.ySize = y;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(new ResourceLocation(Reference.MOD_ID, "textures/gui/container/ruby_chest_tile_entity_gui.png"));
        this.drawTexturedModalRect((width-this.xSize)/2, (height - this.ySize) / 2, 0, 0, this.xSize, this.ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
    }
}
