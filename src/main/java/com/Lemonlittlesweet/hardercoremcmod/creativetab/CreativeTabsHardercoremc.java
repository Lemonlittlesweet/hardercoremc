package com.Lemonlittlesweet.hardercoremcmod.creativetab;

import com.Lemonlittlesweet.hardercoremcmod.item.ItemLoader;
import com.Lemonlittlesweet.hardercoremcmod.block.BlockLoader;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.*;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;

public class CreativeTabsHardercoremc extends CreativeTabs
{
	public CreativeTabsHardercoremc()
	{
		super("Hardercoremc");
	}
	
	@Override
    public Item getTabIconItem()
    {
        return ItemLoader.flintKnife;
    }
	public Block getTabIconItem1()
	{
        return BlockLoader.furnace;
	}
}
