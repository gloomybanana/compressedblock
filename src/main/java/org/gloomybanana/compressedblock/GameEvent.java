package org.gloomybanana.compressedblock;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE)
public class GameEvent {

    @SubscribeEvent
    public static void onUsingBow(ArrowNockEvent event){

        PlayerEntity player = event.getPlayer();
        NonNullList<ItemStack> mainInventory = player.inventory.mainInventory;

        boolean hasArrowSack = false;
        boolean hasEmptySlot = false;
        boolean hasArrow = false;

        ItemStack lastArrowSack = new ItemStack(Items.AIR);
        ItemStack arrowStack = new ItemStack(Items.ARROW);
        arrowStack.setCount(9);
        ItemStack spectralArrowSack = new ItemStack(Items.SPECTRAL_ARROW);
        spectralArrowSack.setCount(9);

        for (ItemStack itemStack : mainInventory) {
            if(itemStack.getTranslationKey().contentEquals("item.compressedblock.arrow_sack")||itemStack.getTranslationKey().contentEquals("item.compressedblock.spectral_arrow_sack")){
                hasArrowSack = true;
                lastArrowSack = itemStack;
            }
            if (itemStack.isEmpty()){
                hasEmptySlot = true;
            }
            if (itemStack.getTranslationKey().contentEquals("item.minecraft.arrow")||itemStack.getTranslationKey().contentEquals("item.minecraft.spectral_arrow")||itemStack.getTranslationKey().contains("item.minecraft.tipped_arrow")){
                hasArrow = true;

            }
        }
        if (hasArrowSack&&hasEmptySlot&&(!hasArrow)){
            lastArrowSack.setCount(lastArrowSack.getCount()-1);
            if (lastArrowSack.getTranslationKey().contentEquals("item.compressedblock.arrow_sack")){
                ItemHandlerHelper.giveItemToPlayer(player,arrowStack);
            }else {
                ItemHandlerHelper.giveItemToPlayer(player,spectralArrowSack);
            }
        }
    }

}
