package com.recipeapp.RecipeApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipeapp.RecipeApp.domain.UserMeal;
import com.recipeapp.RecipeApp.service.UserMealService;

import java.util.Map;

@RestController
@RequestMapping("/api/user-meals")
public class UserMealController {

    @Autowired
    private UserMealService userMealService;
 
    @PostMapping("")
    public ResponseEntity<?> createUserMeal(@RequestBody Map<String, Object> payload) {
        UserMeal newUserMeal = userMealService.createUserMeal(payload);
        return ResponseEntity.ok(newUserMeal);
    }
}
