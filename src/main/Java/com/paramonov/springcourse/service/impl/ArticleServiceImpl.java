package com.paramonov.springcourse.service.impl;

import com.paramonov.springcourse.model.Article;
import com.paramonov.springcourse.repository.ArticleRepository;
import com.paramonov.springcourse.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void postArticle(Article article) {
       articleRepository.save(article);
    }

    @Override
    public Article findArticle (int id) {
        Optional<Article> foundArticle = articleRepository.findById(id);
        return foundArticle.orElse(null);
    }

    @Override
    public void updateArticle(int id, Article updatedArticle) {
        updatedArticle.setId(id);
        articleRepository.save(updatedArticle);
    }

    @Override
    public List<Article> findPublicArticles() {
        return articleRepository.findAll();
    }

    @Override
    public List<Article> findUserArticles() {
        return null;
    }

    @Override
    public void delete(int id) {
        articleRepository.deleteById(id);
    }
}
