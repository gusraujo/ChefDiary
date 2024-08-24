package com.codenough.chefsdiary.infrastructure.persistence.model;

import com.codenough.chefsdiary.core.entity.enums.MealCategory;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Builder
@Document(collection = "recipes")
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class RecipeEntity {

    @Id
    private String id; // If null, MongoDB will auto-generate an ID

    @Field(name = "name")
    private String name;

    @Field(name = "prep_time")
    private BigDecimal preparationTime;

    @Field(name = "category")
    private MealCategory category;

    // Embedding the IngredientEntity documents directly within the RecipeEntity document
    private Set<IngredientEntity> ingredients;

    @Field(name = "steps")
    private Set<String> steps;
}
