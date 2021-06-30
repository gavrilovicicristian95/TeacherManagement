package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "institutional_activities")
@Data
public class InstitutionalActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idActivity;
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "anul")
    private String anul;
    @Column(name = "activitati")
    private String activitati;
    @Column(name = "linkPaginaWeb")
    private String linkPaginaWeb;
    @Column(name = "tipActivitateInstitutionala")
    private String tipActivitateInstitutionala;
    @Column(name = "punctaj")
    private double punctaj;
}
