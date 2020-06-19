package org.gloomybanana.compressedblock.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FlintBlock extends Block {
    public FlintBlock(){
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(5));
        this.setRegistryName("flint_block");
    }
}
