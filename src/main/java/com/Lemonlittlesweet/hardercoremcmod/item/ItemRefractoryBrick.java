package com.Lemonlittlesweet.hardercoremcmod.item;

import com.Lemonlittlesweet.hardercoremcmod.Hardercoremc;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemRefractoryBrick extends Item
{
	public ItemRefractoryBrick()
	
	{
		super();
		this.setUnlocalizedName("refractoryBrick");
		
		this.setCreativeTab(CreativeTabsLoader.tabHardercoremc);
		
		this.setTextureName(Hardercoremc.MODID + ":refractory_brick");
	}
}
