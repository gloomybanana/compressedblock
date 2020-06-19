package org.gloomybanana.compressedblock.block;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PrismarineShardCrate extends Block{
    public PrismarineShardCrate(){
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(1.5F)
                .sound(SoundType.WOOD));
        this.setRegistryName("prismarine_shard_crate");
    }
}
