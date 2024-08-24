package datahelpers;

import com.codenough.chefsdiary.core.entity.Ingredient;
import com.codenough.chefsdiary.core.entity.Recipe;
import com.codenough.chefsdiary.core.entity.enums.MealCategory;
import com.codenough.chefsdiary.infrastructure.persistence.model.IngredientEntity;
import com.codenough.chefsdiary.infrastructure.persistence.model.RecipeEntity;

import java.math.BigDecimal;
import java.util.Set;

import static com.codenough.chefsdiary.core.entity.enums.MealCategory.DINNER_OR_LUNCH;
import static datahelpers.IngredientDataGenerator.*;

public class RecipeDataGenerator {

    public static final Recipe SPAGHETTI_BOLOGNESE = new Recipe("Spaghetti Bolognese", DINNER_OR_LUNCH, Set.of(ONIONS, SALSA, BEEF, PASTA), Set.of("Boil the water"), BigDecimal.valueOf(0.5));

    public static RecipeEntity createRecipeEntity(Recipe recipe) {
        return RecipeEntity.builder()
                .name(recipe.name())
                .category(recipe.category())
                .ingredients(mapIngredientsEntity(recipe.ingredients()))
                .steps(recipe.steps())
                .preparationTime(recipe.preparationTime())
                .build();
    }

    private static Set<IngredientEntity> mapIngredientsEntity(Set<Ingredient> ingredients) {
        return ingredients.stream()
                .map(ingredient -> IngredientEntity.builder()
                        .name(ingredient.name())
                        .type(ingredient.type())
                        .amount(ingredient.amount())
                        .unit(ingredient.unit())
                        .build())
                .collect(java.util.stream.Collectors.toSet());
    }

}
