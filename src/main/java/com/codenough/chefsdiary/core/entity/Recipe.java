package com.codenough.chefsdiary.core.entity;

import com.codenough.chefsdiary.core.entity.enums.MealCategory;

import java.math.BigDecimal;
import java.util.Set;

public record Recipe(String id, String name, MealCategory category, Set<Ingredient> ingredients, Set<String> steps,
                     BigDecimal preparationTime) {
}
