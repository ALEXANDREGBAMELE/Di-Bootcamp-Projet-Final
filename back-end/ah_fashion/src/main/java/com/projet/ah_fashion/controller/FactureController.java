package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Facture;
import com.projet.ah_fashion.model.Tissu;
import com.projet.ah_fashion.service.FactureService;
import com.projet.ah_fashion.service.TissuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/facture")
public class FactureController {
    private FactureService factureService;
    @PostMapping("/create")
    public Facture create(@RequestBody Facture facture){
        return factureService.create(facture);
    }
    @GetMapping("/read")
    public List<Facture> read(){
        return factureService.read();
    }
    @GetMapping("/read/{id}")
    public Optional<Facture> readById(@PathVariable("id") Long id){
        return factureService.readById(id);
    }
    @PutMapping("/update")
    public Facture update( @RequestBody Facture facture){
        return factureService.update(facture);
    }
    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable("id") Long id){
        return factureService.delete(id);
    }
}
