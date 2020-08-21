package com.Lemonlittlesweet.hardercoremcmod.item;

import com.Lemonlittlesweet.hardercoremcmod.Hardercoremc;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemRope extends Item
{
	public ItemRope()
	
	{
		super();
		this.setUnlocalizedName("rope");
		
		this.setCreativeTab(CreativeTabsLoader.tabHardercoremc);
		
		this.setTextureName(Hardercoremc.MODID + ":rope");
	}
}
