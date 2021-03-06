package com.Hmod.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.Hmod.HaryBlocks.HarysBlocks;
import com.Hmod.HaryGen.HarysGen;
import com.Hmod.HaryItems.HarysItems;
import com.Hmod.HaryRecipes.HarysRecipes;
import com.Hmod.achievements.HaryAchiev;
import com.Hmod.creativetabs.HarysTab;
import com.Hmod.handler.ConfigHandler;
import com.Hmod.helper.Reference;
import com.Hmod.proxy.CommonProxy;
import com.Hmod.tile_entity.HaryEntity;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MainHary {

	 @Instance(Reference.MODID)	
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

		HarysGen.MainRegistry();
		
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		HaryEntity.register();
		
		proxy.registerRenders();
		proxy.registerNetworkStaff();
		HarysRecipes.addRecipes();

		HaryAchiev.init();
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
