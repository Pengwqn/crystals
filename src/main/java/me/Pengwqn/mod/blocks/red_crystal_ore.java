package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class red_crystal_ore extends Block {
	
	public red_crystal_ore() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.RCORE.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.RCORE.getRegistryName());
		this.setLightLevel(4);
		this.setHardness(16);
		this.setHarvestLevel(null, 2);
	}

}
