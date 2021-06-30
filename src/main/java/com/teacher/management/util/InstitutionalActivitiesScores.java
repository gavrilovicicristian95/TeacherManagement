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
        if (tipCoord.equalsIgnoreCase("coordonatorOrganizareManifestariInternationale")) {

            return 20;
        }
        if (tipCoord.equalsIgnoreCase("membruOrganizareManifestariInternationale")) {

            return 10;
        }
        if (tipCoord.equalsIgnoreCase("coordonatorOrganizareManifestariNationale")) {

            return 15;
        }
        if (tipCoord.equalsIgnoreCase("membruOrganizareManifestariNational")) {

            return 5;
        }
        return 0;
    }
}
