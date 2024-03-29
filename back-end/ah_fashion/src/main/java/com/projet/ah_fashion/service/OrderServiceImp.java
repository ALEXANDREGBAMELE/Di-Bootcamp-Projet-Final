package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Order;
import com.projet.ah_fashion.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class OrderServiceImp implements OrderService{
    private OrderRepository orderRepository;
    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> read() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> readById(Long order_id) {
        return orderRepository.findById(order_id);
    }

    @Override
    public Order update(Order order) {
        return orderRepository.findById(order.getOrder_id())
                .map(
                        order1 -> {
                            order1.setComment(order.getComment());
                            order1.setDate(order.getDate());
                            return orderRepository.save(order1);
                        }) .orElseThrow(() -> new RuntimeException("Objet not fund !"));
    }

    @Override
    public String delete(Long order_id) {
        orderRepository.deleteById(order_id);
        return "deleted succefuly";
    }
}
