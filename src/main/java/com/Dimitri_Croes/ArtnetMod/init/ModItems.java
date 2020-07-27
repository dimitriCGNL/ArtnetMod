package com.Dimitri_Croes.ArtnetMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Dimitri_Croes.ArtnetMod.items.ArtnetSender;
import com.Dimitri_Croes.ArtnetMod.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item ARTNET_SENDER = new ArtnetSender("artnet_sender");
}
