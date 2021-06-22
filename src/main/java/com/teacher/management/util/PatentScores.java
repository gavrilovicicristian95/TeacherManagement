package com.teacher.management.util;
import org.springframework.stereotype.Component;

@Component
public class PatentScores {
    public double getArticleScore(int nrAutori, String tipBrevet){
        int maximum = Math.max(nrAutori  - 2, 1);
        double puncte=0;
        if(tipBrevet.equalsIgnoreCase("breveteInternationale")) {
            puncte=100;
            return puncte/maximum;
        }
        if(tipBrevet.equalsIgnoreCase("breveteNationale")) {
            puncte=50;
            return  puncte/maximum;
        }
        if(tipBrevet.equalsIgnoreCase("produseStrainatate")) {
            puncte=80;
            return  puncte/maximum;
        }
        if(tipBrevet.equalsIgnoreCase("produseInTara")) {
            puncte=40;
            return  puncte/maximum;
        }


        return  0;
    }
}
