package ugemang.takocloud.repository;

import ugemang.takocloud.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
