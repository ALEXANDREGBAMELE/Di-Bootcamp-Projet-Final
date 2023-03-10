package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Historical;
import com.projet.ah_fashion.model.OrderClothing;

import java.util.List;
import java.util.Optional;

public interface OrderClothingService {
    OrderClothing create(OrderClothing orderClothing);
    List<OrderClothing> read();
    Optional<OrderClothing> readById(Long id);
    OrderClothing update(OrderClothing orderClothing);
    String delete(Long id);
}
