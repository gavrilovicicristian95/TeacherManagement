package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "scientific_commitee_member")
@Data
public class ScientificCommitteeMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCommitteeMember;

    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "tipMembruComitet")
    private String tipMembruComitet;
    @Column(name = "perioadaEvenimentului")
    private String perioadaEvenimentului;
    @Column(name = "titlulConferintei")
    private String titlulConferintei;
    @Column(name = "rangConferinta")
    private String rangConferinta;
    @Column(name = "numePrenume")
    private String numePrenume;
    @Column(name = "punctaj")
    private double punctaj;

}
