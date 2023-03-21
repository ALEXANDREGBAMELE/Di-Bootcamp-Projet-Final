package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Clothing;
import com.projet.ah_fashion.service.ClothingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ClothingController {
    private final ClothingService clothingService;
    @RequestMapping("/clothing")
    public Clothing create(@RequestBody Clothing clothing){
        return clothingService.create(clothing);
    }
    @GetMapping("/clothing")
    public List<Clothing> read(){
        return clothingService.read();
    }
    @GetMapping("/clothing/{clothing_id}")
    public Optional<Clothing> readById(@PathVariable("clothing_id") Long clothing_id){
        return clothingService.readById(clothing_id);
    }
    @PutMapping("/clothing")
    public Clothing update( @RequestBody Clothing clothing){
        return clothingService.update(clothing);
    }

    @DeleteMapping("/clothing/{clothing_id}")
    public String delete( @PathVariable("clothing_id") Long clothing_id){
        return clothingService.delete(clothing_id);
    }

}