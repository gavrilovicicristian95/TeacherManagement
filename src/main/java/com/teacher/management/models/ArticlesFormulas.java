package com.teacher.management.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "articles_formulas")
@Data
public class ArticlesFormulas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idArticleFormula;
    @Column(name = "formula")
    private String formula;
    @Column(name = "tipActivitate")
    private String tipActivitate;
    @Column(name = "numeClasa")
    private String numeClasa;


    public ArticlesFormulas(String formula,String tipActivitate,String numeClasa){

        this.formula=formula;
        this.tipActivitate=tipActivitate;
        this.numeClasa=numeClasa;


    }


    public ArticlesFormulas(){

    }
}
