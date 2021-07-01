package com.paramonov.springcourse.model;

import javax.persistence.*;
import java.time.LocalDate;

//TODO Use lombock

@Entity
@Table(name="comments")
public class Comment {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String message;
//    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    @JoinColumn(name = "article_id", nullable = false, referencedColumnName = "id")
//    private Article article;
//    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
//    private User user;
    @Column (name = "created_at")
    private LocalDate createdAt;

    public Comment(int id, String message, LocalDate createdAt) {
        this.id = id;
        this.message = message;
        this.createdAt = createdAt;
    }

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}