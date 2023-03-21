package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.User;
import com.projet.ah_fashion.model.Workshop;
import com.projet.ah_fashion.service.WorkshopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class WorkshopController {
    private WorkshopService workshopService;

    @PostMapping("/workshop")
    public Workshop create(@RequestBody Workshop workshop){
        return workshopService.create(workshop);
    }
    @GetMapping("/workshop")
    public List<Workshop> read(){
        return workshopService.read();
    }
    @GetMapping("/workshop/{workshop_id}")
    public Optional<Workshop> readById(@PathVariable("workshop_id") long workshop_id){
        return workshopService.readById(workshop_id);
    }
    @PutMapping("/workshop")
    public Workshop update(@RequestBody Workshop workshop){
        return workshopService.update(workshop);
    }
    @DeleteMapping("/workshop/{workshop_id}")
    public String delete(@PathVariable("workshop_id") long workshop_id){
        return workshopService.delete(workshop_id);
    }

}
