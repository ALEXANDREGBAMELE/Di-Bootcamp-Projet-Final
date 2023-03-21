package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Delivery;
import com.projet.ah_fashion.service.DeliveryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class DeliveryController {
    private DeliveryService deliveryService;
    @PostMapping("/delivery")
    public Delivery create(@RequestBody Delivery delivery){
        return deliveryService.create(delivery);
    }
    @GetMapping("/delivery")
    public List<Delivery> read(){
        return deliveryService.read();
    }
    @GetMapping("/delivery/{delivery_id}")
    public Optional<Delivery> readById( @PathVariable("delivery_id") Long id){
        return deliveryService.readById(id);
    }
    public Delivery update(Delivery delivery){
        return deliveryService.update(delivery);
    }
    @DeleteMapping("/delivery")
    public String delete(Long delivery_id){
        return deliveryService.delete(delivery_id);
    }

}
