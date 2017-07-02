package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RedCOre extends Block {
	
	public RedCOre() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.RCORE.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.RCORE.getRegistryName());
		this.setLightLevel(4);
		this.setHardness(16);
		this.setHarvestLevel(null, 2);
	}

}
