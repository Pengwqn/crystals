package me.Pengwqn.mod.blocks;

import me.Pengwqn.mod.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGCrystal extends Block {
	
	public BlockGCrystal() {
		super(Material.IRON);
		setUnlocalizedName(Reference.PenBlocks.GCBLOCK.getUnlocalizedName());
		setRegistryName(Reference.PenBlocks.GCBLOCK.getRegistryName());
		this.setLightLevel(8);
		this.setLightOpacity(lightOpacity);
		this.setHardness(20);
	}

}
