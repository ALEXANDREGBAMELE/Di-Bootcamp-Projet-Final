package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "FACTURE")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Facture {
    //=============== Relation OneToMany=====================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long facture_id;
    private String label;
    private Date date;
    private double invoiceAmount;
    //=============== Relation OneToMany=====================



    //=============== Relation ManyToOne=====================

    //  Relation fils == pere : De facture <== user (client)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "user_id" , referencedColumnName = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id" , referencedColumnName = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id" , referencedColumnName = "delivery_id")
    private Delivery  delivery;
}
