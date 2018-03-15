package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Machin on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
