package com.timemod.tutorial;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.timemod.tutorial.client.render.blocks.BlockRenderRegister;
import com.timemod.tutorial.client.render.items.ItemRenderRegister;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);

//		ItemRenderRegister.preInit();
		BlockRenderRegister.preInit();
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);

//		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

}
