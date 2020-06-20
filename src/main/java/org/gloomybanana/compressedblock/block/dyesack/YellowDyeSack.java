package org.gloomybanana.compressedblock.block.dyesack;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class YellowDyeSack extends Block {
    public YellowDyeSack(){
        super(Properties
                .create(Material.WOOD)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("yellow_dye_sack");
    }
}
