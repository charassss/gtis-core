package com.gtis.gtis.common.recipe;

import gregtech.api.gui.GuiTextures;
import gregtech.api.gui.widgets.ProgressWidget;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.builders.SimpleRecipeBuilder;
import gregtech.core.sound.GTSoundEvents;

/**
 * @author Chara_SS
 */
public class ModRecipeMaps {
    public static final RecipeMap<SimpleRecipeBuilder> STEAM_TEST_RECIPE = new RecipeMap<>("steam_test",
            2,
            1,
            0,
            0,
            new SimpleRecipeBuilder(),
            false)
            .setSlotOverlay(false, false, GuiTextures.FURNACE_OVERLAY_1)
            .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressWidget.MoveType.HORIZONTAL)
            .setSound(GTSoundEvents.FURNACE);
}
