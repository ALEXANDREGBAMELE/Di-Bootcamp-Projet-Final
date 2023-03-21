package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Claim;

import java.util.List;
import java.util.Optional;

public interface ClaimService {
    Claim create(Claim claim);
    List<Claim> read();
    Optional<Claim> readById(Long claim_id);
    Claim update(Claim claim);
    String delete(Long claim_id);
}
