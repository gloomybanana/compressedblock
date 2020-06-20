package org.gloomybanana.compressedblock.block;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

public class StringBlock extends RotatedPillarBlock {

    public StringBlock(){
        super(Block.Properties
                .create(Material.WOOL)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("string_block");
    }
}
