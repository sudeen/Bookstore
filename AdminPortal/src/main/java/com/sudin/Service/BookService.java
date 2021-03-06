package com.sudin.Service;

import com.sudin.Domain.Book;

import java.util.List;

/**
 * Created by s-k-ii-p-s on 8/28/17.
 */
public interface BookService {

    Book save(Book book);

    List<Book> findAll();

    Book findOne(Long id);

    void removeOne(Long id);

}
