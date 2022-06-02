package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.BookDTO;
import com.bridgelabz.bookstore.entity.Book;

import java.util.List;

public interface IBookService {
    Book addBook(BookDTO bookDTO);

    Book getById(int id);

    List<Book> getBookList();

    String deleteById(int id);

    Book updateById(int id, BookDTO bookDTO);

    List<Book> findBookByName(String bName);

    List<Book> sortByName();

    List<Book> sortByPrice();

    Book updateQuantityById(int id, int quantity);

    List<Book> sortBookList(String field);

}
