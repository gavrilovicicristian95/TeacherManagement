package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "conference_participations")
@Data
public class ConferenceParticipation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idConferenceParticipation;

    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "tipConferinta")
    private String tipConferinta;

    @Column(name = "anulPublicarii")
    private String anulPublicarii;

    @Column(name = "titlu")
    private String titlu;

    @Column(name = "autor")
    private String autor;

    @Column(name = "denumireConferinta")
    private String denumireConferinta;

    @Column(name = "punctaj")
    private double punctaj;
}
