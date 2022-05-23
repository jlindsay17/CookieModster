package com.jacksonlindsay.cookiemod.entities.render;

import com.jacksonlindsay.cookiemod.CookieMod;
import com.jacksonlindsay.cookiemod.entities.EntityCookieModster;
import com.jacksonlindsay.cookiemod.entities.model.ModelCookieModster;
import com.jacksonlindsay.cookiemod.world.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import java.util.logging.Logger;

public class RenderCookieModster extends RenderLiving<EntityCookieModster> {

    //private static Logger logger;

    public static final ResourceLocation TEXTURES  = new ResourceLocation(Reference.MODID + "textures/entity/cookiemodster.png");

    public RenderCookieModster(RenderManager manager){
        super(manager, new ModelCookieModster(), 0.5F);
        //logger.info("About to render cookie monster");
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCookieModster entity){
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityCookieModster entityLiving, float p_77043_2_, float rotationYaw, float partialTricks){
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTricks);
    }
}
