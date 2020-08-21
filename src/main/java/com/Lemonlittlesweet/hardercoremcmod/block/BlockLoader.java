package com.Lemonlittlesweet.hardercoremcmod.block;

import net.minecraft.block.*;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockLoader 
{
	public static Block furnace = new BlockFurnace();
	
	public BlockLoader(FMLPreInitializationEvent event)
	{
		register(furnace,"furnace");
	}
	
	private static void register(Block block, String name)
	{
		GameRegistry.registerBlock(block, name);
	}
	
}
