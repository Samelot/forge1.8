package com.nealegaming.mod.proxy;

import com.nealegaming.mod.render.NGBlockRender;
import com.nealegaming.mod.render.NGItemRender;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public void preInit(FMLPreInitializationEvent preEvent) {
	
		super.preInit(preEvent);
	}
	
	public void init(FMLInitializationEvent event) {
		
		super.init(event);
		
		NGBlockRender.registerBlockRender();
		NGItemRender.registerItemRender();
	}
	
	public void postInit(FMLPostInitializationEvent postEvent) {
	
		super.postInit(postEvent);
	}
}
