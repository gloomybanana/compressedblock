package org.gloomybanana.compressedblock.block;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GlowstoneDustSack extends Block{
    public GlowstoneDustSack(){
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH)
                .setLightLevel(b -> 15)
        );
        this.setRegistryName("glowstone_dust_sack");
    }
}
