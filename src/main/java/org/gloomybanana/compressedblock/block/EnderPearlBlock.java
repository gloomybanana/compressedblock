package org.gloomybanana.compressedblock.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EnderPearlBlock extends Block{
    public EnderPearlBlock(){
        super(Block.Properties
                .create(Material.GLASS)
                .hardnessAndResistance(1.5F)
                .sound(SoundType.GLASS)
                .lightValue(7));
        this.setRegistryName("ender_pearl_block");
    }
}
