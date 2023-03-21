package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Design;

import java.util.List;
import java.util.Optional;

public interface DesignService {
    Design create(Design design);
    List<Design> read();
    Optional<Design> readById(Long design_id);
    Design update(Design design);
    String delete(Long design_id);
//    une methode qui pointera sa requette sur les category
//    Optional<List<Design>> readByCategory(String category);
}
