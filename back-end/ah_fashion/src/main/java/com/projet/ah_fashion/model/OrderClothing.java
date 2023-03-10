package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ORDER-CLOTHING")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderClothing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Clothing clothing;
    private Order order;
}
