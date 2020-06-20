package org.gloomybanana.compressedblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ArrowSack extends Item {
    public ArrowSack() {
        super(new Properties().group(ItemGroup.COMBAT));
        this.setRegistryName("arrow_sack");
    }
}
