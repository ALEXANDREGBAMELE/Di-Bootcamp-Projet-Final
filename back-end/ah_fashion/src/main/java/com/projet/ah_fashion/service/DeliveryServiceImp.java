package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Delivery;
import com.projet.ah_fashion.repository.DeliveryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class DeliveryServiceImp implements DeliveryService {
    private final DeliveryRepository deliveryRepository;
    @Override
    public Delivery create(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public List<Delivery> read() {
        return deliveryRepository.findAll();
    }

    @Override
    public Optional<Delivery> readById(Long delivery_id) {
        return deliveryRepository.findById(delivery_id);
    }

    @Override
    public Delivery update(Delivery delivery) {
        return deliveryRepository.findById(delivery.getDelivery_id()) .map(delivery1 -> {
            delivery1.setPrice(delivery.getPrice());
            delivery1.setDate(delivery.getDate());
            return deliveryRepository.save(delivery1);
        }) .orElseThrow(() -> new RuntimeException("Objet Not found"));
    }

    @Override
    public String delete(Long delivery_id) {
        deliveryRepository.deleteById(delivery_id);
        return "Deleted is successfully";
    }
}
