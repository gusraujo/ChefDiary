package com.codenough.chefsdiary.infrastructure.persistence.model;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ingredients")  // Maps to the "ingredients" collection in MongoDB
public class IngredientEntity {

    @Id
    private String id;  // MongoDB will auto-generate this if null

    @Field(name = "name")
    private String name;

    @Field(name = "type")
    private String type;

    @Field(name = "amount")
    private String amount;

    @Field(name = "unit")
    private String unit;
}
