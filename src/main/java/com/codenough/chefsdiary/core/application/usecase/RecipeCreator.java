package com.codenough.chefsdiary.core.application.usecase;

import com.codenough.chefsdiary.core.application.port.RecipeRepository;
import com.codenough.chefsdiary.core.entity.Recipe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RecipeCreator {

    private final RecipeRepository recipeRepository;

    public Recipe createRecipe(Recipe recipe) {
        return recipe;
    }
}
