package com.projet.ah_fashion.repository;

import com.projet.ah_fashion.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
