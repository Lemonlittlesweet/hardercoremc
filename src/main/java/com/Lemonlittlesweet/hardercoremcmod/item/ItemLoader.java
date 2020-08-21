package com.Lemonlittlesweet.hardercoremcmod.item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class ItemLoader 
{
	public static Item flintKnife = new ItemFlintKnife();
	public static Item innerStove = new ItemInnerStove();	
	public static Item ropeStick = new ItemRopeStick();	
	public static Item rope = new ItemRope();
	public static Item impurityIron = new ItemImpurityIron();	
	public static Item pebble = new ItemPebble();	
	public static Item refractoryBrick = new ItemRefractoryBrick();	
	
	public ItemLoader(FMLPreInitializationEvent event)
	{
		register(flintKnife,"flint_knife");
		register(innerStove,"inner_stove");
		register(ropeStick,"rope_stick");
		register(rope,"rope");
		register(impurityIron,"impurity_iron");
		register(pebble,"pebble");
		register(refractoryBrick,"refractory_brick");
		
		MinecraftForge.addGrassSeed(new ItemStack(pebble), 20); 

	}

	private static void register(Item item,String name)
	{
		GameRegistry.registerItem(item, name);
	}

}
