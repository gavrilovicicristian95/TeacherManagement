package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "citations")
@Data
public class Citation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCitation;

    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "tipCitatie")
    private String tipCitatie;

    @Column(name = "anulCitarii")
    private String anulCitarii;

    @Column(name = "titluArticol")
    private String titluArticol;

    @Column(name = "autori")
    private String autori;

    @Column(name = "nrAutori")
    private int nrAutori;

    @Column(name = "titluVolumNr")
    private String titluVolumNr;

    @Column(name = "factorImpact")
    private double factorImpact;

    @Column(name = "punctaj")
    private double punctaj;
}
