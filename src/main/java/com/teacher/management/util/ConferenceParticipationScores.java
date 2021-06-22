package com.teacher.management.util;
import org.springframework.stereotype.Component;

@Component
public class ConferenceParticipationScores {
    public double getArticleScore(String tipParticipare){
        double puncte=0;
        if(tipParticipare.equalsIgnoreCase("invitedSpeaker")) {
            puncte=160;
            return puncte;
        }
        if(tipParticipare.equalsIgnoreCase("scoliVaraInternationale")) {
            puncte=40;
            return  puncte;
        }
        if(tipParticipare.equalsIgnoreCase("scoliVaraNationale")) {
            puncte=20;
            return  puncte;
        }



        return  0;
    }
}
