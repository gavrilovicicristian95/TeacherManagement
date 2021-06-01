package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "articles")
@Data
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArticol;

    @Column(name = "idUser")
    private int idUser;

    @Column(name = "anulPublicarii")
    private String anulPublicarii;

    @Column(name = "titluArticol")
    private String titluArticol;

    @Column(name = "autori")
    private String autori;

    @Column(name = "nrAutori")
    private int nrAutori;

    @Column(name = "titluRevistaVolumNr")
    private String titluRevistaVolumNr;

    @Column(name = "factoriImpact")
    private double factoriImpact;

    @Column(name = "sjr")
    private double sjr;

    @Column(name = "punctaj")
    private double punctaj;

    @Column(name = "tipArticol")
    private String tipArticol;

    @Column(name = "denumireVolumConferinta")
    private String denumireVolumConferinta;

    @Column(name = "categorie")
    private String categorie;
}
