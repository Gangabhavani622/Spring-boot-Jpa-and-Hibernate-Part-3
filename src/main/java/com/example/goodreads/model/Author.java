package com.example.goodreads.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.*;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @Column(name = "authorid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    @Column(name = "authorname")
    private String authorName;
    @ManyToMany(mappedBy = "authors")
    @JsonIgnoreProperties("authors")
    private List<Book> books = new ArrayList<>();

    public Author() {

    }

    public Author(int authorid, String authorName, List<Book> books) {
        this.authorId = authorid;
        this.authorName = authorName;
        this.books = books;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorIdId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return this.books;
    }

}