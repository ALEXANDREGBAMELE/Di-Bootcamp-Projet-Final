package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Order;
import com.projet.ah_fashion.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class OrderController {

    private OrderService orderService;
    @PostMapping("/order")
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }
    @GetMapping("/order")
    public List<Order> read(){
        return orderService.read();
    }
    @GetMapping("/order/{id}")
    public Optional<Order> readById(@PathVariable("order_id") Long order_id){
        return orderService.readById(order_id);
    }
    @PutMapping("/order")
    public Order update( @RequestBody Order tissu){
        return orderService.update(tissu);
    }
    @DeleteMapping("/order/{order_id}")
    public String delete( @PathVariable("order_id") Long order_id){
        return orderService.delete(order_id);
    }
}
