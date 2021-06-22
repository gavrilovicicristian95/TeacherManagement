package com.teacher.management.repository;

import com.teacher.management.models.ArticlesFormulas;
import com.teacher.management.models.ResponsabilityType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticlesFormulaRepository extends JpaRepository<ArticlesFormulas,Long> {
    public ArticlesFormulas save(ArticlesFormulas articlesFormulas);
    public List<ArticlesFormulas> findAll();
}
