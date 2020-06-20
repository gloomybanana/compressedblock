package org.gloomybanana.compressedblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SpectralArrowSack extends Item {
    public SpectralArrowSack() {
        super(new Properties().group(ItemGroup.COMBAT));
        this.setRegistryName("spectral_arrow_sack");
    }
}
