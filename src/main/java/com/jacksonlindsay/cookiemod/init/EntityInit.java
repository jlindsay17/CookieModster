package com.jacksonlindsay.cookiemod.init;

import com.jacksonlindsay.cookiemod.entities.EntityCookieModster;
import com.jacksonlindsay.cookiemod.world.Reference;
import net.minecraft.client.main.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import com.jacksonlindsay.cookiemod.CookieMod;


public class EntityInit {

    public static void registerEntities() {
        registerEntity("cookiemodster", EntityCookieModster.class, Reference.ENTITY_COOKIEMODSTER, 50, 4403967, 4718671);
    }


    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ": " + name), entity, name, id, CookieMod.instance, range, 1, true, color1, color2);
    }

    private static void registerNonMobEntity(){

    }
}
