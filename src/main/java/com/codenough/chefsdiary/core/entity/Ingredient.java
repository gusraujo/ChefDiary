package com.codenough.chefsdiary.core.entity;

import com.codenough.chefsdiary.core.entity.enums.IngredientType;

public record Ingredient(String name, IngredientType type, String amount, String unit) {
}
