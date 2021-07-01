package com.paramonov.springcourse.controllers;

import com.paramonov.springcourse.model.Article;
import com.paramonov.springcourse.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/new")
    public String newArticle(@ModelAttribute("article") Article article) {
        return "articles/newArticle";
    }
    @PostMapping()
    public String create( @ModelAttribute("article") Article article) {
        articleService.postArticle(article);
        return "redirect:/articles";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("article", articleService.findArticle(id));
        return "articles/showArticle";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("article", articleService.findArticle(id));
        return "articles/edit";
    }

    @PutMapping("/{id}")
    public String update(@ModelAttribute("article") Article article,
                         @PathVariable("id") int id) {
        articleService.updateArticle(id, article);
        return "redirect:/articles";
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("articles", articleService.findPublicArticles());
        return "articles/articles";
    }

}
