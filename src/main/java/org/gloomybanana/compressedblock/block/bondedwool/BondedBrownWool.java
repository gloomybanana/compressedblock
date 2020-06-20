package org.gloomybanana.compressedblock.block.bondedwool;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BondedBrownWool extends Block {
    public BondedBrownWool() {
        super(Properties
                .create(Material.WOOL)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("bonded_brown_wool");
    }
}
