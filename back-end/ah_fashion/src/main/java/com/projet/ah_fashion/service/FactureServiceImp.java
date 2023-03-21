package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Facture;
import com.projet.ah_fashion.repository.FactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor

public class FactureServiceImp implements FactureService{
    private final FactureRepository factureRepository;
    @Override
    public Facture create(Facture facture) {

        return factureRepository.save(facture);
    }

    @Override
    public List<Facture> read() {
        return factureRepository.findAll();
    }

    @Override
    public Optional<Facture> readById(Long facture_id) {
        return factureRepository.findById(facture_id);
    }

    @Override
    public Facture update(Facture facture) {
        return factureRepository.findById(facture.getFacture_id()) .map(
                facture1 -> {
                    facture1.setLabel(facture.getLabel());
                    facture1.setInvoiceAmount(facture.getInvoiceAmount());
                    facture1.setDate(facture.getDate());
                    return factureRepository.save(facture1);
                }
        ) .orElseThrow(() -> new RuntimeException("Objet Not Found"));
    }

    @Override
    public String delete(Long facture_id) {
        factureRepository.deleteById(facture_id);
        return "Deleted is successfully";
    }
}
