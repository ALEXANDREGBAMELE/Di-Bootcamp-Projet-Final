package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //=============== Attributs =====================
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//  Information user
    private Long user_id;
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private Date burhDay;
    private double tall;
    private double weight;
    private double address;
    private String photo;
//    Login
    private int password;
    private int confirmPassword;
    private String role;
  //  relation oarent vers fils : De User vers Facture
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Claim> claim = new ArrayList<>();
//    relation oarent vers fils : De User vers Claim
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> order = new ArrayList<>();
//     relation oarent vers fils : De User vers Order
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Facture> facture = new ArrayList<>();

    //=============== Relation OneToMany=====================
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Historical> historical = new ArrayList<>();
    //=============== Relation ManyToOne=====================

}
