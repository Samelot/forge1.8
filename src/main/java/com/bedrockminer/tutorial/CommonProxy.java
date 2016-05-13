package com.bedrockminer.tutorial;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.bedrockminer.tutorial.blocks.ModBlocks;
import com.bedrockminer.tutorial.crafting.ModCrafting;
import com.bedrockminer.tutorial.items.ModItems;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
	}

	public void init(FMLInitializationEvent e) {
		ModCrafting.initCrafting();
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
