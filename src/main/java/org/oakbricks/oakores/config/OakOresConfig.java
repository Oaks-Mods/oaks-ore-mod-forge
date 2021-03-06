package org.oakbricks.oakores.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class OakOresConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> enableEnderite;
    public static final ForgeConfigSpec.ConfigValue<Boolean> enableNetherOres;

    public static final ForgeConfigSpec.ConfigValue<Integer> purpiVeinSize;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiMinHeight;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiMaxHeight;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiAmount;

    public static final ForgeConfigSpec.ConfigValue<Integer> leadAmount;
    public static final ForgeConfigSpec.ConfigValue<Integer> leadVeinSize;
    public static final ForgeConfigSpec.ConfigValue<Integer> leadMaxHeight;

    public static final ForgeConfigSpec.ConfigValue<Integer> deepLeadAmount;
    public static final ForgeConfigSpec.ConfigValue<Integer> deepLeadVeinSize;

    public static final ForgeConfigSpec.ConfigValue<Integer> enderiteAmount;
    public static final ForgeConfigSpec.ConfigValue<Integer> enderiteVeinSize;
    public static final ForgeConfigSpec.ConfigValue<Boolean> fixOresSpawningInNonStoneBlocks;

    public static final ForgeConfigSpec.ConfigValue<Integer> netherPurpiVeinSize;
    public static final ForgeConfigSpec.ConfigValue<Integer> netherPurpiAmount;

    static {

        BUILDER.push("Config for OakOres - Master");

        enableEnderite = BUILDER.comment("Enables OakOres' Enderite support").worldRestart().define("Enable OakOres' Enderite support", true);

        enableNetherOres = BUILDER.comment("Enables OakOres' ability to generate ores in the nether").worldRestart().define("Enable OakOres' Nether Ores", true);

        BUILDER.push("Config for OakOres - Purpi Ore Gen");

        purpiVeinSize = BUILDER.comment("Size of a Purpi Ore vein, default value is 6, maximum value of 64.").worldRestart().defineInRange("Purpi Ore Vein Size", 6, 0, 64);
        purpiMinHeight = BUILDER.comment("Minimum height for Purpi Ore to generate in a world, default value is 5, maximum value of 256.").worldRestart().defineInRange("Purpi Ore Minimum Height", 5, 0, 256);
        purpiMaxHeight = BUILDER.comment("Maximum height for Purpi Ore to generate in a world, default value is 28, maximum value of 256.").worldRestart().defineInRange("Purpi Ore Maximum Height", 28, 0, 256);
        purpiAmount = BUILDER.comment("Amount of Purpi Ore in a world, default value is 10, maximum value of 64").worldRestart().defineInRange("Purpi Ore Amount", 10, 0, 64);

        BUILDER.push("Config for OakOres - Nether Purpi Ore Gen");

        netherPurpiVeinSize = BUILDER.comment("Size of a Nether Purpi Ore vein, default value is 3, maximum value of 32.").worldRestart().defineInRange("Nether Purpi Ore Vein Size", 3, 0, 32);
        netherPurpiAmount = BUILDER.comment("Amount of Nether Purpi Ore in the nether, default value is 4, maximum value of 32").worldRestart().defineInRange("Nether Purpi Ore Amount", 4, 0, 32);

        BUILDER.pop();

        BUILDER.pop();

        BUILDER.push("Config for OakOres - Lead Ore Gen");

        leadVeinSize = BUILDER.comment("Size of Lead Ore veins, default value is 16, maximum value of 64.").worldRestart().defineInRange("Lead Ore Vein Size", 16, 0, 64);
        leadAmount = BUILDER.comment("Amount of Lead Ore in a world, default value is 25, maximum value of 64.").worldRestart().defineInRange("Lead Ore Amount", 25, 0, 64);
        leadMaxHeight = BUILDER.comment("Maximum height for Lead Ore to generate in a world, default value is 256, maximum value of 256.").worldRestart().defineInRange("Lead Ore Maximum Height", 256, 0, 256);

        BUILDER.pop();

        BUILDER.push("Config for OakOres - Deepslate Lead Ore Gen");

        deepLeadVeinSize = BUILDER.comment("Size of Deepslate Lead Ore veins, default value is 9, maximum value of 64.").worldRestart().defineInRange("Deepslate Lead Ore Vein Size", 9, 0, 64);
        deepLeadAmount = BUILDER.comment("Amount of Deepslate Lead Ore in a world, default value is 4, maximum value of 64.").worldRestart().defineInRange("Deepslate Lead Ore Amount", 4, 0, 64);


        BUILDER.pop();

        BUILDER.push("Config for OakOres - Enderite Ore Gen");

        enderiteVeinSize = BUILDER.comment("Size of Enderite Ore veins, default value is 5, maximum value of 64.").worldRestart().defineInRange("Enderite Ore Vein Size", 5, 0, 64);
        enderiteAmount = BUILDER.comment("Amount of Enderite Ore in a world, default value is 8, maximum value of 64.").worldRestart().defineInRange("Enderite Ore Amount", 8, 0, 64);


        BUILDER.pop();

        BUILDER.push("Config for OakOres - Fixes");

        fixOresSpawningInNonStoneBlocks = BUILDER.comment("Fixes ores spawning in non-stone blocks").worldRestart().define("Fix Ores spawning in Blocks that are not stone", true);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
