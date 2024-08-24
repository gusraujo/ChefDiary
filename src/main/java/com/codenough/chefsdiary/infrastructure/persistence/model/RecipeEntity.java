package com.codenough.chefsdiary.infrastructure.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "recipe")
public class RecipeEntity {

    @Id
    @GeneratedValue
    private String id;
}
