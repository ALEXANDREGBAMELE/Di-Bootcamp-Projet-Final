package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Facture;

import java.util.List;
import java.util.Optional;

public interface FactureService {
    Facture create(Facture facture);
    List<Facture> read();
    Optional<Facture> readById(Long facture_id);
    Facture update(Facture facture);
    String delete(Long facture_id);
}
