package org.gloomybanana.compressedblock.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EnderPearBlock extends Block{
    public EnderPearBlock(){
        super(Block.Properties
                .create(Material.GLASS)
                .hardnessAndResistance(1.5F)
                .sound(SoundType.GLASS)
                .lightValue(7));
        this.setRegistryName("ender_pear_block");
    }
}
