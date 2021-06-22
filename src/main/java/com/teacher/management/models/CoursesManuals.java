package com.teacher.management.models;



import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "courses_and_manuals")
@Data
public class CoursesManuals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCourseManual;
    @Column(name = "idUser")
    private Integer idUser;
    @Column(name = "tipCursManual")
    private String tipCursManual;
    @Column(name = "anulPublicarii")
    private String anulPublicarii;
    @Column(name = "titluManualCurs")
    private String titluManualCurs;
    @Column(name = "nrPagini")
    private int nrPagini;
    @Column(name = "nrAutori")
    private int nrAutori;
    @Column(name = "autori")
    private String autori;
    @Column(name = "punctaj")
    private double punctaj;


}
