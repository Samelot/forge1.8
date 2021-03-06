package com.uniquemovement.entity.hoverboard;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderHoverboardRed extends RenderLiving
{
protected ModelHoverboard model;

public RenderHoverboardRed (RenderManager rendermgr, ModelHoverboard modelMech, float f)
{
super(rendermgr, modelMech, f);
model = ((ModelHoverboard)mainModel);
}

public void renderTutorial(EntityHoverboardRed par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((EntityHoverboardRed)par1EntityLiving, par2, par4, par6, par8, par9);
    }

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderTutorial((EntityHoverboardRed)par1Entity, par2, par4, par6, par8, par9);
    }

private static final ResourceLocation field_110890_f = new ResourceLocation("uniquemovement", "textures/entity/Hoverboard_Red.png");

@Override
protected ResourceLocation getEntityTexture(Entity entity) {
	return field_110890_f;
}
}