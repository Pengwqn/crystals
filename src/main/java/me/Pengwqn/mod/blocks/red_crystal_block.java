package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class red_crystal_block extends Block {
	
	public red_crystal_block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.RCBLOCK.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.RCBLOCK.getRegistryName());
		this.setLightLevel(8);
		this.setLightOpacity(lightOpacity);
		this.setHardness(12);
	}

}
