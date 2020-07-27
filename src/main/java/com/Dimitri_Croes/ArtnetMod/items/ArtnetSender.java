package com.Dimitri_Croes.ArtnetMod.items;

import java.net.*;
import java.util.Collections;
import java.util.Enumeration;

import ch.bildspur.artnet.ArtNetClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ArtnetSender extends ItemBase {

	public ArtnetSender(String name) 
	{
		super(name);
		
	}
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World WorldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack item = playerIn.getHeldItem(handIn);

        ArtNetClient artnet = new ArtNetClient();

        NetworkInterface ni = null;
		try {
			ni = NetworkInterface.getByName("eth7");
		} catch (SocketException e) {
			e.printStackTrace();
		}
        InetAddress address = ni.getInetAddresses().nextElement();

        artnet.start(address);

        byte[] data = artnet.readDmxData(0, 0);
        System.out.println(Integer.toHexString(data[0]));
        artnet.stop();

        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }
	


}
