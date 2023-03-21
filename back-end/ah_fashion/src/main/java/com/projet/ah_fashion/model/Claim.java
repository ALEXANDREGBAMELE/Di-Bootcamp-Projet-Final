package com.projet.ah_fashion.model;
//Table des reclamations

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table(name = "CLAIM")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long claim_id;
    private String label;
    private String description;
    private Date date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id",referencedColumnName = "order_id")
    private Order order;
}
