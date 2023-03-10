package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Claim;
import com.projet.ah_fashion.service.ClaimService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/claim")
@AllArgsConstructor
public class ClaimController {
    private ClaimService claimService;
    @PostMapping("/create")
    public Claim create( @RequestBody Claim claim){return claimService.create(claim);}
    @GetMapping("/read")
    public List<Claim> read()
    {return claimService.read();}
    @GetMapping("/read/{id}")
    public Optional<Claim> readById(@PathVariable("id") Long id){return claimService.readById(id);}
    @PutMapping("/update")
    public Claim update( @RequestBody Claim claim){return claimService.update(claim);}
    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable("id") Long id){return claimService.delete(id);}
}
