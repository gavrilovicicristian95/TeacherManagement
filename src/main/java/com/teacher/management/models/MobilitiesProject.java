package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mobilities_projects")
@Data
public class MobilitiesProject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProject;
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "tipProiect")
    private String tipProiect;
    @Column(name = "denumireProiect")
    private String denumireProiect;
    @Column(name = "valoareProiectEuro")
    private double valoareProiectEuro;
    @Column(name = "punctaj")
    private double punctaj;
    @Column(name = "directorProiect")
    private String directorProiect;
    @Column(name = "nrMembriEchipa")
    private int nrMembriEchipa;
}

