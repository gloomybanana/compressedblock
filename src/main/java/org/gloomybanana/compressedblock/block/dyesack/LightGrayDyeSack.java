package org.gloomybanana.compressedblock.block.dyesack;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LightGrayDyeSack extends Block {
    public LightGrayDyeSack(){
        super(Properties
                .create(Material.WOOD)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("light_gray_dye_sack");
    }
}
