package com.nightowl.ingredients;

import com.nightowl.recipes.Recipe;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface IngredientDAO {

    List<Ingredient> selectIngredients();
    int insertIngredient(Ingredient ingredient);
    int deleteIngredient(int id);
    Optional<Ingredient> selectIngredientById(int id);
    int updateIngredient(Ingredient ingredient, Integer id);
}
