package com.sizeoverload.gandhi.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item gazeboBook;
	
	public static void createItems() {
		GameRegistry.registerItem(gazeboBook = new GazeboBook("GazeboBook"), "GazeboBook");
	}
}
