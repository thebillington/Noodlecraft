package com.noodlecraft.customitems.blocks;

import com.noodlecraft.customitems.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRubiks extends Block {

	public BlockRubiks() {
		super(Material.PISTON);
		setUnlocalizedName(Reference.CustomBlocks.RUBIKS.getUnlocalizedName());
		setRegistryName(Reference.CustomBlocks.RUBIKS.getRegistryName());
	}
	
}
