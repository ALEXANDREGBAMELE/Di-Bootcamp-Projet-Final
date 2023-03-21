package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Clothing;
import com.projet.ah_fashion.repository.ClothingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ClothingServiceImp implements ClothingService{
    private final ClothingRepository clothingRepository;
    @Override
    public Clothing create(Clothing clothing) {
        return clothingRepository.save(clothing);
    }

    @Override
    public List<Clothing> read() {
        return clothingRepository.findAll();
    }

    @Override
    public Optional<Clothing> readById(Long clothing_id) {
        return clothingRepository.findById(clothing_id);
    }

    @Override
    public Clothing update(Clothing clothing) {
        return clothingRepository.findById(clothing.getId()) .map(clothing1 ->
        {
            clothing1.setLabelClothing(clothing.getLabelClothing());
            clothing1.setPrice(clothing.getPrice());
            clothing1.setDescriptionClothing(clothing.getDescriptionClothing());
            return clothingRepository.save(clothing1);
        }) .orElseThrow(() -> new RuntimeException("Objet Not Found"));
    }

    @Override
    public String delete(Long clothing_id) {
        clothingRepository.deleteById(clothing_id);
        return "Deleted is successfully";
    }
}
