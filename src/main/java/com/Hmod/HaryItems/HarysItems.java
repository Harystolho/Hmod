package com.Hmod.HaryItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.Hmod.HaryBlocks.HaryBarrel;
import com.Hmod.helper.Reference;
import com.Hmod.main.MainHary;

public class HarysItems {

	// Items
	public static Item placer_hary;
	public static Item remov_hary;
	public static Item ingot_hary;
	public static Item coord_hary;
	public static Item ingot_compress_hary;
	public static Item hary_replacer;
	public static Item hary_gear;
	public static Item hary_food;
	public static Item hary_throw;
	public static Item hary_dust;
	/*
	 * public static Item hary_upgrades1; public static Item hary_upgrades2;
	 * public static Item hary_upgrades3;
	 */
	public static Item hary_bag;
	public static Item hary_sword_maker;

	// Tools
	public static ItemSword hary_sword;
	public static ItemPickaxe hary_pick;

	// Misc
	public static Item hary_test;

	public static ToolMaterial hary_material = EnumHelper.addToolMaterial(
			"hary_material", 3, 1567, 200F, 10F, 25);

	public static void init() {

		// Items
		ingot_compress_hary = new Item().setUnlocalizedName(
				"ingot_compress_hary").setCreativeTab(MainHary.HaryT);
		placer_hary = new HaryBlockPlacer().setCreativeTab(MainHary.HaryT);
		remov_hary = new ItemBlockRemover().setCreativeTab(MainHary.HaryT);
		ingot_hary = new ItemHaryteIngot().setUnlocalizedName("ingot_hary")
				.setCreativeTab(MainHary.HaryT);
		coord_hary = new ItemHaryteTeleporter().setCreativeTab(MainHary.HaryT);
		hary_replacer = new Hary_Replacer().setCreativeTab(MainHary.HaryT);
		hary_gear = new Item().setUnlocalizedName("hary_gear").setCreativeTab(
				MainHary.HaryT);
		hary_food = new Heal_Hary(0, false).setUnlocalizedName("hary_food")
				.setCreativeTab(MainHary.HaryT);
		hary_throw = new Hary_Projectile();
		hary_dust = new Item().setUnlocalizedName("hary_dust").setCreativeTab(
				MainHary.HaryT);
		/*
		 * hary_upgrades1 = new Item().setUnlocalizedName("hary_upgrades1")
		 * .setCreativeTab(MainHary.HaryT); hary_upgrades2 = new
		 * Item().setUnlocalizedName("hary_upgrades2")
		 * .setCreativeTab(MainHary.HaryT); hary_upgrades3 = new
		 * Item().setUnlocalizedName("hary_upgrades3")
		 * .setCreativeTab(MainHary.HaryT);
		 */
		hary_bag = new ItemWirelessContainer();
		hary_sword_maker = new Hary_Sword_Maker().setUnlocalizedName("hary_maker").setCreativeTab(MainHary.HaryT);

		// Tools
		hary_pick = new Hary_Pickaxe(hary_material);
		hary_sword = new Hary_Sword(hary_material);

		hary_test = new Hary_Test().setCreativeTab(MainHary.HaryT);
	}

	public static void register() {

		GameRegistry.registerItem(placer_hary, placer_hary.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(remov_hary, remov_hary.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(ingot_hary, ingot_hary.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(coord_hary, coord_hary.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(hary_pick, hary_pick.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(hary_sword, hary_sword.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(ingot_compress_hary, ingot_compress_hary
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hary_replacer, hary_replacer
				.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(hary_gear, hary_gear.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(hary_food, hary_food.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(hary_throw, hary_throw.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(hary_dust, hary_dust.getUnlocalizedName()
				.substring(5));
		/*
		 * GameRegistry.registerItem(hary_upgrades1, hary_upgrades1
		 * .getUnlocalizedName().substring(5));
		 * GameRegistry.registerItem(hary_upgrades2, hary_upgrades2
		 * .getUnlocalizedName().substring(5));
		 * GameRegistry.registerItem(hary_upgrades3, hary_upgrades3
		 * .getUnlocalizedName().substring(5));
		 */
		GameRegistry.registerItem(hary_bag, hary_bag.getUnlocalizedName()
				.substring(5));
		GameRegistry.registerItem(hary_sword_maker, hary_sword_maker
				.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(hary_test, hary_test.getUnlocalizedName()
				.substring(5));
	}

	public static void registerRenders() {

		registerRender(placer_hary);
		registerRender(remov_hary);
		registerRender(ingot_hary);
		registerRender(coord_hary);
		registerRender(hary_pick);
		registerRender(ingot_compress_hary);
		registerRender(hary_replacer);
		registerRender(hary_gear);
		registerRender(hary_food);
		registerRender(hary_throw);
		registerRender(hary_sword);
		registerRender(hary_dust);
		/*
		 * registerRender(hary_upgrades1); registerRender(hary_upgrades2);
		 * registerRender(hary_upgrades3);
		 */
		registerRender(hary_bag);
		registerRender(hary_sword_maker);

		registerRender(hary_test);

	}

	public static void registerRender(Item item) {

		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(Reference.MODID + ":"
								+ item.getUnlocalizedName().substring(5),
								"inventory"));

	}
}
