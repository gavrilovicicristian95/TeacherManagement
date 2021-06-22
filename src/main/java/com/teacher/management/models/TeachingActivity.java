package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "teaching_activity")
@Data
public class TeachingActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idActivity;
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "denumire")
    private String denumire;
    @Column(name = "tipActivitate")
    private String tipActivitate;
    @Column(name = "punctaj")
    private double punctaj;
}
