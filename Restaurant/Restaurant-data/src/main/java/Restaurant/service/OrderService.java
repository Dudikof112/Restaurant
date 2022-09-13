package Restaurant.service;

import Restaurant.model.Order;

import java.util.Set;

public interface OrderService {

    Order findById(Long id);
    Order save(Order order);
    Set<Order> findAll();
}
