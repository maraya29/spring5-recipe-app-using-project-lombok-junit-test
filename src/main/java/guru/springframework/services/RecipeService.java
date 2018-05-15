package guru.springframework.services;

import java.util.Set;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.Recipe;

/**
 * Created by Machin on 3/13/18.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
    
    Recipe findById(Long l);
    
    RecipeCommand findCommandById(Long l);
    
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    
    void deleteById(Long idToDelete);
}
