package org.gloomybanana.compressedblock;

import net.minecraft.block.Block;
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
        event.getRegistry().register(AllBlocks.glowstoneDustSack);
        event.getRegistry().register(AllBlocks.paperSack);
        event.getRegistry().register(AllBlocks.prismarineCrystalsCrate);
        event.getRegistry().register(AllBlocks.prismarineShardCrate);
        event.getRegistry().register(AllBlocks.rottenFleshBlock);
        event.getRegistry().register(AllBlocks.salmonCrate);
        event.getRegistry().register(AllBlocks.spiderEyeSack);
        event.getRegistry().register(AllBlocks.stringBlock);
        event.getRegistry().register(AllBlocks.sugarSack);
        event.getRegistry().register(AllBlocks.wheatSeedsSack);

        event.getRegistry().register(AllBlocks.bondedBlackWool);
        event.getRegistry().register(AllBlocks.bondedBlueWool);
        event.getRegistry().register(AllBlocks.bondedBrownWool);
        event.getRegistry().register(AllBlocks.bondedCyanWool);
        event.getRegistry().register(AllBlocks.bondedGrayWool);
        event.getRegistry().register(AllBlocks.bondedGreenWool);
        event.getRegistry().register(AllBlocks.bondedLightBlueWool);
        event.getRegistry().register(AllBlocks.bondedLightGrayWool);
        event.getRegistry().register(AllBlocks.bondedLimeWool);
        event.getRegistry().register(AllBlocks.bondedMagentaWool);
        event.getRegistry().register(AllBlocks.bondedOrangeWool);
        event.getRegistry().register(AllBlocks.bondedPinkWool);
        event.getRegistry().register(AllBlocks.bondedPurpleWool);
        event.getRegistry().register(AllBlocks.bondedRedWool);
        event.getRegistry().register(AllBlocks.bondedWhiteWool);
        event.getRegistry().register(AllBlocks.bondedYellowWool);

        event.getRegistry().register(AllBlocks.blackDyeSack);
        event.getRegistry().register(AllBlocks.blueDyeSack);
        event.getRegistry().register(AllBlocks.brownDyeSack);
        event.getRegistry().register(AllBlocks.cyanDyeSack);
        event.getRegistry().register(AllBlocks.grayDyeSack);
        event.getRegistry().register(AllBlocks.greenDyeSack);
        event.getRegistry().register(AllBlocks.lightBlueDyeSack);
        event.getRegistry().register(AllBlocks.lightGrayDyeSack);
        event.getRegistry().register(AllBlocks.limeDyeSack);
        event.getRegistry().register(AllBlocks.magentaDyeSack);
        event.getRegistry().register(AllBlocks.orangeDyeSack);
        event.getRegistry().register(AllBlocks.pinkDyeSack);
        event.getRegistry().register(AllBlocks.purpleDyeSack);
        event.getRegistry().register(AllBlocks.redDyeSack);
        event.getRegistry().register(AllBlocks.whiteDyeSack);
        event.getRegistry().register(AllBlocks.yellowDyeSack);
    }


    @SubscribeEvent
    public static void onItemsRegister(RegistryEvent.Register<Item> event){
        //Items
        event.getRegistry().register(AllItems.coalBall);
        event.getRegistry().register(AllItems.coalBlock);
        event.getRegistry().register(AllItems.coalChunk);
        event.getRegistry().register(AllItems.coalDust);
        event.getRegistry().register(AllItems.arrowSack);
        event.getRegistry().register(AllItems.spectralArrowSack);

        //BlockItems
        event.getRegistry().register(AllItems.beetrootSeedsSack.setRegistryName(AllBlocks.beetrootSeedsSack.getRegistryName()));
        event.getRegistry().register(AllItems.blazeRodBlock.setRegistryName(AllBlocks.blazeRodBlock.getRegistryName()));
        event.getRegistry().register(AllItems.boneSack.setRegistryName(AllBlocks.boneSack.getRegistryName()));
        event.getRegistry().register(AllItems.codCrate.setRegistryName(AllBlocks.codCrate.getRegistryName()));
        event.getRegistry().register(AllItems.eggCrate.setRegistryName(AllBlocks.eggCrate.getRegistryName()));
        event.getRegistry().register(AllItems.enderPearBlock.setRegistryName(AllBlocks.enderPearBlock.getRegistryName()));
        event.getRegistry().register(AllItems.featherSack.setRegistryName(AllBlocks.featherSack.getRegistryName()));
        event.getRegistry().register(AllItems.flintBlock.setRegistryName(AllBlocks.flintBlock.getRegistryName()));
        event.getRegistry().register(AllItems.glowstoneDustSack.setRegistryName(AllBlocks.glowstoneDustSack.getRegistryName()));
        event.getRegistry().register(AllItems.paperSack.setRegistryName(AllBlocks.paperSack.getRegistryName()));
        event.getRegistry().register(AllItems.prismarineCrystalsCrate.setRegistryName(AllBlocks.prismarineCrystalsCrate.getRegistryName()));
        event.getRegistry().register(AllItems.prismarineShardCrate.setRegistryName(AllBlocks.prismarineShardCrate.getRegistryName()));
        event.getRegistry().register(AllItems.rottenFleshBlock.setRegistryName(AllBlocks.rottenFleshBlock.getRegistryName()));
        event.getRegistry().register(AllItems.salmonCrate.setRegistryName(AllBlocks.salmonCrate.getRegistryName()));
        event.getRegistry().register(AllItems.spiderEyeSack.setRegistryName(AllBlocks.spiderEyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.stringBlock.setRegistryName(AllBlocks.stringBlock.getRegistryName()));
        event.getRegistry().register(AllItems.sugarSack.setRegistryName(AllBlocks.sugarSack.getRegistryName()));
        event.getRegistry().register(AllItems.wheatSeedsSack.setRegistryName(AllBlocks.wheatSeedsSack.getRegistryName()));

        event.getRegistry().register(AllItems.bondedBlackWool.setRegistryName(AllBlocks.bondedBlackWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedBlueWool.setRegistryName(AllBlocks.bondedBlueWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedBrownWool.setRegistryName(AllBlocks.bondedBrownWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedCyanWool.setRegistryName(AllBlocks.bondedCyanWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedGrayWool.setRegistryName(AllBlocks.bondedGrayWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedGreenWool.setRegistryName(AllBlocks.bondedGreenWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedLightBlueWool.setRegistryName(AllBlocks.bondedLightBlueWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedLightGrayWool.setRegistryName(AllBlocks.bondedLightGrayWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedLimeWool.setRegistryName(AllBlocks.bondedLimeWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedMagentaWool.setRegistryName(AllBlocks.bondedMagentaWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedOrangeWool.setRegistryName(AllBlocks.bondedOrangeWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedPinkWool.setRegistryName(AllBlocks.bondedPinkWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedPurpleWool.setRegistryName(AllBlocks.bondedPurpleWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedRedWool.setRegistryName(AllBlocks.bondedRedWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedWhiteWool.setRegistryName(AllBlocks.bondedWhiteWool.getRegistryName()));
        event.getRegistry().register(AllItems.bondedYellowWool.setRegistryName(AllBlocks.bondedYellowWool.getRegistryName()));

        event.getRegistry().register(AllItems.blackDyeSack.setRegistryName(AllBlocks.blackDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.blueDyeSack.setRegistryName(AllBlocks.blueDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.brownDyeSack.setRegistryName(AllBlocks.brownDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.cyanDyeSack.setRegistryName(AllBlocks.cyanDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.grayDyeSack.setRegistryName(AllBlocks.grayDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.greenDyeSack.setRegistryName(AllBlocks.greenDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.lightBlueDyeSack.setRegistryName(AllBlocks.lightBlueDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.lightGrayDyeSack.setRegistryName(AllBlocks.lightGrayDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.limeDyeSack.setRegistryName(AllBlocks.limeDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.magentaDyeSack.setRegistryName(AllBlocks.magentaDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.orangeDyeSack.setRegistryName(AllBlocks.orangeDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.pinkDyeSack.setRegistryName(AllBlocks.pinkDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.purpleDyeSack.setRegistryName(AllBlocks.purpleDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.redDyeSack.setRegistryName(AllBlocks.redDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.whiteDyeSack.setRegistryName(AllBlocks.whiteDyeSack.getRegistryName()));
        event.getRegistry().register(AllItems.yellowDyeSack.setRegistryName(AllBlocks.yellowDyeSack.getRegistryName()));
    }
}
