package org.gloomybanana.compressedblock.block;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

public class StringSack extends RotatedPillarBlock {

    public StringSack(){
        super(Block.Properties
                .create(Material.WOOL)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("string_sack");
    }
}
