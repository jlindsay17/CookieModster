package com.jacksonlindsay.cookiemod.entities.render;

import com.jacksonlindsay.cookiemod.entities.EntityCookieModster;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
//    public static void registerEntityRender(){
//        RenderingRegistry.registerEntityRenderingHandler(EntityCookieModster.class, RenderCookieModster::new);
//    }
public static void registerEntityRender()
{
    RenderingRegistry.registerEntityRenderingHandler(EntityCookieModster.class, new IRenderFactory<EntityCookieModster>()
    {
        @Override
        public Render<? super EntityCookieModster> createRenderFor(RenderManager manager)
        {
            return new RenderCookieModster(manager);
        }
    });
}
}
