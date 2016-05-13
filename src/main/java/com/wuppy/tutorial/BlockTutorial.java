package com.wuppy.tutorial;
 
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class BlockTutorial extends Block
{
	private final String name = "tutorialBlock";
	
	public BlockTutorial() {
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(Main.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public String getName() {
		return name;
	}
}
