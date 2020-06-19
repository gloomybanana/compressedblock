package org.gloomybanana.compressedblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CoalChunk extends Item{
    public CoalChunk() {
        super(new Item.Properties().group(ItemGroup.MATERIALS));
        this.setRegistryName("coal_chunk");
    }
}
