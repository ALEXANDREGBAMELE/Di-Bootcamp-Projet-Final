package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Design;
import com.projet.ah_fashion.repository.DesignRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class DesignServiceImp implements DesignService {
    private final DesignRepository designRepository;
    @Override
    public Design create(Design design) {
        return designRepository.save(design);
    }

    @Override
    public List<Design> read() {
        return designRepository.findAll();
    }
    
    @Override
    public Optional<Design> readById(Long design_id) {
        return designRepository.findById(design_id);
    }

    @Override
    public Design update(Design design) {
        return designRepository.findById(design.getDesign_id())
                .map(design1 -> {
                    design1.setLabel(design.getLabel());
                    design1.setImgUrl(design.getImgUrl());
                    design1.setPrice(design.getPrice());
                    design1.setDescription(design.getDescription());
                    design1.setCategory(design.getCategory());
                    return designRepository.save(design1);
                }).orElseThrow(
                        () -> new RuntimeException("Objet not fund !")
                );
    }

    @Override
    public String delete(Long design_id) {
        designRepository.deleteById(design_id);
        return "Deleted is successfully";
    }

//    @Override
//    public Optional<List<Design>> readByCategory(String category) {
//        return designRepository.findDesignByCategory(category);
//    }
}
