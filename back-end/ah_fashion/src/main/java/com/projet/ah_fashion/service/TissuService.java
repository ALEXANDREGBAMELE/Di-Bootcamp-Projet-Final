package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Tissu;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface TissuService {
    Tissu create(Tissu tissu);
    List<Tissu> read();
    Optional<Tissu> readById(Long id);
    Tissu update(Tissu tissu);
    String delete(Long id);
}
