package com.paramonov.springcourse.service;

import com.paramonov.springcourse.model.Article;
import com.paramonov.springcourse.model.Tag;

import java.util.List;

public interface TagService {

    String getCountOfArticlesWithSuchTag(Tag tag);
}
