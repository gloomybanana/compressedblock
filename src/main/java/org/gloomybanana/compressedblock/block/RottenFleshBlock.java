package org.gloomybanana.compressedblock.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RottenFleshBlock extends Block {
    public RottenFleshBlock() {
        super(Block.Properties
                .create(Material.CACTUS)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.SLIME));
        this.setRegistryName("rotten_flesh_block");
        }
}
