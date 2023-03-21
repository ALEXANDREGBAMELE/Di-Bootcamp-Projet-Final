package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Design;
import com.projet.ah_fashion.model.DesignCategory;
import com.projet.ah_fashion.service.DesignCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/api")

public class DesignCategoryController {
    private DesignCategoryService designCategoryService;
    @PostMapping("/designCategory")
    public DesignCategory create(@RequestBody DesignCategory designCategory) {
        return designCategoryService.create(designCategory);
    }

    @GetMapping("/designCategory")
    public List<DesignCategory> read(){
        return designCategoryService.read();
    }

    @GetMapping("/designCategory/{designCat_id}")
    public Optional<DesignCategory> readById(@PathVariable("designCat_id") Long designCat_id){
        return designCategoryService.readById(designCat_id);
    }
    @PutMapping("/designCategory")
    public DesignCategory update(@RequestBody DesignCategory designCategory){
        return designCategoryService.update(designCategory);
    }
    @DeleteMapping("/designCategory/{designCat_id}")
    public String delete(@PathVariable("designCat_id") Long designCat_id){

        return designCategoryService.delete(designCat_id);
    }
}
