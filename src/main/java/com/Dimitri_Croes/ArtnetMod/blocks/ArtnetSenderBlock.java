package com.Dimitri_Croes.ArtnetMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ArtnetSenderBlock extends BlockBase
{

	public ArtnetSenderBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(1.5F);
		setResistance(18000000F);
		setHarvestLevel("pickaxe", 0);
		
		
	}

}
