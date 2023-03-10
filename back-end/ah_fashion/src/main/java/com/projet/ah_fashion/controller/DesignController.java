package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Design;
import com.projet.ah_fashion.service.DesignService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/design")
@AllArgsConstructor
public class DesignController {
    private DesignService designService;
    @PostMapping("/create")
    public Design create(@RequestBody Design design){
        return designService.create(design);
    }
    @GetMapping("/read")
    public List<Design> read(){
        return designService.read();
    }
    @GetMapping("/read/{id}")
    public Optional<Design> readById(@PathVariable("id") Long id){
        return designService.readById(id);
    }
    @PutMapping("/update")
    public Design update(@RequestBody Design design){
        return designService.update(design);
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable("id") Long id){

        return designService.delete(id);
    }

}
