package com.Lemonlittlesweet.hardercoremcmod.common;

import java.util.Iterator;

import com.Lemonlittlesweet.hardercoremcmod.block.BlockLoader;
import com.Lemonlittlesweet.hardercoremcmod.crafting.CraftingLoader;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.CreativeTabsLoader;
import com.Lemonlittlesweet.hardercoremcmod.inventory.GuiElementLoader;
import com.Lemonlittlesweet.hardercoremcmod.item.ItemLoader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy
{
   public void preInit(FMLPreInitializationEvent event)
   {
	   new CreativeTabsLoader(event);
	   new ItemLoader(event);
	   new BlockLoader(event);
   }

   public void init(FMLInitializationEvent event)
   {
	   	 ItemStack a = new ItemStack(Blocks.furnace);
	    removeRecipe(a);  //删除熔炉合成
	   	 ItemStack b = new ItemStack(Items.stick);
	    removeRecipe(b);  //删除木棍合成
	    
	    new CraftingLoader();
        new GuiElementLoader();
	    
   }

   public void postInit(FMLPostInitializationEvent event)
   {
   }
   
   public boolean removeRecipe(ItemStack output) {
	    for(Iterator<Object> iterator = CraftingManager.getInstance().getRecipeList().iterator(); iterator.hasNext();)
	    {
	        IRecipe recipe = (IRecipe)iterator.next();
	        ItemStack recipeOutput = recipe.getRecipeOutput();
	        if(OreDictionary.itemMatches(recipeOutput, output, false) && recipeOutput.stackSize == output.stackSize)
	        {
	            iterator.remove();
	            return true;
	        }
	    }
	    return false;
	}          //删除指定配方，仅判断输出物
	 
}