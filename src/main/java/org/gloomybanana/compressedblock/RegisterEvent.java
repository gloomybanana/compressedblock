package org.gloomybanana.compressedblock;

import com.mojang.datafixers.TypeRewriteRule;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegisterEvent {
    @SubscribeEvent
    public static void onBlocksRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().register(AllBlocks.beetrootSeedsSack);
        event.getRegistry().register(AllBlocks.blazeRodBlock);
        event.getRegistry().register(AllBlocks.boneSack);
        event.getRegistry().register(AllBlocks.codCrate);
        event.getRegistry().register(AllBlocks.eggCrate);
        event.getRegistry().register(AllBlocks.enderPearBlock);
        event.getRegistry().register(AllBlocks.featherSack);
        event.getRegistry().register(AllBlocks.flintBlock);
        event.getRegistry().register(AllBlocks.glowstoneBlock);
        event.getRegistry().register(AllBlocks.paperSack);
        event.getRegistry().register(AllBlocks.prismarineCrystalsCrate);
        event.getRegistry().register(AllBlocks.prismarineShardCrate);
        event.getRegistry().register(AllBlocks.rottenFleshBlock);
        event.getRegistry().register(AllBlocks.salmonCrate);
        event.getRegistry().register(AllBlocks.spiderEyeSack);
        event.getRegistry().register(AllBlocks.stringSack);
        event.getRegistry().register(AllBlocks.wheatSeedsSack);
    }


    @SubscribeEvent
    public static void onItemsRegister(RegistryEvent.Register<Item> event){
        //Items
        if (Config.enableDiamondRecips.get()){
            event.getRegistry().register(AllItems.coalBall);
            event.getRegistry().register(AllItems.coalBlock);
            event.getRegistry().register(AllItems.coalChunk);
            event.getRegistry().register(AllItems.coalDust);
        }
        //BlockItems
        event.getRegistry().register(AllItems.beetrootSeedsSack.setRegistryName(AllBlocks.beetrootSeedsSack.getRegistryName()));
        event.getRegistry().register(AllItems.blazeRodBlock.setRegistryName(AllBlocks.blazeRodBlock.getRegistryName()));
        event.getRegistry().register(AllItems.boneSack.setRegistryName(AllBlocks.boneSack.getRegistryName()));
        event.getRegistry().register(AllItems.codCrate.setRegistryName(AllBlocks.codCrate.getRegistryName()));
        event.getRegistry().register(AllItems.eggCrate.setRegistryName(AllBlocks.eggCrate.getRegistryName()));
        event.getRegistry().register(AllItems.enderPearBlock.setRegistryName(AllBlocks.enderPearBlock.getRegistryName()));
        event.getRegistry().register(AllItems.featherSack.setRegistryName(AllBlocks.featherSack.getRegistryName()));
        event.getRegistry().register(AllItems.flintBlock.setRegistryName(AllBlocks.flintBlock.getRegistryName()));
        event.getRegistry().register(AllItems.glowstoneBlock.setRegistryName(AllBlocks.glowstoneBlock.getRegistryName()));
        event.getRegistry().register(AllItems.paperSack.setRegistryName(AllBlocks.paperSack.getRegistryName()));
        event.getRegistry().register(AllItems.prismarineCrystalsCrate.setRegistryName(AllBlocks.prismarineCrystalsCrate.getRegistryName()));
        event.getRegistry().register(AllItems.prismarineShardCrate.setRegistryName(AllBlocks.prismarineShardCrate.getRegistryName()));
        event.getRegistry().register(AllItems.rottenFleshBlock.setRegistryName(AllBlocks.rottenFleshBlock.getRegistryName()));
        event.getRegistry().register(AllItems.salmonCrate.setRegistryName(AllBlocks.salmonCrate.getRegistryName()));
        event.getRegistry().register(AllItems.spiderEyeSack.setRegistryName(AllBlocks.spiderEyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.stringSack.setRegistryName(AllBlocks.stringSack.getRegistryName()));
        event.getRegistry().register(AllItems.wheatSeedsSack.setRegistryName(AllBlocks.wheatSeedsSack.getRegistryName()));
    }
}
