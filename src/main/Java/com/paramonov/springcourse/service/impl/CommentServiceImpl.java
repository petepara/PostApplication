package com.paramonov.springcourse.service.impl;

import com.paramonov.springcourse.model.Comment;
import com.paramonov.springcourse.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public Comment addComment(int id) {
        return null;
    }

    @Override
    public List<Comment> getCommentsOfArticle(int id) {
        return null;
    }

    @Override
    public Comment getComment(int id) {
        return null;
    }

    @Override
    public void deleteComment(int id) {

    }
}
