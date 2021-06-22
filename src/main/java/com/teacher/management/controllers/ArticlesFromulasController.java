package com.teacher.management.controllers;

import com.teacher.management.models.ArticlesFormulas;
import com.teacher.management.models.ResponsabilityType;
import com.teacher.management.service.ArticlesFormulasService;
import com.teacher.management.service.ResponsabilityTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/articlesFormulas")
@RequiredArgsConstructor
public class ArticlesFromulasController {
    private final ArticlesFormulasService articlesFormulasService;

    @PostMapping("/editArticlesFormula")
    public ResponseEntity<ArticlesFormulas> saveArticleFormula(@RequestBody ArticlesFormulas articlesFormulas) {
        articlesFormulasService.save(articlesFormulas);
        return new ResponseEntity<>(articlesFormulas, HttpStatus.OK);

    }
    @GetMapping("/getAllArticlesFormulas")
    public List<ArticlesFormulas> getAllArticlesFormulas(){
        return articlesFormulasService.findAll();
    }
}
