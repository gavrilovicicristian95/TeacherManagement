package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class UniversityInvitationsScores {
    public double getArticleScore( String tipInv) {


        if (tipInv.equalsIgnoreCase("profesorInvitatInStrainatate")) {

            return 25;
        }
        if (tipInv.equalsIgnoreCase("profesorInvitatInTara")) {

            return 10;
        }
        return 0;
    }
}
