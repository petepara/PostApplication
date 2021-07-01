package com.paramonov.springcourse.service;

import com.paramonov.springcourse.model.Article;

import java.util.List;

public interface ArticleService {
    void postArticle(Article article);
    Article findArticle(int id);
    void updateArticle(int id, Article updatedArticle);
    List<Article> findPublicArticles();
    List<Article> findUserArticles();
    void delete(int id);
    //TODO add filter method
}
