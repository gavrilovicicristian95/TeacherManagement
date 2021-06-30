package com.teacher.management.models;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "responsabilities")
@Data
public class Responsabilities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idResponsability;
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "responsabilityType")
    private String responsabilityType;
    @Column(name = "tipResponsabilitate")
    private String tipResponsabilitate;
    @Column(name = "nrAni")
    private int nrAni;
    @Column(name = "punctaj")
    private double punctaj;
}
