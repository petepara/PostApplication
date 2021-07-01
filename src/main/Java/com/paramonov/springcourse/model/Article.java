package com.paramonov.springcourse.model;

import javax.persistence.*;
import java.time.LocalDate;

//TODO Use lombock

@Entity
@Table(name="articles")
public class Article {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String text;
    @Enumerated(EnumType.STRING)
    private Status status;
//    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private int authorId;
    @Column (name = "created_at")
    private LocalDate createdAt;
    @Column (name = "updated_at")
    private LocalDate updatedAt;
//    @ManyToMany(mappedBy = "articles")
//    private Tag tags;

    public Article(int id, String title, String text, Status status, int authorId) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.status = status;
        this.authorId = authorId;
        this.createdAt = LocalDate.now();
        this.updatedAt = createdAt;
    }

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", authorId=" + authorId +
                ", createdAt=" + createdAt +
                '}';
    }
}