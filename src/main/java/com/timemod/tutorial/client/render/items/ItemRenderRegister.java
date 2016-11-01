package com.timemod.tutorial.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.b3d.B3DLoader;

import com.timemod.tutorial.Main;
import com.timemod.tutorial.items.ModItems;

public final class ItemRenderRegister {

	public static void preInit() {
		ModelBakery.addVariantName(ModItems.metaItem, "tutorial:meta_item_white", "tutorial:meta_item_black");
	}

	public static void registerItemRenderer() {
		reg(ModItems.tutorialItem);
		reg(ModItems.metaItem, 0, "meta_item_white");
		reg(ModItems.metaItem, 1, "meta_item_black");
		
		//B3D
		reg(ModItems.b3dItem);
	}

	//==========================================================================

	public static String modid = Main.MODID;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void reg(Item item, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
	
	public static void regB3D(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		B3DLoader.instance.addDomain(modid);

		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
