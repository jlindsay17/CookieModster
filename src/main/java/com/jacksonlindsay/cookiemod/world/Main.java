package com.jacksonlindsay.cookiemod.world;

import java.io.File;

import com.jacksonlindsay.cookiemod.entities.render.RenderHandler;
import com.jacksonlindsay.cookiemod.handlers.RegistryHandler;
import com.jacksonlindsay.cookiemod.proxy.CommonProxy;


import com.jacksonlindsay.cookiemod.proxy.CommonProxy;
import com.jacksonlindsay.cookiemod.proxy.ClientProxy;
import com.sun.jna.platform.unix.X11;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.registries.RegistryManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main
{
    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static CommonProxy proxy;

    public static File config;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        RegistryHandler.preInitRegistries();
        RenderHandler.registerEntityRender();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries();
    }

    @EventHandler
    public static void serverInit(FMLServerStartingEvent event)
    {
        RegistryHandler.serverInitRegistries();
    }
}

