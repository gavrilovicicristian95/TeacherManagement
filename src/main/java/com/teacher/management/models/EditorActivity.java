package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "editor_activities")
@Data
public class EditorActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEditorActivity;

    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "tipActivitateEditoriala")
    private String tipActivitateEditoriala;
    @Column(name = "perioadaEditarii")
    private String perioadaEditarii;
    @Column(name = "titluRevistaVolum")
    private String titluRevistaVolum;
    @Column(name = "titlulEditurii")
    private String titlulEditurii;
    @Column(name = "punctaj")
    private double punctaj;
    @Column(name = "numePrenume")
    private String numePrenume;
}
