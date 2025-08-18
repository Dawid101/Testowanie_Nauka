package pl.coderslab.week1.week1.asercje;

import pl.coderslab.week1.exceptions.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book searchByTitle(String title) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("Title cant be blank or null");
        } else {
            return books.stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                    .findFirst().orElseThrow(() -> new BookNotFoundException("Book not found"));
        }

    }

    public void borrowBook(String title, String author){
        books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title) &&
                        book.getAuthor().equalsIgnoreCase(author) &&
                        book.isAvailable())
                .findFirst().orElseThrow(() -> new BookNotFoundException("Book not found or is not available"))
                .setAvailable(false);
    }

    public void returnBook(Book book){
        books.stream()
                .filter(bookInLibrary -> bookInLibrary.getTitle().equalsIgnoreCase(book.getTitle())&&
                        bookInLibrary.getAuthor().equalsIgnoreCase(book.getAuthor())&&
                        !bookInLibrary.isAvailable())
                .findFirst().orElseThrow(() -> new BookNotFoundException("Book cant be returned"))
                .setAvailable(true);
    }
}
