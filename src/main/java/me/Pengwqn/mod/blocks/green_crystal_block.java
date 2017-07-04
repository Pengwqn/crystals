package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class green_crystal_block extends Block {
	
	public green_crystal_block() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.GCBLOCK.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.GCBLOCK.getRegistryName());
		this.setLightLevel(8);
		this.setLightOpacity(lightOpacity);
		this.setHardness(12);
	}

}
