package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Historical;
import com.projet.ah_fashion.service.HistoricalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class HistoricalController {
    private HistoricalService historicalService;
    @PostMapping("/create")
    public Historical create(@RequestBody Historical facture){
        return historicalService.create(facture);
    }
    @GetMapping("/read")
    public List<Historical> read(){
        return historicalService.read();
    }
    @GetMapping("/read/{id}")
    public Optional<Historical> readById(@PathVariable("id") Long id){
        return historicalService.readById(id);
    }
    @PutMapping("/update")
    public Historical update( @RequestBody Historical facture){
        return historicalService.update(facture);
    }
    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable("id") Long id){
        return historicalService.delete(id);
    }
}
