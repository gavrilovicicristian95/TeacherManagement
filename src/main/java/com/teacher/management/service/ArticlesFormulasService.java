package com.teacher.management.service;

import com.teacher.management.models.ArticlesFormulas;

import java.util.List;

public interface ArticlesFormulasService {
    public ArticlesFormulas save(ArticlesFormulas articlesFormulas);
    public List<ArticlesFormulas> findAll();
}
