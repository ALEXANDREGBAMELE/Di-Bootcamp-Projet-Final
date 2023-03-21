package com.projet.ah_fashion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workshop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long workshop_id;
    private String workshopName;
    private String workshopAddress;
    private String workshopDescription;
    private String workshopImgUrl;
}
