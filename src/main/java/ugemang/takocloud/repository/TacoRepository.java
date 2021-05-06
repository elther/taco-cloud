package ugemang.takocloud.repository;

import org.springframework.data.repository.CrudRepository;
import ugemang.takocloud.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco,Long> {
}
