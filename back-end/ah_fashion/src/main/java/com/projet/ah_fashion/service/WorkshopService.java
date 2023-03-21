package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.User;
import com.projet.ah_fashion.model.Workshop;

import java.util.List;
import java.util.Optional;

public interface WorkshopService {

    Workshop create(Workshop workshop);
    List<Workshop> read();
    Optional<Workshop> readById(Long workshop_id);
    Workshop update(Workshop workshop);
    String delete(Long workshop_id);
}
