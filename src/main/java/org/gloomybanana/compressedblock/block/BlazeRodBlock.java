package org.gloomybanana.compressedblock.block;


import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

public class BlazeRodBlock extends RotatedPillarBlock {

    public BlazeRodBlock() {
        super(Block.Properties
                .create(Material.BAMBOO)
                .hardnessAndResistance(1.5F)
                .sound(SoundType.CLOTH)
                .lightValue(15));
        this.setRegistryName("blaze_rod_block");
    }
}
