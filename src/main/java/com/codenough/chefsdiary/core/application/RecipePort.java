package com.codenough.chefsdiary.core.application;

import com.codenough.chefsdiary.core.entity.Recipe;

import java.util.Set;

public interface RecipePort {

    Recipe createRecipe(Recipe recipe);
}
