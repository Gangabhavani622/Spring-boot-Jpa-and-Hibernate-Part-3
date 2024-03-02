package com.example.goodreads.repository;

import com.example.goodreads.model.Author;
import com.example.goodreads.model.Book;

import java.util.ArrayList;
import java.util.List;

public interface AuthorRepository {
    ArrayList<Author> getAuthors();

    Author getAuthorById(int authorId);

    Author addAuthor(Author author);

    Author updateAuthor(int authorId, Author author);

    void deleteAuthor(int authorId);

    List<Book> getAuthorBooks(int authorId);
}
