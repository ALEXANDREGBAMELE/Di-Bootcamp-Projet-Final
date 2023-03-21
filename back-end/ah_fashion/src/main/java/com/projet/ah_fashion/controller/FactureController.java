package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Facture;
import com.projet.ah_fashion.model.Tissu;
import com.projet.ah_fashion.service.FactureService;
import com.projet.ah_fashion.service.TissuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
public class FactureController {
    private FactureService factureService;
    @PostMapping("/facture")
    public Facture create(@RequestBody Facture facture){
        return factureService.create(facture);
    }
    @GetMapping("/facture")
    public List<Facture> read(){
        return factureService.read();
    }
    @GetMapping("/facture/{facture_id}")
    public Optional<Facture> readById(@PathVariable("facture_id") Long facture_id){
        return factureService.readById(facture_id);
    }
    @PutMapping("/facture")
    public Facture update( @RequestBody Facture facture){
        return factureService.update(facture);
    }
    @DeleteMapping("/facture/{facture_id}")
    public String delete( @PathVariable("facture_id") Long facture_id){
        return factureService.delete(facture_id);
    }
}
