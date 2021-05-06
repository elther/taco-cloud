package ugemang.takocloud.repository.taco;

import org.springframework.data.repository.CrudRepository;
import ugemang.takocloud.domain.taco.Taco;

public interface TacoRepository extends CrudRepository<Taco,Long> {
}
