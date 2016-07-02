package com.nealegaming.mod.blocks;

import com.nealegaming.mod.NGGlobal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

//see net.minecraft.block Block.class
public class NGBlock extends Block {
	
	public NGBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		
		this.setCreativeTab(NGGlobal.ngCreativeTab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		
	}

}
