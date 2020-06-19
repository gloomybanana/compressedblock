package org.gloomybanana.compressedblock.block;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PrismarineCrystalsCrate extends Block{
    public PrismarineCrystalsCrate(){
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(1.5F)
                .sound(SoundType.WOOD)
                .lightValue(10));
        this.setRegistryName("prismarine_crystals_crate");
    }
}
