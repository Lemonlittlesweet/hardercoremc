package com.Lemonlittlesweet.hardercoremcmod.item;

import com.Lemonlittlesweet.hardercoremcmod.Hardercoremc;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemImpurityIron extends Item
{
	public ItemImpurityIron()
	
	{
		super();
		this.setUnlocalizedName("impurityIron");
		
		this.setCreativeTab(CreativeTabsLoader.tabHardercoremc);
		
		this.setTextureName(Hardercoremc.MODID + ":impurity_iron");
	}
}
