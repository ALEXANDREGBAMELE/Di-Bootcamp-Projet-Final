package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Delivery;

import java.util.List;
import java.util.Optional;

public interface DeliveryService {
    Delivery create(Delivery delivery);
    List<Delivery> read();
    Optional<Delivery> readById(Long id);
    Delivery update(Delivery delivery);
    String delete(Long id);
}
