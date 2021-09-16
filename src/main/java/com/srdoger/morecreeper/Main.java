package com.srdoger.morecreeper;

import com.srdoger.morecreeper.proxy.CommonProxy;
import com.srdoger.morecreeper.util.Reference;
 import com.srdoger.morecreeper.util.handlers.RegistryHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.preInitRegistries();
    }
    @EventHandler
    public static void Init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries();
    }
    @EventHandler
    public static void posInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries();
    }

    @EventHandler
    public static void serverInit(FMLServerStartingEvent event)
    {
        RegistryHandler.serverRegistries();
    }
}
