package com.uniquemovement.entity.aventador;


import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderAventadorBlue extends RenderLiving
{
protected ModelAventador model;

public RenderAventadorBlue (RenderManager rendermgr, ModelAventador modelMech, float f)
{
super(rendermgr, modelMech, f);
model = ((ModelAventador)mainModel);
}

public void renderTutorial(EntityAventadorBlue par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((EntityAventadorBlue)par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((EntityAventadorBlue)par1Entity, par2, par4, par6, par8, par9);
    }

private static final ResourceLocation field_110890_f = new ResourceLocation("uniquemovement", "textures/entity/Aventador_Blue.png");

@Override
protected ResourceLocation getEntityTexture(Entity entity) {
	return field_110890_f;
}
}