package com.projet.ah_fashion.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    @Id
    private long cli_id;
    private String firstName;
    private String lastName;
    private double age;

}
