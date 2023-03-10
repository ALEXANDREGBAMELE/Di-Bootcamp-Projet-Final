package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "DELIVERY")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Delivery {
    //=============== Attributs =====================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double price;
    private Date date;

    //=============== Relation OneToMany=====================
    @OneToMany(mappedBy = "delivery",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Facture> facture = new ArrayList<>();

    //=============== Relation ManyToOne=====================
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id" , referencedColumnName = "id")
    private Order oder;

}
