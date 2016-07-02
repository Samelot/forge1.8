package com.nealegaming.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

// see net.minecraft.init Blocks.class
public class NGBlocks {

	public static Block copperOre;
	public static Block nickelOre;
	
//	public static Block manganeseOre;
//	public static Block tinOre;
//	public static Block vanadiumOre;
//	public static Block zincOre;

	public static Block netherCopperOre;
	public static Block netherNickelOre;
	
//	public static Block netherManganeseOre;	
//	public static Block netherTinOre;
//	public static Block netherVanadiumOre;
//	public static Block netherZincOre;

	public static void initBlocks() {

		// Ores
		GameRegistry.registerBlock(copperOre = new NGBlock("copperOre", Material.rock, 3, 15), "copperOre");
		GameRegistry.registerBlock(nickelOre = new NGBlock("nickelOre", Material.rock, 3, 15), "nickelOre");
		
//		GameRegistry.registerBlock(manganeseOre = new NGBlock("manganeseOre", Material.rock, 3, 15), "manganeseOre");
//		GameRegistry.registerBlock(tinOre = new NGBlock("tinOre", Material.rock, 3, 15), "tinOre");
//		GameRegistry.registerBlock(vanadiumOre = new NGBlock("vanadiumOre", Material.rock, 3, 15), "vanadiumOre");
//		GameRegistry.registerBlock(zincOre = new NGBlock("zincOre", Material.rock, 3, 15), "zincOre");
		
		GameRegistry.registerBlock(netherCopperOre = new NGBlock("netherCopperOre", Material.rock, 3, 15), "netherCopperOre");
		GameRegistry.registerBlock(netherNickelOre = new NGBlock("netherNickelOre", Material.rock, 3, 15), "netherNickelOre");
		
//		GameRegistry.registerBlock(netherManganeseOre = new NGBlock("netherManganeseOre", Material.rock, 3, 15), "netherManganeseOre");
//		GameRegistry.registerBlock(netherTinOre = new NGBlock("netherTinOre", Material.rock, 3, 15), "netherTinOre");
//		GameRegistry.registerBlock(netherVanadiumOre = new NGBlock("vanadiumOre", Material.rock, 3, 15), "vanadiumOre");
//		GameRegistry.registerBlock(netherZincOre = new NGBlock("netherZincOre", Material.rock, 3, 15), "netherZincOre");
	}
}
