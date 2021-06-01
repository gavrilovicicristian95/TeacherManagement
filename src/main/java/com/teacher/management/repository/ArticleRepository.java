package com.teacher.management.repository;

import com.teacher.management.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    public Article findByIdArticol(int idArticol);
    public Article save(Article article);
    public List<Article> findAll();
    public List<Article> getArticlesByTipArticol(String tipArticol);
}
