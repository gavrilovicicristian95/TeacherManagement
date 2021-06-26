package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "academy_members")
@Data
public class AcademyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAcademyMember;

    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "numePrenume")
    private String numePrenume;
    @Column(name = "numeAcademie")
    private String numeAcademie;
    @Column(name = "tipMembru")
    private String tipMembru;
    @Column(name = "punctaj")
    private double punctaj;
}
