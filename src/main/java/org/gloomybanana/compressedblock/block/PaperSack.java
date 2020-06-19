package org.gloomybanana.compressedblock.block;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;

public class PaperSack extends Block{
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public PaperSack(){
        super(Block.Properties
                .create(Material.WOOD)
                .hardnessAndResistance(0.5F)
                .sound(SoundType.CLOTH));
        this.setRegistryName("paper_sack");
    }

}
