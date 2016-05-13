package com.greyghost.mbe01_block_simple;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main
{

    public static final String MODID = "mbe01_block_simple";
    public static final String MODNAME = "mbe01_block_simple";
    public static final String VERSION = "1.0.0";
    
    // The instance of your mod that Forge uses.  Optional.
    @Mod.Instance(Main.MODID)
    public static Main instance = new Main();

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="com.greyghost.mbe01_block_simple.ClientOnlyProxy", serverSide="com.greyghost.mbe01_block_simple.DedicatedServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
      proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
      proxy.postInit();
    }

    /**
     * Prepend the name with the mod ID, suitable for ResourceLocations such as textures.
     * @param name
     * @return eg "minecraftbyexample:myblockname"
     */
    public static String prependModID(String name) {return MODID + ":" + name;}
}