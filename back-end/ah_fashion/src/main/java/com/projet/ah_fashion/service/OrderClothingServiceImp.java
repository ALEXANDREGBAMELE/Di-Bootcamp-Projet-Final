package com.projet.ah_fashion.service;
import com.projet.ah_fashion.repository.OrderClothingRepository;
import com.projet.ah_fashion.model.OrderClothing;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class OrderClothingServiceImp implements OrderClothingService {
    private final OrderClothingRepository orderClothingRepository;
    @Override
    public OrderClothing create(OrderClothing orderClothing) {
        return orderClothingRepository.save(orderClothing);
    }

    @Override
    public List<OrderClothing> read() {
        return null;
    }

    @Override
    public Optional<OrderClothing> readById(Long id) {
        return Optional.empty();
    }

    @Override
    public OrderClothing update(OrderClothing orderClothing) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }


//   private  final OrderClothingRepository orderClothingRepository;
//    @Override
//    public OrderClothing create(OrderClothing orderClothing) {
//        return orderClothingRepository.save(orderClothing);
//    }
//
//    @Override
//    public List<OrderClothing> read() {
//        return orderClothingRepository.findAll();
//    }
//
//    @Override
//    public Optional<OrderClothing> readById(Long id) {
//        return orderClothingRepository.findById(id);
//    }
//
//    @Override
//    public OrderClothing update(OrderClothing orderClothing) {
//        return orderClothingRepository.findById(orderClothing.getId())
//                .map(
//                        orderClothing1 -> {
//
//                            return orderClothingRepository.save(orderClothing1);
//                        }) .orElseThrow(() -> new RuntimeException("Objet not fund !"));
//    }
//
//    @Override
//    public String delete(Long id) {
//        orderClothingRepository.deleteById(id);
//        return "deleted succefuly";
//    }
}
