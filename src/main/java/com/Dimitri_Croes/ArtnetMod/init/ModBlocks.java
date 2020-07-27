package com.Dimitri_Croes.ArtnetMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Dimitri_Croes.ArtnetMod.blocks.ArtnetSenderBlock;
import com.Dimitri_Croes.ArtnetMod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ARTNET_SENDER_BLOCK = new ArtnetSenderBlock("artnet_sender_block", Material.IRON);
	
}
