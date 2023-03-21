package com.projet.ah_fashion.repository;

import com.projet.ah_fashion.model.Design;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DesignRepository extends JpaRepository<Design,Long> {
    public Optional<List <Design>> findDesignByCategory(String category);
}
