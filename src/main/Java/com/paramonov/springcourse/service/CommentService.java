package com.paramonov.springcourse.service;

import com.paramonov.springcourse.model.Comment;

import java.util.List;

public interface CommentService {
    Comment addComment(int id);
    List<Comment> getCommentsOfArticle(int id);
    Comment getComment(int id);
    void deleteComment(int id);
    //TODO add filter method
}
