package org.gloomybanana.compressedblock.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EggCrate extends Block {
    public EggCrate(){
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(1.5F)
                .sound(SoundType.WOOD));
        this.setRegistryName("egg_crate");
    }
}
