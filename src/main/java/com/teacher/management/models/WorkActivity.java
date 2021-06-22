package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "workActivities")
@Data
public class WorkActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idWorkActivity;
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "anulPublicarii")
    private String anulPublicarii;
    @Column(name = "titlu")
    private String titlu;
    @Column(name = "nrPagini")
    private int nrPagini;
    @Column(name = "nrAutori")
    private int nrAutori;
    @Column(name = "autori")
    private String autori;
    @Column(name = "punctaj")
    private double punctaj;
}
