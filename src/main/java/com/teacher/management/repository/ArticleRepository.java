package com.teacher.management.repository;

import com.teacher.management.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    public Article findByIdArticol(long idArticol);
    public Article save(Article article);
    public List<Article> findAll();
    public List<Article> getArticlesByTipArticol(String tipArticol);
    public List<Article> getArticleByTipArticolAndIdUser(String tipArticol, Integer userId);
    public void deleteArticleByIdArticol(long IdArticol);

}
