package com.codenough.chefsdiary.infrastructure.persistence.mapper;

import com.codenough.chefsdiary.core.entity.Ingredient;
import com.codenough.chefsdiary.core.entity.Recipe;
import com.codenough.chefsdiary.infrastructure.persistence.model.IngredientEntity;
import com.codenough.chefsdiary.infrastructure.persistence.model.RecipeEntity;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class RecipeJpaMapper {

    public RecipeEntity toEntity(Recipe recipe) {
        return RecipeEntity.builder()
                .name(recipe.name())
                .category(recipe.category())
                .ingredients(mapIngredientsEntity(recipe.ingredients()))
                .steps(recipe.steps())
                .preparationTime(recipe.preparationTime())
                .build();
    }

    public Recipe toDomain(RecipeEntity recipeEntity) {
        return new Recipe(
                recipeEntity.getName(),
                recipeEntity.getCategory(),
                mapIngredients(recipeEntity.getIngredients()),
                recipeEntity.getSteps(),
                recipeEntity.getPreparationTime());
    }

    private Set<Ingredient> mapIngredients(Set<IngredientEntity> ingredients) {
        return ingredients.stream()
                .map(ingredientEntity -> new Ingredient(
                        ingredientEntity.getName(),
                        ingredientEntity.getType(),
                        ingredientEntity.getAmount(),
                        ingredientEntity.getUnit()))
                .collect(Collectors.toSet());
    }

    private Set<IngredientEntity> mapIngredientsEntity(Set<Ingredient> ingredients) {
        return ingredients.stream()
                .map(ingredient -> IngredientEntity.builder()
                        .name(ingredient.name())
                        .type(ingredient.type())
                        .amount(ingredient.amount())
                        .unit(ingredient.unit())
                        .build())
                .collect(Collectors.toSet());
    }

}
