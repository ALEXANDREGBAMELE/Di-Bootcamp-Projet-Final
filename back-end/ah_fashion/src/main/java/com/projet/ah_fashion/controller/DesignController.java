package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Design;
import com.projet.ah_fashion.service.DesignService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class DesignController {
    private DesignService designService;
    @PostMapping("/design/add")
    public Design create(@RequestBody Design design){
        return designService.create(design);
    }
    @GetMapping("/design")
    public List<Design> read(){
        return designService.read();
    }
    @GetMapping("/design/{design_id}")
    public Optional<Design> readById(@PathVariable("design_id") Long design_id){
        return designService.readById(design_id);
    }
    @PutMapping("/design")
    public Design update(@RequestBody Design design){
        return designService.update(design);
    }
    @DeleteMapping("/design")
    public String delete(@PathVariable("design_id") Long design_id){

        return designService.delete(design_id);
    }
    @GetMapping("/design/category/{category}")
    public Optional<List<Design>> readByCategory(@PathVariable("category") String category){
        return designService.readByCategory(category);
    }

}
