package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Tissu;
import com.projet.ah_fashion.service.TissuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tissu")
@AllArgsConstructor
public class TissuController {
    private TissuService tissuService;
    @PostMapping("/create")
    public Tissu create(@RequestBody Tissu tissu){
        return tissuService.create(tissu);
    }
    @GetMapping("/read")
    public List<Tissu> read(){
        return tissuService.read();
    }
    @GetMapping("/read/{id}")
    public Optional<Tissu> readById( @PathVariable("id") Long id){
        return tissuService.readById(id);
    }
    @PutMapping("/update")
    public Tissu update( @RequestBody Tissu tissu){
        return tissuService.update(tissu);
    }
    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable("id") Long id){
        return tissuService.delete(id);
    }

}
