package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HISTORICAL")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Historical {
    //=============== Attributs =====================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long historical_id;
    private Date date;

    //=============== Relation OneToMany=====================

    //=============== Relation ManyToOne=====================
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

}
