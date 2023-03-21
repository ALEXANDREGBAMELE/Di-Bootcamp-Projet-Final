package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Claim;
import com.projet.ah_fashion.repository.ClaimRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ClaimServiceImp implements ClaimService{
    private final ClaimRepository claimRepository;
    @Override
    public Claim create(Claim claim) {
        return claimRepository.save(claim);
    }

    @Override
    public List<Claim> read() {
        return claimRepository.findAll();
    }

    @Override
    public Optional<Claim> readById(Long clothing_id) {
        return claimRepository.findById(clothing_id);
    }

    @Override
    public Claim update(Claim claim) {
        return claimRepository.findById(claim.getClaim_id()) .map(
                claim1 -> {
                    claim1.setLabel(claim.getLabel());
                    claim1.setDescription(claim.getDescription());
                    claim1.setDate(claim.getDate());
                    return claimRepository.save(claim1);
                }
        ) .orElseThrow(() -> new RuntimeException("Objet Not Found"));
    }

    @Override
    public String delete(Long clothing_id) {
        claimRepository.deleteById(clothing_id);
        return "Deleted is successfully";
    }
}
