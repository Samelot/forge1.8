package com.timemod.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

// http://www.minecraftforum.net/forums/mapping-and-modding/mapping-and-modding-tutorials/1571462-1-6-4-forge-command-tutorials

public class BasicBlock extends Block {
	
	private boolean timeChanged;
	public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		
		this.timeChanged = false;
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}

	public BasicBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, hardness, resistance);
	}

	public BasicBlock(String unlocalizedName) {
		this(unlocalizedName, 2.0f, 10.0f);
	}
	
    private void setTime()
    {    	    	
        for (int j = 0; j < MinecraftServer.getServer().worldServers.length; ++j)
        {	
        	WorldServer worldserver = MinecraftServer.getServer().worldServers[j];        	
            int i = (int)(worldserver.getWorldTime());
            
//            worldserver.setWorldTime((i + 12000) % 23999);
        	
            if(i < 12000) {
        		worldserver.setWorldTime((long)18000);  		
        	} else {
        		worldserver.setWorldTime((long)6000);
        	}
        }


    }
    
    @Override
    public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
    {
		if(world.isRemote) {
			setTime();
		}
		return false;
    }
}
