package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DESIGNCATEGORY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DesignCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long designCat_id;
    private String labelDesignCategory;

    @OneToMany(mappedBy = "designCategory",cascade = CascadeType.ALL, orphanRemoval = true )
    private List<Design> design = new ArrayList<>();
}

