package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "coordonare_teza")
@Data
public class ThesisCoordination {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idThesisCoord;
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "tipTeza")
    private String tipTeza;
    @Column(name = "student")
    private Integer student;
    @Column(name = "titluTeza")
    private Integer titluTeza;
    @Column(name = "anulSustinerii")
    private Integer anulSustinerii;
    @Column(name = "punctaj")
    private double punctaj;
}
