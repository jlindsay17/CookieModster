package com.jacksonlindsay.cookiemod;

import com.jacksonlindsay.cookiemod.entities.render.RenderHandler;
import com.jacksonlindsay.cookiemod.init.EntityInit;
import net.minecraft.client.main.Main;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.rmi.registry.RegistryHandler;

@Mod(modid = CookieMod.MODID, name = CookieMod.NAME, version = CookieMod.VERSION)
public class CookieMod
{
    public static final String MODID = "cookiemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.12.2";
//    public static Main instance;

    public static final int ENTITY_COOKIEMODSTER = 120;

    private static Logger logger;

    @Mod.Instance
    public static CookieMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
//    @EventHandler
//    public static void init(FMLInitializationEvent event){
//        RegistryHandler;
//    }
//    @EventHandler
//    public static void postinit(FMLPostInitializationEvent event){
//        RegistryHandler.postInitRegistries();
//    }

//    public static void preInitRegistries(){
//        EntityInit.registerEntities();
//        RenderHandler.registerEntityRender();
//    }
}
