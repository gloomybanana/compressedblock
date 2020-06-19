package org.gloomybanana.compressedblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CoalBlock extends Item {
    public CoalBlock() {
        super(new Properties().group(ItemGroup.MATERIALS));
        this.setRegistryName("coal_block");
    }
}
