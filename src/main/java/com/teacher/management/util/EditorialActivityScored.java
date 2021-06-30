package com.teacher.management.util;

import org.springframework.stereotype.Component;

@Component
public class EditorialActivityScored {
    public double getArticleScore( String tipActivitate){


        if(tipActivitate.equalsIgnoreCase("editorArticoleWebOfScience")) {

            return 20;
        }
        if(tipActivitate.equalsIgnoreCase("membruEchipaArticoleWebOfScience")) {

            return 15;
        }
        if(tipActivitate.equalsIgnoreCase("editorRevisteIndexateBDI")) {

            return 15;
        }
        if(tipActivitate.equalsIgnoreCase("membruRevisteIndexateBDI")) {

            return 10;
        }
        return 0;
    }

}
