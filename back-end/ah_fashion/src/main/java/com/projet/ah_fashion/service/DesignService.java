package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Design;

import java.util.List;
import java.util.Optional;

public interface DesignService {
    Design create(Design design);
    List<Design> read();
    Optional<Design> readById(Long id);
    Design update(Design design);
    String delete(Long id);
}
