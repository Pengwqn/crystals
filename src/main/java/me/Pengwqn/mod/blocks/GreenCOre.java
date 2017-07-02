package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GreenCOre extends Block {
	
	public GreenCOre() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.GCORE.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.GCORE.getRegistryName());
		this.setLightLevel(4);
		this.setHardness(16);
		this.setHarvestLevel(null, 2);
	}

}
