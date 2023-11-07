package comp31.cruddemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import comp31.cruddemo.model.entities.Author;
import comp31.cruddemo.model.entities.Book;
import comp31.cruddemo.model.repositories.AuthorRepo;
import comp31.cruddemo.model.repositories.BookRepo;

@Service
public class BookService {

    BookRepo bookRepo;
    AuthorRepo authorRepo;

    public BookService(BookRepo bookRepo, AuthorRepo authorRepo) {
        super();
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    public Iterable<Author> findAuthors() {
        return authorRepo.findAll();
    }

    public Iterable<Book> findBooks() {
        return bookRepo.findAll();
    }

    public Iterable<Book> findBooksByAuthor(String firstName, String lastName) {
        List<Book> bookList = new ArrayList<>();
        List<Author> authorList = authorRepo.findByFirstNameIgnoreCaseAndLastNameIgnoreCase(firstName, lastName);
        // List<Author> authorList = authorRepo.findByLastNameIgnoreCase(lastName);
        if (!authorList.isEmpty()) {
            Author author = authorList.get(0);
            bookList = author.getBooks();
        }
        return bookList;
    }

}
