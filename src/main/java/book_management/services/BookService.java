package book_management.services;

import book_management.models.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findById(Long id);

    Book save(Book book);

    void deleteById(Long id);
}
