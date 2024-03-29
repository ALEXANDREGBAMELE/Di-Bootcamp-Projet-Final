package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Historical;
import com.projet.ah_fashion.repository.HistoricalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class HistoricalServiceImp implements HistoricalService{
    private final HistoricalRepository historicalRepository;
    @Override
    public Historical create(Historical historical) {
        return historicalRepository.save(historical);
    }

    @Override
    public List<Historical> read() {
        return historicalRepository.findAll();
    }

    @Override
    public Optional<Historical> readById(Long historical_id) {
        return historicalRepository.findById(historical_id);
    }

    @Override
    public Historical update(Historical historical) {
        return historicalRepository.findById(historical.getHistorical_id()) .map(
                historical1 -> {
                    historical1.setDate(historical.getDate());
                    return historicalRepository.save(historical1);
                }
        ) .orElseThrow(() -> new RuntimeException("Objet Not Found"));
    }

    @Override
    public String delete(Long historical_id) {
        historicalRepository.deleteById(historical_id);
        return "Deleted is successfully";
    }
}
