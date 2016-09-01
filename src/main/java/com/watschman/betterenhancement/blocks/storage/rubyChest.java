package com.watschman.betterenhancement.blocks.storage;

import com.watschman.betterenhancement.BetterEnhancement;
import com.watschman.betterenhancement.handler.GuiHandler;
import com.watschman.betterenhancement.tileentity.storage.RubyChestTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

import static net.minecraft.util.EnumBlockRenderType.MODEL;

@SuppressWarnings("deprecation")
public class RubyChest extends BlockContainer {
    protected static final AxisAlignedBB EAST_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 1.0D);
    protected static final AxisAlignedBB WEST_AABB = new AxisAlignedBB(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    protected static final AxisAlignedBB SOUTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D);
    protected static final AxisAlignedBB NORTH_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D);
    public RubyChest() {
        super(Material.ROCK);
        setUnlocalizedName("ruby_chest");
        setHarvestLevel("pickaxe", 1);
        setHardness(1.2F);
    }

    public static final PropertyDirection FACING = PropertyDirection.create("facing");

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new RubyChestTileEntity();
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return MODEL;
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        RubyChestTileEntity tileEntity = (RubyChestTileEntity) worldIn.getTileEntity(pos);
        InventoryHelper.dropInventoryItems(worldIn, pos, tileEntity);
        super.breakBlock(worldIn, pos, state);
    }
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        if (stack.hasDisplayName()) {
            ((RubyChestTileEntity) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
        }
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote)
            playerIn.openGui(BetterEnhancement.instance, GuiHandler.RUBY_CHEST_TILE_ENTITY_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }

}
