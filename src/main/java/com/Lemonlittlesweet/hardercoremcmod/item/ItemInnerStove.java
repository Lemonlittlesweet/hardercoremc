package com.Lemonlittlesweet.hardercoremcmod.item;

import net.minecraft.item.Item;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.*;
import com.Lemonlittlesweet.hardercoremcmod.*;

public class ItemInnerStove extends Item
{
	public ItemInnerStove()
	
	{
		super();
		this.setUnlocalizedName("innerStove");
		
		this.setCreativeTab(CreativeTabsLoader.tabHardercoremc);
		
		this.setTextureName(Hardercoremc.MODID + ":inner_stove");
	}
}
