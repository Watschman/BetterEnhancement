package com.watschman.betterenhancement.entity.renderers;

import com.watschman.betterenhancement.entity.models.ModelPig;
import com.watschman.betterenhancement.entity.passive.EntitySapphirePig;
import com.watschman.betterenhancement.reference.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderSapphirePig extends RenderLiving<EntitySapphirePig> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/pigs/sapphire_pig.png");

    public RenderSapphirePig(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
        this.addLayer(new LayerSaddle(this));
    }
    @Override
    protected ResourceLocation getEntityTexture(EntitySapphirePig entity) {
        return TEXTURE;
    }
    @SideOnly(Side.CLIENT)
    public class LayerSaddle implements LayerRenderer<EntitySapphirePig>{
        private final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/pigs/sapphire_pig.png");
        private final RenderSapphirePig RENDERER;
        private final ModelPig MODEL = new ModelPig(0.5F);

        public LayerSaddle(RenderSapphirePig renderer){
            this.RENDERER = renderer;
        }
        public void doRenderLayer(EntitySapphirePig entityLivingBaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale){
            if (entityLivingBaseIn.getSaddled()){
                this.RENDERER.bindTexture(TEXTURE);
                this.MODEL.setModelAttributes(this.RENDERER.getMainModel());
                this.MODEL.render(entityLivingBaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
        }
        public boolean shouldCombineTextures(){
            return false;
        }

    }
}
