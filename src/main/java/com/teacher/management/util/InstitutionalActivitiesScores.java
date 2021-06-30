package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class InstitutionalActivitiesScores {
    public double getArticleScore( String tipCoord) {


        if (tipCoord.equalsIgnoreCase("contributiiOrganizareActivitati")) {

            return 20;
        }
        if (tipCoord.equalsIgnoreCase("activitatiPromovareUAICStrainatate")) {

            return 10;
        }
        if (tipCoord.equalsIgnoreCase("activitatiPromovareUAICInTara")) {

            return 5;
        }
        if (tipCoord.equalsIgnoreCase("responsabilEvaluari")) {

            return 50;
        }
        if (tipCoord.equalsIgnoreCase("organizariManiferstariInternationaleCoord")) {

            return 20;
        }
        if (tipCoord.equalsIgnoreCase("organizariManiferstariInternationaleMembru")) {

            return 10;
        }
        if (tipCoord.equalsIgnoreCase("organizariManiferstariNationaleCoord")) {

            return 15;
        }
        if (tipCoord.equalsIgnoreCase("organizariManiferstariNationaleMembru")) {

            return 5;
        }
        return 0;
    }
}
