package book_management.controllers;

import book_management.models.Book;
import book_management.services.BookService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * Display books page with list + empty form
     */
    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        model.addAttribute("book", new Book());
        return "books";
    }

    /**
     * Save or update a book
     */
    @PostMapping("/save")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.save(book);
        return "redirect:/books";
    }

    /**
     * Load book for editing
     */
    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable Long id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    /**
     * Delete a book
     */
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteById(id);
        return "redirect:/books";
    }
}
