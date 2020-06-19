package org.gloomybanana.compressedblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CoalDust extends Item {
    public CoalDust() {
        super(new Item.Properties().group(ItemGroup.MATERIALS));
        this.setRegistryName("coal_dust");
    }
}
