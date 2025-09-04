package pl.coderslab.week3.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository mockRepository;

    @Test
    void testFindBookByTitle() {
        when(mockRepository.findByTitle("Test")).thenReturn(new Book("Test"));
        BookService bookService = new BookService(mockRepository);
        Book book = bookService.findBookByTitle("Test");
        verify(mockRepository).findByTitle("Test");
        assertEquals("Test", book.getTitle());
    }

}