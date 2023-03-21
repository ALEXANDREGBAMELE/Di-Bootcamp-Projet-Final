package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Workshop;
import com.projet.ah_fashion.repository.WorkshopRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class WorkshopServiceImp implements WorkshopService{
private WorkshopRepository workshopRepository;
    @Override
    public Workshop create(Workshop workshop) {
        return workshopRepository.save(workshop);
    }

    @Override
    public List<Workshop> read() {
        return workshopRepository.findAll();
    }

    @Override
    public Optional<Workshop> readById(Long workshop_id) {
        return workshopRepository.findById(workshop_id);
    }

    @Override
    public Workshop update(Workshop workshop) {
        return workshopRepository.findById(workshop.getWorkshop_id()).map(workshop1 -> {
            workshop1.setWorkshopName(workshop.getWorkshopName());
            workshop1.setWorkshopImgUrl(workshop.getWorkshopImgUrl());
            workshop1.setWorkshopAddress(workshop.getWorkshopAddress());
            workshop1.setWorkshopDescription(workshop.getWorkshopDescription());
            return workshopRepository.save(workshop1);
        }).orElseThrow(() -> new RuntimeException("Objet Not Found"));
    }

    @Override
    public String delete(Long workshop_id) {
        workshopRepository.deleteById(workshop_id);
        return "Deleted is successfully";
    }
}
