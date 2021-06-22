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
    @Column(name = "coeficientInmultireFactorImpact")
    private int coeficientInmultireFactorImpact;
    @Column(name = "coeficientInmultireSJR")
    private int coeficientInmultireSJR;
    @Column(name = "coeficientAdunareFactorSJR")
    private int coeficientAdunareFactorSJR;
    @Column(name = "coeficientScadereNrAutori")
    private int coeficientScadereNrAutori;
    @Column(name = "maxSecondArgument")
    private int maxSecondArgument;
    @Column(name = "puncte")
    private int puncte;
    @Column(name = "formula")
    private String formula;
    @Column(name = "tipArticol")
    private String tipArticol;
    public ArticlesFormulas(int coeficientInmultireSJR,int coeficientInmultireFactorImpact,int coeficientAdunareFactorSJR,int coeficientScadereNrAutori,int maxSecondArgument,String formula,String tipArticol){
        this.coeficientInmultireFactorImpact=coeficientInmultireFactorImpact;
        this.coeficientScadereNrAutori=coeficientScadereNrAutori;
        this.maxSecondArgument=maxSecondArgument;
        this.formula=formula;
        this.tipArticol=tipArticol;
        this.coeficientAdunareFactorSJR=coeficientAdunareFactorSJR;
        this.coeficientInmultireSJR=coeficientInmultireSJR;

    }
    public ArticlesFormulas(int puncte,int coeficientScadereNrAutori,int maxSecondArgument,String formula,String tipArticol){

        this.coeficientScadereNrAutori=coeficientScadereNrAutori;
        this.maxSecondArgument=maxSecondArgument;
        this.puncte=puncte;
        this.formula=formula;
        this.tipArticol=tipArticol;


    }


    public ArticlesFormulas(){

    }
}
