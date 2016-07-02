package com.nealegaming.mod.render;

import com.nealegaming.mod.NGGlobal;
import com.nealegaming.mod.blocks.NGBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class NGBlockRender {

	public static void registerBlockRender() {
		
		//Ores
		regBlock(NGBlocks.copperOre);
		regBlock(NGBlocks.nickelOre);
		
//		regBlock(NGBlocks.manganeseOre);
//		regBlock(NGBlocks.tinOre);
//		regBlock(NGBlocks.vanadiumOre);
//		regBlock(NGBlocks.zincOre);

		regBlock(NGBlocks.netherCopperOre);
		regBlock(NGBlocks.netherNickelOre);
		
//		regBlock(NGBlocks.netherManganeseOre);
//		regBlock(NGBlocks.netherTinOre);
//		regBlock(NGBlocks.netherVanadiumOre);
//		regBlock(NGBlocks.netherZincOre);		
	}
	
	public static void regBlock(Block block) {
		//substring takes of "tile."
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(NGGlobal.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));		
	}
}
