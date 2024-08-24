package datahelpers;

import com.codenough.chefsdiary.core.entity.Recipe;
import com.codenough.chefsdiary.core.entity.enums.MealCategory;

import java.math.BigDecimal;
import java.util.Set;

import static com.codenough.chefsdiary.core.entity.enums.MealCategory.DINNER_OR_LUNCH;
import static datahelpers.IngredientDataGenerator.*;

public class RecipeDataGenerator {

    public static final Recipe SPAGHETTI_BOLOGNESE = new Recipe("Spaghetti Bolognese", DINNER_OR_LUNCH, Set.of(ONIONS, SALSA, BEEF, PASTA), Set.of("Boil the water"), BigDecimal.valueOf(0.5));
}
