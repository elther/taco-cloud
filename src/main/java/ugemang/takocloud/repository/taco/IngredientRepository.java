package ugemang.takocloud.repository.taco;

import org.springframework.data.repository.CrudRepository;
import ugemang.takocloud.domain.taco.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
