package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CLOTHING")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(length = 50)
    private String labelClothing;
    @Column(length = 150)
    private String descriptionClothing;
    @Column(length = 10)
    private double price;
    //=============== Relation ManyToMany=====================
//    @ManyToMany (mappedBy = "clothingset")
//    private Set<Order> assignedOrder = new HashSet<>();
}
