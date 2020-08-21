package com.Lemonlittlesweet.hardercoremcmod;

import com.Lemonlittlesweet.hardercoremcmod.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="hardercoremc", name="Hardercoremc", version="1.0.0", acceptedMinecraftVersions = "1.7.10",
			 dependencies = "required-after:ImmersiveEngineering;required-after:IC2")

public class Hardercoremc
{
   public static final String MODID = "hardercoremc";
   public static final String NAME = "Hardercoremc";
   public static final String VERSION = "1.0.0";

   @Instance(com.Lemonlittlesweet.hardercoremcmod.Hardercoremc.MODID)
   public static com.Lemonlittlesweet.hardercoremcmod.Hardercoremc instance;

   @EventHandler
   public void preInit(FMLPreInitializationEvent event)
   {
       proxy.preInit(event);
   }

   @EventHandler
   public void init(FMLInitializationEvent event)
   {
       proxy.init(event);
   }

   @EventHandler
   public void postInit(FMLPostInitializationEvent event)
   {
       proxy.postInit(event);
   }

   @SidedProxy(clientSide = "com.Lemonlittlesweet.hardercoremcmod.client.ClientProxy",
           serverSide = "com.Lemonlittlesweet.hardercoremcmod.common.CommonProxy")
   public static CommonProxy proxy;
}
