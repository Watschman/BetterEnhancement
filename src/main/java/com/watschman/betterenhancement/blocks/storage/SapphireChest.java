package com.watschman.betterenhancement.blocks.storage;

import com.watschman.betterenhancement.BetterEnhancement;
import com.watschman.betterenhancement.handler.GuiHandler;
import com.watschman.betterenhancement.tileentity.storage.SapphireChestTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

import static net.minecraft.util.EnumBlockRenderType.MODEL;

public class SapphireChest extends BlockContainer{
    public SapphireChest() {
        super(Material.ROCK);
        setUnlocalizedName("sapphire_chest");
        setHarvestLevel("pickaxe", 1);
        setHardness(1.2F);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new SapphireChestTileEntity();
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return MODEL;
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        SapphireChestTileEntity tileEntity = (SapphireChestTileEntity) worldIn.getTileEntity(pos);
        InventoryHelper.dropInventoryItems(worldIn, pos, tileEntity);
        super.breakBlock(worldIn, pos, state);
    }
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        if (stack.hasDisplayName())
            ((SapphireChestTileEntity)worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote)
            playerIn.openGui(BetterEnhancement.instance, GuiHandler.SAPPHIRE_CHEST_TILE_ENTITY_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }

}
