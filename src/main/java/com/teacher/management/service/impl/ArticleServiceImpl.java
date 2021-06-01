package com.teacher.management.service.impl;

import com.teacher.management.models.Article;
import com.teacher.management.repository.ArticleRepository;
import com.teacher.management.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    @Override
    public Article findByIdArticol(int idArticol) {
        return articleRepository.findByIdArticol(idArticol);
    }

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public List<Article> getArticlesByTipArticol(String tipArticol) {
        return articleRepository.getArticlesByTipArticol(tipArticol);
    }
}
