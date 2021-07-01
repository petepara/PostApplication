package com.paramonov.springcourse.model;

import javax.persistence.*;
//import java.util.List;

//TODO Use lombock

@Entity
@Table(name="tags")
public class Tag {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
//    @ManyToMany
//    @JoinTable(name = "article_tag",
//            joinColumns = @JoinColumn(name="tag_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "article_id", referencedColumnName = "id"))
//    private List<Article> articles;

    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tag() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}