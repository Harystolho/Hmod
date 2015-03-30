package com.Hmod.HaryItems;

import com.Hmod.main.MainHary;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class Hary_Sword extends ItemSword {

	public Hary_Sword(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName("hary_sword");
		setCreativeTab(MainHary.HaryT);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn,
			EntityPlayer playerIn) {
		if(playerIn.isSneaking()){
			playerIn.setHealth(playerIn.getHealth()+2);
		}
			
		return itemStackIn;
	}
	
	
}