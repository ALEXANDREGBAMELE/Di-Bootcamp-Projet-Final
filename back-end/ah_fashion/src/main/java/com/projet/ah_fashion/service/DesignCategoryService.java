package com.projet.ah_fashion.service;


import com.projet.ah_fashion.model.DesignCategory;

import java.util.List;
import java.util.Optional;

public interface DesignCategoryService {
     DesignCategory create(DesignCategory designCategory);
     List<DesignCategory> read();
     Optional<DesignCategory> readById(Long designCat_id );
     DesignCategory update(DesignCategory designCategory);
     String delete(Long designCat_id);
}
