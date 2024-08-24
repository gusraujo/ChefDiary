package com.codenough.chefsdiary.infrastructure.persistence;

import com.codenough.chefsdiary.core.application.port.RecipeRepository;
import com.codenough.chefsdiary.core.entity.Recipe;
import com.codenough.chefsdiary.infrastructure.persistence.mapper.RecipeJpaMapper;
import com.codenough.chefsdiary.infrastructure.persistence.repository.RecipeMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RecipeRepositoryAdapter implements RecipeRepository {

    private final RecipeMongoRepository recipeRepository;

    private final RecipeJpaMapper recipeJpaMapper;

    @Override
    public Recipe createRecipe(Recipe recipe) {
        final var recipeEntity = recipeJpaMapper.toEntity(recipe);
        final var savedRecipeEntity = recipeRepository.save(recipeEntity);

        return recipeJpaMapper.toDomain(savedRecipeEntity);
    }
}
