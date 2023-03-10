package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "TISSU")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Tissu {
    enum Color {
        BLUE,
        BLACK,
        READ,
        WHITE
    }
    //=============== Attributs =====================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private double height;
    private double width;
    private String description;
    private Color color;

    //=============== Relation OneToMany=====================

    @OneToMany(mappedBy = "tissu",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> order = new ArrayList<>();

    //=============== Relation ManyToOne=====================

}
