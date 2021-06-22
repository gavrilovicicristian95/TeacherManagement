package com.teacher.management.service.impl;

import com.teacher.management.models.ArticlesFormulas;
import com.teacher.management.repository.ArticlesFormulaRepository;
import com.teacher.management.service.ArticlesFormulasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticlesFormulasServiceImpl implements ArticlesFormulasService {
    private final ArticlesFormulaRepository articlesFormulaRepository;
    @Override
    public ArticlesFormulas save(ArticlesFormulas articlesFormulas) {
        return articlesFormulaRepository.save(articlesFormulas);
    }

    @Override
    public List<ArticlesFormulas> findAll() {
        return articlesFormulaRepository.findAll();
    }
}
