package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Clothing;

import java.util.List;
import java.util.Optional;

public interface ClothingService {
    Clothing create(Clothing clothing);
    List<Clothing> read();
    Optional<Clothing> readById(Long clothing_id);

    Clothing update(Clothing clothing);
    String delete(Long clothing_id);
}
