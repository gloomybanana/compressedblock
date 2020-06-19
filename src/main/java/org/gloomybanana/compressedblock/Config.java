package org.gloomybanana.compressedblock;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec.BooleanValue enableBeetrootSeedsSack;
    public static ForgeConfigSpec.BooleanValue enableBlazeRodBlock;
    public static ForgeConfigSpec.BooleanValue enableBoneSack;
    public static ForgeConfigSpec.BooleanValue enableCodCrate;
    public static ForgeConfigSpec.BooleanValue enableEggCrate;
    public static ForgeConfigSpec.BooleanValue enableEnderPearBlock;
    public static ForgeConfigSpec.BooleanValue enableFeatherSack;
    public static ForgeConfigSpec.BooleanValue enableFlintBlock;
    public static ForgeConfigSpec.BooleanValue enableGlowstoneBlock;
    public static ForgeConfigSpec.BooleanValue enablePaperSack;
    public static ForgeConfigSpec.BooleanValue enablePrismarineCrystalsCrate;
    public static ForgeConfigSpec.BooleanValue enablePrismarineShardCrate;
    public static ForgeConfigSpec.BooleanValue enableRottenFleshBlock;
    public static ForgeConfigSpec.BooleanValue enableSalmonCrate;
    public static ForgeConfigSpec.BooleanValue enableSpiderEyeSack;
    public static ForgeConfigSpec.BooleanValue enableStringSack;
    public static ForgeConfigSpec.BooleanValue enableWheatSeedsSack;
    public static ForgeConfigSpec.BooleanValue enableDiamondRecips;



    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("General settings").push("general");

        enableBeetrootSeedsSack = COMMON_BUILDER.comment("").define("enableBeetrootSeedsSack", true);
        enableBlazeRodBlock = COMMON_BUILDER.comment("").define("enableBlazeRodBlock", true);
        enableBoneSack = COMMON_BUILDER.comment("").define("enableBoneSack", true);
        enableCodCrate = COMMON_BUILDER.comment("").define("enableCodCrate", true);
        enableEggCrate = COMMON_BUILDER.comment("").define("enableEggCrate", true);
        enableEnderPearBlock = COMMON_BUILDER.comment("").define("enableEnderPearBlock", true);
        enableFeatherSack = COMMON_BUILDER.comment("").define("enableFeatherSack", true);
        enableFlintBlock = COMMON_BUILDER.comment("").define("enableFlintBlock", true);
        enableGlowstoneBlock = COMMON_BUILDER.comment("").define("enableGlowstoneBlock", true);
        enablePaperSack = COMMON_BUILDER.comment("").define("enablePaperSack", true);
        enablePrismarineCrystalsCrate = COMMON_BUILDER.comment("").define("enablePrismarineCrystalsCrate", true);
        enablePrismarineShardCrate = COMMON_BUILDER.comment("").define("enablePrismarineShardCrate", true);
        enableRottenFleshBlock = COMMON_BUILDER.comment("").define("enableRottenFleshBlock", true);
        enableSalmonCrate = COMMON_BUILDER.comment("").define("enableSalmonCrate", true);
        enableSpiderEyeSack = COMMON_BUILDER.comment("").define("enableSpiderEyeSack", true);
        enableStringSack = COMMON_BUILDER.comment("").define("enableStringSack", true);
        enableWheatSeedsSack = COMMON_BUILDER.comment("").define("enableWheatSeedsSack", true);
        enableDiamondRecips = COMMON_BUILDER.comment("if false,the coal dust,coal ball,coal block and coal chunk will be removed.").define("enableDiamondRecips", true);

        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}
