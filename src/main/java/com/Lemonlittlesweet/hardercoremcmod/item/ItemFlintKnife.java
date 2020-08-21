package com.Lemonlittlesweet.hardercoremcmod.item;

import java.util.List;

import com.Lemonlittlesweet.hardercoremcmod.Hardercoremc;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.CreativeTabsLoader;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemFlintKnife extends ItemSword
{
    public static final Item.ToolMaterial FLINT = EnumHelper.addToolMaterial("FLINT", 0, 50, 0F, 0F, 0);
	public ItemFlintKnife()
	{
        super(FLINT);
		this.setUnlocalizedName("flintKnife");
		
		this.setCreativeTab(CreativeTabsLoader.tabHardercoremc);
		
		this.setTextureName(Hardercoremc.MODID + ":flint_knife");
		
		this.setMaxDamage(50);
		
        this.maxStackSize = 1;

	}
	
	//start
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack)
    {
      return false;
    }

    public boolean getShareTag()
    {
      return true;
    }

    public boolean hasContainerItem(ItemStack itemstack)
    {
      return true;
    }

    public ItemStack getContainerItem(ItemStack itemstack)
    {
      ItemStack stack = itemstack.copy();

      stack.setItemDamage(stack.getItemDamage() + 1);
      stack.stackSize = 1;

      return stack;
    }
 //end,使耐久减一的代码块
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lores, boolean b)
    {
            lores.add("用天然燧石以打磨的方式拼接而成");
            lores.add("比较锋利而且小巧");
            lores.add("或许可以用于处理一下材料?");
        }
}
//nbt代码块
