package com.codenough.chefsdiary.core.application.port;

import com.codenough.chefsdiary.core.entity.Recipe;

public interface RecipeRepository {

    Recipe createRecipe(Recipe recipe);
}
