package com.nealegaming.mod.proxy;

import com.nealegaming.mod.blocks.NGBlocks;
import com.nealegaming.mod.items.NGItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent preEvent) {
		
		NGBlocks.initBlocks();
		NGItems.initItems();
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	public void postInit(FMLPostInitializationEvent postEvent) {
	
	}
}
