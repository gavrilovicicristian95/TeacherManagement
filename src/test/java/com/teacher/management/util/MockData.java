package com.teacher.management.util;

import com.teacher.management.controllers.ArticlesController;
import com.teacher.management.models.AcademyMember;
import com.teacher.management.models.Article;
import org.springframework.stereotype.Component;

@Component
public class MockData {

    private final int userId = 1;
    private final String tipMembru = "MembruTest1";

    private final int id = 101;
    public AcademyMember createAcademyMember() {
        AcademyMember academyMember = new AcademyMember();
        academyMember.setIdAcademyMember(id);
        academyMember.setIdUser(userId);
        academyMember.setNumeAcademie("Universitatea Alexandru Cuza Iasi");
        academyMember.setPunctaj(20);
        academyMember.setTipMembru(tipMembru);
        academyMember.setNumePrenume("Popescu Alexandru");

        return academyMember;
    }

    public Article createArticle() {
        Article article = new Article();

        article.setIdArticol(id);
        article.setPunctaj(40);
        article.setIdUser(userId);
        article.setAutori("Autor1, Autor2, Autor3");
        article.setCategorie("Machine Learning");
        article.setAnulPublicarii("1995");
        article.setSjr(25);
        article.setNrAutori(3);

        return article;
    }
}
