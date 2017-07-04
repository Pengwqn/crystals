package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.Sound;
import paulscode.sound.SoundSystem;

public class blue_crystal_block extends Block {
	
	public blue_crystal_block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.BCBLOCK.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.BCBLOCK.getRegistryName());
		this.setLightLevel(8);
		this.setLightOpacity(lightValue);
		this.setHardness(12);
	}
}
