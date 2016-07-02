package com.nealegaming.mod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NGItems {
	
	public static Item copperIngot;
	
	public static void initItems() {
		GameRegistry.registerItem(copperIngot = new NGItem("copperIngot"), "copperIngot");
	}
}
