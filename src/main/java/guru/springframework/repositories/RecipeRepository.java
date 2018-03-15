package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Machin on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
