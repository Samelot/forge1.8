package com.nealegaming.mod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

// see net.minecraft.init Blocks.class
public class NGBlocks {

	public static Block copperOre;
	public static Block nickelOre;
	
	public static void initBlocks() {

		//Ores
		GameRegistry.registerBlock(copperOre = new NGBlock("copperOre", Material.rock, 3, 15), "copperOre");
		GameRegistry.registerBlock(nickelOre = new NGBlock("nickelOre", Material.rock, 3, 15), "nickelOre");
	}
}
