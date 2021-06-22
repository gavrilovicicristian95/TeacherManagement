package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "thesis_coordinations")
@Data
public class ThesisCoordination {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idThesisCoord;
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
