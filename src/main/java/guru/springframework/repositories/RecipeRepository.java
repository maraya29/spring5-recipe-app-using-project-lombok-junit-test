package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Machin on 3/13/18.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
