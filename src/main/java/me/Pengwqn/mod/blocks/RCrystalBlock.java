package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RCrystalBlock extends Block {
	
	public RCrystalBlock() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.RCBLOCK.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.RCBLOCK.getRegistryName());
		this.setLightLevel(8);
		this.setLightOpacity(lightOpacity);
		this.setHardness(12);
	}

}
