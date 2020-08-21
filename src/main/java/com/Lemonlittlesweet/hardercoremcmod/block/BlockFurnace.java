package com.Lemonlittlesweet.hardercoremcmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import com.Lemonlittlesweet.hardercoremcmod.Hardercoremc;
import com.Lemonlittlesweet.hardercoremcmod.creativetab.CreativeTabsLoader;
import com.Lemonlittlesweet.hardercoremcmod.inventory.GuiElementLoader;

import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.*;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.*;


public class BlockFurnace extends BlockDirectional
{
    private IIcon forward, left, right, top, other, bottom;
    
	public BlockFurnace()
	{
		super(Material.gourd);
		this.setBlockName("furnace");
		this.setHardness(1F);
		this.setResistance(10F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(CreativeTabsLoader.tabHardercoremc);
	}

	   /*
		@Override
	    public void onBlockAdded(World world, int x, int y, int z) { //通过setBlock放置的砖块
	        world.setBlockMetadataWithNotify(x, y, z, 2, 1 | 2); //一个更复杂的机制是判断附近哪个方向没有其他砖块,然后朝向那里.这里我们简单地让砖块朝北.
	    }
	 */
	    @Override
	    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
	        int meta = BlockPistonBase.determineOrientation(world, x, y, z, entity);
	        world.setBlockMetadataWithNotify(x, y, z, meta, 1 | 2); //1|2的来历见World类的setBlock
	    }
	     
	    @Override
	    public IIcon getIcon(int face, int meta) {
	        switch (meta) {
	        case 0: //朝下
	            switch (face)
	            {
	            case 0: return forward;
	            case 1: return other;
	            case 2: return top;
	            case 3: return bottom;
	            case 4: return right;
	            case 5: return left;
	            }
	            break;
	        case 1: //朝上
	            switch (face)
	            {
	            case 0: return other;
	            case 1: return forward;
	            case 2: return top;
	            case 3: return bottom;
	            case 4: return right;
	            case 5: return left;
	            }
	            break;
	        case 2: //朝北
	            switch (face)
	            {
	            case 0: return bottom;
	            case 1: return top;
	            case 2: return forward;
	            case 3: return other;
	            case 4: return right;
	            case 5: return left;
	            }
	            break;
	        case 3: //朝南
	            switch (face)
	            {
	            case 0: return bottom;
	            case 1: return top;
	            case 2: return other;
	            case 3: return forward;
	            case 4: return right;
	            case 5: return left;
	            }
	            break;
	        case 4: //朝西
	            switch (face)
	            {
	            case 0: return bottom;
	            case 1: return top;
	            case 2: return left;
	            case 3: return right;
	            case 4: return forward;
	            case 5: return other;
	            }
	            break;
	        case 5: //朝东
	            switch (face)
	            {
	            case 0: return bottom;
	            case 1: return top;
	            case 2: return left;
	            case 3: return right;
	            case 4: return other;
	            case 5: return forward;
	            }
	            break;
	        }
	        return other;
	    }
	 
	    @Override
	    public void registerBlockIcons(IIconRegister iIconRegister) {
	        forward = iIconRegister.registerIcon("hardercoremc:furnace_front");
	        left = iIconRegister.registerIcon("hardercoremc:furnace_side");
	        right = iIconRegister.registerIcon("hardercoremc:furnace_side");
	        top = iIconRegister.registerIcon("hardercoremc:furnace_top");
	        other = iIconRegister.registerIcon("hardercoremc:furnace_side");
	        bottom = iIconRegister.registerIcon("hardercoremc:furnace_bottom");
	    }




	    
	    
	}

