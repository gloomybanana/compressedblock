package org.gloomybanana.compressedblock.block.bondedwool;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BondedRedWool extends Block {
    public BondedRedWool() {
        super(Properties
                .create(Material.WOOL)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("bonded_red_wool");
    }
}
