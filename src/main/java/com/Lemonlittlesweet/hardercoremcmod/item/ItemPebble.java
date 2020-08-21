package com.Lemonlittlesweet.hardercoremcmod.item;

import com.Lemonlittlesweet.hardercoremcmod.Hardercoremc;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.CreativeTabsLoader;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ItemPebble extends Item
{
	public ItemPebble()
	
	{
		super();
		
		this.setUnlocalizedName("pebble");
		
		this.setCreativeTab(CreativeTabsLoader.tabHardercoremc);
		
		this.setTextureName(Hardercoremc.MODID + ":pebble");		
		
	}
}