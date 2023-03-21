package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.DesignCategory;
import com.projet.ah_fashion.repository.DesignCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class DesignCategoryServiceImp implements DesignCategoryService{
    private DesignCategoryRepository designCategoryRepository;
    @Override
    public DesignCategory create(DesignCategory designCategory) {
        return designCategoryRepository.save(designCategory) ;
    }

    @Override
    public List<DesignCategory> read() {
        return designCategoryRepository.findAll();
    }

    @Override
    public Optional<DesignCategory> readById(Long designCat_id) {
        return designCategoryRepository.findById(designCat_id);
    }

    @Override
    public DesignCategory update(DesignCategory designCategory) {
        return designCategoryRepository.findById(designCategory.getDesignCat_id()).map(designCategory1 -> {
            designCategory1.setLabelDesignCategory(designCategory.getLabelDesignCategory());
            return designCategoryRepository.save(designCategory1);
        }).orElseThrow( () -> new RuntimeException("Objet not fund !"));
    }

    @Override
    public String delete(Long designCat_id) {
        designCategoryRepository.deleteById(designCat_id);
        return "Deleted is successfully";
    }
}
