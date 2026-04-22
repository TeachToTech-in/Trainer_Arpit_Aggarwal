package in.teachtotech.bookapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.teachtotech.bookapp.entity.Book;
import in.teachtotech.bookapp.service.BookService;

@Controller
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getAllBooks(Model model) {
        model.addAttribute("books", service.retrieveAllBooks());
        return "index";
    }

    @PostMapping("/addBook")
    public String addBook(Model model, Book book) {
        String msg = service.saveBook(book);
        model.addAttribute("msg", msg);
        model.addAttribute("books", service.retrieveAllBooks());
        return "index";
    }
}