package com.teacher.management.service;

import com.teacher.management.models.Article;

import java.util.List;

public interface ArticleService {

    public Article findByIdArticol(int idArticol);
    public Article save(Article article);
    public List<Article> findAll();
    public List<Article> getArticlesByTipArticol(String tipArticol);
}
