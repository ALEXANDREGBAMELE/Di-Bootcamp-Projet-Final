package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Claim;
import com.projet.ah_fashion.service.ClaimService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(allowedHeaders = "*",origins = "*")

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ClaimController {
    private ClaimService claimService;
    @PostMapping("/claim")
    public Claim create( @RequestBody Claim claim){return claimService.create(claim);}
    @GetMapping("/claim")
    public List<Claim> read()
    {return claimService.read();}
    @GetMapping("/claim/{claim_id}")
    public Optional<Claim> readById(@PathVariable("claim_id") Long claim_id){return claimService.readById(claim_id);}
    @PutMapping("/claim")
    public Claim update( @RequestBody Claim claim){return claimService.update(claim);}
    @DeleteMapping("/claim/{claim_id}")
    public String delete( @PathVariable("claim_id") Long claim_id){return claimService.delete(claim_id);}
}
