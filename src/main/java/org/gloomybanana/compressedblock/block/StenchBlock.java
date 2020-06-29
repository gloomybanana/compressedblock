package org.gloomybanana.compressedblock.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class StenchBlock extends Block {
    public StenchBlock() {
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(5));
        this.setRegistryName("stench_block");
    }
}
