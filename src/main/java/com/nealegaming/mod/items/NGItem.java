package com.nealegaming.mod.items;

import com.nealegaming.mod.NGGlobal;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NGItem extends Item {

	public NGItem(String name) {
		super();

		this.setUnlocalizedName(name);
		this.setCreativeTab(NGGlobal.ngCreativeTab);
		
	}
}
