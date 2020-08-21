package com.Lemonlittlesweet.hardercoremcmod.creativetab;

import net.minecraft.creativetab.*;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader 
{
	public static CreativeTabs tabHardercoremc;
	
	public CreativeTabsLoader(FMLPreInitializationEvent event)
	{
		tabHardercoremc = new CreativeTabsHardercoremc();
	}
}
