package com.codenough.chefsdiary.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

    @GetMapping("/recipes")
    public String getRecipes() {
        return "recipes";
    }

    @PostMapping("/recipes")
    public String createRecipe() {
        return "recipes";
    }
}
