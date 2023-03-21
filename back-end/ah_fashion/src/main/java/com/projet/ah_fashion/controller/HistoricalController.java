package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Historical;
import com.projet.ah_fashion.service.HistoricalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class HistoricalController {
    private HistoricalService historicalService;
    @PostMapping("/historical")
    public Historical create(@RequestBody Historical facture){
        return historicalService.create(facture);
    }
    @GetMapping("/historical")
    public List<Historical> read(){
        return historicalService.read();
    }
    @GetMapping("/historical/{historical_id}")
    public Optional<Historical> readById(@PathVariable("historical_id") Long id){
        return historicalService.readById(id);
    }
    @PutMapping("/historical")
    public Historical update( @RequestBody Historical facture){
        return historicalService.update(facture);
    }
    @DeleteMapping("/historical/{historical_id}")
    public String delete( @PathVariable("historical_id") Long historical_id){
        return historicalService.delete(historical_id);
    }
}
