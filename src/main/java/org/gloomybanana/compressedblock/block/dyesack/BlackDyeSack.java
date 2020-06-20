package org.gloomybanana.compressedblock.block.dyesack;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlackDyeSack extends Block {
    public BlackDyeSack(){
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("black_dye_sack");
    }
}
