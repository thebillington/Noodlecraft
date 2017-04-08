package com.noodlecraft.customitems.blocks;

import com.noodlecraft.customitems.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRubiks extends Block {

	public BlockRubiks() {
		super(Material.PISTON);
		setUnlocalizedName(Reference.CustomBlocks.RUBIKS.getUnlocalizedName());
		setRegistryName(Reference.CustomBlocks.RUBIKS.getRegistryName());
		setCreativeTab(CreativeTabs.REDSTONE);
		setBlockUnbreakable();
		setLightLevel(50.0f);
	}
	
}
