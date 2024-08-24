package datahelpers;

import com.codenough.chefsdiary.core.entity.Ingredient;
import com.codenough.chefsdiary.core.entity.enums.IngredientType;
import com.codenough.chefsdiary.infrastructure.persistence.model.IngredientEntity;

public class IngredientDataGenerator {

        // Ingredients

        // Vegetables
        public static final Ingredient ONIONS = new Ingredient("Onions", IngredientType.VEGETABLES, "100g", 1);

        // Sauces
        public static final Ingredient SALSA = new Ingredient("Salsa", IngredientType.SAUCES, "200g", 1);

        // Meats
        public static final Ingredient BEEF = new Ingredient("Beef", IngredientType.MEATS, "200g", 1);

        // Grains
        public static final Ingredient PASTA = new Ingredient("Pasta", IngredientType.GRAINS, "200g", 1);
}
