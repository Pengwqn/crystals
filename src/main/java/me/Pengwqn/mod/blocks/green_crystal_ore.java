package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class green_crystal_ore extends Block {
	
	public green_crystal_ore() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.GCORE.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.GCORE.getRegistryName());
		this.setLightLevel(4);
		this.setHardness(16);
		this.setHarvestLevel(null, 2);
	}

}
