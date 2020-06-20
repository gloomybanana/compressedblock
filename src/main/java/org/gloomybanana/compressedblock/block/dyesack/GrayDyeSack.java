package org.gloomybanana.compressedblock.block.dyesack;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GrayDyeSack extends Block {
    public GrayDyeSack(){
        super(Properties
                .create(Material.WOOD)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("gray_dye_sack");
    }
}
