package com.timemod.tutorial.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class Test extends CommandBase {
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "test";
	}

	@Override
	public void execute(ICommandSender sender, String[] args) throws CommandException {
		// If it was a player that sent the command, then the sender should originate from an EntityPlayer, we can use this to check in an If statement to verify it's a player
		
		if(sender instanceof EntityPlayer) { // If the sender was a player
			EntityPlayer player = (EntityPlayer) sender;
			// Turn the sender into a player entity
			// I expect that you have some knowledge of Java to know what's going on, basically the object typed in the the brackets (EntityPlayer) is the type we want to cast ICommandSender into
			sender.getDisplayName();
			
			player.addChatMessage(new ChatComponentText("agagag"));
			// Send the player entity a message
		}
		
	}	
	
	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "Displays a test message";
		// The string to show when the user types "/help X", X being the string from "getCommandName"
	}

//	@Override
//	public String getCommandName() {
//		return "test";
//		// Name of the command "test" will be called by "/test"
//	}
	
//	@Override
//	public void processCommand(ICommandSender icommandsender, String[] astring) {
//		// If it was a player that sent the command, then the icommandsender should originate from an EntityPlayer, we can use this to check in an If statement to verify it's a player
//		
//		if(icommandsender instanceof EntityPlayer) { // If the sender was a player
//			EntityPlayer player = (EntityPlayer) icommandsender;
//			// Turn the sender into a player entity
//			// I expect that you have some knowledge of Java to know what's going on, basically the object typed in the the brackets (EntityPlayer) is the type we want to cast ICommandSender into
//			
//			player.addChatMessage("I volunterely chose not to murder you horribly, feel good!");
//			// Send the player entity a message
//		}
//	}

}
