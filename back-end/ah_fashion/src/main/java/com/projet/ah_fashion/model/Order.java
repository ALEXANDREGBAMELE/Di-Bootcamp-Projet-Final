package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "ORDERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    //=============== Attributs =====================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String comment;
    private Date date;
    //=============== Relation OneToMany=====================

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Claim> claim = new ArrayList<>();
//    Relation  pere == fils : De order  ==> facture
   @OneToMany(mappedBy = "order",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Facture> facture = new ArrayList<>();

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Delivery> delivery = new ArrayList<>();

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Historical> historical = new ArrayList<>();

//=============== Relation ManyToOne=====================

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "design_id", referencedColumnName = "id")
    private Design design;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tissu_id", referencedColumnName = "id")
    private Tissu tissu;

    //=============== Relation ManyToMany=====================
    @ManyToMany(mappedBy = "assignedOrder")
    private Set<Clothing> assignedClothing = new HashSet<>();

}