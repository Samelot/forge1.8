package com.timemod.tutorial;

import com.timemod.tutorial.command.Test;

import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "tutorial";
	public static final String MODNAME = "Tutorial Mod";
	public static final String VERSION = "1.0.0";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide="com.timemod.tutorial.ClientProxy", serverSide="com.timemod.tutorial.ServerProxy")
	public static CommonProxy proxy;

	// The method that gets called when a server starts up(Singleplayer and multiplayer are both affected)
    @EventHandler
    public void serverStart(FMLServerStartingEvent event)
    {
    	MinecraftServer server = MinecraftServer.getServer();
    	// Get's the current server instance
    	
    	ICommandManager command = server.getCommandManager();
    	// Get's the CommandManager for the server, but it's in a form we cannot use
    	
    	ServerCommandManager manager = (ServerCommandManager) command;
    	// Turns the useless ICommandManager into a now useful ServerCommandManager
    	
    	manager.registerCommand(new Test());
    	// Registers the command
    }
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}