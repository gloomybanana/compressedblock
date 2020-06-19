package org.gloomybanana.compressedblock.block;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GlowstoneBlock extends Block{
    public GlowstoneBlock(){
        super(Block.Properties
                .create(Material.GLASS)
                .hardnessAndResistance(1.5F)
                .sound(SoundType.GLASS)
                .lightValue(15));
        this.setRegistryName("glowstone_block");
    }
}
