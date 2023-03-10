package com.projet.ah_fashion.repository;

import com.projet.ah_fashion.model.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothingRepository extends JpaRepository<Clothing, Long> {
}
