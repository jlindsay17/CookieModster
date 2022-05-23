package com.jacksonlindsay.cookiemod.handlers;

import com.jacksonlindsay.cookiemod.entities.render.RenderHandler;
import com.jacksonlindsay.cookiemod.init.EntityInit;
import com.jacksonlindsay.cookiemod.world.Main;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event){
//        event.getRegistry().register();
    }

    public static void preInitRegistries() {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRender();

    }
    public static void postInitRegistries() {


    }

    public static void serverInitRegistries() {


    }
}
