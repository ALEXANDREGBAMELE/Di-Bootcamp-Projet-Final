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
    private long id;
    private String label;
    private String description;
    private Date date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;
}
