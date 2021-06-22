package com.teacher.management.util;
import org.springframework.stereotype.Component;

@Component
public class ContractScores {
    public double getArticleScore(double valoareLeiContract, String tipContract,int nrMembrilor){

        if(tipContract.equalsIgnoreCase("finantareInternationalaDirector")) {
            return valoareLeiContract/1000;
        }
        if(tipContract.equalsIgnoreCase("finantareInternationalaMembru")) {
            if(nrMembrilor ==  0)
                return 0;
            return  valoareLeiContract/1000/nrMembrilor;
        }
        if(tipContract.equalsIgnoreCase("finantareNationalaDirector")) {
            return  valoareLeiContract/2000;
        }
        if(tipContract.equalsIgnoreCase("finantareNationalaMembru")) {
            if(nrMembrilor ==  0)
                return 0;
            return  valoareLeiContract/2000/nrMembrilor;
        }

        return  0;
    }
}
