package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "university_invitations")
@Data
public class UniversityInvitation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUniversityInvitations;

    @Column(name = "idUser")
    private int idUser;

    @Column(name = "tipInvitatie")
    private String tipInvitatie;

    @Column(name = "denumireUniversitate")
    private String denumireUniversitate;

    @Column(name = "denumireActivitate")
    private String denumireActivitate;

    @Column(name = "temaCercetare")
    private String temaCercetare;

    @Column(name = "punctaj")
    private double punctaj;
}
