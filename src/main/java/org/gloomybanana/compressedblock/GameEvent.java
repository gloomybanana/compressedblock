package org.gloomybanana.compressedblock;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class GameEvent {

    @SubscribeEvent
    public static void onUsingBow(ArrowNockEvent event){
        if (event.getWorld().isRemote()){
            TranslationTextComponent textComponents = new TranslationTextComponent("message.compressedblock.usingbow","1");
            textComponents.getStyle().setColor(TextFormatting.YELLOW);
            event.getPlayer().sendStatusMessage(textComponents,false);
        }


    }

}
