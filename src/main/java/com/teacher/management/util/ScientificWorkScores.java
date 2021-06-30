package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class ScientificWorkScores {
    public double getArticleScore( String tipLucrare,double factorImpact, int numarAutori){
        int maximum = Math.max(numarAutori  - 2, 1);

        if(tipLucrare.equalsIgnoreCase("lucrariRevisteWebOfScience")) {

            return ((20* factorImpact) + 5) / maximum;
        }
        if(tipLucrare.equalsIgnoreCase("lucrariVolumeStrainatate")) {

            return (double)40 / maximum;
        }
      return 0;
    }
}
