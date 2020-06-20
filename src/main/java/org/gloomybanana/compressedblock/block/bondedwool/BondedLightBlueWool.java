package org.gloomybanana.compressedblock.block.bondedwool;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BondedLightBlueWool extends Block {
    public BondedLightBlueWool() {
        super(Properties
                .create(Material.WOOL)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("bonded_light_blue_wool");
    }
}
