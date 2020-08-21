package com.Lemonlittlesweet.hardercoremcmod.inventory;

import com.Lemonlittlesweet.hardercoremcmod.inventory.ContainerDemo;

import net.minecraft.client.gui.inventory.GuiContainer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiContainerDemo extends GuiContainer
{
    public GuiContainerDemo(ContainerDemo inventorySlotsIn)
    {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        // TODO
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        // TODO
    }
}