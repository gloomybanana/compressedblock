package org.gloomybanana.compressedblock.block;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class WheatSeedsSack extends Block{
    public WheatSeedsSack(){
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("wheat_seeds_sack");
    }
}
