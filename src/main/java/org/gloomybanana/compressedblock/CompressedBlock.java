package org.gloomybanana.compressedblock;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CompressedBlock.ID)
public class CompressedBlock {

    public static final String ID = "compressedblock";
    public static final String NAME = "Compressed Block";
    public static final String VERSION = "1.2c";
    public static final Logger LOGGER = LogManager.getLogger();

    public CompressedBlock(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
//        MinecraftForge.EVENT_BUS.register(this);
    }

    public void setup(final FMLCommonSetupEvent event){

        ComposterBlock.CHANCES.put(AllItems.wheatSeedsSack, 3.0F);
        ComposterBlock.CHANCES.put(AllItems.beetrootSeedsSack,3.0F);
        ComposterBlock.CHANCES.put(AllItems.rottenFleshBlock,3.0F);


    }

}
