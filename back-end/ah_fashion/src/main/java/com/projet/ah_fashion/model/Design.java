package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DESIGN")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Design {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String label;
    private String image;
    private double price;

    @OneToMany(mappedBy = "design",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> order = new ArrayList<>();
}
