package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class CitationScores {
    public double getArticleScore(double factorImpact, int numarAutori, String tipCitatie){
        int maximum = Math.max(numarAutori  - 2, 1);
        if(tipCitatie.equalsIgnoreCase("revisteWebofScience"))
            return ((20 * factorImpact) + 10) / maximum;
        if(tipCitatie.equalsIgnoreCase("revisteIndexateScopus"))
            return ((10 * factorImpact) + 5)/maximum;
        if(tipCitatie.equalsIgnoreCase("citariCartiStrainatate"))
            return 5.0/maximum;
        if(tipCitatie.equalsIgnoreCase("citariCartiInTara"))
            return 1.0/maximum;
        if(tipCitatie.equalsIgnoreCase("volumeConferinte"))
            return 0;

        return 0;
    }
}
