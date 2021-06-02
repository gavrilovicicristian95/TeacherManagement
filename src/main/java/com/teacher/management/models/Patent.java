package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "patents")
@Data
public class Patent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPatent;

    @Column(name = "idUser")
    private int idUser;

    @Column(name = "tipBrevet")
    private String tipBrevet;

    @Column(name = "anObtinere")
    private String anObtinere;

    @Column(name = "titlu")
    private String titlu;

    @Column(name = "autor")
    private String autor;

    @Column(name = "nrAutori")
    private int nrAutori;

    @Column(name = "punctaj")
    private double punctaj;
}
