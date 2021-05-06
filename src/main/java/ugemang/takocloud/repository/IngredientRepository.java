package ugemang.takocloud.repository;

import org.springframework.data.repository.CrudRepository;
import ugemang.takocloud.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
