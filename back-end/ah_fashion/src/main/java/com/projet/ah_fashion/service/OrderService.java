package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Order;

import java.util.List;
import java.util.Optional;


public interface OrderService {
    Order create(Order order);
    List<Order> read();
    Optional<Order> readById(Long order_id);
    Order update(Order order);
    String delete(Long order_id);
}
