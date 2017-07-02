package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import paulscode.sound.SoundSystem;

public class BlueCOre extends Block {
	
	public BlueCOre() {
		super(Material.GLASS);
		setUnlocalizedName(Reference.PenBlocks.BCORE.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.BCORE.getRegistryName());
		this.setLightLevel(4);
		this.setHardness(16);
		this.setHarvestLevel(null, 2);
	}
}
