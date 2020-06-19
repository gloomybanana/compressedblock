package org.gloomybanana.compressedblock.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BeetrootSeedsSack extends Block {

    public BeetrootSeedsSack() {
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("beetroot_seeds_sack");
    }
}
