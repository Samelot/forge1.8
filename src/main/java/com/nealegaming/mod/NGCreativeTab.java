package com.nealegaming.mod;

import com.nealegaming.mod.items.NGItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NGCreativeTab extends CreativeTabs {

	public NGCreativeTab(String label) {
		super(label);
	}

	public Item getTabIconItem() {
		return NGItems.copperIngot;
	}
}
