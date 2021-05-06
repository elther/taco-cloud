package ugemang.takocloud.repository.order;

import org.springframework.data.repository.CrudRepository;
import ugemang.takocloud.domain.order.Order;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
