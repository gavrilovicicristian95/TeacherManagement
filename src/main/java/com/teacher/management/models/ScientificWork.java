package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "scientific_works")
@Data
public class ScientificWork {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idScientificWork;

    @Column(name = "idUser")
    private int idUser;

    @Column(name = "tipLucrare")
    private String tipLucrare;

    @Column(name = "anulPublicarii")
    private String anulPublicarii;

    @Column(name = "titluLucrare")
    private String titluLucrare;

    @Column(name = "autorLucrare")
    private String autorLucrare;

    @Column(name = "nrAutori")
    private int nrAutori;

    @Column(name = "titluRevista")
    private String titluRevista;

    @Column(name = "factorImpact")
    private double factorImpact;

    @Column(name = "punctaj")
    private double punctaj;

    @Column(name = "denumireVolum")
    private String denumireVolum;

    @Column(name = "categorie")
    private String categorie;
}
