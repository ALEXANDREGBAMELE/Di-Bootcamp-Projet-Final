package com.projet.ah_fashion.service;
import com.projet.ah_fashion.model.Tissu;
import com.projet.ah_fashion.repository.TissuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class TissuServiceImp implements TissuService{
    private TissuRepository tissuRepository;
    @Override
    public Tissu create(Tissu tissu) {
        return tissuRepository.save(tissu);
    }

    @Override
    public List<Tissu> read() {
        return tissuRepository.findAll();
    }

    @Override
    public Optional<Tissu> readById(Long tissu_id) {
        return tissuRepository.findById(tissu_id);
    }

    @Override
    public Tissu update(Tissu tissu) {
        return tissuRepository.findById(tissu.getTissu_id())
                .map(
                        tissu1 -> {
                            tissu1.setLabel(tissu.getLabel());
                            tissu1.setHeight(tissu.getHeight());
                            tissu1.setWidth(tissu.getWidth());
                            tissu1.setDescription(tissu.getDescription());
                            tissu1.setColor(tissu.getColor());

                            return tissuRepository.save(tissu1);
                        }) .orElseThrow(() -> new RuntimeException("Objet not fund !"));
    }

    @Override
    public String delete(Long tissu_id) {
        tissuRepository.deleteById(tissu_id);
        return "deleted succefuly";
    }
}
