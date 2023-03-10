package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Order;
import com.projet.ah_fashion.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class OrderController {
    private OrderService orderService;
    @PostMapping("/create")
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }
    @GetMapping("/read")
    public List<Order> read(){
        return orderService.read();
    }
    @GetMapping("/read/{id}")
    public Optional<Order> readById(@PathVariable("id") Long id){
        return orderService.readById(id);
    }
    @PutMapping("/update")
    public Order update( @RequestBody Order tissu){
        return orderService.update(tissu);
    }
    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable("id") Long id){
        return orderService.delete(id);
    }
}
