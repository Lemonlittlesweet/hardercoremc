package com.Lemonlittlesweet.hardercoremcmod.item;

import com.Lemonlittlesweet.hardercoremcmod.Hardercoremc;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemRopeStick extends Item
{
	public ItemRopeStick()
	
	{
		super();
		this.setUnlocalizedName("ropeStick");
		
		this.setCreativeTab(CreativeTabsLoader.tabHardercoremc);
		
		this.setTextureName(Hardercoremc.MODID + ":rope_stick");
	}
}
