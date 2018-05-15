package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by Machin on 3/27/18.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
