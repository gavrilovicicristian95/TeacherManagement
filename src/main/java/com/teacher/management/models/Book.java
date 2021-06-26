package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idBook;

    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "tipCarte")
    private String tipCarte;

    @Column(name = "anulPublicarii")
    private String anulPublicarii;

    @Column(name = "nrPagini")
    private int nrPagini;

    @Column(name = "titluCarte")
    private String titluCarte;

    @Column(name = "autori")
    private String autori;

    @Column(name = "nrAutori")
    private int nrAutori;

    @Column(name = "editura")
    private String editura;

    @Column(name = "punctaj")
    private double punctaj;
}
