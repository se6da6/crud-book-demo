package comp31.cruddemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import comp31.cruddemo.model.Book;
import comp31.cruddemo.repositories.AuthorRepo;
import comp31.cruddemo.repositories.BookRepo;

@Controller
public class BookController {

    BookRepo bookRepo;
    AuthorRepo authorRepo;
    
    @Autowired
    public BookController(BookRepo bookRepo, AuthorRepo authorRepo) {
        super();
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    Logger logger = LoggerFactory.getLogger(BookController.class);
    
    @GetMapping("/books")
    public String getBooks(Model model)
    {
        logger.info(">>>>>>>>>>>>>   Get Authors");

        Iterable<Book> books = bookRepo.findAll();

        for (Book book : books)
        {
            logger.info(book.getTitle());
        }
        model.addAttribute("books", books);

        return "books";
    }

    @GetMapping("/authors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors" , authorRepo.findAll());
        return "authors";
    }

}
