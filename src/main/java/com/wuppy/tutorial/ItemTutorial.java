package com.wuppy.tutorial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTutorial extends Item {
	private final String name = "tutorialItem";
	
	public ItemTutorial() {
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Main.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public String getName() {
		return name;
	}
}
