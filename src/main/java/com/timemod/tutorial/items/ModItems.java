package com.timemod.tutorial.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item tutorialItem;
	public static Item metaItem;

	//B3D
	public static Item b3dItem;
	
	public static void createItems() {
		GameRegistry.registerItem(tutorialItem 	= new BasicItem("tutorial_item"), "tutorial_item");
		GameRegistry.registerItem(metaItem 		= new MetaItem("meta_item"), "meta_item");
		
		//B3D
		GameRegistry.registerItem(metaItem 		= new MetaItem("b3d_item"), "b3d_item");
	}

}
