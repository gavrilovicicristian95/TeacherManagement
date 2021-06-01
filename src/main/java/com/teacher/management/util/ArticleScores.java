package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class ArticleScores {

    public double getArticleScore(double factorImpact, int numarAutori, String tipArticol, double sjr){
        int maximum = Math.max(numarAutori  - 2, 1);
        if(tipArticol.equalsIgnoreCase("webScience"))
            return ((60 * factorImpact) + 25) / maximum;
        if(tipArticol.equalsIgnoreCase("indexateScopus"))
            return ((40 * sjr) + 25)/maximum;
        if(tipArticol.equalsIgnoreCase("indexateBDI"))
            return 5/maximum;
        if(tipArticol.equalsIgnoreCase("neindexate"))
            return 1/maximum;
        if(tipArticol.equalsIgnoreCase("publicateExtenso"))
            return 160/maximum;

        return 0;
    }
}
