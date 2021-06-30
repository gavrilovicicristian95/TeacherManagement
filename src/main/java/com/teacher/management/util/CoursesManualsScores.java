package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class CoursesManualsScores {
    public double getArticleScore( String tipMembru,int nrPagini) {


        if (tipMembru.equalsIgnoreCase("publicateEdituriAcreditate")) {

            return  nrPagini * 0.4;
        }
        if (tipMembru.equalsIgnoreCase("publicateAlteEdituri")) {

            return nrPagini * 0.2;
        }
        if (tipMembru.equalsIgnoreCase("editiiRevizuite")) {

            return (double)nrPagini/2 * 0.4;
        }
        return 0.0;
    }
}
