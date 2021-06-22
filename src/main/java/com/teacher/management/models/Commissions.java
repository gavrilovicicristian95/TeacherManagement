package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "commissions")
@Data
public class Commissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCommission;
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "tipComisie")
    private String tipComisie;
    @Column(name = "comisii")
    private String comisii;
    @Column(name = "punctaj")
    private double Punctaj;
}
