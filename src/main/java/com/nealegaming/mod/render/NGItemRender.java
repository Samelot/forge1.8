package com.nealegaming.mod.render;

import com.nealegaming.mod.NGGlobal;
import com.nealegaming.mod.items.NGItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class NGItemRender {

	public static void registerItemRender() {
		
		regItem(NGItems.copperIngot);
		
		
	}
	
	public static void regItem(Item item) {
		//substring takes of "tile."
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(NGGlobal.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));		
	}
}
