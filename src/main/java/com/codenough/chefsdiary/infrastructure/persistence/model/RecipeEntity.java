package com.codenough.chefsdiary.infrastructure.persistence.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.FetchType.LAZY;

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
    private Double preparationTime;

    @Field(name = "category")
    private String category;

    // Embedding the IngredientEntity documents directly within the RecipeEntity document
    private Set<IngredientEntity> ingredients;
}
