package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "peer_reviewers")
@Data
public class PeerReviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPerrReviewer;

    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "tipReferent")
    private String tipReferent;
    @Column(name = "titlulCartiiRevistei")
    private String titlulCartiiRevistei;
    @Column(name = "anulPublicarii")
    private String anulPublicarii;
    @Column(name = "punctaj")
    private double punctaj;
}
