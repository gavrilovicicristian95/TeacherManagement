package com.teacher.management.controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teacher.management.models.Article;
import com.teacher.management.repository.ArticleRepository;
import com.teacher.management.util.MockData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ArticlesController.class)
public class ArticleControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockData mockData;

    @Autowired
    private ArticleRepository articleRepository;

    private final int idArticol= 101;

    @Test
    void shouldCreateArticle() throws Exception {
        Article article = mockData.createArticle();

        this.mockMvc.perform(post("/api/articles/addArticle").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(article)))
                .andExpect(status().isCreated())
                .andDo(print());
    }

    @Test
    void shouldReturnArticle() throws Exception {
        int idArticol= 101;
        Article article = mockData.createArticle();

        this.mockMvc.perform(get("/api/articles/getArticle/{idArticol}")).andExpect(status().isOk())
                .andExpect(jsonPath("$.idArticol").value(idArticol))
                .andExpect(jsonPath("$.punctaj").value(article.getPunctaj()))
                .andExpect(jsonPath("$.autori").value(article.getAutori()))
                .andExpect(jsonPath("$.nrAutori").value(article.getNrAutori()))
                .andExpect(jsonPath("$.categorie").value(article.getCategorie()))
                .andExpect(jsonPath("$.anulPublicarii").value(article.getAnulPublicarii()))
                .andExpect(jsonPath("$.sjr").value(article.getSjr()))
                .andDo(print());
    }

    @Test
    void shouldReturnNotFoundArticle() throws Exception {
        when(articleRepository.findByIdArticol(idArticol)).thenReturn(null);
        mockMvc.perform(get("/api/articles/getArticle/{idArticol}", idArticol))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    void shouldReturnListOfArticles() throws Exception {
        List<Article> articleList = new ArrayList<>();
        Article article = mockData.createArticle();

        articleList.add(article);
        article.setIdArticol(102);
        articleList.add(article);
        article.setIdArticol(103);
        articleList.add(article);

        when(articleRepository.findAll()).thenReturn(articleList);

        mockMvc.perform(get("/api/articles/getAllArticles"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(articleList.size()))
                .andDo(print());
    }

    @Test
    void shouldDeleteArticle() throws Exception {
        long id = 101l;
        doNothing().when(articleRepository).deleteById(id);

        mockMvc.perform(delete("/api/articles/deleteArticle/{idArticol}", id))
                .andExpect(status().isNoContent())
                .andDo(print());
    }
}
