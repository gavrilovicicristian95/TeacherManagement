package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "responsability_types", uniqueConstraints = {@UniqueConstraint(columnNames = {"responsabilityType"})})
@Data
public class ResponsabilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idResponsabilityType;
    @Column(name = "nrPuncteAnual")
    private int nrPuncteAnual;
    @Column(name = "tipResponsabilitate")
    private String tipResponsabilitate;
    @Column(name = "responsabilityType")
    private String responsabilityType;

    public ResponsabilityType(int nrPuncte, String type, String tipResponsabilitate) {
        this.nrPuncteAnual=nrPuncte;
        this.responsabilityType=type;
        this.tipResponsabilitate=tipResponsabilitate;
    }

    public ResponsabilityType() {

    }
}
