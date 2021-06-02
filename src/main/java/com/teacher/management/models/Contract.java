package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contracts")
@Data
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idContract;

    @Column(name = "idUser")
    private int idUser;

    @Column(name = "tipContract")
    private String tipContract;

    @Column(name = "anulObtinerii")
    private String anulObtinerii;

    @Column(name = "nrContract")
    private String nrContract;

    @Column(name = "denumireContract")
    private String denumireContract;

    @Column(name = "director")
    private String director;

    @Column(name = "nrMembrilor")
    private int nrMembrilor;

    @Column(name = "valoareLeiContract")
    private double valoareLeiContract;

    @Column(name = "punctaj")
    private double punctaj;
}
