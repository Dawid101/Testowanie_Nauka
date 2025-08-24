package pl.coderslab.week1.week1.asercje;

import org.junit.jupiter.api.Test;
import pl.coderslab.week1.exceptions.BookNotFoundException;
import pl.coderslab.week1.week1.asercje.Book;
import pl.coderslab.week1.week1.asercje.Library;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void givenTitle_whenSearchByTitle_thenGetBook() {
        //given
        Library library = new Library();
        Book book = new Book("Test", "Testowy", "2021");
        library.getBooks().add(book);
        String title = "Test";

        //when
        Book result = library.searchByTitle(title);

        //then
        assertEquals("Test", result.getTitle());
    }

    @Test
    void givenNonExistingTitle_whenSearchByTitle_ThenThrowBookNotFoundException() {
        //given
        Library library = new Library();
        Book book = new Book("Test", "Testowy", "2021");
        library.getBooks().add(book);
        String title = "NonExisting";

        //when&then
        assertThrows(BookNotFoundException.class, () -> library.searchByTitle(title));
    }

    @Test
    void givenEmptyString_whenSearchByTitle_ThenThrowIllegalArgumentException() {
        //given
        Library library = new Library();
        Book book = new Book("Test", "Testowy", "2021");
        library.getBooks().add(book);
        String title = "";

        //when&then
        assertThrows(IllegalArgumentException.class, () -> library.searchByTitle(title));
    }

    @Test
    void givenTitleToEmptyList_whenSearchByTitle_ThenThrowBookNotFoundException() {
        //given
        Library library = new Library();
        String title = "Test";

        //when&then
        assertThrows(BookNotFoundException.class, () -> library.searchByTitle(title));
    }

    @Test
    void givenAvailableBook_whenBorrowBook_ThenCheckIsAvailable() {
        //given
        Library library = new Library();
        Book book = new Book("Test", "Testowy", "2021", true);
        library.getBooks().add(book);
        String title = "Test";

        //when
        library.borrowBook("Test", "Testowy");

        //then
        assertFalse(book.isAvailable());
    }

    @Test
    void givenNotAvailableBook_whenBorrowBook_ThenThrowBookNotFoundExceptions() {
        //given
        Library library = new Library();
        Book book = new Book("Test", "Testowy", "2021", false);
        library.getBooks().add(book);
        String title = "Test";
        String author = "Testowy";

        //when&then
        assertThrows(BookNotFoundException.class, () -> library.borrowBook(title, author));

    }

    @Test
    void givenBookThatIsNotInLibrary_whenBorrowBook_ThenThrowBookNotFoundExceptions() {
        //given
        Library library = new Library();
        Book book = new Book("Test", "Testowy", "2021",true);
        library.getBooks().add(book);
        String title = "Test1";
        String author = "Testowy";

        //when&then
        assertThrows(BookNotFoundException.class, () -> library.borrowBook(title, author));
    }

    @Test
    void givenBook_whenReturnBook_ThenCheckIsAvailable() {
        //given
        Library library = new Library();
        Book book = new Book("Test", "Testowy", "1992",false);
        library.getBooks().add(book);

        //when
        library.returnBook(book);

        //then
        assertTrue(book.isAvailable());
    }
}
