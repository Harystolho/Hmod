package com.Hmod.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.Hmod.HaryBlocks.HarysBlocks;
import com.Hmod.HaryGen.HarysGen;
import com.Hmod.HaryItems.HarysItems;
import com.Hmod.HaryRecipes.HarysRecipes;
import com.Hmod.creativetabs.HarysTab;
import com.Hmod.helper.Reference;
import com.Hmod.proxy.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MainHary {

	 @Mod.Instance(Reference.MODID)
	 public static MainHary instance;
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static final HarysTab HaryT = new HarysTab("HarysTab");
	

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		HarysBlocks.init();
		HarysBlocks.register();

		HarysItems.init();
		HarysItems.register();

		HarysRecipes.addRecipes();

		HarysGen.MainRegistry();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		proxy.registerRenders();

	//	MinecraftForge.EVENT_BUS.register(new com.Hmod.handler.EventHandler());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}