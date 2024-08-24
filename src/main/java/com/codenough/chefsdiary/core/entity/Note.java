package com.codenough.chefsdiary.core.entity;

import com.codenough.chefsdiary.core.entity.enums.DifficultyType;

import java.util.Date;

public record Note(Recipe recipe, DifficultyType difficulty, String comment, Date date) {
}
