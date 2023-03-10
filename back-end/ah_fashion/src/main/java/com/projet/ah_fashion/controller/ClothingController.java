package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Clothing;
import com.projet.ah_fashion.service.ClothingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clothing")
@AllArgsConstructor
public class ClothingController {
    private final ClothingService clothingService;
    @RequestMapping("/create")
    public Clothing create(@RequestBody Clothing clothing){
        return clothingService.create(clothing);
    }
    @GetMapping("/read")
    public List<Clothing> read(){
        return clothingService.read();
    }
    @GetMapping("/read/{id}")
    public Optional<Clothing> readById(@PathVariable("id") Long id){
        return clothingService.readbyid(id);
    }
    @PutMapping("/update")
    public Clothing update( @RequestBody Clothing clothing){
        return clothingService.update(clothing);
    }

    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable("id") Long id){
        return clothingService.delete(id);
    }

}