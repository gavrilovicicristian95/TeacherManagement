package com.teacher.management.controllers;

import com.teacher.management.models.Article;
import com.teacher.management.service.ArticleService;
import com.teacher.management.util.ArticleScores;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/articles")
@RequiredArgsConstructor
public class ArticlesController {

    private final ArticleService articleService;
    private final ArticleScores articleScores;

    @PostMapping("/addArticle")
    public ResponseEntity<Article> saveArticle(@RequestBody Article article){
        article.setPunctaj(articleScores.getArticleScore(article.getFactoriImpact(), article.getNrAutori(), article.getTipArticol(), article.getSjr()));
        articleService.save(article);

        return new ResponseEntity<>(article, HttpStatus.OK);
    }

    @GetMapping("/getArticle/{idArticol}")
    public Article findByIdArticol(@PathVariable int idArticol){
        return articleService.findByIdArticol(idArticol);
    }

    @GetMapping("/getAllArticles")
    public List<Article> getAllArticles(){
        return articleService.findAll();
    }

    @GetMapping("/getArticles/{tipArticol}")
    public List<Article> getArticlesByTipArticol(@PathVariable String tipArticol){
        return articleService.getArticlesByTipArticol(tipArticol);
    }

}