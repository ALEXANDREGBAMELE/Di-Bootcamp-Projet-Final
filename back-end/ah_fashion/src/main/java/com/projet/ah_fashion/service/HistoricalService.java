package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Historical;

import java.util.List;
import java.util.Optional;

public interface HistoricalService {
    Historical create(Historical historical);
    List<Historical> read();
    Optional<Historical> readById(Long historical_id);
    Historical update(Historical historical);
    String delete(Long historical_id);
}
