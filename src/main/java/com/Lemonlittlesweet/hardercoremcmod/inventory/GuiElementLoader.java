package com.Lemonlittlesweet.hardercoremcmod.inventory;

import com.Lemonlittlesweet.hardercoremcmod.Hardercoremc;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiElementLoader  implements IGuiHandler
	{    
	public static final int GUI_DEMO = 1;

    public GuiElementLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(Hardercoremc.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
        case GUI_DEMO:
            return new ContainerDemo();
        default:
            return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
        case GUI_DEMO:
            return new GuiContainerDemo(new ContainerDemo());
        default:
            return null;
        }
    }
}
