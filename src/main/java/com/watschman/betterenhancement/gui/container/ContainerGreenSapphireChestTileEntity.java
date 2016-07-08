package com.watschman.betterenhancement.gui.container;

import com.watschman.betterenhancement.items.gems.GreenSapphire;
import com.watschman.betterenhancement.tileentity.storage.GreenSapphireChestTileEntity;
import com.watschman.betterenhancement.util.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class ContainerGreenSapphireChestTileEntity extends Container {
    private final int xSize = 184;
    private final int ySize = 238;
    private final int col = (xSize - 162) / 2 + 1;

    private GreenSapphireChestTileEntity tileEntity;

    public ContainerGreenSapphireChestTileEntity(IInventory playerInv, GreenSapphireChestTileEntity tileEntity){
        this.tileEntity = tileEntity;

        //Tile Entity, Slot 0-8, Slot IDs 0-72
        for (int chestRow = 0; chestRow < 8; chestRow++){
            for (int chestCol = 0; chestCol < 9; chestCol++) {
                this.addSlotToContainer(new Slot(tileEntity, chestCol + chestRow * 9, 12 + chestCol * 18, 8+ chestRow * 18));
            }
        }
        // Player Inventory, Slot 9-35, Slot IDs 72-99
        for (int playerInvRow = 0; playerInvRow < 3; playerInvRow++) {
            for (int playerInvCol = 0; playerInvCol < 9; playerInvCol++) {
                this.addSlotToContainer(new Slot(playerInv, playerInvCol + playerInvRow * 9 + 9, col + playerInvCol * 18, ySize - (4 - playerInvRow)*18 - 10));
            }
        }

        // Player Inventory, Slot 0-8, Slot IDs 99-108 DONE
        for (int hotbatSlot = 0; hotbatSlot < 9; hotbatSlot++) {
            this.addSlotToContainer(new Slot(playerInv, hotbatSlot, col + hotbatSlot * 18, ySize -24));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn){
        return this.tileEntity.isUseableByPlayer(playerIn);
    }

    @Nullable
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack previous = null;
        Slot slot = this.inventorySlots.get(index);
        try {
            if (slot != null && slot.getHasStack()) {
                ItemStack current = slot.getStack();
                previous = current.copy();

                // [...] Custom behaviour

                if (index < 72) {
                    // From TE Inventory to Player Inventory
                    if (!this.mergeItemStack(current, 72, 108, true))
                        return null;
                }
                else {
                    // From Player Inventory to TE Inventory
                    if (!this.mergeItemStack(current, 0, 72, false))
                        return null;
                }

                // end
                if (current.stackSize == 0)
                    slot.putStack((ItemStack)null);
                else
                    slot.onSlotChanged();

                if (current.stackSize == previous.stackSize)
                    return null;
                slot.onPickupFromSlot(playerIn, current);
            }
        }catch (Exception ex){
            LogHelper.fatal("Exception during Gui Registration");
            ex.printStackTrace();
        }
        return previous;
    }
}
