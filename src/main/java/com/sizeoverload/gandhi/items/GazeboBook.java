package com.sizeoverload.gandhi.items;

//import com.blogspot.jabelarminecraft.magicbeans.gui.GuiFamilyCow;

import com.sizeoverload.gandhi.gui.GuiBook;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class GazeboBook extends Item
{
   public GazeboBook(String unlocalizedName)
   {
    super();
    this.setMaxStackSize(1);
	this.setUnlocalizedName(unlocalizedName);
	this.setCreativeTab(CreativeTabs.tabMaterials);
   }

   private NBTTagList putTableOfContents(NBTTagList bookTagList)
   {
	   NBTTagCompound tag = new NBTTagCompound();
    	NBTTagList bookPages = new NBTTagList();
	   bookPages.appendTag(new NBTTagString("Page 1"));
	 
	  return bookTagList;
   }
  
   public void onUpdate(ItemStack itemStack, World world, Entity entity, int unknownInt, boolean unknownBool)
   {
	  NBTTagList bookTagList = new NBTTagList();
	  NBTTagCompound tag = new NBTTagCompound();
	  bookTagList = putTableOfContents(bookTagList);
	 
	  itemStack.setTagInfo("pages", bookTagList);
	  itemStack.setTagInfo("author", new NBTTagString("Pam"));
	  itemStack.setTagInfo("title", new NBTTagString("HarvestCraft Cookbook"));
//	  itemStack = PamOtherRecipes.book;
   }
   
//   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
//   {
//	   par3EntityPlayer.displayGUIBook(par1ItemStack);
//	   return par1ItemStack;
//   }
   @Override
   public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
   {
		if (playerIn.worldObj.isRemote)
		{
			Minecraft.getMinecraft().displayGuiScreen(new GuiBook());
		}
//       playerIn.displayGUIBook(itemStackIn);
//       playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
       return itemStackIn;
   }
   //http://www.minecraftforge.net/forum/index.php?topic=35289.0

  
}
