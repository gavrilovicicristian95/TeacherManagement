package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class ThesisCoordinationScores {
    public double getArticleScore( String tipCoord) {


        if (tipCoord.equalsIgnoreCase("conducereDoctorat")) {

            return 20;
        }
        if (tipCoord.equalsIgnoreCase("coordonareLicenta")) {

            return 2;
        }
        if (tipCoord.equalsIgnoreCase("coordonareDisertatie")) {

            return 3;
        }
        return 0;
    }
}
