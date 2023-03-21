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
    private long design_id;
    private String label;
    private String imgUrl;
    private String description;
    private double price;
    private String category;
    @OneToMany(mappedBy = "design",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> order = new ArrayList<>();

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn (name = "designCat_id" , referencedColumnName = "designCat_id")
//    private DesignCategory designCategory;
}
