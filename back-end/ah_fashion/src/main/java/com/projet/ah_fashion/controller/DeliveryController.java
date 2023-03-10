package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Delivery;
import com.projet.ah_fashion.service.DeliveryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/delivery")
@AllArgsConstructor
public class DeliveryController {
    private DeliveryService deliveryService;
    @PostMapping("/create")
    public Delivery create(@RequestBody Delivery delivery){
        return deliveryService.create(delivery);
    }
    @GetMapping("/read")
    public List<Delivery> read(){
        return deliveryService.read();
    }
    @GetMapping("/read/{id}")
    public Optional<Delivery> readById( @PathVariable("id") Long id){
        return deliveryService.readById(id);
    }
    public Delivery update(Delivery delivery){
        return deliveryService.update(delivery);
    }
    @DeleteMapping("/delete")
    public String delete(Long id){
        return deliveryService.delete(id);
    }

}
