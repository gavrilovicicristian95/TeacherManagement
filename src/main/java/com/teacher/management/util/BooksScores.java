package com.teacher.management.util;
import org.springframework.stereotype.Component;

@Component
public class BooksScores {
    public double getArticleScore(int nrPagini, int numarAutori, String tipCarte){
        int maximum = Math.max(numarAutori  - 2, 1);
        double puncteNrPagini=0;
        if(tipCarte.equalsIgnoreCase("strainatate")) {
            puncteNrPagini = nrPagini;
            return  puncteNrPagini / maximum;
        }
        if(tipCarte.equalsIgnoreCase("taraAcreditatCNCS")) {
            puncteNrPagini = nrPagini * 0.4;
            return  puncteNrPagini / maximum;
        }
        if(tipCarte.equalsIgnoreCase("taraAcreditatCNCS")) {
            puncteNrPagini = nrPagini * 0.4;
            return  puncteNrPagini / maximum;
        }
        if(tipCarte.equalsIgnoreCase("alteEdituri")) {
            puncteNrPagini = nrPagini * 0.2;
            return  puncteNrPagini / maximum;
        }
        if(tipCarte.equalsIgnoreCase("coordStrainatate")) {
            puncteNrPagini = nrPagini * 0.3;
            return  puncteNrPagini / numarAutori;
        }
        if(tipCarte.equalsIgnoreCase("coordTaraAcreditatCNCS")) {
            puncteNrPagini = nrPagini * 0.15;
            return  puncteNrPagini / numarAutori;
        }

        return  0;
    }
}
