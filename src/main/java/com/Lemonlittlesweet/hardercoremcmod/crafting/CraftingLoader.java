package com.Lemonlittlesweet.hardercoremcmod.crafting;

import com.Lemonlittlesweet.hardercoremcmod.block.BlockLoader;
import com.Lemonlittlesweet.hardercoremcmod.item.ItemLoader;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingLoader 
{
    public CraftingLoader()
    {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }
    
    private static void registerRecipe()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemLoader.innerStove, 1), new Object[]
                {
                        "# #", "#*#", "   ", '#', Blocks.clay, '*', "cobblestone"
                }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockLoader.furnace, 1), new Object[]
                {
                        "###", "#*#", "###", '#', "cobblestone", '*', ItemLoader.innerStove
                }));
        GameRegistry.addRecipe(new ShapelessOreRecipe (new ItemStack(ItemLoader.ropeStick), new Object[]
        		{
        			"stickWood", ItemLoader.rope
        		}));
        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.flintKnife, 1), new Object[]
                {
                        "#  ", "*  ", "+  ", '#', Items.flint, '*', ItemLoader.rope,'+', ItemLoader.pebble
                });
        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.refractoryBrick, 1), new Object[]
                {
                        "###", "***", "###", '#', Items.clay_ball, '*', Items.quartz
                });
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.furnace, 1), new Object[]
                {
                        "# #", "*+*", "#-#", '#', Blocks.stone, '*', ItemLoader.refractoryBrick, '+', ItemLoader.innerStove, '-', ItemLoader.impurityIron
                });
        GameRegistry.addRecipe(new ShapelessOreRecipe (new ItemStack(Items.stick), new Object[]
        		{
        			"treeSapling",new ItemStack (ItemLoader.flintKnife,1,32767)//让所有耐久燧石刀都可参与合成
        		}));
        ItemLoader.flintKnife.setContainerItem(ItemLoader.flintKnife); //合成后返还燧石刀
        
    }

    private static void registerSmelting()
    {

    }

    private static void registerFuel()
    {

    }
    
}
