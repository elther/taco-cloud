package ugemang.takocloud.repository;

import org.springframework.data.repository.CrudRepository;
import ugemang.takocloud.domain.Order;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
