package org.gloomybanana.compressedblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CoalBall extends Item {
    public CoalBall() {
        super(new Properties().group(ItemGroup.MATERIALS));
        this.setRegistryName("coal_ball");
    }
}
