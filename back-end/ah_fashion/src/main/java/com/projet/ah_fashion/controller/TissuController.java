package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Tissu;
import com.projet.ah_fashion.service.TissuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TissuController {
    private TissuService tissuService;
    @PostMapping("/tissu")
    public Tissu create(@RequestBody Tissu tissu){
        return tissuService.create(tissu);
    }
    @GetMapping("/tissu")
    public List<Tissu> read(){
        return tissuService.read();
    }
    @GetMapping("/tissu/{tissu_id}")
    public Optional<Tissu> readById( @PathVariable("tissu_id") Long tissu_id){
        return tissuService.readById(tissu_id);
    }
    @PutMapping("/tissu")
    public Tissu update( @RequestBody Tissu tissu){
        return tissuService.update(tissu);
    }
    @DeleteMapping("/tissu/{tissu_id}")
    public String delete( @PathVariable("tissu_id") Long tissu_id){
        return tissuService.delete(tissu_id);
    }

}
