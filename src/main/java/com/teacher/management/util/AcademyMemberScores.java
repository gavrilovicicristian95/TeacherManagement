package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class AcademyMemberScores {
    public double getArticleScore( String tipMembru) {


        if (tipMembru.equalsIgnoreCase("membruAcademiaRomana")) {

            return 20;
        }
        if (tipMembru.equalsIgnoreCase("membruAcademiiNationale")) {

            return 15;
        }
        return 0;
    }
}
